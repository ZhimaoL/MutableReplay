javac Solution.java
java -Xdebug -Xrunjdwp:transport=dt_socket,address=127.0.0.1:8000,suspend=y -jar chroniclerj.jar -instrument Solution.class deploy replay
