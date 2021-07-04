def call(Map params){
  echo "inside base-decode funcc"
  echo params.str
  def s= params.str
  byte[] decoded =s.decodeBase64()
  return new String(decoded)
}
