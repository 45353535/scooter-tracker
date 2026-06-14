package sb;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lb.e;
import lb.k;
import lb.s;
import lb.t;
import p9.a;
import q9.d0;
import q9.l;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f99915a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f99916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f99917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f99918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f99919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f99920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f99921g;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f99917c = 0;
            this.f99918d = -1;
            this.f99919e = "sans-serif";
            this.f99916b = false;
            this.f99920f = 0.85f;
            this.f99921g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f99917c = bArr[24];
        this.f99918d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f99919e = "Serif".equals(o0.I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * Ascii.DC4;
        this.f99921g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f99916b = z10;
        if (z10) {
            this.f99920f = o0.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f99920f = 0.85f;
        }
    }

    private void b(d0 d0Var, SpannableStringBuilder spannableStringBuilder) {
        q9.a.a(d0Var.a() >= 12);
        int iP = d0Var.P();
        int iP2 = d0Var.P();
        d0Var.X(2);
        int iH = d0Var.H();
        d0Var.X(1);
        int iQ = d0Var.q();
        if (iP2 > spannableStringBuilder.length()) {
            u.h("Tx3gParser", "Truncating styl end (" + iP2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iP2 = spannableStringBuilder.length();
        }
        int i10 = iP2;
        if (iP < i10) {
            d(spannableStringBuilder, iH, this.f99917c, iP, i10, 0);
            c(spannableStringBuilder, iQ, this.f99918d, iP, i10, 0);
            return;
        }
        u.h("Tx3gParser", "Ignoring styl with start (" + iP + ") >= end (" + i10 + ").");
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void d(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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

    private static void e(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String f(d0 d0Var) {
        q9.a.a(d0Var.a() >= 2);
        int iP = d0Var.P();
        if (iP == 0) {
            return "";
        }
        int iF = d0Var.f();
        Charset charsetR = d0Var.R();
        int iF2 = iP - (d0Var.f() - iF);
        if (charsetR == null) {
            charsetR = StandardCharsets.UTF_8;
        }
        return d0Var.F(iF2, charsetR);
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        this.f99915a.U(bArr, i11 + i10);
        this.f99915a.W(i10);
        String strF = f(this.f99915a);
        if (strF.isEmpty()) {
            lVar.accept(new e(ImmutableList.of(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strF);
        d(spannableStringBuilder, this.f99917c, 0, 0, spannableStringBuilder.length(), 16711680);
        c(spannableStringBuilder, this.f99918d, -1, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f99919e, 0, spannableStringBuilder.length());
        float fO = this.f99920f;
        while (this.f99915a.a() >= 8) {
            int iF = this.f99915a.f();
            int iQ = this.f99915a.q();
            int iQ2 = this.f99915a.q();
            if (iQ2 == 1937013100) {
                q9.a.a(this.f99915a.a() >= 2);
                int iP = this.f99915a.P();
                for (int i12 = 0; i12 < iP; i12++) {
                    b(this.f99915a, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.f99916b) {
                q9.a.a(this.f99915a.a() >= 2);
                fO = o0.o(this.f99915a.P() / this.f99921g, 0.0f, 0.95f);
            }
            this.f99915a.W(iF + iQ);
        }
        lVar.accept(new e(ImmutableList.of(new a.b().o(spannableStringBuilder).h(fO, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // lb.t
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // lb.t
    public /* synthetic */ k parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return s.a(this, bArr, i10, i11);
    }

    @Override // lb.t
    public /* synthetic */ void reset() {
        s.b(this);
    }
}
