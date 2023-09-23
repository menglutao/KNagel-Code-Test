import { Inter } from 'next/font/google';
import useFetchData from '../hooks/useFetchData';

const inter = Inter({ subsets: ['latin'] })
const API_URL = 'https://my.api.mockaroo.com/shipments.json?key=5e0b62d0';

export default function Home() {
  const { data, loading, error } =  useFetchData(API_URL);
  if(loading) return <div>Loading...</div>
  if(error) return <div>Error: {error}</div>

  if(data)
  return (
    <main>
      <table>
        <thead>
          <tr>
            <th>ORDERNO</th>
            <th>DELIVERYDATE</th>
            <th>CUSTOMER</th>
            <th>TRACKINGNO</th>
            <th>STATUS</th>
            <th>CONSIGNEE</th>
          </tr>
        </thead>
        <tbody>
          {data.map((item,index)=>(
            <tr key={index}>
              <td>{item.orderNo}</td>
              <td>{item.date}</td>
              <td>{item.customer}</td>
              <td>{item.trackingNo}</td>
              <td>{item.status}</td>
              <td>{item.consignee}</td>

            </tr>
          )
          )}
        </tbody>
      
  
      </table>
    </main>

  )
}

