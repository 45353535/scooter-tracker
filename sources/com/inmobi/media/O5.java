package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class O5 extends C4107ve {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O5(String url, String offset) {
        super(url, "progress");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f37476c = offset;
    }
}
