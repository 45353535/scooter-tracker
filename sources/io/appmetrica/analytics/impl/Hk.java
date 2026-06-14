package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Hk implements ServiceWakeLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gk f75875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f75876c = new HashMap();

    public Hk(@NotNull Context context, @NotNull Gk gk) {
        this.f75874a = context;
        this.f75875b = gk;
    }

    @NotNull
    public final String a(@NotNull String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@NotNull String str) {
        try {
            if (this.f75876c.get(str) == null) {
                HashMap map = this.f75876c;
                Gk gk = this.f75875b;
                Context context = this.f75874a;
                String strA = a(str);
                gk.f75833a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(strA);
                Fk fk = new Fk();
                try {
                    context.bindService(intent, fk, 1);
                } catch (Throwable unused) {
                    fk = null;
                }
                map.put(str, fk);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f75876c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@NotNull String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f75876c.get(str);
        if (serviceConnection != null) {
            Gk gk = this.f75875b;
            a(str);
            Context context = this.f75874a;
            gk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
