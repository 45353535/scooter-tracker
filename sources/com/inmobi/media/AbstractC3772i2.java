package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3772i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38737d;

    public AbstractC3772i2(String eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f38734a = eventType;
        this.f38735b = str;
        this.f38736c = System.currentTimeMillis();
    }
}
