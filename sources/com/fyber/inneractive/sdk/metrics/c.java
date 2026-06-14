package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f21129g = String.valueOf(24);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f21130h = String.valueOf(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f21131i = String.valueOf(24);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f21132j = String.valueOf(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnitDisplayType f21134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f21135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f21136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f21137f;

    public c(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f21135d = eVar;
        this.f21136e = inneractiveAdRequest;
        this.f21133b = str;
        this.f21134c = unitDisplayType;
        this.f21137f = jSONArray;
    }

    public final void a() {
        d dVar = d.f21138d;
        g gVarA = dVar.a(this.f21133b);
        HashMap mapJ = gVarA.j();
        if (!gVarA.a()) {
            IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", dVar.a(this.f21133b).toString());
        } else {
            dVar.f21139a.remove(this.f21133b);
            r.f23895a.execute(new b(this, gVarA, mapJ));
        }
    }
}
