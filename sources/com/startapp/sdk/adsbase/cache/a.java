package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.j;
import com.startapp.sdk.internal.o;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.p6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f64026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p6 f64027b;

    public a(p6 p6Var, ArrayList arrayList) {
        this.f64027b = p6Var;
        this.f64026a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        j jVar = this.f64027b.f65083b;
        ArrayList<DiskAdCacheManager$DiskCacheKey> arrayList = this.f64026a;
        if (arrayList != null) {
            try {
                for (DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey : arrayList) {
                    jVar.f64739a.a(null, diskAdCacheManager$DiskCacheKey.placement, diskAdCacheManager$DiskCacheKey.adPreferences, true, diskAdCacheManager$DiskCacheKey.a(), null, null);
                }
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        p pVar = jVar.f64739a;
        pVar.f65060d = false;
        for (o oVar : pVar.f65061e) {
            pVar.a(oVar.f64975a, oVar.f64976b, oVar.f64977c, false, 0, oVar.f64978d, null);
        }
        pVar.f65061e.clear();
    }
}
