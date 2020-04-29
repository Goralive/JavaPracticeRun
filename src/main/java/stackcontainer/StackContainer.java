package stackcontainer;

public class StackContainer<T> {
    private BlackList blackList = null;
    Object data;
    StackContainer previousElement;

    public StackContainer() {
        super();
    }

    public StackContainer(BlackList blackList) {
        super();
        this.blackList = blackList;
    }

    public StackContainer push(Object obj) {
        if (this.data != null) {
            return new StackContainer();
        } else {
            this.data = obj;
        }
        // проверить this.data != null
        // true -> создает новый Stask и в previousElement - засовывает this элемент
        // false -> this.data = obj
        return this;
    }

    public StackContainer pop() {

        // условие: удалять объекты других классов, только в вершину стека!!!
        // просто должен вернуть previousElement
        return previousElement;
    }

    public Object peek() {
        // чтение твоей даты this.data
        return this.data;
    }
}
