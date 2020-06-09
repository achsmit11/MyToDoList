package com.example.mytodolist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.mytodolist.database.Repository;

public class AddEditTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    Application application;
    int taskId;

    public AddEditTaskViewModelFactory(Application application, int taskId){
        this.application = application;
        this.taskId = taskId;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return  (T) new AddEditTaskViewModel(application, taskId);
    }
}