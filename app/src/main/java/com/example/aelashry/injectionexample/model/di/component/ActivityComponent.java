package com.example.aelashry.injectionexample.model.di.component;

import com.example.aelashry.injectionexample.MainActivity;
import com.example.aelashry.injectionexample.model.di.PerActivity;
import com.example.aelashry.injectionexample.model.di.modules.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
