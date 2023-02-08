package com.example.demo;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

//import javax.inject.provider;//out side spring library
import java.util.ServiceLoader;

@Service
public class SingletonService {

   /* @Autowired
    PrototypeService service;
*/
   /* //1 application Context
    @Autowired
    private ApplicationContext applicationContext;

    public String getMethod() {
        return applicationContext.getBean((PrototypeService.class)).getDateTime(); //1 approach
    }

    // 2 loop approach spring override this method and will retrun proxy instance
*/
    @Lookup
    public  PrototypeService prototypeService(){
        return null;
    }
    public String getMethod() {
        //return prototypeService().getDateTime(); //2 approach
        return serviceProvider.getObject().getDateTime(); //2 approach
    }

    @Autowired
    private ObjectFactory<PrototypeService> serviceProvider;// 4th approach

}
