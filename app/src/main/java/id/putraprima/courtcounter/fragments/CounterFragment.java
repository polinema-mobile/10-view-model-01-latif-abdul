package id.putraprima.courtcounter.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.putraprima.courtcounter.R;
import id.putraprima.courtcounter.databinding.FragmentCounterBinding;
import id.putraprima.courtcounter.viewmodels.CounterViewModels;

public class CounterFragment extends Fragment {

    public CounterViewModels mViewModels;

    public CounterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentCounterBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_counter, container, false);
        mViewModels = new ViewModelProvider(this).get(CounterViewModels.class);

        binding.setCounterViewModel(mViewModels);
        //home

        binding.btnThreePointHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModels.score.setHomeScore(mViewModels.score.getHomeScore()+3);
                Log.d("Home Score :", String.valueOf(mViewModels.score.getHomeScore()));
                binding.txtScoreHome.setText(Integer.toString(mViewModels.score.getHomeScore()));
            }
        });

        binding.btnTwoPointHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModels.score.setHomeScore(mViewModels.score.getHomeScore()+2);
                Log.d("Home Score :", String.valueOf(mViewModels.score.getHomeScore()));
                binding.txtScoreHome.setText(Integer.toString(mViewModels.score.getHomeScore()));
            }
        });

        binding.btnFreeThrowHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModels.score.setHomeScore(mViewModels.score.getHomeScore()+1);
                Log.d("Home Score :", String.valueOf(mViewModels.score.getHomeScore()));
                binding.txtScoreHome.setText(Integer.toString(mViewModels.score.getHomeScore()));
            }
        });

        //away
        binding.btnFreeThrowAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModels.score.setAwayScore(mViewModels.score.getAwayScore()+1);
                Log.d("Away Score :", String.valueOf(mViewModels.score.getAwayScore()));
                binding.txtScoreAway.setText(Integer.toString(mViewModels.score.getAwayScore()));
            }
        });

        binding.btnTwoPointAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModels.score.setAwayScore(mViewModels.score.getAwayScore()+2);
                Log.d("Away Score :", String.valueOf(mViewModels.score.getAwayScore()));
                binding.txtScoreAway.setText(Integer.toString(mViewModels.score.getAwayScore()));
            }
        });

        binding.btnThreePointAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModels.score.setAwayScore(mViewModels.score.getAwayScore()+3);
                Log.d("Away Score :", String.valueOf(mViewModels.score.getAwayScore()));
                binding.txtScoreAway.setText(Integer.toString(mViewModels.score.getAwayScore()));
            }
        });

        binding.btnResetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModels.score.setAwayScore(0);
                mViewModels.score.setHomeScore(0);
                binding.txtScoreAway.setText(Integer.toString(mViewModels.score.getAwayScore()));
                binding.txtScoreHome.setText(Integer.toString(mViewModels.score.getHomeScore()));
            }
        });

        return binding.getRoot();
    }
}