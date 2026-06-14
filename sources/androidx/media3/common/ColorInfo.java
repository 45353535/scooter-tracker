package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class ColorInfo {
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;

    @Nullable
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;
    public static final ColorInfo SDR_BT709_LIMITED = new Builder().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();
    public static final ColorInfo SRGB_BT709_FULL = new Builder().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
    private static final String FIELD_COLOR_SPACE = Util.intToStringMaxRadix(0);
    private static final String FIELD_COLOR_RANGE = Util.intToStringMaxRadix(1);
    private static final String FIELD_COLOR_TRANSFER = Util.intToStringMaxRadix(2);
    private static final String FIELD_HDR_STATIC_INFO = Util.intToStringMaxRadix(3);
    private static final String FIELD_LUMA_BITDEPTH = Util.intToStringMaxRadix(4);
    private static final String FIELD_CHROMA_BITDEPTH = Util.intToStringMaxRadix(5);

    public static final class Builder {
        private int chromaBitdepth;
        private int colorRange;
        private int colorSpace;
        private int colorTransfer;

        @Nullable
        private byte[] hdrStaticInfo;
        private int lumaBitdepth;

        public ColorInfo build() {
            return new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, this.hdrStaticInfo, this.lumaBitdepth, this.chromaBitdepth);
        }

        @CanIgnoreReturnValue
        public Builder setChromaBitdepth(int i10) {
            this.chromaBitdepth = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorRange(int i10) {
            this.colorRange = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorSpace(int i10) {
            this.colorSpace = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorTransfer(int i10) {
            this.colorTransfer = i10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHdrStaticInfo(@Nullable byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLumaBitdepth(int i10) {
            this.lumaBitdepth = i10;
            return this;
        }

        public Builder() {
            this.colorSpace = -1;
            this.colorRange = -1;
            this.colorTransfer = -1;
            this.lumaBitdepth = -1;
            this.chromaBitdepth = -1;
        }

        private Builder(ColorInfo colorInfo) {
            this.colorSpace = colorInfo.colorSpace;
            this.colorRange = colorInfo.colorRange;
            this.colorTransfer = colorInfo.colorTransfer;
            this.hdrStaticInfo = colorInfo.hdrStaticInfo;
            this.lumaBitdepth = colorInfo.lumaBitdepth;
            this.chromaBitdepth = colorInfo.chromaBitdepth;
        }
    }

    private static String chromaBitdepthToString(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String colorRangeToString(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String colorSpaceToString(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String colorTransferToString(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return com.taurusx.tax.f.y.f66052c;
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static ColorInfo fromBundle(Bundle bundle) {
        return new ColorInfo(bundle.getInt(FIELD_COLOR_SPACE, -1), bundle.getInt(FIELD_COLOR_RANGE, -1), bundle.getInt(FIELD_COLOR_TRANSFER, -1), bundle.getByteArray(FIELD_HDR_STATIC_INFO), bundle.getInt(FIELD_LUMA_BITDEPTH, -1), bundle.getInt(FIELD_CHROMA_BITDEPTH, -1));
    }

    public static boolean isEquivalentToAssumedSdrDefault(@Nullable ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i10 = colorInfo.colorSpace;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = colorInfo.colorRange;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = colorInfo.colorTransfer;
        if ((i12 != -1 && i12 != 3) || colorInfo.hdrStaticInfo != null) {
            return false;
        }
        int i13 = colorInfo.chromaBitdepth;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = colorInfo.lumaBitdepth;
        return i14 == -1 || i14 == 8;
    }

    public static boolean isTransferHdr(@Nullable ColorInfo colorInfo) {
        if (colorInfo == null) {
            return false;
        }
        int i10 = colorInfo.colorTransfer;
        return i10 == 7 || i10 == 6;
    }

    public static int isoColorPrimariesToColorSpace(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int isoTransferCharacteristicsToColorTransfer(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String lumaBitdepthToString(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + Arrays.hashCode(this.hdrStaticInfo)) * 31) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        }
        return this.hashCode;
    }

    public boolean isBitdepthValid() {
        return (this.lumaBitdepth == -1 || this.chromaBitdepth == -1) ? false : true;
    }

    public boolean isDataSpaceValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    public boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_COLOR_SPACE, this.colorSpace);
        bundle.putInt(FIELD_COLOR_RANGE, this.colorRange);
        bundle.putInt(FIELD_COLOR_TRANSFER, this.colorTransfer);
        bundle.putByteArray(FIELD_HDR_STATIC_INFO, this.hdrStaticInfo);
        bundle.putInt(FIELD_LUMA_BITDEPTH, this.lumaBitdepth);
        bundle.putInt(FIELD_CHROMA_BITDEPTH, this.chromaBitdepth);
        return bundle;
    }

    public String toLogString() {
        String str;
        String invariant = isDataSpaceValid() ? Util.formatInvariant("%s/%s/%s", colorSpaceToString(this.colorSpace), colorRangeToString(this.colorRange), colorTransferToString(this.colorTransfer)) : "NA/NA/NA";
        if (isBitdepthValid()) {
            str = this.lumaBitdepth + "/" + this.chromaBitdepth;
        } else {
            str = "NA/NA";
        }
        return invariant + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(colorSpaceToString(this.colorSpace));
        sb2.append(", ");
        sb2.append(colorRangeToString(this.colorRange));
        sb2.append(", ");
        sb2.append(colorTransferToString(this.colorTransfer));
        sb2.append(", ");
        sb2.append(this.hdrStaticInfo != null);
        sb2.append(", ");
        sb2.append(lumaBitdepthToString(this.lumaBitdepth));
        sb2.append(", ");
        sb2.append(chromaBitdepthToString(this.chromaBitdepth));
        sb2.append(")");
        return sb2.toString();
    }

    private ColorInfo(int i10, int i11, int i12, @Nullable byte[] bArr, int i13, int i14) {
        this.colorSpace = i10;
        this.colorRange = i11;
        this.colorTransfer = i12;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i13;
        this.chromaBitdepth = i14;
    }
}
