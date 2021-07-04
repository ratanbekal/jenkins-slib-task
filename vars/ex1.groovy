def call(String name = "Slib-Text2") {
    script {
        sh """
            echo Test Text ${name}
        """
    }
}
