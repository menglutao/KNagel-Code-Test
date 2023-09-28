import { useState, useEffect } from 'react';
import axios from 'axios';

function useFetchData(url){

    const [data, setData]   = useState(null); 
    const [loading,setLoading] = useState(true);
    const [error,setError] = useState(null);
    const localFilePath = '/Shipments.txt'

    //read from local file
    const fetchLocalData = async(path)=>{
      const response = await axios.get(path);

      return response.data;
    }
    
    useEffect(() => {
        async function fetchData() {
          try {
            // read from URL
            const response = await axios.get(url);
            setData(response.data);
            setLoading(false);
          } catch (err) {
            console.log(err.message)
            setLoading(false);
            try {
              // read from local file
              const localData = await fetchLocalData(localFilePath);
              setData(localData);
              setLoading(false)
            }catch(err){
            setError(err)
            setLoading(false);
            }
          }
        }
    
        fetchData();
      }, [url]); // useEffect will only re-execute when value changes in the array
    
      return { data, loading, error }; // return an object with three attributes
    }

export default useFetchData;