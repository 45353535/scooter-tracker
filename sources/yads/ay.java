package yads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ay extends eo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f108857a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f108858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e63 f108859c;

    public kl1 a(Object obj, kl1 kl1Var) {
        return kl1Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, ml1 ml1Var, f43 f43Var);

    @Override // yads.eo
    public final void disableInternal() {
        for (zx zxVar : this.f108857a.values()) {
            zxVar.f118866a.disable(zxVar.f118867b);
        }
    }

    @Override // yads.eo
    public final void enableInternal() {
        for (zx zxVar : this.f108857a.values()) {
            zxVar.f118866a.enable(zxVar.f118867b);
        }
    }

    @Override // yads.ml1
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.f108857a.values().iterator();
        while (it.hasNext()) {
            ((zx) it.next()).f118866a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // yads.eo
    public void releaseSourceInternal() {
        for (zx zxVar : this.f108857a.values()) {
            zxVar.f118866a.releaseSource(zxVar.f118867b);
            zxVar.f118866a.removeEventListener(zxVar.f118868c);
            zxVar.f118866a.removeDrmEventListener(zxVar.f118868c);
        }
        this.f108857a.clear();
    }

    public final void a(final Object obj, ml1 ml1Var) {
        if (!this.f108857a.containsKey(obj)) {
            ll1 ll1Var = new ll1() { // from class: yads.c3
                @Override // yads.ll1
                public final void a(ml1 ml1Var2, f43 f43Var) {
                    this.f109185a.a(obj, ml1Var2, f43Var);
                }
            };
            yx yxVar = new yx(this, obj);
            this.f108857a.put(obj, new zx(ml1Var, ll1Var, yxVar));
            Handler handler = this.f108858b;
            handler.getClass();
            ml1Var.addEventListener(handler, yxVar);
            Handler handler2 = this.f108858b;
            handler2.getClass();
            ml1Var.addDrmEventListener(handler2, yxVar);
            ml1Var.prepareSource(ll1Var, this.f108859c, getPlayerId());
            if (isEnabled()) {
                return;
            }
            ml1Var.disable(ll1Var);
            return;
        }
        throw new IllegalArgumentException();
    }
}
