package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Class f29452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Enum[] f29453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int[] f29454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int f29455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient long f29456h;

    abstract class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29461b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29462c = -1;

        Itr() {
        }

        abstract Object a(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f29461b < EnumMultiset.this.f29453e.length) {
                int[] iArr = EnumMultiset.this.f29454f;
                int i10 = this.f29461b;
                if (iArr[i10] > 0) {
                    return true;
                }
                this.f29461b = i10 + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) a(this.f29461b);
            int i10 = this.f29461b;
            this.f29462c = i10;
            this.f29461b = i10 + 1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.e(this.f29462c >= 0);
            if (EnumMultiset.this.f29454f[this.f29462c] > 0) {
                EnumMultiset.n(EnumMultiset.this);
                EnumMultiset.o(EnumMultiset.this, r0.f29454f[this.f29462c]);
                EnumMultiset.this.f29454f[this.f29462c] = 0;
            }
            this.f29462c = -1;
        }
    }

    private EnumMultiset(Class cls) {
        this.f29452d = cls;
        Preconditions.checkArgument(cls.isEnum());
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f29453e = enumArr;
        this.f29454f = new int[enumArr.length];
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    static /* synthetic */ int n(EnumMultiset enumMultiset) {
        int i10 = enumMultiset.f29455g;
        enumMultiset.f29455g = i10 - 1;
        return i10;
    }

    static /* synthetic */ long o(EnumMultiset enumMultiset, long j10) {
        long j11 = enumMultiset.f29456h - j10;
        enumMultiset.f29456h = j11;
        return j11;
    }

    private void q(Object obj) {
        Preconditions.checkNotNull(obj);
        if (r(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.f29452d + " but got " + obj);
    }

    private boolean r(Object obj) {
        if (obj instanceof Enum) {
            Enum r52 = (Enum) obj;
            int iOrdinal = r52.ordinal();
            Enum[] enumArr = this.f29453e;
            if (iOrdinal < enumArr.length && enumArr[iOrdinal] == r52) {
                return true;
            }
        }
        return false;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Class cls = (Class) object;
        this.f29452d = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f29453e = enumArr;
        this.f29454f = new int[enumArr.length];
        Serialization.f(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f29452d);
        Serialization.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.f29454f, 0);
        this.f29456h = 0L;
        this.f29455g = 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        if (obj == null || !r(obj)) {
            return 0;
        }
        return this.f29454f[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    int i() {
        return this.f29455g;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator j() {
        return new EnumMultiset<E>.Itr<E>() { // from class: com.google.common.collect.EnumMultiset.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.EnumMultiset.Itr
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Enum a(int i10) {
                return EnumMultiset.this.f29453e[i10];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator k() {
        return new EnumMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.EnumMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.EnumMultiset.Itr
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry a(final int i10) {
                return new Multisets.AbstractEntry<E>(this) { // from class: com.google.common.collect.EnumMultiset.2.1

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass2 f29460c;

                    {
                        this.f29460c = this;
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        return EnumMultiset.this.f29454f[i10];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public E getElement() {
                        return (E) EnumMultiset.this.f29453e[i10];
                    }
                };
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i10) {
        if (obj == null || !r(obj)) {
            return 0;
        }
        Enum r12 = (Enum) obj;
        CollectPreconditions.b(i10, "occurrences");
        if (i10 == 0) {
            return count(obj);
        }
        int iOrdinal = r12.ordinal();
        int[] iArr = this.f29454f;
        int i11 = iArr[iOrdinal];
        if (i11 == 0) {
            return 0;
        }
        if (i11 > i10) {
            iArr[iOrdinal] = i11 - i10;
            this.f29456h -= (long) i10;
            return i11;
        }
        iArr[iOrdinal] = 0;
        this.f29455g--;
        this.f29456h -= (long) i11;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(this.f29456h);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it.next().getDeclaringClass());
        Iterables.addAll(enumMultiset, iterable);
        return enumMultiset;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e10, int i10) {
        q(e10);
        CollectPreconditions.b(i10, "occurrences");
        if (i10 == 0) {
            return count(e10);
        }
        int iOrdinal = e10.ordinal();
        int i11 = this.f29454f[iOrdinal];
        long j10 = i10;
        long j11 = ((long) i11) + j10;
        Preconditions.checkArgument(j11 <= SieveCacheKt.NodeLinkMask, "too many occurrences: %s", j11);
        this.f29454f[iOrdinal] = (int) j11;
        if (i11 == 0) {
            this.f29455g++;
        }
        this.f29456h += j10;
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean setCount(@ParametricNullness Object obj, int i10, int i11) {
        return super.setCount(obj, i10, i11);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e10, int i10) {
        q(e10);
        CollectPreconditions.b(i10, "count");
        int iOrdinal = e10.ordinal();
        int[] iArr = this.f29454f;
        int i11 = iArr[iOrdinal];
        iArr[iOrdinal] = i10;
        this.f29456h += (long) (i10 - i11);
        if (i11 == 0 && i10 > 0) {
            this.f29455g++;
            return i11;
        }
        if (i11 > 0 && i10 == 0) {
            this.f29455g--;
        }
        return i11;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> enumMultisetCreate = create(cls);
        Iterables.addAll(enumMultisetCreate, iterable);
        return enumMultisetCreate;
    }
}
