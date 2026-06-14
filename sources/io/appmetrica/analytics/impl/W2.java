package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class W2 implements InterfaceC5354pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f76610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f76611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f76612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N5 f76613d;

    public W2(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, 0);
    }

    @Nullable
    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.f76610a.add(consumer);
        return this.f76611b;
    }

    public final void b() {
        this.f76611b = null;
        N5 n52 = this.f76613d;
        Context context = this.f76612c;
        synchronized (n52) {
            if (n52.f76153b) {
                try {
                    context.unregisterReceiver(n52.f76152a);
                    n52.f76153b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5354pk
    public final synchronized void onCreate() {
        Intent intentA = a();
        this.f76611b = intentA;
        Iterator it = this.f76610a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentA);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5354pk
    public final synchronized void onDestroy() {
        this.f76611b = null;
        b();
        Iterator it = this.f76610a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public W2(Context context, ICommonExecutor iCommonExecutor, int i10) {
        this.f76610a = new ArrayList();
        this.f76611b = null;
        this.f76612c = context;
        this.f76613d = M5.a(new B2(new V2(this), iCommonExecutor));
    }

    public final Intent a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        N5 n52 = this.f76613d;
        Context context = this.f76612c;
        synchronized (n52) {
            try {
                intentRegisterReceiver = context.registerReceiver(n52.f76152a, intentFilter);
                try {
                    n52.f76153b = true;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                intentRegisterReceiver = null;
            }
        }
        return intentRegisterReceiver;
    }
}
