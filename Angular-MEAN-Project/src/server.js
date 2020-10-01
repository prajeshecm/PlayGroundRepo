//<!-- Step 1 : Code snippet to test the node server ---STARTS HERE -->
        //<!-- Create the in built server ,  using the http inbuilt protocol
        //const http = require('http');

        //<!-- Create the in built server -->
        //const server = http.createServer((Request,Response)=>{
        //console.log("this is my first server log from nodeeeeeeeeeeeeee.....")
        //Response.end('Sending backhi hiiiiiiii');
        //});

        //<!-- listen to the server port -->
        //server.listen(process.env.PORT || 3000 );
        //<!-- Code snippet to test the node server ---ENDS HERE -->



//<!-- Step 2 : Code snippet to test the node server which in-turn call the express middleware ( which already has the server) ---STARTS HERE -->

          //<!-- import the http in-built protocol-->
         // const http = require('http');

          //import the express whcih is already exported. (C:\Prajesh\PlayGround\meanTuturial3\backend)
        //  const app = require('C:/Prajesh/PlayGround/meanTuturial3/backend/app');

         // const port = process.env.port || 3000;
        //  app.set('port',port);

         // const server = http.createServer(app);

         // server.listen(port);


//<!--Step 3 : this approach is with more solid error handling , auto-server-change capabilities -->>
const app = require('C:/Prajesh/PlayGround/meanTuturial3/backend/app');
const debug = require("debug")("node-angular");
const http = require("http");

const normalizePort = val => {
  var port = parseInt(val, 10);

  if (isNaN(port)) {
    // named pipe
    return val;
  }

  if (port >= 0) {
    // port number
    return port;
  }

  return false;
};

const onError = error => {
  if (error.syscall !== "listen") {
    throw error;
  }
  const bind = typeof port === "string" ? "pipe " + port : "port " + port;
  switch (error.code) {
    case "EACCES":
      console.error(bind + " requires elevated privileges");
      process.exit(1);
      break;
    case "EADDRINUSE":
      console.error(bind + " is already in use");
      process.exit(1);
      break;
    default:
      throw error;
  }
};

const onListening = () => {
  const addr = server.address();
  const bind = typeof port === "string" ? "pipe " + port : "port " + port;
  debug("Listening on " + bind);
};

const port = normalizePort(process.env.PORT || "3000");
app.set("port", port);

const server = http.createServer(app);
server.on("error", onError);
server.on("listening", onListening);
server.listen(port);





