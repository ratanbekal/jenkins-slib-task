def call(Map params){
  def s= params.str
  byte[] decoded =s.decodeBase64()
  return new String(decoded)
}
