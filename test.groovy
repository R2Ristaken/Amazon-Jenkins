pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building from test branch"
            }
        }
        stage('QA') {
            steps {
                echo "Running QA from test branch"
            }
        }
    }
}

