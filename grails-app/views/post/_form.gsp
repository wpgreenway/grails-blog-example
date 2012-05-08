<%@ page import="com.greenway.blog.Post" %>



<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'title', 'error')} ">
    <label for="title">
        <g:message code="post.title.label" default="Title"/>

    </label>
    <g:textField name="title" value="${postInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'body', 'error')} ">
    <label for="body">
        <g:message code="post.body.label" default="Body"/>

    </label>
    <g:textArea rows="20" cols="40" name="body" value="${postInstance?.body}"/>
</div>

