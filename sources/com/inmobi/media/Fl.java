package com.inmobi.media;

import android.text.TextUtils;
import com.inmobi.media.Fl;
import com.inmobi.media.core.config.models.AdConfig;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
public final class Fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f36873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3915nl f36874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3903n9 f36875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f36879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f36880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f36881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f36882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f36883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f36884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f36885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f36886n;

    public Fl(AdConfig.VastVideoConfig vastVideoConfig, C3915nl vastEventProcessor, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        Intrinsics.checkNotNullParameter(vastEventProcessor, "vastEventProcessor");
        this.f36873a = vastVideoConfig;
        this.f36874b = vastEventProcessor;
        this.f36875c = c3903n9;
        this.f36878f = "";
        this.f36879g = "";
        this.f36880h = new ArrayList();
        this.f36881i = new ArrayList();
        this.f36882j = "";
        this.f36883k = "";
        this.f36884l = new ArrayList();
        this.f36885m = new ArrayList();
        this.f36886n = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.Fl r6, org.xmlpull.v1.XmlPullParser r7, kotlin.coroutines.jvm.internal.d r8) throws com.inmobi.media.C4064tl {
        /*
            java.lang.String r0 = "video"
            r6.getClass()
            boolean r1 = r8 instanceof com.inmobi.media.C4139wl
            if (r1 == 0) goto L18
            r1 = r8
            com.inmobi.media.wl r1 = (com.inmobi.media.C4139wl) r1
            int r2 = r1.f39877d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f39877d = r2
            goto L1d
        L18:
            com.inmobi.media.wl r1 = new com.inmobi.media.wl
            r1.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r1.f39875b
            java.lang.Object r2 = pf.b.g()
            int r3 = r1.f39877d
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            kotlin.jvm.internal.Ref$BooleanRef r6 = r1.f39874a
            kotlin.d.b(r8)
            goto L66
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.d.b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            r3 = 0
            java.lang.String r5 = "adType"
            java.lang.String r5 = r7.getAttributeValue(r3, r5)     // Catch: java.lang.Exception -> L4c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4c
            goto L4d
        L4c:
            r5 = r0
        L4d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L75
            com.inmobi.media.xl r0 = new com.inmobi.media.xl
            r0.<init>(r6, r3, r8, r7)
            r1.f39874a = r8
            r1.f39877d = r4
            java.lang.String r3 = "Ad"
            java.lang.Object r6 = r6.a(r7, r3, r0, r1)
            if (r6 != r2) goto L65
            goto L6c
        L65:
            r6 = r8
        L66:
            boolean r6 = r6.f93279b
            if (r6 == 0) goto L6d
            kotlin.Unit r2 = kotlin.Unit.f93236a
        L6c:
            return r2
        L6d:
            com.inmobi.media.tl r6 = new com.inmobi.media.tl
            r7 = 1101(0x44d, float:1.543E-42)
            r6.<init>(r7)
            throw r6
        L75:
            com.inmobi.media.tl r6 = new com.inmobi.media.tl
            r7 = 1125(0x465, float:1.576E-42)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(com.inmobi.media.Fl, org.xmlpull.v1.XmlPullParser, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.inmobi.media.Fl r10, org.xmlpull.v1.XmlPullParser r11, kotlin.coroutines.jvm.internal.d r12) throws com.inmobi.media.C4064tl {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof com.inmobi.media.Al
            if (r0 == 0) goto L16
            r0 = r12
            com.inmobi.media.Al r0 = (com.inmobi.media.Al) r0
            int r1 = r0.f36587e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f36587e = r1
            goto L1b
        L16:
            com.inmobi.media.Al r0 = new com.inmobi.media.Al
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f36585c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36587e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.jvm.internal.Ref$BooleanRef r10 = r0.f36584b
            kotlin.jvm.internal.Ref$BooleanRef r11 = r0.f36583a
            kotlin.d.b(r12)
            goto L5e
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            kotlin.d.b(r12)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            com.inmobi.media.Bl r4 = new com.inmobi.media.Bl
            r9 = 0
            r6 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f36583a = r8
            r0.f36584b = r7
            r0.f36587e = r3
            java.lang.String r10 = "VAST"
            java.lang.Object r10 = r6.a(r5, r10, r4, r0)
            if (r10 != r1) goto L5c
            return r1
        L5c:
            r10 = r7
            r11 = r8
        L5e:
            boolean r11 = r11.f93279b
            if (r11 == 0) goto L65
            kotlin.Unit r10 = kotlin.Unit.f93236a
            return r10
        L65:
            boolean r10 = r10.f93279b
            if (r10 == 0) goto L71
            com.inmobi.media.tl r10 = new com.inmobi.media.tl
            r11 = 1124(0x464, float:1.575E-42)
            r10.<init>(r11)
            throw r10
        L71:
            com.inmobi.media.tl r10 = new com.inmobi.media.tl
            r11 = 1102(0x44e, float:1.544E-42)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.b(com.inmobi.media.Fl, org.xmlpull.v1.XmlPullParser, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.inmobi.media.Fl r5, org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.jvm.internal.d r7) throws com.inmobi.media.C4064tl {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.inmobi.media.Dl
            if (r0 == 0) goto L16
            r0 = r7
            com.inmobi.media.Dl r0 = (com.inmobi.media.Dl) r0
            int r1 = r0.f36753d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f36753d = r1
            goto L1b
        L16:
            com.inmobi.media.Dl r0 = new com.inmobi.media.Dl
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f36751b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36753d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.jvm.internal.Ref$BooleanRef r5 = r0.f36750a
            kotlin.d.b(r7)
            goto L5f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.d.b(r7)
            int r7 = r5.f36876d
            int r7 = r7 + r3
            r5.f36876d = r7
            com.inmobi.media.core.config.models.AdConfig$VastVideoConfig r2 = r5.f36873a
            int r2 = r2.getMaxWrapperLimit()
            if (r7 > r2) goto L6e
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            com.inmobi.media.El r2 = new com.inmobi.media.El
            r4 = 0
            r2.<init>(r5, r4, r7, r6)
            r0.f36750a = r7
            r0.f36753d = r3
            java.lang.String r3 = "Wrapper"
            java.lang.Object r5 = r5.a(r6, r3, r2, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            r5 = r7
        L5f:
            boolean r5 = r5.f93279b
            if (r5 == 0) goto L66
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        L66:
            com.inmobi.media.tl r5 = new com.inmobi.media.tl
            r6 = 1121(0x461, float:1.571E-42)
            r5.<init>(r6)
            throw r5
        L6e:
            com.inmobi.media.tl r5 = new com.inmobi.media.tl
            r6 = 1107(0x453, float:1.551E-42)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.c(com.inmobi.media.Fl, org.xmlpull.v1.XmlPullParser, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final Unit d(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, com.taurusx.tax.f.c.f66002s)) {
            String strB = AbstractC3940ol.b(fl.v(xmlPullParser));
            if (!AbstractC3940ol.a(strB)) {
                strB = null;
            }
            C4107ve c4107ve = strB != null ? new C4107ve(strB, "click") : null;
            if (c4107ve != null) {
                fl.f36885m.add(c4107ve);
            }
        } else if (Intrinsics.areEqual(name, "TrackingEvents")) {
            fl.f36885m.addAll(fl.o(xmlPullParser));
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    public static final Unit e(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.taurusx.tax.f.y.f66058y)) {
            fl.q(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    public static final Unit h(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, "TrackingEvents")) {
            fl.f36881i.addAll(fl.o(xmlPullParser));
        } else if (Intrinsics.areEqual(name, com.taurusx.tax.f.s.f66032y)) {
            fl.a(xmlPullParser, false);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public final void f(XmlPullParser xmlPullParser) {
        String strB = AbstractC3940ol.b(v(xmlPullParser));
        if (strB.length() != 0) {
            if (!AbstractC3940ol.a(strB)) {
                strB = null;
            }
            if (strB == null) {
                return;
            }
            this.f36881i.add(new C4107ve(strB, com.taurusx.tax.f.y.f66057w));
            return;
        }
        C3903n9 c3903n9 = this.f36875c;
        if (c3903n9 != null) {
            c3903n9.b("VastParser", "Vast Tracker Error: " + com.taurusx.tax.f.y.f66057w);
        }
    }

    public final void g(final XmlPullParser xmlPullParser) throws C4064tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, com.taurusx.tax.f.w.f66048w, new Function0() { // from class: w3.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef);
            }
        });
        if (!ref$BooleanRef.f93279b) {
            throw new C4064tl((short) 1122);
        }
    }

    public final void i(final XmlPullParser xmlPullParser) {
        final kotlin.jvm.internal.t0 t0Var = new kotlin.jvm.internal.t0();
        a(xmlPullParser, com.taurusx.tax.f.y.f66051a, new Function0() { // from class: w3.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, t0Var);
            }
        });
        if (this.f36886n.size() != 0) {
            if (this.f36877e) {
                C3903n9 c3903n9 = this.f36875c;
                if (c3903n9 != null) {
                    c3903n9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                Map mapA = AbstractC3789ik.a(this.f36874b.f39117a);
                mapA.put("errorCode", (short) 1152);
                Wj wj = Wj.f37959a;
                Wj.b("VastParseEvent", mapA, EnumC3585ak.f38215a);
                return;
            }
            return;
        }
        if (this.f36877e) {
            HashMap map = new HashMap();
            map.put(com.taurusx.tax.n.z.f66398w, String.valueOf(604));
            map.put("[ADSERVINGID]", this.f36879g);
            map.put("[UNIVERSALADID]", this.f36878f);
            C3915nl.a(map, this.f36881i, this.f36875c);
            Map mapA2 = AbstractC3789ik.a(this.f36874b.f39117a);
            mapA2.put("errorCode", (short) 1150);
            Wj wj2 = Wj.f37959a;
            Wj.b("VastParseEvent", mapA2, EnumC3585ak.f38215a);
            return;
        }
        if (t0Var.f93331b > 0) {
            HashMap map2 = new HashMap();
            map2.put(com.taurusx.tax.n.z.f66398w, String.valueOf(600));
            map2.put("[ADSERVINGID]", this.f36879g);
            map2.put("[UNIVERSALADID]", this.f36878f);
            C3915nl.a(map2, this.f36881i, this.f36875c);
            Map mapA3 = AbstractC3789ik.a(this.f36874b.f39117a);
            mapA3.put("errorCode", (short) 1151);
            Wj wj3 = Wj.f37959a;
            Wj.b("VastParseEvent", mapA3, EnumC3585ak.f38215a);
        }
    }

    public final boolean j(final XmlPullParser xmlPullParser) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, com.taurusx.tax.f.y.f66055s, new Function0() { // from class: w3.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.b(xmlPullParser, this, ref$BooleanRef);
            }
        });
        return ref$BooleanRef.f93279b;
    }

    public final void k(final XmlPullParser xmlPullParser) throws C4064tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, com.taurusx.tax.f.y.f66054o, new Function0() { // from class: w3.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, ref$BooleanRef, this, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.f93279b) {
            throw new C4064tl((short) 1112);
        }
        if (!ref$BooleanRef2.f93279b) {
            throw new C4064tl((short) 1111);
        }
    }

    public final void l(final XmlPullParser xmlPullParser) throws C4064tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, com.taurusx.tax.f.y.f66052c, new Function0() { // from class: w3.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.f93279b) {
            throw new C4064tl((short) 1116);
        }
        if (!ref$BooleanRef2.f93279b) {
            throw new C4064tl((short) 1117);
        }
    }

    public final ArrayList m(final XmlPullParser xmlPullParser) throws C4064tl {
        final ArrayList arrayList = new ArrayList();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, com.taurusx.tax.f.s.f66008a, new Function0() { // from class: w3.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef2, ref$BooleanRef, arrayList);
            }
        });
        if (!ref$BooleanRef2.f93279b) {
            throw new C4064tl((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new C4064tl((short) 1119);
        }
        if (ref$BooleanRef.f93279b) {
            Map mapA = AbstractC3789ik.a(this.f36874b.f39117a);
            mapA.put("errorCode", (short) 1153);
            Wj wj = Wj.f37959a;
            Wj.b("VastParseEvent", mapA, EnumC3585ak.f38215a);
        }
        return arrayList;
    }

    public final int n(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            C3903n9 c3903n9 = this.f36875c;
            if (c3903n9 == null) {
                return -1;
            }
            c3903n9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            C3903n9 c3903n92 = this.f36875c;
            if (c3903n92 == null) {
                return -1;
            }
            c3903n92.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final ArrayList o(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "TrackingEvents", new Function0() { // from class: w3.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, arrayList);
            }
        });
        return arrayList;
    }

    public final void p(final XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, com.taurusx.tax.f.z.f66061c);
        if (attributeValue == null) {
            C3903n9 c3903n9 = this.f36875c;
            if (c3903n9 != null) {
                c3903n9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = "";
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, com.taurusx.tax.f.z.f66070y, new Function0() { // from class: w3.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, ref$BooleanRef, this, ref$ObjectRef, ref$ObjectRef2, arrayList);
            }
        });
        if (!ref$BooleanRef.f93279b) {
            HashMap map = new HashMap();
            map.put("[REASON]", String.valueOf(2));
            map.put("[ADSERVINGID]", this.f36879g);
            map.put("[UNIVERSALADID]", this.f36878f);
            C3915nl.a(map, arrayList, this.f36875c);
            return;
        }
        if (!AbstractC3940ol.a((String) ref$ObjectRef.f93280b)) {
            HashMap map2 = new HashMap();
            map2.put("[REASON]", String.valueOf(3));
            map2.put("[ADSERVINGID]", this.f36879g);
            map2.put("[UNIVERSALADID]", this.f36878f);
            C3915nl.a(map2, arrayList, this.f36875c);
            return;
        }
        this.f36881i.add(new C4208zf(attributeValue, (String) ref$ObjectRef2.f93280b, (String) ref$ObjectRef.f93280b));
        C3903n9 c3903n92 = this.f36875c;
        if (c3903n92 != null) {
            c3903n92.a("VastParser", "OMID ADVerification URL : " + ref$ObjectRef.f93280b);
        }
    }

    public final void q(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.taurusx.tax.f.y.f66058y, new Function0() { // from class: w3.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.d(xmlPullParser, this);
            }
        });
    }

    public final void r(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.taurusx.tax.f.y.f66051a, new Function0() { // from class: w3.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.e(xmlPullParser, this);
            }
        });
    }

    public final void s(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.taurusx.tax.f.y.f66055s, new Function0() { // from class: w3.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.f(xmlPullParser, this);
            }
        });
    }

    public final void t(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.taurusx.tax.f.y.f66054o, new Function0() { // from class: w3.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.g(xmlPullParser, this);
            }
        });
    }

    public final void u(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.taurusx.tax.f.y.f66052c, new Function0() { // from class: w3.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.h(xmlPullParser, this);
            }
        });
    }

    public final String v(XmlPullParser xmlPullParser) {
        String text;
        int iN = n(xmlPullParser);
        if ((iN == 4 || iN == 5) && (text = xmlPullParser.getText()) != null && F3.a(text)) {
            return text;
        }
        return null;
    }

    public static final Unit g(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.taurusx.tax.f.y.f66055s)) {
            fl.s(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    public static final Unit f(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, com.taurusx.tax.f.y.f66052c)) {
            fl.u(xmlPullParser);
        } else if (Intrinsics.areEqual(name, com.taurusx.tax.f.y.f66051a)) {
            fl.r(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    public final void e(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.taurusx.tax.f.y.f66056t, new Function0() { // from class: w3.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.c(xmlPullParser, this);
            }
        });
    }

    public final void h(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        a(xmlPullParser, com.taurusx.tax.f.y.f66058y, new Function0() { // from class: w3.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, arrayList, ref$ObjectRef, arrayList2);
            }
        });
        if (arrayList.isEmpty()) {
            C3903n9 c3903n9 = this.f36875c;
            if (c3903n9 != null) {
                c3903n9.b("VastParser", "VAST Companion Error: No Companion resources found");
                return;
            }
            return;
        }
        this.f36886n.add(new C3890ml(arrayList, arrayList2, this.f36885m));
    }

    public final void d(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastExtensionParentXmlManager.f66980w, new Function0() { // from class: w3.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.b(xmlPullParser, this);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit b(org.xmlpull.v1.XmlPullParser r3, com.inmobi.media.Fl r4, kotlin.jvm.internal.Ref$BooleanRef r5) throws org.xmlpull.v1.XmlPullParserException, com.inmobi.media.C4064tl, java.io.IOException {
        /*
            java.lang.String r0 = r3.getName()
            if (r0 == 0) goto L4b
            int r1 = r0.hashCode()
            r2 = -2018804923(0xffffffff87ab7b45, float:-2.5801672E-34)
            if (r1 == r2) goto L3b
            r5 = 1150879268(0x44990624, float:1224.1919)
            if (r1 == r5) goto L2e
            r5 = 1539775849(0x5bc71d69, float:1.12091714E17)
            if (r1 == r5) goto L1a
            goto L4b
        L1a:
            java.lang.String r5 = "UniversalAdId"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L23
            goto L4b
        L23:
            java.lang.String r3 = r4.v(r3)
            if (r3 != 0) goto L2b
            java.lang.String r3 = ""
        L2b:
            r4.f36878f = r3
            goto L51
        L2e:
            java.lang.String r5 = "CompanionAds"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L37
            goto L4b
        L37:
            r4.i(r3)
            goto L51
        L3b:
            java.lang.String r1 = "Linear"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L4b
        L44:
            r0 = 1
            r5.f93279b = r0
            r4.l(r3)
            goto L51
        L4b:
            r4.getClass()
            w(r3)
        L51:
            kotlin.Unit r3 = kotlin.Unit.f93236a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.b(org.xmlpull.v1.XmlPullParser, com.inmobi.media.Fl, kotlin.jvm.internal.Ref$BooleanRef):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.inmobi.media.Fl] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r13, java.util.ArrayList r14, kotlin.coroutines.jvm.internal.d r15) throws com.inmobi.media.C4064tl {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(java.lang.String, java.util.ArrayList, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void c(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.taurusx.tax.f.z.f66069w, new Function0() { // from class: w3.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, this);
            }
        });
    }

    public static final Unit c(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        String attributeValue;
        if (Intrinsics.areEqual(xmlPullParser.getName(), VastExtensionParentXmlManager.f66980w)) {
            try {
                attributeValue = xmlPullParser.getAttributeValue(null, "type");
            } catch (Exception unused) {
                attributeValue = "";
            }
            if (Intrinsics.areEqual(attributeValue, com.taurusx.tax.f.z.f66069w)) {
                fl.d(xmlPullParser);
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    public final C4107ve b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        String strB = AbstractC3940ol.b(v(xmlPullParser));
        if (!AbstractC3940ol.a(strB)) {
            return null;
        }
        if (Intrinsics.areEqual(attributeValue, "progress")) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (!new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").g(attributeValue2) && !new Regex("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").g(attributeValue2)) {
                C3903n9 c3903n9 = this.f36875c;
                if (c3903n9 != null) {
                    c3903n9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
                }
            } else {
                return new O5(strB, attributeValue2);
            }
        } else {
            if (Gl.f36960a.contains(attributeValue)) {
                Intrinsics.checkNotNull(attributeValue);
                return new C4107ve(strB, attributeValue);
            }
            C3903n9 c3903n92 = this.f36875c;
            if (c3903n92 != null) {
                c3903n92.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    public static final Unit b(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.taurusx.tax.f.z.f66069w)) {
            fl.c(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.d r8) throws com.inmobi.media.C4064tl {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser r6, kotlin.coroutines.jvm.internal.d r7) throws com.inmobi.media.C4064tl {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.C4189yl
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.yl r0 = (com.inmobi.media.C4189yl) r0
            int r1 = r0.f40019d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40019d = r1
            goto L18
        L13:
            com.inmobi.media.yl r0 = new com.inmobi.media.yl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40017b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f40019d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$BooleanRef r6 = r0.f40016a
            kotlin.d.b(r7)
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.d.b(r7)
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            com.inmobi.media.zl r2 = new com.inmobi.media.zl
            r4 = 0
            r2.<init>(r5, r4, r7, r6)
            r0.f40016a = r7
            r0.f40019d = r3
            java.lang.String r3 = "VAST"
            java.lang.Object r6 = r5.a(r6, r3, r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            boolean r6 = r6.f93279b
            if (r6 == 0) goto L56
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L56:
            com.inmobi.media.tl r6 = new com.inmobi.media.tl
            r7 = 1103(0x44f, float:1.546E-42)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser r2, com.inmobi.media.Fl r3, kotlin.jvm.internal.Ref$BooleanRef r4) throws org.xmlpull.v1.XmlPullParserException, com.inmobi.media.C4064tl, java.io.IOException {
        /*
            java.lang.String r0 = r2.getName()
            if (r0 == 0) goto L71
            int r1 = r0.hashCode()
            switch(r1) {
                case -2077435339: goto L64;
                case -1692490108: goto L54;
                case -1499090620: goto L40;
                case 67232232: goto L29;
                case 184043572: goto L1c;
                case 2114088489: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L71
        Lf:
            java.lang.String r4 = "Impression"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L18
            goto L71
        L18:
            r3.f(r2)
            goto L77
        L1c:
            java.lang.String r4 = "Extensions"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L25
            goto L71
        L25:
            r3.e(r2)
            goto L77
        L29:
            java.lang.String r4 = "Error"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L32
            goto L71
        L32:
            java.lang.String r4 = "error"
            com.inmobi.media.ve r2 = r3.a(r4, r2)
            if (r2 == 0) goto L77
            java.util.ArrayList r3 = r3.f36881i
            r3.add(r2)
            goto L77
        L40:
            java.lang.String r4 = "AdServingId"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L49
            goto L71
        L49:
            java.lang.String r2 = r3.v(r2)
            if (r2 != 0) goto L51
            java.lang.String r2 = ""
        L51:
            r3.f36879g = r2
            goto L77
        L54:
            java.lang.String r1 = "Creatives"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L71
        L5d:
            r0 = 1
            r4.f93279b = r0
            r3.k(r2)
            goto L77
        L64:
            java.lang.String r4 = "AdVerifications"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L6d
            goto L71
        L6d:
            r3.c(r2)
            goto L77
        L71:
            r3.getClass()
            w(r2)
        L77:
            kotlin.Unit r2 = kotlin.Unit.f93236a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, com.inmobi.media.Fl, kotlin.jvm.internal.Ref$BooleanRef):kotlin.Unit");
    }

    public static final Unit a(XmlPullParser xmlPullParser, Ref$BooleanRef ref$BooleanRef, Fl fl, Ref$BooleanRef ref$BooleanRef2) throws XmlPullParserException, IOException {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.taurusx.tax.f.y.f66055s)) {
            ref$BooleanRef.f93279b = true;
            if (fl.j(xmlPullParser)) {
                ref$BooleanRef2.f93279b = true;
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser r4, com.inmobi.media.Fl r5, kotlin.jvm.internal.Ref$BooleanRef r6, kotlin.jvm.internal.Ref$BooleanRef r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = r4.getName()
            if (r0 == 0) goto L67
            int r1 = r0.hashCode()
            r2 = -2049897434(0xffffffff85d10c26, float:-1.9658728E-35)
            r3 = 1
            if (r1 == r2) goto L5a
            r2 = -1927368268(0xffffffff8d1eb1b4, float:-4.890141E-31)
            if (r1 == r2) goto L48
            r6 = -385055469(0xffffffffe90c8513, float:-1.0617377E25)
            if (r1 == r6) goto L33
            r6 = 611554000(0x247392d0, float:5.281658E-17)
            if (r1 == r6) goto L20
            goto L67
        L20:
            java.lang.String r6 = "TrackingEvents"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L29
            goto L67
        L29:
            java.util.ArrayList r6 = r5.f36881i
            java.util.ArrayList r4 = r5.o(r4)
            r6.addAll(r4)
            goto L6d
        L33:
            java.lang.String r6 = "MediaFiles"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L3c
            goto L67
        L3c:
            r7.f93279b = r3
            java.util.ArrayList r6 = r5.f36884l
            java.util.ArrayList r4 = r5.m(r4)
            r6.addAll(r4)
            goto L6d
        L48:
            java.lang.String r7 = "Duration"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L51
            goto L67
        L51:
            java.lang.String r4 = r5.a(r4)
            r5.f36883k = r4
            r6.f93279b = r3
            goto L6d
        L5a:
            java.lang.String r6 = "VideoClicks"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L63
            goto L67
        L63:
            r5.a(r4, r3)
            goto L6d
        L67:
            r5.getClass()
            w(r4)
        L6d:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, com.inmobi.media.Fl, kotlin.jvm.internal.Ref$BooleanRef, kotlin.jvm.internal.Ref$BooleanRef):kotlin.Unit");
    }

    public final String a(XmlPullParser xmlPullParser) throws XmlPullParserException, C4064tl {
        String strV = v(xmlPullParser);
        if (strV != null) {
            if (TextUtils.isEmpty(strV) ? false : new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").g(strV)) {
                return strV;
            }
        }
        C3903n9 c3903n9 = this.f36875c;
        if (c3903n9 != null) {
            c3903n9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new C4064tl((short) 1115);
    }

    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, kotlin.jvm.internal.t0 t0Var) throws XmlPullParserException, IOException {
        int i10;
        if (!Intrinsics.areEqual(xmlPullParser.getName(), com.taurusx.tax.f.y.f66058y)) {
            fl.getClass();
            w(xmlPullParser);
            return Unit.f93236a;
        }
        t0Var.f93331b++;
        int i11 = 0;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            Intrinsics.checkNotNullExpressionValue(attributeValue, "getAttributeValue(...)");
            i10 = Integer.parseInt(attributeValue);
        } catch (Exception unused) {
            C3903n9 c3903n9 = fl.f36875c;
            if (c3903n9 != null) {
                c3903n9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i10 = 0;
        }
        try {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            Intrinsics.checkNotNullExpressionValue(attributeValue2, "getAttributeValue(...)");
            i11 = Integer.parseInt(attributeValue2);
        } catch (Exception unused2) {
            C3903n9 c3903n92 = fl.f36875c;
            if (c3903n92 != null) {
                c3903n92.b("VastParser", "Invalid height encountered for a companion and ignoring that.");
            }
        }
        if (i10 > 0 && i11 > 0) {
            fl.h(xmlPullParser);
            return Unit.f93236a;
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser r3, com.inmobi.media.Fl r4, java.util.List r5, kotlin.jvm.internal.Ref$ObjectRef r6, java.util.List r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = r3.getName()
            if (r0 == 0) goto La2
            int r1 = r0.hashCode()
            r2 = -348198615(0xffffffffeb3ee929, float:-2.3079697E26)
            if (r1 == r2) goto L69
            r6 = 611554000(0x247392d0, float:5.281658E-17)
            if (r1 == r6) goto L58
            r6 = 676623548(0x285474bc, float:1.1793677E-14)
            if (r1 == r6) goto L4b
            r5 = 1877773523(0x6fec8cd3, float:1.4641742E29)
            if (r1 == r5) goto L20
            goto La2
        L20:
            java.lang.String r5 = "CompanionClickTracking"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L2a
            goto La2
        L2a:
            java.lang.String r3 = r4.v(r3)
            java.lang.String r3 = com.inmobi.media.AbstractC3940ol.b(r3)
            boolean r4 = com.inmobi.media.AbstractC3940ol.a(r3)
            r5 = 0
            if (r4 == 0) goto L3a
            goto L3b
        L3a:
            r3 = r5
        L3b:
            if (r3 != 0) goto L3e
            goto L45
        L3e:
            com.inmobi.media.ve r5 = new com.inmobi.media.ve
            java.lang.String r4 = "click"
            r5.<init>(r3, r4)
        L45:
            if (r5 == 0) goto La8
            r7.add(r5)
            goto La8
        L4b:
            java.lang.String r6 = "StaticResource"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L54
            goto La2
        L54:
            r4.a(r3, r5)
            goto La8
        L58:
            java.lang.String r5 = "TrackingEvents"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L61
            goto La2
        L61:
            java.util.ArrayList r3 = r4.o(r3)
            r7.addAll(r3)
            goto La8
        L69:
            java.lang.String r5 = "CompanionClickThrough"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L72
            goto La2
        L72:
            java.lang.String r5 = r4.v(r3)
            java.lang.String r5 = com.inmobi.media.AbstractC3940ol.b(r5)
            boolean r7 = com.inmobi.media.AbstractC3940ol.a(r5)
            if (r7 == 0) goto L83
            r6.f93280b = r5
            goto La8
        L83:
            com.inmobi.media.n9 r4 = r4.f36875c
            if (r4 == 0) goto La8
            java.lang.String r3 = r3.getText()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid ClickThrough URL: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "VastParser"
            r4.b(r5, r3)
            goto La8
        La2:
            r4.getClass()
            w(r3)
        La8:
            kotlin.Unit r3 = kotlin.Unit.f93236a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, com.inmobi.media.Fl, java.util.List, kotlin.jvm.internal.Ref$ObjectRef, java.util.List):kotlin.Unit");
    }

    public final void a(XmlPullParser xmlPullParser, List list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        String strB = AbstractC3940ol.b(v(xmlPullParser));
        if (!AbstractC3940ol.a(strB)) {
            C3903n9 c3903n9 = this.f36875c;
            if (c3903n9 != null) {
                c3903n9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || StringsKt.y0(attributeValue)) {
            return;
        }
        List<String> allowedCompanionType = this.f36873a.getAllowedCompanionType();
        if (!(allowedCompanionType instanceof Collection) || !allowedCompanionType.isEmpty()) {
            Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (StringsKt.N((String) it.next(), attributeValue, true)) {
                    list.add(new C4111vi(strB));
                    return;
                }
            }
        }
        C3903n9 c3903n92 = this.f36875c;
        if (c3903n92 != null) {
            c3903n92.a("VastParser", "VAST Companion Error: Format not supported - " + attributeValue);
        }
        this.f36877e = true;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, List list) throws XmlPullParserException, IOException {
        if (Intrinsics.areEqual(xmlPullParser.getName(), "Tracking")) {
            C4107ve c4107veB = fl.b(xmlPullParser);
            if (c4107veB != null) {
                list.add(c4107veB);
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    public final void a(final XmlPullParser xmlPullParser, final boolean z10) {
        a(xmlPullParser, com.taurusx.tax.f.s.f66032y, new Function0() { // from class: w3.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Fl.a(xmlPullParser, z10, this);
            }
        });
    }

    public static final Unit a(XmlPullParser xmlPullParser, boolean z10, Fl fl) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, com.taurusx.tax.f.s.f66022o)) {
            if (z10) {
                String strB = AbstractC3940ol.b(fl.v(xmlPullParser));
                if (AbstractC3940ol.a(strB)) {
                    fl.f36882j = strB;
                }
            }
        } else if (Intrinsics.areEqual(name, com.taurusx.tax.f.s.f66026s)) {
            C4107ve c4107veA = fl.a("click", xmlPullParser);
            if (c4107veA != null) {
                fl.f36881i.add(c4107veA);
            }
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    public final boolean a(int i10, int i11, String str, String str2, int i12) {
        if (AbstractC3940ol.a(str) && i10 > 0 && i11 > 0) {
            if (this.f36873a.getBitRate().getBitrate_mandatory() && i12 <= 0) {
                C3903n9 c3903n9 = this.f36875c;
                if (c3903n9 != null) {
                    c3903n9.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i12);
                }
                return false;
            }
            if (StringsKt.N(str2, "Progressive", true)) {
                return true;
            }
            C3903n9 c3903n92 = this.f36875c;
            if (c3903n92 != null) {
                c3903n92.b("VastParser", "VAST Schema Validation Error: Delivery type NULL or invalid - " + str2);
            }
            return false;
        }
        C3903n9 c3903n93 = this.f36875c;
        if (c3903n93 != null) {
            c3903n93.b("VastParser", "VAST Schema Validation Error: Invalid Media - " + str + " " + i10 + ", " + i11);
        }
        return false;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Fl fl, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, List list) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        if (!Intrinsics.areEqual(xmlPullParser.getName(), com.taurusx.tax.f.s.f66021n)) {
            fl.getClass();
            w(xmlPullParser);
            return Unit.f93236a;
        }
        ref$BooleanRef.f93279b = true;
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        int i12 = 0;
        try {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, com.taurusx.tax.f.a.f65992s);
            Intrinsics.checkNotNullExpressionValue(attributeValue3, "getAttributeValue(...)");
            i10 = Integer.parseInt(attributeValue3);
        } catch (Exception unused) {
            C3903n9 c3903n9 = fl.f36875c;
            if (c3903n9 != null) {
                c3903n9.b("VastParser", "Invalid Value for BitRate.");
            }
            i10 = 0;
        }
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            Intrinsics.checkNotNullExpressionValue(attributeValue4, "getAttributeValue(...)");
            i11 = Integer.parseInt(attributeValue4);
        } catch (Exception unused2) {
            C3903n9 c3903n92 = fl.f36875c;
            if (c3903n92 != null) {
                c3903n92.b("VastParser", "Invalid Value for Media Width.");
            }
            i11 = 0;
        }
        try {
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            Intrinsics.checkNotNullExpressionValue(attributeValue5, "getAttributeValue(...)");
            i12 = Integer.parseInt(attributeValue5);
        } catch (Exception unused3) {
            C3903n9 c3903n93 = fl.f36875c;
            if (c3903n93 != null) {
                c3903n93.b("VastParser", "Invalid Value for Media Height.");
            }
        }
        int i13 = i12;
        String strB = AbstractC3940ol.b(fl.v(xmlPullParser));
        if (!fl.a(i11, i13, strB, attributeValue, i10)) {
            return Unit.f93236a;
        }
        if (attributeValue2 != null) {
            List<String> allowedContentType = fl.f36873a.getAllowedContentType();
            if (!(allowedContentType instanceof Collection) || !allowedContentType.isEmpty()) {
                Iterator<T> it = allowedContentType.iterator();
                while (it.hasNext()) {
                    if (StringsKt.N((String) it.next(), attributeValue2, true)) {
                        Intrinsics.checkNotNull(attributeValue);
                        Intrinsics.checkNotNull(attributeValue2);
                        list.add(new C3965pl(i11, i13, strB, attributeValue, attributeValue2, i10));
                        return Unit.f93236a;
                    }
                }
            }
        }
        C3903n9 c3903n94 = fl.f36875c;
        if (c3903n94 != null) {
            c3903n94.b("VastParser", "VAST Schema Validation Error: Media type Invalid - " + attributeValue2);
        }
        if (F3.a(attributeValue2)) {
            ref$BooleanRef2.f93279b = true;
        }
        return Unit.f93236a;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Fl fl) throws XmlPullParserException, IOException {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.taurusx.tax.f.z.f66070y)) {
            fl.p(xmlPullParser);
        } else {
            fl.getClass();
            w(xmlPullParser);
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser r3, kotlin.jvm.internal.Ref$BooleanRef r4, com.inmobi.media.Fl r5, kotlin.jvm.internal.Ref$ObjectRef r6, kotlin.jvm.internal.Ref$ObjectRef r7, java.util.List r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = r3.getName()
            if (r0 == 0) goto L76
            int r1 = r0.hashCode()
            r2 = 611554000(0x247392d0, float:5.281658E-17)
            if (r1 == r2) goto L65
            r8 = 1561251035(0x5d0eccdb, float:6.43115E17)
            if (r1 == r8) goto L2e
            r4 = 1749252741(0x68437a85, float:3.6924862E24)
            if (r1 == r4) goto L1a
            goto L76
        L1a:
            java.lang.String r4 = "VerificationParameters"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L23
            goto L76
        L23:
            java.lang.String r3 = r5.v(r3)
            java.lang.String r3 = com.inmobi.media.AbstractC3940ol.b(r3)
            r7.f93280b = r3
            goto L7c
        L2e:
            java.lang.String r7 = "JavaScriptResource"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L37
            goto L76
        L37:
            boolean r7 = r4.f93279b
            if (r7 == 0) goto L44
            r5.getClass()
            w(r3)
            kotlin.Unit r3 = kotlin.Unit.f93236a
            return r3
        L44:
            java.lang.String r7 = "apiFramework"
            r8 = 0
            java.lang.String r7 = r3.getAttributeValue(r8, r7)
            if (r7 == 0) goto L7c
            r0 = 0
            r1 = 2
            java.lang.String r2 = "omid"
            boolean r7 = kotlin.text.StringsKt.a0(r7, r2, r0, r1, r8)
            if (r7 == 0) goto L7c
            r7 = 1
            r4.f93279b = r7
            java.lang.String r3 = r5.v(r3)
            java.lang.String r3 = com.inmobi.media.AbstractC3940ol.b(r3)
            r6.f93280b = r3
            goto L7c
        L65:
            java.lang.String r4 = "TrackingEvents"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L6e
            goto L76
        L6e:
            java.util.ArrayList r3 = r5.o(r3)
            r8.addAll(r3)
            goto L7c
        L76:
            r5.getClass()
            w(r3)
        L7c:
            kotlin.Unit r3 = kotlin.Unit.f93236a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, kotlin.jvm.internal.Ref$BooleanRef, com.inmobi.media.Fl, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$ObjectRef, java.util.List):kotlin.Unit");
    }

    public final C4107ve a(String str, XmlPullParser xmlPullParser) {
        String strB = AbstractC3940ol.b(v(xmlPullParser));
        if (!AbstractC3940ol.a(strB)) {
            C3903n9 c3903n9 = this.f36875c;
            if (c3903n9 == null) {
                return null;
            }
            c3903n9.b("VastParser", "Vast Tracker Error: " + str + " " + strB);
            return null;
        }
        return new C4107ve(strB, str);
    }

    public final void a(XmlPullParser xmlPullParser, String str, Function0 function0) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && Intrinsics.areEqual(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                function0.invoke();
            }
            n(xmlPullParser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0066 -> B:31:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0074 -> B:31:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser r6, java.lang.String r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C4089ul
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.ul r0 = (com.inmobi.media.C4089ul) r0
            int r1 = r0.f39701f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39701f = r1
            goto L18
        L13:
            com.inmobi.media.ul r0 = new com.inmobi.media.ul
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f39699d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39701f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            kotlin.jvm.functions.Function1 r6 = r0.f39698c
            java.lang.String r7 = r0.f39697b
            org.xmlpull.v1.XmlPullParser r8 = r0.f39696a
            kotlin.d.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L77
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.d.b(r9)
            r5.n(r6)
        L40:
            int r9 = r6.getEventType()
            if (r9 != r3) goto L47
            goto L5e
        L47:
            java.lang.String r9 = r6.getName()
            if (r9 == 0) goto L61
            java.lang.String r9 = r6.getName()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r7)
            if (r9 == 0) goto L61
            int r9 = r6.getEventType()
            r2 = 3
            if (r9 != r2) goto L61
        L5e:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L61:
            int r9 = r6.getEventType()
            r2 = 2
            if (r9 != r2) goto L77
            r0.f39696a = r6
            r0.f39697b = r7
            r0.f39698c = r8
            r0.f39701f = r3
            java.lang.Object r9 = r8.invoke(r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            r5.n(r6)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
