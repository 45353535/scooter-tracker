package com.appodeal.ads.regulator;

import com.ironsource.C4240b4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f14351a;

    public c(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f14351a = cause;
    }

    public final String toString() {
        return "OnError [cause: " + this.f14351a + C4240b4.j.f42674e;
    }
}
