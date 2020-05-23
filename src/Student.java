//импорт класса ArrayList
import java.util.ArrayList;

class Student {
  
  private static int count = 0;//количество студентов
  private int id;//номер студента
  private final String name;//имя студента
  private ArrayList<Course> courses = new ArrayList<>();//список предметов
  
  //конструктор класса
  public Student(String name) {
    this.id = ++count;//увеличиваем количество на 1, задаём номер студента
    this.name = name;//задаём имя студента
  }
  
  //метод возврата номера студента
  public int getId() {
    return this.id;
  }
  
  //метод возврата имени студента
  public String getName() {
    return name;
  }
  
  //метод добавления предмета изучения
  public void addCourse(Course course) {
    courses.add(course);
  }
  
  //метод получения списка изучаемых предметов
  public ArrayList<Course> getCourses() {
    return courses;
  }
  
}
