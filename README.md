# 1) socioregister-starter
A Springboot REST application to register and add Socios (first step, empty Springboot shell, the starter part)

1) General Info About the Socio-Micro-Service-Demo

2) Specific Info Concerning Each Single Application



General Info =====================================

The Socio Micro Services Project will consist of about 10 small (backend) Springboot applications, deployed in a Docker Container/ Linux Oracle Virtual Box. SocioRegister is the principal part of a series of four applications called: starter, mock, jpa, socioregister. Together they show a stepwise buildup to a Springboot REST application, which contains use-cases for registering and adding Socios (similar to Facebook). This line of applications goes from an almost empty Springboot shell (starter: one controller method only) to a small but full-fledged REST application: SocioRegister which will be used as a component of our micro-services.

Next you`ll find four other serving applications. The simple SocioWeather, provides a weather-report by city by consulting an external REST-service called Open Weather. SocioBank, permits money transaction between Socios alse consulting an external service for exchange rates. The SocioSecurity, a Cookie/ Token based SpringSecurity (OAUTH2), still has to be written. Finally the SocioDbBatch application is interesting because it will update, on a daily bases, the databases of SocioRegister (socio_db) and SocioBank (soicio_bank_db). The DBs run on MySQL or Postgres.

From SocioRegister-jpa one finds backend-Validation (javax) and REST-Exception Handeling of Spring (RestControllerAdvice).

Testing, in general, will have an important focus and since we are dealing with Spring(boot) there will systematically testing based on five mayor strategies:

	-@ExtendWith(MockitoExtension.class)

	-@ExtendWith(SpringExtension.class) standalone setup (two ways)

	-@ExtendWith(SpringExtension.class) server tests (@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

	-@DataJpaTest wich is database testing on H2

	-Spring Batch testing

Testing is still "work in progress"



Specific Info SocioRegister-starter =====================================

This application would be the one to start revising first. This Starter application is basicaly an empty shell. One may use applications like Spring Initializr to generate the code, but I prefer to do it manually.

First note the file-folder tree: root: pom.xml src -> main test. In each main and test one finds a java folder and one may find a resources folder (in test not always).

Than turn to the Maven pom.xml, the key part of a Springboot app, and note the important Springboot part within the parent tags. Also note the Springboot plugin at the end.

The socalled starter-dependencies (here only two: web and test) are essential for a boot app. You should certainly look into this part and its "auto-config", the main principle of a Springboot app.

The SocioRegisterApplication´s main method is the classical Springboot-application starter. The second class: SocioController prints "Socio Starter" on your screen when using the url: http://localhost:8081/socio/starter (find the port config at resources/application.properties which Spring will read because of auto-config).

Finally there are only two test classes. The SocioRegisterApplicationTest is the standard, first test class concerning the Spring Application Context (look into this as well). When something goes wrong e.g. starting a DB-connection and its tables/ data Initialization the context will not start and the test will notify you!

The ControllerTest is pretty straight forward. This type of test will not appear in a REST applicaion context.

That is all there is concerning this first important step towards Java Springboot microservices.
