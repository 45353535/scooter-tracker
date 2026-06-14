package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Ascii;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i10, int i11, int i12, int i13, int i14) {
        this.startTimeIndex = i10;
        this.endTimeIndex = i11;
        this.styleIndex = i12;
        this.textIndex = i13;
        this.length = i14;
    }

    @Nullable
    public static SsaDialogueFormat fromFormatLine(String str) {
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i14].trim());
            lowerCase.getClass();
            switch (lowerCase) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i10, i11, i12, i13, strArrSplit.length);
    }
}
