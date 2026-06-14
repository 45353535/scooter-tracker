package ve;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends ze.z {
    public p(int i10) {
        super(true, i10);
    }

    @Override // ze.z
    protected void n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        super.n(name);
        u.f106718a.a(name);
    }

    @Override // ze.z
    protected void o(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.o(value);
        u.f106718a.b(value);
    }

    public o p() {
        return new q(k());
    }

    public /* synthetic */ p(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
