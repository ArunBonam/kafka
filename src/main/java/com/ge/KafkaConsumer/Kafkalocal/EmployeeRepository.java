
package com.ge.KafkaConsumer.Kafkalocal;

import com.ge.KafkaConsumer.Kafkalocal.domain.WorkUnit;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;


@Repository
interface CouchRepository extends CouchbaseRepository <WorkUnit,Integer>{

}

