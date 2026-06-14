package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5400rh extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5573yf f78157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zo f78158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f78159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeProvider f78160e;

    public C5400rh(@NonNull C5058e5 c5058e5) {
        this(c5058e5, c5058e5.u(), C5468ua.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        C5058e5 c5058e5 = this.f76636a;
        if (this.f78158c.d()) {
            return false;
        }
        W5 w5A = ((C5351ph) c5058e5.f77072k.a()).f77984e ? W5.a(w52, EnumC5168ib.EVENT_TYPE_APP_UPDATE) : W5.a(w52, EnumC5168ib.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f78159d.getInstallerPackageName(c5058e5.f77062a, c5058e5.f77063b.f76662a), ""));
            C5573yf c5573yf = this.f78157b;
            c5573yf.f76590h.a(c5573yf.f76583a);
            jSONObject.put("preloadInfo", ((C5498vf) c5573yf.c()).b());
        } catch (Throwable unused) {
        }
        w5A.setValue(jSONObject.toString());
        C5392r9 c5392r9 = c5058e5.f77075n;
        c5392r9.a(w5A, Wk.a(c5392r9.f78129c.b(w5A), w5A.f76622i));
        zo zoVar = this.f78158c;
        synchronized (zoVar) {
            Ao ao = zoVar.f78664a;
            ao.a(ao.a().put("init_event_done", true));
        }
        this.f78158c.a(this.f78160e.currentTimeMillis());
        return false;
    }

    public C5400rh(C5058e5 c5058e5, zo zoVar, C5573yf c5573yf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c5058e5);
        this.f78158c = zoVar;
        this.f78157b = c5573yf;
        this.f78159d = safePackageManager;
        this.f78160e = systemTimeProvider;
    }
}
