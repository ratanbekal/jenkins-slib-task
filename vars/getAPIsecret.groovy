def call(Map params){
  def response= httppostcall token:params.apitoken ,requestBody:params.body,url: params.url,secretKey:params.secret
  println response
  env.SECRET_NAME=base64decode str:response.message
  env.SECRET_PASSWORD=base64decode str:response.id.toString() 
  echo env.SECRET_NAME
  echo env.SECRET_PASSWORD 
}
