package pl.lodz.p.adach;

public class App {

  public static void main(String[] args) {

    User user = new User("Szymon", 1L);
    User test2 = User.builder().name("test2").id(2L).build();

    System.out.println(user.equals(test2));
    System.out.println(user);
    System.out.println(test2);
  }
}
