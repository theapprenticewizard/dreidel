package io.dreidel.dreidel.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import static io.dreidel.dreidel.model.Face.*;

public class Spin {

    private final Face face;

    @Min(0)
    @Max(3)
    Spin(int faceValue) {
        switch (faceValue) {
            case 0:
                face = NUN;
                break;
            case 1:
                face = GIMEL;
                break;
            case 2:
                face = HEI;
                break;
            default:
                face = SHIN;
                break;
        }
    }

    public Face getFace() {
        return this.face;
    }

    public String getCharacter() {
        switch (face) {
            case NUN:
                return "נ\u200E";
            case GIMEL:
                return "ג\u200E";
            case HEI:
                return "ה";
            default:
                return "ש\u200E";
        }
    }

    public String getName() {
        return face.name().toLowerCase();
    }

    public String getRule() {
        switch (face) {
            case NUN:
                return "do nothing";
            case GIMEL:
                return "add one gelt to the pot";
            case HEI:
                return "collect half of the pot";
            default:
                return "collect the whole pot!";
        }
    }
}
