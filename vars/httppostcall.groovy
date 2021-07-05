import groovy.json.JsonSlurper
def call(Map request){

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

  return new JsonSlurper().parseText(response.content)
  
}
