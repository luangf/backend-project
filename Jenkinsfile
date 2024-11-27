pipeline{
    agent any

    stages{
        stage('Build'){
            agent{
                docker { image 'maven:3.8.8-eclipse-temurin-17' }
            }
            steps{
                echo 'Building project...'
                sh "mvn clean install"
            }
        }
    }
}