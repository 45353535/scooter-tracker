package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class an {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f355 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f356 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f357 = 33181;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f358 = 65501;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f359 = 5973;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f360 = 9795;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final af f361;

    public an(af afVar) {
        this.f361 = afVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4742(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f357)) ^ ((c11 >>> 5) + f360)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f358) ^ ((c12 + i12) ^ ((c12 << 4) + f359))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m4743(ISAdQualitySegment iSAdQualitySegment) {
        String strIntern;
        AtomicBoolean isPaying;
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                int i10 = f355 + 107;
                f356 = i10 % 128;
                jSONObject.put(i10 % 2 == 0 ? m4742("얛䰈싢攤", 3 / TextUtils.indexOf("", "", 1)).intern() : m4742("얛䰈싢攤", TextUtils.indexOf("", "", 0) + 4).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                int i11 = f356 + 95;
                f355 = i11 % 128;
                jSONObject.put(i11 % 2 != 0 ? m4742("⌝䟏֥굾", 2 >> Color.blue(1)).intern() : m4742("⌝䟏֥굾", 4 - Color.blue(0)).intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m4742("얛䰈\u0bc3쐍", 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                int i12 = f355 + 17;
                f356 = i12 % 128;
                jSONObject.put(i12 % 2 == 0 ? m4742("萪\udf24ﱷ燷", 5 >> View.MeasureSpec.getMode(0)).intern() : m4742("萪\udf24ﱷ燷", View.MeasureSpec.getMode(0) + 4).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                int i13 = f355 + 119;
                f356 = i13 % 128;
                if (i13 % 2 == 0) {
                    strIntern = m4742("灇\udf91ᾛ쨕", View.resolveSize(1, 1) + 4).intern();
                    isPaying = iSAdQualitySegment.getIsPaying();
                } else {
                    strIntern = m4742("灇\udf91ᾛ쨕", View.resolveSize(0, 0) + 4).intern();
                    isPaying = iSAdQualitySegment.getIsPaying();
                }
                jSONObject.put(strIntern, isPaying.get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                jSONObject.put(m4742("ᡒ䑸繷灪\uf019킔", 5 - KeyEvent.getDeadChar(0, 0)).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                jSONObject.put(m4742("愂䢼ù\ude3a", 4 - ExpandableListView.getPackedPositionGroup(0L)).intern(), iSAdQualitySegment.getUserCreationDate());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4744(ISAdQualitySegment iSAdQualitySegment) {
        af afVar;
        String strM4742;
        int i10 = f355 + 119;
        f356 = i10 % 128;
        if (i10 % 2 == 0) {
            afVar = this.f361;
            strM4742 = m4742("\udddd⯞풤뜮\udddd⯞ም\uf08d\u0bc3쐍\uf019킔", 84 / (KeyEvent.getMaxKeyCode() >>> 71));
        } else {
            afVar = this.f361;
            strM4742 = m4742("\udddd⯞풤뜮\udddd⯞ም\uf08d\u0bc3쐍\uf019킔", (KeyEvent.getMaxKeyCode() >> 16) + 11);
        }
        afVar.m4656(strM4742.intern(), m4743(iSAdQualitySegment));
        f355 = (f356 + 33) % 128;
    }
}
