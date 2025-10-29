<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>자바스크립트로 쿠키 생성후 팝업창 제어</title>
</head>
<body>
    <h1>자바스크립트로 쿠키 생성후 팝업창 제어</h1>
    <script>
        function showPopup(){
            let jsHidePopupCookie=null;

            let cookiesStr=document.cookie; ///key=value; key2=value2; ....
            if(cookiesStr){ //Boolean("",null)  false
                let cookies=cookiesStr.split(";")
                //console.log(cookies) //['hidePopup=1', ' jsHidePopup=1']
                for(let c of cookies){
                    let cArr=c.split("=");
                    let name=cArr[0].trim();
                    let value=cArr[1].trim();
                    console.log(name,value)
                    if(name==="jsHidePopup"){
                        jsHidePopupCookie=value;
                        break;
                    }
                }
            }
            //js는 equals가 존재하지 않음. 기본형만 비교가능 문자열은 자바와 달리 기본형
            if (jsHidePopupCookie==null || jsHidePopupCookie !== "1"){
                window.open("./l12popup.html","js_popup","width=500,height=600,left=100,top=100"); //(url,[js에서 사용할 팝업창이름],[옵션:크기,위치])
            }
        }

        showPopup();

        function addCookie(){
            const now=new Date();
            //1000*60 :60초
            console.log(now.toUTCString())
            now.setTime(now.getTime()+(1000*60*60));
            console.log(now.toUTCString());
            document.cookie =
                `js_hide_popup=1;expires=${now.toUTCString()};max-age=${60*60*24}`;
        }
        //addCookie();
    </script>
</body>
</html>
