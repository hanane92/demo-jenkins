pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('web-flux-app') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hanane92/web-flux-spring-boot.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}