def call(Map params){
  echo "*************inside base-decode****************"
  def masksec params.str
  byte[] decoded = masksec.decodeBase64()
  println masksec.decodeBase64()
  println decoded
  return new String(decoded)
}
