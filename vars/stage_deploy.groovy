// vars/deploy_stage_1.groovy

def call() {
            sh """
	    sh 'curl -L -u $ARTIFACTORY_CREDENTIALS_USR:$ARTIFACTORY_CREDENTIALS_PSW -O http://3.91.150.156:8082/artifactory/jenkins-hello-world-libs-release-local/com/efsavage/hello-world-war/${BUILD_NUMBER}/hello-world-war-${BUILD_NUMBER}.war'            
            sh """
            sudo cp hello-world-war-${build_number}.war /opt/tomcat/apache-tomcat-10.1.34/webapps/
            """
            sh 'sudo bash /opt/tomcat/apache-tomcat-10.1.34/bin/shutdown.sh'
            sh 'sudo bash /opt/tomcat/apache-tomcat-10.1.34/bin/startup.sh'
}
