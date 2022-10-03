def login() {
    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'userName', passwordVariable: 'Password')]) {
        sh """
            docker login --username="${Username}" --password="${Password}"
        """
    }
}

def build(String tag) {
    sh """
        docker build -t "${tag}" .
    """
}

def push(String tag) {
    sh """
        docker push "${tag}"
    """
}
