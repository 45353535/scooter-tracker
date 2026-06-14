package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C4462o4;
import com.ironsource.InterfaceC4656zc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: loaded from: classes10.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectivityManager f43043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4656zc f43044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43045c = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            InterfaceC4656zc interfaceC4656zc = networkStateReceiver.f43044b;
            if (interfaceC4656zc != null) {
                interfaceC4656zc.a(networkStateReceiver.f43045c);
            }
        }
    }

    public NetworkStateReceiver(Context context, InterfaceC4656zc interfaceC4656zc) {
        this.f43044b = interfaceC4656zc;
        if (context != null) {
            this.f43043a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }

    private boolean a() {
        boolean z10 = this.f43045c;
        ConnectivityManager connectivityManager = this.f43043a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.f43045c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                this.f43045c = false;
            }
        } else {
            this.f43045c = false;
        }
        return z10 != this.f43045c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }
}
