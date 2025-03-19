pipeline {
    agent any
    environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-21"  
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }
    stages {
        stage('Clone from GitHub') {
            steps {
                git branch: 'main', url: 'https://github.com/madhuk54/jenkins.git'
            }
        }
        stage('Compile Java') {
            steps {
                bat 'javac -d . addnum/Add.java'  
            }
        }
        stage('Run Java Program') {
            steps {
                bat "echo 5 10 | java addnum.Add"  
            }
        }
    }
}
