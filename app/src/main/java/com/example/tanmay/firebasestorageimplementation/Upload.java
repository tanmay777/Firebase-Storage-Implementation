package com.example.tanmay.firebasestorageimplementation;

/**
 * Created by tanmay on 2/6/17.
 */

public class Upload {

    public String name;
    public String url;

    public Upload(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Upload()
    {

    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
