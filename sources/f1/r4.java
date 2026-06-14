package f1;

import android.content.Context;
import com.chartboost.sdk.R$raw;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f70934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce f70935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f70936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f70937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineDispatcher f70938e;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70939r;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return r4.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f70939r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            try {
                Omid.activate(r4.this.f70934a);
                eg.e("OMSDK is initialized successfully!", null, 2, null);
            } catch (Exception e10) {
                eg.i("OMSDK initialization exception", e10);
            }
            return Unit.f93236a;
        }
    }

    public r4(Context context, ce sharedPrefsHelper, e4 resourcesLoader, AtomicReference sdkConfig, CoroutineDispatcher mainDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f70934a = context;
        this.f70935b = sharedPrefsHelper;
        this.f70936c = resourcesLoader;
        this.f70937d = sdkConfig;
        this.f70938e = mainDispatcher;
    }

    public final String b() {
        return c(R$raw.f17914a, "com.chartboost.sdk.omidjs");
    }

    public final String c(int i10, String str) {
        try {
            String strA = this.f70935b.a(str);
            return strA == null ? e(str, i10) : strA;
        } catch (Exception e10) {
            eg.i("OmidJS exception", e10);
            return null;
        }
    }

    public final String d(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        if (!k()) {
            eg.j("OMSDK injectOmidJsIntoHtml is disabled by the cb config!", null, 2, null);
            return html;
        }
        if (Omid.isActive()) {
            try {
                String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(b(), html);
                Intrinsics.checkNotNull(strInjectScriptContentIntoHtml);
                return strInjectScriptContentIntoHtml;
            } catch (Exception e10) {
                eg.i("OmidJS injection exception", e10);
            }
        }
        return html;
    }

    public final String e(String str, int i10) {
        try {
            String strA = this.f70936c.a(i10);
            if (strA == null) {
                return null;
            }
            this.f70935b.b(str, strA);
            return strA;
        } catch (Exception e10) {
            eg.i("OmidJS resource file exception", e10);
            return null;
        }
    }

    public final n1 f() {
        ga gaVar = (ga) this.f70937d.get();
        n1 n1VarB = gaVar != null ? gaVar.b() : null;
        return n1VarB == null ? new n1(false, false, 0, 0, 0L, 0, null, 127, null) : n1VarB;
    }

    public final Partner g() {
        try {
            return Partner.createPartner(m(), "9.10.2");
        } catch (Exception e10) {
            eg.i("Omid Partner exception", e10);
            return null;
        }
    }

    public final List h() {
        n1 n1VarB;
        List listE;
        ga gaVar = (ga) this.f70937d.get();
        return (gaVar == null || (n1VarB = gaVar.b()) == null || (listE = n1VarB.e()) == null) ? CollectionsKt.emptyList() : listE;
    }

    public final void i() {
        if (!k()) {
            eg.e("OMSDK initialize is disabled by the cb config!", null, 2, null);
            return;
        }
        if (j()) {
            eg.e("OMSDK initialize is already active!", null, 2, null);
            return;
        }
        try {
            eg.i.d(kotlinx.coroutines.i.a(this.f70938e), null, null, new a(null), 3, null);
        } catch (Exception e10) {
            eg.i("Error launching om activate job", e10);
        }
    }

    public final boolean j() {
        try {
            return Omid.isActive();
        } catch (Exception e10) {
            eg.d("OMSDK error when checking isActive", e10);
            return false;
        }
    }

    public final boolean k() {
        n1 n1VarB;
        ga gaVar = (ga) this.f70937d.get();
        if (gaVar == null || (n1VarB = gaVar.b()) == null) {
            return false;
        }
        return n1VarB.g();
    }

    public final boolean l() {
        n1 n1VarB;
        ga gaVar = (ga) this.f70937d.get();
        if (gaVar == null || (n1VarB = gaVar.b()) == null) {
            return false;
        }
        return n1VarB.d();
    }

    public final String m() {
        return "Chartboost";
    }

    public /* synthetic */ r4(Context context, ce ceVar, e4 e4Var, AtomicReference atomicReference, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, ceVar, e4Var, atomicReference, (i10 & 16) != 0 ? eg.o0.c() : coroutineDispatcher);
    }
}
