package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Group;
import kz.aitu.advancedJava.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {
    @Query(value = "select * from group where id = 2", nativeQuery = true)
    Group getGroup();
    List<Group> findAllByGroupId(long group_id);

}
