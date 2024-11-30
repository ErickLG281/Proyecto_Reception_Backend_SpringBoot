pipeline {
    agent any

    environment {
        SPRING_PROFILES_ACTIVE = 'prod'
    }

    stages {
        stage('Clonar Repositorio') {
            steps {
                git 'https://github.com/ErickLG281/Proyecto_Reception_Backend_SpringBoot.git'
            }
        }
        stage('Compilar y Construir') {
            steps {
                script {

                    bat 'mvnw clean package -DskipTests'

                }
            }
        }
        stage('Pruebas') {
            steps {
                script {
                    // Ejecutamos las pruebas
                    bat 'mvnw test'

                }
            }
        }
        stage('Construir Docker Image') {
            steps {
                script {
                    // Construimos la imagen Docker
                    bat 'docker build -t poshpicks_backend .'
                }
            }
        }
        stage('Desplegar') {
            steps {
                script {
                    // Desplegamos la aplicación
                    bat 'docker run -d -p 8081:8081 poshpicks_backend'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline ejecutado correctamente!'
        }
        failure {
            echo 'Hubo un error en la ejecución del pipeline.'
        }
    }
}
