pipeline {
    agent any
    tools {
        maven 'maven_3_9_6'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ramjay11/entwickler-automatisierung']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            step{
                script {
                    sh 'docker build -t ram11/entwickler-integration .'
                }
            }
        }
        stage('Push Image to Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u ram11 -p ${dockerhubpwd}'
}
                sh 'docker push ram11/entwickler-integration'
                }
            }
        }
    }
}