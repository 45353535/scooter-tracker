package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.a1;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements r1.b, r1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f21069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IIgniteServiceAPI f21070b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f21079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f21080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f21081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s1.a f21082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f21083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f21084p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f21071c = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21073e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21074f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21075g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f21076h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21077i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21078j = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f21072d = new i(new e(this));

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        boolean z10;
        h hVar;
        this.f21083o = rVar;
        if (!TextUtils.isEmpty(this.f21080l)) {
            IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) rVar.a(com.fyber.inneractive.sdk.config.global.features.i.class);
            IAlog.a("%s : initializing ignite features", "IgniteAdapter");
            Boolean boolC = iVar.c("odt");
            this.f21073e = boolC != null ? boolC.booleanValue() : false;
            Boolean boolC2 = iVar.c("flow");
            this.f21074f = boolC2 != null ? boolC2.booleanValue() : false;
            Boolean boolC3 = iVar.c("updates");
            this.f21075g = boolC3 != null ? boolC3.booleanValue() : false;
            Context context = this.f21069a;
            if (context != null && ((z10 = this.f21073e) || this.f21074f)) {
                if (this.f21084p == null) {
                    this.f21078j = false;
                    hVar = this;
                    l lVar = new l(context, new k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z10, this.f21074f, this.f21075g, hVar);
                    hVar.f21084p = lVar;
                    lVar.authenticate();
                } else {
                    hVar = this;
                }
                hVar.f21079k = TimeUnit.SECONDS.toMillis(IAConfigManager.O.f20317w.f20488a.f20484b.a("igniteInstallTimeOutInSeconds", 15, 1));
            }
        }
    }

    public final void m() {
        d dVar = this.f21081m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(dVar);
            this.f21081m = null;
        }
    }

    public final boolean n() {
        l lVar = this.f21084p;
        return lVar != null && lVar.isConnected() && this.f21084p.isAuthenticated();
    }

    public final boolean o() {
        l lVar = this.f21084p;
        return lVar == null || lVar.f93862a.f();
    }

    @Override // r1.b
    public final void onCredentialsRequestFailed(String str) {
        l lVar = this.f21084p;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // r1.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        l lVar = this.f21084p;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // r1.a
    public final void onIgniteServiceAuthenticated(String str) {
        this.f21071c.putString("clientToken", str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        s1.a aVar = this.f21082n;
        if (aVar != null) {
            aVar.a();
            this.f21082n = null;
        }
    }

    @Override // r1.a
    public final void onIgniteServiceAuthenticationFailed(String str) {
        this.f21070b = null;
        a(j.FAILED_TO_AUTHENTICATE, str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        s1.a aVar = this.f21082n;
        if (aVar != null) {
            aVar.a(str);
            this.f21082n = null;
        }
    }

    @Override // r1.a
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Context context;
        IAlog.a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.f21080l = componentName.getPackageName();
        this.f21070b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.f21078j) {
            l lVar = this.f21084p;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.f21078j = true;
        byte[] byteArray = null;
        try {
            o oVarNewBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.O.f20297c;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f23575b).setAppId(str2);
            String packageName = com.fyber.inneractive.sdk.util.o.f23888a.getPackageName();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f23575b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f23575b).setSdkVersion(version);
            String str3 = this.f21080l;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f23575b).setIgnitePackageName(str3);
            if (TextUtils.isEmpty(this.f21080l) || (context = this.f21069a) == null) {
                str = null;
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f23575b).setIgniteVersionName(str);
                String strA = com.fyber.inneractive.sdk.util.o.a(this.f21069a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f23575b).setAppSignature(strA);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            } else {
                try {
                    str = context.getPackageManager().getPackageInfo(this.f21080l, 0).versionName;
                } catch (Exception unused) {
                    IAlog.a("Failed to resolve ignite version", new Object[0]);
                    str = null;
                }
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f23575b).setIgniteVersionName(str);
                String strA2 = com.fyber.inneractive.sdk.util.o.a(this.f21069a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f23575b).setAppSignature(strA2);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            }
        } catch (Throwable unused2) {
            IAlog.a("Failed to build ignite request", new Object[0]);
        }
        if (byteArray != null) {
            IAConfigManager.O.f20313s.a(new a1(new b(this), byteArray, this.f21083o));
        }
    }

    @Override // r1.a
    public final void onIgniteServiceConnectionFailed(String str) {
        IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(j.FAILED_TO_BIND_SERVICE, str);
    }

    @Override // r1.a
    public final void onOdtUnsupported() {
        l lVar;
        IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f21074f || (lVar = this.f21084p) == null) {
            return;
        }
        lVar.destroy();
        this.f21084p = null;
    }

    public final void a(j jVar, String str) {
        if (this.f21077i) {
            return;
        }
        this.f21077i = true;
        t tVar = t.IGNITE_FLOW_FAILED_TO_START;
        w wVar = new w((com.fyber.inneractive.sdk.response.e) null);
        wVar.f21417b = tVar;
        wVar.f21416a = null;
        wVar.f21419d = null;
        JSONObject jSONObject = new JSONObject();
        String strA = jVar.a();
        try {
            jSONObject.put("error_code", strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "error_code", strA);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, str);
            }
        }
        wVar.f21421f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(s1.a aVar) {
        IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + aVar, new Object[0]);
        this.f21082n = aVar;
        l lVar = this.f21084p;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void a(String str, g gVar) {
        String strA;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("Starting install timeout with %d", Long.valueOf(this.f21079k));
        d dVar = new d(this);
        this.f21081m = dVar;
        com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(dVar, this.f21079k);
        if (n() && !o() && this.f21070b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", str);
                jSONObject.put("data", jSONObject2);
                IIgniteServiceAPI iIgniteServiceAPI = this.f21070b;
                String string = jSONObject.toString();
                Bundle bundle = this.f21071c;
                Bundle bundle2 = new Bundle();
                i iVar = this.f21072d;
                c cVar = new c(this, gVar);
                iVar.getClass();
                iIgniteServiceAPI.install(string, bundle, bundle2, new s((e) iVar.f21085a, cVar));
                return;
            } catch (Exception unused) {
                IAlog.a("Failed to install app", new Object[0]);
                return;
            }
        }
        for (r rVar : this.f21076h) {
            if (rVar != null) {
                if (o()) {
                    strA = j.SESSION_EXPIRED.a();
                } else {
                    strA = j.NOT_CONNECTED.a();
                }
                rVar.a((String) null, strA, (String) null);
            }
        }
    }
}
