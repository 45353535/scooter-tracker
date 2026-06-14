package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class bp implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28715d;

    public bp(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f28712a = anVar;
        this.f28713b = anVar2;
        this.f28714c = anVar3;
        this.f28715d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f28712a.a(), (com.google.android.play.integrity.internal.s) this.f28713b.a(), ((au) this.f28714c).a(), new j());
    }
}
