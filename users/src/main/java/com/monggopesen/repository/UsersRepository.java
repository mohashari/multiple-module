package com.monggopesen.repository;

import com.monggopesen.domain.Users;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CassandraRepository<Users,String> {

}
