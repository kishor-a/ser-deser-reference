import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Person {

    private String name;
    private String address;
    private List<Map<String, Features>> features;
}
@Data
class Features{
    private String type;
    private String value;
}
