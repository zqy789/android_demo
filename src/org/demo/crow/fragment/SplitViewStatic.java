package org.demo.crow.fragment;

import org.demo.crow.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SplitViewStatic extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fm_fragment_split_view_static, container, false);
		
		return view;
	}
}
