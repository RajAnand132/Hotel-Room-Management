package com.projectRaj.Room.APP.repo;

import com.projectRaj.Room.APP.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRoomRepo extends CrudRepository<Room,Integer> {
}
