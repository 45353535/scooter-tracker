package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46879a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46880b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46881c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46882d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46883e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46884f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.listener.a f46885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f46886h;

    public a(Context context, com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.f46886h = context;
        this.f46885g = aVar;
        a(context);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f46880b = com.mbridge.msdk.config.component.common.util.b.a(this.f46886h).a(f.b.f45109c, "");
        this.f46882d = com.mbridge.msdk.config.component.common.util.b.a(this.f46886h).a("isLimitAdId", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                this.f46879a = advertisingIdInfo.getId();
                this.f46881c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
            } catch (Exception unused) {
                c.b bVarA = new com.mbridge.msdk.foundation.tools.c().a(context);
                this.f46879a = bVarA.a();
                this.f46881c = bVarA.b() ? 1 : 0;
            } catch (Throwable th2) {
                q0.b("ADIDProvider", th2.getMessage());
            }
        } catch (Exception unused2) {
            q0.d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
        }
        a(this.f46879a, this.f46881c);
        if (this.f46885g != null) {
            HashMap map = new HashMap();
            map.put(f.b.f45109c, this.f46879a);
            map.put("adIdB64", k0.b(this.f46879a));
            map.put("adIdLimit", String.valueOf(this.f46881c));
            this.f46885g.a(map);
        }
    }

    public Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = TextUtils.isEmpty(this.f46879a) ? TextUtils.isEmpty(this.f46880b) ? "" : this.f46880b : this.f46879a;
        int i10 = this.f46881c;
        if (i10 == -1 && (i10 = this.f46882d) == -1) {
            i10 = 0;
        }
        map.put(f.b.f45109c, str);
        map.put("adIdB64", TextUtils.isEmpty(str) ? "" : k0.b(str));
        map.put("adIdLimit", String.valueOf(i10));
        map.put("amazonIdInfo", this.f46883e);
        map.put("amazonIdInfoB64", this.f46884f);
        return map;
    }

    private void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f46886h == null) {
            this.f46886h = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        if (str.equals(this.f46880b) && i10 == this.f46882d) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(this.f46886h).b(f.b.f45109c, str);
        com.mbridge.msdk.config.component.common.util.b.a(this.f46886h).b("isLimitAdId", i10);
    }

    private void a(final Context context) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f46898b.c();
            }
        });
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f46899b.b(context);
            }
        });
    }

    private void b() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                this.f46883e = string2;
                this.f46884f = k0.b(string2);
                if (this.f46885g != null) {
                    HashMap map = new HashMap();
                    map.put("amazonIdInfo", this.f46883e);
                    map.put("amazonIdInfoB64", this.f46884f);
                    this.f46885g.a(map);
                    return;
                }
                return;
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("ADIDProvider", e10.getMessage());
                return;
            }
        } catch (Throwable th2) {
            q0.b("ADIDProvider", th2.getMessage());
        }
        q0.b("ADIDProvider", th2.getMessage());
    }
}
