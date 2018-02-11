# RESTAPIMessanger001

This version contains Hardcoded Message(for dynamic check RESTAPIMessanger002) in Messenger. Used Java jax-rs API services and Maven as Project Manager. Try this http://localhost:8084/webapi/messages/ to get all the messages.

# Project Details
In MessageResources.java Class there is two way setted to acheive data. For getting data as XML uncomment the XML code. For JSON uncomment JSON part below. 

Alert: Don't use Glassfish server version 4.1.1 when retreiving data as JSON. this version has issues with json library moxy.jar. try Glassfish 4.1.0 or Tomcat
