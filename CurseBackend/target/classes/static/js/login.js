(function () {
    var screen_authorization;
    var screen_registration;

    var main_authorization_reg_button;
    var registration_back_btn;


    window.onload = function () {
        screen_authorization = document.getElementById("main-authorization");
        screen_registration = document.getElementById("registration");

        main_authorization_reg_button = document.getElementById("main-authorization-reg-button");
        registration_back_btn = document.getElementById("registration-back-btn");


        screen_authorization.style.display = "block";
        screen_registration.style.display = "none";

        main_authorization_reg_button.onclick = function () {
            screen_authorization.style.display = "none";
            screen_registration.style.display = "block";
        }

        registration_back_btn.onclick = function () {
            screen_authorization.style.display = "block";
            screen_registration.style.display = "none";
        }
    }



})();

$(function () {
    $('#registration-user-btn').click(function () {
        var data = $('#registration form').serialize();
        var url;
        $.ajax({
            method: "POST",
            url: "registration",
            data: data,
            error: function () {
                alert("Пользователь с таким логином уже существует!")
            }
        });
    });


})