package j9;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f85516a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f85517b;

    a a(View view, io.bidmachine.core.j jVar, p pVar) {
        return new o(view, jVar, pVar);
    }

    public void b(View view, io.bidmachine.core.j jVar, p pVar) {
        synchronized (this.f85516a) {
            c();
            a aVarA = a(view, jVar, pVar);
            this.f85517b = aVarA;
            aVarA.start();
        }
    }

    public void c() {
        synchronized (this.f85516a) {
            try {
                a aVar = this.f85517b;
                if (aVar != null) {
                    aVar.stop();
                    this.f85517b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
