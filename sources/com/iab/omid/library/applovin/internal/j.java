package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static j f34276d = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f34277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34278b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34279c = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z10;
            boolean z11;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z10 = jVar.f34279c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f34279c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f34278b = z11;
        }
    }

    public static j b() {
        return f34276d;
    }

    public void a() {
        Context context = this.f34277a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f34278b, zIsDeviceLocked);
        this.f34279c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f34277a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f34279c || this.f34278b)) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z11 || z10);
        }
    }
}
