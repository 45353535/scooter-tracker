package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.R$bool;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f55720b;

    public t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55719a = context;
        this.f55720b = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.services.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(t.b(this.f55718b));
            }
        });
    }

    public static final boolean b(t tVar) {
        return tVar.f55719a.getResources().getBoolean(R$bool.f53873a);
    }

    @Override // com.moloco.sdk.internal.services.i0
    public Boolean a() {
        try {
            Object systemService = this.f55719a.getSystemService("sensor");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            return Boolean.valueOf(((SensorManager) systemService).getDefaultSensor(4) != null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.moloco.sdk.internal.services.i0
    public String c() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    @Override // com.moloco.sdk.internal.services.i0
    public String d() {
        Object systemService = this.f55719a.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) systemService).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype != null) {
            return currentInputMethodSubtype.getLocale();
        }
        return null;
    }

    public final boolean e() {
        return ((Boolean) this.f55720b.getValue()).booleanValue();
    }

    @Override // com.moloco.sdk.internal.services.i0
    public h0 invoke() {
        return b();
    }

    @Override // com.moloco.sdk.internal.services.i0
    public h0 b() {
        String str;
        String str2;
        String str3;
        String networkOperatorName;
        String str4 = Build.MANUFACTURER;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = Build.MODEL;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = Build.HARDWARE;
        if (str6 == null) {
            str3 = str6;
            str = str5;
            str2 = "";
        } else {
            str = str5;
            str2 = str6;
            str3 = str2;
        }
        boolean zE = e();
        String str7 = str3;
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        String str8 = str7;
        int i10 = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(this.f55719a, TelephonyManager.class);
        if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
            networkOperatorName = "";
        }
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (str8 == null) {
            str8 = "";
        }
        String str9 = Build.BRAND;
        if (str9 == null) {
            str9 = "";
        }
        return new h0(str4, str, str2, zE, "android", RELEASE, i10, language, networkOperatorName, f10, jCurrentTimeMillis, str8, str9);
    }
}
