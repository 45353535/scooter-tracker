package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class ld implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f64869b;

    public ld(od odVar, String str) {
        this.f64869b = odVar;
        this.f64868a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f64869b;
        String str = this.f64868a;
        odVar.getClass();
        odVar.f65033r = System.currentTimeMillis();
        odVar.f65032q.put(odVar.f65020e, Float.valueOf((r2 - odVar.f65033r) / 1000.0f));
        odVar.f65032q.put(str, Float.valueOf(-1.0f));
        odVar.f65020e = str;
    }
}
