package c0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y.b f6435a = new y.b(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[z.e.values().length];
            iArr[z.e.EXACT.ordinal()] = 1;
            iArr[z.e.INEXACT.ordinal()] = 2;
            iArr[z.e.AUTOMATIC.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(y.h hVar) {
        int i10 = a.$EnumSwitchMapping$0[hVar.H().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 != 3) {
            throw new lf.m();
        }
        if (hVar.q().m() == null && (hVar.K() instanceof z.d)) {
            return true;
        }
        return (hVar.M() instanceof a0.b) && (hVar.K() instanceof z.l) && (((a0.b) hVar.M()).getView() instanceof ImageView) && ((a0.b) hVar.M()).getView() == ((z.l) hVar.K()).getView();
    }

    public static final y.b b() {
        return f6435a;
    }

    public static final Drawable c(y.h hVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.a(hVar.l(), num.intValue());
    }
}
