package ecommerce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerce.demo.model.CurrentUserSession;

@Repository
public interface SessionDao extends JpaRepository<CurrentUserSession, Integer> {

    public  CurrentUserSession  findByUuid(String uuid);
}
