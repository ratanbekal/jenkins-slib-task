import groovy.json.JsonSlurper
def call(Map params){
  echo "*******Inside httppostcall func*******"

  def response= httpRequest acceptType: 'APPLICATION_JSON', 
                            //contentType: 'APPLICATION_JSON',
                            //authentication: params.secret,
                            customHeaders: [[name: 'authtoken', value:params.token]], 
                            httpMode: 'POST',
                            ignoreSslErrors: true, 
                            requestBody: "{\"username\":\""+params.secret+"\"}",
                            responseHandle: 'NONE', 
                            url: params.url, 
                            wrapAsMultipart: false
  println response.content
  echo "*******End httppostcall func*******"
  return new JsonSlurper().parseText(response.content)
  
}
