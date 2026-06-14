package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5716j3 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f85291d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f85292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f85293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f85294c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5650b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    public C5716j3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f85292a = spliterator;
        this.f85293b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.f85294c = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f85292a.tryAdvance(this)) {
            Object obj = this.f85294c;
            if (obj == null) {
                obj = f85291d;
            }
            if (this.f85293b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.p(this.f85294c);
                this.f85294c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f85292a.forEachRemaining(new j$.util.concurrent.s(9, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f85292a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C5716j3(spliteratorTrySplit, this.f85293b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f85292a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f85292a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f85292a.getComparator();
    }
}
