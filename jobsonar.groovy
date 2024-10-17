// Membuat job pipeline pertama (Dev1)
pipelineJob('NPM-Testing-Dev1') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')  // URL repo
                    }
                    branch('dev1')  // Branch yang digunakan
                }
            }
            scriptPath('Jenkinsfile')  // Lokasi Jenkinsfile di repo
        }
    }
}

// Membuat job pipeline kedua (Dev2)
pipelineJob('NPM-Testing-Dev2') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')  // URL repo
                    }
                    branch('dev2')  // Branch yang digunakan
                }
            }
            scriptPath('Jenkinsfile')  // Lokasi Jenkinsfile di repo
        }
    }
}
