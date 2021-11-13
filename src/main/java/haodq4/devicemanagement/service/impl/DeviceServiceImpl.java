package haodq4.devicemanagement.service.impl;

import haodq4.devicemanagement.model.Device;
import haodq4.devicemanagement.repository.DeviceRepository;
import haodq4.devicemanagement.service.DeviceService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;
    @Override
    public Device findById(ObjectId _id) {
        return deviceRepository.findBy_id(_id);
    }
}
