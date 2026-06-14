package yads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes4.dex */
public final class kn2 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f112785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f112786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ln2 f112787c;

    public kn2(ln2 ln2Var) {
        this.f112787c = ln2Var;
    }

    public final /* synthetic */ void a() {
        ln2 ln2Var = this.f112787c;
        if (ln2Var.f113170f != null) {
            ln2Var.a();
        }
    }

    public final void b() {
        ln2 ln2Var = this.f112787c;
        if (ln2Var.f113170f == null || (ln2Var.f113169e & 3) == 0) {
            return;
        }
        ln2Var.a();
    }

    public final void c() {
        this.f112787c.f113168d.post(new Runnable() { // from class: yads.kh
            @Override // java.lang.Runnable
            public final void run() {
                this.f112704b.a();
            }
        });
    }

    public final void d() {
        this.f112787c.f113168d.post(new Runnable() { // from class: yads.lh
            @Override // java.lang.Runnable
            public final void run() {
                this.f113091b.b();
            }
        });
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        if (z10) {
            return;
        }
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        if (this.f112785a && this.f112786b == zHasCapability) {
            if (zHasCapability) {
                d();
            }
        } else {
            this.f112785a = true;
            this.f112786b = zHasCapability;
            c();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c();
    }
}
