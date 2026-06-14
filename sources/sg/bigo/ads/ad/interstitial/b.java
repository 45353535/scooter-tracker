package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f100662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f100663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f100664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f100665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f100666e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ b[] f100667p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ColorInt
    public final int f100668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ColorInt
    public final int f100669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f100670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final sg.bigo.ads.common.ab.b f100671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f100672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f100673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ColorInt
    private final int f100674l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ColorInt
    private final int f100675m = 134217728;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f100676n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f100677o = 8;

    static {
        b bVar = new b("WHITE", 0, null, d.f100903b, -10525849, 2, 1, 1);
        f100662a = bVar;
        sg.bigo.ads.common.ab.b bVarA = sg.bigo.ads.common.ab.b.a(1, 1, sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i10 = d.f100902a;
        b bVar2 = new b("DKGRAY_TRANSLUCENT", 1, bVarA, i10, i10, 0, 2, 2);
        f100663b = bVar2;
        sg.bigo.ads.common.ab.b bVarA2 = sg.bigo.ads.common.ab.b.a(1, 1, sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i11 = d.f100902a;
        b bVar3 = new b("MAIN_COLOR_TRANSLUCENT", 2, bVarA2, i11, i11, 0, 2, 2);
        f100664c = bVar3;
        sg.bigo.ads.common.ab.b bVarA3 = sg.bigo.ads.common.ab.b.a(4, 2, sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i12 = d.f100902a;
        b bVar4 = new b("LTGRAY_BLUR", 3, bVarA3, i12, i12, 0, 2, 2);
        f100665d = bVar4;
        sg.bigo.ads.common.ab.b bVarA4 = sg.bigo.ads.common.ab.b.a(4, 2, sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i13 = d.f100902a;
        b bVar5 = new b("MAIN_COLOR_BLUR", 4, bVarA4, i13, i13, 0, 2, 2);
        f100666e = bVar5;
        f100667p = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    /* JADX WARN: Incorrect types in method signature: (Lsg/bigo/ads/common/ab/b;IIIIIII)V */
    private b(String str, int i10, @Nullable sg.bigo.ads.common.ab.b bVar, int i11, int i12, int i13, int i14, int i15) {
        this.f100671i = bVar;
        this.f100668f = i11;
        this.f100669g = i12;
        this.f100670h = i13;
        this.f100672j = i14;
        this.f100673k = i15;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f100667p.clone();
    }

    public final void a(View view) {
        if (view != null) {
            sg.bigo.ads.common.e.a.a(view, sg.bigo.ads.common.utils.e.a(view.getContext(), this.f100672j));
        }
    }

    public final void b(View view) {
        if (view != null) {
            sg.bigo.ads.common.e.a.a(view, sg.bigo.ads.common.utils.e.a(view.getContext(), this.f100670h));
        }
    }

    public final void a(TextView textView, TextView textView2) {
        Context context;
        if (textView == null && textView2 == null) {
            return;
        }
        if (textView != null) {
            context = textView.getContext();
            textView.setTextColor(this.f100668f);
        } else {
            context = null;
        }
        if (textView2 != null) {
            if (context == null) {
                context = textView2.getContext();
            }
            textView2.setTextColor(this.f100669g);
        }
        sg.bigo.ads.common.ab.b bVar = this.f100671i;
        if (bVar == null) {
            if (textView != null) {
                textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            if (textView2 != null) {
                textView2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            return;
        }
        int iA = sg.bigo.ads.common.utils.e.a(context, bVar.f102279a);
        int iA2 = sg.bigo.ads.common.utils.e.a(context, bVar.f102280b);
        int iA3 = sg.bigo.ads.common.utils.e.a(context, bVar.f102281c);
        if (textView != null) {
            textView.setShadowLayer(iA, iA2, iA3, bVar.f102282d);
        }
        if (textView2 != null) {
            textView2.setShadowLayer(iA, iA2, iA3, bVar.f102282d);
        }
    }

    public final void a(RoundedImageView roundedImageView) {
        if (roundedImageView == null) {
            return;
        }
        roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), this.f100677o));
    }
}
