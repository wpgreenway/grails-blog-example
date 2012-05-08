package com.greenway.blog

class Post {

    String title
    String body
    String author

    static mapping = {
        body type: 'text'
    }

    static constraints = {
        title(nullable: true)
        body(nullable: true)
        author(nullable: true)
    }
}
