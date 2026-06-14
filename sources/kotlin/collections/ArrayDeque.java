package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.f.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 c*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001cB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0083\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0083\b¢\u0006\u0004\b\u0010\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001e\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#J\u001f\u0010'\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010#J\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u0007J\u000f\u0010)\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00028\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010,J\u000f\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b/\u0010,J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00028\u0000¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00028\u0000¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00028\u0000¢\u0006\u0004\b4\u0010,J\u000f\u00105\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b5\u0010,J\r\u00106\u001a\u00028\u0000¢\u0006\u0004\b6\u0010,J\u000f\u00107\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b7\u0010,J\u0017\u00108\u001a\u00020\u001c2\u0006\u00100\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u00109J\u001f\u00108\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u00100\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010:J\u001d\u0010;\u001a\u00020\u001c2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b;\u0010<J%\u0010;\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b;\u0010=J\u0018\u0010>\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b>\u0010\u0012J \u0010?\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u00100\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020\u001c2\u0006\u00100\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bA\u00109J\u0017\u0010B\u001a\u00020\u00032\u0006\u00100\u001a\u00028\u0000H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00032\u0006\u00100\u001a\u00028\u0000H\u0016¢\u0006\u0004\bD\u0010CJ\u0017\u0010E\u001a\u00020\u001c2\u0006\u00100\u001a\u00028\u0000H\u0016¢\u0006\u0004\bE\u00109J\u0017\u0010F\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\bF\u0010\u0012J\u001d\u0010G\u001a\u00020\u001c2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\bG\u0010<J\u001d\u0010H\u001a\u00020\u001c2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\bH\u0010<J\u000f\u0010I\u001a\u00020\fH\u0016¢\u0006\u0004\bI\u0010\u0007J)\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010K\"\u0004\b\u0001\u0010J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010KH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0KH\u0016¢\u0006\u0004\bM\u0010PJ\u001f\u0010Q\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0014¢\u0006\u0004\bQ\u0010#J)\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00010K\"\u0004\b\u0001\u0010J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010KH\u0000¢\u0006\u0004\bR\u0010NJ\u0017\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0KH\u0000¢\u0006\u0004\bR\u0010PJ\u001f\u0010U\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0004\bT\u0010#J1\u0010Z\u001a\u00020\f2 \u0010W\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010O0K\u0012\u0004\u0012\u00020\f0VH\u0000¢\u0006\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001e\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010`\u001a\u00020\u00032\u0006\u0010_\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lkotlin/collections/ArrayDeque;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "", "initialCapacity", "<init>", "(I)V", "()V", "", "elements", "(Ljava/util/Collection;)V", "minCapacity", "", "ensureCapacity", "newCapacity", "copyElements", "internalIndex", "internalGet", "(I)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "positiveMod", "(I)I", "negativeMod", "incremented", "decremented", "copyCollectionElements", "(ILjava/util/Collection;)V", "Lkotlin/Function1;", "", "predicate", "filterInPlace", "(Lkotlin/jvm/functions/Function1;)Z", "fromIndex", "toIndex", "removeRangeShiftPreceding", "(II)V", "removeRangeShiftSucceeding", "internalFromIndex", "internalToIndex", "nullifyNonEmpty", "registerModification", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "testToArray$kotlin_stdlib", "testToArray", "testRemoveRange$kotlin_stdlib", "testRemoveRange", "Lkotlin/Function2;", "structure", "internalStructure$kotlin_stdlib", "(Lkotlin/jvm/functions/Function2;)V", "internalStructure", "head", "I", "elementData", "[Ljava/lang/Object;", "value", "size", "getSize", "()I", y.f66058y, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;

    @NotNull
    private Object[] elementData;
    private int head;
    private int size;

    @NotNull
    private static final Object[] emptyElementData = new Object[0];

    public ArrayDeque(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = emptyElementData;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.elementData = objArr;
    }

    private final void copyCollectionElements(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i10 = this.head;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.elementData[i11] = it.next();
        }
        this.size = size() + elements.size();
    }

    private final void copyElements(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i10 = this.head;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, length - i10, 0, i10);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int index) {
        return index == 0 ? ArraysKt___ArraysKt.getLastIndex(this.elementData) : index - 1;
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[kotlin.ranges.g.e(minCapacity, 10)];
        } else {
            copyElements(AbstractList.INSTANCE.newCapacity$kotlin_stdlib(objArr.length, minCapacity));
        }
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> predicate) {
        int iPositiveMod;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i10 = this.head;
            if (i10 < iPositiveMod2) {
                iPositiveMod = i10;
                while (i10 < iPositiveMod2) {
                    Object obj = this.elementData[i10];
                    if (predicate.invoke(obj).booleanValue()) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (predicate.invoke(obj2).booleanValue()) {
                        this.elementData[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iPositiveMod = positiveMod(i11);
                for (int i12 = 0; i12 < iPositiveMod2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (predicate.invoke(obj3).booleanValue()) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z10;
    }

    private final int incremented(int index) {
        if (index == ArraysKt___ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    private final E internalGet(int internalIndex) {
        return (E) this.elementData[internalIndex];
    }

    private final int internalIndex(int index) {
        return positiveMod(this.head + index);
    }

    private final int negativeMod(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    private final void nullifyNonEmpty(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, internalFromIndex, internalToIndex);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, internalFromIndex, objArr.length);
        ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, 0, internalToIndex);
    }

    private final int positiveMod(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    private final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    private final void removeRangeShiftPreceding(int fromIndex, int toIndex) {
        int iPositiveMod = positiveMod(this.head + (fromIndex - 1));
        int iPositiveMod2 = positiveMod(this.head + (toIndex - 1));
        while (fromIndex > 0) {
            int i10 = iPositiveMod + 1;
            int iMin = Math.min(fromIndex, Math.min(i10, iPositiveMod2 + 1));
            Object[] objArr = this.elementData;
            int i11 = iPositiveMod2 - iMin;
            int i12 = iPositiveMod - iMin;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i11 + 1, i12 + 1, i10);
            iPositiveMod = negativeMod(i12);
            iPositiveMod2 = negativeMod(i11);
            fromIndex -= iMin;
        }
    }

    private final void removeRangeShiftSucceeding(int fromIndex, int toIndex) {
        int iPositiveMod = positiveMod(this.head + toIndex);
        int iPositiveMod2 = positiveMod(this.head + fromIndex);
        int size = size();
        while (true) {
            size -= toIndex;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            toIndex = Math.min(size, Math.min(objArr.length - iPositiveMod, objArr.length - iPositiveMod2));
            Object[] objArr2 = this.elementData;
            int i10 = iPositiveMod + toIndex;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, iPositiveMod2, iPositiveMod, i10);
            iPositiveMod = positiveMod(i10);
            iPositiveMod2 = positiveMod(iPositiveMod2 + toIndex);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E element) {
        registerModification();
        ensureCapacity(size() + 1);
        int iDecremented = decremented(this.head);
        this.head = iDecremented;
        this.elementData[iDecremented] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = element;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        return (E) this.elementData[positiveMod(this.head + index)];
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int getLength() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i10;
        int iPositiveMod = positiveMod(this.head + size());
        int length = this.head;
        if (length < iPositiveMod) {
            while (length < iPositiveMod) {
                if (Intrinsics.areEqual(element, this.elementData[length])) {
                    i10 = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iPositiveMod) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iPositiveMod; i11++) {
                    if (Intrinsics.areEqual(element, this.elementData[i11])) {
                        length = i11 + this.elementData.length;
                        i10 = this.head;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(element, this.elementData[length])) {
                i10 = this.head;
                break;
            }
            length++;
        }
        return length - i10;
    }

    public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> structure) {
        int i10;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i10 = this.head) < positiveMod(this.head + size())) ? this.head : i10 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int lastIndex;
        int i10;
        int iPositiveMod = positiveMod(this.head + size());
        int i11 = this.head;
        if (i11 < iPositiveMod) {
            lastIndex = iPositiveMod - 1;
            if (i11 <= lastIndex) {
                while (!Intrinsics.areEqual(element, this.elementData[lastIndex])) {
                    if (lastIndex != i11) {
                        lastIndex--;
                    }
                }
                i10 = this.head;
                return lastIndex - i10;
            }
            return -1;
        }
        if (i11 > iPositiveMod) {
            int i12 = iPositiveMod - 1;
            while (true) {
                if (-1 >= i12) {
                    lastIndex = ArraysKt___ArraysKt.getLastIndex(this.elementData);
                    int i13 = this.head;
                    if (i13 <= lastIndex) {
                        while (!Intrinsics.areEqual(element, this.elementData[lastIndex])) {
                            if (lastIndex != i13) {
                                lastIndex--;
                            }
                        }
                        i10 = this.head;
                    }
                } else {
                    if (Intrinsics.areEqual(element, this.elementData[i12])) {
                        lastIndex = i12 + this.elementData.length;
                        i10 = this.head;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Nullable
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i10 = this.head;
            if (i10 < iPositiveMod2) {
                iPositiveMod = i10;
                while (i10 < iPositiveMod2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.elementData[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iPositiveMod = positiveMod(i11);
                for (int i12 = 0; i12 < iPositiveMod2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        if (index == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + index);
        E e10 = (E) this.elementData[iPositiveMod];
        if (index < (size() >> 1)) {
            int i10 = this.head;
            if (iPositiveMod >= i10) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i10 + 1, i10, iPositiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, 1, 0, iPositiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i11 = this.head;
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i11 + 1, i11, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i12 = this.head;
            objArr4[i12] = null;
            this.head = incremented(i12);
        } else {
            int iPositiveMod2 = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
            if (iPositiveMod <= iPositiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, iPositiveMod, iPositiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, 1, iPositiveMod2 + 1);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size = size() - 1;
        return e10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        Object[] objArr = this.elementData;
        int i10 = this.head;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.head = incremented(i10);
        this.size = size() - 1;
        return e10;
    }

    @Nullable
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.size = size() - 1;
        return e10;
    }

    @Nullable
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size());
        int i10 = toIndex - fromIndex;
        if (i10 == 0) {
            return;
        }
        if (i10 == size()) {
            clear();
            return;
        }
        if (i10 == 1) {
            remove(fromIndex);
            return;
        }
        registerModification();
        if (fromIndex < size() - toIndex) {
            removeRangeShiftPreceding(fromIndex, toIndex);
            int iPositiveMod = positiveMod(this.head + i10);
            nullifyNonEmpty(this.head, iPositiveMod);
            this.head = iPositiveMod;
        } else {
            removeRangeShiftSucceeding(fromIndex, toIndex);
            int iPositiveMod2 = positiveMod(this.head + size());
            nullifyNonEmpty(negativeMod(iPositiveMod2 - i10), iPositiveMod2);
        }
        this.size = size() - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i10 = this.head;
            if (i10 < iPositiveMod2) {
                iPositiveMod = i10;
                while (i10 < iPositiveMod2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iPositiveMod = positiveMod(i11);
                for (int i12 = 0; i12 < iPositiveMod2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        int iPositiveMod = positiveMod(this.head + index);
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = element;
        return e10;
    }

    public final void testRemoveRange$kotlin_stdlib(int fromIndex, int toIndex) {
        removeRange(fromIndex, toIndex);
    }

    @NotNull
    public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(array, size());
        }
        T[] tArr = array;
        int iPositiveMod = positiveMod(this.head + size());
        int i10 = this.head;
        if (i10 < iPositiveMod) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.elementData, tArr, 0, i10, iPositiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, tArr, objArr2.length - this.head, 0, iPositiveMod);
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size(), tArr);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        registerModification();
        ensureCapacity(size() + 1);
        int iPositiveMod = positiveMod(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int iDecremented = decremented(iPositiveMod);
            int iDecremented2 = decremented(this.head);
            int i10 = this.head;
            if (iDecremented >= i10) {
                Object[] objArr = this.elementData;
                objArr[iDecremented2] = objArr[i10];
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i10, i10 + 1, iDecremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i10 - 1, i10, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, 1, iDecremented + 1);
            }
            this.elementData[iDecremented] = element;
            this.head = iDecremented2;
        } else {
            int iPositiveMod2 = positiveMod(this.head + size());
            if (iPositiveMod < iPositiveMod2) {
                Object[] objArr4 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, iPositiveMod + 1, iPositiveMod, iPositiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, 1, 0, iPositiveMod2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, iPositiveMod + 1, iPositiveMod, objArr6.length - 1);
            }
            this.elementData[iPositiveMod] = element;
        }
        this.size = size() + 1;
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        int iPositiveMod = positiveMod(this.head + size());
        int iPositiveMod2 = positiveMod(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i10 = this.head;
            int length = i10 - size;
            if (iPositiveMod2 < i10) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, length, i10, objArr.length);
                if (size >= iPositiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iPositiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, 0, size, iPositiveMod2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, length, i10, iPositiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i11 = iPositiveMod2 - i10;
                int length2 = objArr6.length - length;
                if (length2 >= i11) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, length, i10, iPositiveMod2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, length, i10, i10 + length2);
                    Object[] objArr7 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, this.head + length2, iPositiveMod2);
                }
            }
            this.head = length;
            copyCollectionElements(negativeMod(iPositiveMod2 - size), elements);
        } else {
            int i12 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i13 = size + iPositiveMod;
                Object[] objArr8 = this.elementData;
                if (i13 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i12, iPositiveMod2, iPositiveMod);
                } else if (i12 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i12 - objArr8.length, iPositiveMod2, iPositiveMod);
                } else {
                    int length3 = iPositiveMod - (i13 - objArr8.length);
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, 0, length3, iPositiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr9, objArr9, i12, iPositiveMod2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, size, 0, iPositiveMod);
                Object[] objArr11 = this.elementData;
                if (i12 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, i12 - objArr11.length, iPositiveMod2, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr12, objArr12, i12, iPositiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(iPositiveMod2, elements);
        }
        return true;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
