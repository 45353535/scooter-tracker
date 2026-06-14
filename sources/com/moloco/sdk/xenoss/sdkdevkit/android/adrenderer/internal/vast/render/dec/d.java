package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f58180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f58181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f58182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f58183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f58184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f58185f;

    public d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, List list, List list2, List list3, r buttonTracker, x vastTracker) {
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f58180a = customUserEventBuilderService;
        this.f58181b = list;
        this.f58182c = list2;
        this.f58183d = list3;
        this.f58184e = buttonTracker;
        this.f58185f = vastTracker;
    }

    public final void a() {
        List list = this.f58182c;
        if (list != null) {
            x.a.a(this.f58185f, list, null, null, null, 14, null);
            this.f58182c = null;
        }
    }

    public final void b(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f58184e.p(buttonType);
    }

    public final void c(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f58184e.m(button);
    }

    public final void d(a.AbstractC0780a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        List list = this.f58181b;
        if (list != null) {
            x.a.b(this.f58185f, list, null, null, null, this.f58184e.p(), this.f58180a, position, 14, null);
            this.f58181b = null;
        }
    }

    public final void e() {
        List list = this.f58183d;
        if (list != null) {
            x.a.a(this.f58185f, list, null, null, null, 14, null);
            this.f58183d = null;
        }
    }

    public /* synthetic */ d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, List list3, r rVar, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, list3, (i10 & 16) != 0 ? t.a() : rVar, (i10 & 32) != 0 ? a0.e() : xVar);
    }
}
