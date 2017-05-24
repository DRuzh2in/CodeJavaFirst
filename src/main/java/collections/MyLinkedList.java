package collections;

/**
 * Created by vdruzhinin on 5/24/2017.
 */
public class MyLinkedList<MyObject> {
    private Note<MyObject> head;
    private int size;

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public void add(MyObject element){
        if(size == 0){
            head = new Note<MyObject>();
            head.setValue(element);
        }else{
            Note currentLink = head;
            while(currentLink.getNext() != null){
                currentLink = currentLink.getNext();
            }
            Note<MyObject> note = new Note<MyObject>();
            note.setValue(element);
            currentLink.setNext(note);
        }
        size++;
    }

    public void add(MyObject element, int position ){
        if (size == position || size == 0){
                add(element);
        } else {
            Note currentNote = head;
            for(int i = 0; i < position; i++){
                currentNote = currentNote.getNext();
            }

            Note nextNote = currentNote;
            nextNote = nextNote.getNext();

            Note<MyObject> note = new Note<MyObject>();
            note.setValue(element);
            currentNote.setNext(note);








        }
        size ++;
    }

    private class Note <MyObject>{
        private MyObject value;
        private Note next;

        public MyObject getValue(){
            return value;
        }

        public Note setValue(MyObject value){
            this.value = value;
            return this;
        }

        public Note getNext(){
            return next;
        }

        public Note setNext(Note next){
            this.next = next;
            return this;
        }

        @Override
        public String toString() {
            return "Note{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

}
