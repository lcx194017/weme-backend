package cn.seu.weme.controller.old;

import cn.seu.weme.dao.UserDao;
import cn.seu.weme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by LCN on 2017-1-3.
 */
@RestController
//@RequestMapping(value = "/certification_route")
public class CertificationController {

    @Autowired
    private UserService userService;




    @RequestMapping(value = "/publishcertification", method = RequestMethod.POST)
    public Map publishCertification() {
        return null;
    }

    @RequestMapping(value = "/getallcertification", method = RequestMethod.POST)
    public Map getAllCertifications() {
        return null;
    }


    @RequestMapping(value = "/setpasscertification", method = RequestMethod.POST)
    public Map setPassCertification() {
        return null;
    }


    @RequestMapping(value = "/setnopasscertification", method = RequestMethod.POST)
    public Map setNoPassCertification() {
        return null;
    }
}
