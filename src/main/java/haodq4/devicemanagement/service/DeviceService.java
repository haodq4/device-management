package haodq4.devicemanagement.service;

import haodq4.devicemanagement.model.Device;
import org.bson.types.ObjectId;

public interface DeviceService {

    Device findById(ObjectId _id);
}
