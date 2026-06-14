package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class I3 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
