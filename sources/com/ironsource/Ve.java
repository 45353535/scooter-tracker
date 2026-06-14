package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Ve implements Hb<Pe, C4558u> {
    @Override // com.ironsource.Hb
    @NotNull
    public C4558u a(@NotNull Pe input) {
        String strH;
        String strI;
        String strG;
        T7 t7E;
        String strC;
        Intrinsics.checkNotNullParameter(input, "input");
        We weB = input.b();
        N nA = input.a();
        if (nA == null || (strH = nA.h()) == null) {
            strH = "0";
        }
        N nA2 = input.a();
        if (nA2 == null || (strI = nA2.i()) == null) {
            strI = "0";
        }
        N nA3 = input.a();
        if (nA3 == null || (strG = nA3.g()) == null) {
            strG = "0";
        }
        N nA4 = input.a();
        if (nA4 == null || (t7E = nA4.e()) == null) {
            t7E = T7.UnknownProvider;
        }
        N nA5 = input.a();
        return new C4558u(weB, strH, strI, strG, t7E, (nA5 == null || (strC = nA5.c()) == null) ? "0" : strC);
    }
}
