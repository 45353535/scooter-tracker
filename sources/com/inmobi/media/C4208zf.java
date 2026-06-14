package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4208zf extends C4107ve {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4208zf(String vendor, String str, String url) {
        super(url, "OMID_VIEWABILITY");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f40052c = vendor;
        this.f40053d = str;
    }
}
