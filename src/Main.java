public class Main {
    public static void main(String[] args) {
//        Задача № 1
        System.out.println();
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = " Ivanov";
        String fullName = " IVANOV IVAN IVANOVICH";
        System.out.println(" ФИО сотрудника -" + lastName + firstName + middleName);
        System.out.println();
//        задача № 2
        String tolowerFullName = fullName.toLowerCase();
        System.out.println(" Данные ФИО для заполнения сотрудника -  " + tolowerFullName);
//        Задача № 3
        System.out.println();
        String fullNameRus = "Иванов Семён Семёнович ";
        fullNameRus = fullNameRus.replace("ё", "е");
        System.out.println(" Данные ФИО сотрудника " + fullNameRus);
    }
}