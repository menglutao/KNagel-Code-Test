import React from "react";
import { useRouter } from "next/router";
import styles from "./[index].module.css"; // 如果你使用 CSS Modules

export default function details() {
  const router = useRouter();
  const { index } = router.query;
  console.log("router.query;", router.query);
  const orderNo = router.query.orderNo;
  const date = router.query.date;
  const customer = router.query.customer;
  const trackingNo = router.query.trackingNo;
  const status = router.query.status;
  const consignee = router.query.consignee;

  return (
    <div className="mt-8 ml-8 flex flex-col" >
    <div  className="bg-slate-50">
      <h1 className="mb-3 text-left text-L font-semibold text-gray-500">  SHIPMENT DETAILS</h1>
      <br></br>
      <div>
        <table className="w-2/3 border-separate border-spacing-x-10 md:table-fixed">
          <thead>
            <tr className="border-spacing-x-0.5">
              <th scope="col" className=" px-2 py-3  text-left text-L font-medium text-gray-500">orderNo</th>
              <th scope="col" className=" px-2 py-3  text-left text-L font-medium text-gray-500">date</th>
            </tr>
          </thead>
          <tbody>
            <tr >
              <td className="border px-2 py-3 bg-gray-200 text-neutral-500 rounded">{orderNo}</td>
              <td className="border px-2 py-3 bg-gray-200 text-neutral-500 rounded">{date}</td>
            </tr>
          </tbody>

          <thead>
            <tr>
              <th scope="col" className=" px-2 py-3 text-left text-L font-medium text-gray-500">customer</th>
              <th scope="col" className=" px-2 py-3 text-left text-L font-medium text-gray-500" >trackingNo</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td className="border px-2 py-3 bg-gray-200 text-neutral-500 rounded">{customer}</td>
              <td className="border px-2 py-3 bg-gray-200 text-neutral-500 rounded">{trackingNo}</td>
            </tr>
          </tbody>
          <thead>
            <tr>
              <th scope="col" className=" px-2 py-3 text-left text-L font-medium text-gray-500">consignee</th>
              <th scope="col" className=" px-2 py-3 text-left text-L font-medium text-gray-500" >status</th>

            </tr>
          </thead>
          <tbody>
            <tr>
              <td className="border px-2 py-3 bg-gray-200 text-neutral-500 rounded">{consignee}</td>
              <td className="border px-2 py-3 bg-gray-200 text-neutral-500 rounded">{status}</td>

            </tr>
          </tbody>
        </table>

      </div>


    </div>
    </div>
  );
}
