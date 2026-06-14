package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5660l implements Iterator, InterfaceC5802z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84953a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f84954b;

    public C5660l(C5661m c5661m) {
        this.f84954b = c5661m.f84955a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC5802z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f84953a) {
            case 0:
                AbstractC5650b.r(this.f84954b, consumer);
                break;
            default:
                AbstractC5650b.r(this.f84954b, new j$.time.format.r(1, consumer));
                break;
        }
    }

    public C5660l(r rVar) {
        this.f84954b = rVar.f84955a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f84953a) {
        }
        return this.f84954b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f84953a) {
            case 0:
                return this.f84954b.next();
            default:
                return new C5664p((Map.Entry) this.f84954b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f84953a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
