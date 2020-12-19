package masterIL.spring.auction.aunctionSpring.controller;

import masterIL.spring.auction.aunctionSpring.dao.IArticleRepository;
import masterIL.spring.auction.aunctionSpring.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ArticleController {

    @Autowired
    private IArticleRepository dao;

    @GetMapping(value = "articles")
    public Iterable<Article> findAll(){
        return dao.findAll();
    }

    @GetMapping(value = "article/{id}")
    public Optional<Article> getArticleById(@PathVariable Integer id){
        return dao.findById(id);
    }

    @GetMapping(value = "existArticle/{id}")
    public boolean existArticleById(@PathVariable Integer id){return dao.existsById(id);}

    @GetMapping(value = "countArticle")
    public long count(){return dao.count();}

    @PostMapping(value = "addArticle")
    public void addArticle(@RequestBody Article article){
        dao.save(article);
    }

    @DeleteMapping(value = "deleteArticleByArticle")
    public void deleteArticleByArticle(@RequestBody Article article){ dao.delete(article);}

    @DeleteMapping(value = "deleteArticleById/{id}")
    public void deleteArticleById(@PathVariable Integer id){ dao.deleteById(id);}


}