def call(Map request){
    echo "**inside getAPISec Func ********"
  
    def response= httppostcall token:request.apitoken,url:request.url,secret:request.secret
    echo "~~~~~~~~~ print response inside getAPISec ~~~~~~~"
    println(response.success)
    println(response.data)
  
    return response
  }
