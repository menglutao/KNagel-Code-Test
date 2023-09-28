import { useState, useEffect } from 'react';

function useHandleDelete(initialData){
    const[data,setData] = useState(initialData);
    const [isDeleted, setIsDeleted] = useState(false);
    const handleDetele = (index) =>{
        try{
            // console.log('data,',initialData)
            const newData = [...initialData]; // make a shallow copy of the original data
            newData.splice(index,1); //delete 1 element from index position
            setData(newData);
            setIsDeleted(true);

        }catch(err){
            console.log(err.message);
        }
       
    }
    return [data,isDeleted,handleDetele];
    

}

export default useHandleDelete;