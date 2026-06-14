package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class he extends hb<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2327 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2328;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private a f2331;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2330 = {36373, 13679, 63676, 48185, 25427, 9965, 59929, 37205, 21735, 6157, 57240, 33498, 18029, 3505, 45253, 29793, 15247, 65315, 41592, 27134, 11557, 53314, 38906, 23318, 7846, 50646, 35094, 'E', 47913, 30404, 12926, 60702, 43239, 25675, 7955, 56056, 38494, 20954, 3211, 51208, 33782, 16009, 64033, 46549, 29029, 11267, 59315, 41788, 24088, 6588, 54653, 37114, 19334, 1870, 49912, 32134, 14634, 62670};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2329 = 2253410054340262747L;

    public interface a {
        /* JADX INFO: renamed from: ﻐ */
        void mo6120(he heVar, MediaPlayer mediaPlayer);
    }

    public he(MediaPlayer.OnPreparedListener onPreparedListener, a aVar) {
        super(onPreparedListener);
        this.f2331 = aVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6535(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2330[i10 + i12]) ^ (((long) i12) * f2329)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        f2327 = (f2328 + 89) % 128;
        try {
            this.f2331.mo6120(this, mediaPlayer);
            f2328 = (f2327 + 39) % 128;
        } catch (Throwable th2) {
            kd.m7160(m6535((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (36443 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 26 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m6535(View.MeasureSpec.makeMeasureSpec(0, 0) + 27, (char) Color.red(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30).intern(), th2, false);
        }
        if (mo5030() != null) {
            f2327 = (f2328 + 33) % 128;
            mo5030().onPrepared(mediaPlayer);
        }
    }
}
