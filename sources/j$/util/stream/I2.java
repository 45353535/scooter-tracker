package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class I2 extends A2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f85056d;

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85056d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final void k() {
        List.EL.sort(this.f85056d, this.f84989b);
        long size = this.f85056d.size();
        InterfaceC5725l2 interfaceC5725l2 = this.f85274a;
        interfaceC5725l2.l(size);
        if (!this.f84990c) {
            ArrayList arrayList = this.f85056d;
            Objects.requireNonNull(interfaceC5725l2);
            AbstractC5650b.q(arrayList, new j$.time.format.r(10, interfaceC5725l2));
        } else {
            ArrayList arrayList2 = this.f85056d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (interfaceC5725l2.n()) {
                    break;
                } else {
                    interfaceC5725l2.p(obj);
                }
            }
        }
        interfaceC5725l2.k();
        this.f85056d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.f85056d.add(obj);
    }
}
