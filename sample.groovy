def PROJECT_NAME = 'roboshop'
def CI_PATH = 'CIJOBS'
def SAMPLE = 'Sample'
folder(PROJECT_NAME) {
    displayName(PROJECT_NAME)
    description(PROJECT_NAME +' Project Folder')
}

folder(PROJECT_NAME+'/'+CI_PATH) {
    displayName(PROJECT_NAME+'/'+CI_PATH)
    description(PROJECT_NAME+'/'+CI_PATH+' Project Folder')
}

pipelineJob(PROJECT_NAME+'/'+CI_PATH+'/'+SAMPLE){
	description('Sample')
	definition {
	  cpsScm{
	    scm{
		 git{
		  remote{
		   url("https://github.com/mrsivag/jenkins-docker-groovy")
		  }
		  branch("*/master")
		 }
		}
		scriptPath("jenkinsfile")
	  }
	}
}
