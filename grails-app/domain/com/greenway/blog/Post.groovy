package com.greenway.blog

class Post {

    String title
    String body

    static mapping = {
        body type: 'text'
    }

    static constraints = {
        title(nullable: true)
        body(nullable: true)
    }
}
