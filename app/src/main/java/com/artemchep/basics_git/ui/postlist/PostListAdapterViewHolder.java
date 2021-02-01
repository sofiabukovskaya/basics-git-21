package com.artemchep.basics_git.ui.postlist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.artemchep.basics_git.domain.Post;

class PostListAdapterViewHolder extends RecyclerView.ViewHolder {
    private TextView mTitle;

    PostListAdapterViewHolder(@NonNull View itemView) {
        super(itemView);
        mTitle = (TextView) itemView;
    }

    void bind(@NonNull Post post) {
        mTitle.setText(post.name);
    }
}
