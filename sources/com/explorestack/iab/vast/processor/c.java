package com.explorestack.iab.vast.processor;

import android.util.Pair;
import f2.g;
import h2.f;
import h2.h;
import h2.i;
import h2.j;
import h2.k;
import h2.m;
import h2.n;
import h2.s;
import h2.v;
import h2.w;
import h2.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f2.e f18299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f18300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f18301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Stack f18302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18303e;

    public c(f2.e eVar, b bVar) {
        this(eVar, bVar, 5);
    }

    private Pair a(k kVar) {
        m mVar;
        List listE0;
        ArrayList arrayList = new ArrayList();
        for (i iVar : kVar.e0()) {
            if (iVar != null) {
                h hVarY = iVar.Y();
                if ((hVarY instanceof m) && (listE0 = (mVar = (m) hVarY).e0()) != null && !listE0.isEmpty()) {
                    Iterator it = listE0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair(mVar, (n) it.next()));
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        b bVar = this.f18300b;
        Pair pairA = bVar != null ? bVar.a(arrayList) : null;
        return pairA != null ? pairA : new Pair(null, null);
    }

    private d b(h2.a aVar, s sVar, e eVar) {
        g gVarG;
        d dVar = new d();
        int i10 = 0;
        while (true) {
            if (i10 < sVar.Y().size()) {
                h2.c cVar = (h2.c) sVar.Y().get(i10);
                if (cVar != null && cVar.Y() != null) {
                    h2.a aVarY = cVar.Y();
                    if (!(aVarY instanceof k)) {
                        if ((aVarY instanceof w) && eVar.c()) {
                            d dVarC = c((w) aVarY);
                            if (!dVarC.h()) {
                                g(dVarC.a());
                                if (aVar != null) {
                                    if (dVarC.i()) {
                                        gVarG = dVarC.g();
                                        if (gVarG == null) {
                                            gVarG = g.f71917n;
                                        }
                                    } else {
                                        gVarG = g.f71911h;
                                    }
                                    dVar.d(aVar, gVarG);
                                } else {
                                    dVar.c(g.f71911h);
                                }
                                if (i10 == 0 && !eVar.b()) {
                                    break;
                                }
                            } else {
                                return dVarC;
                            }
                        }
                    } else {
                        d dVarJ = j((k) aVarY);
                        if (dVarJ.h()) {
                            return dVarJ;
                        }
                        g(dVarJ.a());
                        if (aVar == null) {
                            dVar.c(dVarJ.g());
                        } else if (dVarJ.i()) {
                            g gVarG2 = dVarJ.g();
                            if (gVarG2 == null) {
                                gVarG2 = g.f71917n;
                            }
                            dVar.d(aVar, gVarG2);
                        }
                    }
                    k(aVarY);
                }
                i10++;
            } else if (dVar.g() == null && aVar != null) {
                dVar.d(aVar, g.f71911h);
            }
        }
        return dVar;
    }

    private ArrayList e() {
        ArrayList arrayList = new ArrayList();
        if (!this.f18302d.empty()) {
            for (h2.a aVar : this.f18302d) {
                if (aVar != null && aVar.f0() != null) {
                    arrayList.addAll(aVar.f0());
                }
            }
        }
        return arrayList;
    }

    private ArrayList f(h2.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (i iVar : aVar.e0()) {
            if (iVar != null) {
                h hVarY = iVar.Y();
                if (hVarY instanceof f) {
                    f fVar = (f) hVarY;
                    if (fVar.Y() != null) {
                        arrayList.addAll(fVar.Y());
                    }
                }
            }
        }
        return arrayList;
    }

    private void h(List list, f fVar) {
        List listA0;
        for (h2.g gVar : fVar.Y()) {
            if (!gVar.g0() && (listA0 = gVar.a0()) != null) {
                list.addAll(listA0);
            }
        }
    }

    private void i(Map map, Map map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            f2.a aVar = (f2.a) entry.getKey();
            List arrayList = (List) map.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(aVar, arrayList);
            }
            arrayList.addAll((Collection) entry.getValue());
        }
    }

    private d j(k kVar) {
        this.f18302d.push(kVar);
        d dVar = new d();
        Pair pairA = a(kVar);
        if (pairA == null) {
            dVar.d(kVar, g.f71906c);
            return dVar;
        }
        if (pairA.first == null && pairA.second == null) {
            dVar.d(kVar, g.f71914k);
            return dVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        EnumMap enumMap = new EnumMap(f2.a.class);
        ArrayList arrayList4 = new ArrayList();
        h2.e eVar = null;
        if (!this.f18302d.empty()) {
            for (h2.a aVar : this.f18302d) {
                if (aVar != null) {
                    if (aVar.h0() != null) {
                        arrayList.addAll(aVar.h0());
                    }
                    if (aVar.e0() != null) {
                        for (i iVar : aVar.e0()) {
                            if (iVar != null) {
                                h hVarY = iVar.Y();
                                if (hVarY instanceof m) {
                                    m mVar = (m) hVarY;
                                    v vVarG0 = mVar.g0();
                                    if (vVarG0 != null && vVarG0.Z() != null) {
                                        arrayList2.addAll(vVarG0.Z());
                                    }
                                    i(enumMap, mVar.f0());
                                } else if (hVarY instanceof f) {
                                    h(arrayList3, (f) hVarY);
                                }
                            }
                        }
                    }
                    List<j> listG0 = aVar.g0();
                    if (listG0 != null) {
                        for (j jVar : listG0) {
                            if (jVar instanceof h2.e) {
                                if (eVar == null) {
                                    eVar = (h2.e) jVar;
                                }
                            } else if (jVar instanceof h2.d) {
                                arrayList4.add((h2.d) jVar);
                            }
                        }
                    }
                }
            }
        }
        VastAd vastAd = new VastAd((m) pairA.first, (n) pairA.second);
        vastAd.g(arrayList);
        vastAd.f(e());
        vastAd.c(arrayList2);
        vastAd.u(arrayList3);
        vastAd.d(enumMap);
        vastAd.e(f(kVar));
        vastAd.b(eVar);
        vastAd.s(arrayList4);
        dVar.b(vastAd);
        return dVar;
    }

    private boolean l() {
        return this.f18303e >= this.f18301c;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0119 A[Catch: Exception -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a8, blocks: (B:39:0x00a4, B:47:0x00c2, B:55:0x00dd, B:66:0x00fd, B:70:0x010b, B:74:0x0119, B:78:0x0127, B:11:0x0048, B:15:0x0064, B:16:0x0066, B:34:0x0082, B:35:0x008c, B:37:0x0096, B:43:0x00ae, B:45:0x00b4, B:49:0x00c6, B:51:0x00d0, B:53:0x00d6, B:57:0x00e1), top: B:88:0x0048, inners: #5, #9, #11, #10, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    com.explorestack.iab.vast.processor.d c(h2.w r10) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.processor.c.c(h2.w):com.explorestack.iab.vast.processor.d");
    }

    public d d(String str) {
        g gVar;
        s sVarB;
        f2.c.a("VastProcessor", "process", new Object[0]);
        d dVar = new d();
        try {
            sVarB = x.b(str);
        } catch (Exception unused) {
            gVar = g.f71905b;
        }
        if (sVarB != null && sVarB.Z()) {
            return b(null, sVarB, new e());
        }
        gVar = g.f71906c;
        dVar.c(gVar);
        return dVar;
    }

    void g(List list) {
        this.f18299a.A(list, null);
    }

    void k(h2.a aVar) {
        if (this.f18302d.empty()) {
            return;
        }
        int iSearch = this.f18302d.search(aVar);
        for (int i10 = 0; i10 < iSearch; i10++) {
            this.f18302d.pop();
        }
    }

    c(f2.e eVar, b bVar, int i10) {
        this.f18302d = new Stack();
        this.f18303e = 0;
        this.f18299a = eVar;
        this.f18300b = bVar;
        this.f18301c = i10;
    }
}
