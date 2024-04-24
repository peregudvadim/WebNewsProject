<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
    <link
            href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
            rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2>Регистрация пользователя</h2>
    <form action="Controller" method="post">
        <input type="hidden" name="command" value="DO_REGISTRATION"/>
        <div class="form-group">
            <label for="username">Логин</label> <input type="text"
                                                       class="form-control" id="username" name="username" required>
        </div>
        <div class="form-group">
            <label for="password">Пароль</label> <input type="password"
                                                        class="form-control" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="name">Имя</label> <input type="text"
                                                 class="form-control" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="dob">Дата рождения</label> <input type="date"
                                                          class="form-control" id="dob" name="dob" required>
        </div>
        <div class="form-group">
            <label for="country">Страна проживания</label>
            <select
                class="form-control" id="country" name="country" required>
            <option value="">Выберите страну</option>
            <option value="Belarus">Беларусь</option>
            <option value="Russia">Россия</option>
            <option value="China">Китай</option>
            <option value="UAE">ОАЭ</option>
            <!-- Добавьте другие страны по необходимости -->
        </select>
        </div>
        <button type="submit" class="btn btn-primary">Зарегистрироваться</button>
    </form>
</div>

</body>
</html>