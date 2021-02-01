package com.artemchep.basics_git.ui.postlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.artemchep.basics_git.R;
import com.artemchep.basics_git.domain.Post;

class PostListAdapter extends ListAdapter<Post, PostListAdapterViewHolder> {
    PostListAdapter() {
        super(new DiffUtil.ItemCallback<Post>() {
            @Override
            public boolean areItemsTheSame(@NonNull Post oldItem, @NonNull Post newItem) {
                return oldItem.equals(newItem);
            }

            @Override
            public boolean areContentsTheSame(@NonNull Post oldItem, @NonNull Post newItem) {
                return oldItem.name.equals(newItem.name);
            }
        });
    }

    @NonNull
    @Override
    public PostListAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_post, parent, false);
        return new PostListAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostListAdapterViewHolder holder, int position) {
        Post post = getItem(position);
        holder.bind(post);
    }
}
