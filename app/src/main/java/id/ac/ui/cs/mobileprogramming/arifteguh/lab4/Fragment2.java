package id.ac.ui.cs.mobileprogramming.arifteguh.lab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class Fragment2 extends Fragment {
    private SharedViewModel viewModel;
    private TextView editText;

    public Fragment2(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);
        editText = v.findViewById(R.id.edit_text);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        viewModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        viewModel.getText().observe(getViewLifecycleOwner(), new Observer<CharSequence>() {
            @Override
            public void onChanged(CharSequence charSequence) {
                editText.setText(charSequence);
            }
        });
    }
}
