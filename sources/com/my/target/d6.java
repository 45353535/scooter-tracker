package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.mediation.AdNetworkLoader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class d6 implements Runnable, AdNetworkLoader.AdParamsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9 f59497a = u9.a(10000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f59499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f59500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f59501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile a f59502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f59503g;

    public interface a {
        void a(Map map);
    }

    public d6(String str, List list, Context context, a aVar) {
        this.f59498b = str;
        this.f59500d = list;
        this.f59499c = context;
        this.f59502f = aVar;
        this.f59503g = list.size();
        this.f59501e = this.f59503g == 0 ? Collections.EMPTY_MAP : new HashMap();
    }

    public void a() {
        synchronized (this) {
            try {
                a aVar = this.f59502f;
                if (aVar == null) {
                    gb.a("MediationParamsLoader: onResult has already been called");
                    return;
                }
                this.f59502f = null;
                aVar.a(this.f59501e);
                this.f59497a.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        if (this.f59503g == 0) {
            gb.a("MediationParamsLoader: empty loaders list, direct onResult call");
            a();
            return;
        }
        gb.a("MediationParamsLoader: params loading started, loaders count: " + this.f59503g);
        this.f59497a.a(this);
        for (AdNetworkLoader adNetworkLoader : this.f59500d) {
            gb.a("MediationParamsLoader: loading params for " + adNetworkLoader);
            adNetworkLoader.setAdParamsListener(this);
            adNetworkLoader.loadParams(this.f59498b, this.f59499c);
        }
    }

    @Override // com.my.target.mediation.AdNetworkLoader.AdParamsListener
    public void onLoad(AdNetworkLoader adNetworkLoader, Map map, String str) {
        synchronized (this) {
            try {
                if (this.f59502f == null) {
                    gb.a("MediationParamsLoader: onResult has already been called, skipping params processing");
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    gb.a("MediationParamsLoader: mediation params is received for " + adNetworkLoader);
                    if (!map.isEmpty()) {
                        this.f59501e.putAll(map);
                    }
                } else {
                    gb.a("MediationParamsLoader: failed to get params in " + adNetworkLoader + " with error - " + str);
                }
                this.f59503g--;
                if (this.f59503g > 0) {
                    return;
                }
                a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        gb.a("MediationParamsLoader: loading timeout");
        Iterator it = this.f59500d.iterator();
        while (it.hasNext()) {
            ((AdNetworkLoader) it.next()).setAdParamsListener(null);
        }
        a();
    }
}
