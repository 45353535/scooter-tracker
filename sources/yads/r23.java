package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class r23 implements hv {
    public final u23 a(Looper looper, Handler.Callback callback) {
        return new u23(new Handler(looper, callback));
    }
}
