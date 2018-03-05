package my.com.tm.idecomm;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class CabinetType extends Fragment implements ListView.OnItemClickListener {

    private ProgressDialog loading;

    private ListView listView;
    EditText editext;
    Button btnsearch;


    View myView;
    private String JSON_STRING;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_cabinet_type, container, false);


        listView = (ListView) myView.findViewById(R.id.list);
//        listView.setOnItemClickListener(this);


        return myView;

    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//    Intent intent = new Intent(getActivity(), ListFaultRate.class);
//    HashMap<String,String> map =(HashMap)parent.getItemAtPosition(position);
//    String empId = map.get(Config.TAG_TM).toString();
//    intent.putExtra(Config.EMP_ID,empId);
//    startActivity(intent);
    }


}
