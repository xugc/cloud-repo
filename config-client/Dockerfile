FROM centos-java8:1.0
MAINTAINER "guchengxu1988@163.com"

COPY target/config-client-0.0.1-SNAPSHOT.tar.gz /home/www/
WORKDIR /home/www/
RUN tar -zxvf config-client-0.0.1-SNAPSHOT.tar.gz
RUN mv config-client-0.0.1-SNAPSHOT config-client

ENV CLASSPATH=$CLASSPATH:/home/www/config-client/lib/*:/home/www/config-client/config/

#RUN bash -c 'touch /config-server.jar'
EXPOSE 8880
ENTRYPOINT ["java","com.gc.cloud.service.config.client.CloudConfigClientApp"]
