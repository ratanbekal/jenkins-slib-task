def call(Map request){
  echo "*************inside base-decode****************"
  def masksec request.str
  byte[] decoded = masksec.decodeBase64()
  println masksec.decodeBase64()
  println decoded
  return new String(decoded)
}
