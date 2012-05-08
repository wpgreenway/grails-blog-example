<%@ page import="com.greenway.blog.Post" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'post.label', default: 'Post')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<a href="#list-post" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                           default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="list-post" class="content" role="main">
    <h1>Entries</h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>

    <g:each in="${postInstanceList}" status="i" var="postInstance">
            <g:link action="show" id="${postInstance.id}">
                <h2>${fieldValue(bean: postInstance, field: "title")}</h2>
            </g:link>

            <div class="post">${fieldValue(bean: postInstance, field: "body")}</div>
    </g:each>

    <div class="pagination">
        <g:paginate total="${postInstanceTotal}"/>
    </div>
</div>
</body>
</html>
