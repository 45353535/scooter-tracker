package n1;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f95027b;

    public b(e eVar) {
        this.f95027b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f95027b.f95044m) {
            try {
                Intent intent = new Intent();
                intent.setClassName(this.f95027b.f95040i, "com.digitalturbine.ignite.cl.IgniteRemoteService");
                e eVar = this.f95027b;
                Context context = eVar.f95037f;
                if (context != null) {
                    context.bindService(intent, eVar, 1);
                }
            } catch (Throwable th2) {
                Object[] objArr = {th2};
                t1.a aVar = t1.b.f104802b.f104803a;
                if (aVar != null) {
                    aVar.e("Failed to bind IgniteRemoteService", objArr);
                }
                if (th2.getMessage() != null && th2.getMessage().contains("Too many bind requests")) {
                } else {
                    p1.b.b(p1.d.ONE_DT_GENERAL_ERROR, x1.a.a(th2, p1.c.IGNITE_SERVICE_UNAVAILABLE));
                }
            } finally {
            }
        }
    }
}
