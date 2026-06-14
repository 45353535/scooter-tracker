package j$.time.format;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f84629d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f84630e = new j("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84633c;

    static {
        new j("+HH:MM:ss", "0");
    }

    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i10 = 0;
        while (true) {
            String[] strArr = f84629d;
            if (i10 < 22) {
                if (strArr[i10].equals(str)) {
                    this.f84632b = i10;
                    this.f84633c = i10 % 11;
                    this.f84631a = str2;
                    return;
                }
                i10++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb2) {
        Long lA = pVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z10 = false;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int i10 = (int) jLongValue;
        if (jLongValue != i10) {
            throw new ArithmeticException();
        }
        String str = this.f84631a;
        if (i10 == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((i10 / 3600) % 100);
        int iAbs2 = Math.abs((i10 / 60) % 60);
        int iAbs3 = Math.abs(i10 % 60);
        int length = sb2.length();
        sb2.append(i10 < 0 ? TokenBuilder.TOKEN_DELIMITER : "+");
        if (this.f84632b >= 11 && iAbs < 10) {
            sb2.append((char) (iAbs + 48));
        } else {
            a(false, iAbs, sb2);
        }
        int i11 = this.f84633c;
        if ((i11 >= 3 && i11 <= 8) || ((i11 >= 9 && iAbs3 > 0) || (i11 >= 1 && iAbs2 > 0))) {
            a(i11 > 0 && i11 % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i11 == 7 || i11 == 8 || (i11 >= 5 && iAbs3 > 0)) {
                if (i11 > 0 && i11 % 2 == 0) {
                    z10 = true;
                }
                a(z10, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z10, int i10, StringBuilder sb2) {
        sb2.append(z10 ? StringUtils.PROCESS_POSTFIX_DELIMITER : "");
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    public final String toString() {
        String strReplace = this.f84631a.replace("'", "''");
        return "Offset(" + f84629d[this.f84632b] + ",'" + strReplace + "')";
    }
}
