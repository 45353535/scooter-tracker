package com.applovin.impl.sdk;

import com.applovin.impl.n7;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.x4;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class NativeCrashReporter implements g.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final NativeCrashReporter f10480d = new NativeCrashReporter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f10481a = new HashMap();

    private NativeCrashReporter() {
    }

    public static void a(k kVar) {
        if (kVar == null) {
            return;
        }
        if (!((Boolean) kVar.a(x4.f11404q4)).booleanValue() && !n7.k(k.o())) {
            if (f10479c) {
                try {
                    g gVarL = kVar.l();
                    NativeCrashReporter nativeCrashReporter = f10480d;
                    gVarL.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th2) {
                    kVar.O();
                    if (o.a()) {
                        kVar.O().a("NativeCrashReporter", "Failed to disable native crash reporter", th2);
                    }
                    kVar.D().a("NativeCrashReporter", "disableInstance", th2);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List listC = kVar.c(x4.f11412r4);
            int[] iArr = new int[listC.size()];
            for (int i10 = 0; i10 < listC.size(); i10++) {
                try {
                    iArr[i10] = Integer.parseInt((String) listC.get(i10));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(k.o().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, kVar);
            } else if (!file.mkdir()) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f10480d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) kVar.a(x4.f11420s4)).booleanValue());
                if (((Boolean) kVar.a(x4.f11428t4)).booleanValue()) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(g.c.LOADING);
                    hashSet.add(g.c.LOAD);
                    hashSet.add(g.c.SHOW);
                    hashSet.add(g.c.CLICK);
                    hashSet.add(g.c.SHOW_ERROR);
                    hashSet.add(g.c.DESTROY);
                    kVar.l().a(nativeCrashReporter2, hashSet);
                }
            } catch (Throwable th3) {
                kVar.O();
                if (o.a()) {
                    kVar.O().a("NativeCrashReporter", "Failed to enable native crash reporter", th3);
                }
                kVar.D().a("NativeCrashReporter", "enableInstance", th3);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z10);

    private native void updateAdInfo(String str);

    private static boolean a() {
        if (!f10478b) {
            f10478b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f10479c = true;
            } catch (Throwable th2) {
                o.b("NativeCrashReporter", "Failed to load native crash reporter library", th2);
            }
        }
        return f10479c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.io.File r16, com.applovin.impl.sdk.k r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.a(java.io.File, com.applovin.impl.sdk.k):void");
    }

    @Override // com.applovin.impl.sdk.g.d
    public void a(g.b bVar) {
        String strH = bVar.h();
        if (bVar.i() == g.c.DESTROY) {
            this.f10481a.remove(strH);
        } else if (this.f10481a.containsKey(strH)) {
            JsonUtils.putString((JSONObject) this.f10481a.get(strH), "operation", bVar.i().toString());
        } else {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "ad_unit_id", bVar.a());
            JsonUtils.putString(jSONObject, "ad_format", bVar.g());
            JsonUtils.putString(jSONObject, "network_name", bVar.c());
            JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
            JsonUtils.putString(jSONObject, "adapter_version", bVar.d());
            JsonUtils.putString(jSONObject, "bcode", bVar.e());
            JsonUtils.putString(jSONObject, "creative_id", bVar.f());
            JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
            this.f10481a.put(strH, jSONObject);
        }
        try {
            updateAdInfo(new JSONArray(this.f10481a.values()).toString());
        } catch (Throwable unused) {
        }
    }
}
