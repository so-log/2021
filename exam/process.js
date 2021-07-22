// process 노드가 실행되는 프로세스에 대한 정보
console.log("version", Process.version); //Node.js의 버전
console.log("arch", Process.arch); //프로세스의 아키텍쳐 정보
console.log("platform", Process.platform); //운영체제의 플랫폼(win32, linux ...)
console.log("uptime", Process.uptime()); //프로세스가 시작된 후 흐른 시간
console.log("execPath", Process.execPath); //실행중인 node의 경로
console.log("cwd", Process.cwd()); //현재 프로세스가 실행되는 위치
console.log("cpuUsage", Process.cpuUsage()); //CPU 사용량

//process.env -> 환경설정 + dotenv(.env 파일에 설정한 부분을 process.env에 대입)