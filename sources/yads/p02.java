package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class p02 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f114491p = {ub.a(p02.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f114492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f114493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pm1 f114494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vm1 f114495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tn1 f114496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f41 f114497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f114498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gk2 f114499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f114500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f114501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n21 f114502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sn1 f114503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bn1 f114504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final co1 f114505n;

    public /* synthetic */ p02(t9 t9Var, es2 es2Var, zy1 zy1Var, pm1 pm1Var) {
        this(t9Var, es2Var, zy1Var, pm1Var, new vm1(), new tn1(), new f41(pm1Var));
    }

    public p02(t9 t9Var, es2 es2Var, zy1 zy1Var, pm1 pm1Var, vm1 vm1Var, tn1 tn1Var, f41 f41Var) {
        this.f114492a = t9Var;
        this.f114493b = es2Var;
        this.f114494c = pm1Var;
        this.f114495d = vm1Var;
        this.f114496e = tn1Var;
        this.f114497f = f41Var;
        Context applicationContext = zy1Var.g().getApplicationContext();
        this.f114498g = applicationContext;
        this.f114499h = hk2.a(zy1Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f114500i = linkedHashMap;
        this.f114501j = new LinkedHashMap();
        n21 n21Var = new n21(zy1Var.g());
        this.f114502k = n21Var;
        sn1 sn1Var = new sn1(zy1Var.g());
        this.f114503l = sn1Var;
        this.f114504m = new bn1(zy1Var.g(), n21Var, sn1Var);
        this.f114505n = new co1(applicationContext, pm1Var, linkedHashMap);
    }
}
