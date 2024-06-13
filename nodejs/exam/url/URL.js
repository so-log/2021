// const url = require('url');
// console.log("url", url.URL);
const{URL} = require('url'); //url생성자
const url = new URL("http://www.yonggyo.com/?page=3&limit=10&category=nodejs&category=javascript");
// console.log("url", url);

const searchParams = url.searchParams;
console.log("page", searchParams.get("page"));
console.log("category", searchParams.getAll("category"));
searchParams.append("filter", "value1"); //추가
searchParams.append("filter", "value2");
searchParams.append("filter", "value3");
console.log("filter", searchParams.getAll("filter"));

searchParams.set("filter", "value4"); //교체

// console.log("delete", searchParams.delete("filter"));

console.log("url", searchParams.toString());