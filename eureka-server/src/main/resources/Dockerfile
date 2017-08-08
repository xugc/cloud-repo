FROM centos-java8:1.0
MAINTAINER "guchengxu1988@163.com"

COPY target/eureka-server-0.0.1-SNAPSHOT.tar.gz /home/www/
WORKDIR /home/www/
RUN tar -zxvf eureka-server-0.0.1-SNAPSHOT.tar.gz
RUN mv eureka-server-0.0.1-SNAPSHOT eureka-server

ENV CLASSPATH=$CLASSPATH:/home/www/eureka-server/lib/*:/home/www/eureka-server/config/

#RUN bash -c 'touch /config-server.jar'
EXPOSE 8880
ENTRYPOINT ["java","com.gc.cloud.service.eureka.server.EurekaServerApp"]
