package Springinaction.tacocloud.repo;

import Springinaction.tacocloud.domain.Taco;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Elshad Jabbarov
 * 29.11.2021
 */

@Repository
public interface TacoRepository
        extends PagingAndSortingRepository<Taco, Long> {
}
