package u9;

import androidx.media3.exoplayer.RendererCapabilities;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j0 {
    public static int a(int i10) {
        return b(i10, 0, 0, 0);
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return d(i10, i11, i12, 0, 128, i13);
    }

    public static int c(int i10, int i11, int i12, int i13, int i14) {
        return d(i10, i11, i12, i13, i14, 0);
    }

    public static int d(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    public static int e(int i10) {
        return i10 & 24;
    }

    public static int f(int i10) {
        return i10 & RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK;
    }

    public static int g(int i10) {
        return i10 & 384;
    }

    public static int h(int i10) {
        return i10 & 7;
    }

    public static int i(int i10) {
        return i10 & 64;
    }

    public static int j(int i10) {
        return i10 & 32;
    }

    public static boolean k(int i10, boolean z10) {
        int iH = h(i10);
        if (iH != 4) {
            return z10 && iH == 3;
        }
        return true;
    }
}
