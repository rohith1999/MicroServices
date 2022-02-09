pipeline {
    agent any
    tools{
        maven 'maven3'
    }
    stages{
        stage('order-service'){
            steps{
                dir("order-service/order-service"){
                bat script:'mvn clean package -DskipTests'
                }
            }
        }
        stage('product-service'){
            steps{
                dir("product-service/product-service"){
                bat script:'mvn clean package -DskipTests'
                }
            }
        }
       
         stage('api-gateway-service'){
            steps{
                dir("api-gateway-service/api-gateway-service"){
                bat script:'mvn clean package -DskipTests'
                }
            }
        }
        stage('configuration-server'){
            steps{
                dir("configuration-server/configuration-server"){
                bat script:'mvn clean package -DskipTests'
                }
            }
        }
        stage('discovery-server'){
            steps{
                dir("discovery-server/discovery-server"){
                bat script:'mvn clean package -DskipTests'
                }
            }
        }
    }
}
