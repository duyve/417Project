pipeline {
   agent any

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