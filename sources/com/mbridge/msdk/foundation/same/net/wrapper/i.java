package com.mbridge.msdk.foundation.same.net.wrapper;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.j;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;

/* JADX INFO: loaded from: classes10.dex */
public class i<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.net.b<T> f48769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f48770b = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f48771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f48772b;

        a(v vVar, q qVar) {
            this.f48771a = vVar;
            this.f48772b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f48769a != null) {
                    i.this.f48769a.onSuccess(i.this.a(this.f48771a, this.f48772b));
                }
            } catch (Exception e10) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e10);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f48774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f48775b;

        b(v vVar, q qVar) {
            this.f48774a = vVar;
            this.f48775b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f48769a != null) {
                    i.this.f48769a.onError(i.this.a(this.f48774a.f51994c, this.f48775b));
                }
            } catch (Exception e10) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseError error", e10);
            }
        }
    }

    public i(com.mbridge.msdk.foundation.same.net.b<T> bVar) {
        this.f48769a = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void b(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseError: " + vVar.f51994c.d() + " " + vVar.f51994c.getMessage());
        this.f48770b.post(new b(vVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.e a(v<T> vVar, q qVar) {
        if (vVar == null) {
            return null;
        }
        return com.mbridge.msdk.foundation.same.net.e.a(vVar.f51992a, new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.f51916a, qVar.f51917b, qVar.f51919d));
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void a(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + vVar.f51992a);
        this.f48770b.post(new a(vVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.exception.a a(b0 b0Var, q qVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        if (b0Var == null) {
            return null;
        }
        if (qVar != null) {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.f51916a, qVar.f51917b, qVar.f51919d);
        } else {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(0, null, null);
        }
        if (b0Var.d() == 0) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 1) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(6, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 2) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 4) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(880041, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 5) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 6) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(15, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 7) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(7, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 8) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(10, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 9) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(4, aVar, b0Var.getMessage());
        }
        return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
    }
}
