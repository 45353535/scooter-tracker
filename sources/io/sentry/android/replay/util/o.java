package io.sentry.android.replay.util;

import io.sentry.util.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final boolean a(z zVar, Double d10) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return d10 != null && d10.doubleValue() >= zVar.h();
    }
}
