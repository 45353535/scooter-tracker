package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fu extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2120 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2122 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<ed> f2124;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2123 = {37482, 40559, 35402, 46602, 40022, 36936, ';', 44215, 41138, 46231, 35031, 40114};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2121 = 657361988024863762L;

    public fu(List<ed> list) {
        this.f2124 = list;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6490(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2123[i10 + i12]) ^ (((long) i12) * f2121)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final String toString() {
        f2120 = (f2122 + 49) % 128;
        if (this.f2124 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6490(Gravity.getAbsoluteGravity(0, 0), (char) (TextUtils.indexOf("", "", 0, 0) + 37404), Color.red(0) + 4).intern());
            sb2.append(TextUtils.join(m6490(4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (Drawable.resolveOpacity(0, 0) + 40058), AndroidCharacter.getMirror('0') - '.').intern(), this.f2124));
            sb2.append(m6490(6 - Color.red(0), (char) TextUtils.getCapsMode("", 0, 0), -((byte) KeyEvent.getModifierMetaStateMask())).intern());
            return sb2.toString();
        }
        String strIntern = m6490(7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44224), 5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        int i10 = f2122 + 113;
        f2120 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 45 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo6475(du duVar, cq cqVar) {
        List<String> listAsList;
        Iterator<ed> it = this.f2124.iterator();
        while (true) {
            ek ekVarM6403 = null;
            if (!it.hasNext()) {
                return new dr(null);
            }
            f2120 = (f2122 + 115) % 128;
            ed next = it.next();
            if (next instanceof ek) {
                int i10 = f2120 + 67;
                f2122 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                ekVarM6403 = (ek) next;
            } else if (next instanceof dw) {
                ekVarM6403 = ((dw) next).m6403();
            }
            if (ekVarM6403 != null) {
                int i11 = f2120 + 83;
                f2122 = i11 % 128;
                if (i11 % 2 == 0) {
                    String[] strArr = new String[0];
                    strArr[1] = ekVarM6403.m6451();
                    listAsList = Arrays.asList(strArr);
                } else {
                    listAsList = Arrays.asList(ekVarM6403.m6451());
                }
                duVar.m6395(listAsList);
                f2122 = (f2120 + 37) % 128;
            }
            next.mo6401(duVar, cqVar);
        }
    }
}
