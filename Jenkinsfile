pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew clean'
        sh './gradlew build'
      }
    }
    stage('Static Analysis') {
      steps {
        sh 'echo "do nothing"'
        waitForQualityGate true
      }
    }
    stage('Bake Image') {
      steps {
        sh 'echo "do nothing"'
      }
    }
  }
}