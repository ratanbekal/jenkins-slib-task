node {
     stage("Slib-Ex1-Test-1-Stage") {
        getAPIsecret apitoken:'v6PxYYLe8rhKftISrfFM42vTNTIxeUt97JKgT1y5',
               sectet:"github",
               url:"https://api.thecatapi.com/v1/votes",
               body:"{\"image_id\":\"asf\",\"sub_id\":\"my-user-1234\",\"value\":1}"  
        {
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
