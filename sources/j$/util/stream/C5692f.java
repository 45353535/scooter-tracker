package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5692f implements BaseStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5697g f85258a;

    public /* synthetic */ C5692f(InterfaceC5697g interfaceC5697g) {
        this.f85258a = interfaceC5697g;
    }

    public static /* synthetic */ BaseStream k(InterfaceC5697g interfaceC5697g) {
        if (interfaceC5697g == null) {
            return null;
        }
        return interfaceC5697g instanceof C5687e ? ((C5687e) interfaceC5697g).f85250a : interfaceC5697g instanceof B ? A.k((B) interfaceC5697g) : interfaceC5697g instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC5697g) : interfaceC5697g instanceof InterfaceC5723l0 ? C5718k0.k((InterfaceC5723l0) interfaceC5697g) : interfaceC5697g instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC5697g) : new C5692f(interfaceC5697g);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.f85258a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5697g interfaceC5697g = this.f85258a;
        if (obj instanceof C5692f) {
            obj = ((C5692f) obj).f85258a;
        }
        return interfaceC5697g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f85258a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f85258a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f85258a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return k(this.f85258a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return k(this.f85258a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return k(this.f85258a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f85258a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return k(this.f85258a.unordered());
    }
}
