pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Clean'
        sh './gradlew clean'
        echo 'Build'
        sh './gradlew build'
      }
    }
  }
}