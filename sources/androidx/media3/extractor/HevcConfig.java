package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private HevcConfig(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i10;
        this.width = i11;
        this.height = i12;
        this.bitdepthLuma = i13;
        this.bitdepthChroma = i14;
        this.colorSpace = i15;
        this.colorRange = i16;
        this.colorTransfer = i17;
        this.pixelWidthHeightRatio = f10;
        this.maxNumReorderPics = i18;
        this.codecs = str;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        boolean z10;
        int i10;
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i12 >= unsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i14 = 0; i14 < unsignedShort; i14++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i13 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i12++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i13];
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            float f10 = 1.0f;
            String strBuildHevcCodecString = null;
            int i23 = 0;
            int i24 = 0;
            while (i23 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i25 = i11;
                while (i25 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z11 = z10;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i26 = unsignedByte;
                    System.arraycopy(bArr2, i11, bArr, i24, bArr2.length);
                    int length = i24 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i25 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        i15 = h265SpsNalUnit.width;
                        i16 = h265SpsNalUnit.height;
                        i17 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i18 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i27 = h265SpsNalUnit.colorSpace;
                        int i28 = h265SpsNalUnit.colorRange;
                        i10 = unsignedByte2;
                        int i29 = h265SpsNalUnit.colorTransfer;
                        float f11 = h265SpsNalUnit.pixelWidthHeightRatio;
                        int i30 = h265SpsNalUnit.maxNumReorderPics;
                        strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                        f10 = f11;
                        i22 = i30;
                        i20 = i28;
                        i21 = i29;
                        i19 = i27;
                    } else {
                        i10 = unsignedByte2;
                    }
                    i24 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i25++;
                    z10 = z11;
                    unsignedByte = i26;
                    unsignedByte2 = i10;
                    i11 = 0;
                }
                i23++;
                i11 = 0;
            }
            return new HevcConfig(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i15, i16, i17, i18, i19, i20, i21, f10, i22, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e10);
        }
    }
}
