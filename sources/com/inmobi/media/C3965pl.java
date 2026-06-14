package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3965pl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39301d;

    public C3965pl(int i10, int i11, String mediaUrl, String delivery, String type, int i12) {
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f39298a = i10;
        this.f39299b = i11;
        this.f39300c = mediaUrl;
        this.f39301d = i12;
    }
}
