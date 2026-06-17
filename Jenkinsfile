pipeline {

    agent any

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