package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f28742a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28748g;

    /* synthetic */ w(Context context, v vVar) {
        com.google.android.play.integrity.internal.ak akVarB = com.google.android.play.integrity.internal.al.b(context);
        this.f28743b = akVarB;
        com.google.android.play.integrity.internal.an anVarB = com.google.android.play.integrity.internal.aj.b(bb.f28679a);
        this.f28744c = anVarB;
        au auVar = new au(akVarB, n.f28733a);
        this.f28745d = auVar;
        com.google.android.play.integrity.internal.an anVarB2 = com.google.android.play.integrity.internal.aj.b(new bp(akVarB, anVarB, auVar, n.f28733a));
        this.f28746e = anVarB2;
        com.google.android.play.integrity.internal.an anVarB3 = com.google.android.play.integrity.internal.aj.b(new bu(anVarB2));
        this.f28747f = anVarB3;
        this.f28748g = com.google.android.play.integrity.internal.aj.b(new ba(anVarB2, anVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f28748g.a();
    }
}
