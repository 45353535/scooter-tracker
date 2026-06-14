package j$.util;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5655g implements java.util.Collection, Serializable, Collection {
    private static final long serialVersionUID = 3053995032091335093L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Collection f84934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84935b;

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C5655g(java.util.Collection collection) {
        this.f84934a = (java.util.Collection) Objects.requireNonNull(collection);
        this.f84935b = this;
    }

    public C5655g(java.util.Collection collection, Object obj) {
        this.f84934a = (java.util.Collection) Objects.requireNonNull(collection);
        this.f84935b = Objects.requireNonNull(obj);
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f84935b) {
            size = this.f84934a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f84935b) {
            zIsEmpty = this.f84934a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f84935b) {
            zContains = this.f84934a.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f84935b) {
            array = this.f84934a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f84935b) {
            array = this.f84934a.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f84934a.iterator();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f84935b) {
            zAdd = this.f84934a.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f84935b) {
            zRemove = this.f84934a.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        boolean zContainsAll;
        synchronized (this.f84935b) {
            zContainsAll = this.f84934a.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f84935b) {
            zAddAll = this.f84934a.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f84935b) {
            zRemoveAll = this.f84934a.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        boolean zRetainAll;
        synchronized (this.f84935b) {
            zRetainAll = this.f84934a.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f84935b) {
            this.f84934a.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f84935b) {
            string = this.f84934a.toString();
        }
        return string;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        synchronized (this.f84935b) {
            AbstractC5650b.q(this.f84934a, consumer);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f84935b) {
            java.util.Collection collection = this.f84934a;
            zRemoveIf = collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : Collection.CC.$default$removeIf(collection, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return AbstractC5650b.t(this.f84934a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(AbstractC5650b.t(this.f84934a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return AbstractC5650b.u(this.f84934a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(AbstractC5650b.u(this.f84934a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC5650b.s(this.f84934a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(AbstractC5650b.s(this.f84934a));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f84935b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
