package id.putraprima.courtcounter.viewmodels;

import androidx.lifecycle.ViewModel;

import id.putraprima.courtcounter.models.Score;

public class CounterViewModels extends ViewModel {
    public Score score = new Score(0,0);
}
