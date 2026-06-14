package tc;

import android.content.Context;
import android.view.View;
import id.f1;
import id.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a f105136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f105137b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f105139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f105140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f105141d;

        static {
            int[] iArr = new int[id.f.values().length];
            try {
                iArr[id.f.Appear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[id.f.Disappear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105138a = iArr;
            int[] iArr2 = new int[id.i.values().length];
            try {
                iArr2[id.i.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[id.i.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f105139b = iArr2;
            int[] iArr3 = new int[f1.values().length];
            try {
                iArr3[f1.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[f1.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[f1.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[f1.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f105140c = iArr3;
            int[] iArr4 = new int[id.e.values().length];
            try {
                iArr4[id.e.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[id.e.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[id.e.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[id.e.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f105141d = iArr4;
        }
    }

    public m(id.a params, boolean z10) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f105136a = params;
        this.f105137b = z10;
    }

    private final g c(View view) {
        return new g(this.f105137b ? 0.0f : view.getAlpha(), view.getTranslationX(), view.getTranslationY());
    }

    private final g d(View view, z zVar, id.e eVar) {
        float translationX;
        int i10;
        float translationY;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float f10 = zVar.f(context);
        float fG = zVar.g(context);
        float fH = zVar.h(context);
        float fE = zVar.e(context);
        float fN = zVar.n(context);
        float fC = zVar.c(context);
        int[] iArr = a.f105141d;
        int i11 = iArr[eVar.ordinal()];
        if (i11 == 1) {
            f1 f1VarA = i.a(zVar);
            int i12 = f1VarA == null ? -1 : a.f105140c[f1VarA.ordinal()];
            translationX = i12 != 1 ? i12 != 2 ? view.getTranslationX() : fN - fG : (-fN) - fG;
        } else if (i11 != 2) {
            translationX = view.getTranslationX();
        } else {
            f1 f1VarA2 = i.a(zVar);
            int i13 = f1VarA2 == null ? -1 : a.f105140c[f1VarA2.ordinal()];
            translationX = i13 != 1 ? i13 != 2 ? view.getTranslationX() : fN - f10 : (-fN) - f10;
        }
        int i14 = iArr[eVar.ordinal()];
        if (i14 == 3) {
            f1 f1VarB = i.b(zVar);
            i10 = f1VarB != null ? a.f105140c[f1VarB.ordinal()] : -1;
            translationY = (i10 == 3 || i10 == 4) ? fC - fE : view.getTranslationY();
        } else if (i14 != 4) {
            translationY = view.getTranslationY();
        } else {
            f1 f1VarB2 = i.b(zVar);
            i10 = f1VarB2 != null ? a.f105140c[f1VarB2.ordinal()] : -1;
            translationY = (i10 == 3 || i10 == 4) ? (-fC) - fH : view.getTranslationY();
        }
        return new g(view.getAlpha(), translationX, translationY);
    }

    private final g e(View view, z zVar, id.i iVar, id.e eVar) {
        g gVarD;
        int i10 = iVar == null ? -1 : a.f105139b[iVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? c(view) : (eVar == null || (gVarD = d(view, zVar, eVar)) == null) ? c(view) : gVarD : new g(0.0f, view.getTranslationX(), view.getTranslationY());
    }

    @Override // tc.h
    public g a(View view, id.f eventType) {
        id.e eVarA;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        z zVarG = this.f105136a.g();
        int i10 = a.f105138a[eventType.ordinal()];
        if (i10 == 1) {
            Float fL = this.f105136a.c().l();
            float fFloatValue = fL != null ? fL.floatValue() : 1.0f;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return new g(fFloatValue, zVarG.k(context), zVarG.l(context));
        }
        if (i10 != 2) {
            throw new lf.m();
        }
        id.h hVar = (id.h) this.f105136a.b().get(eventType);
        id.e eVarG = null;
        id.i iVarD = hVar != null ? hVar.d() : null;
        if (hVar != null && (eVarA = hVar.a()) != null) {
            eVarG = eVarA.g();
        }
        return e(view, zVarG, iVarD, eVarG);
    }

    @Override // tc.h
    public g b(View view, id.f eventType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i10 = a.f105138a[eventType.ordinal()];
        if (i10 == 1) {
            id.h hVar = (id.h) this.f105136a.b().get(eventType);
            return e(view, this.f105136a.g(), hVar != null ? hVar.d() : null, hVar != null ? hVar.a() : null);
        }
        if (i10 == 2) {
            return c(view);
        }
        throw new lf.m();
    }
}
