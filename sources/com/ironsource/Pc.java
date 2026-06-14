package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41598b;

    public Pc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.f41597a;
    }

    public final int b() {
        return this.f41598b;
    }

    public final int c() {
        return this.f41598b;
    }

    public final boolean d() {
        return this.f41597a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pc)) {
            return false;
        }
        Pc pc2 = (Pc) obj;
        return this.f41597a == pc2.f41597a && this.f41598b == pc2.f41598b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f41597a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.f41598b;
    }

    @NotNull
    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f41597a + ", flags=" + this.f41598b + ")";
    }

    public Pc(boolean z10, int i10) {
        this.f41597a = z10;
        this.f41598b = i10;
    }

    @NotNull
    public final Pc a(boolean z10, int i10) {
        return new Pc(z10, i10);
    }

    public static /* synthetic */ Pc a(Pc pc2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = pc2.f41597a;
        }
        if ((i11 & 2) != 0) {
            i10 = pc2.f41598b;
        }
        return pc2.a(z10, i10);
    }

    public /* synthetic */ Pc(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? com.google.android.exoplayer2.C.ENCODING_PCM_32BIT : i10);
    }
}
