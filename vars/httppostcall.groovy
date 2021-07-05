import groovy.json.JsonSlurper
def call(Map request){
  echo "*******Inside httppostcall func*******"

  def response= httpRequest acceptType: 'APPLICATION_JSON', 
                            contentType: 'APPLICATION_JSON',
                            //authentication: request.secret,
                            customHeaders: [[name: 'authtoken', value:request.token]], 
                            httpMode: 'POST',
                            ignoreSslErrors: true, 
                            requestBody: "{\"username\":\""+request.secret+"\"}",
                            responseHandle: 'NONE', 
                            url: request.url, 
                            wrapAsMultipart: false
  println response.content
  echo "*******End httppostcall func*******"
  return new JsonSlurper().parseText(response.content)
  
}
