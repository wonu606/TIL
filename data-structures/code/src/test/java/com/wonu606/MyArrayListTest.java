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

    MyArrayList<Integer> myArrayList = new MyArrayList<>();
    final int SIZE = 100;

    @BeforeEach
    void setUp() {
        for (int i = 0; i < SIZE; i++) {
            myArrayList.add(i);
        }
    }

    @AfterEach
    void tearDown() {
        myArrayList.clear();
    }

    @Test
    void size() {
        assertThat(myArrayList.size()).isEqualTo(SIZE);

        myArrayList.add(1);
        assertThat(myArrayList.size()).isEqualTo(SIZE + 1);

        myArrayList.remove(new Integer(-1));
        assertThat(myArrayList.size()).isEqualTo(SIZE + 1);

        myArrayList.remove(new Integer(0));
        assertThat(myArrayList.size()).isEqualTo(SIZE);
    }

    @Test
    void isEmpty() {
        assertThat(myArrayList.isEmpty()).isFalse();

        myArrayList.clear();
        assertThat(myArrayList.isEmpty()).isTrue();
    }

    @Test
    void contains() {
        for (int i = 0; i < SIZE; i++) {
            assertThat(myArrayList.contains(i)).isTrue();
        }

        myArrayList.clear();
        for (int i = 0; i < SIZE; i++) {
            assertThat(myArrayList.contains(i)).isFalse();
        }
    }

    @Test
    void iterator() {
        Iterator<Integer> iterator = myArrayList.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            assertThat(myArrayList.get(index)).isEqualTo(iterator.next());
            index++;
        }
    }

    @Test
    void toArray() {
        Object[] array = myArrayList.toArray();
        assertThat(array.length).isEqualTo(myArrayList.size());

        for (int i = 0; i < array.length; i++) {
            assertThat(array[i]).isEqualTo(myArrayList.get(i));
        }
    }

    @Test
    void add() {
        Integer addElement = new Integer(1000);
        myArrayList.add(addElement);
        assertThat(myArrayList.contains(addElement));

        Integer insertElement = new Integer(2000);
        int insertIndex = 50;
        myArrayList.add(insertIndex, insertElement);
        assertThat(myArrayList.get(insertIndex)).isEqualTo(insertElement);
    }

    @Test
    void remove() {
        int removeIndex = 0;
        Integer removedElement = myArrayList.get(removeIndex);
        myArrayList.remove(removeIndex);
        assertThat(myArrayList).doesNotContain(removedElement);

        Integer removeElement = myArrayList.get(0);
        myArrayList.remove(removeElement);
        assertThat(myArrayList).doesNotContain(removeElement);

        assertThat(myArrayList.size()).isEqualTo(SIZE - 2);
    }

    @Test
    void containsAll() {
        for (int i = 0; i < SIZE; i++) {
            assertThat(myArrayList.contains(new Integer(i))).isTrue();
        }

        myArrayList.clear();
        for (int i = 0; i < SIZE; i++) {
            assertThat(myArrayList.contains(new Integer(i))).isFalse();
        }
    }

    @Test
    void addAll() {
        List<Integer> list = new ArrayList<>();
        list.add(1234);
        list.add(1234);

        myArrayList.addAll(list);
        for (Integer element : list) {
            assertThat(myArrayList.contains(element)).isTrue();
        }
        assertThat(myArrayList.size()).isEqualTo(SIZE + list.size());
    }

    @Test
    void removeAll() {
        assertThat(myArrayList.isEmpty()).isFalse();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
        myArrayList.removeAll(list);
        assertThat(myArrayList.isEmpty()).isTrue();
    }

    @Test
    void clear() {
        assertThat(myArrayList.isEmpty()).isFalse();

        myArrayList.clear();
        assertThat(myArrayList.isEmpty()).isTrue();
    }

    @Test
    void get() {
        int index1 = 30;
        assertThat(myArrayList.get(index1)).isEqualTo(index1);

        int index2 = 60;
        assertThat(myArrayList.get(index2)).isEqualTo(index2);
    }

    @Test
    void set() {
        int index = 30;
        assertThat(myArrayList.get(index)).isEqualTo(index);

        int setNumber = 60;
        myArrayList.set(index, setNumber);
        assertThat(myArrayList.get(index)).isEqualTo(setNumber);
    }

    @Test
    void indexOf() {
        assertThat(myArrayList.indexOf(null)).isEqualTo(-1);

        int target = 30;
        assertThat(myArrayList.indexOf(target)).isEqualTo(target);
    }

    @Test
    void lastIndexOf() {
        int duplicateNumber = 30;
        assertThat(myArrayList.lastIndexOf(duplicateNumber)).isEqualTo(duplicateNumber);

        myArrayList.add(duplicateNumber);
        assertThat(myArrayList.lastIndexOf(duplicateNumber)).isEqualTo(myArrayList.size() - 1);
    }

    @Test
    void listIterator() {
        List<Integer> list = new ArrayList<>(myArrayList);

        ListIterator<Integer> myListIterator1 = myArrayList.listIterator();
        ListIterator<Integer> listListIterator1 = list.listIterator();
        while (myListIterator1.hasNext()) {
            assertThat(myListIterator1.next()).isEqualTo(listListIterator1.next());
        }
        assertThat(listListIterator1.hasNext()).isFalse();

        int index = 30;
        ListIterator<Integer> myListIterator2 = myArrayList.listIterator(index);
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

        List<Integer> mySubList = myArrayList.subList(from, to);
        List<Integer> list = new ArrayList<>(myArrayList);
        List<Integer> listSubList = list.subList(from, to);

        assertThat(mySubList.size()).isEqualTo(listSubList.size());
        for (int i = 0; i < mySubList.size(); i++) {
            assertThat(mySubList.get(i)).isEqualTo(listSubList.get(i));
        }
    }
}