FROM openjdk:15
WORKDIR /app/
COPY ./* ./
ENV CLASSPATH="./antlr-4.9.2-complete.jar:$CLASSPATH"
RUN javac fff.java
