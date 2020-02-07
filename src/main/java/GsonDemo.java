import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GsonDemo {

    public static void main(String[] args) {

        Gson gson = new Gson();
        Person person = new Person();
        person.setName("Kishor");
        person.setAddress("Pune");

        Map<String, Features> feature1 = new HashMap<>();
        Features features1=new Features();
        features1.setType("type1");
        features1.setValue("value1");

        Features features2=new Features();
        features2.setType("type1");
        features2.setValue("value1");

        feature1.put("abc",features1);
        feature1.put("pqr",features2);
        person.setFeatures(Collections.singletonList(feature1));
        String personJson = gson.toJson(person);
        System.out.println(personJson);
    }
}
