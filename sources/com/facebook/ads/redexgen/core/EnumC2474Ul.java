package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2474Ul {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, -123, -122, -123, 124};
    }

    static {
        A02();
    }

    EnumC2474Ul(long j10, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j10;
        this.A01 = mediaCacheFlag;
    }

    @Nullable
    public static EnumC2474Ul A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (EnumC2474Ul enumC2474Ul : values()) {
            if (enumC2474Ul.A01 == mediaCacheFlag) {
                return enumC2474Ul;
            }
        }
        return null;
    }
}
