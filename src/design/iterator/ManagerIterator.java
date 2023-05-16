package design.iterator;

import java.util.Iterator;

public class ManagerIterator implements Iterator<Member> {

    private Manager manager;
    private int index = 0;

    public ManagerIterator(Manager manager) {
        this.manager = manager;
    }

    @Override
    public boolean hasNext() {
        return index < manager.getLength();
    }

    @Override
    public Member next() {
        Member member = manager.getMember(index);
        index++;
        return member;
    }
}
