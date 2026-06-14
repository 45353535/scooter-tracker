package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f21142a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f21143b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f21144c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f21145d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f21146e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f21147f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f21148g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f21149h = null;

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long b() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f21148g = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long c() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f21142a = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long d() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f21145d = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long e() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f21147f = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long f() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f21143b = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long g() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f21144c = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long h() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f21149h = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long i() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f21146e = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final HashMap j() {
        HashMap map = new HashMap();
        Long l10 = this.f21143b;
        if (l10 != null && this.f21142a != null) {
            map.put("sdk_init_network_req", Long.valueOf(l10.longValue() - this.f21142a.longValue()));
        }
        Long l11 = this.f21149h;
        if (l11 != null && this.f21143b != null) {
            map.put("sdk_got_response_from_markup_url", Long.valueOf(l11.longValue() - this.f21143b.longValue()));
        }
        Long l12 = this.f21145d;
        if (l12 != null && this.f21149h != null) {
            map.put("sdk_parsed_res", Long.valueOf(l12.longValue() - this.f21149h.longValue()));
        }
        Long l13 = this.f21144c;
        if (l13 != null && this.f21143b != null) {
            map.put("sdk_got_server_res", Long.valueOf(l13.longValue() - this.f21143b.longValue()));
        }
        Long l14 = this.f21145d;
        if (l14 != null && this.f21144c != null) {
            map.put("sdk_parsed_res", Long.valueOf(l14.longValue() - this.f21144c.longValue()));
        }
        Long l15 = this.f21146e;
        if (l15 != null && this.f21145d != null) {
            map.put("ad_loaded_result", Long.valueOf(l15.longValue() - this.f21145d.longValue()));
        }
        Long l16 = this.f21147f;
        if (l16 != null && this.f21146e != null) {
            map.put("publisher_notified", Long.valueOf(l16.longValue() - this.f21146e.longValue()));
        }
        Long l17 = this.f21148g;
        if (l17 != null && this.f21142a != null) {
            map.put("roundtrip", Long.valueOf(l17.longValue() - this.f21142a.longValue()));
        }
        return map;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricsCollectorData{");
        if (this.f21142a != null && this.f21143b != null) {
            sb2.append(" sdk_init_network_req=");
            sb2.append(this.f21143b.longValue() - this.f21142a.longValue());
        }
        if (this.f21149h != null && this.f21143b != null) {
            sb2.append(", sdk_got_response_from_markup_url=");
            sb2.append(this.f21149h.longValue() - this.f21143b.longValue());
        }
        if (this.f21144c != null && this.f21143b != null) {
            sb2.append(", sdk_got_server_res=");
            sb2.append(this.f21144c.longValue() - this.f21143b.longValue());
        }
        if (this.f21145d != null && this.f21144c != null) {
            sb2.append(", sdk_parsed_res=");
            sb2.append(this.f21145d.longValue() - this.f21144c.longValue());
        }
        if (this.f21146e != null && this.f21145d != null) {
            sb2.append(", ad_loaded_result=");
            sb2.append(this.f21146e.longValue() - this.f21145d.longValue());
        }
        if (this.f21147f != null && this.f21146e != null) {
            sb2.append(", publisher_notified=");
            sb2.append(this.f21147f.longValue() - this.f21146e.longValue());
        }
        if (this.f21148g != null && this.f21142a != null) {
            sb2.append(", roundtrip=");
            sb2.append(this.f21148g.longValue() - this.f21142a.longValue());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
