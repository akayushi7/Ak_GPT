package AkGPT.Ak_GPT.repository;



import AkGPT.Ak_GPT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}