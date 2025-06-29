pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building from main branch"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying from main branch"
            }
        }
    }
}

