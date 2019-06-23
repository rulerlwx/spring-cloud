package com.demo.service;

import com.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by lwx on 2019/6/22.
 */
@Service
public class UserService {
    @Autowired
    private LoadBalancerClient loadBalancerClient;//ribbon负载均衡器

    public List<User> listUsers() {
        //选择调用的服务名称
        //ServiceInstance封装了服务的IP、端口
        ServiceInstance si = this.loadBalancerClient.choose("eureka-provider");

        //拼接服务的路径，http://localhost:9090/user/listUsers
        StringBuffer sb = new StringBuffer();
        sb.append("http://").append(si.getHost()).append(":").append(si.getPort())
                .append("/user/listUsers");

        RestTemplate rt = new RestTemplate();
        ParameterizedTypeReference<List<User>> type = new ParameterizedTypeReference<List<User>>() {
        };
        ResponseEntity<List<User>> response =
                rt.exchange(sb.toString(), HttpMethod.GET, null, type);
        List<User> userList = response.getBody();
        return userList;
    }
}
