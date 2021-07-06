node {
     stage("Slib-Ex1-Test-1-Stage") {
        getAPIsecret apitoken:'v6PxYYLe8rhKftISrfFM42vTNTIxeUt97JKgT1y5',ctype:"POST",sectet:"cat",url:"https://api.thecatapi.com/v1/votes",body:"{\"image_id\":\"asf\",\"sub_id\":\"my-user-1234\",\"value\":1}"  
     }   
     stage("Slib-Ex1-Test-2-Stage") {
        getAPIsecret apitoken:'xvVDsl2h435k934JHcd',ctype:"POST",secret:"user01",url:"http://40.84.152.120:3000/authenticate"
        
     }
     stage("Slib-Ex1-Test-3-Stage") {
        getAPIsecret apitoken:'v6PxYYLe8rhKftISrfFM42vTNTIxeUt97JKgT1y5',ctype:"GET",secret:"ratan",url:"https://api.genderize.io",body:"{\"name\":\"ratan\"}"
     }
     stage("Slib-Ex1-Test-4-Stage") {
        getAPIsecret apitoken:'v6PxYYLe8rhKftISrfFM42vTNTIxeUt97JKgT1y5',ctype:"GET",secret:"arya",url:"https://api.agify.io",body:"{\"name\":\"arya\"}"
     }
}
