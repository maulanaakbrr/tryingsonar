// Pipeline untuk NPM-Testing-Dev1
pipelineJob('NPM-Testing-Development-1') {
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
pipelineJob('NPM-Testing-Development-2') {
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
