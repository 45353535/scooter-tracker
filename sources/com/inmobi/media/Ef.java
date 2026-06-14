package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Ef {
    public static final Df a(byte b10) {
        return b10 == 1 ? Df.f36734a : b10 == 2 ? Df.f36736c : b10 == 3 ? Df.f36735b : b10 == 4 ? Df.f36737d : Df.f36734a;
    }

    public static final boolean b(Df df2) {
        Intrinsics.checkNotNullParameter(df2, "<this>");
        return df2 == Df.f36735b || df2 == Df.f36737d;
    }

    public static final int a(Df df2) {
        Intrinsics.checkNotNullParameter(df2, "<this>");
        int iOrdinal = df2.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return 180;
        }
        if (iOrdinal == 3) {
            return 270;
        }
        throw new lf.m();
    }
}
