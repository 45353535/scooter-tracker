package com.appodeal.ads;

import android.app.Activity;

/* JADX INFO: loaded from: classes6.dex */
public final class d8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f13229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f13230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s7 f13231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t7 f13232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t7 f13233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0 f13234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ac f13235h;

    public d8(ac acVar, Activity activity, tc tcVar, s7 s7Var, t7 t7Var, t7 t7Var2, l0 l0Var) {
        this.f13235h = acVar;
        this.f13229b = activity;
        this.f13230c = tcVar;
        this.f13231d = s7Var;
        this.f13232e = t7Var;
        this.f13233f = t7Var2;
        this.f13234g = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13235h.t(this.f13229b, this.f13230c, this.f13231d, this.f13232e, this.f13233f, this.f13234g, true);
    }
}
