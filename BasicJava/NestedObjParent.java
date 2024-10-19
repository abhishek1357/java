package BasicJava;


import lombok.Data;

@Data
public class NestedObjParent {
    private NestedObjChild nestedObjChild;
    private String name;

    private Integer id;
}
