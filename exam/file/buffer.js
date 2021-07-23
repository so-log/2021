const buffer = Buffer.from("버퍼로 변환되는 문자열");
console.log(buffer);
console.log("toString", buffer.toString());
console.log("length", buffer.length + "bytes");

//버퍼를 나눠서 저장
const buffer2 = [];
buffer2.push(Buffer.from("첫번째 데이터"));
buffer2.push(Buffer.from("두번째 데이터"));
buffer2.push(Buffer.from("세번째 데이터"));
buffer2.push(Buffer.from("마지막 데이터"));
console.log("butter2", buffer2);

const buffer3 = Buffer.concat(buffer2);
console.log(buffer3);
console.log(buffer3.toString());

//.alloc - 빈 버퍼를 생성하는 메서드
console.log("alloc", Buffer.alloc(5));