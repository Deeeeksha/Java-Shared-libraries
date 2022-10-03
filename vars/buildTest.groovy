def call () {
stage('Build')
        {   
                steps{
            
                        sh 'mvn clean compile'
                     }
          }

       
        stage('test')
        {
            steps
                {
                sh 'mvn test'
            }
        }
}
