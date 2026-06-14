package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes10.dex */
public final class al {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f323 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f324;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f325;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f326 = m4723("\u0006\u0013\uffd0\u000f\u0007\u0006\u000b\u0003\u0016\u000b\u0011\u0010\uffd0\u0017\u0010\u000b\u0016\u001bￕ\u0006\uffd0\u0005\u0011\u000f\n\u0016\u0016\u0012\u0015ￜ\uffd1\uffd1\u000bￏ\u0003", TextUtils.indexOf("", "", 0) + 35, false, 23 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionChild(0) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE).intern();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f327 = m4723("\u0015ￜ\uffd1\uffd1\u0011ￏ\u0003\u0006\u0013\uffd0\u000f\u0007\u0006\u000b\u0003\u0016\u000b\u0011\u0010\uffd0\u0017\u0010\u000b\u0016\u001bￕ\u0006\uffd0\u0005\u0011\u000f\n\u0016\u0016\u0012", 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, View.resolveSize(0, 0) + 31, 212 - TextUtils.getOffsetBefore("", 0)).intern();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f328 = m4723("\uffd0\u0010\u0011\u000b\u0016\u0003\u000b\u0006\u0007\u000f\uffd0\u0013\u0006\u0003ￏ\u0003\uffd1\uffd1ￜ\u0015\u0012\u0016\u0016\n\u000f\u0011\u0005\uffd0\u0006ￕ\u001b\u0016\u000b\u0010\u0017", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 35, true, 24 - (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE).intern();

    static {
        m4721();
        m4723("\ufffa\u0019￦￡ￖ\ufff9￬\u0007\u0004\ufff2,$\ufff8\u0019\u0016", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, true, ImageFormat.getBitsPerPixel(0) + 4, 193 - Color.blue(0)).intern();
        int i10 = f325 + 63;
        f323 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public al() {
        m4723("\u0005\u0003\u0001\u0012\u0014\u0002\u0004ￎ\u0016\u000bￎ\u000b\u0003\u0001\u0002", 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, TextUtils.getOffsetAfter("", 0) + 5, (KeyEvent.getMaxKeyCode() >> 16) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE).intern();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m4721() {
        f324 = 118;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4722(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            f325 = (f323 + 1) % 128;
            str = "";
        }
        sb2.append(str);
        sb2.append(m4723("\u0000", 1 - TextUtils.indexOf("", "", 0, 0), true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 165).intern());
        if (str2 != null) {
            f323 = (f325 + 81) % 128;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m4724(String str) {
        int i10 = f325 + 87;
        f323 = i10 % 128;
        if (i10 % 2 != 0) {
            return m4722(this.f326, str);
        }
        int i11 = 84 / 0;
        return m4722(this.f326, str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m4725() {
        int i10 = f325 + 81;
        int i11 = i10 % 128;
        f323 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f326;
        f325 = (i11 + 51) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m4727(String str) {
        f325 = (f323 + 81) % 128;
        String strM4722 = m4722(this.f327, str);
        f323 = (f325 + 85) % 128;
        return strM4722;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m4720() {
        int i10 = f323 + 83;
        f325 = i10 % 128;
        return (i10 % 2 != 0 ? m4723("\u0005\u0003\u0001\u0012\u0014\u0002\u0004ￎ\u0016\u000bￎ\u000b\u0003\u0001\u0002", 113 >>> Process.getGidForName(""), false, 3 / (TypedValue.complexToFloat(1) > 1.0f ? 1 : (TypedValue.complexToFloat(1) == 1.0f ? 0 : -1)), 7407 >> Color.alpha(1)) : m4723("\u0005\u0003\u0001\u0012\u0014\u0002\u0004ￎ\u0016\u000bￎ\u000b\u0003\u0001\u0002", Process.getGidForName("") + 16, true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, 214 - Color.alpha(0))).intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4723(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f324);
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4726() {
        int i10 = f323;
        String str = this.f328;
        int i11 = i10 + 111;
        f325 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
