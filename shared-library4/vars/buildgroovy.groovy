def call() {
    sh '''
       cd $WORKSPACE
       mvn clean install
       docker build -t abdelhaqelattar2002/java-mvn-app:v1.0.0 .
    '''
}

