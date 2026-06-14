package com.ironsource;

import com.ironsource.N0;

/* JADX INFO: loaded from: classes8.dex */
public final class Nd {
    /* JADX INFO: Access modifiers changed from: private */
    public static final N0 b(Rd rd2, boolean z10) {
        return new N0(z10 ? N0.a.MANUAL : rd2.k().e() ? N0.a.AUTOMATIC_LOAD_WHILE_SHOW : N0.a.AUTOMATIC_LOAD_AFTER_CLOSE, rd2.k().j(), rd2.k().b(), -1L);
    }
}
