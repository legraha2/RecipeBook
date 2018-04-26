package edu.illinois.cs.cs125.recipebook;

public class RecipeBuilder {

    private String title,
            content;

    public RecipeBuilder(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}