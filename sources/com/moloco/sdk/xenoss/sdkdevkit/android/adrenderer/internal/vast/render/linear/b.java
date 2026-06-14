package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f58231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f58232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f58233c;

    public b(List list, List list2, x vastTracker) {
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f58231a = list;
        this.f58232b = list2;
        this.f58233c = vastTracker;
    }

    public final void a(Integer num, String str) {
        List list = this.f58231a;
        if (list != null) {
            this.f58233c.a(list, null, num, str);
            this.f58231a = null;
        }
    }

    public final void b(Integer num, String str) {
        List list = this.f58232b;
        if (list != null) {
            this.f58233c.a(list, null, num, str);
            this.f58232b = null;
        }
    }

    public /* synthetic */ b(List list, List list2, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i10 & 4) != 0 ? a0.e() : xVar);
    }
}
