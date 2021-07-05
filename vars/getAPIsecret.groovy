def call(Map params){
  echo "***********************************   inside getAPISec Func  *****************"
   
  if (params.ctype == "POST"){
      def response= httppostcall token:params.apitoken,requestBody:params.body,url:params.url,secret:params.secret
      echo "----------- println http post response -------------"
      println response
      
      //env.SECRET_NAME=base64decode str:response.message
      env.SECRET_NAME= response.message
      
      //env.SECRET_PASSWORD=base64decode str:response.id.toString() 
      env.SECRET_PASSWORD= response.id.toString() 
      
      return response
  }
  if (params.ctype == "GET"){
      def response= httpgetcall token:params.apitoken,requestBody:params.body,url:params.url,secret:params.secret
      echo "----------- println http get response -------------"
      println response
      
      echo "call base64 func with value" 
      //env.SECRET_NAME=base64decode str:response.message
      env.SECRET_NAME= response.message
     
      echo "call base64 func with value" 
      //env.SECRET_PASSWORD=base64decode str:response.id.toString() 
      env.SECRET_PASSWORD= response.id.toString() 
    
      return response
  }
  

  
}
