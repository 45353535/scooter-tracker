package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends I implements InterfaceC5715j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f85024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f85025d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        p(Integer.valueOf(i10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f85049a) {
            return new j$.util.C(((Integer) this.f85050b).intValue());
        }
        return null;
    }

    static {
        EnumC5676b3 enumC5676b3 = EnumC5676b3.INT_VALUE;
        j$.util.C c10 = j$.util.C.f84780c;
        f85024c = new C(true, enumC5676b3, c10, new D(2), new D(3));
        f85025d = new C(false, enumC5676b3, c10, new D(2), new D(3));
    }
}
