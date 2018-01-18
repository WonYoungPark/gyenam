pipeline {
  agent any
  stages {
    stage('Source Download') {
      steps {
        git(url: 'https://github.com/WonYoungPark/gyenam.git', branch: 'master', poll: true, credentialsId: '*', changelog: true)
      }
    }
    stage('') {
      steps {
        echo '1010101010'
      }
    }
  }
}