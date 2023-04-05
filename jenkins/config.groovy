// Pipeline Configuration Properties
// Import this file into the pipeline using 'load'.
class config {

  // Wait timeout in minutes
  public static final int WAIT_TIMEOUT = 40

  // Deployment configuration
  public static final String[] DEPLOYMENT_ENVIRONMENT_TAGS = ['dev', 'test', 'prod']
  public static final String DEV_ENV = "${DEPLOYMENT_ENVIRONMENT_TAGS[0]}"
  public static final String TEST_ENV = "${DEPLOYMENT_ENVIRONMENT_TAGS[1]}"
  public static final String PROD_ENV = "${DEPLOYMENT_ENVIRONMENT_TAGS[2]}"
  public static final String APP_LABEL = "bc-wallet-demo"

  // The name of the project namespace(s).
  public static final String  NAME_SPACE = 'a99fd4'

  // Instance Suffix
  public static final String  SUFFIX = ''

  // Apps - Listed in the order they should be tagged
  // Do not deploy schema-spy into prod
  public static final String[] COMPONENTS = ['bc-wallet-demo-web', 'bc-wallet-demo-server']
  
  // Build configuration
  public static final String[] BUILDS = ['bc-wallet-demo-web', 'bc-wallet-demo-server']
  
}

return new config();