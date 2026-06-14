package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57594b;

    public o(String clickThroughUrl, List clickTrackingUrlList) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTrackingUrlList, "clickTrackingUrlList");
        this.f57593a = clickThroughUrl;
        this.f57594b = clickTrackingUrlList;
    }

    public final String a() {
        return this.f57593a;
    }

    public final List b() {
        return this.f57594b;
    }
}
