package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends I implements InterfaceC5710i2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f85019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f85020d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        p(Double.valueOf(d10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f85049a) {
            return new j$.util.B(((Double) this.f85050b).doubleValue());
        }
        return null;
    }

    static {
        EnumC5676b3 enumC5676b3 = EnumC5676b3.DOUBLE_VALUE;
        j$.util.B b10 = j$.util.B.f84772c;
        f85019c = new C(true, enumC5676b3, b10, new D(0), new D(1));
        f85020d = new C(false, enumC5676b3, b10, new D(0), new D(1));
    }
}
