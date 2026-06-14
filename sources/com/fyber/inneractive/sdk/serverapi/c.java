package com.fyber.inneractive.sdk.serverapi;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.o;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f23775c = Arrays.asList(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f23776d = Arrays.asList(Integer.valueOf(com.fyber.inneractive.sdk.rtb.data.types.a.VAST_2_0.a()), Integer.valueOf(com.fyber.inneractive.sdk.rtb.data.types.a.VAST_2_0_WRAPPER.a()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f23777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23778b;

    public c(r rVar) {
        String networkOperator;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) o.f23888a.getSystemService("phone");
            networkOperator = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() == 2 && k.n()) {
                networkOperator = telephonyManager.getSimOperator();
            }
        } catch (Exception unused) {
            networkOperator = null;
        }
        this.f23778b = networkOperator;
        this.f23777a = rVar;
    }

    public final String a() {
        try {
            return ((TelephonyManager) o.f23888a.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(String str, HashMap map) {
        String str2;
        a aVar = b.f23773a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str2 = "unity3d";
        } catch (Throwable unused) {
            str2 = "native";
        }
        map.put("frmn", str2);
        map.put("headset", a(b.m()));
        map.put("is_muted", a(b.k()));
        map.put("btry_c", a(b.i()));
        map.put("btry_l", b.b());
        map.put("bt_con", a(b.g()));
        Long lE = b.e();
        map.put("tod", lE == null ? "" : String.valueOf(lE));
        map.put("apnm", a(b.f()));
        map.put("dnd", a(b.l()));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        map.put("lng", iAConfigManager.f20309o);
        String strA = iAConfigManager.f20318x.a(b.a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(strA) && strA.contains(StringUtils.COMMA)) {
            strA = strA.split(StringUtils.COMMA)[0];
        }
        map.put("ldomain", strA);
        map.put("lbundle", iAConfigManager.f20318x.a(b.a(str), "LAST_APP_BUNDLE_ID"));
        String strA2 = iAConfigManager.f20318x.a(b.a(str), "LAST_CLICKED");
        if (TextUtils.equals(strA2, "0")) {
            strA2 = "";
        }
        map.put("lclick", strA2);
        String strA3 = iAConfigManager.f20318x.a(b.a(str), "LAST_VAST_SKIPED");
        if (TextUtils.equals(strA3, "0")) {
            strA3 = "";
        }
        map.put("v_lskip", strA3);
        UnitDisplayType unitDisplayTypeA = b.a(str);
        map.put("v_lclicktype", unitDisplayTypeA.isFullscreenUnit() ? iAConfigManager.f20318x.a(unitDisplayTypeA, "LAST_VAST_CLICKED_TYPE") : "");
        map.put("sdur", String.valueOf(b.c()));
        map.put("userid", iAConfigManager.D.f20358g);
        map.put("low_power_mode", a(b.n()));
        map.put("dark_mode", a(b.h()));
        map.put("d_api", b.d());
        map.put("media_muted", a(b.j()));
        Integer numA = b.a();
        map.put("asv", numA != null ? String.valueOf(numA) : "");
    }

    public static String a(Boolean bool) {
        return bool != null ? bool.booleanValue() ? "1" : "0" : "";
    }
}
