package my.edu.tarc.buslist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Point> arrayListPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListPoint = new ArrayList<>();

        Point p1 = new Point(1, 10.0, 10.0, "Point 1", 1);
        arrayListPoint.add(p1);

        Point p2 = new Point(1, 10.0, 10.0, "Point 1", 0);
        arrayListPoint.add(p2);

        Point p3 = new Point(1, 10.0, 10.0, "Point 1", 1);
        arrayListPoint.add(p3);

        Point p4 = new Point(1, 10.0, 10.0, "Point 1", 0);
        arrayListPoint.add(p4);


        Point p5 = new Point(1, 10.0, 10.0, "Point 1", 1);
        arrayListPoint.add(p5);

        ListView listViewRoute = (ListView)findViewById(R.id.listViewRoute);
        AdapterRoute adapterRoute = new AdapterRoute(this, R.layout.route_layout, arrayListPoint);

        listViewRoute.setAdapter(adapterRoute);

    }
}
