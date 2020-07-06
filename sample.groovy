folder('roboshop/CIJOBS') {
    displayName('roboshop/CIJOBS')
    description('roboshop CI Jobs Project Folder')
}

pipelineJob("robishop/CIJOB/Sample"){
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
