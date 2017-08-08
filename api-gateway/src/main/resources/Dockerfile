FROM centos-java8:1.0
MAINTAINER "guchengxu1988@163.com"

COPY target/api-gateway-0.0.1-SNAPSHOT.tar.gz /home/www/
WORKDIR /home/www/
RUN tar -zxvf api-gateway-0.0.1-SNAPSHOT.tar.gz
RUN mv api-gateway-0.0.1-SNAPSHOT api-gateway

ENV CLASSPATH=$CLASSPATH:/home/www/api-gateway/lib/*:/home/www/api-gateway/config/

#RUN bash -c 'touch /config-server.jar'
EXPOSE 8880
ENTRYPOINT ["java","com.gc.cloud.api.gateway.ApiGateWayApplication"]
