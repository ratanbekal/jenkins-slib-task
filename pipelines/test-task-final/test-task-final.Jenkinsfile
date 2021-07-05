node {
     stage("Slib-Ex1-Test-1-Stage") {
        getAPIsecret apitoken:'xvVDsl2h435k934JHcd',secret:"user01",url:"http://40.84.152.120:3000/authenticate" 
        echo env.SECRET_NAME
        echo env.SECRET_STAT
        if ( env.SECRET_NAME =="user01" && env.SECRET_STAT == "true" ){
               //env.SECRET_NAME=base64decode str:env.SECRET_NAME
               env.SECRET_PASSWORD=base64decode str:env.SECRET_PASSWORD
               println(env.SECRET_NAME)
               println(env.SECRET_PASSWORD)
        }else {
               error("Values dont match")
        }
     }   
} 
