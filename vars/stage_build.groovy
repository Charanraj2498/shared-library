// vars/buildStage.groovy

def call() {
            sh 'mvn clean package'
        }
