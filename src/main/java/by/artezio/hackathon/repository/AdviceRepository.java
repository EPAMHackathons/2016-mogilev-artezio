package by.artezio.hackathon.repository;

import by.artezio.hackathon.model.Advice;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author ntishkevich
 * @version 19.03.2016
 */
public interface AdviceRepository extends JpaRepository<Advice, Long>, JpaSpecificationExecutor<Advice> {

    List<Advice> findByEmotion(String emotion);
}
