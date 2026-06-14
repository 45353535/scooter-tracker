package id;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f74508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f74509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f74510c;

    public g0(j0 type, i0 direction, List colors) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f74508a = type;
        this.f74509b = direction;
        this.f74510c = colors;
    }

    public final List a() {
        return this.f74510c;
    }

    public final i0 b() {
        return this.f74509b;
    }

    public final j0 c() {
        return this.f74508a;
    }
}
