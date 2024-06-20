FROM oraclelinux:9

COPY * /app/

RUN yum install wget
RUN wget -P /root/ https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm 

WORKDIR /root

RUN yum install ./jdk-17_linux-x64_bin.rpm 



