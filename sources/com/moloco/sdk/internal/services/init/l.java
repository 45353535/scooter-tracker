package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.services.init.i;
import kotlin.jvm.internal.Intrinsics;
import ve.c0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l {
    public static final boolean a(int i10) {
        c0.a aVar = c0.f106561d;
        return i10 == aVar.U().e0() || i10 == aVar.K().e0() || i10 < 400 || i10 >= 500;
    }

    public static final boolean b(h0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.a() instanceof i.b) {
            return a(((i.b) aVar.a()).a());
        }
        return true;
    }
}
