package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3629cc extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3629cc(String error) {
        super(error);
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
