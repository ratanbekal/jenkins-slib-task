def call(Map params){
    echo "**inside getAPISec Func ********"
  
    def response= httppostcall token:params.apitoken,requestBody:params.body,url:params.url,secret:params.secret
    env.SECRET_NAME= response.message
    env.SECRET_PASSWORD= response.id.toString() 
  
    return response
  }
