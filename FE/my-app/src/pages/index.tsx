import { Inter } from 'next/font/google';
import useFetchData from '../hooks/useFetchData';

const inter = Inter({ subsets: ['latin'] })
const API_URL = 'https://my.api.mockaroo.com/shipments.json?key=5e0b62d0';

export default function Home() {
  const { data, loading, error } = useFetchData(API_URL);
  if (loading) return <div>Loading...</div>
  if (error) return <div>Error: {error}</div>

    return (
      <main>
        <div className="flex flex-col">
          <div className="overflow-x-auto sm:-mx-6 lg:-mx-8">
            <div className="inline-block min-w-full py-2 sm:px-6 lg:px-8">
              <div className="overflow-hidden">
                <table className="min-w-full text-left text-sm font-light">
                  <thead className="border-b font-medium dark:border-neutral-500">
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
                    {data && data.map((item, index) => (
                      <tr className="border-b dark:border-neutral-500" key={index}>
                        <td className="whitespace-nowrap px-6 py-4">{item.orderNo}</td>
                        <td className="whitespace-nowrap px-6 py-4">{item.date}</td>
                        <td className="whitespace-nowrap px-6 py-4">{item.customer}</td>
                        <td className="whitespace-nowrap px-6 py-4">{item.trackingNo}</td>
                        <td className="whitespace-nowrap px-6 py-4">{item.status}</td>
                        <td className="whitespace-nowrap px-6 py-4">{item.consignee}</td>
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



