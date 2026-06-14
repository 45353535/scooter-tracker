package yads;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f117946a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f117947b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f117948c = new StringBuilder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f117949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f117950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f117951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f117952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f117953h;

    public xs(int i10, int i11) {
        b(i10);
        this.f117953h = i11;
    }

    public final void a() {
        int length = this.f117948c.length();
        if (length > 0) {
            this.f117948c.delete(length - 1, length);
            for (int size = this.f117946a.size() - 1; size >= 0; size--) {
                ws wsVar = (ws) this.f117946a.get(size);
                int i10 = wsVar.f117550c;
                if (i10 != length) {
                    return;
                }
                wsVar.f117550c = i10 - 1;
            }
        }
    }

    public final void b(int i10) {
        this.f117952g = i10;
        this.f117946a.clear();
        this.f117947b.clear();
        this.f117948c.setLength(0);
        this.f117949d = 15;
        this.f117950e = 0;
        this.f117951f = 0;
    }

    public final a20 a(int i10) {
        int i11;
        float f10;
        int i12 = this.f117950e + this.f117951f;
        int i13 = 32 - i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i14 = 0; i14 < this.f117947b.size(); i14++) {
            CharSequence charSequenceSubSequence = (CharSequence) this.f117947b.get(i14);
            int i15 = w83.f117341a;
            if (charSequenceSubSequence.length() > i13) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i13);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
        }
        SpannableString spannableStringB = b();
        int i16 = w83.f117341a;
        int length = spannableStringB.length();
        SpannableString spannableStringSubSequence = spannableStringB;
        if (length > i13) {
            spannableStringSubSequence = spannableStringB.subSequence(0, i13);
        }
        spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i13 - spannableStringBuilder.length();
        int i17 = i12 - length2;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f117952g != 2 || (Math.abs(i17) >= 3 && length2 >= 0)) {
            i11 = (this.f117952g != 2 || i17 <= 0) ? 0 : 2;
        } else {
            i11 = 1;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                i12 = 32 - length2;
            }
            f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i18 = this.f117949d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.f117952g == 1) {
            i18 -= this.f117953h - 1;
        }
        return new a20(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, Integer.MIN_VALUE, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f117948c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 < this.f117946a.size()) {
            ws wsVar = (ws) this.f117946a.get(i14);
            boolean z11 = wsVar.f117549b;
            int i16 = wsVar.f117548a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i13 = ys.A[i16];
                }
                z10 = z12;
            }
            int i17 = wsVar.f117550c;
            i14++;
            if (i17 != (i14 < this.f117946a.size() ? ((ws) this.f117946a.get(i14)).f117550c : length)) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i15 = i17;
                    i12 = i13;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
