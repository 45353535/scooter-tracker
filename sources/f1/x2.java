package f1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9 f71479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f71480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f71481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedPreferences f71482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i8 f71483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y9 f71484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wc f71485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g0 f71486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b1.e f71487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final hf f71488k;

    public x2(Context context, h9 identity, i reachability, AtomicReference sdkConfig, SharedPreferences sharedPreferences, i8 timeSource, y9 carrierBuilder, wc session, g0 privacyApi, b1.e eVar, hf deviceBodyFieldsFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(carrierBuilder, "carrierBuilder");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(deviceBodyFieldsFactory, "deviceBodyFieldsFactory");
        this.f71478a = context;
        this.f71479b = identity;
        this.f71480c = reachability;
        this.f71481d = sdkConfig;
        this.f71482e = sharedPreferences;
        this.f71483f = timeSource;
        this.f71484g = carrierBuilder;
        this.f71485h = session;
        this.f71486i = privacyApi;
        this.f71487j = eVar;
        this.f71488k = deviceBodyFieldsFactory;
    }

    @Override // f1.g2
    public n3 a() {
        rd rdVar = rd.f70996b;
        String strE = rdVar.e();
        String strF = rdVar.f();
        kf kfVarO = this.f71479b.o();
        z8 z8VarF = vd.f(this.f71480c);
        i9 i9VarA = this.f71484g.a(this.f71478a);
        jd jdVarI = this.f71485h.i();
        b9 b9VarE = vd.e(this.f71483f);
        v0 v0VarJ = this.f71486i.j();
        me meVarK = ((ga) this.f71481d.get()).k();
        ne neVarA = this.f71488k.a();
        b1.e eVar = this.f71487j;
        return new n3(strE, strF, kfVarO, z8VarF, i9VarA, jdVarI, b9VarE, v0VarJ, meVarK, neVarA, eVar != null ? eVar.c() : null);
    }
}
