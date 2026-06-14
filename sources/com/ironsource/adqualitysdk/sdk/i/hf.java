package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class hf extends hb<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2332 = {'9', 'p', 'q', 'j', 'i', 'p', 'i', 'd', 'T', '[', 'k', 'i', 'i', 'l', 's', 'n', 'Z', ']', 'n', 'l', 'n', 'l', 'h', 'n', 'n', 'n', 'Y', 'X', '^', 'L', 175, 198, 196, 196, 157, 152, 191, 155, 154, 180, 175, 171, 174, 194, 199, 192, 189, 189, 191, 157, 155, 194, 172, 173, 194, 194, 194, 188, 192, 194, 192, 194};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2333 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2334 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private b f2335;

    public interface b {
        /* JADX INFO: renamed from: ﻛ */
        void mo6124(hf hfVar, MediaPlayer mediaPlayer);
    }

    public hf(MediaPlayer.OnCompletionListener onCompletionListener, b bVar) {
        super(onCompletionListener);
        this.f2335 = bVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6536(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2332, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i10 = f2333 + 89;
        f2334 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m7160(m6536(new int[]{0, 29, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001", true).intern(), m6536(new int[]{29, 33, 84, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001", false).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2335.mo6124(this, mediaPlayer);
            throw null;
        }
        this.f2335.mo6124(this, mediaPlayer);
        if (mo5030() != null) {
            int i11 = f2333 + 55;
            f2334 = i11 % 128;
            if (i11 % 2 != 0) {
                mo5030().onCompletion(mediaPlayer);
            } else {
                mo5030().onCompletion(mediaPlayer);
                throw null;
            }
        }
    }
}
