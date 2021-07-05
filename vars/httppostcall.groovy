import groovy.json.JsonSlurper
def call(Map params){
  echo "************************************************  Inside httppostcall func*******"
  echo params.token
  echo params.url
  echo params.secret
  def response= httpRequest acceptType: 'APPLICATION_JSON', 
                            contentType: 'APPLICATION_JSON',
                            authentication: params.secret,
                            customHeaders: [[maskValue: true, name: 'x-api-key', value: params.token]], 
                            httpMode: 'POST',
                            ignoreSslErrors: true, 
                            requestBody: params.requestBody, 
                            responseHandle: 'NONE', 
                            url: params.url, 
                            wrapAsMultipart: false
  println response.content
  return new JsonSlurper().parseText(response.content)
  
}
