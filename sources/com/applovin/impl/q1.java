package com.applovin.impl;

/* JADX INFO: loaded from: classes6.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f10220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y2 f10222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f10223d;

    public q1(Object obj, long j10) {
        this.f10220a = j10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f10223d = bVar;
            this.f10221b = bVar.getAdZone().d() != null ? this.f10223d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            this.f10222c = y2Var;
            this.f10221b = y2Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f10223d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof y2) {
            this.f10222c = (y2) obj;
        }
    }

    public long b() {
        return this.f10220a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f10223d;
    }

    public String d() {
        String str = this.f10221b;
        return str != null ? str : "Unknown";
    }

    public y2 e() {
        return this.f10222c;
    }

    public String f() {
        if (this.f10223d != null) {
            return "AppLovin";
        }
        y2 y2Var = this.f10222c;
        return y2Var != null ? y2Var.getNetworkName() : "Unknown";
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f10223d;
        return bVar != null ? bVar : this.f10222c;
    }
}
