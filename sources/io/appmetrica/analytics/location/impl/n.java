package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f78713a;

    public n(p pVar) {
        this.f78713a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f78713a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f78719e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f78715a.f78692a);
                tVar2.f78726c.add(pVar.f78717c);
                Iterator it = pVar.f78718d.iterator();
                while (it.hasNext()) {
                    tVar2.f78726c.add((Consumer) it.next());
                }
                pVar.f78719e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f78724a = pVar.f78715a.f78692a;
            }
            if (tVar.f78727d != null) {
                boolean zDidTimePassMillis = tVar.f78725b.didTimePassMillis(tVar.f78728e, tVar.f78724a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z10 = location.distanceTo(tVar.f78727d) > tVar.f78724a.getUpdateDistanceInterval();
                boolean z11 = tVar.f78727d == null || location.getTime() - tVar.f78727d.getTime() >= 0;
                if ((!zDidTimePassMillis && !z10) || !z11) {
                    return;
                }
            }
            tVar.f78727d = location;
            tVar.f78728e = System.currentTimeMillis();
            Iterator it2 = tVar.f78726c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
