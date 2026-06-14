package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class SortedLists {

    enum KeyAbsentBehavior {
        NEXT_LOWER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            int resultIndex(int i10) {
                return i10 - 1;
            }
        },
        NEXT_HIGHER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i10) {
                return i10;
            }
        },
        INVERTED_INSERTION_INDEX { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i10) {
                return ~i10;
            }
        };

        abstract int resultIndex(int i10);
    }

    enum KeyPresentBehavior {
        ANY_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            int resultIndex(Comparator comparator, Object obj, List list, int i10) {
                return i10;
            }
        },
        LAST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            int resultIndex(Comparator comparator, Object obj, List list, int i10) {
                int size = list.size() - 1;
                while (i10 < size) {
                    int i11 = ((i10 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i11), obj) > 0) {
                        size = i11 - 1;
                    } else {
                        i10 = i11;
                    }
                }
                return i10;
            }
        },
        FIRST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            int resultIndex(Comparator comparator, Object obj, List list, int i10) {
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = (i11 + i10) >>> 1;
                    if (comparator.compare(list.get(i12), obj) < 0) {
                        i11 = i12 + 1;
                    } else {
                        i10 = i12;
                    }
                }
                return i11;
            }
        },
        FIRST_AFTER { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e10, List<? extends E> list, int i10) {
                return KeyPresentBehavior.LAST_PRESENT.resultIndex(comparator, e10, list, i10) + 1;
            }
        },
        LAST_BEFORE { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @ParametricNullness E e10, List<? extends E> list, int i10) {
                return KeyPresentBehavior.FIRST_PRESENT.resultIndex(comparator, e10, list, i10) - 1;
            }
        };

        abstract int resultIndex(Comparator comparator, Object obj, List list, int i10);
    }

    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e10, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(e10);
        return binarySearch(list, e10, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, Function<? super E, K> function, K k10, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(k10);
        return binarySearch(list, function, k10, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E, K> int binarySearch(List<E> list, Function<? super E, K> function, @ParametricNullness K k10, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return binarySearch((List<? extends K>) Lists.transform(list, function), k10, comparator, keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E> int binarySearch(List<? extends E> list, @ParametricNullness E e10, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(keyPresentBehavior);
        Preconditions.checkNotNull(keyAbsentBehavior);
        if (!(list instanceof RandomAccess)) {
            list = new ArrayList(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iCompare = comparator.compare(e10, list.get(i11));
            if (iCompare < 0) {
                size = i11 - 1;
            } else {
                if (iCompare <= 0) {
                    return i10 + keyPresentBehavior.resultIndex(comparator, e10, list.subList(i10, size + 1), i11 - i10);
                }
                i10 = i11 + 1;
            }
        }
        return keyAbsentBehavior.resultIndex(i10);
    }
}
