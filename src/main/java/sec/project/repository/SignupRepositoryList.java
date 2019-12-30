package sec.project.repository;

import sec.project.domain.Signup;
import java.util.List;

public interface SignupRepositoryList {
    
    List<Signup> findByName(String name);
    
}
