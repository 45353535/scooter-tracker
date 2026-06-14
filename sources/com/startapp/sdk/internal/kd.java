package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class kd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f64830b;

    public kd(od odVar, String str) {
        this.f64830b = odVar;
        this.f64829a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f64830b;
        String str = this.f64829a;
        if (!odVar.f65023h) {
            odVar.f65033r = System.currentTimeMillis();
            odVar.f65032q.put(str, Float.valueOf(-1.0f));
            odVar.f65019d.postDelayed(odVar.f65034s, odVar.f65024i);
            odVar.f65023h = true;
        }
        odVar.f65031p = false;
        odVar.a();
    }
}
