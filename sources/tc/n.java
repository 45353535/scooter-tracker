package tc;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.d f105142a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f105144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f105145c;

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
            f105143a = iArr;
            int[] iArr2 = new int[id.i.values().length];
            try {
                iArr2[id.i.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[id.i.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f105144b = iArr2;
            int[] iArr3 = new int[id.e.values().length];
            try {
                iArr3[id.e.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[id.e.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[id.e.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[id.e.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f105145c = iArr3;
        }
    }

    public n(id.d params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f105142a = params;
    }

    private final g c(View view, id.e eVar) {
        float measuredWidth = view.getMeasuredWidth();
        int[] iArr = a.f105145c;
        int i10 = iArr[eVar.ordinal()];
        if (i10 != 1) {
            measuredWidth = i10 != 2 ? view.getTranslationX() : -measuredWidth;
        }
        float measuredHeight = view.getMeasuredHeight();
        int i11 = iArr[eVar.ordinal()];
        if (i11 != 3) {
            measuredHeight = i11 != 4 ? view.getTranslationY() : -measuredHeight;
        }
        return new g(view.getAlpha(), measuredWidth, measuredHeight);
    }

    private final g d(View view, id.i iVar, id.e eVar) {
        g gVarC;
        int i10 = iVar == null ? -1 : a.f105144b[iVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? new g(view) : (eVar == null || (gVarC = c(view, eVar)) == null) ? new g(view) : gVarC : new g(0.0f, view.getTranslationX(), view.getTranslationY());
    }

    @Override // tc.h
    public g a(View view, id.f eventType) {
        id.e eVarA;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i10 = a.f105143a[eventType.ordinal()];
        if (i10 == 1) {
            return new g(1.0f, 0.0f, 0.0f);
        }
        if (i10 != 2) {
            throw new lf.m();
        }
        id.h hVar = (id.h) this.f105142a.b().get(eventType);
        id.e eVarG = null;
        id.i iVarD = hVar != null ? hVar.d() : null;
        if (hVar != null && (eVarA = hVar.a()) != null) {
            eVarG = eVarA.g();
        }
        return d(view, iVarD, eVarG);
    }

    @Override // tc.h
    public g b(View view, id.f eventType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i10 = a.f105143a[eventType.ordinal()];
        if (i10 == 1) {
            id.h hVar = (id.h) this.f105142a.b().get(eventType);
            return d(view, hVar != null ? hVar.d() : null, hVar != null ? hVar.a() : null);
        }
        if (i10 == 2) {
            return new g(view);
        }
        throw new lf.m();
    }
}
