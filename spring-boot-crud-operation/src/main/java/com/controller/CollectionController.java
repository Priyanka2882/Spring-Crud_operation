package com.controller;
import java.util.List;

import javax.swing.plaf.synth.ColorType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Women.Collection.service.CollectionsType;
import com.model.Womens_collection;
//mark class as Controller
@RestController
public class CollectionController 
{

@Autowired
CollectionsType services;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/collection")
private List<Womens_collection> getAllCollections() 
{
return services.getAllCollections();
}

@GetMapping("/Collection/{CollectionId}")
private Womens_collection getCollection(@PathVariable("CollectionId") int CollectionId) 
{
return services.getCollectionById(CollectionId);
}

@DeleteMapping("/Collection/{CollectionId}")
private void deleteBCollection(@PathVariable("CollectionId") int CollectionId) 
{
services.delete(CollectionId);
}

@PostMapping("/Collection")
private int saveCollection(@RequestBody Womens_collection Collection) 
{
services.saveOrUpdate(Collection);
return Collection.getcollectionId();
}

@PutMapping("/Collection")
private Womens_collection update(@RequestBody Womens_collection Collection) 
{
services.saveOrUpdate(Collection);
return Collection;
}
}
