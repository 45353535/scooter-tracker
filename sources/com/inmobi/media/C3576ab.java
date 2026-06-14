package com.inmobi.media;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3576ab extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3576ab(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
