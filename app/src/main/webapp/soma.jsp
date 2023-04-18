<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Soma</title>
    </head>
    <body>
        <form action="/soma" method="post">
            <input type="number" name="numero"/>
            <input type="number" name="numero2"/>
            <button type="submit">Calcular</button>
        </form>
        <hr/>

        <c:forEach var="resultado" items="${resultado}">
            ${resultado} <br/>
        </c:forEach>

    </body>
</html>