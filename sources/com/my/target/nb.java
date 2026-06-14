package com.my.target;

import android.text.TextUtils;
import android.util.Xml;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.my.target.common.models.AudioData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import com.taurusx.tax.vast.VastResourceXmlManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes11.dex */
public final class nb {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f60415l = {"video/mp4", "application/vnd.apple.mpegurl", "application/x-mpegurl"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f60416m = {com.taurusx.tax.f.z.f66069w, "linkTxt"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f60417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f60418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f60419c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f60420d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f60421e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f60422f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f60423g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f60424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f60425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u f60426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j8 f60427k;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f60429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f60430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f60431d;

        public a(String str) {
            this.f60428a = str;
        }

        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                nb.this.a(this.f60428a, "Bad value", "VAST adChoices declared but it's content is empty");
                return;
            }
            if (this.f60429b != null) {
                nb.this.a(this.f60428a, "Json error", "VAST duplicate adChoices for creativeId = " + this.f60428a);
                return;
            }
            try {
                this.f60429b = mb.a().a(new JSONObject(str));
                gb.a("VastParser: Parsed adChoices for creative (id = " + this.f60428a + ")");
            } catch (JSONException e10) {
                nb.this.a(this.f60428a, "Json error", "VAST adChoices json error: " + e10.getMessage());
                this.f60429b = null;
            }
        }

        public void b(String str) {
            if (TextUtils.isEmpty(str)) {
                nb.this.a(this.f60428a, "Bad value", "VAST adDisclaimer declared but it's content is empty");
                return;
            }
            if (this.f60430c == null) {
                this.f60430c = str;
                return;
            }
            nb.this.a(this.f60428a, "Json error", "VAST duplicate adDisclaimer for creativeId = " + this.f60428a);
        }

