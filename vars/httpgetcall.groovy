import groovy.json.JsonSlurper
def call(Map params){
  echo "************************************************  Inside http GET call func*******"
  echo params.token
  echo params.url
  echo "secret"
  echo params.secret
  def response= httpRequest acceptType: 'APPLICATION_JSON', 
                            contentType: 'APPLICATION_JSON',
                            //authentication: params.secret,
                            customHeaders: [[maskValue: true, name: 'name', value: params.secret]], 
                            httpMode: 'GET',
                            ignoreSslErrors: true, 
                            requestBody: params.requestBody, 
                            responseHandle: 'NONE', 
                            url: params.url, 
                            wrapAsMultipart: false
  println response.content
  return new JsonSlurper().parseText(response.content)
  
}
