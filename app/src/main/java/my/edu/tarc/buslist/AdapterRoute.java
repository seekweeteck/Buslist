package my.edu.tarc.buslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by KweeTeck on 5/26/2016.
 */
public class AdapterRoute extends ArrayAdapter<Point> {
    public AdapterRoute(Context context, int resource, ArrayList<Point> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent ) {
        View v = convertView;
        if(v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.route_layout, null);
        }

        Point p = getItem(position);

        if(p!=null){
            ImageView imageViewPoint = (ImageView)v.findViewById(R.id.imageViewStop);
            ImageView imageViewBus = (ImageView)v.findViewById(R.id.imageViewBus);
            TextView textViewPointName = (TextView)v.findViewById(R.id.textViewPointName);

            textViewPointName.setText(p.getName());

            if(position == 0){
                imageViewPoint.setImageResource(R.mipmap.edge_first);
            }else if(position == getCount() - 1){
                imageViewPoint.setImageResource(R.mipmap.edge_last);
            }else{
                if(p.getType()==1){
                    imageViewPoint.setImageResource(R.mipmap.bus_stop);
                }else{
                    imageViewPoint.setImageResource(R.mipmap.middle);
                }
            }
        }
        return v;
    }
}
