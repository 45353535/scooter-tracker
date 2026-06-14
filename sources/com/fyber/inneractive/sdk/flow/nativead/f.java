package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f20775m = IAlog.a(f.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f20776n = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.i f20779c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f20781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f20782f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InneractiveAdRequest f20784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f20785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f20786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.j f20787k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f20777a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f20778b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20780d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f20783g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f20788l = new e(this);

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.f20785i = rVar;
        this.f20787k = jVar;
        this.f20784h = inneractiveAdRequest;
        this.f20779c = iVar;
        this.f20782f = dVar;
        this.f20786j = str;
    }

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.f("%sonMainAssetLoadFailed: %s", f20775m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        for (c cVar : this.f20777a) {
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String strDescription = inneractiveInfrastructureError.description();
        if (this.f20783g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(strDescription));
            d dVar = this.f20782f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.f23895a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f20753b, dVar.f20752a, "send_failed_native_creatives", dVar.f20758g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.nativead.f.a():void");
    }
}
