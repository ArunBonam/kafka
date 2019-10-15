
package com.getest.KafkaConsumer.Kafkalocal;

import com.getest.KafkaConsumer.Kafkalocal.domain.WorkUnit;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;


@Repository
interface CouchRepository extends CouchbaseRepository <WorkUnit,Integer>{

}

