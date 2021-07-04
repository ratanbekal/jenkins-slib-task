node {
    stage("Slib-Ex1-TestStage") {
        def call()
                {
                    getAPIsecret apitoken:'DEMO-APIKEY',sectet:"github",url:"https://api.thecatapi.com/v1/votes",body:"{\"image_id\":\"asf\",\"sub_id\":\"my-user-1234\",\"value\":1}"
                }
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