        public void c(String str) {
            if (TextUtils.isEmpty(str)) {
                nb.this.a(this.f60428a, "Bad value", "VAST ageRestrictions declared but it's content is empty");
                return;
            }
            if (this.f60431d == null) {
                this.f60431d = str;
                return;
            }
            nb.this.a(this.f60428a, "Json error", "VAST duplicate ageRestrictions for creativeId = " + this.f60428a);
        }
    }

    public nb(j jVar, u uVar) {
        this.f60417a = jVar;
        this.f60418b = uVar;
        this.f60427k = uVar.v();
    }

    public static nb a(j jVar, u uVar) {
        return new nb(jVar, uVar);
    }

    public static int f(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.getEventType();
        } catch (Throwable th2) {
            gb.a("VastParser: Error - " + th2.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    public static int i(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (Throwable th2) {
            gb.a("VastParser: Error - " + th2.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    public static int j(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (Throwable th2) {
            gb.a("VastParser: Error - " + th2.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    public static String k(XmlPullParser xmlPullParser) {
        String text;
        if (i(xmlPullParser) == 4) {
            text = xmlPullParser.getText();
            j(xmlPullParser);
        } else {
            gb.a("VastParser: No text - " + xmlPullParser.getName());
            text = "";
        }
        return text.trim();
    }

    public static void l(XmlPullParser xmlPullParser) {
        if (f(xmlPullParser) != 2) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            int i11 = i(xmlPullParser);
            if (i11 == 2) {
                i10++;
            } else if (i11 == 3) {
                i10--;
            }
        }
    }

    public float b(String str) {
        long j10;
        try {
            if (str.contains(".")) {
                int iIndexOf = str.indexOf(".");
                j10 = Long.parseLong(str.substring(iIndexOf + 1));
                if (j10 > 1000) {
                    return -1.0f;
                }
                str = str.substring(0, iIndexOf);
            } else {
                j10 = 0;
            }
            String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 3);
            long j11 = Integer.parseInt(strArrSplit[0]);
            long j12 = Integer.parseInt(strArrSplit[1]);
            long j13 = Integer.parseInt(strArrSplit[2]);
            if (j11 >= 24 || j12 >= 60 || j13 >= 60) {
                return -1.0f;
            }
            Long.signum(j13);
            return (((j10 + (j13 * 1000)) + (j12 * 60000)) + (j11 * 3600000)) / 1000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    public ArrayList c() {
        return this.f60423g;
    }

    public u d() {
        return this.f60426j;
    }

    public final void e(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if (VastExtensionParentXmlManager.f66980w.equals(xmlPullParser.getName())) {
                    d(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public final void g(XmlPullParser xmlPullParser) {
        String strK = k(xmlPullParser);
        if (TextUtils.isEmpty(strK)) {
            return;
        }
        this.f60419c.add(ya.a("playbackStarted", strK));
        gb.a("VastParser: Impression tracker url for wrapper - " + strK);
    }

    public final void h(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if (com.taurusx.tax.f.y.f66057w.equals(name)) {
                    g(xmlPullParser);
                } else if (com.taurusx.tax.f.y.f66054o.equals(name)) {
                    c(xmlPullParser);
                } else if (com.taurusx.tax.f.y.f66056t.equals(name)) {
                    e(xmlPullParser);
                } else if (com.taurusx.tax.f.z.f66069w.equals(name)) {
                    b(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
        b();
    }

    public final void m(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2 && com.taurusx.tax.f.t.f66040o.equals(xmlPullParser.getName())) {
                a(xmlPullParser);
            }
        }
    }

    public final void n(XmlPullParser xmlPullParser) {
        String strA = a(com.taurusx.tax.f.z.f66061c, xmlPullParser);
        String strK = null;
        String strK2 = null;
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if (com.taurusx.tax.f.z.f66066o.equals(name)) {
                    strK = k(xmlPullParser);
                } else if (com.taurusx.tax.f.z.f66065n.equals(name)) {
                    strK2 = k(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
        if (strK == null) {
            return;
        }
        if (this.f60427k == null) {
            this.f60427k = j8.a(null, null);
        }
        this.f60427k.f59963c.add((TextUtils.isEmpty(strA) || TextUtils.isEmpty(strK2)) ? ob.a(strK) : ob.a(strK, strA, strK2));
    }

    public static String a(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getAttributeValue(null, str);
    }

    public void c(String str) {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            a();
            for (int iF = f(xmlPullParserNewPullParser); iF != 1 && iF != Integer.MIN_VALUE; iF = i(xmlPullParserNewPullParser)) {
                if (iF == 2 && "VAST".equalsIgnoreCase(xmlPullParserNewPullParser.getName())) {
                    m(xmlPullParserNewPullParser);
                }
            }
        } catch (Throwable th2) {
            gb.a("VastParser: Unable to parse VAST - " + th2.getMessage());
        }
    }

    public final void d(XmlPullParser xmlPullParser) {
        String strA = a("type", xmlPullParser);
        if (strA == null || Arrays.binarySearch(f60416m, strA) < 0) {
            l(xmlPullParser);
            return;
        }
        if (!"linkTxt".equals(strA)) {
            while (j(xmlPullParser) == 2) {
                if (f(xmlPullParser) == 2) {
                    if (com.taurusx.tax.f.z.f66069w.equals(xmlPullParser.getName())) {
                        b(xmlPullParser);
                    } else {
                        l(xmlPullParser);
                    }
                }
            }
            return;
        }
        String strK = k(xmlPullParser);
        this.f60425i = lb.a(strK);
        gb.a("VastParser: VAST linkTxt raw text: " + strK);
        l(xmlPullParser);
    }

    public static String a(String str) {
        return str.replaceAll("&amp;", C4240b4.j.f42670c).replaceAll("&lt;", "<").replaceAll("&gt;", ">").trim();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.my.target.s5 r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L63
            java.lang.String r0 = "%"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L3c
            int r0 = r5.length()
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "VastParser: Linear skipoffset is "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " [%]"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.my.target.gb.a(r5)
            float r5 = r4.o()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r1
            float r0 = (float) r0
            float r5 = r5 * r0
            goto L65
        L3c:
            java.lang.String r0 = ":"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L63
            float r5 = r3.b(r5)     // Catch: java.lang.Throwable -> L49
            goto L65
        L49:
            java.lang.String r0 = r4.r()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to convert ISO time skipoffset string "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "Bad value"
            r3.a(r0, r1, r5)
        L63:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L65:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6d
            r4.c(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.nb.a(com.my.target.s5, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(org.xmlpull.v1.XmlPullParser r12, com.my.target.s5 r13) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.nb.e(org.xmlpull.v1.XmlPullParser, com.my.target.s5):void");
    }

    public final void b() {
        for (int i10 = 0; i10 < this.f60423g.size(); i10++) {
            s5 s5Var = (s5) this.f60423g.get(i10);
            za zaVarX = s5Var.x();
            zaVarX.a(this.f60418b.m(), s5Var.o());
            String strP = this.f60418b.p();
            if (TextUtils.isEmpty(strP)) {
                strP = this.f60425i;
            }
            s5Var.f(strP);
            ArrayList arrayList = this.f60421e;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                w8 w8Var = (w8) obj;
                a(w8Var.d(), w8Var.b(), s5Var);
            }
            zaVarX.a((List) this.f60420d);
            ArrayList arrayList2 = this.f60422f;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                s5Var.a((k1) obj2);
            }
            if (i10 == 0) {
                zaVarX.a((List) this.f60419c);
            }
            s5Var.a(this.f60427k);
        }
    }

    public final void c(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if (com.taurusx.tax.f.y.f66055s.equals(xmlPullParser.getName())) {
                    a(xmlPullParser, a("id", xmlPullParser));
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public void a(String str, String str2, String str3) {
        gb.b("VastParser: Error " + str2 + " with banner id " + str + " - " + str3);
    }

    public final void a() {
        ArrayList arrayListT = this.f60418b.t();
        if (arrayListT != null) {
            this.f60419c.addAll(arrayListT);
        }
        ArrayList arrayListO = this.f60418b.o();
        if (arrayListO != null) {
            this.f60422f.addAll(arrayListO);
        }
    }

    public final void d(XmlPullParser xmlPullParser, s5 s5Var) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if (com.taurusx.tax.f.s.f66022o.equals(name)) {
                    if (s5Var != null) {
                        String strK = k(xmlPullParser);
                        if (!TextUtils.isEmpty(strK)) {
                            s5Var.q(a(strK));
                        }
                    }
                } else if (com.taurusx.tax.f.s.f66026s.equals(name)) {
                    String strK2 = k(xmlPullParser);
                    if (!TextUtils.isEmpty(strK2)) {
                        this.f60420d.add(ya.a("click", strK2));
                    }
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public final void a(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if (com.taurusx.tax.f.w.f66049y.equals(name)) {
                    this.f60424h = true;
                    gb.a("VastParser: VAST file contains wrapped ad information");
                    int iB = this.f60418b.B();
                    if (iB < 5) {
                        a(xmlPullParser, iB);
                    } else {
                        gb.a("VastParser: Got VAST wrapper, but max redirects limit exceeded");
                        l(xmlPullParser);
                    }
                } else if (com.taurusx.tax.f.w.f66048w.equals(name)) {
                    this.f60424h = false;
                    gb.a("VastParser: VAST file contains inline ad information.");
                    h(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public final void c(XmlPullParser xmlPullParser, s5 s5Var) {
        if (!"instreamads".equals(this.f60417a.h()) && !"fullscreen".equals(this.f60417a.h()) && !"rewarded".equals(this.f60417a.h())) {
            if ("instreamaudioads".equals(this.f60417a.h())) {
                a(xmlPullParser, s5Var);
                return;
            }
            return;
        }
        e(xmlPullParser, s5Var);
    }

    public final void b(XmlPullParser xmlPullParser, String str, String str2) {
        while (j(xmlPullParser) == 2) {
            a(xmlPullParser, str, str2);
        }
    }

    public final void b(XmlPullParser xmlPullParser) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if (com.taurusx.tax.f.z.f66070y.equals(xmlPullParser.getName())) {
                    n(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public final boolean b(XmlPullParser xmlPullParser, s5 s5Var) {
        float fB;
        try {
            fB = b(k(xmlPullParser));
        } catch (Throwable unused) {
            fB = 0.0f;
        }
        if (fB <= 0.0f) {
            return false;
        }
        s5Var.a(fB);
        return true;
    }

    public final void a(XmlPullParser xmlPullParser, int i10) {
        String strK = null;
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if (com.taurusx.tax.f.y.f66057w.equals(name)) {
                    g(xmlPullParser);
                } else if (com.taurusx.tax.f.y.f66054o.equals(name)) {
                    c(xmlPullParser);
                } else if (com.taurusx.tax.f.y.f66056t.equals(name)) {
                    e(xmlPullParser);
                } else if (com.taurusx.tax.f.n.f66007g.equals(name)) {
                    strK = k(xmlPullParser);
                } else if (com.taurusx.tax.f.z.f66069w.equals(name)) {
                    b(xmlPullParser);
                } else {
                    l(xmlPullParser);
                }
            }
        }
        if (strK != null) {
            String strP = this.f60418b.p();
            u uVarB = u.b(strK);
            this.f60426j = uVarB;
            uVarB.e(i10 + 1);
            this.f60426j.c(this.f60419c);
            this.f60426j.a(this.f60427k);
            u uVar = this.f60426j;
            if (TextUtils.isEmpty(strP)) {
                strP = this.f60425i;
            }
            uVar.d(strP);
            this.f60426j.b(this.f60422f);
            this.f60426j.b(this.f60418b.d());
            this.f60426j.c(this.f60418b.f());
            this.f60426j.e(this.f60418b.h());
            this.f60426j.f(this.f60418b.i());
            this.f60426j.g(this.f60418b.j());
            this.f60426j.j(this.f60418b.q());
            this.f60426j.l(this.f60418b.x());
            this.f60426j.a(this.f60418b.e());
            this.f60426j.d(this.f60418b.g());
            this.f60426j.a(this.f60418b.a());
            this.f60426j.c(this.f60418b.b());
            za zaVarM = this.f60426j.m();
            zaVarM.a((List) this.f60420d);
            zaVarM.a(this.f60421e);
            zaVarM.a(this.f60418b.m(), -1.0f);
            this.f60418b.a(this.f60426j);
            return;
        }
        gb.a("VastParser: Got VAST wrapper, but no vastAdTagUri");
    }

    public final void b(String str, String str2, b bVar) {
        if (bVar != null) {
            bVar.x().a(ya.a(str, str2));
        } else {
            this.f60420d.add(ya.a(str, str2));
        }
    }

    public final void a(XmlPullParser xmlPullParser, a aVar) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if ("CreativeExtension".equals(xmlPullParser.getName())) {
                    a(xmlPullParser, a("type", xmlPullParser), aVar);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public final void a(XmlPullParser xmlPullParser, String str, a aVar) {
        if ("adChoices".equals(str)) {
            gb.a("VastParser: Found adChoices for creative (id = " + aVar.f60428a + ")");
            aVar.a(a(k(xmlPullParser)));
            return;
        }
        if ("adDisclaimer".equals(str)) {
            gb.a("VastParser: Found adDisclaimer for creative (id = " + aVar.f60428a + ")");
            aVar.b(k(xmlPullParser));
            return;
        }
        if ("adAgeRestriction".equals(str)) {
            gb.a("VastParser: Found adAgeRestrictions for creative (id = " + aVar.f60428a + ")");
            aVar.c(k(xmlPullParser));
            return;
        }
        l(xmlPullParser);
    }

    public final void a(XmlPullParser xmlPullParser, String str) {
        final a aVar = new a(str);
        boolean z10 = false;
        int size = 0;
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("CreativeExtensions".equals(name)) {
                    a(xmlPullParser, aVar);
                } else {
                    s5 s5VarM0 = null;
                    String str2 = null;
                    if (com.taurusx.tax.f.y.f66052c.equals(name)) {
                        if (!this.f60424h) {
                            s5VarM0 = s5.m0();
                            s5VarM0.k(str != null ? str : "");
                        }
                        a(xmlPullParser, s5VarM0, a(com.taurusx.tax.f.s.f66023p, xmlPullParser));
                        if (s5VarM0 != null) {
                            if (s5VarM0.o() > 0.0f) {
                                if (s5VarM0.k0() != null) {
                                    this.f60423g.add(s5VarM0);
                                    z10 = true;
                                } else {
                                    a(s5VarM0.r(), "Required field", "VAST has no valid mediaData");
                                }
                            } else {
                                a(s5VarM0.r(), "Required field", "VAST has no valid Duration");
                            }
                        }
                    } else if (name != null && name.equals(com.taurusx.tax.f.y.f66051a)) {
                        String strA = a(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, xmlPullParser);
                        if (strA == null || "all".equals(strA) || "any".equals(strA) || "none".equals(strA)) {
                            str2 = strA;
                        } else {
                            a(str, "Bad value", "Wrong companion required attribute:" + strA);
                        }
                        int size2 = this.f60422f.size();
                        b(xmlPullParser, str, str2);
                        size = this.f60422f.size() - size2;
                        gb.a("VastParser: parsed " + size + " companion banners");
                    } else {
                        l(xmlPullParser);
                    }
                }
            }
        }
        a(z10, size, new l1() { // from class: k5.n1
            @Override // com.my.target.l1
            public final void a(Object obj) {
                this.f86095a.a(aVar, (com.my.target.b) obj);
            }
        });
    }

    public final void a(boolean z10, int i10, l1 l1Var) {
        if (z10) {
            l1Var.a((s5) this.f60423g.get(r1.size() - 1));
        } else {
            for (int size = this.f60422f.size() - i10; size < this.f60422f.size(); size++) {
                l1Var.a((k1) this.f60422f.get(size));
            }
        }
    }

    public final void a(b bVar, a aVar) {
        c cVar = aVar.f60429b;
        if (cVar != null) {
            bVar.a(cVar);
        }
        String str = aVar.f60430c;
        if (str != null) {
            bVar.i(str);
        }
        String str2 = aVar.f60431d;
        if (str2 != null) {
            bVar.b(str2);
        }
    }

    public final void a(XmlPullParser xmlPullParser, String str, String str2) {
        if (f(xmlPullParser) != 2) {
            return;
        }
        String name = xmlPullParser.getName();
        if (name != null && name.equals(com.taurusx.tax.f.y.f66058y)) {
            String strA = a("width", xmlPullParser);
            String strA2 = a("height", xmlPullParser);
            String strA3 = a("id", xmlPullParser);
            k1 k1VarV = k1.V();
            if (strA3 == null) {
                strA3 = "";
            }
            k1VarV.k(strA3);
            try {
                k1VarV.d(Integer.parseInt(strA));
                k1VarV.b(Integer.parseInt(strA2));
            } catch (Throwable unused) {
                a(str, "Bad value", "Unable  to convert required companion attributes, width = " + strA + " height = " + strA2);
            }
            k1VarV.x(str2);
            String strA4 = a("assetWidth", xmlPullParser);
            String strA5 = a("assetHeight", xmlPullParser);
            try {
                if (!TextUtils.isEmpty(strA4)) {
                    k1VarV.f(Integer.parseInt(strA4));
                }
                if (!TextUtils.isEmpty(strA5)) {
                    k1VarV.e(Integer.parseInt(strA5));
                }
            } catch (Throwable th2) {
                gb.a("VastParser: Wrong VAST asset dimensions - " + th2.getMessage());
            }
            String strA6 = a("expandedWidth", xmlPullParser);
            String strA7 = a("expandedHeight", xmlPullParser);
            try {
                if (!TextUtils.isEmpty(strA6)) {
                    k1VarV.h(Integer.parseInt(strA6));
                }
                if (!TextUtils.isEmpty(strA7)) {
                    k1VarV.g(Integer.parseInt(strA7));
                }
            } catch (Throwable th3) {
                gb.a("VastParser: Wrong VAST expanded dimensions " + th3.getMessage());
            }
            k1VarV.t(a(com.taurusx.tax.f.c.f65999g, xmlPullParser));
            k1VarV.u(a("apiFramework", xmlPullParser));
            this.f60422f.add(k1VarV);
            while (j(xmlPullParser) == 2) {
                String name2 = xmlPullParser.getName();
                if (VastResourceXmlManager.STATIC_RESOURCE.equals(name2)) {
                    k1VarV.y(lb.a(k(xmlPullParser)));
                } else if (VastResourceXmlManager.HTML_RESOURCE.equals(name2)) {
                    k1VarV.v(lb.a(k(xmlPullParser)));
                } else if (VastResourceXmlManager.IFRAME_RESOURCE.equals(name2)) {
                    k1VarV.w(lb.a(k(xmlPullParser)));
                } else if (com.taurusx.tax.f.c.f66001o.equals(name2)) {
                    String strK = k(xmlPullParser);
                    if (!TextUtils.isEmpty(strK)) {
                        k1VarV.q(a(strK));
                    }
                } else if (com.taurusx.tax.f.c.f66002s.equals(name2)) {
                    String strK2 = k(xmlPullParser);
                    if (!TextUtils.isEmpty(strK2)) {
                        k1VarV.x().a(ya.a("click", strK2));
                    }
                } else if ("TrackingEvents".equals(name2)) {
                    a(xmlPullParser, (b) k1VarV, true);
                } else {
                    l(xmlPullParser);
                }
            }
            return;
        }
        l(xmlPullParser);
    }

    public final void a(XmlPullParser xmlPullParser, s5 s5Var) {
        AudioData audioDataNewAudioData;
        int i10;
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if (com.taurusx.tax.f.s.f66021n.equals(xmlPullParser.getName())) {
                    String strA = a("type", xmlPullParser);
                    String strA2 = a(com.taurusx.tax.f.a.f65992s, xmlPullParser);
                    String strA3 = a(k(xmlPullParser));
                    if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA3) || !strA.toLowerCase(Locale.ROOT).trim().startsWith("audio")) {
                        audioDataNewAudioData = null;
                    } else if (strA2 != null) {
                        try {
                            i10 = Integer.parseInt(strA2);
                        } catch (Throwable unused) {
                            i10 = 0;
                        }
                        audioDataNewAudioData = AudioData.newAudioData(strA3);
                        audioDataNewAudioData.setBitrate(i10);
                    } else {
                        i10 = 0;
                        audioDataNewAudioData = AudioData.newAudioData(strA3);
                        audioDataNewAudioData.setBitrate(i10);
                    }
                    if (audioDataNewAudioData == null) {
                        gb.a("VastParser: Skipping unsupported VAST file (mimetype=" + strA + ",url=" + strA3);
                    } else {
                        s5Var.a(audioDataNewAudioData);
                    }
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public final void a(XmlPullParser xmlPullParser, b bVar, boolean z10) {
        while (j(xmlPullParser) == 2) {
            if (f(xmlPullParser) == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String strA = a("event", xmlPullParser);
                    String strA2 = a("offset", xmlPullParser);
                    if (strA != null) {
                        if ("progress".equals(strA) && !TextUtils.isEmpty(strA2)) {
                            if (strA2.endsWith("%")) {
                                try {
                                    a(Integer.parseInt(strA2.replace("%", "")), k(xmlPullParser), bVar);
                                } catch (Throwable unused) {
                                    gb.a("VastParser: Unable to parse progress stat with value " + strA2);
                                }
                            } else {
                                a(strA2, k(xmlPullParser), bVar);
                            }
                        } else {
                            a(strA, k(xmlPullParser), bVar, z10);
                        }
                    }
                    gb.a("VastParser: Added VAST tracking \"" + strA + "\"");
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }

    public final void a(String str, String str2, b bVar) {
        float fB;
        try {
            fB = b(str);
        } catch (Throwable unused) {
            fB = -1.0f;
        }
        if (fB >= 0.0f) {
            w8 w8VarA = w8.a(str2);
            w8VarA.b(fB);
            if (bVar != null) {
                bVar.x().a(w8VarA);
                return;
            } else {
                this.f60420d.add(w8VarA);
                return;
            }
        }
        gb.a("VastParser: Unable to parse progress stat with value " + str);
    }

    public final void a(float f10, String str, b bVar) {
        w8 w8VarA = w8.a(str);
        if (bVar != null && bVar.o() > 0.0f) {
            w8VarA.b(bVar.o() * (f10 / 100.0f));
            bVar.x().a(w8VarA);
        } else {
            w8VarA.a(f10);
            this.f60421e.add(w8VarA);
        }
    }

    public final void a(String str, String str2, b bVar, boolean z10) {
        if ("start".equalsIgnoreCase(str)) {
            b(z10 ? C4424m2.f43623v : "playbackStarted", str2, bVar);
            return;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            a(25.0f, str2, bVar);
            return;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            a(50.0f, str2, bVar);
            return;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            a(75.0f, str2, bVar);
            return;
        }
        if ("complete".equalsIgnoreCase(str)) {
            a(100.0f, str2, bVar);
            return;
        }
        if ("creativeView".equalsIgnoreCase(str)) {
            b(z10 ? C4424m2.f43623v : "playbackStarted", str2, bVar);
            return;
        }
        if ("mute".equalsIgnoreCase(str)) {
            b("volumeOff", str2, bVar);
            return;
        }
        if ("unmute".equalsIgnoreCase(str)) {
            b("volumeOn", str2, bVar);
            return;
        }
        if ("pause".equalsIgnoreCase(str)) {
            b("playbackPaused", str2, bVar);
            return;
        }
        if ("resume".equalsIgnoreCase(str)) {
            b("playbackResumed", str2, bVar);
            return;
        }
        if ("fullscreen".equalsIgnoreCase(str)) {
            b("fullscreenOn", str2, bVar);
            return;
        }
        if ("exitFullscreen".equalsIgnoreCase(str)) {
            b("fullscreenOff", str2, bVar);
            return;
        }
        if ("skip".equalsIgnoreCase(str)) {
            b("closedByUser", str2, bVar);
            return;
        }
        if ("error".equalsIgnoreCase(str)) {
            b("error", str2, bVar);
            return;
        }
        if (com.taurusx.tax.f.s.f66026s.equalsIgnoreCase(str)) {
            b("click", str2, bVar);
        } else if ("close".equalsIgnoreCase(str)) {
            b("closedByUser", str2, bVar);
        } else if ("closeLinear".equalsIgnoreCase(str)) {
            b("closedByUser", str2, bVar);
        }
    }

    public final void a(XmlPullParser xmlPullParser, s5 s5Var, String str) {
        while (j(xmlPullParser) == 2) {
            String name = xmlPullParser.getName();
            if (f(xmlPullParser) == 2) {
                if ("Duration".equals(name)) {
                    if (s5Var == null) {
                        continue;
                    } else if (!b(xmlPullParser, s5Var)) {
                        return;
                    } else {
                        a(s5Var, str);
                    }
                } else if ("TrackingEvents".equals(name)) {
                    a(xmlPullParser, (b) s5Var, false);
                } else if (com.taurusx.tax.f.s.f66008a.equals(name)) {
                    if (s5Var == null) {
                        continue;
                    } else {
                        c(xmlPullParser, s5Var);
                        if (s5Var.k0() == null) {
                            gb.a("VastParser: Unable to find valid mediafile!");
                            return;
                        }
                    }
                } else if (com.taurusx.tax.f.s.f66032y.equals(name)) {
                    d(xmlPullParser, s5Var);
                } else {
                    l(xmlPullParser);
                }
            }
        }
    }
}
