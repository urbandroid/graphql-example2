FROM quay.io/wildfly/wildfly:latest

# Set admin username and password
ENV WILDFLY_USER=admin
ENV WILDFLY_PASSWORD=admin123
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent

COPY target/wildfly-example.war /opt/jboss/wildfly/standalone/deployments/

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
