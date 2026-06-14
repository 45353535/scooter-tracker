package com.skydoves.balloon;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.MovementMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f63624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f63625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f63626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f63627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MovementMethod f63628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f63629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Typeface f63630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Float f63631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f63632i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f63633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f63634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f63635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f63636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f63637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MovementMethod f63638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f63639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Typeface f63640h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Float f63641i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f63642j;

        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f63633a = context;
            a1 a1Var = a1.f93282a;
            this.f63634b = "";
            this.f63635c = 12.0f;
            this.f63636d = -1;
            this.f63642j = 17;
        }

        public final f a() {
            return new f(this, null);
        }

        public final MovementMethod b() {
            return this.f63638f;
        }

        public final CharSequence c() {
            return this.f63634b;
        }

        public final int d() {
            return this.f63636d;
        }

        public final int e() {
            return this.f63642j;
        }

        public final boolean f() {
            return this.f63637e;
        }

        public final Float g() {
            return this.f63641i;
        }

        public final float h() {
            return this.f63635c;
        }

        public final int i() {
            return this.f63639g;
        }

        public final Typeface j() {
            return this.f63640h;
        }

        public final a k(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63634b = value;
            return this;
        }

        public final a l(int i10) {
            this.f63636d = i10;
            return this;
        }

        public final a m(int i10) {
            this.f63642j = i10;
            return this;
        }

        public final a n(boolean z10) {
            this.f63637e = z10;
            return this;
        }

        public final a o(Float f10) {
            this.f63641i = f10;
            return this;
        }

        public final a p(float f10) {
            this.f63635c = f10;
            return this;
        }

        public final a q(int i10) {
            this.f63639g = i10;
            return this;
        }

        public final a r(Typeface typeface) {
            this.f63640h = typeface;
            return this;
        }
    }

    public /* synthetic */ f(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final MovementMethod a() {
        return this.f63628e;
    }

    public final CharSequence b() {
        return this.f63624a;
    }

    public final int c() {
        return this.f63626c;
    }

    public final int d() {
        return this.f63632i;
    }

    public final boolean e() {
        return this.f63627d;
    }

    public final Float f() {
        return this.f63631h;
    }

    public final float g() {
        return this.f63625b;
    }

    public final int h() {
        return this.f63629f;
    }

    public final Typeface i() {
        return this.f63630g;
    }

    private f(a aVar) {
        this.f63624a = aVar.c();
        this.f63625b = aVar.h();
        this.f63626c = aVar.d();
        this.f63627d = aVar.f();
        this.f63628e = aVar.b();
        this.f63629f = aVar.i();
        this.f63630g = aVar.j();
        this.f63631h = aVar.g();
        this.f63632i = aVar.e();
    }
}
