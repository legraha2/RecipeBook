package edu.illinois.cs.cs125.recipebook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.MyViewHolder> {

private List<RecipeBuilder>
        recipeList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView title, content;

    public MyViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.title);
        content = (TextView) view.findViewById(R.id.content);

    }
}

    public RecipeAdapter(List<RecipeBuilder> recipeList) {
        this.recipeList = recipeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RecipeBuilder note = recipeList.get(position);
        holder.title.setText(note.getTitle());
        holder.content.setText(note.getContent());
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }
}