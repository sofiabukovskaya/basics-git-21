package com.artemchep.basics_git;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;

import com.artemchep.basics_git.database.Store;
import com.artemchep.basics_git.database.StoreStub;

public class App extends Application {
    private Store mStore;

    @Override
    public void onCreate() {
        super.onCreate();
        mStore = new StoreStub();
    }

    public static Store getStore(@NonNull Context context) {
        return ((App) context.getApplicationContext()).mStore;
    }
}
