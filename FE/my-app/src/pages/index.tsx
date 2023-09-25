import { Inter } from 'next/font/google';
import useFetchData from '../hooks/useFetchData';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faCircle, faCircleInfo, faEraser, faExternalLinkAlt } from '@fortawesome/free-solid-svg-icons';
import Link from 'next/link';
const inter = Inter({ subsets: ['latin'] })
const API_URL = 'https://my.api.mockaroo.com/shipments.json?key=5e0b62d0';

export default function Home() {
  const { data, loading, error } = useFetchData(API_URL);
  if (loading) return <div>Loading...</div>
  if (error) return <div>Error: {error}</div>
  const handleDelete =(index) =>{
    console.log(`delete ${index}`)
  }

  return (
    <main>
      <div className="mt-2 flex flex-col">
        <div className="-my-2 overflow-x-auto -mx-4 sm:-mx-6 lg:-mx-8">
          <div className="py-2 align-middle inline-block min-w-full sm:px-6 lg:px-8">
            <div className="shadow overflow-hidden border-b border-gray-200 sm:rounded-lg">
              <table className="min-w-full divide-y divide-gray-200 content-center md:table-fixed ">
                <thead className="bg-gray-50">
                  <tr>
                    <th scope="col"
                      className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider ">ORDERNO</th>
                    <th scope="col"
                      className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider ">DELIVERYDATE</th>
                    <th scope="col"
                      className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider ">CUSTOMER</th>
                    <th scope="col"
                      className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider ">TRACKINGNO</th>
                    <th scope="col"
                      className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider ">STATUS</th>
                    <th scope="col"
                      className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider ">CONSIGNEE</th>
                    <th scope="col"
                      className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider "> </th>
                  </tr>
                </thead>
                <tbody>
                  {data && data.map((item, index) => (
                    <tr className="px-6 py-4 whitespace-nowrap" key={index}>
                      <td className="px-6 py-4 whitespace-nowrap">{item.orderNo}</td>
                      <td className="px-6 py-4 whitespace-nowrap">{item.date}</td>
                      <td className="px-6 py-4 whitespace-nowrap">{item.customer}</td>
                      <td className="px-6 py-4 whitespace-nowrap">{item.trackingNo}</td>
                      <td className="px-6 py-4 whitespace-nowrap">{item.status}</td>
                      <td className="px-6 py-4 whitespace-nowrap">{item.consignee}</td>
                      <td>
                        <Link href={`/details/${index}?orderNo=${item.orderNo}&date=${item.date}&customer=${item.customer}&trackingNo=${item.trackingNo}&status=${item.status}&consignee=${item.consignee}`}><FontAwesomeIcon icon={faCircleInfo} className="cursor-pointer mr-2.5" /></Link>
                        <button className="cursor-pointer mr-2.5" onClick={() => handleDelete(index)}> <FontAwesomeIcon icon={faEraser} /></button>
                      </td>
                    </tr>)
                  )}
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </main>
  )
}



