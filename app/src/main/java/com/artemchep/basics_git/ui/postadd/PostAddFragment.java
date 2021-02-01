package com.artemchep.basics_git.ui.postadd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.artemchep.basics_git.App;
import com.artemchep.basics_git.R;
import com.artemchep.basics_git.database.Store;
import com.artemchep.basics_git.domain.Post;

public class PostAddFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_post_add, container, false);
    }

    @Override
    public void onViewCreated(final @NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view
                .findViewById(R.id.save)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        save();
                    }
                });
    }

    private void save() {
        final EditText textView = getView().findViewById(R.id.text);
        final String text = textView.getText().toString();
        if (text.length() == 0) {
            return;
        }

        final Store store = App.getStore(requireContext());
        store.insert(new Post(text));

        // TODO: Pop the "Post add" fragment
    }
}
