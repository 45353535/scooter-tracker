package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class V7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41903b;

    public V7(int i10, int i11) {
        this.f41902a = i10;
        this.f41903b = i11;
    }

    public final int a() {
        return this.f41902a;
    }

    public final int b() {
        return this.f41903b;
    }

    public final int c() {
        return this.f41903b;
    }

    public final int d() {
        return this.f41902a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V7)) {
            return false;
        }
        V7 v72 = (V7) obj;
        return this.f41902a == v72.f41902a && this.f41903b == v72.f41903b;
    }

    public int hashCode() {
        return (this.f41902a * 31) + this.f41903b;
    }

    @NotNull
    public String toString() {
        return "ISContainerParams(width=" + this.f41902a + ", height=" + this.f41903b + ")";
    }

    @NotNull
    public final V7 a(int i10, int i11) {
        return new V7(i10, i11);
    }

    public static /* synthetic */ V7 a(V7 v72, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = v72.f41902a;
        }
        if ((i12 & 2) != 0) {
            i11 = v72.f41903b;
        }
        return v72.a(i10, i11);
    }
}
