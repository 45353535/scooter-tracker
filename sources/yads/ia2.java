package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ia2 {
    public static ma2 a(boolean z10) {
        return new ma2(z10, new Handler(Looper.getMainLooper()));
    }
}
