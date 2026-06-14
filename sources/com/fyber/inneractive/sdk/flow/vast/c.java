package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.w;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20998b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20999c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21000d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21001e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21002f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f21003g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f21004h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f21005i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f21006j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f21007k = new ArrayList();

    public c(boolean z10) {
        this.f20997a = true;
        this.f20997a = z10;
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.h hVar, int i10) throws b {
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        ArrayList<String> arrayList = hVar.f21208h;
        if (arrayList.size() > 0) {
            for (String str : arrayList) {
                if (!h0.e(str)) {
                    throw new b("Found non-secure click tracking url for companion. url: " + str, 0);
                }
            }
            if (i10 > 0) {
                this.f21005i.add(hVar);
            }
        }
        String str2 = hVar.f21207g;
        if (!h0.e(str2)) {
            throw new b("Found non-secure click through url: " + str2, 0);
        }
        if (!hVar.a()) {
            if (this.f21006j.contains(hVar)) {
                return;
            }
            this.f21006j.add(hVar);
            return;
        }
        Integer num = hVar.f21201a;
        Integer num2 = hVar.f21202b;
        if (num == null || num2 == null || num.intValue() < 100 || num2.intValue() < 100) {
            throw new b("Incompatible size: " + num + StringUtils.COMMA + num2, 16);
        }
        ArrayList<w> arrayList2 = hVar.f21210j;
        for (w wVar : arrayList2) {
            if (!h0.e(wVar.f21245b)) {
                throw new b("Found non-secure tracking event: " + wVar, 0);
            }
        }
        String str3 = hVar.f21203c;
        l lVar = hVar.f21204d;
        if (lVar != null) {
            k kVarA = k.a(lVar.f21212a);
            if (kVarA == null) {
                throw new b("Found invalid creative type: " + lVar.f21212a, 32);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Static, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, lVar.f21213b, kVarA);
        }
        String str4 = hVar.f21205e;
        if (!TextUtils.isEmpty(str4)) {
            if (!h0.e(str4)) {
                throw new b("Found non-secure iframe url: " + str4, 0);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Iframe, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, str4, null);
        }
        String str5 = hVar.f21206f;
        if (TextUtils.isEmpty(str5)) {
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            a(bVar2, com.fyber.inneractive.sdk.model.vast.i.Html, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, str5, null);
        }
        bVar2.f21167g.size();
    }

    public final com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.f fVar, List list, String str) {
        int iE = o.e();
        int iD = o.d();
        IAlog.a("%sprocess started", "VastProcessor: ");
        if (fVar != null && fVar.f21192c != null) {
            com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new g(this.f21000d, iE, iD), new d(iE, iD));
            bVar.f21161a = str;
            ArrayList arrayList = fVar.f21192c.f21195c;
            if (arrayList != null) {
                List list2 = list;
                if (!arrayList.isEmpty()) {
                    if (list == null) {
                        list2 = list;
                        if (fVar.f21191b != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(fVar);
                            list2 = arrayList2;
                        }
                    }
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            a0 a0Var = ((com.fyber.inneractive.sdk.model.vast.f) it.next()).f21191b;
                            if (a0Var != null) {
                                a(bVar, a0Var);
                            }
                        }
                    }
                    a(bVar, fVar.f21192c);
                    if (bVar.f21164d.size() == 0) {
                        if (this.f21003g.isEmpty()) {
                            throw new h("ErrorNoMediaFiles", "No media files exist after merge");
                        }
                        throw new h("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                    }
                    ArrayList<com.fyber.inneractive.sdk.model.vast.c> arrayList3 = new ArrayList(bVar.f21167g);
                    Collections.sort(arrayList3, bVar.f21168h);
                    if (!arrayList3.isEmpty()) {
                        for (com.fyber.inneractive.sdk.model.vast.h hVar : this.f21006j) {
                            if (!hVar.a()) {
                                for (com.fyber.inneractive.sdk.model.vast.c cVar : arrayList3) {
                                    ArrayList arrayList4 = hVar.f21208h;
                                    if (arrayList4 != null) {
                                        Iterator it2 = arrayList4.iterator();
                                        while (it2.hasNext()) {
                                            cVar.a(x.EVENT_CLICK, (String) it2.next());
                                        }
                                    }
                                    String str2 = hVar.f21207g;
                                    if (TextUtils.isEmpty(cVar.f21183g)) {
                                        cVar.f21183g = str2;
                                    }
                                    ArrayList<w> arrayList5 = hVar.f21210j;
                                    if (arrayList5 != null) {
                                        for (w wVar : arrayList5) {
                                            x xVarA = x.a(wVar.f21244a);
                                            String str3 = wVar.f21245b;
                                            if (xVarA != null && str3 != null) {
                                                cVar.a(xVarA, str3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (IAlog.f23840a == 2) {
                        IAlog.e("%sLogging merged model media files: ", "VastProcessor: ");
                        Iterator it3 = new ArrayList(bVar.f21164d).iterator();
                        int i10 = 0;
                        while (it3.hasNext()) {
                            IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i10), (r) it3.next());
                            i10++;
                        }
                    }
                    if (IAlog.f23840a == 2) {
                        IAlog.e("%sLogging merged model companion ads: ", "VastProcessor: ");
                        ArrayList arrayList6 = new ArrayList(bVar.f21167g);
                        Collections.sort(arrayList6, bVar.f21168h);
                        if (arrayList6.size() > 0) {
                            Iterator it4 = arrayList6.iterator();
                            int i11 = 0;
                            while (it4.hasNext()) {
                                IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i11), ((com.fyber.inneractive.sdk.model.vast.c) it4.next()).a());
                                i11++;
                            }
                        } else {
                            IAlog.e("%sNo companion ads found!", "VastProcessor: ");
                        }
                    }
                    return bVar;
                }
            }
            throw new h("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        IAlog.a("%sno inline found", "VastProcessor: ");
        throw new h("ErrorNoMediaFiles", "Empty inline ad found");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.model.vast.b r19, com.fyber.inneractive.sdk.model.vast.g r20) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.vast.c.a(com.fyber.inneractive.sdk.model.vast.b, com.fyber.inneractive.sdk.model.vast.g):void");
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    public final void a(com.fyber.inneractive.sdk.model.vast.b r7, com.fyber.inneractive.sdk.model.vast.i r8, int r9, int r10, int r11, java.lang.String r12, java.lang.String r13, java.util.List r14, java.util.List r15, java.lang.String r16, com.fyber.inneractive.sdk.model.vast.k r17) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.vast.c.a(com.fyber.inneractive.sdk.model.vast.b, com.fyber.inneractive.sdk.model.vast.i, int, int, int, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, com.fyber.inneractive.sdk.model.vast.k):void");
    }
}
