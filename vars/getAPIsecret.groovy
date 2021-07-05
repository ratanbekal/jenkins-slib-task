def call(Map request){
    echo "**inside getAPISec Func ********"
  
    def response= httppostcall token:request.apitoken,url:request.url,secret:request.secret
    
    //env.SECRET_STAT= response.success
    env.SECRET_PASSWORD= response.data 
    env.SECRET_NAME= request.secret 
    
    echo "~~~~~~~~~ print response inside getAPISec ~~~~~~~"
    println(response.success)
    println(response.data)
  
    return response
  }
