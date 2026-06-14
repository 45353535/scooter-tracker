package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
final class C4438b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u.d f43788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f43790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f43791d;

    public C4438b(@NotNull u.d sdkState, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        this.f43788a = sdkState;
        this.f43789b = z10;
        this.f43790c = z11;
        this.f43791d = z12;
    }

    @NotNull
    public final u.d a() {
        return this.f43788a;
    }

    public final boolean b() {
        return this.f43789b;
    }

    public final boolean c() {
        return this.f43790c;
    }

    public final boolean d() {
        return this.f43791d;
    }

    @NotNull
    public final u.d e() {
        return this.f43788a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4438b)) {
            return false;
        }
        C4438b c4438b = (C4438b) obj;
        return this.f43788a == c4438b.f43788a && this.f43789b == c4438b.f43789b && this.f43790c == c4438b.f43790c && this.f43791d == c4438b.f43791d;
    }

    public final boolean f() {
        return this.f43791d;
    }

    public final boolean g() {
        return this.f43790c;
    }

    public final boolean h() {
        return this.f43789b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.f43788a.hashCode() * 31;
        boolean z10 = this.f43789b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode + r12) * 31;
        boolean z11 = this.f43790c;
        ?? r13 = z11;
        if (z11) {
            r13 = 1;
        }
        int i11 = (i10 + r13) * 31;
        boolean z12 = this.f43791d;
        return i11 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f43788a + ", isRetryForMoreThan15Secs=" + this.f43789b + ", isDemandOnlyInitRequested=" + this.f43790c + ", isAdUnitInitRequested=" + this.f43791d + ")";
    }

    @NotNull
    public final C4438b a(@NotNull u.d sdkState, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        return new C4438b(sdkState, z10, z11, z12);
    }

    public static /* synthetic */ C4438b a(C4438b c4438b, u.d dVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = c4438b.f43788a;
        }
        if ((i10 & 2) != 0) {
            z10 = c4438b.f43789b;
        }
        if ((i10 & 4) != 0) {
            z11 = c4438b.f43790c;
        }
        if ((i10 & 8) != 0) {
            z12 = c4438b.f43791d;
        }
        return c4438b.a(dVar, z10, z11, z12);
    }
}
