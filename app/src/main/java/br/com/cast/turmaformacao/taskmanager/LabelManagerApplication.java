package br.com.cast.turmaformacao.taskmanager;


import android.app.Application;

import br.com.cast.turmaformacao.taskmanager.util.ApplicationUtil;

public class LabelManagerApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationUtil.setContext(getApplicationContext());
    }
}
