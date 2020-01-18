import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void should_1_inch_equals_1_inch() {
        Length result = new Length(1, "inch").as(Unit.INCH);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is("inch"));
    }

    @Test
    public void should_2_feet_equals_2_feet() {
        Length result = new Length(2, "f").as(Unit.FOOT);

        assertThat(result.getValue(), is(2.0));
        assertThat(result.getUnit(), is("f"));
    }

    @Test
    public void should_1_yard_equals_1_yard() {
        Length result = new Length(1, "yard").as(Unit.YARD);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is("yard"));
    }

    @Test
    public void should_1_foot_equals_12_inches() {
        Length result = new Length(1, "f").as(Unit.INCH);

        assertThat(result.getValue(), is(12.0));
        assertThat(result.getUnit(), is("inch"));
    }

    @Test
    public void should_3_foot_equals_1_yard() {
        Length result = new Length(3, "f").as(Unit.YARD);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is("yard"));
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        Length result = new Length(1, "yard").as(Unit.FOOT);

        assertThat(result.getValue(), is(3.0));
        assertThat(result.getUnit(), is("f"));
    }

    @Test
    public void should_1_yard_equals_36_inches() {
        Length result = new Length(1, "yard").as(Unit.INCH);

        assertThat(result.getValue(), is(36.0));
        assertThat(result.getUnit(), is("inch"));
    }

    @Test
    public void should_2_yards_equals_72_inches() {
        Length result = new Length(2, "yard").as(Unit.INCH);

        assertThat(result.getValue(), is(72.0));
        assertThat(result.getUnit(), is("inch"));
    }

    @Test
    public void should_12_inches_equals_1_foot() {
        Length result = new Length(12, "inch").as(Unit.FOOT);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is("f"));
    }

    @Test
    public void should_36_inches_equals_1_yard() {
        Length result = new Length(36, "inch").as(Unit.YARD);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is("yard"));
    }

    @Test
    public void should_18_inches_equals_half_yard() {
        Length result = new Length(18, "inch").as(Unit.YARD);

        assertThat(result.getValue(), is(0.5));
        assertThat(result.getUnit(), is("yard"));
    }
}
