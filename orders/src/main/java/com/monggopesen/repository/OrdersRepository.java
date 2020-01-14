package com.monggopesen.repository;

import com.monggopesen.domain.Orders;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CassandraRepository<Orders, String> {

}
