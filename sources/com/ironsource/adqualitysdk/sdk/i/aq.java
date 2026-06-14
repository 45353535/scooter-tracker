package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.ar;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class aq extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f381 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f382 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f383 = 68;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f384;

    public aq(ax axVar) {
        m4767("\u0002\u0002\u0003\ufff7\u0007\u0006\u0003\b\ufff7\ufff9", 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, 176 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m4767("\u0000", -TextUtils.indexOf((CharSequence) "", '0'), false, 1 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 184).intern());
        sb2.append(UUID.randomUUID().toString().replace(m4767("\u0000", -ImageFormat.getBitsPerPixel(0), false, -ImageFormat.getBitsPerPixel(0), 161 - AndroidCharacter.getMirror('0')).intern(), ""));
        this.f384 = sb2.toString();
        m4808(axVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m4766() {
        int i10 = f381 + 23;
        f382 = i10 % 128;
        if (i10 % 2 != 0) {
            JSONObject jSONObjectOptJSONObject = m4805().optJSONObject(m4767("\u0002\u0002\u0003\ufff7\u0007\u0006\u0003\b\ufff7\ufff9", Process.getGidForName("") + 43, true, 2 >>> TextUtils.indexOf("", ""), 9537 - (ViewConfiguration.getKeyRepeatDelay() / 17)).intern());
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject;
            }
        } else {
            JSONObject jSONObjectOptJSONObject2 = m4805().optJSONObject(m4767("\u0002\u0002\u0003\ufff7\u0007\u0006\u0003\b\ufff7\ufff9", Process.getGidForName("") + 11, true, 4 - TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 176).intern());
            if (jSONObjectOptJSONObject2 != null) {
                return jSONObjectOptJSONObject2;
            }
        }
        JSONObject jSONObject = new JSONObject();
        f381 = (f382 + 51) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4767(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f730) {
            try {
                char[] cArr2 = new char[i10];
                b.f728 = 0;
                while (true) {
                    int i13 = b.f728;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f729 = cArr[i13];
                    cArr2[b.f728] = (char) (b.f729 + i12);
                    int i14 = b.f728;
                    cArr2[i14] = (char) (cArr2[i14] - f383);
                    b.f728 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f731 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f731;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f731;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f728 = 0;
                    while (true) {
                        int i17 = b.f728;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f728 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m4768() {
        f382 = (f381 + 79) % 128;
        boolean zHas = m4805().has(m4767("\u0002\u0002\u0003\ufff7\u0007\u0006\u0003\b\ufff7\ufff9", (ViewConfiguration.getLongPressTimeout() >> 16) + 10, true, View.MeasureSpec.getSize(0) + 4, 175 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        int i10 = f381 + 51;
        f382 = i10 % 128;
        if (i10 % 2 == 0) {
            return zHas;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4769() {
        f381 = (f382 + 43) % 128;
        String strOptString = m4805().optString(m4767("\uffff\ufffe\u0003", TextUtils.getOffsetAfter("", 0) + 3, false, 3 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 175).intern(), this.f384);
        f381 = (f382 + 17) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4770(String str) {
        f382 = (f381 + 45) % 128;
        JSONObject jSONObjectOptJSONObject = m4766().optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            f381 = (f382 + 61) % 128;
            return jSONObjectOptJSONObject.optString(m4767("\u0003\u0003\ufffa\ufff8\t\u0004\u0007￫\ufffa\u0007\b\ufffe\u0004\u0003\ufff8\u0004", TextUtils.indexOf("", "", 0, 0) + 16, false, 14 - TextUtils.indexOf("", ""), KeyEvent.normalizeMetaState(0) + 175).intern());
        }
        int i10 = f382 + 75;
        f381 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
