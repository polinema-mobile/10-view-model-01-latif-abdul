package id.putraprima.courtcounter.viewmodels;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import id.putraprima.courtcounter.models.Score;

public class CounterViewModels extends ViewModel {

    public Score score = new Score(0,0);

    public void addPointHome(int point){
        score.setHomeScore(score.getHomeScore()+point);
        Log.d("Point Home : ", String.valueOf(score.getHomeScore()));
    }

    public void addPointAway(int point){
        score.setAwayScore(score.getAwayScore()+point);
        Log.d("Point Away : ", String.valueOf(score.getAwayScore()));
    }
}
