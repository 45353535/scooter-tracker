package com.my.target;

import android.content.Context;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.h6;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.MediationAdConfig;
import com.my.target.mediation.MediationAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f61162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6.a f61163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5 f61164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationAdapter f61165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f61166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u9 f61167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f61168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f61169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h6 f61170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f61171j;

    public static class a implements MediationAdConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Map f61176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MyTargetPrivacy f61177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AdNetworkConfig f61178g;

        public a(String str, String str2, Map map, int i10, int i11, MyTargetPrivacy myTargetPrivacy, AdNetworkConfig adNetworkConfig) {
            this.f61172a = str;
            this.f61173b = str2;
            this.f61176e = map;
            this.f61175d = i10;
            this.f61174c = i11;
            this.f61177f = myTargetPrivacy;
            this.f61178g = adNetworkConfig;
        }

        public static a a(String str, String str2, Map map, int i10, int i11, MyTargetPrivacy myTargetPrivacy, AdNetworkConfig adNetworkConfig) {
            return new a(str, str2, map, i10, i11, myTargetPrivacy, adNetworkConfig);
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public AdNetworkConfig getAdNetworkConfig() {
            return this.f61178g;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public int getAge() {
            return this.f61175d;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public int getGender() {
            return this.f61174c;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public String getPayload() {
            return this.f61173b;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public String getPlacementId() {
            return this.f61172a;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public MyTargetPrivacy getPrivacy() {
            return this.f61177f;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public Map getServerParams() {
            return this.f61176e;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserAgeRestricted() {
            return this.f61177f.userAgeRestricted;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserConsent() {
            Boolean bool = this.f61177f.userConsent;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserConsentSpecified() {
            return this.f61177f.userConsent != null;
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y5 f61179a;

        public b(y5 y5Var) {
            this.f61179a = y5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            gb.a("MediationEngine: Timeout for " + this.f61179a.b() + " ad network");
            Context contextG = z5.this.g();
            if (contextG != null) {
                z5.this.a(this.f61179a, "networkTimeout", contextG);
            }
            z5.this.a(this.f61179a, false);
        }
    }

    public z5(x5 x5Var, j jVar, h6.a aVar) {
        this.f61164c = x5Var;
        this.f61162a = jVar;
        this.f61163b = aVar;
    }

    public String a() {
        return this.f61169h;
    }

    public abstract void a(MediationAdapter mediationAdapter, y5 y5Var, Context context);

    public abstract boolean a(MediationAdapter mediationAdapter);

    public void b(Context context) {
        this.f61166e = new WeakReference(context);
        h();
    }

    public abstract void e();

    public abstract MediationAdapter f();

    public Context g() {
        WeakReference weakReference = this.f61166e;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    public final void h() {
        MediationAdapter mediationAdapter = this.f61165d;
        if (mediationAdapter != null) {
            try {
                mediationAdapter.destroy();
            } catch (Throwable th2) {
                gb.b("MediationEngine: Error - " + th2);
            }
            this.f61165d = null;
        }
        Context contextG = g();
        if (contextG == null) {
            gb.b("MediationEngine: Can't configure next ad network, context is null");
            return;
        }
        y5 y5VarD = this.f61164c.d();
        if (y5VarD == null) {
            gb.a("MediationEngine: No ad networks available");
            e();
            return;
        }
        gb.a("MediationEngine: Prepare adapter for " + y5VarD.b() + " ad network");
        MediationAdapter mediationAdapterA = a(y5VarD);
        this.f61165d = mediationAdapterA;
        if (mediationAdapterA == null || !a(mediationAdapterA)) {
            gb.b("MediationEngine: Can't create adapter, class " + y5VarD.a() + " not found or invalid");
            a(y5VarD, "networkAdapterInvalid", contextG);
            h();
            return;
        }
        gb.a("MediationEngine: Adapter created");
        this.f61170i = this.f61163b.a(y5VarD.b(), y5VarD.f());
        u9 u9Var = this.f61167f;
        if (u9Var != null) {
            u9Var.close();
        }
        int i10 = y5VarD.i();
        if (i10 > 0) {
            this.f61168g = new b(y5VarD);
            u9 u9VarA = u9.a(i10);
            this.f61167f = u9VarA;
            u9VarA.a(this.f61168g);
        } else {
            this.f61168g = null;
        }
        a(y5VarD, "networkRequested", contextG);
        a(this.f61165d, y5VarD, contextG);
    }

    public void a(y5 y5Var, boolean z10) {
        b bVar = this.f61168g;
        if (bVar == null || bVar.f61179a != y5Var) {
            return;
        }
        Context contextG = g();
        h6 h6Var = this.f61170i;
        if (h6Var != null && contextG != null) {
            h6Var.b();
            this.f61170i.b(contextG);
        }
        u9 u9Var = this.f61167f;
        if (u9Var != null) {
            u9Var.b(this.f61168g);
            this.f61167f.close();
            this.f61167f = null;
        }
        this.f61168g = null;
        if (!z10) {
            h();
            return;
        }
        this.f61169h = y5Var.b();
        this.f61171j = y5Var.f();
        if (contextG != null) {
            a(y5Var, "networkFilled", contextG);
        }
    }

    public float b() {
        return this.f61171j;
    }

    public void a(y5 y5Var, String str, Context context) {
        bb.b(y5Var.h(), str, -1, context);
    }

    public final MediationAdapter a(y5 y5Var) {
        if (y5Var.j()) {
            return f();
        }
        return a(y5Var.a());
    }

    public final MediationAdapter a(String str) {
        try {
            return (MediationAdapter) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (Throwable th2) {
            gb.b("MediationEngine: Error – " + th2);
            return null;
        }
    }
}
