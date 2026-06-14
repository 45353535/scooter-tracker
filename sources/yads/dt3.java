package yads;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ga f110061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa f110062b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ct3 f110064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ia f110065e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f110068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f110069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f110070j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ku3 f110063c = new ku3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f110066f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f110067g = false;

    public dt3(fa faVar, ga gaVar, String str) {
        ia ys3Var;
        this.f110062b = faVar;
        this.f110061a = gaVar;
        this.f110068h = str;
        a();
        if (gaVar.a() == ha.f111522c || gaVar.a() == ha.f111524e) {
            ys3Var = new ys3(gaVar.d(), str);
        } else {
            ys3Var = new kt3(str, gaVar.c(), gaVar.b());
        }
        this.f110065e = ys3Var;
        this.f110065e.c();
        ut3.a().a(this);
        this.f110065e.a(faVar);
    }

    public final void a() {
        this.f110064d = new ct3(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f110067g) {
            return;
        }
        this.f110064d.clear();
        if (!this.f110067g) {
            this.f110063c.f112866a.clear();
        }
        this.f110067g = true;
        ia iaVar = this.f110065e;
        pu3.f114791a.a((WebView) iaVar.f111922b.get(), "finishSession", iaVar.f111921a);
        ut3 ut3Var = ut3.f116776c;
        boolean z10 = ut3Var.f116778b.size() > 0;
        ut3Var.f116777a.remove(this);
        ut3Var.f116778b.remove(this);
        if (z10 && ut3Var.f116778b.size() <= 0) {
            qu3 qu3VarA = qu3.a();
            qu3VarA.getClass();
            k63 k63Var = k63.f112606g;
            k63Var.getClass();
            Handler handler = k63.f112608i;
            if (handler != null) {
                handler.removeCallbacks(k63.f112610k);
                k63.f112608i = null;
            }
            k63Var.f112611a.clear();
            k63.f112607h.post(new h63(k63Var));
            it3 it3Var = it3.f112137d;
            it3Var.f118380a = false;
            it3Var.f118382c = null;
            cu3 cu3Var = qu3VarA.f115172d;
            cu3Var.f109600b.getContentResolver().unregisterContentObserver(cu3Var);
        }
        this.f110065e.b();
        this.f110065e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c() {
        if (this.f110066f || this.f110065e == null) {
            return;
        }
        this.f110066f = true;
        ut3 ut3Var = ut3.f116776c;
        boolean z10 = ut3Var.f116778b.size() > 0;
        ut3Var.f116778b.add(this);
        if (!z10) {
            qu3 qu3VarA = qu3.a();
            qu3VarA.getClass();
            it3 it3Var = it3.f112137d;
            it3Var.f118382c = qu3VarA;
            it3Var.b();
            k63.f112606g.getClass();
            if (k63.f112608i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                k63.f112608i = handler;
                handler.post(k63.f112609j);
                k63.f112608i.postDelayed(k63.f112610k, 200L);
            }
            cu3 cu3Var = qu3VarA.f115172d;
            cu3Var.f109606h.submit(new xt3(cu3Var));
            cu3Var.f109600b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cu3Var);
        }
        float f10 = qu3.a().f115169a;
        ia iaVar = this.f110065e;
        pu3 pu3Var = pu3.f114791a;
        pu3Var.a((WebView) iaVar.f111922b.get(), "setDeviceVolume", Float.valueOf(f10), iaVar.f111921a);
        ia iaVar2 = this.f110065e;
        Date date = ws3.f117555f.f117557b;
        Date date2 = date != null ? (Date) date.clone() : null;
        iaVar2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            st3.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            pu3Var.a((WebView) iaVar2.f111922b.get(), "setLastActivity", jSONObject);
        }
        this.f110065e.a(this, this.f110061a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.f110067g || ((View) this.f110064d.get()) == view) {
            return;
        }
        this.f110064d = new ct3(view);
        this.f110065e.a();
        Collection<dt3> collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(ut3.f116776c.f116777a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (dt3 dt3Var : collectionUnmodifiableCollection) {
            if (dt3Var != this && ((View) dt3Var.f110064d.get()) == view) {
                dt3Var.f110064d.clear();
            }
        }
    }
}
