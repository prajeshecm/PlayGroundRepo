// //<!--Scenario 1 : Get the express created and handle the message back to node when express is initiated from node.
// //<!-- declaring the 3rd party express -->
// const express = require('express');

// //<!-- and assigning it to the app -->
// const app = express();

// //<!-- its a middle-ware , so we can manipulate the incoming request , call other middle-ware function etc. -->
// app.use((Request,Response,next)=>{
//   console.log('this is my first middleware portion for express');
//   next();
// })

// app.use((Request,Response)=>{
//   console.log('this is the inner method for my express');
//   Response.send('the response from the inner method');
// })

// //<!-- now the express is ready and we are good to export the middle-ware so other server side can make use of it -->
// module.exports=app;

// //<!-- now we can import this app to our node app -->
// //-->


//=============================================================================================================
//Scenario 2 : Making the above express with hardcoded database Response.
//<!-- declaring the 3rd party express -->
const express = require('express');

//<!-- and assigning it to the app -->
const app = express();

//<!--allow the CORS permission for the clients -->
app.use((request,response,next) => {
  console.log('allowing the cors from node/express side...');
response.setHeader("Access-Control-Allow-Origin","*");
response.setHeader("Access-Control-Allow-Header","Origin,X-Requested-With,Content-Type,Accept");
response.setHeader("Access-Control-Allow-methods","GET,POST,PATCH,DELETE,OPTIONS");
next();
});


//<!-- its a middle-ware , so we can manipulate the incoming request , call other middle-ware function etc. -->
app.use('/api/cricketer-list',(request,response)=>{
  console.log('this is my first middleware portion for express with hard coded values');
    const cricketer =[
    {id:'123',cricketerName: 'sachin', selected4reason:'master'},
    {id:'456',cricketerName: 'kohli', selected4reason:'king'},
    {id:'789',cricketerName: 'smith', selected4reason:'sexy'}
  ];
  response.status(200).json({message:'successfully retrieved',cricketer: cricketer})
})

// app.use((Request,Response)=>{
//   console.log('this is the inner method for my express');
//   Response.send('the response from the inner method');
// })

//<!-- now the express is ready and we are good to export the middle-ware so other server side can make use of it -->
module.exports=app;
