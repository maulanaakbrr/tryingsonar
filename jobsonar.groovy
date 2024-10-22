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

        stage('Sonarqube InActin') {
            steps {
                script {
                    def scannerHome = tool 'SonarQube Scanner'
                    withSonarQubeEnv('Sonarqube VM') { 
                        sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=my-project-key -Dsonar.sources=. -Dsonar.host.url=http://localhost:9000 -Dsonar.login=${SonarqubeVM}"
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
