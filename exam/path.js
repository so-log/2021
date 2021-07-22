//path 내장 모듈 - 파일 경로, 디렉토리 경로와 관련된 모듈
const path = require('path'); // 내장 모듈 path
//path.js의 전체 경로
const fileName = __filename;
console.log("현재 파일의 디렉토리 경로", path.dirname(fileName));
console.log("파일의 확장자", path.extname(fileName));
console.log("파일의 이름", path.basename(fileName));
console.log("파일의 이름(확장자 없는)", path.basename(fileName, path.extname(fileName)));

//path.join > 상대 경로 작성법으로 절대 경로를 만들어 주는 메서드
// .. > 상위 디렉토리 이동
const userPath = path.join(__dirname, '..', '..', "/test_folder", "test.js");
console.log("__dirname", __dirname);
console.log("userPath", userPath);

/*
Users/morning/study/nodejs/exam
Users/morning/study/test_folder/test.js
*/

//path.parse - root, dir, name, ext, base
const parse = path.parse(fileName);
console.log("parse", parse); //파일 경로 분해
console.log("format", path.format(parse)); // 분해된 경로를 문자열로 결합하여 반환

//path.normalize > 비정상 경로 > 정상 경로 변경
const worongPath = "/Users/test/////test.js";
console.log("normalize", path.normalize(worongPath));