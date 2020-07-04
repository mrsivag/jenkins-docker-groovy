pipelineJob("Sample"){
	description('Sample')
	definition {
	  cpsScm{
	    scm{
		 git{
		  remote{
		   url("https://github.com/mrsivag/jenkins-docker-groovy")
		   credentials("GitUserPass")
		  }
		  branch("*/master")
		 }
		}
		scriptPath("jenkinsfile")
	  }
	}
}
//sample code heress