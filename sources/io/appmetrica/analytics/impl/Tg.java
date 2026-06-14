package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Tg extends Wg {
    public Tg(C5058e5 c5058e5) {
        super(c5058e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        String value = w52.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            zo zoVar = this.f76636a.f77081t;
            synchronized (zoVar) {
                zoVar.c(zoVar.b() + 1);
            }
            if (!a(jSONObject.optString(POBCoreNativeConstants.NATIVE_LINK))) {
                return false;
            }
            w52.f76627n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        zo zoVar = this.f76636a.f77081t;
        synchronized (zoVar) {
            zoVar.a(zoVar.a() + 1);
        }
        this.f76636a.z();
        R8 r82 = this.f76636a.f77073l;
        if (r82.f76344c == null) {
            r82.a();
        }
        T8 t82 = r82.f76344c;
        t82.getClass();
        t82.f76491b = new HashSet();
        t82.f76493d = 0;
        T8 t83 = r82.f76344c;
        t83.f76490a = true;
        W8 w82 = r82.f76343b;
        IBinaryDataHelper iBinaryDataHelper = w82.f76632c;
        V8 v82 = w82.f76631b;
        w82.f76630a.getClass();
        iBinaryDataHelper.insert("event_hashes", v82.toByteArray(U8.a(t83)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter(Constants.REFERRER);
                if (!TextUtils.isEmpty(queryParameter)) {
                    C5460u2 c5460u2 = this.f76636a.t().f77564y;
                    for (String str2 : Uri.decode(queryParameter).split(C4240b4.j.f42670c)) {
                        String strDecode = Uri.decode(str2);
                        int iIndexOf = strDecode.indexOf(C4240b4.j.f42668b);
                        if (iIndexOf >= 0 && a(Uri.decode(strDecode.substring(0, iIndexOf)), Uri.decode(strDecode.substring(iIndexOf + 1)), c5460u2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C5460u2 c5460u2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c5460u2 == null) {
            return false;
        }
        for (Pair pair : c5460u2.f78318a) {
            if (no.a(pair.first, str) && ((obj = pair.second) == null || ((C5435t2) obj).f78255a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
