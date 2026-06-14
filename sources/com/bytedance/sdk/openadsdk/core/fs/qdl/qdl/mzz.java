package com.bytedance.sdk.openadsdk.core.fs.qdl.qdl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.fs.lnr.qdl;
import com.bytedance.sdk.openadsdk.core.fs.qdl.ud;
import com.bytedance.sdk.openadsdk.core.fs.ud.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.taurusx.tax.f.t;
import com.taurusx.tax.f.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class mzz extends com.bytedance.sdk.openadsdk.core.fs.qdl.ud {

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public static final String f17235wd = null;

    public mzz(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    private void lnr(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl((ljh) null, (List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr>) Collections.singletonList(new lnr.qdl(str).qdl()), this.qdl > 0 ? com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.UNDEFINED_ERROR, -1L, (String) null, (String) null), (lnr.ud) null);
    }

    public static int ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.fs.qdl.ud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.core.fs.qdl qdl(java.lang.String r5, java.io.File r6, java.util.List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            r4.mzz = r0
            android.content.Context r1 = r4.f17238ud
            r2 = 0
            if (r1 != 0) goto Lc
            r5 = -1
            r4.mzz = r5
            return r2
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L18
            if (r6 != 0) goto L18
            r5 = -2
            r4.mzz = r5
            return r2
        L18:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            java.lang.String r3 = "UTF-8"
            if (r1 != 0) goto L2c
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            byte[] r5 = r5.getBytes(r3)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            goto L32
        L2a:
            r5 = move-exception
            goto L5c
        L2c:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r6 = r5
        L32:
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r5.setFeature(r1, r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r5.setInput(r6, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r5.nextTag()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            com.bytedance.sdk.openadsdk.core.fs.qdl r5 = r4.qdl(r5, r7)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r4.qdl(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r6.close()     // Catch: java.io.IOException -> L4b
        L4b:
            return r5
        L4c:
            r5 = move-exception
            r2 = r6
            goto L5c
        L4f:
            r6 = r2
        L50:
            r5 = -3
            r4.mzz = r5     // Catch: java.lang.Throwable -> L4c
            r4.qdl(r2)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L5b
            r6.close()     // Catch: java.io.IOException -> L5b
        L5b:
            return r2
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L61
        L61:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz.qdl(java.lang.String, java.io.File, java.util.List):com.bytedance.sdk.openadsdk.core.fs.qdl");
    }

    static class qdl {
        qdl.ud lnr;
        String mml;
        String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        qdl.EnumC0258qdl f17236ud;
        final List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mzz = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mo = new ArrayList();

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        float f17237wd = Float.MIN_VALUE;

        public qdl() {
        }

        public void qdl(String str, qdl.EnumC0258qdl enumC0258qdl, qdl.ud udVar) {
            this.qdl = str;
            this.f17236ud = enumC0258qdl;
            this.lnr = udVar;
        }

        public void ud(String str) {
            this.mo.add(new lnr.qdl(str).qdl());
        }

        public void qdl(String str) {
            this.mzz.add(new lnr.qdl(str).qdl());
        }

        public qdl(String str, qdl.EnumC0258qdl enumC0258qdl, qdl.ud udVar) {
            qdl(str, enumC0258qdl, udVar);
        }
    }

    public static String ud(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = f17235wd;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e1, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:116)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10, types: [com.bytedance.sdk.openadsdk.core.fs.qdl] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz, com.bytedance.sdk.openadsdk.core.fs.qdl.ud] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.fs.qdl ud(org.xmlpull.v1.XmlPullParser r19, java.util.List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz.ud(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.fs.qdl");
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) {
        if (this.mo == null) {
            this.mo = new ud.qdl();
        }
        ud.qdl qdlVar2 = this.mo;
        qdlVar2.qdl = this.mzz;
        qdlVar2.f17239ud = this.qdl;
        if (qdlVar != null) {
            qdlVar2.lnr = qdlVar.qdl().f17219ud.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.fs.qdl qdl(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list3;
        xmlPullParser.require(2, f17235wd, "VAST");
        boolean z10 = false;
        String strUd = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strUd = ud(xmlPullParser, name);
                } else {
                    if (t.f66040o.equals(name)) {
                        if (qdl(xmlPullParser.getAttributeValue(f17235wd, w.f66047c))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && t.f66040o.equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z10 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if (w.f66048w.equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarQdl = ud.qdl(this.f17238ud, xmlPullParser3, list3, this.lnr, this.mml);
                                        if (qdlVarQdl != null) {
                                            if (!TextUtils.isEmpty(qdlVarQdl.wd())) {
                                                return qdlVarQdl;
                                            }
                                            this.mzz = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if (w.f66049y.equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarUd = ud(xmlPullParser3, list3);
                                            if (qdlVarUd != null) {
                                                return qdlVarUd;
                                            }
                                        } else {
                                            qdl(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            qdl(xmlPullParser);
                            z10 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        qdl(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z10) {
            this.mzz = -4;
            lnr(strUd);
        }
        if (this.mzz == 0) {
            this.mzz = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return qdl(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(XmlPullParser xmlPullParser, String str, boolean z10) throws XmlPullParserException, IOException {
        return qdl(ud(xmlPullParser, str), z10);
    }

    public static void qdl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void qdl(XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new lnr.qdl(str).qdl(z10).qdl());
    }
}
