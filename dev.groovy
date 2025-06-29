pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building from dev branch"
            }
        }
        stage('Test') {
            steps {
                echo "Testing from dev branch"
            }
        }
    }
}

