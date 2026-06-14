package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends I implements InterfaceC5720k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f85031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f85032d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        p(Long.valueOf(j10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f85049a) {
            return new j$.util.D(((Long) this.f85050b).longValue());
        }
        return null;
    }

    static {
        EnumC5676b3 enumC5676b3 = EnumC5676b3.LONG_VALUE;
        j$.util.D d10 = j$.util.D.f84783c;
        f85031c = new C(true, enumC5676b3, d10, new D(4), new D(5));
        f85032d = new C(false, enumC5676b3, d10, new D(4), new D(5));
    }
}
