package f1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R$string;
import f1.oe;
import f1.s9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class za extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4 f71787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sa f71788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xd f71789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1.e f71790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l3 f71791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ge f71792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dd f71793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mc f71794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1 f71795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l5 f71796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public od f71797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f71798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f71799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ob f71800o;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            od adViewOverlayListener = za.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.g();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f93236a;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(boolean z10) {
            od adViewOverlayListener = za.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.a(z10);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        public final void a() {
            od adViewOverlayListener = za.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.e();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        public final void a() {
            od adViewOverlayListener = za.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.c();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        public final void a() {
            od adViewOverlayListener = za.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.b();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71807b;

        static {
            int[] iArr = new int[ic.values().length];
            try {
                iArr[ic.f70117d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ic.f70118e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ic.f70119f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ic.f70120g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f71806a = iArr;
            int[] iArr2 = new int[zc.values().length];
            try {
                iArr2[zc.f71810b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[zc.f71811c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[zc.f71812d.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[zc.f71813e.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[zc.f71814f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[zc.f71815g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f71807b = iArr2;
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        public final void a() {
            za.this.h(zc.f71812d, true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        public final void a() {
            od adViewOverlayListener = za.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.d();
            }
            l5 l5Var = za.this.f71796k;
            r8 r8Var = new r8(za.this.f71789d.a(), CollectionsKt.emptyList(), j9.f70166d, null, null, null, null, za.this.f71790e, 120, null);
            List listC = za.this.f71789d.c();
            ArrayList<oe> arrayList = new ArrayList();
            for (Object obj : listC) {
                if (Intrinsics.areEqual(((oe) obj).d(), oe.a.f70739e.g())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (oe oeVar : arrayList) {
                arrayList2.add(new de(oeVar.e(), oeVar.c(), oeVar.a(), null, 8, null));
            }
            l5Var.h(r8Var, arrayList2);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(Context context, m4 m4Var, sa adFormat, xd adMarkupConfig, b1.e eVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        this.f71787b = m4Var;
        this.f71788c = adFormat;
        this.f71789d = adMarkupConfig;
        this.f71790e = eVar;
        this.f71796k = rd.f70996b.a().q();
        this.f71799n = 30000L;
        this.f71800o = ob.f70733c;
        sa saVar = sa.f71087b;
        if (adFormat != saVar) {
            setPadding(b(16), b(4), b(16), b(0));
        }
        l3 l3Var = new l3(context, null, 0, null, new a(), 14, null);
        this.f71791f = l3Var;
        if (adFormat == saVar) {
            l3Var.d(false);
        }
        ge geVar = new ge(context, null, 0, null, null, new b(), 30, null);
        this.f71792g = geVar;
        String string = context.getString(R$string.f17924j);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R$string.f17915a);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(R$string.f17922h);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        dd ddVar = new dd(context, null, 0, string, string2, string3, null, new c(), new d(), 70, null);
        dd.b(ddVar, false, 1, null);
        this.f71793h = ddVar;
        this.f71794i = new mc(ddVar);
        addView(l3Var);
        addView(geVar);
        addView(ddVar);
        x();
        v();
    }

    public static /* synthetic */ void g(za zaVar, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        zaVar.l(z10, str);
    }

    public final int a(double d10) {
        return (int) (d10 * ((double) getContext().getResources().getDisplayMetrics().density));
    }

    public final int b(int i10) {
        return (int) (i10 * getContext().getResources().getDisplayMetrics().density);
    }

    public final void d() {
        this.f71794i.a();
    }

    public final void e(d9 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        tracker.a(this, t7.f71140i);
        this.f71791f.e(tracker, t7.f71138g);
        this.f71792g.e(tracker, t7.f71134c);
        this.f71793h.getTimerChipView().g(tracker, t7.f71139h);
        this.f71793h.getCloseButton().a(tracker, t7.f71135d);
        this.f71793h.getSkipButton().e(tracker, t7.f71137f);
        f1 f1Var = this.f71795j;
        if (f1Var != null) {
            f1Var.f(tracker, t7.f71136e);
        }
    }

    @Nullable
    public final od getAdViewOverlayListener() {
        return this.f71797l;
    }

    public final boolean getShouldOnlyShowOneButtonForCloseChip() {
        return this.f71793h.getShouldOnlyShowOneButton();
    }

    public final void h(zc chip, boolean z10) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        switch (f.f71807b[chip.ordinal()]) {
            case 1:
                q(z10);
                break;
            case 2:
                w(z10);
                break;
            case 3:
                i(z10);
                break;
            case 4:
                t(z10);
                break;
            case 5:
                u(z10);
                break;
            case 6:
                n(z10);
                break;
        }
    }

    public final void i(boolean z10) {
        this.f71793h.c(z10);
        this.f71793h.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public final void j(boolean z10, ic position, rb margin, rb padding, rb size) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        if (!z10) {
            this.f71793h.setVisibility(8);
        } else if (this.f71798m) {
            this.f71793h.setShouldOnlyShowOneButton(true);
        } else {
            this.f71793h.setShouldOnlyShowOneButton(false);
        }
        if (z10) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(this.f71793h.getId(), 1);
            constraintSet.clear(this.f71793h.getId(), 2);
            constraintSet.clear(this.f71793h.getId(), 3);
            constraintSet.clear(this.f71793h.getId(), 4);
            int i10 = f.f71806a[position.ordinal()];
            if (i10 == 1) {
                constraintSet.connect(this.f71793h.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.connect(this.f71793h.getId(), 3, 0, 3, a(margin.a()));
            } else if (i10 == 2) {
                constraintSet.connect(this.f71793h.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.connect(this.f71793h.getId(), 3, 0, 3, a(margin.a()));
            } else if (i10 == 3) {
                constraintSet.connect(this.f71793h.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.connect(this.f71793h.getId(), 4, 0, 4, a(margin.a()));
            } else if (i10 == 4) {
                constraintSet.connect(this.f71793h.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.connect(this.f71793h.getId(), 4, 0, 4, a(margin.a()));
            }
            constraintSet.applyTo(this);
        }
    }

    public final void k(boolean z10, ic position, rb margin, rb padding, rb size, String imageUrl, String clickthroughUrl, boolean z11) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        h(zc.f71810b, z10);
        if (z10) {
            this.f71791f.f(size);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(this.f71791f.getId(), 1);
            constraintSet.clear(this.f71791f.getId(), 2);
            constraintSet.clear(this.f71791f.getId(), 3);
            constraintSet.clear(this.f71791f.getId(), 4);
            int i10 = f.f71806a[position.ordinal()];
            if (i10 == 1) {
                constraintSet.connect(this.f71791f.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.connect(this.f71791f.getId(), 3, 0, 3, a(margin.a()));
                constraintSet.connect(this.f71792g.getId(), 3, 0, 3, a(margin.a()));
                constraintSet.connect(this.f71793h.getId(), 3, 0, 3, a(margin.a()));
            } else if (i10 == 2) {
                constraintSet.connect(this.f71791f.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.connect(this.f71791f.getId(), 3, 0, 3, a(margin.a()));
            } else if (i10 == 3) {
                constraintSet.connect(this.f71791f.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.connect(this.f71791f.getId(), 4, 0, 4, a(margin.a()));
            } else if (i10 == 4) {
                constraintSet.connect(this.f71791f.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.connect(this.f71791f.getId(), 4, 0, 4, a(margin.a()));
            }
            constraintSet.applyTo(this);
            if (imageUrl.length() > 0) {
                this.f71791f.g(imageUrl);
            }
            this.f71791f.setClickthroughUrl(clickthroughUrl);
            this.f71791f.setEnableSponsorText(z11);
        }
    }

    public final void l(boolean z10, String ctaTextTitle) {
        f1 f1Var;
        Intrinsics.checkNotNullParameter(ctaTextTitle, "ctaTextTitle");
        if (this.f71795j == null) {
            return;
        }
        h(zc.f71815g, z10);
        if (z10 && (f1Var = this.f71795j) != null) {
            f1Var.setCustomContentDescription(ctaTextTitle);
        }
    }

    public final void n(boolean z10) {
        f1 f1Var = this.f71795j;
        if (f1Var != null) {
            f1Var.setVisibility(z10 ? 0 : 8);
            f1Var.setImportantForAccessibility(z10 ? 1 : 2);
            if (z10) {
                l5 l5Var = this.f71796k;
                r8 r8Var = new r8(this.f71789d.a(), CollectionsKt.emptyList(), j9.f70165c, null, null, null, null, this.f71790e, 120, null);
                List listC = this.f71789d.c();
                ArrayList<oe> arrayList = new ArrayList();
                for (Object obj : listC) {
                    if (Intrinsics.areEqual(((oe) obj).d(), oe.a.f70739e.g())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (oe oeVar : arrayList) {
                    arrayList2.add(new de(oeVar.e(), oeVar.c(), oeVar.a(), null, 8, null));
                }
                l5Var.h(r8Var, arrayList2);
            }
        }
    }

    public final boolean o() {
        return this.f71793h.getCloseButton().getVisibility() == 0;
    }

    public final void q(boolean z10) {
        this.f71791f.setVisibility(z10 ? 0 : 8);
        this.f71791f.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public final boolean r() {
        s9 s9VarD = this.f71794i.d();
        return (s9VarD != null ? s9VarD.m() : null) == s9.b.f71077b;
    }

    public final void s() {
        this.f71794i.e();
    }

    public final void setAdViewOverlayListener(@Nullable od odVar) {
        this.f71797l = odVar;
    }

    public final void setRewardedMode(boolean z10) {
        this.f71798m = z10;
        if (!z10) {
            this.f71793h.setShouldOnlyShowOneButton(false);
        } else {
            this.f71793h.setShouldOnlyShowOneButton(true);
            this.f71794i.c(new g());
        }
    }

    public final void setShouldOnlyShowOneButtonForCloseChip(boolean z10) {
        this.f71793h.setShouldOnlyShowOneButton(z10);
    }

    public final void setTimer(long j10) {
        String string = getContext().getString(R$string.f17921g);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getContext().getString(R$string.f17920f);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f71794i.b(j10, this.f71800o, string, string2, new h());
    }

    public final void setTimerDuration(long j10) {
        this.f71799n = j10;
    }

    public final void t(boolean z10) {
        this.f71793h.d(z10);
        this.f71793h.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public final void u(boolean z10) {
        this.f71793h.e(z10);
        this.f71793h.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public final void v() {
        this.f71791f.setAccessibilityTraversalBefore(this.f71792g.getId());
        this.f71792g.setAccessibilityTraversalBefore(this.f71793h.getId());
        f1 f1Var = this.f71795j;
        if (f1Var != null) {
            this.f71793h.setAccessibilityTraversalBefore(f1Var.getId());
        }
    }

    public final void w(boolean z10) {
        this.f71792g.setVisibility(z10 ? 0 : 8);
        this.f71792g.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public final void x() {
        this.f71791f.setId(View.generateViewId());
        this.f71792g.setId(View.generateViewId());
        this.f71793h.setId(View.generateViewId());
        f1 f1Var = this.f71795j;
        if (f1Var != null) {
            f1Var.setId(View.generateViewId());
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.constrainWidth(this.f71791f.getId(), -2);
        constraintSet.constrainHeight(this.f71791f.getId(), -2);
        constraintSet.connect(this.f71791f.getId(), 1, 0, 1);
        constraintSet.connect(this.f71791f.getId(), 3, 0, 3);
        constraintSet.constrainWidth(this.f71792g.getId(), -2);
        constraintSet.constrainHeight(this.f71792g.getId(), -2);
        constraintSet.connect(this.f71792g.getId(), 1, this.f71791f.getId(), 2, (int) (8 * getResources().getDisplayMetrics().density));
        constraintSet.connect(this.f71792g.getId(), 3, 0, 3);
        constraintSet.constrainWidth(this.f71793h.getId(), -2);
        constraintSet.constrainHeight(this.f71793h.getId(), -2);
        constraintSet.connect(this.f71793h.getId(), 2, 0, 2);
        constraintSet.connect(this.f71793h.getId(), 3, 0, 3);
        f1 f1Var2 = this.f71795j;
        if (f1Var2 != null) {
            constraintSet.constrainWidth(f1Var2.getId(), 0);
            constraintSet.connect(f1Var2.getId(), 1, 0, 1);
            constraintSet.connect(f1Var2.getId(), 2, 0, 2);
            constraintSet.connect(f1Var2.getId(), 4, 0, 4);
        }
        constraintSet.applyTo(this);
    }

    public final void y(boolean z10) {
        this.f71792g.setMuted(z10);
    }

    public final void z() {
        this.f71794i.f();
    }

    private final void setTimerRunning(boolean z10) {
    }
}
