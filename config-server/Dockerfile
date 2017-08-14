FROM centos-java8:1.0
MAINTAINER "guchengxu1988@163.com"

COPY target/config-server-0.0.1-SNAPSHOT.tar.gz /home/www/
WORKDIR /home/www/
RUN tar -zxvf config-server-0.0.1-SNAPSHOT.tar.gz
RUN mv config-server-0.0.1-SNAPSHOT config-server

ENV CLASSPATH=$CLASSPATH:/home/www/config-server/lib/*:/home/www/config-server/config/

#RUN bash -c 'touch /config-server.jar'
EXPOSE 8880
ENTRYPOINT ["java","com.gc.cloud.service.config.server.CloudConfigServerApp"]
