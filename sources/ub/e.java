package ub;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p9.a;
import q9.d0;
import q9.o0;
import q9.u;
import ub.e;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f105389a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f105390b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f105391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f105392d;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f105393c = new Comparator() { // from class: ub.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((e.b) obj).f105394a.f105397b, ((e.b) obj2).f105394a.f105397b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f105394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f105395b;

        private b(c cVar, int i10) {
            this.f105394a = cVar;
            this.f105395b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f105397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f105399d;

        private c(String str, int i10, String str2, Set set) {
            this.f105397b = i10;
            this.f105396a = str;
            this.f105398c = str2;
            this.f105399d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            q9.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrJ1 = o0.j1(strTrim, "\\.");
            String str3 = strArrJ1[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrJ1.length; i11++) {
                hashSet.add(strArrJ1[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    private static final class d implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f105400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ub.c f105401c;

        public d(int i10, ub.c cVar) {
            this.f105400b = i10;
            this.f105401c = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f105400b, dVar.f105400b);
        }
    }

    /* JADX INFO: renamed from: ub.e$e, reason: collision with other inner class name */
    private static final class C1313e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f105404c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f105402a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f105403b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f105405d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f105406e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f105407f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f105408g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f105409h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f105410i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f105411j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f105412k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            u.h("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public ub.d a() {
            return new ub.d(g().a(), this.f105402a, this.f105403b);
        }

        public a.b g() {
            float fE = this.f105409h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f105405d);
            }
            int iF = this.f105410i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f105405d);
            }
            a.b bVarR = new a.b().p(c(this.f105405d)).h(b(this.f105406e, this.f105407f), this.f105407f).i(this.f105408g).k(fE).l(iF).n(Math.min(this.f105411j, d(iF, fE))).r(this.f105412k);
            CharSequence charSequence = this.f105404c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f105391c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f105392d = DesugarCollections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f105391c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f105392d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                u.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f105393c);
        int i10 = cVar.f105397b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f105394a.f105396a)) {
                b bVar = (b) arrayList.get(i11);
                int iH = h(j(list2, str, bVar.f105394a), iJ, 1);
                int i12 = bVar.f105394a.f105397b - length;
                int i13 = bVar.f105395b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new p9.f(charSequenceSubSequence.toString(), iH), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    private static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10;
        int length;
        i10 = cVar.f105397b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f105396a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f105399d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f105398c, i10, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List listI = i(list2, str, cVar);
        for (int i11 = 0; i11 < listI.size(); i11++) {
            e(spannableStringBuilder, ((d) listI.get(i11)).f105401c, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, ub.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            p9.g.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            p9.g.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            p9.g.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            p9.g.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            p9.g.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            p9.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            p9.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new p9.d(), i10, i11, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new p9.i(str), i10, i11, 33);
    }

    private static int g(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List i(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ub.c cVar2 = (ub.c) list.get(i10);
            int iH = cVar2.h(str, cVar.f105396a, cVar.f105399d, cVar.f105398c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List list, String str, c cVar) {
        List listI = i(list, str, cVar);
        for (int i10 = 0; i10 < listI.size(); i10++) {
            ub.c cVar2 = ((d) listI.get(i10)).f105401c;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String strTrim = str.trim();
        q9.a.a(!strTrim.isEmpty());
        return o0.k1(strTrim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static p9.a m(CharSequence charSequence) {
        C1313e c1313e = new C1313e();
        c1313e.f105404c = charSequence;
        return c1313e.g().a();
    }

    private static ub.d n(String str, Matcher matcher, d0 d0Var, List list) {
        C1313e c1313e = new C1313e();
        try {
            c1313e.f105402a = h.d((String) q9.a.e(matcher.group(1)));
            c1313e.f105403b = h.d((String) q9.a.e(matcher.group(2)));
            q((String) q9.a.e(matcher.group(3)), c1313e);
            StringBuilder sb2 = new StringBuilder();
            String strS = d0Var.s();
            while (!TextUtils.isEmpty(strS)) {
                if (sb2.length() > 0) {
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb2.append(strS.trim());
                strS = d0Var.s();
            }
            c1313e.f105404c = r(str, sb2.toString(), list);
            return c1313e.a();
        } catch (IllegalArgumentException unused) {
            u.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static ub.d o(d0 d0Var, List list) {
        String strS = d0Var.s();
        if (strS == null) {
            return null;
        }
        Pattern pattern = f105389a;
        Matcher matcher = pattern.matcher(strS);
        if (matcher.matches()) {
            return n(null, matcher, d0Var, list);
        }
        String strS2 = d0Var.s();
        if (strS2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strS2);
        if (matcher2.matches()) {
            return n(strS.trim(), matcher2, d0Var, list);
        }
        return null;
    }

    static a.b p(String str) {
        C1313e c1313e = new C1313e();
        q(str, c1313e);
        return c1313e.g();
    }

    private static void q(String str, C1313e c1313e) {
        Matcher matcher = f105390b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) q9.a.e(matcher.group(1));
            String str3 = (String) q9.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c1313e);
                } else if ("align".equals(str2)) {
                    c1313e.f105405d = w(str3);
                } else if (C4240b4.i.L.equals(str2)) {
                    v(str3, c1313e);
                } else if ("size".equals(str2)) {
                    c1313e.f105411j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c1313e.f105412k = x(str3);
                } else {
                    u.h("WebvttCueParser", "Unknown cue setting " + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + str3);
                }
            } catch (NumberFormatException unused) {
                u.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iG = i10 + 1;
                if (iG < str2.length()) {
                    boolean z10 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i11 = iG - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iG - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f105396a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                u.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String str, C1313e c1313e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c1313e.f105408g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c1313e.f105406e = h.c(str);
            c1313e.f105407f = 0;
        } else {
            c1313e.f105406e = Integer.parseInt(str);
            c1313e.f105407f = 1;
        }
    }

    private static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                u.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void v(String str, C1313e c1313e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c1313e.f105410i = u(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c1313e.f105409h = h.c(str);
    }

    private static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                u.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        u.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
