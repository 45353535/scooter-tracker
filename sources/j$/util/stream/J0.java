package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f85062a;

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.w(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final F0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public J0(Collection collection) {
        this.f85062a = collection;
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return AbstractC5650b.u(this.f85062a).spliterator();
    }

    @Override // j$.util.stream.F0
    public final void i(Object[] objArr, int i10) {
        Iterator it = this.f85062a.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    @Override // j$.util.stream.F0
    public final Object[] o(IntFunction intFunction) {
        Collection collection = this.f85062a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f85062a.size();
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        AbstractC5650b.q(this.f85062a, consumer);
    }

    public final String toString() {
        Collection collection = this.f85062a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
