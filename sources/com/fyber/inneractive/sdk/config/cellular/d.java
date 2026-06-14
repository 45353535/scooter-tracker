package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f20334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f20335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CopyOnWriteArrayList f20336c = new CopyOnWriteArrayList();

    public d(Context context) {
        this.f20334a = (TelephonyManager) context.getSystemService("phone");
        this.f20335b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public abstract void a();

    public abstract void a(a aVar);

    public abstract void a(h hVar);

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList = this.f20336c;
        if (copyOnWriteArrayList == null) {
            IAlog.a("NetworkDetector: onNetworkUpdated: no update listeners", new Object[0]);
            return;
        }
        for (h hVar : copyOnWriteArrayList) {
            if (hVar != null) {
                hVar.a(z0Var);
            }
        }
    }
}
