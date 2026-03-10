pipeline {

    agent any

    tools {
        maven 'MAVEN'
        jdk 'JDK'
    }

    stages {

        stage('Checkout') {
            steps {
             git branch: 'main',url: 'https://github.com/NIKHIL201872/CalculatorJenkins.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
         
         
        }

        stage('Run JUnit Tests') {
            steps {
                bat 'mvn test'
            }
        }

       stage('SonarQube Analysis') {
          steps {
          withSonarQubeEnv('SonarQube') {
            bat 'mvn clean verify sonar:sonar'
        }
    }
}

    }
}