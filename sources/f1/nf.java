package f1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f70694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f70695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f70696d;

    public interface a {
        void a();

        void b();
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAvailable(android.net.Network r3) {
            /*
                r2 = this;
                java.lang.String r0 = "network"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                f1.nf r0 = f1.nf.this
                android.net.ConnectivityManager r0 = f1.nf.a(r0)
                android.net.NetworkCapabilities r3 = r0.getNetworkCapabilities(r3)
                f1.nf r0 = f1.nf.this
                if (r3 == 0) goto L1d
                r1 = 12
                boolean r3 = r3.hasCapability(r1)
                r1 = 1
                if (r3 != r1) goto L1d
                goto L1e
            L1d:
                r1 = 0
            L1e:
                f1.nf.d(r0, r1)
                f1.nf r3 = f1.nf.this
                boolean r3 = f1.nf.h(r3)
                if (r3 == 0) goto L34
                f1.nf r3 = f1.nf.this
                f1.nf$a r3 = f1.nf.f(r3)
                if (r3 == 0) goto L34
                r3.a()
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.nf.b.onAvailable(android.net.Network):void");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            nf.this.f70693a = false;
            a aVar = nf.this.f70695c;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public nf(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f70694b = (ConnectivityManager) systemService;
        this.f70696d = new b();
    }

    public static /* synthetic */ void c(nf nfVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        nfVar.b(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(f1.nf.a r5) {
        /*
            r4 = this;
            r4.f70695c = r5
            android.net.NetworkRequest$Builder r0 = new android.net.NetworkRequest$Builder
            r0.<init>()
            r1 = 12
            android.net.NetworkRequest$Builder r0 = r0.addCapability(r1)
            android.net.NetworkRequest r0 = r0.build()
            android.net.ConnectivityManager r2 = r4.f70694b
            f1.nf$b r3 = r4.f70696d
            r2.registerNetworkCallback(r0, r3)
            android.net.ConnectivityManager r0 = r4.f70694b
            android.net.Network r0 = r0.getActiveNetwork()
            android.net.ConnectivityManager r2 = r4.f70694b
            android.net.NetworkCapabilities r0 = r2.getNetworkCapabilities(r0)
            if (r0 == 0) goto L2e
            boolean r0 = r0.hasCapability(r1)
            r1 = 1
            if (r0 != r1) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r4.f70693a = r1
            if (r1 == 0) goto L38
            if (r5 == 0) goto L38
            r5.a()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.nf.b(f1.nf$a):void");
    }

    public final boolean e() {
        return this.f70693a;
    }

    public final void g() {
        this.f70694b.unregisterNetworkCallback(this.f70696d);
        this.f70695c = null;
    }
}
