pipeline {
    agent any
    stages {
        stage('Clone from GitHub') {
            steps {
                git branch: 'main', url: 'https://github.com/madhuk54/addnum.git',,credentialsId:"token"
            }
        }
        stage('Compile Java') {
            steps {
                bat 'dir'  // To check if `add.java` exists
                bat 'javac add.java'
            }
        }
        stage('Run Java Program') {
            steps {
                bat 'java add'
            }
        }
    }
}

