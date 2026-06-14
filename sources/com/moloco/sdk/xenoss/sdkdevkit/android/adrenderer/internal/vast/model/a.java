package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f57537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57539c;

    public a(b0 b0Var, List clickTrackingList, List customClickList) {
        Intrinsics.checkNotNullParameter(clickTrackingList, "clickTrackingList");
        Intrinsics.checkNotNullParameter(customClickList, "customClickList");
        this.f57537a = b0Var;
        this.f57538b = clickTrackingList;
        this.f57539c = customClickList;
    }

    public final b0 a() {
        return this.f57537a;
    }

    public final List b() {
        return this.f57538b;
    }

    public final List c() {
        return this.f57539c;
    }
}
