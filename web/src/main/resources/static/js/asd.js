// 'use strict'

let headers = new Headers();
// headers.append('Content-Type', 'application/json');
// headers.append('Accept', 'application/json');
// headers.append('Origin','http://localhost:8080/js');
// headers.append("Access-Control-Allow-Origin", "*");
// headers.append("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
// headers.append('Access-Control-Allow-Credentials', 'true');
// headers.append("Access-Control-Allow-Headers","Authorization");


fetch('http://localhost:8080/login',{
    headers : headers,
    // mode: 'no-cors',
    method : 'GET'

}).then((e)=>{
    return e.body;
}).then((e)=>{
    console.log(e.getReader().toString())
})
//     .then(fetch('http://localhost:8080/login',{
//         headers : headers,
//         mode: 'cors',
//         method : 'GET'
//
//     })
// )
// fetch('http://localhost:8080/js',{
//     headers : headers,
//     mode: 'cors',
//     method : 'GET'
// });