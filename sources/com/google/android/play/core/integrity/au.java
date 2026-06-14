package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes9.dex */
public final class au implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f28669b;

    public au(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f28668a = anVar;
        this.f28669b = anVar2;
    }

    @Override // com.google.android.play.integrity.internal.an
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.f28668a, this.f28669b);
    }
}
