package com.inmobi.media;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Dg {
    public static final void a(Ag priority, Function1 block) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(block, "block");
        int iOrdinal = priority.ordinal();
        if (iOrdinal == 0) {
            eg.i.d(A9.f36558d, null, null, new Bg(block, null), 3, null);
        } else {
            if (iOrdinal != 1) {
                throw new lf.m();
            }
            eg.i.d(A9.f36557c, null, null, new Cg(block, null), 3, null);
        }
    }
}
