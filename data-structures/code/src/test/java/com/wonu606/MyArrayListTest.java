package com.wonu606;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayListTest {

    List<Integer> myList;
    final int SIZE = 100;

    @BeforeEach
    void setUp() {
        myList = new MyArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            myList.add(i);
        }
    }

    @AfterEach
    void tearDown() {
        myList.clear();
    }

    @Test
    void size() {
        assertThat(myList.size()).isEqualTo(SIZE);

        myList.add(1);
        assertThat(myList.size()).isEqualTo(SIZE + 1);

        myList.remove(new Integer(-1));
        assertThat(myList.size()).isEqualTo(SIZE + 1);

        myList.remove(new Integer(0));
        assertThat(myList.size()).isEqualTo(SIZE);
    }

    @Test
    void isEmpty() {
        assertThat(myList.isEmpty()).isFalse();

        myList.clear();
        assertThat(myList.isEmpty()).isTrue();
    }

    @Test
    void contains() {
        for (int i = 0; i < SIZE; i++) {
            assertThat(myList.contains(i)).isTrue();
        }

        myList.clear();
        for (int i = 0; i < SIZE; i++) {
            assertThat(myList.contains(i)).isFalse();
        }
    }

    @Test
    void iterator() {
        Iterator<Integer> iterator = myList.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            assertThat(myList.get(index)).isEqualTo(iterator.next());
            index++;
        }
    }

    @Test
    void toArray() {
        Object[] array = myList.toArray();
        assertThat(array.length).isEqualTo(myList.size());

        for (int i = 0; i < array.length; i++) {
            assertThat(array[i]).isEqualTo(myList.get(i));
        }
    }

    @Test
    void add() {
        Integer addElement = new Integer(1000);
        myList.add(addElement);
        assertThat(myList.contains(addElement));

        Integer insertElement = new Integer(2000);
        int insertIndex = 50;
        myList.add(insertIndex, insertElement);
        assertThat(myList.get(insertIndex)).isEqualTo(insertElement);
    }

    @Test
    void remove() {
        int removeIndex = 0;
        Integer removedElement = myList.get(removeIndex);
        myList.remove(removeIndex);
        assertThat(myList).doesNotContain(removedElement);

        Integer removeElement = myList.get(0);
        myList.remove(removeElement);
        assertThat(myList).doesNotContain(removeElement);

        assertThat(myList.size()).isEqualTo(SIZE - 2);
    }

    @Test
    void containsAll() {
        for (int i = 0; i < SIZE; i++) {
            assertThat(myList.contains(new Integer(i))).isTrue();
        }

        myList.clear();
        for (int i = 0; i < SIZE; i++) {
            assertThat(myList.contains(new Integer(i))).isFalse();
        }
    }

    @Test
    void addAll() {
        List<Integer> list = new ArrayList<>();
        list.add(1234);
        list.add(1234);

        myList.addAll(list);
        for (Integer element : list) {
            assertThat(myList.contains(element)).isTrue();
        }
        assertThat(myList.size()).isEqualTo(SIZE + list.size());
    }

    @Test
    void removeAll() {
        assertThat(myList.isEmpty()).isFalse();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
        myList.removeAll(list);
        assertThat(myList.isEmpty()).isTrue();
    }

    @Test
    void clear() {
        assertThat(myList.isEmpty()).isFalse();

        myList.clear();
        assertThat(myList.isEmpty()).isTrue();
    }

    @Test
    void get() {
        int index1 = 30;
        assertThat(myList.get(index1)).isEqualTo(index1);

        int index2 = 60;
        assertThat(myList.get(index2)).isEqualTo(index2);
    }

    @Test
    void set() {
        int index = 30;
        assertThat(myList.get(index)).isEqualTo(index);

        int setNumber = 60;
        myList.set(index, setNumber);
        assertThat(myList.get(index)).isEqualTo(setNumber);
    }

    @Test
    void indexOf() {
        assertThat(myList.indexOf(null)).isEqualTo(-1);

        int target = 30;
        assertThat(myList.indexOf(target)).isEqualTo(target);
    }

    @Test
    void lastIndexOf() {
        int duplicateNumber = 30;
        assertThat(myList.lastIndexOf(duplicateNumber)).isEqualTo(duplicateNumber);

        myList.add(duplicateNumber);
        assertThat(myList.lastIndexOf(duplicateNumber)).isEqualTo(myList.size() - 1);
    }

    @Test
    void listIterator() {
        List<Integer> list = new ArrayList<>(myList);

        ListIterator<Integer> myListIterator1 = myList.listIterator();
        ListIterator<Integer> listListIterator1 = list.listIterator();
        while (myListIterator1.hasNext()) {
            assertThat(myListIterator1.next()).isEqualTo(listListIterator1.next());
        }
        assertThat(listListIterator1.hasNext()).isFalse();

        int index = 30;
        ListIterator<Integer> myListIterator2 = myList.listIterator(index);
        ListIterator<Integer> listListIterator2 = list.listIterator(index);
        while (myListIterator2.hasNext()) {
            assertThat(myListIterator2.next()).isEqualTo(listListIterator2.next());
        }
        assertThat(listListIterator2.hasNext()).isFalse();
    }

    @Test
    void subList() {
        int from = 30;
        int to = 60;

        List<Integer> mySubList = myList.subList(from, to);
        List<Integer> list = new ArrayList<>(myList);
        List<Integer> listSubList = list.subList(from, to);

        assertThat(mySubList.size()).isEqualTo(listSubList.size());
        for (int i = 0; i < mySubList.size(); i++) {
            assertThat(mySubList.get(i)).isEqualTo(listSubList.get(i));
        }
    }
}