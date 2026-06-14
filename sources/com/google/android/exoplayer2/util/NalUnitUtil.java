package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int NAL_UNIT_TYPE_AUD = 9;
    public static final int NAL_UNIT_TYPE_IDR = 5;
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int NAL_UNIT_TYPE_PPS = 8;
    public static final int NAL_UNIT_TYPE_SEI = 6;
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    public static final class H265SpsData {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;
        public final int height;
        public final float pixelWidthHeightRatio;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10, int i17, int i18, int i19) {
            this.generalProfileSpace = i10;
            this.generalTierFlag = z10;
            this.generalProfileIdc = i11;
            this.generalProfileCompatibilityFlags = i12;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i13;
            this.seqParameterSetId = i14;
            this.width = i15;
            this.height = i16;
            this.pixelWidthHeightRatio = f10;
            this.colorSpace = i17;
            this.colorRange = i18;
            this.colorTransfer = i19;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i10, int i11, boolean z10) {
            this.picParameterSetId = i10;
            this.seqParameterSetId = i11;
            this.bottomFieldPicOrderInFramePresentFlag = z10;
        }
    }

    public static final class SpsData {
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.profileIdc = i10;
            this.constraintsFlagsAndReservedZero2Bits = i11;
            this.levelIdc = i12;
            this.seqParameterSetId = i13;
            this.maxNumRefFrames = i14;
            this.width = i15;
            this.height = i16;
            this.pixelWidthHeightRatio = f10;
            this.separateColorPlaneFlag = z10;
            this.frameMbsOnlyFlag = z11;
            this.frameNumLength = i17;
            this.picOrderCountType = i18;
            this.picOrderCntLsbLength = i19;
            this.deltaPicOrderAlwaysZeroFlag = z12;
        }
    }

    private NalUnitUtil() {
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & Ascii.US) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static int findNalUnit(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        Assertions.checkState(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            clearPrefixFlags(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    clearPrefixFlags(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int getH265NalUnitType(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static boolean isNalUnitSei(@Nullable String str, byte b10) {
        return ("video/avc".equals(str) && (b10 & Ascii.US) == 6) || ("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39);
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseH265SpsNalUnitPayload(bArr, i10 + 2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.util.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.NalUnitUtil.parseH265SpsNalUnitPayload(byte[], int, int):com.google.android.exoplayer2.util.NalUnitUtil$H265SpsData");
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i10, int i11) {
        return parsePpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseSpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    public static SpsData parseSpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        int unsignedExpGolombCodedInt;
        boolean bit;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int unsignedExpGolombCodedInt2;
        int i14;
        int i15;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        int bits = parsableNalUnitBitArray.readBits(8);
        int bits2 = parsableNalUnitBitArray.readBits(8);
        int bits3 = parsableNalUnitBitArray.readBits(8);
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (bits == 100 || bits == 110 || bits == 122 || bits == 244 || bits == 44 || bits == 83 || bits == 86 || bits == 118 || bits == 128 || bits == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bit = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i16 = unsignedExpGolombCodedInt != 3 ? 8 : 12;
                int i17 = 0;
                while (i17 < i16) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i17 < 6 ? 16 : 64);
                    }
                    i17++;
                }
            }
        } else {
            unsignedExpGolombCodedInt = 1;
            bit = false;
        }
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt5 == 0) {
            i12 = 1;
            z10 = bit;
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
            i13 = 16;
            z11 = false;
        } else {
            if (unsignedExpGolombCodedInt5 == 1) {
                boolean bit2 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                z10 = bit;
                long unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                i12 = 1;
                i13 = 16;
                for (int i18 = 0; i18 < unsignedExpGolombCodedInt6; i18++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z11 = bit2;
            } else {
                i12 = 1;
                z10 = bit;
                i13 = 16;
                z11 = false;
            }
            unsignedExpGolombCodedInt2 = 0;
        }
        int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        boolean bit3 = parsableNalUnitBitArray.readBit();
        int i19 = (2 - (bit3 ? 1 : 0)) * unsignedExpGolombCodedInt9;
        if (!bit3) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        int i20 = unsignedExpGolombCodedInt8 * 16;
        int i21 = i19 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 0) {
                i15 = 2 - (bit3 ? 1 : 0);
            } else {
                if (unsignedExpGolombCodedInt == 3) {
                    i14 = i12;
                } else {
                    i14 = i12;
                    i12 = 2;
                }
                i15 = (2 - (bit3 ? 1 : 0)) * (unsignedExpGolombCodedInt != i14 ? i14 : 2);
            }
            i20 -= (unsignedExpGolombCodedInt10 + unsignedExpGolombCodedInt11) * i12;
            i21 -= (unsignedExpGolombCodedInt12 + unsignedExpGolombCodedInt13) * i15;
        }
        float f10 = 1.0f;
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            int bits4 = parsableNalUnitBitArray.readBits(8);
            if (bits4 == 255) {
                int i22 = i13;
                int bits5 = parsableNalUnitBitArray.readBits(i22);
                int bits6 = parsableNalUnitBitArray.readBits(i22);
                if (bits5 != 0 && bits6 != 0) {
                    f10 = bits5 / bits6;
                }
            } else {
                float[] fArr = ASPECT_RATIO_IDC_VALUES;
                if (bits4 < fArr.length) {
                    f10 = fArr[bits4];
                } else {
                    Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits4);
                }
            }
        }
        return new SpsData(bits, bits2, bits3, unsignedExpGolombCodedInt3, unsignedExpGolombCodedInt7, i20, i21, f10, z10, bit3, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt2, z11);
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i10) {
        int signedExpGolombCodedInt = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i11) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i11 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < unsignedExpGolombCodedInt; i12++) {
            if (i12 == 0 || !parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr2 = new int[unsignedExpGolombCodedInt2];
                for (int i13 = 0; i13 < unsignedExpGolombCodedInt2; i13++) {
                    iArr2[i13] = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                }
                int[] iArr3 = new int[unsignedExpGolombCodedInt3];
                for (int i14 = 0; i14 < unsignedExpGolombCodedInt3; i14++) {
                    iArr3[i14] = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                }
                i10 = unsignedExpGolombCodedInt2;
                iArr = iArr2;
                i11 = unsignedExpGolombCodedInt3;
                iArrCopyOf = iArr3;
            } else {
                int i15 = i10 + i11;
                int unsignedExpGolombCodedInt4 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i16 = i15 + 1;
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 <= i15; i17++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        zArr[i17] = true;
                    } else {
                        zArr[i17] = parsableNalUnitBitArray.readBit();
                    }
                }
                int[] iArr4 = new int[i16];
                int[] iArr5 = new int[i16];
                int i18 = 0;
                for (int i19 = i11 - 1; i19 >= 0; i19--) {
                    int i20 = iArrCopyOf[i19] + unsignedExpGolombCodedInt4;
                    if (i20 < 0 && zArr[i10 + i19]) {
                        iArr4[i18] = i20;
                        i18++;
                    }
                }
                if (unsignedExpGolombCodedInt4 < 0 && zArr[i15]) {
                    iArr4[i18] = unsignedExpGolombCodedInt4;
                    i18++;
                }
                for (int i21 = 0; i21 < i10; i21++) {
                    int i22 = iArr[i21] + unsignedExpGolombCodedInt4;
                    if (i22 < 0 && zArr[i21]) {
                        iArr4[i18] = i22;
                        i18++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i18);
                int i23 = 0;
                for (int i24 = i10 - 1; i24 >= 0; i24--) {
                    int i25 = iArr[i24] + unsignedExpGolombCodedInt4;
                    if (i25 > 0 && zArr[i24]) {
                        iArr5[i23] = i25;
                        i23++;
                    }
                }
                if (unsignedExpGolombCodedInt4 > 0 && zArr[i15]) {
                    iArr5[i23] = unsignedExpGolombCodedInt4;
                    i23++;
                }
                for (int i26 = 0; i26 < i11; i26++) {
                    int i27 = iArrCopyOf[i26] + unsignedExpGolombCodedInt4;
                    if (i27 > 0 && zArr[i10 + i26]) {
                        iArr5[i23] = i27;
                        i23++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i23);
                iArr = iArrCopyOf2;
                i10 = i18;
                i11 = i23;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i10) {
        int i11;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i12 = 0;
            while (iFindNextUnescapeIndex < i10) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i10);
                    if (iFindNextUnescapeIndex < i10) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i12) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i12] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = scratchEscapePositions[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }
}
