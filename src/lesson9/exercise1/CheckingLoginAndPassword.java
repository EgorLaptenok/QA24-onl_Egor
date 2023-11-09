package lesson9.exercise1;

public class CheckingLoginAndPassword {


    public static boolean check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Неверный логин: длина должна быть меньше 20 символов и не должен содержать пробелы");
        }
        if (password.length() > 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Неверный пароль: длина должна быть меньше 20 символов, не должен содержать пробелов и должен содержать хотя бы одну цифру");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Неверное подтверждение пароля: пароль и подтверждение пароля должны быть равны");
        }
        return true;
    }
}
