node {
     stage("Slib-Ex1-Test-1-Stage") {
        getAPIsecret apitoken:'v6PxYYLe8rhKftISrfFM42vTNTIxeUt97JKgT1y5',ctype:"POST",sectet:"github",url:"https://api.thecatapi.com/v1/votes" ,body:"{\"image_id\":\"asf\",\"sub_id\":\"my-user-1234\",\"value\":1}" 
        
        if ( env.SECRET_NAME =="SUCCESS" ){
               //env.SECRET_NAME=base64decode str:env.SECRET_NAME
               env.SECRET_PASSWORD=base64decode str:env.SECRET_PASSWORD
               println(env.SECRET_NAME)
               println(env.SECRET_PASSWORD)
        }else {
               error("Values dont match")
        }
     }   
} 
