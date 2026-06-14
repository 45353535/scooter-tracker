package id;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f74639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f74640b;

    public v(y source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f74639a = source;
        this.f74640b = z10;
    }

    public final y a() {
        return this.f74639a;
    }

    public final boolean b() {
        return this.f74640b;
    }

    public /* synthetic */ v(y yVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, (i10 & 2) != 0 ? false : z10);
    }
}
