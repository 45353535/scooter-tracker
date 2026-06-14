package yads;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p33 {
    public static boolean a() {
        return Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread());
    }
}
