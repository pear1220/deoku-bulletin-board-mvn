# Standard Spring boot Framework (ver 0.1)

## ● setup [IntelliJ 기준]
1. GIT Clone
2. File Name Replace "easyoops" > "{project name}"
3. File > Projects Structure > Project, Module > ver 1.8 / 8 변경.
4. com/{project}/{project}Application 실행

## ● class 주석 설정
![image](https://user-images.githubusercontent.com/37864722/194234336-c788ae70-d642-4161-a89d-f3b575bca393.png)
1. file > Settings > Editor > File and Code Templates > include
> /**
> 
> packageName     : ${PACKAGE_NAME}
> 
> fileName        : ${NAME}
> 
> author          : ${USER}
> 
> date            : ${DATE}
> 
> version         : v0.1
> 
>  */
## ● structure
![image](https://user-images.githubusercontent.com/37864722/194232654-d2bbd354-7b73-4a46-be42-111680dfa4f9.png)

- bulletin_board : 게시판 개발
- common : 공통 (framework, util)
- ext : 외부 연동 개발 (provider)

## ● CORS 
1. 설정 : WebMvcConfig.java
2. 임시 옵션 변경 : allowCredentials(false), allowedOrigins(*)

## ● swagger UI
1. 설정 : SwaggerConfig.java
2. URL : http://localhost:8888/swagger-ui/

## ● application architecture
1. 구조 정도만 잡아 두었으며, 업무 상황에 맞게 맞춤형 구성 필요
   - aspect
   - security
   - filter
   - interceptor
   - exception
   - provider

# ※ ver 0.1 로컬 환경 구성 기준
