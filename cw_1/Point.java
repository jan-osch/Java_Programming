// Janusz Grzesik

import java.util.ArrayList;
import java.util.List;

public class Point {
    private List<Double> points;

    public Point(Object first, Object... givenPoints) {
        this.points = new ArrayList<Double>();
        this.addObject(first);
        if (givenPoints != null) {
            for (Object point : givenPoints) {
                this.addObject(point);
            }
        }
    }

    private void addObject(Object object) {
        if (object == null) {
            this.points.add(null);
        } else if (object instanceof Point) {
            addAnotherPoint((Point) object);
        } else if (object instanceof Integer) {
            this.points.add((double) ((Integer) object).intValue());
        } else {
            this.points.add((Double) object);
        }
    }

    private void addAnotherPoint(Point point) {
        point.getPoints().forEach(this::addObject);
    }

    public List<Double> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return points.toString();
    }
}
