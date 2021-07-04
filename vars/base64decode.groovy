def call(Map params){
  echo "*********************************  inside base-decode func *****************"
  echo params.str
  def s= params.str
  byte[] decoded =s.decodeBase64()
  echo "decoded value" s.decodeBase64()
  return new String(decoded)
}
