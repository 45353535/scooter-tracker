package wc;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import eg.e0;
import eg.m1;
import eg.o0;
import ic.v;
import id.g1;
import id.p;
import id.q;
import id.s;
import id.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.i;
import pd.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f107882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wc.b f107883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f107884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f107885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f107886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f107887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f107888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f107889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f107890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f107891l;

    /* JADX INFO: renamed from: wc.a$a, reason: collision with other inner class name */
    private static final class C1326a extends wd.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xc.a f107892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bitmap f107893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Function2 f107894e;

        public C1326a(xc.a algorithm, Bitmap image, Function2 callback) {
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f107892c = algorithm;
            this.f107893d = image;
            this.f107894e = callback;
        }

        @Override // wd.b
        public void d() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Boolean boolG = this.f107892c.g(this.f107893d);
            if (boolG != null) {
                this.f107894e.invoke(this, new q(boolG.booleanValue(), this.f107892c.c(), System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                this.f107894e.invoke(this, null);
            }
        }
    }

    private static final class b extends wd.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f107895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final double f107896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f107897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Function1 f107898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final xd.a f107899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final WeakReference f107900h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List f107901i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f107902j;

        /* JADX INFO: renamed from: wc.a$b$a, reason: collision with other inner class name */
        private final class C1327a implements dd.b {
            public C1327a() {
            }

            @Override // dd.b
            public void a(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                b.this.e(bitmap);
            }

            @Override // dd.b
            public void a() {
                b.this.m();
            }
        }

        /* JADX INFO: renamed from: wc.a$b$b, reason: collision with other inner class name */
        static final class C1328b extends Lambda implements Function2 {
            C1328b() {
                super(2);
            }

            public final void a(C1326a algorithmTask, q qVar) {
                Intrinsics.checkNotNullParameter(algorithmTask, "algorithmTask");
                b.this.g(algorithmTask, qVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C1326a) obj, (q) obj2);
                return Unit.f93236a;
            }
        }

        public b(View view, Handler screenshotCallbackHandler, double d10, List algorithms, Function1 callback) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(screenshotCallbackHandler, "screenshotCallbackHandler");
            Intrinsics.checkNotNullParameter(algorithms, "algorithms");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f107895c = screenshotCallbackHandler;
            this.f107896d = d10;
            this.f107897e = algorithms;
            this.f107898f = callback;
            this.f107899g = new xd.a(i.a(new e0("DetectorTaskManager").plus(m1.b(null, 1, null)).plus(o0.a())));
            this.f107900h = new WeakReference(view);
            this.f107901i = new CopyOnWriteArrayList();
            this.f107902j = new CopyOnWriteArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(Bitmap bitmap) {
            if (!k()) {
                j.g(bitmap);
                return;
            }
            Bitmap bitmapA = j.a(bitmap, this.f107896d);
            if (!Intrinsics.areEqual(bitmapA, bitmap)) {
                j.g(bitmap);
            }
            if (!k()) {
                j.g(bitmap);
                return;
            }
            List list = this.f107897e;
            ArrayList<C1326a> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1326a((xc.a) it.next(), bitmapA, new C1328b()));
            }
            this.f107901i.addAll(arrayList);
            for (C1326a c1326a : arrayList) {
                if (!this.f107899g.b(c1326a)) {
                    f(c1326a);
                }
            }
        }

        private final void f(C1326a c1326a) {
            this.f107901i.remove(c1326a);
            if (this.f107901i.isEmpty()) {
                l();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C1326a c1326a, q qVar) {
            if (qVar != null) {
                this.f107902j.add(qVar);
            }
            f(c1326a);
        }

        private final boolean k() {
            return !b();
        }

        private final void l() {
            if (k()) {
                this.f107898f.invoke(this.f107902j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m() {
            l();
        }

        @Override // wd.b, pd.b
        public void a(boolean z10) {
            super.a(z10);
            if (z10) {
                Iterator it = this.f107901i.iterator();
                while (it.hasNext()) {
                    this.f107899g.cancel((C1326a) it.next());
                }
                this.f107901i.clear();
            }
        }

        @Override // wd.b
        public void d() {
            View view = (View) this.f107900h.get();
            if (view == null) {
                return;
            }
            dd.a.f68657a.a(view, this.f107895c, Bitmap.Config.ARGB_8888, new C1327a());
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f107905f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final yd.b invoke() {
            HandlerThread handlerThread = new HandlerThread("BrokenCreativeDetectorTaskManager");
            handlerThread.start();
            return new yd.b(new Handler(handlerThread.getLooper()));
        }
    }

    static final class d extends Lambda implements Function1 {
        d() {
            super(1);
        }

        public final void a(List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a.this.c(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Unit.f93236a;
        }
    }

    public a(int i10, String adElementName, s brokenCreativeDetectorParams, wc.b brokenCreativeDetectorListener) {
        Intrinsics.checkNotNullParameter(adElementName, "adElementName");
        Intrinsics.checkNotNullParameter(brokenCreativeDetectorParams, "brokenCreativeDetectorParams");
        Intrinsics.checkNotNullParameter(brokenCreativeDetectorListener, "brokenCreativeDetectorListener");
        this.f107880a = i10;
        this.f107881b = adElementName;
        this.f107882c = brokenCreativeDetectorParams;
        this.f107883d = brokenCreativeDetectorListener;
        this.f107884e = lf.i.a(c.f107905f);
        this.f107885f = new CopyOnWriteArrayList();
        this.f107886g = new AtomicBoolean(false);
        this.f107887h = new AtomicBoolean(false);
        this.f107888i = new AtomicBoolean(false);
        this.f107889j = new Object();
    }

    private final void b(t tVar) {
        if (e()) {
            v.g("BrokenCreativeDetector", "Notify detector result: %s", tVar);
            this.f107883d.a(tVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(List list) {
        if (e()) {
            Iterator it = list.iterator();
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                float fC = qVar.a().c();
                if (qVar.c()) {
                    d11 += (double) fC;
                }
                d10 += (double) fC;
            }
            boolean z10 = (d10 != 0.0d ? d11 / d10 : 0.0d) >= this.f107882c.e();
            if (!this.f107882c.g() || z10) {
                t tVar = new t(wc.c.f107907a.a(z10), this.f107880a, this.f107881b, System.currentTimeMillis() - this.f107890k, list);
                if (this.f107882c.f() || !this.f107885f.contains(tVar)) {
                    this.f107885f.add(tVar);
                    b(tVar);
                }
            }
            g1 g1VarC = this.f107882c.c();
            if (!(g1VarC == g1.ValidCreative && z10) && ((g1VarC != g1.BrokenCreative || z10) && g1VarC != g1.Never)) {
                this.f107888i.set(true);
            } else {
                l();
            }
        }
    }

    private final boolean e() {
        return (!j() || k() || i()) ? false : true;
    }

    private final void f() {
        synchronized (this.f107889j) {
            b bVar = this.f107891l;
            if (bVar != null) {
                h().cancel(bVar);
            }
        }
    }

    private final yd.b h() {
        return (yd.b) this.f107884e.getValue();
    }

    private final boolean i() {
        return this.f107887h.get();
    }

    private final boolean j() {
        return this.f107886g.get();
    }

    private final boolean k() {
        return this.f107888i.get();
    }

    private final void l() {
        synchronized (this.f107889j) {
            f();
            if (e()) {
                b bVar = this.f107891l;
                if (bVar != null) {
                    h().a(bVar, this.f107882c.d());
                }
            }
        }
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (k() || i()) {
            return;
        }
        synchronized (this.f107889j) {
            try {
                if (this.f107886g.compareAndSet(false, true)) {
                    List listA = this.f107882c.a();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xc.b.f108168a.a((p) it.next()));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    this.f107890k = System.currentTimeMillis();
                    this.f107891l = new b(view, h().f(), this.f107882c.b(), arrayList, new d());
                    l();
                    Unit unit = Unit.f93236a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        this.f107887h.set(true);
        m();
    }

    public final void m() {
        synchronized (this.f107889j) {
            this.f107886g.set(false);
            f();
            this.f107891l = null;
            Unit unit = Unit.f93236a;
        }
    }
}
