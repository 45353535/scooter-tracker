package com.ironsource;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.C4500q8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f45897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C4291e4 f45898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private W4 f45899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4326g5 f45901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f45904i = yg.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f45905j;

    protected enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public yg(Context context, C4291e4 c4291e4, W4 w42, int i10, C4326g5 c4326g5, String str) {
        a aVarH = h();
        this.f45905j = aVarH;
        if (aVarH != a.NOT_ALLOWED) {
            this.f45897b = context;
            this.f45898c = c4291e4;
            this.f45899d = w42;
            this.f45900e = i10;
            this.f45901f = c4326g5;
            this.f45902g = 0;
        }
        this.f45896a = str;
    }

    private a h() {
        this.f45903h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.f45904i, "getInitialState mMaxAllowedTrials: " + this.f45903h);
        if (this.f45903h > 0) {
            return a.NOT_RECOVERED;
        }
        Logger.i(this.f45904i, "recovery is not allowed by config");
        return a.NOT_ALLOWED;
    }

    private void j() {
        if (this.f45902g != this.f45903h) {
            this.f45905j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.f45904i, "handleRecoveringEndedFailed | Reached max trials");
        this.f45905j = a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.f45905j = a.RECOVERED;
    }

    public boolean a(C4500q8.c cVar, C4500q8.b bVar) {
        Logger.i(this.f45904i, "shouldRecoverWebController: ");
        a aVar = this.f45905j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.f45904i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C4500q8.c.Native) {
            Logger.i(this.f45904i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C4500q8.b.Loading || bVar == C4500q8.b.None) {
            Logger.i(this.f45904i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.f45904i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.f45904i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f45897b == null || this.f45898c == null || this.f45899d == null) {
            Logger.i(this.f45904i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.f45904i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public Context b() {
        return this.f45897b;
    }

    public String c() {
        return this.f45896a;
    }

    public C4291e4 d() {
        return this.f45898c;
    }

    public int e() {
        return this.f45900e;
    }

    public W4 f() {
        return this.f45899d;
    }

    public C4326g5 g() {
        return this.f45901f;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C4240b4.i.A0, m());
            jSONObject.put(C4240b4.i.B0, this.f45902g);
            jSONObject.put(C4240b4.i.C0, this.f45903h);
            return jSONObject;
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public boolean l() {
        return this.f45905j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.f45905j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.f45905j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f45902g++;
            Logger.i(this.f45904i, "recoveringStarted - trial number " + this.f45902g);
            this.f45905j = aVar2;
        }
    }

    public void a() {
        this.f45897b = null;
        this.f45898c = null;
        this.f45899d = null;
        this.f45901f = null;
    }

    public void a(boolean z10) {
        if (this.f45905j != a.IN_RECOVERING) {
            return;
        }
        if (z10) {
            k();
        } else {
            j();
        }
    }
}
