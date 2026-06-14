package io.bidmachine.iab.vast.processor;

import android.util.Pair;
import c9.g;
import c9.j;
import e9.f;
import e9.h;
import e9.i;
import e9.k;
import e9.m;
import e9.n;
import e9.s;
import e9.t;
import e9.w;
import e9.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f80438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f80439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f80440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Stack f80441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f80442e;

    public c(g gVar, b bVar) {
        this(gVar, bVar, 5);
    }

    private Pair a(k kVar) {
        m mVar;
        List listD0;
        List<i> listD02 = kVar.d0();
        if (listD02 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (i iVar : listD02) {
            if (iVar != null) {
                h hVarX = iVar.X();
                if ((hVarX instanceof m) && (listD0 = (mVar = (m) hVarX).d0()) != null && !listD0.isEmpty()) {
                    Iterator it = listD0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair(mVar, (n) it.next()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Pair pairA = this.f80439b.a(arrayList);
        return pairA != null ? pairA : new Pair(null, null);
    }

    private d b(e9.a aVar, t tVar, e eVar) {
        d dVar = new d();
        int i10 = 0;
        while (true) {
            if (i10 < tVar.X().size()) {
                e9.c cVar = (e9.c) tVar.X().get(i10);
                if (cVar != null && cVar.X() != null) {
                    e9.a aVarX = cVar.X();
                    if (!(aVarX instanceof k)) {
                        if ((aVarX instanceof x) && eVar.c()) {
                            d dVarC = c((x) aVarX);
                            if (!dVarC.i()) {
                                f(dVarC.a());
                                if (aVar == null) {
                                    dVar.b(j.f6607h);
                                } else if (dVarC.f()) {
                                    j jVarH = dVarC.h();
                                    if (jVarH == null) {
                                        jVarH = j.f6613n;
                                    }
                                    dVar.c(aVar, jVarH);
                                } else {
                                    dVar.c(aVar, j.f6607h);
                                }
                                if (i10 == 0 && !eVar.b()) {
                                    break;
                                }
                            } else {
                                return dVarC;
                            }
                        }
                    } else {
                        d dVarI = i((k) aVarX);
                        if (dVarI.i()) {
                            return dVarI;
                        }
                        f(dVarI.a());
                        if (aVar == null) {
                            dVar.b(dVarI.h());
                        } else if (dVarI.f()) {
                            j jVarH2 = dVarI.h();
                            if (jVarH2 == null) {
                                jVarH2 = j.f6613n;
                            }
                            dVar.c(aVar, jVarH2);
                        }
                    }
                    j(aVarX);
                }
                i10++;
            } else if (dVar.h() == null && aVar != null) {
                dVar.c(aVar, j.f6607h);
            }
        }
        return dVar;
    }

    private ArrayList d() {
        ArrayList arrayList = new ArrayList();
        if (!this.f80441d.empty()) {
            for (e9.a aVar : this.f80441d) {
                if (aVar != null && aVar.e0() != null) {
                    arrayList.addAll(aVar.e0());
                }
            }
        }
        return arrayList;
    }

    private ArrayList e(e9.a aVar) {
        ArrayList arrayList = new ArrayList();
        List<i> listD0 = aVar.d0();
        if (listD0 != null) {
            for (i iVar : listD0) {
                if (iVar != null) {
                    h hVarX = iVar.X();
                    if (hVarX instanceof f) {
                        arrayList.addAll(((f) hVarX).X());
                    }
                }
            }
        }
        return arrayList;
    }

    private void g(List list, f fVar) {
        List listZ;
        for (e9.g gVar : fVar.X()) {
            if (!gVar.f0() && (listZ = gVar.Z()) != null) {
                list.addAll(listZ);
            }
        }
    }

    private void h(Map map, Map map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            c9.a aVar = (c9.a) entry.getKey();
            List arrayList = (List) map.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(aVar, arrayList);
            }
            arrayList.addAll((Collection) entry.getValue());
        }
    }

    private d i(k kVar) {
        this.f80441d.push(kVar);
        d dVar = new d();
        Pair pairA = a(kVar);
        if (pairA == null) {
            dVar.c(kVar, j.f6602c);
            return dVar;
        }
        if (pairA.first == null && pairA.second == null) {
            dVar.c(kVar, j.f6610k);
            return dVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        EnumMap enumMap = new EnumMap(c9.a.class);
        ArrayList arrayList4 = new ArrayList();
        e9.e eVar = null;
        if (!this.f80441d.empty()) {
            for (e9.a aVar : this.f80441d) {
                if (aVar != null) {
                    if (aVar.g0() != null) {
                        arrayList.addAll(aVar.g0());
                    }
                    List<i> listD0 = aVar.d0();
                    if (listD0 != null) {
                        for (i iVar : listD0) {
                            if (iVar != null) {
                                h hVarX = iVar.X();
                                if (hVarX instanceof m) {
                                    m mVar = (m) hVarX;
                                    w wVarF0 = mVar.f0();
                                    if (wVarF0 != null && wVarF0.Y() != null) {
                                        arrayList2.addAll(wVarF0.Y());
                                    }
                                    h(enumMap, mVar.e0());
                                } else if (hVarX instanceof f) {
                                    g(arrayList3, (f) hVarX);
                                }
                            }
                        }
                    }
                    List<e9.j> listF0 = aVar.f0();
                    if (listF0 != null) {
                        for (e9.j jVar : listF0) {
                            if (jVar instanceof e9.e) {
                                if (eVar == null) {
                                    eVar = (e9.e) jVar;
                                }
                            } else if (jVar instanceof e9.d) {
                                arrayList4.add((e9.d) jVar);
                            }
                        }
                    }
                }
            }
        }
        VastAd vastAd = new VastAd((m) pairA.first, (n) pairA.second);
        vastAd.g(arrayList);
        vastAd.f(d());
        vastAd.c(arrayList2);
        vastAd.v(arrayList3);
        vastAd.d(enumMap);
        vastAd.e(e(kVar));
        vastAd.b(eVar);
        vastAd.t(arrayList4);
        dVar.d(vastAd);
        return dVar;
    }

    private boolean k() {
        return this.f80442e >= this.f80440c;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    io.bidmachine.iab.vast.processor.d c(e9.x r10) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.iab.vast.processor.c.c(e9.x):io.bidmachine.iab.vast.processor.d");
    }

    void f(List list) {
        this.f80438a.A(list, null);
    }

    void j(e9.a aVar) {
        if (this.f80441d.empty()) {
            return;
        }
        int iSearch = this.f80441d.search(aVar);
        for (int i10 = 0; i10 < iSearch; i10++) {
            this.f80441d.pop();
        }
    }

    public d l(String str) {
        c9.e.a("VastProcessor", "process", new Object[0]);
        d dVar = new d();
        try {
            t tVarB = s.b(str);
            if (tVarB != null && tVarB.Y()) {
                return b(null, tVarB, new e());
            }
            dVar.b(j.f6602c);
            return dVar;
        } catch (Exception unused) {
            dVar.b(j.f6601b);
            return dVar;
        }
    }

    c(g gVar, b bVar, int i10) {
        this.f80442e = 0;
        this.f80438a = gVar;
        this.f80439b = bVar;
        this.f80440c = i10;
        this.f80441d = new Stack();
    }
}
