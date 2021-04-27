pipeline {
   agent any
    {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }

   stages {
      stage('Build') {
        steps {
          echo 'Building...'
          withMaven {
          sh "mvn clean compile"
          }
        }
   }
   stage('Test') {
     steps {
        echo 'Testing...1'
        withMaven {
          sh "mvn test"
          }
     }
   }
   stage('Deploy') {
     steps {
       echo 'Deploying...'
     }
   }
  }
}