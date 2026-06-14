package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2817dI {
    public static byte[] A05;
    public Executor A00 = XU.A06;
    public final C2820dL A01;
    public final InterfaceC2551Xn A02;
    public final YY A03;
    public final String A04;

    static {
        A04();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{5, Ascii.DC4, Ascii.DC4, 13, 8, 19, Ascii.US, Ascii.US, Ascii.ESC, Ascii.RS, -27, -38, -38, 34, 34, 34, -39, -48, Ascii.RS, -39, 17, Ascii.FF, Ascii.SO, Ascii.DLE, 13, Ascii.SUB, Ascii.SUB, Ascii.SYN, -39, Ascii.SO, Ascii.SUB, Ascii.CAN, -38, Ascii.FF, 32, Ascii.SI, Ascii.DC4, Ascii.DLE, Ascii.EM, Ascii.SO, Ascii.DLE, 10, Ascii.EM, Ascii.DLE, Ascii.US, 34, Ascii.SUB, Ascii.GS, Ascii.SYN, -38, Ascii.RS, Ascii.DLE, Ascii.GS, 33, Ascii.DLE, Ascii.GS, 10, Ascii.RS, Ascii.DC4, Ascii.SI, Ascii.DLE, 10, Ascii.GS, Ascii.DLE, 34, Ascii.FF, Ascii.GS, Ascii.SI, -31, -19, -19, -23, -20, -77, -88, -88, -16, -16, -16, -89, -33, -38, -36, -34, -37, -24, -24, -28, -89, -36, -24, -26, -88, -38, -18, -35, -30, -34, -25, -36, -34, -40, -25, -34, -19, -16, -24, -21, -28, -88, -20, -34, -21, -17, -34, -21, -40, -20, -30, -35, -34, -40, -21, -34, -16, -38, -21, -35, Ascii.DC4, 7, Ascii.US, 35, Ascii.CAN, 19, 42, 47, 35, Ascii.RS};
    }

    public C2817dI(C2820dL c2820dL, YY yy, String str, InterfaceC2551Xn interfaceC2551Xn) {
        this.A01 = c2820dL;
        this.A03 = yy;
        this.A04 = str;
        this.A02 = interfaceC2551Xn;
    }

    public static String A03(RewardData rewardData, String str, String str2) {
        String urlPrefix;
        if (rewardData != null) {
            String serverSideProxyURL = AdSettings.getUrlPrefix();
            if (serverSideProxyURL == null || serverSideProxyURL.isEmpty()) {
                urlPrefix = A02(68, 60, 45);
            } else {
                String urlPrefix2 = A02(5, 63, 95);
                urlPrefix = String.format(Locale.US, urlPrefix2, serverSideProxyURL);
            }
            Uri uriA00 = WQ.A00(urlPrefix);
            Uri.Builder uriBuilder = new Uri.Builder();
            String urlPrefix3 = uriA00.getScheme();
            uriBuilder.scheme(urlPrefix3);
            String urlPrefix4 = uriA00.getAuthority();
            uriBuilder.authority(urlPrefix4);
            String urlPrefix5 = uriA00.getPath();
            uriBuilder.path(urlPrefix5);
            String urlPrefix6 = uriA00.getQuery();
            uriBuilder.query(urlPrefix6);
            String urlPrefix7 = uriA00.getFragment();
            uriBuilder.fragment(urlPrefix7);
            String serverSideProxyURL2 = A02(134, 4, 110);
            String urlPrefix8 = rewardData.getUserID();
            uriBuilder.appendQueryParameter(serverSideProxyURL2, urlPrefix8);
            String serverSideProxyURL3 = A02(128, 2, 88);
            String urlPrefix9 = rewardData.getCurrency();
            uriBuilder.appendQueryParameter(serverSideProxyURL3, urlPrefix9);
            String urlPrefix10 = A02(130, 4, 99);
            uriBuilder.appendQueryParameter(urlPrefix10, str);
            String urlPrefix11 = A02(0, 5, 88);
            uriBuilder.appendQueryParameter(urlPrefix11, str2);
            String urlPrefix12 = uriBuilder.build().toString();
            return urlPrefix12;
        }
        return null;
    }

    public final void A05() {
        if (!TextUtils.isEmpty(this.A04)) {
            AsyncTaskC2919ex asyncTaskC2919ex = new AsyncTaskC2919ex(this.A01, new HashMap());
            asyncTaskC2919ex.A07(new EV(this));
            asyncTaskC2919ex.executeOnExecutor(this.A00, this.A04);
        }
    }
}
