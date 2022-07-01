package com.Utils;

//making CustomDAOInterface a generic with the "<T>"
//Generics are different types or placeholders that you can make an
public interface CustomDAOInterface<T> {
    //CRUD = Create Read Update Delete
    //All basic functionality that we should be able to do when storing data

    //here we are returning an Integer and create method takes in parameter t of type T
    Integer create(T t);

    //here we have a return of type T and expecting a parameter id of type Integer
    T read(Integer id);

    //return type of T and in-taking parameter t of type T
    T update(T t);

    boolean delete(Integer id);
}
