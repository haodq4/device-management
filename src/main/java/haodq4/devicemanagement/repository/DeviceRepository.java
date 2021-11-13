package haodq4.devicemanagement.repository;

import haodq4.devicemanagement.model.Device;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends MongoRepository<Device, String> {

    Device findBy_id(ObjectId _id);
}
