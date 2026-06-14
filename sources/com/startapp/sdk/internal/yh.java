package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f65611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f65612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb f65613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b6 f65614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public vh f65615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f65616g = Math.random();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f65617h = "e106";

    public yh(Context context, lb lbVar, lb lbVar2, lb lbVar3, b6 b6Var) {
        this.f65610a = context;
        this.f65611b = lbVar;
        this.f65612c = lbVar2;
        this.f65613d = lbVar3;
        this.f65614e = b6Var;
    }

    public final vh a(Class cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f65610a.getSystemService("phone");
        if (telephonyManager != null) {
            return Build.VERSION.SDK_INT < 31 ? new xh(this, telephonyManager, cls) : new uh(this, telephonyManager, cls);
        }
        return null;
    }

    public final void b() {
        vh vhVarA;
        try {
            if (a() == null || (vhVarA = a(SignalStrength.class)) == null) {
                return;
            }
            vhVarA.a();
        } catch (Throwable th2) {
            if (a(8)) {
                g9.a(th2);
            }
        }
    }

    public final TelephonyMetadata a() {
        Boolean boolB = ((h6) this.f65613d.a()).b();
        if (boolB != null && boolB.booleanValue()) {
            this.f65614e.getClass();
            TelephonyMetadata telephonyMetadataA0 = MetaData.E().a0();
            if (telephonyMetadataA0 != null && telephonyMetadataA0.c()) {
                return telephonyMetadataA0;
            }
        }
        return null;
    }

    public final boolean a(int i10) {
        TelephonyMetadata telephonyMetadataA = a();
        return telephonyMetadataA != null && this.f65616g < telephonyMetadataA.b() && (telephonyMetadataA.a() & i10) == i10;
    }

    public final void a(SignalStrength signalStrength) {
        if (signalStrength == null) {
            return;
        }
        try {
            this.f65617h = String.valueOf(signalStrength.getLevel());
        } catch (NoSuchMethodException unused) {
            this.f65617h = "e104";
        } catch (Throwable unused2) {
            this.f65617h = "e105";
        }
    }

    public final Map a(h9 h9Var) {
        List listA;
        TelephonyMetadata telephonyMetadataA = a();
        if (telephonyMetadataA == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = null;
        for (Map.Entry entry : ((vf) this.f65612c.a()).getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) entry.getKey();
                TelephonyDataConfig telephonyDataConfigA = telephonyMetadataA.a(str);
                if (telephonyDataConfigA.c() && (listA = telephonyDataConfigA.a()) != null && listA.contains(h9Var.f64622a)) {
                    String strB = telephonyDataConfigA.b();
                    if (strB != null) {
                        str = strB;
                    }
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(str, (String) value);
                }
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
