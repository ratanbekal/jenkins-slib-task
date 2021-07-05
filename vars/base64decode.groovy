def call(Map request){
  echo "*************inside base-decode****************"
  def sec request.str
  byte[] decoded = sec.decodeBase64()
  println sec.decodeBase64()
  println decoded
  return new String(decoded)
}
