import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class fileTest {
    @Test
    public void testMethodxehoi() {
        xehoi xh = new xehoi();
        String[] xe = {"Ford", "Honda", "Toyota", "Suzuki", "Isuzu"};
assertThat(xh.sosanh(xe)).isNotEmpty()
        .hasSize(5)
        .isSorted();
    }
}

