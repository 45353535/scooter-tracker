package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.BinderC5559y1;
import io.appmetrica.analytics.impl.C5202jk;
import io.appmetrica.analytics.impl.C5213k5;
import io.appmetrica.analytics.impl.C5402rj;
import io.appmetrica.analytics.impl.C5427sj;
import io.appmetrica.analytics.impl.C5468ua;
import io.appmetrica.analytics.impl.C5534x1;
import io.appmetrica.analytics.impl.D1;
import io.appmetrica.analytics.impl.E1;
import io.appmetrica.analytics.impl.F1;
import io.appmetrica.analytics.impl.G1;
import io.appmetrica.analytics.impl.H1;
import io.appmetrica.analytics.impl.L1;
import io.appmetrica.analytics.impl.M1;
import io.appmetrica.analytics.impl.P1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AppMetricaService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static L1 f78669c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5534x1 f78670a = new C5534x1(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f78671b = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC5559y1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f78671b : new BinderC5559y1();
        L1 l12 = f78669c;
        l12.f76043a.execute(new F1(l12, intent));
        return binderC5559y1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L1 l12 = f78669c;
        l12.f76043a.execute(new B1(l12, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C5468ua.a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        L1 l12 = f78669c;
        if (l12 == null) {
            Context applicationContext = getApplicationContext();
            M1 m12 = new M1(applicationContext, this.f78670a, new C5213k5(applicationContext));
            C5202jk c5202jk = C5468ua.H.f78373v;
            P1 p12 = new P1(m12);
            LinkedHashMap linkedHashMap = c5202jk.f77537a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(p12);
            f78669c = new L1(C5468ua.H.f78355d.b(), m12);
        } else {
            l12.f76044b.a(this.f78670a);
        }
        C5468ua c5468ua = C5468ua.H;
        C5427sj c5427sj = new C5427sj(f78669c);
        synchronized (c5468ua) {
            c5468ua.f78357f = new C5402rj(c5468ua.f78352a, c5427sj);
        }
        f78669c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f78669c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        L1 l12 = f78669c;
        l12.f76043a.execute(new G1(l12, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        L1 l12 = f78669c;
        l12.f76043a.execute(new D1(l12, intent, i10));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        L1 l12 = f78669c;
        l12.f76043a.execute(new E1(l12, intent, i10, i11));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        L1 l12 = f78669c;
        l12.f76043a.execute(new H1(l12, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
