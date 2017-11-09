# weblogic-jee-quickstart
weblogic-jee-quickstart is sample of Java EE for EAR artifact to Oracle WebLogic Server. 

1. Install Oracle WebLogic Server
1. Configuring the WebLogic Maven Plug-In
1. Download weblogic-jee-quickstart
1. Import weblogic-jee-quickstart/pom.xml to IDE
1. Pack the application by maven
1. Deploy the application to WebLogic Server

### 1. Install Oracle WebLogic Server

Download Generic Installer of Oracle WebLogic Server.   
http://www.oracle.com/technetwork/middleware/weblogic/downloads/index.html   

Install Oracle WebLogic Server to your laptop.   
https://docs.oracle.com/middleware/12212/lcm/WLSIG/GUID-E4241C14-42D3-4053-8F83-C748E059607A.htm#WLSIG125   

Creating and Configuring the WebLogic Domain WebLogic domain.   
https://docs.oracle.com/middleware/12212/lcm/WLSIG/GUID-4AECC00D-782D-4E77-85DF-F74DD61391B4.htm   

### 2. Configuring the WebLogic Maven Plug-In
Configuring the WebLogic Maven Plug-In.   
https://docs.oracle.com/middleware/12212/wls/WLPRG/maven.htm#WLPRG883   

### 3. Download weblogic-jee-quickstart
Download weblogic-jee-quickstart.zip or git clone weblogic-jee-quickstart.
```
git clone https://github.com/chiroito/weblogic-jee-quickstart
```

### 4. Import weblogic-jee-quickstart/pom.xml to IDE
Depends on IDE to use. If you use IntelliJ IDEA, you can import [File]-[New]-[Project from Existing Sources...].

### 5. Pack the application by maven
After developing application, you can build application to EAR artifact using maven.
```
cd weblogic-jee-quickstart
mvn package
```
### 6. Deploy the application to WebLogic Server
```
mvn deploy -Dadminurl=t3://127.0.0.1:7001 -Duser=weblogic -Dpassword=69122d37 -Dtargets=AdminServer -Dupload=true -Dremote=true
```