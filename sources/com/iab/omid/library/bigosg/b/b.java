package com.iab.omid.library.bigosg.b;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f34517a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f34519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f34522f;

    public interface a {
        void a(boolean z10);
    }

    private b() {
    }

    public static b a() {
        return f34517a;
    }

    private void e() {
        this.f34519c = new BroadcastReceiver() { // from class: com.iab.omid.library.bigosg.b.b.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent == null) {
                    return;
                }
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    b.this.a(true);
                    return;
                }
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    b.this.a(false);
                } else {
                    if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return;
                    }
                    b.this.a(false);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f34518b.registerReceiver(this.f34519c, intentFilter);
    }

    private void f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f34518b;
        if (context == null || (broadcastReceiver = this.f34519c) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        this.f34519c = null;
    }

    private void g() {
        boolean z10 = !this.f34521e;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = com.iab.omid.library.bigosg.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    public void b() {
        e();
        this.f34520d = true;
        g();
    }

    public void c() {
        f();
        this.f34520d = false;
        this.f34521e = false;
        this.f34522f = null;
    }

    public boolean d() {
        return !this.f34521e;
    }

    public void a(@NonNull Context context) {
        this.f34518b = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.f34522f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        if (this.f34521e != z10) {
            this.f34521e = z10;
            if (this.f34520d) {
                g();
                a aVar = this.f34522f;
                if (aVar != null) {
                    aVar.a(d());
                }
            }
        }
    }
}
