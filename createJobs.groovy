pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hanane92/spring-api.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}