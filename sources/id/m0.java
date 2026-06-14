package id;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1 f74584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f74585b;

    public m0(c1 scaleType, a1 resource) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.f74584a = scaleType;
        this.f74585b = resource;
    }

    public final a1 a() {
        return this.f74585b;
    }

    public final c1 b() {
        return this.f74584a;
    }
}
