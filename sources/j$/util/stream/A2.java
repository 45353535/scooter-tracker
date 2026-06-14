package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A2 extends AbstractC5705h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f84989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84990c;

    public A2(InterfaceC5725l2 interfaceC5725l2, Comparator comparator) {
        super(interfaceC5725l2);
        this.f84989b = comparator;
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public final boolean n() {
        this.f84990c = true;
        return false;
    }
}
