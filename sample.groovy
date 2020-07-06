folder('roboshop') {
    displayName('roboshop')
    description('roboshop Project Folder')
}

folder('roboshop/CIJOBS') {
    displayName('roboshop/CIJOBS')
    description('roboshop CI Jobs Project Folder')
}

pipelineJob("roboshop/CIJOBS/Sample"){
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
