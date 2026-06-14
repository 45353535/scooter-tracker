package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes10.dex */
public final class fm extends fi<String> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2081 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2082 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2083 = 320533002;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2084 = {0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2085 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2086 = 59;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2087 = -960068359;

    public fm(String str, dm dmVar) {
        super(dz.m6421(str), dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6477(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2086;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2084;
                    i14 = bArr != null ? (byte) (bArr[f2083 + i10] + i13) : (short) (f2085[f2083 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f2083 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f2087);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f2084;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f2085;
                            int i17 = o.f3018;
                            o.f3018 = i17 - 1;
                            o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                        }
                        sb2.append(o.f3021);
                        o.f3020 = o.f3021;
                        o.f3022++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fi
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6477(TextUtils.lastIndexOf("", '0', 0) - 320533001, (short) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionGroup(0L) + 960068393, (byte) (Gravity.getAbsoluteGravity(0, 0) - 16), (-58) - KeyEvent.getDeadChar(0, 0)).intern());
        sb2.append(super.toString());
        sb2.append(m6477((-320533002) - ExpandableListView.getPackedPositionGroup(0L), (short) (ViewConfiguration.getLongPressTimeout() >> 16), 960068393 - KeyEvent.normalizeMetaState(0), (byte) ((-16) - View.resolveSize(0, 0)), (-58) - ExpandableListView.getPackedPositionType(0L)).intern());
        String string = sb2.toString();
        int i10 = f2082 + 47;
        f2081 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 31 / 0;
        }
        return string;
    }
}
