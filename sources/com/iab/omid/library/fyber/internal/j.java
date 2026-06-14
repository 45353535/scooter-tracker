package com.iab.omid.library.fyber.internal;

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
    private static j f35052d = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f35053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35054b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35055c = false;

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
                z10 = jVar.f35055c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z10 = jVar.f35055c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f35054b = z11;
        }
    }

    public static j b() {
        return f35052d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = this.f35053a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f35054b, zIsDeviceLocked);
        this.f35055c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f35053a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f35055c || this.f35054b)) {
            return;
        }
        Iterator<com.iab.omid.library.fyber.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z11 || z10);
        }
    }
}
