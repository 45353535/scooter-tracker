package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36741b;

    public Di(String sourceId, String renderViewId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(renderViewId, "renderViewId");
        this.f36740a = sourceId;
        this.f36741b = renderViewId;
    }
}
