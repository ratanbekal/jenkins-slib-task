def call(String name = "TextInsideSlib-Text2") {
    script {
        sh """
            echo ZCZC ${name}
        """
    }
}
