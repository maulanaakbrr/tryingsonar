// Pipeline untuk NPM-Testing-Dev1
pipelineJob('NPM-Testing-Dev1') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')  // Repository yang benar
                    }
                    branch('main')  // Branch yang dipantau, misalnya 'main'
                }
            }
            scriptPath('Jenkinsfile')  // Path ke Jenkinsfile di dalam repo
        }
    }
    triggers {
        pollSCM('H/5 * * * *')  // Konfigurasi polling setiap 5 menit
    }
}

// Pipeline untuk NPM-Testing-Dev2
pipelineJob('NPM-Testing-Dev2') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')  // Repository yang sama
                    }
                    branch('main')  // Branch yang dipantau
                }
            }
            scriptPath('Jenkinsfile')  // Path ke Jenkinsfile di dalam repo
        }
    }
    triggers {
        pollSCM('H/5 * * * *')  // Konfigurasi polling setiap 5 menit
    }
}
