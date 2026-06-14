package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f28735a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28740f;

    /* synthetic */ s(Context context, r rVar) {
        com.google.android.play.integrity.internal.ak akVarB = com.google.android.play.integrity.internal.al.b(context);
        this.f28736b = akVarB;
        com.google.android.play.integrity.internal.an anVarB = com.google.android.play.integrity.internal.aj.b(ac.f28626a);
        this.f28737c = anVarB;
        au auVar = new au(akVarB, l.f28728a);
        this.f28738d = auVar;
        com.google.android.play.integrity.internal.an anVarB2 = com.google.android.play.integrity.internal.aj.b(new al(akVarB, anVarB, auVar, l.f28728a));
        this.f28739e = anVarB2;
        this.f28740f = com.google.android.play.integrity.internal.aj.b(new ab(anVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f28740f.a();
    }
}
