package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import com.moloco.sdk.internal.ortb.model.C4724a;
import com.moloco.sdk.internal.ortb.model.C4725b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f55862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function2 f55868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4724a f55869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4725b f55870j;

    public f0(boolean z10, Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, Function2 VastRenderer, C4724a c4724a, C4725b c4725b) {
        Intrinsics.checkNotNullParameter(VastRenderer, "VastRenderer");
        this.f55861a = z10;
        this.f55862b = bool;
        this.f55863c = i10;
        this.f55864d = i11;
        this.f55865e = i12;
        this.f55866f = z11;
        this.f55867g = z12;
        this.f55868h = VastRenderer;
        this.f55869i = c4724a;
        this.f55870j = c4725b;
    }

    public final C4724a a() {
        return this.f55869i;
    }

    public final C4725b b() {
        return this.f55870j;
    }

    public final boolean c() {
        return this.f55867g;
    }

    public final boolean d() {
        return this.f55866f;
    }

    public final int e() {
        return this.f55864d;
    }

    public final int f() {
        return this.f55865e;
    }

    public final Boolean g() {
        return this.f55862b;
    }

    public final int h() {
        return this.f55863c;
    }

    public final boolean i() {
        return this.f55861a;
    }

    public final Function2 j() {
        return this.f55868h;
    }
}
