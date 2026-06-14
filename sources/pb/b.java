package pb;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lb.e;
import lb.k;
import lb.s;
import lb.t;
import p9.a;
import pb.c;
import q9.d0;
import q9.l;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f98161g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f98162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f98163b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f98165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f98166e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f98167f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f98164c = new d0();

    public b(List list) {
        if (list == null || list.isEmpty()) {
            this.f98162a = false;
            this.f98163b = null;
            return;
        }
        this.f98162a = true;
        String strH = o0.H((byte[]) list.get(0));
        q9.a.a(strH.startsWith("Format:"));
        this.f98163b = (a) q9.a.e(a.a(strH));
        h(new d0((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    private static int b(long j10, List list, List list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    private static float c(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static p9.a d(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        a.b bVarO = new a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.f98170c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f98170c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f98177j == 3 && cVar.f98171d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f98171d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f98172e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                bVarO.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f98173f;
            if (z10 && cVar.f98174g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f98174g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f98175h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f98176i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f98193a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f98169b : -1;
        }
        bVarO.p(n(i10)).l(m(i10)).i(l(i10));
        PointF pointF = bVar.f98194b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            bVarO.k(c(bVarO.d()));
            bVarO.h(c(bVarO.c()), 0);
        } else {
            bVarO.k(pointF.x / f10);
            bVarO.h(bVar.f98194b.y / f11, 0);
        }
        return bVarO.a();
    }

    private Charset e(d0 d0Var) {
        Charset charsetR = d0Var.R();
        return charsetR != null ? charsetR : StandardCharsets.UTF_8;
    }

    private void f(String str, a aVar, List list, List list2) {
        int i10;
        q9.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(StringUtils.COMMA, aVar.f98160e);
        if (strArrSplit.length != aVar.f98160e) {
            u.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jK = k(strArrSplit[aVar.f98156a]);
        if (jK == -9223372036854775807L) {
            u.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jK2 = k(strArrSplit[aVar.f98157b]);
        if (jK2 == -9223372036854775807L || jK2 <= jK) {
            u.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f98165d;
        c cVar = (map == null || (i10 = aVar.f98158c) == -1) ? null : (c) map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[aVar.f98159d];
        p9.a aVarD = d(c.b.d(str2).replace("\\N", IOUtils.LINE_SEPARATOR_UNIX).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX).replace("\\h", " "), cVar, c.b.b(str2), this.f98166e, this.f98167f);
        int iB = b(jK2, list2, list);
        for (int iB2 = b(jK, list2, list); iB2 < iB; iB2++) {
            ((List) list.get(iB2)).add(aVarD);
        }
    }

    private void g(d0 d0Var, List list, List list2, Charset charset) {
        a aVarA = this.f98162a ? this.f98163b : null;
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if (strT.startsWith("Format:")) {
                aVarA = a.a(strT);
            } else if (strT.startsWith("Dialogue:")) {
                if (aVarA == null) {
                    u.h("SsaParser", "Skipping dialogue line before complete format: " + strT);
                } else {
                    f(strT, aVarA, list, list2);
                }
            }
        }
    }

    private void h(d0 d0Var, Charset charset) {
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strT)) {
                i(d0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strT)) {
                this.f98165d = j(d0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strT)) {
                u.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strT)) {
                return;
            }
        }
    }

    private void i(d0 d0Var, Charset charset) {
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null) {
                return;
            }
            if (d0Var.a() != 0 && d0Var.h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strT.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (strArrSplit.length == 2) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[0].trim());
                lowerCase.getClass();
                if (lowerCase.equals("playresx")) {
                    this.f98166e = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.f98167f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map j(d0 d0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strT = d0Var.t(charset);
            if (strT == null || (d0Var.a() != 0 && d0Var.h(charset) == '[')) {
                break;
            }
            if (strT.startsWith("Format:")) {
                aVarA = c.a.a(strT);
            } else if (strT.startsWith("Style:")) {
                if (aVarA == null) {
                    u.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strT);
                } else {
                    c cVarB = c.b(strT, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f98168a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long k(String str) {
        Matcher matcher = f98161g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) o0.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) o0.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) o0.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) o0.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int l(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                u.h("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int m(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                u.h("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Layout.Alignment n(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                u.h("SsaParser", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        long j10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f98164c.U(bArr, i10 + i11);
        this.f98164c.W(i10);
        Charset charsetE = e(this.f98164c);
        if (!this.f98162a) {
            h(this.f98164c, charsetE);
        }
        g(this.f98164c, arrayList, arrayList2, charsetE);
        long j11 = -9223372036854775807L;
        ArrayList arrayList3 = (bVar.f94121a == -9223372036854775807L || !bVar.f94122b) ? null : new ArrayList();
        int i12 = 0;
        while (i12 < arrayList.size()) {
            List list = (List) arrayList.get(i12);
            if (list.isEmpty() && i12 != 0) {
                j10 = j11;
            } else {
                if (i12 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = ((Long) arrayList2.get(i12)).longValue();
                long jLongValue2 = ((Long) arrayList2.get(i12 + 1)).longValue() - ((Long) arrayList2.get(i12)).longValue();
                j10 = j11;
                long j12 = bVar.f94121a;
                if (j12 == j10 || jLongValue >= j12) {
                    lVar.accept(new e(list, jLongValue, jLongValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new e(list, jLongValue, jLongValue2));
                }
            }
            i12++;
            j11 = j10;
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                lVar.accept((e) it.next());
            }
        }
    }

    @Override // lb.t
    public int getCueReplacementBehavior() {
        return 1;
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
