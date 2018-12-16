package com.dazzle;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.dazzle.bean.User;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class FastJsonLearner {

    /** 
    * @Description: 对象序列化 
    * @Param: [object] 
    * @return: java.lang.String 
    * @Author: Li Jiahui
    * @Date: 2018/12/15 
    */ 
   public static String objectToJsonString(Object object){
      String json= JSON.toJSONString(object);
      return json;
   }

   /** 
   * @Description: 对象序列化json bytes 
   * @Param: [object] 
   * @return: byte[] 
   * @Author: Li Jiahui
   * @Date: 2018/12/15 
   */ 
   public static byte[] objectToJsonBytes(Object object){
      byte[] bytes=JSON.toJSONBytes(object);
      return bytes;
   }

   /** 
   * @Description: json 反序列化为对象
   * @Param: [json] 
   * @return: com.dazzle.bean.User 
   * @Author: Li Jiahui
   * @Date: 2018/12/15 
   */ 
   public static User jsonToObject(String json){
      Type type=new TypeReference<User>(){}.getType();
      User user=JSON.parseObject(json,type);

      return user;
   }

   /** 
   * @Description: main 
   * @Param: [args] 
   * @return: void 
   * @Author: Li Jiahui
   * @Date: 2018/12/15 
   */ 
   public static void main(String args[]){
      User user=new User();
      user.setAddress("公主岭");
      user.setAge(23);
      user.setId(38385438);
      user.setName("阿叼");
      user.setPhoto("派大星");
      user.setRelations(new ArrayList<String>());

      System.out.println(objectToJsonString(user));
      String json=objectToJsonString(user);

      User user1=jsonToObject(json);
      System.out.println(user1.getAddress());




   }











}
