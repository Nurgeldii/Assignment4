package factory;

import java.util.Locale;

public class TypeFactory {

    public Type getType(String type) {
        return switch (type.toLowerCase ( Locale.ROOT )) {
            case "android" -> new Android ();
            case "apple" -> new Apple ();
            default -> new Huawei ();
        };
    }
}
