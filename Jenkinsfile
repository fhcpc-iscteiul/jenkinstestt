pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }

    stage('test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('javadoc') {
      steps {
        sh 'mvn javadoc:javadoc'
      }
    }

  }
}