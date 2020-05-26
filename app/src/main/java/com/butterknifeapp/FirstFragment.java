package com.butterknifeapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.Unbinder;

public class FirstFragment extends Fragment {

    @BindView(R.id.textview_first)
    TextView textView;
    @BindView(R.id.button_next)
    Button button;
    @BindView(R.id.button2) Button button2;
    @BindView(R.id.button3) Button button3;
    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView.setText(getString(R.string.butter_kinfe_text_one));
    }

    /*
  Button event handler using butter knife
   */
    @OnClick({R.id.button_next})
    public void firstButtonClick(){
        FirstFragmentDirections.ActionFirstFragmentToSecondFragment action =
                FirstFragmentDirections.
                        actionFirstFragmentToSecondFragment("From FirstFragment");
        NavHostFragment.findNavController(FirstFragment.this)
                .navigate(action);
    }

    /*
    Single method Event for multiple button actions
     */
    @OnClick({R.id.button2, R.id.button3})
    public void multipleButtonEvent(){
        Toast.makeText(this.getActivity(),getString(R.string.event_text), Toast.LENGTH_SHORT).show();
    }

    /*
    Long click event using butterknife
     */
    @OnLongClick({R.id.button3})
    public void longClick(){
        Toast.makeText(this.getActivity(), R.string.long_click_text, Toast.LENGTH_SHORT).show();
    }
}
