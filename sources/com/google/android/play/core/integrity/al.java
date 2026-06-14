package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class al implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28651d;

    public al(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f28648a = anVar;
        this.f28649b = anVar2;
        this.f28650c = anVar3;
        this.f28651d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f28648a.a(), (com.google.android.play.integrity.internal.s) this.f28649b.a(), ((au) this.f28650c).a(), new i());
    }
}
