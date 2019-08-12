package com.artemchep.basics_git.database;

import androidx.annotation.NonNull;

import com.artemchep.basics_git.domain.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Store implementation that does absolutely
 * nothing.
 */
public class StoreStub implements Store {
    @Override
    public void insert(@NonNull Post post) {
    }

    @NonNull
    @Override
    public List<Post> select() {
        return new ArrayList<>();
    }
}
