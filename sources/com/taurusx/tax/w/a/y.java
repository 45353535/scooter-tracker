package com.taurusx.tax.w.a;

import android.content.Context;
import android.text.TextUtils;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.c.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.models.request.Macros;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f67233n = "TaxBaseImp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.taurusx.tax.w.c.y f67235c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f67236o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y.z f67238w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f67239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.taurusx.tax.w.s.s f67240z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f67237s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67234a = 0;

    public y(String str, com.taurusx.tax.w.c.y yVar) {
        this.f67235c = yVar;
        this.f67239y = str;
    }

    public abstract void c();

    public void w(long j10) {
        this.f67234a = j10;
    }

    public void y() {
        LogUtil.d("taurusx", "loadAd");
        try {
            if (this.f67236o == null) {
                this.f67236o = new c();
            }
            com.taurusx.tax.w.s.s sVar = this.f67240z;
            if (sVar == null) {
                this.f67240z = com.taurusx.tax.w.s.s.z(this.f67235c);
            } else {
                sVar.w(this.f67235c);
            }
            y.z zVarW = this.f67235c.w();
            this.f67238w = zVarW;
            if (zVarW != null && !TextUtils.isEmpty(zVarW.z())) {
                c();
                return;
            }
            this.f67236o.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_EMPTY);
        } catch (Exception unused) {
            this.f67236o.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED);
        }
    }

    public void z(com.taurusx.tax.w.y yVar) {
    }

    public long w() {
        return this.f67234a;
    }

    public void z(com.taurusx.tax.w.s.s sVar) {
        this.f67240z = sVar;
    }

    public void z(c cVar) {
        this.f67236o = cVar;
    }

    public void z(long j10) {
        this.f67237s = j10;
    }

    public long z() {
        return this.f67237s;
    }

    public void z(Context context, float f10, String str) {
        y.z zVar = this.f67238w;
        if (zVar == null) {
            return;
        }
        ArrayList<String> arrayListU = zVar.u();
        ArrayList arrayList = new ArrayList();
        if (arrayListU != null) {
            Iterator<String> it = arrayListU.iterator();
            while (it.hasNext()) {
                String strZ = z(z(z(it.next(), "${AUCTION_PRICE}", this.f67238w.e() + ""), "${AUCTION_MIN_TO_WIN}", f10 + ""), Macros.AUCTION_CURRENCY, "USD");
                if (!TextUtils.isEmpty(str)) {
                    strZ = z(strZ, "${AUCTION_MIN_TO_WIN_NAME}", str);
                }
                if (!TextUtils.isEmpty(strZ)) {
                    arrayList.add(strZ);
                }
            }
        }
        com.taurusx.tax.w.s.c.z(context, arrayList, "ad-win");
    }

    public void z(Context context, float f10, String str, int i10) {
        y.z zVar = this.f67238w;
        if (zVar == null) {
            return;
        }
        ArrayList<String> arrayListV = zVar.v();
        ArrayList arrayList = new ArrayList();
        if (arrayListV != null) {
            Iterator<String> it = arrayListV.iterator();
            while (it.hasNext()) {
                String strZ = z(z(z(it.next(), "${AUCTION_PRICE}", f10 + ""), Macros.AUCTION_CURRENCY, "USD"), "${AUCTION_LOSS}", i10 + "");
                if (!TextUtils.isEmpty(str)) {
                    strZ = z(strZ, "${AUCTION_MIN_TO_WIN_NAME}", str);
                }
                if (!TextUtils.isEmpty(strZ)) {
                    arrayList.add(strZ);
                }
            }
        }
        com.taurusx.tax.w.s.c.z(context, arrayList, "ad-loss");
    }

    public static String z(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        try {
            return str.replaceAll(Pattern.quote(str2), str3);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
