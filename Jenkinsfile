def testList = ["TestRectangleType", "TestTriangleType"]

pipeline {
   agent any

   stages {
      stage('Build') {
        steps {
          echo 'Building...'
          withMaven {
          bat "mvn.cmd clean compile"
          }
        }
   }
   stage('Test') {
     steps {
        echo 'Testing...1'
        withMaven {
          bat "mvn.cmd -Dtest=${testList.join(',')} test"
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