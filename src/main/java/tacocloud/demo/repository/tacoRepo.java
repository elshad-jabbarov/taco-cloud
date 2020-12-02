package tacocloud.demo.repository;

import org.springframework.data.repository.CrudRepository;
import tacocloud.demo.entity.Taco;

public interface tacoRepo  extends CrudRepository<Taco,Long> {
}
