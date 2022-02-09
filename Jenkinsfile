pipeline {
    agent any
    tools{
        maven 'maven3'
    }
    stages{
        stage('order-service'){
            steps{
                dir("order-service/order-service"){
                sh script:'mvn clean package'
                }
            }
        }
        stage('product-service'){
            steps{
                dir("/product-service/product-service"){
                sh script:'mvn clean package'
                }
            }
        }
    }
}
