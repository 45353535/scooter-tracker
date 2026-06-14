package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f85038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f85039d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f85049a) {
            return Optional.of(this.f85050b);
        }
        return null;
    }

    static {
        EnumC5676b3 enumC5676b3 = EnumC5676b3.REFERENCE;
        f85038c = new C(true, enumC5676b3, Optional.empty(), new D(6), new D(7));
        f85039d = new C(false, enumC5676b3, Optional.empty(), new D(6), new D(7));
    }
}
