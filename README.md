spring-mvc-angularjs
====================

A simple application to demonstrate how to configure Angularjs with Spring MVC

The application demonstrates how to configure Spring MVC with AngularJS and Thymeleaf.

It uses the AngularJS-Seed with some modifications to allow Spring MVC load the HTML. Also integrated Thymeleaf in case it is needed to pass some values from the spring mvc controller into the partials or index.html file.

I also included the bootstrap library for a better UI.

Run Local (Embedded Tomcat):
----------------
  - execute: *mvn tomcat7:run*
  - Then open the URL: http://localhost:8080/spring-mvc-angularjs

Run inside tomcat container
-----------------------------
Package it with maven

  - execute: *mvn clean package*
  - copy the result war file into your tomcat/webapp folder
  - Then open the URL: http://localhost:8080/spring-mvc-angularjs
