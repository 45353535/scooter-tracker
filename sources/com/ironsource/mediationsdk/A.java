package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.C4237b1;
import com.ironsource.C4456nf;
import com.ironsource.C4462o4;
import com.ironsource.L8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class A implements L8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f43735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C4237b1 f43736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected JSONObject f43738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f43739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f43740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Long f43741g = null;

    A(C4237b1 c4237b1, AbstractAdapter abstractAdapter) {
        this.f43736b = c4237b1;
        this.f43735a = abstractAdapter;
        this.f43738d = c4237b1.c();
    }

    public void a(boolean z10) {
        this.f43737c = z10;
    }

    @Override // com.ironsource.L8.b
    public int b() {
        return this.f43736b.e();
    }

    @Override // com.ironsource.L8.b
    public String c() {
        return this.f43736b.f();
    }

    public abstract IronSource.a d();

    public Long e() {
        return this.f43741g;
    }

    public String f() {
        return String.format("%s %s", i(), Integer.valueOf(hashCode()));
    }

    public int g() {
        return this.f43736b.d();
    }

    public boolean h() {
        return this.f43737c;
    }

    public String i() {
        return this.f43736b.h().isMultipleInstances() ? this.f43736b.h().getProviderTypeForReflection() : this.f43736b.h().getProviderName();
    }

    public String j() {
        return this.f43736b.g();
    }

    public abstract String k();

    public int l() {
        return 1;
    }

    public Map<String, Object> m() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f43735a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f43735a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f43736b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f43736b.a());
            map.put("instanceType", Integer.valueOf(p() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(l()));
            if (!TextUtils.isEmpty(this.f43739e)) {
                map.put("dynamicDemandSource", this.f43739e);
                return map;
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th2);
        }
        return map;
    }

    public int n() {
        return this.f43740f;
    }

    public boolean o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f43735a.isUsingActivityBeforeImpression(C4456nf.a(d()))) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th2.getLocalizedMessage());
            return true;
        }
    }

    public boolean p() {
        return this.f43736b.j();
    }

    public void q() {
        this.f43735a = null;
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        return p() || s();
    }

    public boolean s() {
        return this.f43736b.k();
    }

    public void a(String str) {
        a(str, 0);
    }

    public void b(String str) {
        a(str, 3);
    }

    public void c(String str) {
        this.f43739e = d.b().c(str);
    }

    private void a(String str, int i10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " " + c() + " : " + str, i10);
    }
}
