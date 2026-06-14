package id;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f74539r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final k0 f74540s = k0.Center;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f74541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f74542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f74543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f74544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Float f74545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Float f74546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f0 f74547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Boolean f74548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Float f74549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f74550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Integer f74551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v0 f74552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Float f74553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f74554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Float f74555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k0 f74556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Integer f74557q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(k kVar, Integer num, Boolean bool, Boolean bool2, Float f10, Float f11, f0 f0Var, Boolean bool3, Float f12, Integer num2, Integer num3, Integer num4, v0 v0Var, Float f13, Integer num5, Float f14, k0 textHorizontalGravity) {
        Intrinsics.checkNotNullParameter(textHorizontalGravity, "textHorizontalGravity");
        this.f74541a = kVar;
        this.f74542b = num;
        this.f74543c = bool;
        this.f74544d = bool2;
        this.f74545e = f10;
        this.f74546f = f11;
        this.f74547g = f0Var;
        this.f74548h = bool3;
        this.f74549i = f12;
        this.f74550j = num2;
        this.f74551k = num4;
        this.f74552l = v0Var;
        this.f74553m = f13;
        this.f74554n = num5;
        this.f74555o = f14;
        this.f74556p = textHorizontalGravity;
        this.f74557q = num3 != null ? num3 : num;
    }

    public static /* synthetic */ int d(j jVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return jVar.c(i10);
    }

    public static /* synthetic */ int h(j jVar, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return jVar.g(context, i10);
    }

    public final k a() {
        return this.f74541a;
    }

    public final Integer b() {
        return this.f74542b;
    }

    public final int c(int i10) {
        Integer num = this.f74542b;
        return num != null ? num.intValue() : i10;
    }

    public final o e(Context context) {
        Integer numP;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.areEqual(this.f74548h, Boolean.TRUE) || this.f74550j == null || (numP = p(context)) == null || numP.intValue() <= 0) {
            return null;
        }
        return new o(numP.intValue(), this.f74550j.intValue());
    }

    public final Boolean f() {
        return this.f74544d;
    }

    public final int g(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float f10 = this.f74553m;
        return f10 != null ? pd.g0.k(context, f10.floatValue()) : i10;
    }

    public final Integer i() {
        return this.f74557q;
    }

    public final Float j() {
        return this.f74546f;
    }

    public final f0 k() {
        return this.f74547g;
    }

    public final Float l() {
        return this.f74545e;
    }

    public final v0 m() {
        return this.f74552l;
    }

    public final Integer n() {
        return this.f74551k;
    }

    public final Integer o() {
        return this.f74550j;
    }

    public final Integer p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float f10 = this.f74549i;
        if (f10 != null) {
            return Integer.valueOf(pd.g0.k(context, f10.floatValue()));
        }
        return null;
    }

    public final k0 q() {
        return this.f74556p;
    }

    public final Integer r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float f10 = this.f74555o;
        if (f10 != null) {
            return Integer.valueOf(pd.g0.k(context, f10.floatValue()));
        }
        return null;
    }

    public final Integer s() {
        return this.f74554n;
    }

    public final Boolean t() {
        return this.f74543c;
    }

    public /* synthetic */ j(k kVar, Integer num, Boolean bool, Boolean bool2, Float f10, Float f11, f0 f0Var, Boolean bool3, Float f12, Integer num2, Integer num3, Integer num4, v0 v0Var, Float f13, Integer num5, Float f14, k0 k0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : kVar, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : bool2, (i10 & 16) != 0 ? null : f10, (i10 & 32) != 0 ? null : f11, (i10 & 64) != 0 ? null : f0Var, (i10 & 128) != 0 ? null : bool3, (i10 & 256) != 0 ? null : f12, (i10 & 512) != 0 ? null : num2, (i10 & 1024) != 0 ? null : num3, (i10 & 2048) != 0 ? null : num4, (i10 & 4096) != 0 ? null : v0Var, (i10 & 8192) != 0 ? null : f13, (i10 & 16384) != 0 ? null : num5, (i10 & 32768) != 0 ? null : f14, (i10 & 65536) != 0 ? f74540s : k0Var);
    }
}
