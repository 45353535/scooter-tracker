package com.startapp.sdk.internal;

import com.amazon.device.ads.DtbConstants;

/* JADX INFO: loaded from: classes11.dex */
public final class nd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f64961b;

    public nd(od odVar, String str) {
        this.f64961b = odVar;
        this.f64960a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f64961b;
        String str = this.f64960a;
        if (odVar.f65022g || odVar.f65030o || !odVar.f65020e.equals(str) || h0.a(str)) {
            return;
        }
        if (str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS)) {
            odVar.f65031p = true;
            Float f10 = (Float) odVar.f65032q.get(str);
            if (f10 == null || f10.floatValue() < 0.0f) {
                odVar.f65032q.put(str, Float.valueOf((System.currentTimeMillis() - odVar.f65033r) / 1000.0f));
            }
            synchronized (odVar.f65019d) {
                odVar.f65019d.removeCallbacks(odVar.f65036u);
                odVar.f65019d.postDelayed(odVar.f65036u, odVar.f65025j);
            }
        }
    }
}
