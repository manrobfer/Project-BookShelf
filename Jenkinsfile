pipeline {
agent any
      tools {
            maven 'MAVEN_LOCAL'
            jdk 'JDK_LOCAL'
          }
       stages{
           stage('Limpada e constroi') {
               steps{
                   sh  'mvn clean package -DskipTests=true'
               }
           }
          stage('Executa testes') {
              steps{
                  sh  'mvn test'
              }
          }
          stage('Analise Sonnar') {
              environment{
                    scannerHome = tool 'SONAR_SCANNER_LOCAL'
              }
             steps{
               withSonarQubeEnv('SONAR_LOCAL') {
                 sh  "${scannerHome}/bin/sonar-scanner -e  -Dsonar.projectKey=BookShelf-Deployer -Dsonar.host.url=http://localhost:9000 -Dsonar.login=squ_f51d7dc87f3d47a8d38bf84c3006fcf5b54eac16  -Dsonar.java.binaries=target "
               }
              }
          }
       }
}