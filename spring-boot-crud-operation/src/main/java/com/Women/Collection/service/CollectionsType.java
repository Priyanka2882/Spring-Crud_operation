package com.Women.Collection.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Womens_collection;
import com.repository.WomenCollectionRepository;
//defining the business logic
@Service
public class CollectionsType 
{
@Autowired
WomenCollectionRepository collectionsRepository;

public List<Womens_collection> getAllCollections() 
{
List<Womens_collection> Collection = new ArrayList<Womens_collection>();
collectionsRepository.findAll().forEach(Collection1 -> Collection.add(Collection1));
return Collection;
}

public Womens_collection getCollectionById(int id) 
{
return collectionsRepository.findById(id).get();
}

public void saveOrUpdate(Womens_collection Collection) 
{
	collectionsRepository.save(Collection);
}

public void delete(int id) 
{
	collectionsRepository.deleteById(id);
}
//updating a record
public void update(Womens_collection Collection, int CollectionId) 
{
	collectionsRepository.save(CollectionId);
}
}