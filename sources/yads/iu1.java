package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iu1 implements x82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u92 f112139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cu1 f112140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pu1 f112141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ti3 f112142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p83 f112143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final no0 f112144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hr2 f112145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vu1 f112146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f112147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qo0 f112148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f112149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public tu1 f112150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ht1 f112151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public gt1 f112152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w82 f112153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public kf3 f112154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public mi3 f112155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mo0 f112156r;

    public /* synthetic */ iu1(su1 su1Var) {
        cu1 cu1Var = new cu1(su1Var);
        pu1 pu1Var = new pu1();
        ti3 ti3Var = new ti3();
        p83 p83Var = new p83();
        no0 no0Var = new no0();
        Object obj = vt2.f117186j;
        this(su1Var, cu1Var, pu1Var, ti3Var, p83Var, no0Var, ut2.a().a(su1Var.f()));
    }

    public final void a(nu1 nu1Var, LinkedHashMap linkedHashMap) throws fu1 {
        if (this.f112150l == null) {
            throw new fu1("Invalid state to execute this command");
        }
        switch (nu1Var.ordinal()) {
            case 0:
                kf3 kf3Var = this.f112154p;
                if (kf3Var != null) {
                    ((ze3) kf3Var).a();
                    return;
                }
                return;
            case 1:
                gt1 gt1Var = this.f112152n;
                if (gt1Var != null) {
                    gt1Var.e();
                    return;
                }
                return;
            case 2:
                gt1 gt1Var2 = this.f112152n;
                if (gt1Var2 != null) {
                    gt1Var2.b();
                    return;
                }
                return;
            case 3:
                if (mi3.f113514c == this.f112155q) {
                    mi3 mi3Var = mi3.f113516e;
                    this.f112155q = mi3Var;
                    this.f112140b.a(mi3Var);
                    w82 w82Var = this.f112153o;
                    if (w82Var != null) {
                        w82Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                a(linkedHashMap);
                return;
            case 5:
                ht1 ht1Var = this.f112151m;
                if (ht1Var != null) {
                    ht1Var.a();
                    return;
                }
                return;
            case 6:
                boolean z10 = Boolean.parseBoolean((String) linkedHashMap.get("shouldUseCustomClose"));
                w82 w82Var2 = this.f112153o;
                if (w82Var2 != null) {
                    w82Var2.a(z10);
                    return;
                }
                return;
            case 7:
            default:
                throw new fu1("Unspecified MRAID Javascript command");
            case 8:
                hr2 hr2Var = this.f112145g;
                if (hr2Var == null || !hr2Var.f111766z0) {
                    return;
                }
                this.f112139a.a();
                return;
        }
    }

    public final void b(String str) throws fu1 {
        this.f112143e.getClass();
        if (!p83.a(str)) {
            boolean z10 = lb1.f113032a;
            this.f112140b.a(nu1.f114047d, "Mraid command sent an invalid URL");
            return;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (!Intrinsics.areEqual("mraid", scheme) && !Intrinsics.areEqual("mobileads", scheme)) {
            a(MapsKt.mapOf(TuplesKt.to("url", str)));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : uri.getQueryParameterNames()) {
            linkedHashMap.put(str2, uri.getQueryParameter(str2));
        }
        nu1.f114046c.getClass();
        nu1 nu1VarA = mu1.a(host);
        try {
            a(nu1VarA, linkedHashMap);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Unknown exception";
            }
            this.f112140b.a(nu1VarA, message);
        }
        this.f112140b.a(nu1VarA);
    }

    public final void c(ju1 ju1Var) {
        this.f112153o = ju1Var;
    }

    public iu1(su1 su1Var, cu1 cu1Var, pu1 pu1Var, ti3 ti3Var, p83 p83Var, no0 no0Var, hr2 hr2Var) {
        this.f112139a = su1Var;
        this.f112140b = cu1Var;
        this.f112141c = pu1Var;
        this.f112142d = ti3Var;
        this.f112143e = p83Var;
        this.f112144f = no0Var;
        this.f112145g = hr2Var;
        vu1 vu1Var = new vu1(new hu1(this));
        this.f112146h = vu1Var;
        this.f112155q = mi3.f113515d;
        su1Var.setWebViewClient(vu1Var);
        this.f112148j = new qo0(su1Var, no0Var, this);
        this.f112149k = rb.a(this);
    }

    public final void b(ju1 ju1Var) {
        this.f112151m = ju1Var;
    }

    public final void a(Map map) throws fu1 {
        zz0 zz0Var;
        if (this.f112150l != null) {
            hr2 hr2Var = this.f112145g;
            if (hr2Var == null || !hr2Var.B0 || this.f112147i) {
                String str = (String) map.get("url");
                if (str != null && str.length() > 0) {
                    tu1 tu1Var = this.f112150l;
                    if (tu1Var != null && (zz0Var = (zz0) tu1Var.f116389a.get()) != null) {
                        zz0Var.a(str);
                    }
                    boolean z10 = lb1.f113032a;
                    return;
                }
                kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
                String str2 = String.format("Mraid open command sent an invalid URL: %s", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                throw new fu1(str2);
            }
        }
    }

    public final void a(final String str) {
        Context context = this.f112139a.getContext();
        pu1 pu1Var = this.f112141c;
        String str2 = this.f112149k;
        ou1 ou1Var = new ou1() { // from class: yads.u8
            @Override // yads.ou1
            public final void a(String str3) {
                iu1.a(this.f116562a, str, str3);
            }
        };
        pu1Var.getClass();
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        String str3 = hr2VarA != null ? hr2VarA.P : null;
        if (str3 != null && str3.length() > 0) {
            t13 t13VarA = pu1.a(str3, str2, ou1Var);
            Object obj2 = sm2.f115876a;
            synchronized (rm2.a()) {
                e72.a(context).a(t13VarA);
            }
            return;
        }
        ou1Var.a(pu1.f114787a);
        boolean z10 = lb1.f113032a;
    }

    public static final void a(iu1 iu1Var, String str, String str2) {
        iu1Var.f112146h.f117206c = str2;
        u92 u92Var = iu1Var.f112140b.f109597a;
        u92Var.loadDataWithBaseURL("https://yandex.ru", u92Var.a(str), "text/html", "UTF-8", null);
    }

    public final void a() {
        zz0 zz0Var;
        this.f112147i = true;
        tu1 tu1Var = this.f112150l;
        if (tu1Var == null || (zz0Var = (zz0) tu1Var.f116389a.get()) == null) {
            return;
        }
        zz0Var.a();
    }

    public final void a(ju1 ju1Var) {
        this.f112152n = ju1Var;
    }

    public final void a(ze3 ze3Var) {
        this.f112154p = ze3Var;
    }
}
