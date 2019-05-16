
package com.example.couchbasedemo;
import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document

public class Employee {

    @Id
    private int id;
    @Field
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public Employee(int id, String name)
    {
        super();
        this.id =id;
        this.name= name;
    }

    public Employee(){}
}

