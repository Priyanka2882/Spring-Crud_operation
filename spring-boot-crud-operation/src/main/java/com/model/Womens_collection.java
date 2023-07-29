package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
@Table
public class Womens_collection
{

@Id
@Column
private int collectionId;
@Column
private String collection_name;
@Column
private int price;
public int getcollectionId() 
{
return collectionId;
}
public void setcollectionId(int collectionId) 
{
this.collectionId = collectionId;
}
public String getcollection_name()
{
return collection_name;
}
public void setCollectionName(String CollectionName) 
{
this.collection_name = CollectionName;
}

public int getPrice() 
{
return price;
}
public void setPrice(int price) 
{
this.price = price;
}
}