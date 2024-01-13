FROM openjdk:21-slim

ARG JAR_FILE=out/artifacts/RJ_Veiculos_jar/RJ-Veiculos.jar

COPY ${JAR_FILE} app.jar

CMD ["java", "-jar", "/app.jar"]