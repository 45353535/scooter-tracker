package com.iab.omid.library.ironsrc.internal;

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
    private static j f35328d = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f35329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35330b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35331c = false;

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
                z10 = jVar.f35331c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f35331c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f35330b = z11;
        }
    }

    public static j b() {
        return f35328d;
    }

    public void a() {
        Context context = this.f35329a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f35330b, zIsDeviceLocked);
        this.f35331c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f35329a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f35331c || this.f35330b)) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z11 || z10);
        }
    }
}
