def call(Map params){
  echo "***********************************   inside getAPISec Func  *****************"
  echo "Param-APIToken" 
  echo params.apitoken
  echo "Param-url" 
  echo params.url
  echo "Param-secret" 
  echo params.secret
  echo "Env Secret Name" 
  echo env.SECRET_NAME
  echo "Env Sec Pass" 
  echo env.SECRET_PASSWORD 
  def response= httppostcall token:params.apitoken,requestBody:params.body,url:params.url,secretKey:params.secret
  echo "----------- println response -------------"
  println response
  echo "call base64 func with value" 
  env.SECRET_NAME=base64decode str:response.message
  echo "call base64 func with value" 
  env.SECRET_PASSWORD=base64decode str:response.id.toString() 
  echo "Print Env Sec Name and Pass from with in getAPIsed func"
  echo env.SECRET_NAME
  echo env.SECRET_PASSWORD 
  return()
  
}
