def call(Map request){
  
  def masksec= request.str
  byte[] decoded = masksec.decodeBase64()

  return new String(decoded)
}
