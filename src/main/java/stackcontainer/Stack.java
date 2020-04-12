package stackcontainer;

public class Stack <T> {
    private BlackList blackList = null;
    Object data;
    Stack previousElement;

    public Stack() {
        super();
    }

    public Stack(BlackList blackList) {
        super();
        this.blackList = blackList;
    }

//  public Stack push(Object obj) {

//      // проверить this.data != null
//      // true -> создает новый Stask и в previousElement - засовывает this элемент
//      // false -> this.data = obj
//      return this;
//  }

//  public Stack pop () {
//      // условие: удалять объекты других классов, только в вершину стека!!!
//      // просто должен вернуть previousElement
//      return this;
//  }

//  public Object peek () {
//      // чтение твоей даты this.data
//      return new Object();
//  }

}
