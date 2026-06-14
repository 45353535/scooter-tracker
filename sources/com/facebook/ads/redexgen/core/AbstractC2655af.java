package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2655af {
    public static byte[] A00;
    public static String[] A01 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-73, -32, 10, -73, -32, 5, 10, Ascii.VT, -8, 5, Ascii.VT, -73, -2, -8, 4, -4, 10, -73, -8, 3, 3, 6, Ascii.SO, -4, -5, -47, -73, -121, -80, -38, -121, -80, -43, -38, -37, -56, -43, -37, -121, -50, -56, -44, -52, -38, -95, -121, -57, Ascii.SO, Ascii.SYN, Ascii.SYN, Ascii.SO, 19, Ascii.FF, -57, 13, 8, 19, 19, 9, 8, 10, Ascii.DC2, -57, Ascii.FS, Ascii.EM, 19, -57, 8, Ascii.GS, 8, Ascii.DLE, 19, 8, 9, 19, Ascii.FF, -31, -57, 79, -104, -94, -126, -93, -98, -95, -108, 105, 79, 90, -95, -9, -22, -27, -26, -16, -95, -10, -13, -19, -95, -22, -12, -95, -17, -10, -19, -19, -69, -95, 4, Ascii.DLE, Ascii.SO, -49, 7, 2, 4, 6, 3, Ascii.DLE, Ascii.DLE, Ascii.FF, -49, Ascii.FF, 2, Ascii.NAK, 2, Ascii.SI, 2, -42, -41, -46, -43, -56, -35, -34, -39, -36, -49, -55, -33, -36, -42, -55, -31, -49, -52, -55, -48, -53, -42, -42, -52, -53, -51, -43, -30, -43, -48, -47, -37, -53, -31, -34, -40};
        String[] strArr = A01;
        if (strArr[5].charAt(19) != strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "ump74";
        strArr2[2] = "QJx5Vwz5z";
    }

    static {
        A02();
    }

    public static AbstractC2654ae A00(C2658ai c2658ai, Bundle bundle, boolean z10) {
        AbstractC2654ae c2197Jp;
        c2658ai.A06().A0H().A00(false);
        C2274Mp c2274MpA20 = c2658ai.A05().A20();
        double dA00 = AbstractC2645aV.A00(c2274MpA20);
        boolean isWatchAndBrowse = c2658ai.A05().A20().A0T();
        boolean zA06 = AbstractC2645aV.A06(c2658ai.A00(), c2658ai.A01(), dA00);
        MH mhA00 = MI.A00(c2658ai.A06(), c2658ai.A07(), A01(0, 0, 8), WQ.A00(c2658ai.A05().A20().A0J().A05()), new HashMap(), c2658ai.A05().A21());
        boolean z11 = !TextUtils.isEmpty(c2274MpA20.A0H().A09());
        if (U7.A1u(c2658ai.A06())) {
            C2820dL c2820dLA06 = c2658ai.A06();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            c2820dLA06.A0B().AK2(c2658ai.A02(), c2658ai.A05().A25(), z11);
        }
        boolean zA04 = A04(c2658ai, z11);
        if ((isWatchAndBrowse && (mhA00 instanceof C7O)) || zA04) {
            c2197Jp = A03(c2658ai) ? new C2174Is(c2658ai) : new JU(c2658ai, zA04);
        } else if (z11) {
            c2197Jp = new C18385d(c2658ai);
        } else {
            if (c2658ai.A05().A1U()) {
                return new C2205Jx(c2658ai);
            }
            if (c2658ai.A05().A1b()) {
                c2197Jp = new C18405f(c2658ai);
            } else if (U7.A2a(c2658ai.A06())) {
                c2197Jp = new C18395e(c2658ai, zA06);
            } else if (zA06) {
                c2197Jp = new C2202Ju(c2658ai, c2658ai.A00() == 2);
            } else {
                c2197Jp = new C2197Jp(c2658ai, AbstractC2645aV.A04(dA00));
            }
        }
        if (z10) {
            c2197Jp.A1G(c2274MpA20, c2658ai.A05().A25(), dA00, bundle);
        }
        return c2197Jp;
    }

    public static boolean A03(C2658ai c2658ai) {
        if (!c2658ai.A05().A1o()) {
            boolean zA1U = c2658ai.A05().A1U();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "BfXu055milBajq8QiXDIPY7ZZDWb7rZy";
            strArr2[7] = "zfsTxDhfKJjHYbZVz1DIv6IoDbSXcVhK";
            if (!zA1U) {
                return false;
            }
        }
        return true;
    }

    public static boolean A04(C2658ai c2658ai, boolean z10) {
        boolean z11 = false;
        if (!c2658ai.A05().A1r() || !z10) {
            return false;
        }
        Uri uriA00 = WQ.A00(c2658ai.A05().A20().A0J().A05());
        String authority = uriA00.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            c2658ai.A06().A0F().ABk();
            return false;
        }
        boolean isInstantGamesEnabled = authority.equals(A01(128, 5, 58));
        boolean isInstantGames = uriA00.getQueryParameter(A01(ModuleDescriptor.MODULE_VERSION, 9, 67)) == null;
        String queryParameter = uriA00.getQueryParameter(A01(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 65));
        boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(c2658ai.A05().A0w());
        boolean zEquals = c2658ai.A06().getPackageName().equals(A01(109, 19, 120));
        boolean zA1s = c2658ai.A05().A1s();
        if (isInstantGamesEnabled && isInstantGames && isGoogleFallBackUrlAvailable && (!zEquals || zA1s)) {
            z11 = true;
        }
        if (!z11 && Build.VERSION.SDK_INT >= 24) {
            c2658ai.A06().A0F().ABj(A01(78, 11, 6) + isInstantGamesEnabled + A01(89, 20, 88) + isInstantGames + A01(46, 32, 126) + isGoogleFallBackUrlAvailable + A01(27, 19, 62) + zEquals + A01(0, 27, 110) + zA1s);
        }
        return z11;
    }
}
