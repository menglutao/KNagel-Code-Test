import { useState, useEffect } from 'react';
import axios from 'axios';




function useFetchData(url){

    const [data, setData]   = useState(null);
    const [loading,setLoading] = useState(true);
    const [error,setError] = useState(null);
    


    useEffect(() => {
        async function fetchData() {
          try {
            const response = await axios.get(url);
            setData(response.data);
            setLoading(false);
            console.log("response:",response.data)
            
          } catch (err) {
            setError(err.message); // change to err.message instead of an object to avoid react rendering error 
            setLoading(false);
          }
        }
    
        fetchData();
      }, [url]);
    
      return { data, loading, error };
    }

export default useFetchData;