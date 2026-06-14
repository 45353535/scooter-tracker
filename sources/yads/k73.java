package yads;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k73 extends rw2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w92 f112630m = new w92();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f112631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f112632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f112633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f112634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f112635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f112636s;

    public k73(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f112632o = 0;
            this.f112633p = -1;
            this.f112634q = "sans-serif";
            this.f112631n = false;
            this.f112635r = 0.85f;
            this.f112636s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f112632o = bArr[24];
        this.f112633p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f112634q = "Serif".equals(w83.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * Ascii.DC4;
        this.f112636s = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f112631n = z10;
        if (z10) {
            this.f112635r = w83.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10);
        } else {
            this.f112635r = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    @Override // yads.rw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.d23 a(byte[] r22, int r23, boolean r24) throws yads.f23 {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.k73.a(byte[], int, boolean):yads.d23");
    }
}
