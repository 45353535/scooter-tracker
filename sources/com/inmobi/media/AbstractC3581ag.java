package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3581ag {
    public static final boolean a(Xf xf2) {
        Intrinsics.checkNotNullParameter(xf2, "<this>");
        int i10 = xf2.f38006b;
        if ((400 <= i10 && i10 < 600) || i10 <= 0) {
            return false;
        }
        String str = xf2.f38007c;
        return str == null || str.length() == 0;
    }
}
