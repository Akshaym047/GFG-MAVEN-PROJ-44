pipeline
{
	agent any
		tools
		{
			maven 'MAVEN_HOME'
		}
		stages
		{
			stage('Welcome Stage')
			{
				steps
				{
					echo 'Welcome to Pipeline'
				}
			}
			
			stage('Clean Stage')
			{
				steps
				{
					bat 'mvn clean'
				}
				Steps
				{
        			ansiColor('xterm')
				{
          			sh 'mvn test -Dstyle.color=always'
        		}
			}
			stage('Test Stage')
			{
				steps
				{
					bat 'mvn test'
				}
			}
			stage('Build Stage')
			{
				steps
				{
					bat 'mvn install'
				}
			}
			stage('Build Success')
			{
				steps
				{
					echo 'Build Success'
				}
			}	

			stage('Final Success')
			{
				steps
				{
					echo 'Final Success'
				}
			}	
			stage('Super after Final Success')
			{
				steps
				{
					echo 'Super Final Success'
				}
			}

		}
}
