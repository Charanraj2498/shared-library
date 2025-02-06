
// vars/deployStage.groovy

def call() {
            sh 'curl ifconfig.me'
            sh 'curl -L -u "${ARTIFACTORY_CREDENTIALS_USR}:${ARTIFACTORY_CREDENTIALS_PSW}" -O "http://3.91.150.156:8082/artifactory/jenkins-hello-world-libs-release-local/com/efsavage/hello-world-war/9/$BUILD_NUMBER/hello-world-war-$BUILD_NUMBER.war"'
            sh 'ls'
            sh 'sudo cp hello-world-war-$BUILD_NUMBER.war /opt/tomcat/apache-tomcat-10.1.34/webapps/'
            sh 'sudo bash /opt/tomcat/apache-tomcat-10.1.34/bin/shutdown.sh'
            sh 'sudo bash /opt/tomcat/apache-tomcat-10.1.34/bin/startup.sh'
       }
