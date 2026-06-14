package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f43192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f43194c;

    public gg(boolean z10, boolean z11, boolean z12) {
        this.f43192a = z10;
        this.f43193b = z11;
        this.f43194c = z12;
    }

    public final boolean a() {
        return this.f43192a;
    }

    public final boolean b() {
        return this.f43193b;
    }

    public final boolean c() {
        return this.f43194c;
    }

    public final boolean d() {
        return this.f43194c;
    }

    public final boolean e() {
        return this.f43192a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg)) {
            return false;
        }
        gg ggVar = (gg) obj;
        return this.f43192a == ggVar.f43192a && this.f43193b == ggVar.f43193b && this.f43194c == ggVar.f43194c;
    }

    public final boolean f() {
        return this.f43193b;
    }

    @NotNull
    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C4329g8.f43166k, this.f43192a).put(C4329g8.f43167l, this.f43193b).put(C4329g8.f43168m, this.f43194c);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.f43192a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.f43193b;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (i10 + r22) * 31;
        boolean z12 = this.f43194c;
        return i11 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f43192a + ", isWindowVisible=" + this.f43193b + ", isShown=" + this.f43194c + ")";
    }

    @NotNull
    public final gg a(boolean z10, boolean z11, boolean z12) {
        return new gg(z10, z11, z12);
    }

    public static /* synthetic */ gg a(gg ggVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ggVar.f43192a;
        }
        if ((i10 & 2) != 0) {
            z11 = ggVar.f43193b;
        }
        if ((i10 & 4) != 0) {
            z12 = ggVar.f43194c;
        }
        return ggVar.a(z10, z11, z12);
    }
}
