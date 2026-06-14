package ic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fd.g;
import ic.h0;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pd.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f74217g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f74218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.d f74219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f74220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f74221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewGroup f74222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f74223f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(Object assetsHolder, Context context, ec.b repository, id.d adPhaseParams) {
        h0 h0VarA;
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adPhaseParams, "adPhaseParams");
        this.f74218a = assetsHolder;
        this.f74219b = adPhaseParams;
        this.f74220c = new HashSet();
        id.k kVarC = adPhaseParams.c();
        if (kVarC != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            h0VarA = i0.a(kVarC, applicationContext, repository);
        } else {
            h0VarA = null;
        }
        this.f74221d = h0VarA;
        this.f74223f = -1;
    }

    private final void g() {
        h0 h0Var;
        ViewGroup viewGroup = this.f74222e;
        if (viewGroup == null || (h0Var = this.f74221d) == null) {
            return;
        }
        h0.n(h0Var, this.f74218a, viewGroup, null, null, false, new h0.a(0L, null, 3, null), 12, null);
    }

    public final void a() {
        h0 h0Var = this.f74221d;
        if (h0Var != null) {
            h0Var.b();
        }
        this.f74220c.clear();
        this.f74223f = -1;
        ViewGroup viewGroup = this.f74222e;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            k0.n(viewGroup);
        }
        this.f74222e = null;
    }

    public final void b(Context context, ViewGroup rootContainer, fd.g elementsContainer, List adElements, f adElement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
        Intrinsics.checkNotNullParameter(elementsContainer, "elementsContainer");
        Intrinsics.checkNotNullParameter(adElements, "adElements");
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        View viewJ = adElement.j();
        if (viewJ == null) {
            return;
        }
        id.z zVarG = adElement.h().g();
        int iN = zVarG.n(context);
        int iC = zVarG.c(context);
        if (iN <= 0) {
            iN = -1;
        }
        if (iC <= 0) {
            iC = -1;
        }
        g.a aVar = new g.a(iN, iC);
        aVar.d(context, zVarG, adElements);
        elementsContainer.addView(viewJ, aVar);
        try {
            adElement.a(rootContainer);
            if (elementsContainer.getId() == this.f74223f) {
                this.f74220c.add(adElement);
            }
        } catch (Throwable th2) {
            v.i(th2);
        }
    }

    public final void c(jc.a adForm) {
        Intrinsics.checkNotNullParameter(adForm, "adForm");
        this.f74220c.remove(adForm);
        if (this.f74220c.isEmpty()) {
            g();
        }
    }

    public final boolean d(ViewGroup viewGroup, List list, List list2) {
        Unit unit;
        ViewGroup rootContainer = viewGroup;
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
        List<f> ads = list;
        Intrinsics.checkNotNullParameter(ads, "ads");
        List<f> controls = list2;
        Intrinsics.checkNotNullParameter(controls, "controls");
        Context context = rootContainer.getContext();
        a();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(pd.i0.e());
        h0 h0Var = this.f74221d;
        if (h0Var != null) {
            h0.n(h0Var, this.f74218a, frameLayout, null, null, false, null, 60, null);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            k0.o(frameLayout, this.f74219b.d());
        }
        this.f74222e = frameLayout;
        fd.g gVar = new fd.g(context);
        int iE = pd.i0.e();
        this.f74223f = iE;
        gVar.setId(iE);
        gVar.setTag(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        for (f fVar : ads) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            fd.g gVar2 = gVar;
            Context context2 = context;
            b(context2, rootContainer, gVar2, ads, fVar);
            rootContainer = viewGroup;
            ads = list;
            gVar = gVar2;
            context = context2;
        }
        Context context3 = context;
        fd.g gVar3 = gVar;
        ViewGroup viewGroup2 = this.f74222e;
        if (viewGroup2 != null) {
            viewGroup2.addView(gVar3, pd.i0.c());
        }
        fd.g gVar4 = new fd.g(context3);
        gVar4.setTag("controls");
        for (f fVar2 : controls) {
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            b(context3, viewGroup, gVar4, controls, fVar2);
            controls = list2;
        }
        ViewGroup viewGroup3 = this.f74222e;
        if (viewGroup3 != null) {
            viewGroup3.addView(gVar4, pd.i0.c());
        }
        viewGroup.addView(this.f74222e, 0, pd.i0.c());
        return true;
    }

    public final id.d e() {
        return this.f74219b;
    }

    public final ViewGroup f() {
        return this.f74222e;
    }
}
