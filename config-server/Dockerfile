FROM xgc/centos-java8:1.0
MAINTAINER "guchengxu1988@163.com"

ADD target/config-server-0.0.1-SNAPSHOT.tar.gz /home/www/
RUN mv /home/www/config-server-0.0.1-SNAPSHOT /home/www/config-server

ENV CLASSPATH=$CLASSPATH:/home/www/config-server/lib/*:/home/www/config-server/config/

#RUN bash -c 'touch /config-server.jar'
EXPOSE 8880
ENTRYPOINT ["java","com.gc.cloud.service.config.server.CloudConfigServerApp"]
