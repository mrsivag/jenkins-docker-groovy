pipeipeline agent any{
 agents any
  environment{
    URL1="google.com"
  }
  stages{
    stage("My First Stage"){
        environment{
            URL2="yahoo.com"
        }
        steps{
            sh'''
             echo Hello from first stage
             echo Hello from second stage
        '''
        print "Hello from Groovy"
        print("URL "+URL1)
        }

    }
    stage("My Second Stage"){
        steps{
            print("URL2 "+URL2)
        }
     }

  }

}