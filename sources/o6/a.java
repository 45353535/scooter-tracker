package o6;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import q6.e;
import q6.g;

/* JADX INFO: loaded from: classes11.dex */
public class a extends k implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p6.a f96347e;

    /* JADX INFO: renamed from: o6.a$a, reason: collision with other inner class name */
    class RunnableC1104a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f96348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m6.c f96349c;

        /* JADX INFO: renamed from: o6.a$a$a, reason: collision with other inner class name */
        class C1105a implements m6.b {
            C1105a() {
            }

            @Override // m6.b
            public void onAdLoaded() {
                ((k) a.this).f67948b.put(RunnableC1104a.this.f96349c.c(), RunnableC1104a.this.f96348b);
            }
        }

        RunnableC1104a(e eVar, m6.c cVar) {
            this.f96348b = eVar;
            this.f96349c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f96348b.a(new C1105a());
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f96352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m6.c f96353c;

        /* JADX INFO: renamed from: o6.a$b$a, reason: collision with other inner class name */
        class C1106a implements m6.b {
            C1106a() {
            }

            @Override // m6.b
            public void onAdLoaded() {
                ((k) a.this).f67948b.put(b.this.f96353c.c(), b.this.f96352b);
            }
        }

        b(g gVar, m6.c cVar) {
            this.f96352b = gVar;
            this.f96353c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f96352b.a(new C1106a());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q6.c f96356b;

        c(q6.c cVar) {
            this.f96356b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f96356b.a(null);
        }
    }

    public a(d dVar, String str) {
        super(dVar);
        p6.a aVar = new p6.a(new l6.a(str));
        this.f96347e = aVar;
        this.f67947a = new r6.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, m6.c cVar, h hVar) {
        l.a(new RunnableC1104a(new e(context, this.f96347e, cVar, this.f67950d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void f(Context context, RelativeLayout relativeLayout, m6.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new q6.c(context, relativeLayout, this.f96347e, cVar, i10, i11, this.f67950d, gVar)));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void g(Context context, m6.c cVar, i iVar) {
        l.a(new b(new g(context, this.f96347e, cVar, this.f67950d, iVar), cVar));
    }
}
