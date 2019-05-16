
package com.example.couchbasedemo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;


@Repository
interface EmployeeRepository extends CouchbaseRepository <Employee,Integer>{

}

