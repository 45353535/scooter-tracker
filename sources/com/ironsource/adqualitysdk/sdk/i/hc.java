package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes10.dex */
public final class hc extends hb<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2318 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2320;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private c f2321;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2317 = {40565, 65198, 24455, 48314, 7604, 31415, 56234, 14469, 39321, 63108, 22427, 46314, 5607, 29434, 54226, 12537, 37369, 61135, 20444, 44245, 3526, 27351, 52020, 53531, 45526, 4312, 62431, 21188, 13724, 38123, 30694, 54958, 47609, 6350, 64386, 23210, 15749, 40065, 32652, 56987, 41386, 175, 58274, 17142, 9651, 33868, 26465, 50752, 43346, 2133};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2319 = 3752853498850926842L;

    public interface c {
        /* JADX INFO: renamed from: ﻐ */
        boolean mo6123(hc hcVar, MediaPlayer mediaPlayer, int i10, int i11);
    }

    public hc(MediaPlayer.OnInfoListener onInfoListener, c cVar) {
        super(onInfoListener);
        this.f2321 = cVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6533(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2317[i10 + i12]) ^ (((long) i12) * f2319)) ^ ((long) c10));
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

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        int i12 = f2318 + 107;
        f2320 = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                this.f2321.mo6123(this, mediaPlayer, i10, i11);
                int i13 = 57 / 0;
            } else {
                this.f2321.mo6123(this, mediaPlayer, i10, i11);
            }
        } catch (Throwable th2) {
            kd.m7160(m6533(KeyEvent.getDeadChar(0, 0), (char) (40506 - View.resolveSize(0, 0)), 23 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m6533((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, (char) (View.MeasureSpec.getMode(0) + 53598), 27 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th2, false);
        }
        if (mo5030() != null) {
            return mo5030().onInfo(mediaPlayer, i10, i11);
        }
        f2318 = (f2320 + 5) % 128;
        return false;
    }
}
