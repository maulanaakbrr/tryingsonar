pipeline {
    agent any

    tools {
        nodejs "NodeJS" // Sesuaikan dengan NodeJS yang sudah diinstal di Jenkins
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

        stage('Run Tests') {
            steps {
                sh 'npm test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                script {
                    def scannerHome = tool 'SonarQube Scanner' // Pastikan sudah menginstal SonarQube Scanner di Jenkins
                    withSonarQubeEnv('Sonarqube VM') { // Gunakan nama konfigurasi SonarQube yang sudah kamu buat
                        sh """
                        ${scannerHome}/bin/sonar-scanner \
                        -Dsonar.projectKey=my-project-key \  // Ganti dengan project key kamu
                        -Dsonar.sources=. \
                        -Dsonar.host.url=http://localhost:9000 \
                        -Dsonar.login=${SONAR_AUTH_TOKEN}    // Token yang sudah kamu setting di Jenkins
                        """
                    }
                }
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
