package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001?B\u0019\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0011\b\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u0010#\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0016\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\"J\u0016\u0010(\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\fJ\u0013\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010-\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012J\b\u00100\u001a\u00020 H\u0016J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0096\u0002J\u0015\u00103\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u00104\u001a\u00020 2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u00104\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00105\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t¢\u0006\u0002\u0010\u0014J%\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0001\u0010:2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H:0\t¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020=H\u0016J\u0013\u0010>\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107R\u001a\u0010\u000e\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\rR$\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010¨\u0006@"}, d2 = {"Landroidx/collection/ArraySet;", ExifInterface.LONGITUDE_EAST, "", "", "set", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "array", "", "([Ljava/lang/Object;)V", "capacity", "", "(I)V", "_size", "get_size$collection", "()I", "set_size$collection", "", "getArray$collection", "()[Ljava/lang/Object;", "setArray$collection", "[Ljava/lang/Object;", "hashes", "", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "", "elements", "clear", "contains", "containsAll", "ensureCapacity", "minimumCapacity", "equals", "other", "hashCode", "indexOf", C4240b4.i.W, "isEmpty", "iterator", "", "remove", "removeAll", "removeAt", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "retainAll", "toArray", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "valueAt", "ElementIterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArraySet<E> implements Collection<E>, Set<E>, yf.b, f {
    private int _size;

    @NotNull
    private Object[] array;

    @NotNull
    private int[] hashes;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\t"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "(Landroidx/collection/ArraySet;)V", "elementAt", FirebaseAnalytics.Param.INDEX, "", "(I)Ljava/lang/Object;", "removeAt", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int index) {
            return ArraySet.this.valueAt(index);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int index) {
            ArraySet.this.removeAt(index);
        }
    }

    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i10;
        int iIndexOf;
        int i11 = get_size$collection();
        if (element == null) {
            iIndexOf = ArraySetKt.indexOfNull(this);
            i10 = 0;
        } else {
            int iHashCode = element.hashCode();
            i10 = iHashCode;
            iIndexOf = ArraySetKt.indexOf(this, element, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i12 = ~iIndexOf;
        if (i11 >= getHashes().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, i13);
            if (i11 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, hashes.length, 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, array.length, 6, (Object) null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            ArraysKt.copyInto(getHashes(), getHashes(), i14, i12, i11);
            ArraysKt.copyInto(getArray(), getArray(), i14, i12, i11);
        }
        if (i11 != get_size$collection() || i12 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i12] = i10;
        getArray()[i12] = element;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(@NotNull ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i10);
        if (get_size$collection() != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                add(array.valueAt(i11));
            }
            return;
        }
        if (i10 > 0) {
            ArraysKt.copyInto$default(array.getHashes(), getHashes(), 0, 0, i10, 6, (Object) null);
            ArraysKt.copyInto$default(array.getArray(), getArray(), 0, 0, i10, 6, (Object) null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int minimumCapacity) {
        int i10 = get_size$collection();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, minimumCapacity);
            if (get_size$collection() > 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, get_size$collection(), 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, get_size$collection(), 6, (Object) null);
            }
        }
        if (get_size$collection() != i10) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int i10 = get_size$collection();
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) other).contains(valueAt(i11))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getArray$collection, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    @NotNull
    /* JADX INFO: renamed from: getHashes$collection, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int get_size() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int i10 = get_size$collection();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += hashes[i12];
        }
        return i11;
    }

    public final int indexOf(@Nullable Object key) {
        return key == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@NotNull ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = array.get_size$collection();
        int i11 = get_size$collection();
        for (int i12 = 0; i12 < i10; i12++) {
            remove(array.valueAt(i12));
        }
        return i11 != get_size$collection();
    }

    public final E removeAt(int index) {
        int i10;
        Object[] objArr;
        int i11 = get_size$collection();
        E e10 = (E) getArray()[index];
        if (i11 <= 1) {
            clear();
            return e10;
        }
        int i12 = i11 - 1;
        if (getHashes().length <= 8 || get_size$collection() >= getHashes().length / 3) {
            if (index < i12) {
                int i13 = index + 1;
                ArraysKt.copyInto(getHashes(), getHashes(), index, i13, i11);
                ArraysKt.copyInto(getArray(), getArray(), index, i13, i11);
            }
            getArray()[i12] = null;
        } else {
            int i14 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, i14);
            if (index > 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, index, 6, (Object) null);
                objArr = array;
                ArraysKt.copyInto$default(objArr, getArray(), 0, 0, index, 6, (Object) null);
                i10 = index;
            } else {
                i10 = index;
                objArr = array;
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                ArraysKt.copyInto(hashes, getHashes(), i10, i15, i11);
                ArraysKt.copyInto(objArr, getArray(), i10, i15, i11);
            }
        }
        if (i11 != get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        set_size$collection(i12);
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int i10 = get_size$collection() - 1; -1 < i10; i10--) {
            if (!CollectionsKt.contains(elements, getArray()[i10])) {
                removeAt(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final void setArray$collection(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i10) {
        this._size = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.array, 0, this._size);
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(get_size$collection() * 14);
        sb2.append('{');
        int i10 = get_size$collection();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            E eValueAt = valueAt(i11);
            if (eValueAt != this) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final E valueAt(int index) {
        return (E) getArray()[index];
    }

    public ArraySet(int i10) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i10 > 0) {
            ArraySetKt.allocArrays(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] tArr = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        ArraysKt.copyInto(this.array, tArr, 0, 0, this._size);
        Intrinsics.checkNotNull(tArr);
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public /* synthetic */ ArraySet(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public ArraySet(@Nullable ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(@Nullable Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ensureCapacity(get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator itA = i.a(eArr);
            while (itA.hasNext()) {
                add(itA.next());
            }
        }
    }
}
