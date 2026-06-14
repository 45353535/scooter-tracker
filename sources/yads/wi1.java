package yads;

import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wi1 {
    @DoNotInline
    public static void a(mi1 mi1Var, wc2 wc2Var) {
        vc2 vc2Var = wc2Var.f117396a;
        vc2Var.getClass();
        LogSessionId logSessionId = vc2Var.f116962a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        mi1Var.f113510b.setString("log-session-id", logSessionId.getStringId());
    }
}
