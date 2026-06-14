package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes7.dex */
public final class DolbyVisionConfig {
    public final String codecs;
    public final int level;
    public final int profile;

    private DolbyVisionConfig(int i10, int i11, String str) {
        this.profile = i10;
        this.level = i11;
        this.codecs = str;
    }

    @Nullable
    public static DolbyVisionConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i10 = unsignedByte >> 1;
        int unsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(unsignedByte2 >= 10 ? "." : ".0");
        sb2.append(unsignedByte2);
        return new DolbyVisionConfig(i10, unsignedByte2, sb2.toString());
    }
}
