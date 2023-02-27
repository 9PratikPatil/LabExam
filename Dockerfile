FROM openjdk:11-slim
WORKDIR /usr/src/myapp
RUN javac Summation.java
CMD ["java", "Summation"]