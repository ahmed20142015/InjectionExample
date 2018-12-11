package com.example.aelashry.injectionexample.model.di.component;

import android.app.Application;
import android.content.Context;

import com.example.aelashry.injectionexample.DemoApplication;
import com.example.aelashry.injectionexample.data.DataManager;
import com.example.aelashry.injectionexample.data.DbHelper;
import com.example.aelashry.injectionexample.model.di.ApplicationContext;
import com.example.aelashry.injectionexample.model.di.modules.ApplicationModule;
import com.example.aelashry.injectionexample.sharedPreference.SharedPrefsHelper;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
