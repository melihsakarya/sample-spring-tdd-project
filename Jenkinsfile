pipeline {
  agent any
  stages {
    stage('Analysis') {
      steps {
        sleep 5
      }
    }

    stage('Development') {
      steps {
        sleep 5
      }
    }

    stage('Code Review') {
      steps {
        sleep 5
      }
    }

    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            sleep 5
          }
        }

        stage('error') {
          steps {
            sleep 5
          }
        }

      }
    }

    stage('Deployment') {
      steps {
        sleep 5
      }
    }

  }
}