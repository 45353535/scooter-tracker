package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f75362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f75363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f75365d;

    public f(e eVar, Function1 function1, String str, SafePackageManager safePackageManager) {
        this.f75362a = eVar;
        this.f75363b = function1;
        this.f75364c = str;
        this.f75365d = safePackageManager;
    }

    public final Object a(Context context) throws g {
        IBinder iBinder;
        e eVar;
        if (this.f75365d.resolveService(context, this.f75362a.f75359a, 0) == null) {
            throw new l("could not resolve " + this.f75364c + " services");
        }
        try {
            eVar = this.f75362a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f75359a, eVar, 1)) {
            e eVar2 = this.f75362a;
            if (eVar2.f75360b == null) {
                synchronized (eVar2.f75361c) {
                    if (eVar2.f75360b == null) {
                        try {
                            eVar2.f75361c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f75360b;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            return this.f75363b.invoke(iBinder);
        }
        throw new g("could not bind to " + this.f75364c + " services");
    }

    public final void b(Context context) {
        try {
            this.f75362a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, Function1 function1, String str) {
        this(new e(intent, str), function1, str, new SafePackageManager());
    }
}
