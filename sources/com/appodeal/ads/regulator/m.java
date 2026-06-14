package com.appodeal.ads.regulator;

import com.ironsource.C4240b4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f14363a;

    public m(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f14363a = cause;
    }

    public final String toString() {
        return "Failure [cause: " + this.f14363a + C4240b4.j.f42674e;
    }
}
