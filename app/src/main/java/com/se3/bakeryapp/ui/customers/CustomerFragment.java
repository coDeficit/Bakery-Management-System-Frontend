package com.se3.bakeryapp.ui.customers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.se3.bakeryapp.databinding.FragmentCustomerBinding;

class CustomerFragment extends Fragment {

    private FragmentCustomerBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CustomerViewModel customerViewModel =
                new ViewModelProvider(this).get(CustomerViewModel.class);

        binding = FragmentCustomerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCustomers;
        customerViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}