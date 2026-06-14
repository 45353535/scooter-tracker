package yads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a20 implements oq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a20 f108518s = new a20("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final nq f108519t = new nq() { // from class: yads.v2
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return a20.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f108520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f108521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f108522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f108523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f108524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f108525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f108526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f108527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f108528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f108529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f108530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f108531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f108532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f108533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f108534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f108535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f108536r;

    public a20(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            fi.a(bitmap);
        } else {
            fi.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f108520b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f108520b = charSequence.toString();
        } else {
            this.f108520b = null;
        }
        this.f108521c = alignment;
        this.f108522d = alignment2;
        this.f108523e = bitmap;
        this.f108524f = f10;
        this.f108525g = i10;
        this.f108526h = i11;
        this.f108527i = f11;
        this.f108528j = i12;
        this.f108529k = f13;
        this.f108530l = f14;
        this.f108531m = z10;
        this.f108532n = i14;
        this.f108533o = i13;
        this.f108534p = f12;
        this.f108535q = i15;
        this.f108536r = f15;
    }

    public static final a20 a(Bundle bundle) {
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        boolean z10;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f10 = bundle.getFloat(Integer.toString(4, 36));
            i10 = bundle.getInt(Integer.toString(5, 36));
        } else {
            f10 = -3.4028235E38f;
            i10 = Integer.MIN_VALUE;
        }
        int i13 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f12 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i14 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            f11 = bundle.getFloat(Integer.toString(10, 36));
            i11 = bundle.getInt(Integer.toString(9, 36));
        } else {
            f11 = -3.4028235E38f;
            i11 = Integer.MIN_VALUE;
        }
        float f13 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f14 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle.containsKey(Integer.toString(13, 36))) {
            i12 = bundle.getInt(Integer.toString(13, 36));
            z10 = true;
        } else {
            i12 = ViewCompat.MEASURED_STATE_MASK;
            z10 = false;
        }
        return new a20(charSequence2, alignment2, alignment4, bitmap2, f10, i10, i13, f12, i14, i11, f11, f13, f14, !bundle.getBoolean(Integer.toString(14, 36), false) ? false : z10, i12, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a20.class == obj.getClass()) {
            a20 a20Var = (a20) obj;
            if (TextUtils.equals(this.f108520b, a20Var.f108520b) && this.f108521c == a20Var.f108521c && this.f108522d == a20Var.f108522d && ((bitmap = this.f108523e) != null ? !((bitmap2 = a20Var.f108523e) == null || !bitmap.sameAs(bitmap2)) : a20Var.f108523e == null) && this.f108524f == a20Var.f108524f && this.f108525g == a20Var.f108525g && this.f108526h == a20Var.f108526h && this.f108527i == a20Var.f108527i && this.f108528j == a20Var.f108528j && this.f108529k == a20Var.f108529k && this.f108530l == a20Var.f108530l && this.f108531m == a20Var.f108531m && this.f108532n == a20Var.f108532n && this.f108533o == a20Var.f108533o && this.f108534p == a20Var.f108534p && this.f108535q == a20Var.f108535q && this.f108536r == a20Var.f108536r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108520b, this.f108521c, this.f108522d, this.f108523e, Float.valueOf(this.f108524f), Integer.valueOf(this.f108525g), Integer.valueOf(this.f108526h), Float.valueOf(this.f108527i), Integer.valueOf(this.f108528j), Float.valueOf(this.f108529k), Float.valueOf(this.f108530l), Boolean.valueOf(this.f108531m), Integer.valueOf(this.f108532n), Integer.valueOf(this.f108533o), Float.valueOf(this.f108534p), Integer.valueOf(this.f108535q), Float.valueOf(this.f108536r)});
    }
}
