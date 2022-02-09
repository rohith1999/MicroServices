pipeline {
    agent any
    tools{
        maven 'maven3'
    }
    stages{
        stage('order-service'){
            steps{
                dir("order-service/order-service"){
                bat script:'mvn clean package -X'
                }
            }
        }
        stage('product-service'){
            steps{
                dir("product-service/product-service"){
                bat script:'mvn clean package'
                }
            }
        }
    }
}
