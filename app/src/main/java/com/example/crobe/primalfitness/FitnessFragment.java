package com.example.crobe.primalfitness;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FitnessFragment extends Fragment implements View.OnClickListener {


    public static String planType;

    public FitnessFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_plan_fitness, container, false);

        TextView calisthetics = view.findViewById(R.id.calisthetics);
        calisthetics.setOnClickListener(this);
        TextView cardio = view.findViewById(R.id.cardio);
        cardio.setOnClickListener(this);
        TextView weights = view.findViewById(R.id.weights);
        weights.setOnClickListener(this);
        TextView newPlan = view.findViewById(R.id.createPlan);
        newPlan.setOnClickListener(this);

        if (!LoginActivity.loggedInUserType.equals("Coach")) {
            newPlan.setVisibility(View.GONE);
        }

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calisthetics:
                planType = "Calisthetics";
                startActivity(new Intent(getActivity(), FitnessPlans.class));
                break;
            case R.id.cardio:
                planType = "Cardio";
                startActivity(new Intent(getActivity(), FitnessPlans.class));
                break;
            case R.id.weights:
                planType = "Weights";
                startActivity(new Intent(getActivity(), FitnessPlans.class));
                break;
            case R.id.createPlan:
                startActivity(new Intent(getActivity(), FitnessCreationActivity.class));
                break;
        }
    }
}
