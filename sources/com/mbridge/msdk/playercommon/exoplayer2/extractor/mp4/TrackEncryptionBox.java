package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes10.dex */
public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;
    public final byte[] defaultInitializationVector;
    public final int initializationVectorSize;
    public final boolean isEncrypted;

    @Nullable
    public final String schemeType;

    public TrackEncryptionBox(boolean z10, @Nullable String str, int i10, byte[] bArr, int i11, int i12, @Nullable byte[] bArr2) {
        Assertions.checkArgument((bArr2 == null) ^ (i10 == 0));
        this.isEncrypted = z10;
        this.schemeType = str;
        this.initializationVectorSize = i10;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int schemeToCryptoMode(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(TAG, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
