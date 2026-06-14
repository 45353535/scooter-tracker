package io.bidmachine.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.google.common.base.Predicate;
import p9.a;

/* JADX INFO: loaded from: classes12.dex */
abstract class g0 {
    public static /* synthetic */ boolean a(Object obj) {
        return !(obj instanceof p9.e);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void c(a.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) q9.a.e(bVar.e()), new Predicate() { // from class: io.bidmachine.media3.ui.f0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return g0.a(obj);
                }
            });
        }
        d(bVar);
    }

    public static void d(a.b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) q9.a.e(bVar.e()), new Predicate() { // from class: io.bidmachine.media3.ui.e0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return g0.b(obj);
                }
            });
        }
    }

    private static void e(Spannable spannable, Predicate predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
