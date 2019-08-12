package com.artemchep.basics_git.database;

import androidx.annotation.NonNull;

import com.artemchep.basics_git.domain.Post;

import java.util.List;

public interface Store {
    void insert(@NonNull Post post);

    @NonNull
    List<Post> select();
}
