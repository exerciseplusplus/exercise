package com.example.exercise;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RegisterFragment extends Fragment{

    private View mParent;  
    private FragmentActivity mActivity;
	
	Button runButton;
	Button updownButton;
    /**
     * Create a new instance of DetailsFragment, initialized to show the text at
     * 'index'.
     */
    public static RegisterFragment newInstance(int index) {
        RegisterFragment f = new RegisterFragment();
        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }

    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_register, container,
				false);

		return view;
	}
    
    public void onActivityCreated(Bundle savedInstanceState) {  
        super.onActivityCreated(savedInstanceState);  
        
        mActivity = getActivity();  
        mParent = getView(); 
		runButton = (Button)mParent.findViewById(R.id.button_register_run);
		updownButton = (Button)mParent.findViewById(R.id.button_register_updown);
		runButton.setOnClickListener(runListener);
		updownButton.setOnClickListener(updownListener);
       
    }
    OnClickListener runListener = new OnClickListener()
    {
    	public void onClick(View arg0) {
    		Log.d("Register","Hello");
			Intent intent =new Intent(mActivity,RunActivity.class);
			startActivity(intent);
    		
    	
    	}
    };

    OnClickListener updownListener = new OnClickListener()
    {
    	public void onClick(View arg0) {
    		Log.d("Register","World");
    	
    	}
    };

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
