package com.ji.behavioral_patterns.iterator.after;

import com.ji.behavioral_patterns.iterator.before.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content){
        this.posts.add(new Post(content));}

    public Iterator<Post> getRecentPostIterator(){
        return new RecentPostIterator(this.posts);}
}
