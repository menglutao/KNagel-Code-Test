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
    <div>
    <br></br>
      <h1 className="text-left text-L font-semibold text-gray-500">  SHIPMENT DETAILS</h1>
      <br></br>
      <table className="border-collapse w-1/2">
        <thead>
          <tr>
            <th scope="col" className="border px-6 py-2  text-left text-L font-medium text-gray-500">orderNo</th>
            <th scope="col" className="border px-6 py-2  text-left text-L font-medium text-gray-500">date</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td className="border px-6 py-4 bg-gray-200">{orderNo}</td>
            <td className="border px-6 py-4 bg-gray-200">{date}</td>
          </tr>
        </tbody>

        <thead>
          <tr>
            <th scope="col" className="border px-6 py-2 text-left text-L font-medium text-gray-500">customer</th>
            <th scope="col" className="border px-6 py-2 text-left text-L font-medium text-gray-500" >trackingNo</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td className="border px-6 py-4 bg-gray-200">{customer}</td>
            <td className="border px-6 py-4 bg-gray-200">{trackingNo}</td>
          </tr>
        </tbody>
        <thead>
          <tr>
            <th scope="col" className="border px-6 py-2 text-left text-L font-medium text-gray-500" >status</th>
            <th scope="col" className="border px-6 py-2 text-left text-L font-medium text-gray-500">consignee</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td className="border px-6 py-4 bg-gray-200">{status}</td>
            <td className="border px-6 py-4 bg-gray-200">{consignee}</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}
