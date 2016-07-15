package com.cronosgroup.core.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;


/**
 * Common functionalities for fragments.
 * Handles life cycle of presenters.
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
