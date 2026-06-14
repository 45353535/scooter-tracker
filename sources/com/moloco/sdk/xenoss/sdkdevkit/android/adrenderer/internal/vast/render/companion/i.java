package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f57800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f57801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f57802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f57803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f57804e;

    public i(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, List list, List list2, r buttonTracker, x vastTracker) {
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f57800a = customUserEventBuilderService;
        this.f57801b = list;
        this.f57802c = list2;
        this.f57803d = buttonTracker;
        this.f57804e = vastTracker;
    }

    public final void a() {
        List list = this.f57802c;
        if (list != null) {
            x.a.a(this.f57804e, list, null, null, null, 14, null);
            this.f57802c = null;
        }
    }

    public final void b(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f57803d.p(buttonType);
    }

    public final void c(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f57803d.m(button);
    }

    public final void d(a.AbstractC0780a.f lastClickPosition) {
        Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        List list = this.f57801b;
        if (list != null) {
            x.a.b(this.f57804e, list, null, null, null, this.f57803d.p(), this.f57800a, lastClickPosition, 14, null);
            this.f57801b = null;
        }
    }

    public /* synthetic */ i(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, r rVar, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, (i10 & 8) != 0 ? t.a() : rVar, (i10 & 16) != 0 ? a0.e() : xVar);
    }
}
