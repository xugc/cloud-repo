FROM centos-java8:1.0
MAINTAINER "guchengxu1988@163.com"

COPY target/service-consumer-0.0.1-SNAPSHOT.tar.gz /home/www/
WORKDIR /home/www/
RUN tar -zxvf service-consumer-0.0.1-SNAPSHOT.tar.gz
RUN mv service-consumer-0.0.1-SNAPSHOT service-consumer

ENV CLASSPATH=$CLASSPATH:/home/www/service-consumer/lib/*:/home/www/service-consumer/config/

#RUN bash -c 'touch /config-server.jar'
EXPOSE 8880
ENTRYPOINT ["java","com.gc.cloud.service.consumer.ServiceConsumerApplication"]
