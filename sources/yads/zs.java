package yads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class zs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f118793c = new Comparator() { // from class: yads.v71
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((zs) obj2).f118795b, ((zs) obj).f118795b);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a20 f118794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118795b;

    public zs(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
        z10 z10VarB = new z10().a(spannableStringBuilder).a(alignment).a(f10).a(i10).b(f11).b(i11).b();
        if (z10) {
            z10VarB.c(i12);
        }
        this.f118794a = z10VarB.a();
        this.f118795b = i13;
    }
}
