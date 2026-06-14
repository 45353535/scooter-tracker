package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import com.moloco.sdk.internal.ortb.model.C4724a;
import com.moloco.sdk.internal.ortb.model.C4725b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function9 f58886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function2 f58888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4724a f58889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4725b f58890f;

    public o(int i10, Function9 adWebViewRenderer, int i11, Function2 decClose, C4724a c4724a, C4725b c4725b) {
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Intrinsics.checkNotNullParameter(decClose, "decClose");
        this.f58885a = i10;
        this.f58886b = adWebViewRenderer;
        this.f58887c = i11;
        this.f58888d = decClose;
        this.f58889e = c4724a;
        this.f58890f = c4725b;
    }

    public final Function9 a() {
        return this.f58886b;
    }

    public final C4724a b() {
        return this.f58889e;
    }

    public final C4725b c() {
        return this.f58890f;
    }

    public final int d() {
        return this.f58885a;
    }

    public final Function2 e() {
        return this.f58888d;
    }

    public final int f() {
        return this.f58887c;
    }
}
