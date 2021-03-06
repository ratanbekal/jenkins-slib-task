import groovy.json.JsonSlurper
def call(Map params){
  echo "******************  Inside http GET call func*******"

  def response= httpRequest acceptType: 'APPLICATION_JSON', 
                            contentType: 'APPLICATION_JSON',
                            //authentication: params.secret,
                            //customHeaders: [[name: 'name', value: params.secret]], 
                            httpMode: 'GET',
                            ignoreSslErrors: true, 
                            requestBody: params.requestBody, 
                            responseHandle: 'NONE', 
                            url: params.url, 
                            wrapAsMultipart: false
  println response.content
  return new JsonSlurper().parseText(response.content)
  
}
