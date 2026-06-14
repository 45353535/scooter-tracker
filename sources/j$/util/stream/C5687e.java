package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5687e implements InterfaceC5697g, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseStream f85250a;

    public /* synthetic */ C5687e(BaseStream baseStream) {
        this.f85250a = baseStream;
    }

    public static /* synthetic */ InterfaceC5697g k(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C5692f ? ((C5692f) baseStream).f85258a : baseStream instanceof DoubleStream ? C5791z.k((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C5713j0.k((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? X2.k((java.util.stream.Stream) baseStream) : new C5687e(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f85250a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f85250a;
        if (obj instanceof C5687e) {
            obj = ((C5687e) obj).f85250a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f85250a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ boolean isParallel() {
        return this.f85250a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ Iterator iterator() {
        return this.f85250a.iterator();
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g onClose(Runnable runnable) {
        return k(this.f85250a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g parallel() {
        return k(this.f85250a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g sequential() {
        return k(this.f85250a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.f85250a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g unordered() {
        return k(this.f85250a.unordered());
    }
}
