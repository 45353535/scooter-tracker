package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oa2 {
    public static ma2 a() {
        return new ma2(true, new Handler(Looper.getMainLooper()));
    }
}
