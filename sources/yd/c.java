package yd;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {
    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper()");
        super(mainLooper);
    }
}
