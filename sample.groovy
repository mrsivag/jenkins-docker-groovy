pipelineJob("Sample"){
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
