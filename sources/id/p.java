package id;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f74591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f74592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f74593c;

    public p(r type, float f10, float f11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f74591a = type;
        this.f74592b = f10;
        this.f74593c = f11;
    }

    public final float a() {
        return this.f74592b;
    }

    public final r b() {
        return this.f74591a;
    }

    public final float c() {
        return this.f74593c;
    }
}
