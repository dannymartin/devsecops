void call(){	
	node{
		stage("Maven: Build"){
			git url: 'https://github.com/dannymartin/sample-springboot'
			
//			withMaven(maven: 'maven-3', mavenSettingsConfig: 'my-maven-settings') {
 				// Run the maven build
      				sh "mvn clean package"
  //  			}	
		}	
	}
}
