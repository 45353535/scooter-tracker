package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private HevcConfig(List<byte[]> list, int i10, int i11, int i12, float f10, @Nullable String str, int i13, int i14, int i15) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i10;
        this.width = i11;
        this.height = i12;
        this.pixelWidthHeightRatio = f10;
        this.codecs = str;
        this.colorSpace = i13;
        this.colorRange = i14;
        this.colorTransfer = i15;
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
            float f10 = 1.0f;
            String strBuildHevcCodecString = null;
            int i20 = 0;
            int i21 = 0;
            while (i20 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i22 = i11;
                while (i22 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z11 = z10;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i23 = unsignedByte;
                    System.arraycopy(bArr2, i11, bArr, i21, bArr2.length);
                    int length = i21 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i22 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        i15 = h265SpsNalUnit.width;
                        i16 = h265SpsNalUnit.height;
                        int i24 = h265SpsNalUnit.colorSpace;
                        int i25 = h265SpsNalUnit.colorRange;
                        i10 = unsignedByte2;
                        i19 = h265SpsNalUnit.colorTransfer;
                        i17 = i24;
                        i18 = i25;
                        f10 = h265SpsNalUnit.pixelWidthHeightRatio;
                        strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                    } else {
                        i10 = unsignedByte2;
                    }
                    i21 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i22++;
                    z10 = z11;
                    unsignedByte = i23;
                    unsignedByte2 = i10;
                    i11 = 0;
                }
                i20++;
                i11 = 0;
            }
            return new HevcConfig(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i15, i16, f10, strBuildHevcCodecString, i17, i18, i19);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e10);
        }
    }
}
