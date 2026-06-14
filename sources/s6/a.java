package s6;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import u6.e;
import u6.g;

/* JADX INFO: loaded from: classes11.dex */
public class a extends k implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t6.a f99778e;

    /* JADX INFO: renamed from: s6.a$a, reason: collision with other inner class name */
    class RunnableC1189a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f99779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m6.c f99780c;

        /* JADX INFO: renamed from: s6.a$a$a, reason: collision with other inner class name */
        class C1190a implements m6.b {
            C1190a() {
            }

            @Override // m6.b
            public void onAdLoaded() {
                ((k) a.this).f67948b.put(RunnableC1189a.this.f99780c.c(), RunnableC1189a.this.f99779b);
            }
        }

        RunnableC1189a(e eVar, m6.c cVar) {
            this.f99779b = eVar;
            this.f99780c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f99779b.a(new C1190a());
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f99783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m6.c f99784c;

        /* JADX INFO: renamed from: s6.a$b$a, reason: collision with other inner class name */
        class C1191a implements m6.b {
            C1191a() {
            }

            @Override // m6.b
            public void onAdLoaded() {
                ((k) a.this).f67948b.put(b.this.f99784c.c(), b.this.f99783b);
            }
        }

        b(g gVar, m6.c cVar) {
            this.f99783b = gVar;
            this.f99784c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f99783b.a(new C1191a());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u6.c f99787b;

        c(u6.c cVar) {
            this.f99787b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f99787b.a(null);
        }
    }

    public a(d dVar, String str) {
        super(dVar);
        t6.a aVar = new t6.a(new l6.a(str));
        this.f99778e = aVar;
        this.f67947a = new v6.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, m6.c cVar, h hVar) {
        l.a(new RunnableC1189a(new e(context, this.f99778e, cVar, this.f67950d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void f(Context context, RelativeLayout relativeLayout, m6.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new u6.c(context, relativeLayout, this.f99778e, cVar, i10, i11, this.f67950d, gVar)));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void g(Context context, m6.c cVar, i iVar) {
        l.a(new b(new g(context, this.f99778e, cVar, this.f67950d, iVar), cVar));
    }
}
