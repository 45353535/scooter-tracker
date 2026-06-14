package com.skydoves.balloon;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import q5.m;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f63607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f63608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f63609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f63610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f63611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f63612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f63613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CharSequence f63614h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f63615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable f63616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f63617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m f63618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f63619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f63620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f63621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f63622h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CharSequence f63623i;

        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f63615a = context;
            this.f63618d = m.START;
            float f10 = 28;
            this.f63619e = zf.a.d(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
            this.f63620f = zf.a.d(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
            this.f63621g = zf.a.d(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.f63622h = -1;
            a1 a1Var = a1.f93282a;
            this.f63623i = "";
        }

        public final e a() {
            return new e(this, null);
        }

        public final Drawable b() {
            return this.f63616b;
        }

        public final Integer c() {
            return this.f63617c;
        }

        public final int d() {
            return this.f63622h;
        }

        public final CharSequence e() {
            return this.f63623i;
        }

        public final m f() {
            return this.f63618d;
        }

        public final int g() {
            return this.f63620f;
        }

        public final int h() {
            return this.f63621g;
        }

        public final int i() {
            return this.f63619e;
        }

        public final a j(Drawable drawable) {
            this.f63616b = drawable;
            return this;
        }

        public final a k(m value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63618d = value;
            return this;
        }

        public final a l(int i10) {
            this.f63622h = i10;
            return this;
        }

        public final a m(int i10) {
            this.f63620f = i10;
            return this;
        }

        public final a n(int i10) {
            this.f63621g = i10;
            return this;
        }

        public final a o(int i10) {
            this.f63619e = i10;
            return this;
        }
    }

    public /* synthetic */ e(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final Drawable a() {
        return this.f63607a;
    }

    public final Integer b() {
        return this.f63608b;
    }

    public final int c() {
        return this.f63613g;
    }

    public final CharSequence d() {
        return this.f63614h;
    }

    public final m e() {
        return this.f63609c;
    }

    public final int f() {
        return this.f63611e;
    }

    public final int g() {
        return this.f63612f;
    }

    public final int h() {
        return this.f63610d;
    }

    private e(a aVar) {
        this.f63607a = aVar.b();
        this.f63608b = aVar.c();
        this.f63609c = aVar.f();
        this.f63610d = aVar.i();
        this.f63611e = aVar.g();
        this.f63612f = aVar.h();
        this.f63613g = aVar.d();
        this.f63614h = aVar.e();
    }
}
