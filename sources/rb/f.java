package rb;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayDeque;
import java.util.Map;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
abstract class f {
    public static void a(Spannable spannable, int i10, int i11, g gVar, c cVar, Map map, int i12) {
        c cVarE;
        g gVarF;
        int i13;
        if (gVar.n() != -1) {
            spannable.setSpan(new StyleSpan(gVar.n()), i10, i11, 33);
        }
        if (gVar.u()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.v()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.s()) {
            p9.g.b(spannable, new ForegroundColorSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.r()) {
            p9.g.b(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.e() != null) {
            p9.g.b(spannable, new TypefaceSpan(gVar.e()), i10, i11, 33);
        }
        if (gVar.q() != null) {
            b bVar = (b) q9.a.e(gVar.q());
            int i14 = bVar.f99350a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f99351b;
            }
            int i15 = bVar.f99352c;
            if (i15 == -2) {
                i15 = 1;
            }
            p9.g.b(spannable, new p9.h(i14, i13, i15), i10, i11, 33);
        }
        int iL = gVar.l();
        if (iL == 2) {
            c cVarD = d(cVar, map);
            if (cVarD != null && (cVarE = e(cVarD, map)) != null) {
                if (cVarE.g() != 1 || cVarE.f(0).f99354b == null) {
                    u.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) o0.i(cVarE.f(0).f99354b);
                    g gVarF2 = f(cVarE.f99358f, cVarE.l(), map);
                    int iK = gVarF2 != null ? gVarF2.k() : -1;
                    if (iK == -1 && (gVarF = f(cVarD.f99358f, cVarD.l(), map)) != null) {
                        iK = gVarF.k();
                    }
                    spannable.setSpan(new p9.f(str, iK), i10, i11, 33);
                }
            }
        } else if (iL == 3 || iL == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.p()) {
            p9.g.b(spannable, new p9.d(), i10, i11, 33);
        }
        int iG = gVar.g();
        if (iG == 1) {
            p9.g.b(spannable, new AbsoluteSizeSpan((int) gVar.f(), true), i10, i11, 33);
        } else if (iG == 2) {
            p9.g.b(spannable, new RelativeSizeSpan(gVar.f()), i10, i11, 33);
        } else {
            if (iG != 3) {
                return;
            }
            p9.g.a(spannable, gVar.f() / 100.0f, i10, i11, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static c d(c cVar, Map map) {
        while (cVar != null) {
            g gVarF = f(cVar.f99358f, cVar.l(), map);
            if (gVarF != null && gVarF.l() == 1) {
                return cVar;
            }
            cVar = cVar.f99362j;
        }
        return null;
    }

    private static c e(c cVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(cVar);
        while (!arrayDeque.isEmpty()) {
            c cVar2 = (c) arrayDeque.pop();
            g gVarF = f(cVar2.f99358f, cVar2.l(), map);
            if (gVarF != null && gVarF.l() == 3) {
                return cVar2;
            }
            for (int iG = cVar2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(cVar2.f(iG));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a((g) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
