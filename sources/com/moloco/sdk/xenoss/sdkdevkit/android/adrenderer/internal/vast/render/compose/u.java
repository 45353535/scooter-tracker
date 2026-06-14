package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f58067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f58068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f58069c;

    public u(Function0 function0, Function0 function02, Function0 function03) {
        this.f58067a = function0;
        this.f58068b = function02;
        this.f58069c = function03;
    }

    public final Function0 a() {
        return this.f58068b;
    }

    public final Function0 b() {
        return this.f58069c;
    }

    public final Function0 c() {
        return this.f58067a;
    }

    public /* synthetic */ u(Function0 function0, Function0 function02, Function0 function03, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0, (i10 & 2) != 0 ? null : function02, (i10 & 4) != 0 ? null : function03);
    }
}
