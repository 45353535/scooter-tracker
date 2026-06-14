package ub;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q9.d0;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f105365c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f105366d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f105367a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f105368b = new StringBuilder();

    private void a(c cVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f105365c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) q9.a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrJ1 = o0.j1(str, "\\.");
        String str2 = strArrJ1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrJ1.length > 1) {
            cVar.w((String[]) o0.W0(strArrJ1, 1, strArrJ1.length));
        }
    }

    private static boolean b(d0 d0Var) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        byte[] bArrE = d0Var.e();
        if (iF + 2 > iG) {
            return false;
        }
        int i10 = iF + 1;
        if (bArrE[iF] != 47) {
            return false;
        }
        int i11 = iF + 2;
        if (bArrE[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iG) {
                d0Var.X(iG - d0Var.f());
                return true;
            }
            if (((char) bArrE[i11]) == '*' && ((char) bArrE[i12]) == '/') {
                i11 += 2;
                iG = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(d0 d0Var) {
        char cK = k(d0Var, d0Var.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        d0Var.X(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f105366d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            u.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) q9.a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) q9.a.e(matcher.group(1))));
    }

    private static String f(d0 d0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG && !z10) {
            char c10 = (char) d0Var.e()[iF];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iF++;
                sb2.append(c10);
            }
        }
        d0Var.X(iF - d0Var.f());
        return sb2.toString();
    }

    static String g(d0 d0Var, StringBuilder sb2) {
        n(d0Var);
        if (d0Var.a() == 0) {
            return null;
        }
        String strF = f(d0Var, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) d0Var.H());
    }

    private static String h(d0 d0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iF = d0Var.f();
            String strG = g(d0Var, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                d0Var.W(iF);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static String i(d0 d0Var, StringBuilder sb2) {
        n(d0Var);
        if (d0Var.a() < 5 || !"::cue".equals(d0Var.E(5))) {
            return null;
        }
        int iF = d0Var.f();
        String strG = g(d0Var, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            d0Var.W(iF);
            return "";
        }
        String strL = "(".equals(strG) ? l(d0Var) : null;
        if (")".equals(g(d0Var, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(d0 d0Var, c cVar, StringBuilder sb2) {
        n(d0Var);
        String strF = f(d0Var, sb2);
        if (!"".equals(strF) && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(g(d0Var, sb2))) {
            n(d0Var);
            String strH = h(d0Var, sb2);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iF = d0Var.f();
            String strG = g(d0Var, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    d0Var.W(iF);
                }
            }
            if ("color".equals(strF)) {
                cVar.q(q9.j.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(q9.j.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                cVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    private static char k(d0 d0Var, int i10) {
        return (char) d0Var.e()[i10];
    }

    private static String l(d0 d0Var) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        boolean z10 = false;
        while (iF < iG && !z10) {
            int i10 = iF + 1;
            z10 = ((char) d0Var.e()[iF]) == ')';
            iF = i10;
        }
        return d0Var.E((iF - 1) - d0Var.f()).trim();
    }

    static void m(d0 d0Var) {
        while (!TextUtils.isEmpty(d0Var.s())) {
        }
    }

    static void n(d0 d0Var) {
        while (true) {
            for (boolean z10 = true; d0Var.a() > 0 && z10; z10 = false) {
                if (c(d0Var) || b(d0Var)) {
                    break;
                }
            }
            return;
        }
    }

    public List d(d0 d0Var) {
        this.f105368b.setLength(0);
        int iF = d0Var.f();
        m(d0Var);
        this.f105367a.U(d0Var.e(), d0Var.f());
        this.f105367a.W(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f105367a, this.f105368b);
            if (strI == null || !"{".equals(g(this.f105367a, this.f105368b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iF2 = this.f105367a.f();
                String strG = g(this.f105367a, this.f105368b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f105367a.W(iF2);
                    j(this.f105367a, cVar, this.f105368b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
