package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bg f64418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bg f64419b;

    public db(bg bgVar, bg bgVar2) {
        this.f64418a = bgVar;
        this.f64419b = bgVar2;
    }

    public final void a(ge... geVarArr) {
        for (ge geVar : geVarArr) {
            if (geVar.f64573d) {
                this.f64419b.a(geVar, geVar.f64574e.longValue());
            } else {
                this.f64418a.a(geVar, geVar.f64574e.longValue());
            }
        }
    }
}
