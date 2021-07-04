node {
    stage("Slib-Ex1-TestStage") {
        getAPIsecret([
                'secret':'laika',
                'url': 'https://ugbdxukak0.execute-api.us-east-1.amazonaws.com/default/fakeCredentials',
                'api-token': 'v6PxYYLe8rhKftISrfFM42vTNTIxeUt97JKgT1y5'
        ]){
                 if ( env.SECRET_NAME =="VALUE" && env.SECRET_PASSWORD== "VALUE"){
                         println(env.SECRET_NAME)
                         println(env.SECRET_PASSWORD)
                         println(Base64.decodeBase64(env.SECRET_PASSWORD))
                 }else {
                         error("Values dont match")
                 }
         }
    }
}


