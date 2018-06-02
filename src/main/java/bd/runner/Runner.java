package bd.runner;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
  @Autowired
  private EntityManager em;
  @Autowired
  private DataSource ds;
  @Override
  public void run(String... args) throws Exception {
  }
  
  
}
