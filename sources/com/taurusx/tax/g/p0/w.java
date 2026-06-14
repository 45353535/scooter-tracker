package com.taurusx.tax.g.p0;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.taurusx.tax.g.p0.z;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Lock f66272z = new ReentrantLock();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static z.w f66271w = null;

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
            String simCountryIso = telephonyManager.getSimCountryIso();
            if ((simCountryIso == null || simCountryIso.length() != 2) && (telephonyManager.getPhoneType() == 2 || (simCountryIso = telephonyManager.getNetworkCountryIso()) == null || simCountryIso.length() != 2)) {
                simCountryIso = null;
            }
            if (TextUtils.isEmpty(simCountryIso)) {
                simCountryIso = applicationContext.getResources().getConfiguration().locale.getCountry();
            }
            return new Locale("", simCountryIso).getISO3Country();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String o(Context context) {
        Locale locale;
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String language = Locale.ENGLISH.getLanguage();
            if ((language == null || language.isEmpty()) && (locale = applicationContext.getResources().getConfiguration().locale) != null) {
                language = locale.getLanguage();
            }
            if (language != null && !language.isEmpty()) {
                return language.toLowerCase(Locale.US);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static boolean s(Context context) {
        z.w wVarW = w(context);
        if (wVarW != null) {
            return wVarW.w();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taurusx.tax.g.p0.z.w w(android.content.Context r7) {
        /*
            java.lang.String r0 = "IFA get gaid finally, release request lock!"
            java.lang.String r1 = "taurusx"
            com.taurusx.tax.g.p0.z$w r2 = com.taurusx.tax.g.p0.w.f66271w
            if (r2 == 0) goto L9
            return r2
        L9:
            if (r7 != 0) goto Ld
            r7 = 0
            return r7
        Ld:
            r2 = 0
            java.util.concurrent.locks.Lock r3 = com.taurusx.tax.g.p0.w.f66272z     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2a
            r5 = 5
            boolean r2 = r3.tryLock(r5, r4)     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L2c
            java.lang.String r7 = "IFA lock not acquired within timeout."
            com.taurusx.tax.log.LogUtil.d(r1, r7)     // Catch: java.lang.Throwable -> L2a
            com.taurusx.tax.g.p0.z$w r7 = com.taurusx.tax.g.p0.w.f66271w     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L29
            com.taurusx.tax.log.LogUtil.d(r1, r0)
            r3.unlock()
        L29:
            return r7
        L2a:
            r7 = move-exception
            goto L9a
        L2c:
            com.taurusx.tax.g.p0.z$w r4 = com.taurusx.tax.g.p0.w.f66271w     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = " limit: "
            if (r4 == 0) goto L63
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r7.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "IFA get gaid from cache with lock: "
            r7.append(r4)     // Catch: java.lang.Throwable -> L2a
            com.taurusx.tax.g.p0.z$w r4 = com.taurusx.tax.g.p0.w.f66271w     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r4.z()     // Catch: java.lang.Throwable -> L2a
            r7.append(r4)     // Catch: java.lang.Throwable -> L2a
            r7.append(r5)     // Catch: java.lang.Throwable -> L2a
            com.taurusx.tax.g.p0.z$w r4 = com.taurusx.tax.g.p0.w.f66271w     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r4.w()     // Catch: java.lang.Throwable -> L2a
            r7.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2a
            com.taurusx.tax.log.LogUtil.d(r1, r7)     // Catch: java.lang.Throwable -> L2a
            com.taurusx.tax.g.p0.z$w r7 = com.taurusx.tax.g.p0.w.f66271w     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L62
            com.taurusx.tax.log.LogUtil.d(r1, r0)
            r3.unlock()
        L62:
            return r7
        L63:
            com.taurusx.tax.g.p0.z$w r7 = com.taurusx.tax.g.p0.z.z(r7)     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L97
            java.lang.String r3 = r7.z()     // Catch: java.lang.Throwable -> L2a
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L97
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r3.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "IFA get new gaid result: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r7.z()     // Catch: java.lang.Throwable -> L2a
            r3.append(r4)     // Catch: java.lang.Throwable -> L2a
            r3.append(r5)     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r7.w()     // Catch: java.lang.Throwable -> L2a
            r3.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            com.taurusx.tax.log.LogUtil.d(r1, r3)     // Catch: java.lang.Throwable -> L2a
            com.taurusx.tax.g.p0.w.f66271w = r7     // Catch: java.lang.Throwable -> L2a
        L97:
            if (r2 == 0) goto La7
            goto L9f
        L9a:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto La7
        L9f:
            com.taurusx.tax.log.LogUtil.d(r1, r0)
            java.util.concurrent.locks.Lock r7 = com.taurusx.tax.g.p0.w.f66272z
            r7.unlock()
        La7:
            com.taurusx.tax.g.p0.z$w r7 = com.taurusx.tax.g.p0.w.f66271w
            return r7
        Laa:
            r7 = move-exception
            if (r2 == 0) goto Lb5
            com.taurusx.tax.log.LogUtil.d(r1, r0)
            java.util.concurrent.locks.Lock r0 = com.taurusx.tax.g.p0.w.f66272z
            r0.unlock()
        Lb5:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.g.p0.w.w(android.content.Context):com.taurusx.tax.g.p0.z$w");
    }

    public static z.w y(Context context) {
        return w(context);
    }

    public static String z(Context context) {
        z.w wVarW = w(context);
        return (wVarW == null || TextUtils.isEmpty(wVarW.z())) ? "" : wVarW.z();
    }

    public static String z() {
        try {
            return Locale.ENGLISH.getCountry();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String w() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return timeZone != null ? timeZone.getDisplayName() : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
