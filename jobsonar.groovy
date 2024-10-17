// Update pipeline untuk menggunakan branch yang benar (misalnya 'main')
pipelineJob('NPM-Testing-Dev1') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')  // URL repo yang benar
                    }
                    branch('main')  // Pastikan ini menggunakan branch yang ada
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

// Pipeline kedua juga diupdate ke branch yang benar
pipelineJob('NPM-Testing-Dev2') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')  // URL repo yang benar
                    }
                    branch('main')  // Sesuaikan dengan branch yang benar
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}
