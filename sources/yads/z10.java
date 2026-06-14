package yads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class z10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f118490a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f118491b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Layout.Alignment f118492c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Layout.Alignment f118493d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f118494e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118495f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118496g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f118497h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f118498i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f118499j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f118500k = -3.4028235E38f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f118501l = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f118502m = -3.4028235E38f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f118503n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f118504o = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f118505p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f118506q;

    public final z10 a(float f10) {
        this.f118494e = f10;
        this.f118495f = 0;
        return this;
    }

    public final z10 b(float f10) {
        this.f118497h = f10;
        return this;
    }

    public final void c(int i10) {
        this.f118504o = i10;
        this.f118503n = true;
    }

    public final z10 b(int i10) {
        this.f118498i = i10;
        return this;
    }

    public final z10 a(int i10) {
        this.f118496g = i10;
        return this;
    }

    public final z10 b() {
        this.f118501l = -3.4028235E38f;
        return this;
    }

    public final z10 a(SpannableStringBuilder spannableStringBuilder) {
        this.f118490a = spannableStringBuilder;
        return this;
    }

    public final z10 a(Layout.Alignment alignment) {
        this.f118492c = alignment;
        return this;
    }

    public final a20 a() {
        return new a20(this.f118490a, this.f118492c, this.f118493d, this.f118491b, this.f118494e, this.f118495f, this.f118496g, this.f118497h, this.f118498i, this.f118499j, this.f118500k, this.f118501l, this.f118502m, this.f118503n, this.f118504o, this.f118505p, this.f118506q);
    }
}
