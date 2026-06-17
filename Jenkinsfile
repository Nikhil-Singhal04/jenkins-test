pipeline {

    agent any
    tools {
        maven 'Maven 3'
    }

    stages {

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {

        failure {
            mail to:'nikhilsinghal2019@gmail.com',
                    subject:'Selenium Test Failed',
                    body:'Please check Jenkins'
        }
    }
}