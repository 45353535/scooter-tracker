package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21580a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21581b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f21582c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f21583d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f21584e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f21585f = {69, 87, 104, 121, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, 208, 243, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_W, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f21581b;
        if (i10 >= 3 || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f21585f;
        if (i12 >= 19) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f21584e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }
}
