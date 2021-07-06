def call(Map request){
  
    def response= httppostcall token:request.apitoken,url:request.url,secret:request.secret
    println(response)
    println("Status" + response.success)
    env.SECRET_STAT= response.success
    env.SECRET_PASSWORD= response.data 
    env.SECRET_NAME= request.secret 
  
    return response
  }
