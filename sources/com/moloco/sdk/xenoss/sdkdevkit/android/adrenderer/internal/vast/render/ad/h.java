package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f57741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f57742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f57744d;

    public h(List list, List list2, List list3, x vastTracker) {
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f57741a = list;
        this.f57742b = list2;
        this.f57743c = list3;
        this.f57744d = vastTracker;
    }

    public final void a() {
        List list = this.f57742b;
        if (list != null) {
            x.a.a(this.f57744d, list, null, null, null, 14, null);
            this.f57742b = null;
        }
    }

    public final void b(z zVar) {
        List list = this.f57743c;
        if (list != null) {
            x.a.a(this.f57744d, list, zVar, null, null, 12, null);
        }
    }

    public final boolean c() {
        List list = this.f57741a;
        if (list == null) {
            return false;
        }
        x.a.a(this.f57744d, list, null, null, null, 14, null);
        this.f57741a = null;
        return true;
    }

    public /* synthetic */ h(List list, List list2, List list3, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i10 & 8) != 0 ? a0.e() : xVar);
    }
}
