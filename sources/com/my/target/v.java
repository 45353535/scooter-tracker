package com.my.target;

import android.content.Context;
import com.ironsource.N6;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import com.my.target.d6;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.AdNetworkLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class v {

    public interface b {
        void a(u uVar, String str);
    }

    public static v a() {
        return new a();
    }

    public abstract void a(String str, j jVar, h6 h6Var, Context context, b bVar);

    public final u a(String str, j jVar, String str2) {
        return u.a(str + jVar.i() + "/", str2);
    }

    public static class a extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d6 f60923a;

        @Override // com.my.target.v
        public void a(final String str, final j jVar, final h6 h6Var, final Context context, final b bVar) {
            jVar.a().b(0, 1000);
            int iF = jVar.f();
            ba.a(iF == 0 || iF == 1);
            ba.b(iF == 0 || iF == 2);
            ArrayList arrayList = new ArrayList();
            Iterator it = jVar.b().iterator();
            while (it.hasNext()) {
                AdNetworkLoader loader = ((AdNetworkConfig) it.next()).getLoader();
                if (loader != null) {
                    arrayList.add(loader);
                }
            }
            if (arrayList.isEmpty()) {
                gb.a("DefaultAdServiceBuilder: no AdNetworkLoaders, direct call result");
                a(str, jVar, new HashMap(), h6Var, context, bVar);
            } else {
                gb.a("DefaultAdServiceBuilder: loading mediation params");
                d6 d6Var = new d6(jVar.h(), arrayList, context, new d6.a() { // from class: k5.n2
                    @Override // com.my.target.d6.a
                    public final void a(Map map) {
                        this.f86097a.a(str, jVar, h6Var, context, bVar, map);
                    }
                });
                this.f60923a = d6Var;
                d6Var.b();
            }
        }

        public final /* synthetic */ void b(String str, j jVar, Map map, h6 h6Var, Context context, b bVar) {
            gb.a("DefaultAdServiceBuilder: mediation params is loaded");
            a(str, jVar, map, h6Var, context, bVar);
        }

        public final /* synthetic */ void a(final String str, final j jVar, final h6 h6Var, final Context context, final b bVar, final Map map) {
            f0.a(new Runnable() { // from class: k5.o2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86106b.b(str, jVar, map, h6Var, context, bVar);
                }
            });
        }

        public final void a(String str, j jVar, Map map, h6 h6Var, Context context, b bVar) {
            this.f60923a = null;
            map.putAll(a(jVar, h6Var, context));
            bVar.a(u.a(str + jVar.i() + "/", y1.a(map, jVar.a())), null);
        }

        public int a(j jVar, Context context) {
            return ba.a();
        }

        public Map a(j jVar, h6 h6Var, Context context) {
            HashMap map = new HashMap();
            map.put("formats", jVar.h());
            map.put("adman_ver", MyTargetVersion.VERSION);
            map.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
            MyTargetPrivacy myTargetPrivacyCurrentPrivacy = MyTargetPrivacy.currentPrivacy();
            Boolean bool = myTargetPrivacyCurrentPrivacy.userConsent;
            if (bool != null) {
                map.put("user_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = myTargetPrivacyCurrentPrivacy.ccpaUserConsent;
            if (bool2 != null) {
                map.put("ccpa_user_consent", bool2.booleanValue() ? "1" : "0");
            }
            Boolean bool3 = myTargetPrivacyCurrentPrivacy.iabUserConsent;
            if (bool3 != null) {
                map.put("iab_user_consent", bool3.booleanValue() ? "1" : "0");
            }
            if (myTargetPrivacyCurrentPrivacy.userAgeRestricted) {
                map.put("user_age_restricted", "1");
            }
            if (jVar.f() == 0 || jVar.f() == 2) {
                map.put("preloadvideo", "1");
            }
            int iC = jVar.c();
            if (iC > 0) {
                map.put("count", Integer.toString(iC));
            }
            String strD = jVar.d();
            if (strD != null) {
                map.put("bid_id", strD);
            }
            CustomParams customParamsG = jVar.g();
            if (myTargetPrivacyCurrentPrivacy.isConsent()) {
                customParamsG.putDataTo(map);
            } else {
                customParamsG.putCustomDataToMap(map);
            }
            MyTargetConfig sdkConfig = MyTargetManager.getSdkConfig();
            try {
                map.putAll(d2.b().a(sdkConfig, myTargetPrivacyCurrentPrivacy, h6Var, context));
            } catch (Throwable th2) {
                gb.a("AdServiceBuilder: Error collecting data - " + th2);
            }
            String lang = customParamsG.getLang();
            if (lang != null) {
                map.put(N6.f41413q, lang);
            }
            int iA = a(jVar, context);
            if (iA >= 0) {
                map.put("sdk_flags", String.valueOf(iA));
            }
            String[] strArr = sdkConfig.testDevices;
            String str = map.get("instance_id");
            if (str != null) {
                if (strArr != null && e0.a(strArr, str)) {
                    map.put("test_mode", "1");
                    gb.a("DefaultAdServiceBuilder: Test mode is enabled on current device");
                } else {
                    gb.a("AdServiceBuilder: Device instanceId is " + str + ". Use this value in adInstance.withTestDevices() to enable test mode on this device.");
                }
            }
            return map;
        }
    }
}
