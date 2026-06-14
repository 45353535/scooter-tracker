package yads;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hw0 {
    @DoNotInline
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    @DoNotInline
    public static void a(MediaDrm mediaDrm, byte[] bArr, wc2 wc2Var) {
        vc2 vc2Var = wc2Var.f117396a;
        vc2Var.getClass();
        LogSessionId logSessionId = vc2Var.f116962a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionId);
    }
}
