package haodq4.devicemanagement.controller;

import haodq4.devicemanagement.model.Device;
import haodq4.devicemanagement.service.DeviceService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Device getContactById(@PathVariable("id") ObjectId id) {
        return deviceService.findById(id);
    }

}
