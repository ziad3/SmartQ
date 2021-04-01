package com.example.myapplication.activities.customer.ui.ticket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;

public class TicketFragment extends Fragment {

    private TicketViewModel ticketViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ticketViewModel =
                new ViewModelProvider(this).get(TicketViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ticket, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        ticketViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}