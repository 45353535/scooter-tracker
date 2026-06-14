package com.fyber.inneractive.sdk.flow.storepromo.model;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20956c;

    public a(String str, b bVar) {
        this.f20955b = str;
        this.f20954a = bVar;
        this.f20956c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f20956c - ((a) obj).f20956c;
    }

    public a(String str, b bVar, int i10) {
        this.f20955b = str;
        this.f20954a = bVar;
        this.f20956c = i10;
    }
}
