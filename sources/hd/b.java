package hd;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import id.a0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jd.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f73159b;

    public b(List list) {
        this.f73159b = new CopyOnWriteArrayList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Handler handler, Runnable runnable) {
        this.f73159b.clear();
        handler.post(runnable);
    }

    @Override // hd.f
    public void destroy(final Runnable runnable) {
        final Handler handlerA = l.a();
        jd.b bVar = runnable != null ? new jd.b(this.f73159b.size(), new Runnable() { // from class: hd.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f73156b.b(handlerA, runnable);
            }
        }) : null;
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).destroy(bVar);
        }
    }

    @Override // hd.f
    public void onClicked() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onClicked();
        }
    }

    @Override // hd.f
    public void onError(a0 a0Var) {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onError(a0Var);
        }
    }

    @Override // hd.f
    public void onShown() {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onShown();
        }
    }

    @Override // hd.f
    public void onViewAddedToContainer(View view, ViewGroup viewGroup) {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onViewAddedToContainer(view, viewGroup);
        }
    }

    @Override // hd.f
    public void onViewCreated(View view) {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onViewCreated(view);
        }
    }

    @Override // hd.f
    public void onViewReady(View view) {
        Iterator it = this.f73159b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).onViewReady(view);
        }
    }
}
