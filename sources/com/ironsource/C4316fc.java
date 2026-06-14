package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4316fc implements InterfaceC4532s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43105a = C4316fc.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43106b = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4549t7 f43107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f43108d;

    /* JADX INFO: renamed from: com.ironsource.fc$a */
    class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f43109a;

        a(Context context) {
            this.f43109a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C4316fc.this.f43107c.a(Y3.a(network, this.f43109a), Y3.a(this.f43109a, network));
                return;
            }
            InterfaceC4549t7 interfaceC4549t7 = C4316fc.this.f43107c;
            String strB = Y3.b(this.f43109a);
            Context context = this.f43109a;
            interfaceC4549t7.a(strB, Y3.a(context, Y3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C4316fc.this.f43107c.b(Y3.a(network, this.f43109a), Y3.a(this.f43109a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C4316fc.this.f43107c.b(Y3.a(network, this.f43109a), Y3.a(this.f43109a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (Y3.b(this.f43109a).equals("none")) {
                C4316fc.this.f43107c.a();
            }
        }
    }

    public C4316fc(InterfaceC4549t7 interfaceC4549t7) {
        this.f43107c = interfaceC4549t7;
    }

    @Override // com.ironsource.InterfaceC4532s7
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f43106b) {
            a(context);
            if (Y3.b(context).equals("none")) {
                this.f43107c.a();
            }
            if (this.f43108d == null) {
                this.f43108d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.f43108d);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                Log.e(this.f43105a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC4532s7
    public JSONObject c(Context context) {
        return Y3.a(context, Y3.a(context));
    }

    @Override // com.ironsource.InterfaceC4532s7
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f43106b || this.f43108d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f43108d);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Log.e(this.f43105a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC4532s7
    public void a() {
        this.f43108d = null;
    }
}
