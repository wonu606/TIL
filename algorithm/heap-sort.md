# 힙 정렬(heap-sort)

## 원리(logic)
힙 정렬은 완전 이진 트리 구조를 사용하고, 우선순위 큐를 관리하는 구조라고 불리기도 한다.   
한번 정렬이 이루어지면 최대힙일 경우 root는 최댓값, 최소힙일 경우 root는 최솟값을 보장한다.(O(logN) 소요)
1. root가 child보다 항상 극값이므로 제외하고, 다른 child들을 root로 올려두어 정렬을 한다.
2. 총 N번 반복하면 정렬된 배열이 된다.

## 장점
- 추가 메모리를 사용하지 않는다.(in-place)
- 항상 같은 시간이 걸린다.O(NlongN)

## 단점
- 최댓값 또는 최솟값은 보장하지만 나머지 순서는 보장하지 못한다.   
- 퀵 정렬 또는 병합 정렬처럼 O(NlogN)이지만 비교적 느린 경향이 있다.  
  이유는, 만약 배열이 정렬되어 있더라도 배열이 정렬된 채 정렬하는 것이 아니라서 그렇다.   
- 또한, 안정(stable)하지도 않기 때문에 일반적인 정렬에서는 쓰이지 않는다.   

## 쓰임
- 극값을 이용할 때
- 우선순위 큐를 구현할 때

## 간단한 예제
```java
public class HeapSort {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        HeapSort heapSort = new HeapSort();
        // 오름차순 정렬
        heapSort.sort(array);

        printArray(array);
    }

    private void sort(int[] array) {
        int arraySize = array.length;

        /*
         힙 생성
         1/2만 하는 이유는 나머지 1/2는 leaf 노드이기 때문이다.
         */
        for (int i = arraySize / 2 - 1; i >= 0; i--) {
            heapify(array, arraySize, i);
        }

        // 최댓값은 제외하고 제일 큰 값을 찾는다.
        for (int i = arraySize - 1; i >= 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array, int heapSize, int rootIndex) {
        int largestElementIndex = rootIndex;
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;

        if (leftChildIndex < heapSize && array[leftChildIndex] > array[largestElementIndex]) {
            largestElementIndex = leftChildIndex;
        }

        if (rightChildIndex < heapSize && array[rightChildIndex] > array[largestElementIndex]) {
            largestElementIndex = rightChildIndex;
        }

        if (largestElementIndex != rootIndex) {
            swap(array, rootIndex, largestElementIndex);

            // leaf 방향으로 내려가면 힙화
            heapify(array, heapSize, largestElementIndex);
        }
    }


    private void swap(int[] array, int swapIndex1, int swapIndex2) {
        int temp = array[swapIndex1];
        array[swapIndex1] = array[swapIndex2];
        array[swapIndex2] = temp;
    }

    static void printArray(int[] array) {
        Arrays.stream(array)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}

```
