// Pipeline untuk NPM-Testing-Dev1
pipelineJob('TSA-Notification') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')  // Repository yang benar
                    }
                    branch('main')  // Branch yang dipantau
                }
            }
            scriptPath('Jenkinsfile')  // Path ke Jenkinsfile di repo
        }
    }
    triggers {
        scm('H/5 * * * *')  // Perbaikan triggers menggunakan 'scm' alih-alih 'pollSCM'
    }
}

// Pipeline untuk NPM-Testing-Dev2
pipelineJob('TSA-Parameter') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/maulanaakbrr/tryingsonar.git')  // Repository yang benar
                    }
                    branch('main')  // Branch yang dipantau
                }
            }
            scriptPath('Jenkinsfile')  // Path ke Jenkinsfile di repo
        }
    }
    triggers {
        scm('H/5 * * * *')  // Perbaikan triggers menggunakan 'scm' alih-alih 'pollSCM'
    }
}
