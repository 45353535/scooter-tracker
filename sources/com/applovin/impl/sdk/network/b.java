package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f10870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10871e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f10872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f10873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f10874h;

    class a implements AppLovinPostbackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f10875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f10876b;

        a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f10875a = dVar;
            this.f10876b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            o unused = b.this.f10868b;
            if (o.a()) {
                b.this.f10868b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f10875a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f10875a);
            t2.a(this.f10876b, str, i10);
            if (this.f10875a.c() == 1) {
                b.this.f10867a.D().a("dispatchPostback", str, i10, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f10875a);
            o unused = b.this.f10868b;
            if (o.a()) {
                b.this.f10868b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f10875a);
            }
            b.this.c();
            t2.a(this.f10876b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f10872f = arrayList;
        this.f10873g = new HashSet();
        this.f10874h = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f10867a = kVar;
        this.f10868b = kVar.O();
        int iIntValue = ((Integer) kVar.a(x4.J2)).intValue();
        this.f10869c = iIntValue;
        if (!((Boolean) kVar.a(x4.M2)).booleanValue()) {
            this.f10870d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.f10870d = cVar;
        arrayList.addAll(cVar.a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f10867a.q0().a((i5) this.f10870d, d6.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f10871e) {
            while (this.f10872f.size() > this.f10869c) {
                try {
                    this.f10872f.remove(0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f10872f.add(dVar);
        }
        if (o.a()) {
            this.f10868b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    protected List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f10871e) {
            try {
                if (((Boolean) this.f10867a.a(x4.L2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f10874h.size());
                    arrayList.addAll(this.f10874h);
                } else {
                    arrayList.ensureCapacity(this.f10872f.size());
                    arrayList.addAll(this.f10872f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f10871e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f10871e) {
            try {
                Iterator it = new ArrayList(this.f10872f).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final d dVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f10868b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10912b.b(dVar, appLovinPostbackListener);
                }
            }, n7.i(), dVar.m());
        }
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f10915b.e();
            }
        }, true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f10871e) {
            try {
                Iterator it = this.f10874h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f10874h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f10871e) {
            this.f10872f.clear();
            this.f10874h.clear();
        }
        this.f10867a.q0().a((i5) this.f10870d, d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f10871e) {
            this.f10873g.remove(dVar);
            this.f10874h.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.f10868b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f10867a.E0() && !dVar.m()) {
            if (o.a()) {
                this.f10868b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f10868b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f10871e) {
            try {
                if (this.f10873g.contains(dVar)) {
                    if (o.a()) {
                        this.f10868b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f10867a.a(x4.I2);
                if (dVar.c() > num.intValue()) {
                    if (o.a()) {
                        this.f10868b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f10871e) {
                    this.f10873g.add(dVar);
                }
                e eVarB = e.b(this.f10867a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (o.a()) {
                    this.f10868b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f10867a.g0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f10871e) {
            this.f10873g.remove(dVar);
            this.f10872f.remove(dVar);
        }
        if (o.a()) {
            this.f10868b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f10867a.q0().a((i5) new r6(this.f10867a, z11, "runPostbackTask", runnable), d6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
