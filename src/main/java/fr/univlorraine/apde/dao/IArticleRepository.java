package fr.univlorraine.apde.dao;

import fr.univlorraine.apde.model.Article;
import fr.univlorraine.apde.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IArticleRepository extends CrudRepository<Article, Integer> {
    Optional<Article[]> findBySeller(Integer seller);
}
