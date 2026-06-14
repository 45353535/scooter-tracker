package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2742c4 {
    public static byte[] A00;
    public static String[] A01 = {"qx9J4yAnPXaVyRX1wkhfMyD35E0bVkcp", "bG7a76MJuQYCTQVI4bECP0jat3LYDm8S", "3sji", "WOIjjsVKw0oGTZJ8bV1Eiv07MXmRBJ4e", "zigTdk", "jLtidcNh89Szai5k4uiuh5UaOWCNfF4m", "9OqLRA6IbqecmBl4IJChXH2akamtN0Bd", "1PwXl0SmV68MCkNjB88Y7o3DlBd3CbFY"};
    public static final String A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
            String[] strArr = A01;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "3GrjuQcpYdFWBcs25Ezt7MBLI0wjxHRp";
            strArr2[7] = "nD922LhxjrSAIQnDmHWR8rAyvz5NrvSF";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-71, -41, -39, -34, -37, -106, -29, -33, -23, -23, -106, -36, -27, -24, -106, -36, -33, -30, -37, -106, -21, -24, -30, -80, -106, Ascii.DC2, 48, 50, 55, 52, -17, 60, 56, 66, 66, -17, 53, 62, 65, -17, 56, 60, 48, 54, 52, -17, 68, 65, 59, 9, -17, -47, -43, -32, -24, Ascii.NAK, Ascii.NAK, Ascii.DC2, Ascii.NAK, -61, Ascii.DC2, 19, 8, 17, Ascii.FF, 17, 10, -61, 6, 4, 6, Ascii.VT, 8, 7, -61, 9, Ascii.FF, Ascii.SI, 8, -61, 9, Ascii.DC2, Ascii.NAK, -61, Ascii.CAN, Ascii.NAK, Ascii.SI, -35, -61, -36, -40, -41, Ascii.VT, -6, -1, -5, 4, -7, -5, -28, -5, 10, 13, 5, 8, 1, -17, -21, -46, -12, -15, -27, -25, -11, -11, -21, -16, -23, -94, -24, -21, -18, -25, -94, -9, -12, -18, -68, -94, -16, Ascii.DC2, Ascii.SI, 3, 5, 19, 19, 9, Ascii.SO, 7, -64, 9, 13, 1, 7, 5, -64, Ascii.NAK, Ascii.DC2, Ascii.FF, -38, -64, 34, 68, 65, 53, 55, 69, 69, 59, SignedBytes.MAX_POWER_OF_TWO, 57, -14, 72, 59, 54, 55, 65, -14, 71, 68, 62, Ascii.FF, -14, Ascii.SI, Ascii.RS, Ascii.ETB, -19, -8, -9, -12, -18};
    }

    static {
        A04();
        A02 = C2742c4.class.getSimpleName();
    }

    public static WebResourceResponse A00(C2820dL c2820dL, SF sf2, WebResourceRequest webResourceRequest, C2740c2 c2740c2, boolean z10) {
        String string = webResourceRequest.getUrl().toString();
        if (c2740c2.A05) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(string);
            if (c2740c2.A01.contains(string)) {
                StringBuilder sb2 = new StringBuilder();
                String url = A03(108, 21, 31);
                sb2.append(url).append(string).toString();
                File cachedFile = sf2.A0P(string);
                if (cachedFile != null) {
                    if (z10) {
                        String url2 = c2740c2.A00;
                        if (string.equals(url2)) {
                            return A02(map, strGuessContentTypeFromName, new C2734bw(c2820dL.A02(), new FileInputStream(cachedFile), new I1(c2820dL, string)));
                        }
                    }
                    return A01(map, strGuessContentTypeFromName, cachedFile);
                }
                StringBuilder sb3 = new StringBuilder();
                String url3 = A03(0, 25, 19);
                sb3.append(url3).append(string).toString();
            }
            if (c2740c2.A02.contains(string)) {
                StringBuilder sb4 = new StringBuilder();
                String url4 = A03(129, 22, 61);
                sb4.append(url4).append(string).toString();
                File fileA0Q = sf2.A0Q(string);
                if (fileA0Q != null) {
                    return A01(map, strGuessContentTypeFromName, fileA0Q);
                }
                StringBuilder sb5 = new StringBuilder();
                String url5 = A03(25, 26, 108);
                sb5.append(url5).append(string).toString();
            }
            if (c2740c2.A03.contains(string)) {
                StringBuilder sb6 = new StringBuilder();
                String url6 = A03(151, 22, 111);
                sb6.append(url6).append(string).toString();
                return AbstractC2839de.A00(c2820dL, webResourceRequest, webResourceRequest.getUrl(), strGuessContentTypeFromName, map);
            }
        } catch (IOException e10) {
            StringBuilder sb7 = new StringBuilder();
            String url7 = A03(54, 35, 64);
            String mimeType = sb7.append(url7).append(string).toString();
            String url8 = A03(89, 17, 51);
            Log.e(url8, mimeType, e10);
        }
        return null;
    }

    public static WebResourceResponse A01(HashMap<String, String> responseHeaders, String str, File file) throws FileNotFoundException {
        return A02(responseHeaders, str, new FileInputStream(file));
    }

    public static WebResourceResponse A02(HashMap<String, String> responseHeaders, String str, InputStream inputStream) {
        return new WebResourceResponse(str, null, 200, A03(106, 2, 61), responseHeaders, inputStream);
    }

    public static void A05(SQ sq, String str, String str2) {
        C2434Sw c2434Sw = new C2434Sw(A03(51, 3, 42));
        c2434Sw.A05(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(176, 2, 34), str);
            jSONObject.put(A03(178, 3, 31), str2);
            c2434Sw.A07(jSONObject);
        } catch (JSONException unused) {
        }
        sq.A08().AAz(A03(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 3, 72), AbstractC2433Sv.A12, c2434Sw);
    }
}
