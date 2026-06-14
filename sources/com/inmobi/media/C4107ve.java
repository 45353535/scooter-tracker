package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C4107ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39775b;

    public C4107ve(String url, String eventType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f39774a = url;
        this.f39775b = eventType;
    }
}
