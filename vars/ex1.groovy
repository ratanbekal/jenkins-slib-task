def call(String name = "TextInsideSlib") {
    script {
        sh """
            echo ZCZC ${name}
        """
    }
}
