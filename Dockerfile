FROM openjdk:15
WORKDIR /app/
COPY ./* ./
RUN javac fff.java
