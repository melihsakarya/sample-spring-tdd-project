pipeline {
  agent any
  stages {
    stage('Analysis') {
      parallel {
        stage('Analysis') {
          steps {
            sleep 5
          }
        }

        stage('Generate User Stories') {
          steps {
            sleep 5
          }
        }

        stage('Generate Acceptance Criterias') {
          steps {
            sleep 5
          }
        }

        stage('') {
          steps {
            sleep 5
          }
        }

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

        stage('AI - Functional Test') {
          steps {
            sleep 5
          }
        }

        stage('AI - Regression Tests') {
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