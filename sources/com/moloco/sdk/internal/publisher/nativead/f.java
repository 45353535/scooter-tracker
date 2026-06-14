package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.internal.ortb.model.z;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.moloco.sdk.internal.publisher.s0;
import com.moloco.sdk.internal.publisher.w;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.e f54946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.model.a f54947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f54948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f54949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AdFormatType f54950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f54951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f54952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f54953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s0 f54954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f54955k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f54956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f54957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f54958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f54959d;

        public a(List list, List list2, l persistentHttpRequest) {
            Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
            this.f54956a = list;
            this.f54957b = list2;
            this.f54958c = persistentHttpRequest;
            this.f54959d = new LinkedHashSet();
        }

        public final void a() {
            List list = this.f54956a;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f54958c.a((String) it.next());
                }
            }
            this.f54956a = null;
            List<a.b> list2 = this.f54957b;
            if (list2 != null) {
                for (a.b bVar : list2) {
                    if (bVar.c() != null && bVar.a() == 1 && bVar.b() == 1) {
                        this.f54958c.a(bVar.c());
                    }
                }
            }
            this.f54957b = null;
        }

        public final void b(List urls) {
            Intrinsics.checkNotNullParameter(urls, "urls");
            Iterator it = urls.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!this.f54959d.contains(str)) {
                    this.f54958c.a(str);
                    this.f54959d.add(str);
                }
            }
        }
    }

    public f(String adUnitId, com.moloco.sdk.internal.ortb.model.e bid, com.moloco.sdk.internal.publisher.nativead.model.a ortbResponse, q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, AdFormatType adFormatType, l persistentHttpRequest, t0 externalLinkHandler, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f54945a = adUnitId;
        this.f54946b = bid;
        this.f54947c = ortbResponse;
        this.f54948d = appLifecycleTrackerService;
        this.f54949e = customUserEventBuilderService;
        this.f54950f = adFormatType;
        this.f54951g = persistentHttpRequest;
        this.f54952h = externalLinkHandler;
        this.f54953i = metricsRecorder;
        this.f54954j = c();
        this.f54955k = d();
    }

    public static final z a(com.moloco.sdk.internal.ortb.model.e eVar) {
        return eVar.getExt().getSdkEvents();
    }

    public static final w b(f fVar) {
        String burl = fVar.f54946b.getBurl();
        if (burl != null) {
            return new w(burl, Float.valueOf(fVar.f54946b.getPrice()));
        }
        return null;
    }

    public final s0 c() {
        final com.moloco.sdk.internal.ortb.model.e eVar = this.f54946b;
        return com.moloco.sdk.internal.publisher.a.b(null, this.f54948d, this.f54949e, new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a(eVar);
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.b(this.f54944b);
            }
        }, null, null, this.f54950f, this.f54953i, null, 608, null);
    }

    public final a d() {
        com.moloco.sdk.internal.publisher.nativead.model.a aVar = this.f54947c;
        return new a(aVar.c(), aVar.b(), this.f54951g);
    }

    public final void e() {
        a.c cVarD = this.f54947c.d();
        if (cVarD != null) {
            this.f54955k.b(cVarD.a());
            this.f54952h.a(cVarD.b());
        }
        this.f54954j.onAdClicked(MolocoAdKt.createAdInfo$default(this.f54945a, null, null, 6, null));
    }

    public final void f() {
        this.f54955k.a();
        this.f54954j.onAdShowSuccess(MolocoAdKt.createAdInfo$default(this.f54945a, null, null, 6, null));
    }
}
