// Membuat job pipeline pertama (Dev1)
pipelineJob('NPM-Testing-Dev1') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')
                    }
                    branch('dev1')  // Branch Dev1
                }
            }
            scriptPath('Jenkinsfile')  // Path untuk Jenkinsfile di repo
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
                        url('https://github.com/maulanaakbrr/tryingsonar.git')
                    }
                    branch('dev2')  // Branch Dev2
                }
            }
            scriptPath('Jenkinsfile')  // Path untuk Jenkinsfile di repo
        }
    }
}
