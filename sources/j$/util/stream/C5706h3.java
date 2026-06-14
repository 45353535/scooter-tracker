package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5706h3 extends AbstractC5711i3 implements Consumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f85275b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public C5706h3(int i10) {
        this.f85275b = new Object[i10];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f85284a;
        this.f85284a = i10 + 1;
        this.f85275b[i10] = obj;
    }
}
