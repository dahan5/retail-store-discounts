FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/BOOT-INF/classes /app
COPY ${DEPENDENCY}/META-INF /app/META-INF

ENV SPRING_PROFILES_ACTIVE=dev 
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "feqra.retail.store.RetailStoreDiscountsApplication"]