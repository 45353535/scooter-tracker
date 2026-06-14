package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f10503e = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f10506c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f10507d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0179a {
        void onAdExpired(com.applovin.impl.t1 t1Var);
    }

    public a(k kVar) {
        this.f10504a = kVar;
        this.f10505b = kVar.O();
    }

    private b b(com.applovin.impl.t1 t1Var) {
        synchronized (this.f10507d) {
            try {
                if (t1Var == null) {
                    return null;
                }
                for (b bVar : this.f10506c) {
                    if (t1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(com.applovin.impl.t1 t1Var, InterfaceC0179a interfaceC0179a) {
        synchronized (this.f10507d) {
            try {
                if (b(t1Var) != null) {
                    if (o.a()) {
                        this.f10505b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                    }
                    return true;
                }
                if (t1Var.getTimeToLiveMillis() <= f10503e) {
                    if (o.a()) {
                        this.f10505b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                    }
                    t1Var.setExpired();
                    return false;
                }
                if (o.a()) {
                    this.f10505b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                if (this.f10506c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f10506c.add(b.a(t1Var, interfaceC0179a, this.f10504a));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet<b> hashSet = new HashSet();
        synchronized (this.f10507d) {
            try {
                for (b bVar : this.f10506c) {
                    com.applovin.impl.t1 t1VarB = bVar.b();
                    if (t1VarB == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = t1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (o.a()) {
                                this.f10505b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + t1VarB);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (o.a()) {
                                this.f10505b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + t1VarB);
                            }
                            bVar.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (b bVar2 : hashSet) {
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(com.applovin.impl.t1 t1Var) {
        synchronized (this.f10507d) {
            try {
                b bVarB = b(t1Var);
                if (bVarB != null) {
                    if (o.a()) {
                        this.f10505b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                    }
                    bVarB.a();
                    a(bVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.f10507d) {
            try {
                this.f10506c.remove(bVar);
                if (this.f10506c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        synchronized (this.f10507d) {
            try {
                Iterator it = this.f10506c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
