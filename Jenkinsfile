pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -f service-layer/pom.xml -B -DskipTests clean package' 
            }
        }
	stage('Test') {
            steps {
                sh 'mvn -f service-layer/ test'
            }
            
        }
        stage('Deliver') { 
            steps {
                sh 'java -jar target/java-maven-app-1.0-SNAPSHOT.jar' 
            }
        }
    }
}
