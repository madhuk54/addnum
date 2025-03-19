pipeline {
    agent any
    environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-21"  // Update if needed
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
                bat 'javac add.java'  // ✅ Compiles Java file into the package directory
            }
        }
        stage('Run Java Program') {
            steps {
                bat "echo 5 10 | java add"  // ✅ Runs the program with input (Example: 5, 10)
            }
        }
    }
}
