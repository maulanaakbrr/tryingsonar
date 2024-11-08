pipeline {
    agent any

    environment {
        SONARQUBE_SERVER = 'http://10.10.141.186:9000'
        SONAR_TOKEN = credentials('sonar-token')  // Replace 'sonar-token' with your Jenkins credential ID for the SonarQube token
    }

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/maulanaakbrr/tryingsonar.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'npm install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') { // Ensure 'SonarQube' matches the SonarQube configuration name in Jenkins
                    sh "sonar-scanner \
                        -Dsonar.projectKey=tryingsonar \
                        -Dsonar.sources=. \
                        -Dsonar.host.url=$SONARQUBE_SERVER \
                        -Dsonar.login=$SONAR_TOKEN"
                }
            }
        }

        stage('Run Tests') {
            steps {
                sh 'npm test'
            }
        }
    }

    post {
        success {
            echo 'Tes berhasil dijalankan!'
        }
        failure {
            echo 'Tes gagal dijalankan.'
        }
    }
}
