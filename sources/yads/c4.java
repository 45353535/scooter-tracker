package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz f109194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax f109195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb f109196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx2 f109197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e9 f109198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o32 f109199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k32 f109200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d83 f109201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f109202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f109203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f109204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public cp1 f109205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f109206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f109207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f109208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f109209p;

    public /* synthetic */ c4(qz qzVar) {
        this(qzVar, new ax(), new fb(), new nx2());
    }

    public final qz a() {
        return this.f109194a;
    }

    public final pd b() {
        return this.f109195b.f108851b;
    }

    public final fl0 c() {
        return this.f109195b.f108850a;
    }

    public final mx2 d() {
        return this.f109197d.f114071a;
    }

    public final void e() {
        this.f109200g = k32.f112571c;
    }

    public final void a(e9 e9Var) {
        this.f109198e = e9Var;
    }

    public final void a(String str) {
        fb fbVar = this.f109196c;
        fbVar.getClass();
        if (str != null && !StringsKt.y0(str)) {
            String str2 = fbVar.f110681a;
            if (str2 != null && !Intrinsics.areEqual(str2, str)) {
                wa1.c("Ad Unit Id can't be set twice.", new Object[0]);
                return;
            } else {
                fbVar.f110681a = str;
                return;
            }
        }
        wa1.c("Ad Unit Id can't be null or empty.", new Object[0]);
    }

    public c4(qz qzVar, ax axVar, fb fbVar, nx2 nx2Var) {
        this.f109194a = qzVar;
        this.f109195b = axVar;
        this.f109196c = fbVar;
        this.f109197d = nx2Var;
        this.f109207n = true;
        this.f109209p = i01.f111816b;
    }
}
