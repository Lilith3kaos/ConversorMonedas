import java.awt.*;
import java.io.ObjectInput;
import java.lang.reflect.Array;

public record MonedaExchange(String result, String base_code, Object conversion_rates) {


    @Override
    public String toString() {
        return "Resultado: " + this.base_code+ " : " + this.conversion_rates;
    }
}
