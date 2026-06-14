package yads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class me0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f113446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f113448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public le0 f113449d;

    public me0(Spatializer spatializer) {
        this.f113446a = spatializer;
        this.f113447b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public final boolean a(yv0 yv0Var, hk hkVar) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(w83.a(("audio/eac3-joc".equals(yv0Var.f118398m) && yv0Var.f118411z == 16) ? 12 : yv0Var.f118411z));
        int i10 = yv0Var.A;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.f113446a;
        if (hkVar.f111613g == null) {
            hkVar.f111613g = new gk(hkVar);
        }
        return spatializer.canBeSpatialized(hkVar.f111613g.f111232a, channelMask.build());
    }

    public final boolean b() {
        return this.f113446a.isEnabled();
    }

    public final void c() {
        le0 le0Var = this.f113449d;
        if (le0Var == null || this.f113448c == null) {
            return;
        }
        this.f113446a.removeOnSpatializerStateChangedListener(le0Var);
        Handler handler = this.f113448c;
        int i10 = w83.f117341a;
        handler.removeCallbacksAndMessages(null);
        this.f113448c = null;
        this.f113449d = null;
    }

    public final void a(re0 re0Var, Looper looper) {
        if (this.f113449d == null && this.f113448c == null) {
            this.f113449d = new le0(re0Var);
            Handler handler = new Handler(looper);
            this.f113448c = handler;
            this.f113446a.addOnSpatializerStateChangedListener(new androidx.emoji2.text.a(handler), this.f113449d);
        }
    }

    public final boolean a() {
        return this.f113446a.isAvailable();
    }

    public static me0 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new me0(audioManager.getSpatializer());
    }
}
