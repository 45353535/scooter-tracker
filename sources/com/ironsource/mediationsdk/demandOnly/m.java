package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C4237b1;
import com.ironsource.C4462o4;
import com.ironsource.Z9;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f43971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C4237b1 f43972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected JSONObject f43973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f43974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f43975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f43976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f43977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected JSONObject f43978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected List<String> f43979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f43980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f43981k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f43982l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final IronSource.a f43983m;

    protected enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(C4237b1 c4237b1, AbstractAdapter abstractAdapter) {
        this.f43972b = c4237b1;
        this.f43983m = c4237b1.b();
        this.f43971a = abstractAdapter;
        JSONObject jSONObjectC = c4237b1.c();
        this.f43973c = jSONObjectC;
        try {
            jSONObjectC.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
        }
        this.f43974d = a.NOT_LOADED;
        this.f43975e = null;
        this.f43977g = "";
        this.f43978h = null;
        this.f43979i = new ArrayList();
    }

    boolean a(a aVar, a aVar2) {
        synchronized (this.f43981k) {
            try {
                if (this.f43974d != aVar) {
                    return false;
                }
                b(aVar2);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f43972b.f() + ": current state=" + this.f43974d + ", new state=" + aVar);
        synchronized (this.f43981k) {
            this.f43974d = aVar;
        }
    }

    public C4237b1 f() {
        return this.f43972b;
    }

    public String g() {
        return this.f43977g;
    }

    public String h() {
        return this.f43972b.f();
    }

    public int i() {
        return this.f43972b.d();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f43971a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f43971a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f43972b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f43972b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", Integer.valueOf(this.f43972b.d()));
            if (!TextUtils.isEmpty(this.f43977g)) {
                map.put("auctionId", this.f43977g);
            }
            JSONObject jSONObject = this.f43978h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f43978h);
            }
            if (!TextUtils.isEmpty(this.f43980j)) {
                map.put("dynamicDemandSource", this.f43980j);
            }
            if (o()) {
                map.put("isOneFlow", 1);
                return map;
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e10);
        }
        return map;
    }

    String k() {
        a aVar = this.f43974d;
        return aVar == null ? "null" : aVar.toString();
    }

    public String l() {
        return this.f43972b.i();
    }

    public List<String> m() {
        return this.f43979i;
    }

    public boolean n() {
        return this.f43972b.j();
    }

    public boolean o() {
        return this.f43973c.optBoolean("isOneFlow", false);
    }

    void p() {
        synchronized (this.f43982l) {
            try {
                Timer timer = this.f43975e;
                if (timer != null) {
                    timer.cancel();
                    this.f43975e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f43981k) {
            try {
                aVar2 = this.f43974d;
                if (Arrays.asList(aVarArr).contains(this.f43974d)) {
                    b(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar2;
    }

    public void b(String str) {
        this.f43980j = com.ironsource.mediationsdk.d.b().c(str);
    }

    boolean a(a aVar) {
        boolean z10;
        synchronized (this.f43981k) {
            z10 = this.f43974d == aVar;
        }
        return z10;
    }

    public void a(boolean z10) {
        try {
            this.f43973c.put("isOneFlow", z10);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z10 + ". Error: " + e10.getMessage());
        }
    }

    void a(TimerTask timerTask) {
        synchronized (this.f43982l) {
            p();
            Timer timer = new Timer();
            this.f43975e = timer;
            timer.schedule(timerTask, this.f43976f);
        }
    }

    public void a(String str) {
        this.f43977g = str;
    }

    public void a(JSONObject jSONObject) {
        this.f43978h = jSONObject;
    }

    protected void a(List<String> list, String str, int i10, String str2, String str3) {
        Iterator it = ((List) Z9.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            String str4 = str;
            int i11 = i10;
            com.ironsource.mediationsdk.d.b().a(str3, str4, com.ironsource.mediationsdk.d.b().a((String) it.next(), str4, i11, str2, "", "", "", ""));
            str = str4;
            i10 = i11;
        }
    }
}
