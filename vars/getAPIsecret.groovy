def call(Map params){
    echo "**inside getAPISec Func ********"
  
    def response= httppostcall token:params.apitoken,requestBody:params.body,url:params.url,secret:params.secret
    //env.SECRET_NAME= response.message
    //env.SECRET_PASSWORD= response.id.toString() 
    echo "~~~~~~~~~ print response ~~~~~~~"
    println(response.message)
    println(response.success)
    println(response.data)
  
    return response
  }
