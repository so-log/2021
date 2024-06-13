const express = require('express');
const app = express();

// get 방식 
app.get("./", (req, res) => {
    res.status(200).send("<h1>Express에서 출력</h1>");
});
app.listen(3000, () => {
    console.log("3000번 포트에서 서버 대기중...");
});