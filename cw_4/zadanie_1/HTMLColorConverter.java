import java.awt.*;
import java.io.InputStream;
import java.util.Map;

public class HTMLColorConverter {

    private Map<String, Color> namedColors;
    private ColorStandard colorStandard;

    public HTMLColorConverter(ColorStandard colorStandard) {
        this.colorStandard = colorStandard;
        this.initializeNamedColors();
    }

    private void initializeNamedColors() {
        this.namedColors.put("black", this.colorFromHex("#000000"));
        this.namedColors.put("maroon", this.colorFromHex("#800000"));
        this.namedColors.put("black", this.colorFromHex("#000000"));
        this.namedColors.put("black", this.colorFromHex("#000000"));
        this.namedColors.put("black", this.colorFromHex("#000000"));
        this.namedColors.put("black", this.colorFromHex("#000000"));
        this.namedColors.put("black", this.colorFromHex("#000000"));
        this.namedColors.put("black", this.colorFromHex("#000000"));
        this.namedColors.put("black", this.colorFromHex("#000000"));
    }

    private Color colorFromHex(String hexValue) {
        return new Color(Integer.valueOf(hexValue.substring(1, 2), 16),
                Integer.valueOf(hexValue.substring(3, 4), 16),
                Integer.valueOf(hexValue.substring(5, 6), 16));
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("8F", 16));
    }

    public void convert(InputStream inputStream) {

    }
}
