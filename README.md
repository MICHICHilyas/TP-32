# TP-32 : Pipeline CI/CD pour Microservices

## 📋 Description

Ce projet démontre la mise en place d'un **pipeline CI/CD complet** pour une architecture **microservices** avec Jenkins, Docker et un registry d'images.

## 📁 Structure du Projet

```
TP-32-Ilyas/
├── Jenkinsfile                 # Pipeline multi-services
├── docker-compose.yml          # Orchestration
├── server_eureka/              # Service Discovery
├── gateway/                    # API Gateway
├── client/                     # Service Client
└── car/                        # Service Voiture
```

## 📝 Jenkinsfile Multi-Services

```groovy
pipeline {
    agent any
    
    stages {
        stage('Build All Services') {
            parallel {
                stage('Eureka Server') {
                    steps {
                        dir('server_eureka') {
                            sh 'mvn clean package -DskipTests'
                        }
                    }
                }
                stage('Gateway') {
                    steps {
                        dir('gateway') {
                            sh 'mvn clean package -DskipTests'
                        }
                    }
                }
            }
        }
        
        stage('Docker Build & Push') {
            steps {
                script {
                    def services = ['server_eureka', 'gateway', 'client', 'car']
                    services.each { service ->
                        dir(service) {
                            sh "docker build -t ${service}:${BUILD_NUMBER} ."
                        }
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
}
```

## 🌐 Points d'Accès

| Service | Port |
|---------|------|
| Jenkins | 8080 |
| Eureka | 8761 |
| Gateway | 8888 |
| Client | 8081 |
| Car | 8082 |

## ✨ Fonctionnalités

- ✅ Pipeline multi-services parallèle
- ✅ Build Docker multi-stage
- ✅ Push vers registry
- ✅ Déploiement Docker Compose
- ✅ Tests automatisés

## 👨‍💻 Auteur

**Ilyas MICHICH**

---
*Travail Pratique - CI/CD Microservices*
