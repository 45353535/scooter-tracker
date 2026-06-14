package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f84621g;

    public g(j$.time.temporal.q qVar, int i10, int i11, boolean z10, int i12) {
        super(qVar, i10, i11, u.NOT_NEGATIVE, i12);
        this.f84621g = z10;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i
    public final i a() {
        if (this.f84628e == -1) {
            return this;
        }
        return new g(this.f84624a, this.f84625b, this.f84626c, this.f84621g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i
    public final i b(int i10) {
        return new g(this.f84624a, this.f84625b, this.f84626c, this.f84621g, this.f84628e + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb2) {
        ?? r02 = this.f84624a;
        Long lA = pVar.a(r02);
        if (lA == null) {
            return false;
        }
        s sVar = pVar.f84651b.f84612c;
        long jLongValue = lA.longValue();
        j$.time.temporal.u uVarJ = r02.j();
        uVarJ.b(jLongValue, r02);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(uVarJ.f84723a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(uVarJ.f84726d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z10 = this.f84621g;
        int i10 = this.f84625b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f84626c), roundingMode).toPlainString().substring(2);
            sVar.getClass();
            if (z10) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i10 <= 0) {
            return true;
        }
        if (z10) {
            sVar.getClass();
            sb2.append('.');
        }
        for (int i11 = 0; i11 < i10; i11++) {
            sVar.getClass();
            sb2.append('0');
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f84624a + StringUtils.COMMA + this.f84625b + StringUtils.COMMA + this.f84626c + (this.f84621g ? ",DecimalPoint" : "") + ")";
    }
}
