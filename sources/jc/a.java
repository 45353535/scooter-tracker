package jc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ic.e;
import ic.f;
import ic.f0;
import ic.h;
import ic.h0;
import ic.i0;
import ic.v;
import id.j;
import id.k;
import id.v0;
import id.w0;
import java.util.concurrent.atomic.AtomicBoolean;
import jd.m;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pd.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends f0 implements f, View.OnClickListener, m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1023a f85767r = new C1023a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final id.b[] f85768s = {id.b.Image, id.b.Label};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f85769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ec.b f85770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final id.a f85771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f85772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wc.a f85773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f85774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f85775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h0 f85776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f85777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f85778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f85779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f85780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f85781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f85782q;

    /* JADX INFO: renamed from: jc.a$a, reason: collision with other inner class name */
    public static final class C1023a {
        public /* synthetic */ C1023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1023a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, ec.b repository, id.a adElementParams, c adFormListener, yc.b eventCallback, wc.a aVar) {
        super(eventCallback);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f85769d = assetsHolder;
        this.f85770e = repository;
        this.f85771f = adElementParams;
        this.f85772g = adFormListener;
        this.f85773h = aVar;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f85774i = applicationContext;
        j jVarC = adElementParams.c();
        this.f85775j = jVarC;
        k kVarA = jVarC.a();
        this.f85776k = kVarA != null ? i0.a(kVarA, applicationContext, repository) : null;
        this.f85777l = new AtomicBoolean(false);
        this.f85780o = true;
        this.f85782q = this.f85780o;
    }

    protected final void A(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        v.b(t(), message, new Object[0]);
    }

    public final void B() {
        View viewH = H();
        if (viewH == null) {
            return;
        }
        if (this.f85782q && this.f85779n) {
            if (this.f85777l.compareAndSet(false, true)) {
                y(viewH);
            }
        } else if (this.f85777l.compareAndSet(true, false)) {
            w();
        }
    }

    protected final c C() {
        return this.f85772g;
    }

    public final j D() {
        return this.f85775j;
    }

    public final Context E() {
        return this.f85774i;
    }

    public final Object F() {
        return this.f85769d;
    }

    protected final ec.b G() {
        return this.f85770e;
    }

    public abstract View H();

    public void I() {
        yc.b bVarS = s();
        View viewH = H();
        bVarS.a(viewH != null ? viewH.getId() : -1);
    }

    @Override // ic.f
    public /* synthetic */ void a(ViewGroup viewGroup) {
        e.a(this, viewGroup);
    }

    @Override // ic.f
    public void d() {
        v();
    }

    @Override // ic.f
    public void f() {
        u();
    }

    @Override // ic.f
    public final id.a h() {
        return this.f85771f;
    }

    @Override // ic.f
    public boolean i() {
        return this.f85782q;
    }

    @Override // ic.f
    public View j() {
        ViewGroup viewGroup = this.f85778m;
        return viewGroup != null ? viewGroup : H();
    }

    @Override // ic.f
    public void m() {
        I();
    }

    @Override // ic.f
    public /* synthetic */ void o() {
        e.b(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        I();
    }

    @Override // jd.m
    public void p() {
        this.f85781p = false;
        q(this.f85780o);
    }

    @Override // jd.m
    public void q(boolean z10) {
        this.f85780o = z10;
        if (this.f85781p) {
            return;
        }
        if (z10) {
            k0.r(j());
        } else {
            k0.j(j());
        }
        this.f85782q = z10;
        B();
    }

    @Override // jd.m
    public void r(boolean z10) {
        q(z10);
        this.f85781p = true;
    }

    @Override // ic.f0
    public String t() {
        return this.f85771f.j();
    }

    public String toString() {
        return "type - " + this.f85771f.a() + ", name - " + this.f85771f.j();
    }

    public final void u() {
        this.f85779n = false;
        B();
    }

    public void v() {
        this.f85779n = true;
        B();
    }

    public final void w() {
        wc.a aVar = this.f85773h;
        if (aVar != null) {
            aVar.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        View viewH = H();
        if (viewH == 0) {
            return false;
        }
        v0 v0VarM = this.f85775j.m();
        if (v0VarM != null && !v0VarM.e()) {
            FrameLayout frameLayout = new FrameLayout(this.f85774i);
            frameLayout.setId(pd.i0.e());
            w0.a(frameLayout, v0VarM);
            frameLayout.addView(viewH, new FrameLayout.LayoutParams(-1, -1));
            this.f85778m = frameLayout;
        }
        View viewJ = j();
        if (viewJ == null) {
            return false;
        }
        viewJ.setId(pd.i0.e());
        viewJ.setTag(this.f85771f.j());
        Boolean boolF = this.f85775j.f();
        if (boolF != null && boolF.booleanValue()) {
            viewJ.setOnClickListener(this);
        }
        Boolean boolT = this.f85775j.t();
        if (boolT != null) {
            q(boolT.booleanValue());
        }
        if (viewH instanceof h) {
            ((h) viewH).a(this.f85775j);
            return true;
        }
        z(viewH, this.f85776k);
        return true;
    }

    public final void y(View view) {
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        h0 h0Var = this.f85776k;
        if (h0Var != null) {
            view2 = view;
            h0.n(h0Var, this.f85769d, view2, null, null, false, new h0.a(0L, null, 3, null), 12, null);
        } else {
            view2 = view;
        }
        wc.a aVar = this.f85773h;
        if (aVar != null) {
            aVar.a(view2);
        }
        this.f85772g.b(this);
    }

    protected void z(View view, h0 h0Var) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (h0Var != null) {
            h0.n(h0Var, this.f85769d, view, null, null, false, null, 60, null);
            return;
        }
        Integer numB = this.f85775j.b();
        if (numB == null || ArraysKt.contains(f85768s, this.f85771f.a())) {
            return;
        }
        k0.o(view, numB);
    }

    @Override // ic.f0, ic.f
    public void a() {
        super.a();
        h0 h0Var = this.f85776k;
        if (h0Var != null) {
            h0Var.b();
        }
        wc.a aVar = this.f85773h;
        if (aVar != null) {
            aVar.g();
        }
        J();
    }

    protected void J() {
    }
}
