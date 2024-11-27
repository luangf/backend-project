pipeline{
    agent any

    stages{
        stage('Build'){
            steps{
                echo 'Building project...'
                script{
                    docker.image('maven:3.8.8-eclipse-temurin-17').inside{
                        sh 'mvn clean install'
                    }
                }
            }
        }
    }
}