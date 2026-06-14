package zg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b0 writer, boolean z10) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f119480c = z10;
    }

    @Override // zg.r
    public void n(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f119480c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
