def call(Map params){
  echo "***********************************   inside getAPISec Func  *****************"
  echo params.apitoken
  echo params.url
  echo params.secret
  def response= httppostcall token:params.apitoken,requestBody:params.body,url:params.url,secretKey:params.secret
  println response
  echo "call base64 func with value" 
  env.SECRET_NAME=base64decode str:response.message
  echo "call base64 func with value" 
  env.SECRET_PASSWORD=base64decode str:response.id.toString() 
  echo "from with in getAPIsed func"
  echo env.SECRET_NAME
  echo env.SECRET_PASSWORD 
  
}
