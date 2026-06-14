package nc;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import ec.b;
import ic.h0;
import ic.n;
import id.f0;
import id.j;
import id.o;
import jc.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends jc.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1096a f95827u = new C1096a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextView f95828t;

    /* JADX INFO: renamed from: nc.a$a, reason: collision with other inner class name */
    public static final class C1096a {
        public /* synthetic */ C1096a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1096a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, b repository, id.a adElementParams, c adFormListener, yc.b eventCallback, wc.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f95828t = new TextView(context);
    }

    @Override // jc.a
    public View H() {
        return this.f95828t;
    }

    @Override // ic.f
    public void c() {
        this.f95828t.setText(h().n());
        Integer numO = D().o();
        if (numO != null) {
            this.f95828t.setTextColor(numO.intValue());
        }
        Float fJ = D().j();
        if (fJ != null && fJ.floatValue() > 0.0f) {
            this.f95828t.setTextSize(1, fJ.floatValue());
        }
        f0 f0VarK = D().k();
        if (f0VarK != null) {
            this.f95828t.setTypeface(Typeface.create(Typeface.DEFAULT, f0VarK.g()));
        }
        Integer numS = D().s();
        if (numS != null && numS.intValue() > 0) {
            this.f95828t.setMaxLines(numS.intValue());
        }
        if (D().r(E()) != null) {
            this.f95828t.setLineSpacing(r0.intValue(), 1.0f);
        }
        this.f95828t.setGravity(D().q().g() | 16);
        Integer numN = D().n();
        if (numN != null) {
            int iIntValue = numN.intValue();
            float fK = g0.k(E(), 1.0f);
            this.f95828t.setShadowLayer(g0.k(E(), 1.0f), fK, fK, iIntValue);
        }
        this.f95828t.setIncludeFontPadding(false);
        C().a(this);
    }

    @Override // jc.a
    protected void z(View view, h0 h0Var) {
        Intrinsics.checkNotNullParameter(view, "view");
        int iH = j.h(D(), E(), 0, 2, null);
        o oVarE = D().e(E());
        if (h0Var != null) {
            h0.n(h0Var, F(), this.f95828t, Integer.valueOf(iH), oVarE, false, null, 48, null);
            return;
        }
        TextView textView = this.f95828t;
        n nVar = new n();
        nVar.j(j.d(D(), 0, 1, null));
        nVar.e(iH);
        if (oVarE != null) {
            n.i(nVar, oVarE.b(), oVarE.a(), 0.0f, 0.0f, 12, null);
            this.f95828t.setPadding(oVarE.b(), oVarE.b() - g0.k(E(), 2.0f), oVarE.b(), oVarE.b() + g0.k(E(), 2.0f));
        }
        textView.setBackground(nVar);
    }
}
