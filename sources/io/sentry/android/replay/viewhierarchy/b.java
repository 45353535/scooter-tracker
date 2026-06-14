package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.android.replay.util.r;
import io.sentry.android.replay.util.s;
import io.sentry.v7;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f83226m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f83227n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f83228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f83229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f83230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f83231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f83232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f83233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f83234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f83235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f83236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f83237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f83238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f83239l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Class cls, Set set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean c(View view, v7 v7Var) {
            String strF = v7Var.getSessionReplay().f();
            if (strF == null) {
                return false;
            }
            return Intrinsics.areEqual(view.getClass().getName(), strF);
        }

        private final boolean d(ViewParent viewParent, v7 v7Var) {
            String strO = v7Var.getSessionReplay().o();
            if (strO == null) {
                return false;
            }
            return Intrinsics.areEqual(viewParent.getClass().getName(), strO);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean e(android.view.View r9, io.sentry.v7 r10) {
            /*
                r8 = this;
                java.lang.Object r0 = r9.getTag()
                boolean r1 = r0 instanceof java.lang.String
                r2 = 0
                if (r1 == 0) goto Lc
                java.lang.String r0 = (java.lang.String) r0
                goto Ld
            Lc:
                r0 = r2
            Ld:
                r1 = 2
                java.lang.String r3 = "toLowerCase(...)"
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L28
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r6)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                if (r0 == 0) goto L28
                java.lang.String r6 = "sentry-unmask"
                boolean r0 = kotlin.text.StringsKt.g0(r0, r6, r5, r1, r2)
                if (r0 != r4) goto L28
                goto L36
            L28:
                int r0 = io.sentry.android.replay.R$id.f82827a
                java.lang.Object r6 = r9.getTag(r0)
                java.lang.String r7 = "unmask"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                if (r6 == 0) goto L37
            L36:
                return r5
            L37:
                java.lang.Object r6 = r9.getTag()
                boolean r7 = r6 instanceof java.lang.String
                if (r7 == 0) goto L42
                java.lang.String r6 = (java.lang.String) r6
                goto L43
            L42:
                r6 = r2
            L43:
                if (r6 == 0) goto L59
                java.util.Locale r7 = java.util.Locale.ROOT
                java.lang.String r6 = r6.toLowerCase(r7)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
                if (r6 == 0) goto L59
                java.lang.String r3 = "sentry-mask"
                boolean r1 = kotlin.text.StringsKt.g0(r6, r3, r5, r1, r2)
                if (r1 != r4) goto L59
                goto L65
            L59:
                java.lang.Object r0 = r9.getTag(r0)
                java.lang.String r1 = "mask"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L66
            L65:
                return r4
            L66:
                boolean r0 = r8.c(r9, r10)
                if (r0 != 0) goto L82
                android.view.ViewParent r0 = r9.getParent()
                if (r0 == 0) goto L82
                android.view.ViewParent r0 = r9.getParent()
                java.lang.String r1 = "getParent(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                boolean r0 = r8.d(r0, r10)
                if (r0 == 0) goto L82
                return r5
            L82:
                java.lang.Class r0 = r9.getClass()
                io.sentry.x7 r1 = r10.getSessionReplay()
                java.util.Set r1 = r1.n()
                java.lang.String r2 = "getUnmaskViewClasses(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                boolean r0 = r8.b(r0, r1)
                if (r0 == 0) goto L9a
                return r5
            L9a:
                java.lang.Class r9 = r9.getClass()
                io.sentry.x7 r10 = r10.getSessionReplay()
                java.util.Set r10 = r10.e()
                java.lang.String r0 = "getMaskViewClasses(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
                boolean r9 = r8.b(r9, r10)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.b.a.e(android.view.View, io.sentry.v7):boolean");
        }

        public final b a(View view, b bVar, int i10, v7 options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair pairG = s.g(view);
            boolean zBooleanValue = ((Boolean) pairG.component1()).booleanValue();
            Rect rect = (Rect) pairG.component2();
            boolean z10 = zBooleanValue && e(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new C1006b(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (bVar != null ? bVar.a() : 0.0f) + view.getElevation(), i10, bVar, z10, false, zBooleanValue, rect);
                }
                if (bVar != null) {
                    bVar.g(true);
                }
                ImageView imageView = (ImageView) view;
                return new c(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (bVar != null ? bVar.a() : 0.0f) + imageView.getElevation(), i10, bVar, z10 && (drawable = imageView.getDrawable()) != null && s.f(drawable), true, zBooleanValue, rect);
            }
            if (bVar != null) {
                bVar.g(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
            int iJ = s.j(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int iC = s.c(textView);
            float x10 = textView.getX();
            float y10 = textView.getY();
            int width = textView.getWidth();
            float fA = 0.0f;
            int height = textView.getHeight();
            if (bVar != null) {
                fA = bVar.a();
            }
            return new d(aVar, Integer.valueOf(iJ), totalPaddingLeft, iC, x10, y10, width, height, fA + textView.getElevation(), i10, bVar, z10, true, zBooleanValue, rect);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$b, reason: collision with other inner class name */
    public static final class C1006b extends b {
        public C1006b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect, null);
        }
    }

    public static final class c extends b {
        public c(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect, null);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final r f83240o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Integer f83241p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f83242q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f83243r;

        public /* synthetic */ d(r rVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? null : rVar, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, f10, f11, i12, i13, f12, i14, (i15 & 1024) != 0 ? null : bVar, (i15 & 2048) != 0 ? false : z10, (i15 & 4096) != 0 ? false : z11, (i15 & 8192) != 0 ? false : z12, (i15 & 16384) != 0 ? null : rect);
        }

        public final Integer i() {
            return this.f83241p;
        }

        public final r j() {
            return this.f83240o;
        }

        public final int k() {
            return this.f83242q;
        }

        public final int l() {
            return this.f83243r;
        }

        public d(r rVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i12, i13, f12, i14, bVar, z10, z11, z12, rect, null);
            this.f83240o = rVar;
            this.f83241p = num;
            this.f83242q = i10;
            this.f83243r = i11;
        }
    }

    public /* synthetic */ b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect);
    }

    public final float a() {
        return this.f83232e;
    }

    public final int b() {
        return this.f83231d;
    }

    public final boolean c() {
        return this.f83235h;
    }

    public final Rect d() {
        return this.f83238k;
    }

    public final int e() {
        return this.f83230c;
    }

    public final void f(List list) {
        this.f83239l = list;
    }

    public final void g(boolean z10) {
        for (b bVar = this.f83234g; bVar != null; bVar = bVar.f83234g) {
            bVar.f83236i = z10;
        }
    }

    public final void h(Function1 callback) {
        List list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (list = this.f83239l) == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).h(callback);
        }
    }

    private b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
        this.f83228a = f10;
        this.f83229b = f11;
        this.f83230c = i10;
        this.f83231d = i11;
        this.f83232e = f12;
        this.f83233f = i12;
        this.f83234g = bVar;
        this.f83235h = z10;
        this.f83236i = z11;
        this.f83237j = z12;
        this.f83238k = rect;
    }
}
