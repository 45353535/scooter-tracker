package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.c0;
import com.my.tracker.obfuscated.j;
import com.my.tracker.obfuscated.o1;
import com.my.tracker.obfuscated.x1;
import com.my.tracker.obfuscated.y2;
import com.my.tracker.obfuscated.z1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class g1 extends q1 {
    protected g1() {
    }

    private static int a(int i10) {
        switch (i10) {
            case 1:
                return 12;
            case 2:
                return 13;
            case 3:
                return 11;
            case 4:
            case 11:
            case 12:
            case 16:
            case 30:
            default:
                return -1;
            case 5:
                return 17;
            case 6:
                return 22;
            case 7:
                return 18;
            case 8:
                return 19;
            case 9:
                return 20;
            case 10:
                return 23;
            case 13:
                return 21;
            case 14:
                return 14;
            case 15:
                return 16;
            case 17:
                return 25;
            case 18:
                return 26;
            case 19:
                return 27;
            case 20:
                return 28;
            case 21:
                return 29;
            case 22:
                return 30;
            case 23:
                return 31;
            case 24:
                return 32;
            case 25:
                return 33;
            case 26:
                return 34;
            case 27:
                return 35;
            case 28:
                return 36;
            case 29:
                return 37;
            case 31:
                return 39;
            case 32:
                return 40;
            case 33:
                return 41;
        }
    }

    public static g1 b() {
        return new g1();
    }

    public synchronized byte[] c(long j10) {
        try {
            this.f61791a.a();
            this.f61791a.a(2, j10);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 29", th2);
            return null;
        }
        return this.f61791a.c();
    }

    protected static void a(r1 r1Var, MyTrackerParams.a aVar, q qVar) throws IOException {
        qVar.a();
        qVar.a(1, aVar.f61211a);
        qVar.a(2, aVar.f61213c);
        qVar.a(3, aVar.f61212b);
        if (qVar.b() > 0) {
            r1Var.a(24, qVar);
        }
    }

    public synchronized byte[] b(boolean z10, String str, String str2, Map map) {
        return a(8, z10, str, str2, map);
    }

    public synchronized byte[] b(Map map) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, map, this.f61792b);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 13", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] b(String str, String str2) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f61791a.a(2, str2);
            }
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 2", th2);
            return null;
        }
        return this.f61791a.c();
    }

    protected static void a(r1 r1Var, y2.a aVar, q qVar) throws IOException {
        qVar.a();
        int i10 = aVar.f61940b;
        if (i10 >= 0) {
            qVar.a(1, i10);
        }
        if (aVar.f61943e == 0) {
            qVar.a(2, 0);
        }
        if (!aVar.f61945g) {
            qVar.a(3, 0);
        }
        if (!aVar.f61944f) {
            qVar.a(4, 0);
        }
        int i11 = aVar.f61941c;
        if (i11 != 900) {
            qVar.a(5, i11);
        }
        int i12 = aVar.f61942d;
        if (i12 != 0) {
            qVar.a(6, i12);
        }
        if (!aVar.f61946h) {
            qVar.a(7, 0);
        }
        if (!aVar.f61947i) {
            qVar.a(8, 0);
        }
        if (!aVar.f61948j) {
            qVar.a(9, 0);
        }
        AntiFraudConfig antiFraudConfig = aVar.f61950l;
        if (!antiFraudConfig.useLightSensor) {
            qVar.a(11, 0);
        }
        if (!antiFraudConfig.useMagneticFieldSensor) {
            qVar.a(12, 0);
        }
        if (!antiFraudConfig.useGyroscope) {
            qVar.a(13, 0);
        }
        if (!antiFraudConfig.usePressureSensor) {
            qVar.a(14, 0);
        }
        if (!antiFraudConfig.useProximitySensor) {
            qVar.a(15, 0);
        }
        if (qVar.b() > 0) {
            r1Var.a(27, qVar);
        }
    }

    public synchronized byte[] b(String str, String str2, long j10, long j11) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f61791a.a(2, str2);
            }
            this.f61791a.a(3, j11);
            this.f61791a.a(4, j10);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 31", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] b(long j10, long j11, long j12) {
        try {
            this.f61791a.a();
            this.f61791a.a(2, j10);
            this.f61791a.a(3, j11);
            this.f61791a.a(4, j12);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 26", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] b(long j10) {
        try {
            this.f61791a.a();
            this.f61791a.a(2, j10);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 28", th2);
            return null;
        }
        return this.f61791a.c();
    }

    protected static void a(r1 r1Var, j jVar, q qVar) throws IOException {
        if (jVar.f61592a.isEmpty()) {
            return;
        }
        for (j.a aVar : jVar.f61592a) {
            qVar.a();
            qVar.a(1, aVar.f61593a);
            qVar.a(2, aVar.f61594b);
            r1Var.a(31, qVar);
        }
    }

    protected static void a(r1 r1Var, List list, q qVar) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0.b bVar = (c0.b) it.next();
            if (bVar instanceof c0.c) {
                a(r1Var, (c0.c) bVar, qVar);
            } else if (bVar instanceof c0.d) {
                a(r1Var, (c0.d) bVar, qVar);
            } else if (bVar instanceof c0.e) {
                a(r1Var, (c0.e) bVar, qVar);
            } else if (bVar instanceof c0.i) {
                a(r1Var, (c0.i) bVar, qVar);
            } else if (bVar instanceof c0.g) {
                a(r1Var, (c0.g) bVar, qVar);
            } else if (bVar instanceof c0.f) {
                a(r1Var, (c0.f) bVar, qVar);
            } else if (bVar instanceof c0.h) {
                a(r1Var, (c0.h) bVar, qVar);
            } else {
                x2.a("Unknown cell-info");
            }
        }
    }

    private static int a(q qVar, int i10, int i11) {
        if (i11 != Integer.MAX_VALUE) {
            return qVar.a(i10, i11);
        }
        return 0;
    }

    private static int a(q qVar, int i10, long j10) {
        if (j10 != Long.MAX_VALUE) {
            return qVar.a(i10, j10);
        }
        return 0;
    }

    private static void a(r1 r1Var, c0.c cVar, q qVar) throws IOException {
        qVar.a();
        a(qVar, 1, cVar.f61304a);
        a(qVar, 2, cVar.f61305b);
        a(qVar, 3, cVar.f61306c);
        a(qVar, 4, cVar.f61307d);
        a(qVar, 5, cVar.f61308e);
        a(qVar, 6, cVar.f61309f);
        a(qVar, 7, cVar.f61310g);
        a(qVar, 8, cVar.f61311h);
        a(qVar, 9, cVar.f61312i);
        a(qVar, 10, cVar.f61313j);
        a(qVar, 11, cVar.f61314k);
        a(qVar, 12, cVar.f61315l);
        r1Var.a(32, qVar);
    }

    private static void a(r1 r1Var, c0.d dVar, q qVar) throws IOException {
        qVar.a();
        qVar.a(1, dVar.f61316a);
        qVar.a(2, dVar.f61317b);
        a(qVar, 3, dVar.f61318c);
        a(qVar, 4, dVar.f61319d);
        a(qVar, 5, dVar.f61320e);
        a(qVar, 6, dVar.f61321f);
        a(qVar, 7, dVar.f61322g);
        a(qVar, 8, dVar.f61323h);
        a(qVar, 9, dVar.f61324i);
        a(qVar, 10, dVar.f61325j);
        r1Var.a(33, qVar);
    }

    private static void a(r1 r1Var, c0.e eVar, q qVar) throws IOException {
        qVar.a();
        qVar.a(1, eVar.f61326a);
        qVar.a(2, eVar.f61327b);
        a(qVar, 3, eVar.f61328c);
        a(qVar, 4, eVar.f61329d);
        a(qVar, 5, eVar.f61330e);
        a(qVar, 6, eVar.f61331f);
        a(qVar, 7, eVar.f61332g);
        a(qVar, 8, eVar.f61333h);
        a(qVar, 9, eVar.f61334i);
        a(qVar, 10, eVar.f61335j);
        r1Var.a(34, qVar);
    }

    private static void a(r1 r1Var, c0.i iVar, q qVar) throws IOException {
        qVar.a();
        qVar.a(1, iVar.f61358a);
        qVar.a(2, iVar.f61359b);
        a(qVar, 3, iVar.f61360c);
        a(qVar, 4, iVar.f61361d);
        a(qVar, 5, iVar.f61362e);
        a(qVar, 6, iVar.f61363f);
        a(qVar, 7, iVar.f61364g);
        a(qVar, 8, iVar.f61365h);
        a(qVar, 9, iVar.f61366i);
        r1Var.a(35, qVar);
    }

    private static void a(r1 r1Var, c0.g gVar, q qVar) throws IOException {
        qVar.a();
        qVar.a(1, gVar.f61345a);
        qVar.a(2, gVar.f61346b);
        a(qVar, 3, gVar.f61347c);
        a(qVar, 4, gVar.f61348d);
        a(qVar, 5, gVar.f61349e);
        a(qVar, 6, gVar.f61350f);
        a(qVar, 7, gVar.f61351g);
        a(qVar, 8, gVar.f61352h);
        a(qVar, 9, gVar.f61353i);
        r1Var.a(36, qVar);
    }

    private static void a(r1 r1Var, c0.f fVar, q qVar) throws IOException {
        qVar.a();
        qVar.a(1, fVar.f61336a);
        qVar.a(2, fVar.f61337b);
        a(qVar, 3, fVar.f61338c);
        a(qVar, 4, fVar.f61339d);
        a(qVar, 5, fVar.f61340e);
        a(qVar, 6, fVar.f61341f);
        a(qVar, 7, fVar.f61342g);
        a(qVar, 8, fVar.f61343h);
        a(qVar, 9, fVar.f61344i);
        r1Var.a(37, qVar);
    }

    private static void a(r1 r1Var, c0.h hVar, q qVar) throws IOException {
        qVar.a();
        qVar.a(1, hVar.f61354a);
        qVar.a(2, hVar.f61355b);
        a(qVar, 3, hVar.f61356c);
        a(qVar, 4, hVar.f61357d);
        r1Var.a(33, qVar);
    }

    protected static void a(r1 r1Var, c0.k kVar, q qVar) throws IOException {
        if (kVar.f61372a != null) {
            qVar.a();
            qVar.a(1, kVar.f61372a.f61368b);
            qVar.a(2, kVar.f61372a.f61367a);
            qVar.a(3, kVar.f61372a.f61369c);
            qVar.a(5, kVar.f61372a.f61370d);
            qVar.a(6, kVar.f61372a.f61371e);
            r1Var.a(28, qVar);
        }
        for (c0.a aVar : kVar.f61373b) {
            qVar.a();
            qVar.a(1, aVar.f61302b);
            qVar.a(2, aVar.f61301a);
            qVar.a(3, aVar.f61303c);
            r1Var.a(29, qVar);
        }
    }

    protected static int a(r1 r1Var, x1 x1Var, q qVar) {
        int iA;
        int i10 = 0;
        try {
            x1.a aVarA = x1Var.a();
            iA = 0;
            while (aVarA.b()) {
                try {
                    try {
                        int iG = (int) aVarA.g();
                        try {
                            qVar.a();
                            x1.b bVarD = aVarA.d();
                            while (bVarD.b()) {
                                try {
                                    qVar.a(2, (int) bVarD.e());
                                } catch (Throwable th2) {
                                    if (bVarD != null) {
                                        try {
                                            bVarD.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            bVarD.close();
                            if (qVar.b() == 0) {
                                x2.b("Error: no timestamps for event " + iG + ", event ignored");
                            } else {
                                qVar.a(1, iG);
                                long jC = aVarA.c();
                                if (jC > 0) {
                                    qVar.a(3, (int) jC);
                                }
                                byte[] bArrL = aVarA.l();
                                if (bArrL.length > 0) {
                                    int iA2 = a(iG);
                                    if (iA2 == -1) {
                                        x2.b("Error: unrecognized eventType " + iG + ", event ignored");
                                    } else {
                                        qVar.a(iA2, bArrL);
                                    }
                                }
                                iA += r1Var.a(41, qVar);
                                i10++;
                            }
                        } catch (Throwable th4) {
                            x2.b("Error: failed to pack event " + iG, th4);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        x2.b("Error: failed to get stored events", th);
                        x2.a("Written: events=" + i10 + ", bytes=" + iA);
                        return iA;
                    }
                } finally {
                }
            }
            aVarA.close();
        } catch (Throwable th6) {
            th = th6;
            iA = 0;
        }
        x2.a("Written: events=" + i10 + ", bytes=" + iA);
        return iA;
    }

    protected static int a(r1 r1Var, z1 z1Var, q qVar, q qVar2) {
        int i10;
        int iA = 0;
        try {
            z1.a aVarA = z1Var.a();
            i10 = 0;
            while (aVarA.b()) {
                try {
                    try {
                        String strK = aVarA.k();
                        qVar.a();
                        try {
                            z1.b bVarD = aVarA.d();
                            while (bVarD.b()) {
                                try {
                                    qVar2.a();
                                    qVar2.a(1, (int) bVarD.h());
                                    if (!bVarD.f()) {
                                        qVar2.a(2, (int) bVarD.j());
                                    }
                                    qVar.a(1, qVar2);
                                } catch (Throwable th2) {
                                    if (bVarD != null) {
                                        try {
                                            bVarD.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            bVarD.close();
                        } catch (Throwable th4) {
                            x2.b("Error: failed to read session " + strK + ": ", th4);
                        }
                        if (qVar.b() == 0) {
                            x2.a("No periods for session " + strK + ", id=" + aVarA.a() + ", session ignored");
                        } else {
                            int iC = (int) aVarA.c();
                            if (iC > 0) {
                                qVar.a(2, iC);
                            }
                            iA += r1Var.a(42, qVar);
                            i10++;
                        }
                    } finally {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    x2.b("Error: failed to get stored sessions", th);
                }
            }
            aVarA.close();
        } catch (Throwable th6) {
            th = th6;
            i10 = 0;
        }
        x2.a("Written: sessions=" + i10 + ", bytes=" + iA);
        return iA;
    }

    public synchronized boolean a(r1 r1Var, long j10) {
        if (j10 > 0) {
            try {
                r1Var.a(4, j10);
            } catch (Exception e10) {
                x2.a("Write timestamp send error: " + e10, e10);
                return false;
            }
        }
        return true;
    }

    public synchronized int a(r1 r1Var, y2.a aVar, boolean z10, b3 b3Var, String str, f0 f0Var, long j10, long j11, x1 x1Var, z1 z1Var) {
        String str2;
        String str3;
        try {
            if (a(r1Var, x1Var, this.f61791a) + a(r1Var, z1Var, this.f61791a, this.f61792b) == 0) {
                x2.a("No events to send");
                return 3;
            }
            r1Var.a(1, "3.5.0");
            r1Var.a(2, aVar.f61939a);
            if (j10 != -1) {
                r1Var.a(3, j10);
            }
            if (j11 > 0) {
                r1Var.a(5, (int) j11);
            }
            Map map = aVar.f61949k.f61215e;
            r1Var.a(43, map, this.f61792b);
            if (z10 || map.isEmpty()) {
                str2 = null;
                str3 = null;
            } else {
                str2 = (String) map.get("android_id");
                str3 = (String) map.get("mac");
            }
            q1.a(r1Var, f0Var.f61483a, f0Var.f61485c, this.f61791a, this.f61792b);
            q1.a(r1Var, z10, b3Var, this.f61791a);
            q1.a(r1Var, str2, str3, f0Var, this.f61791a, this.f61792b);
            if (!z10) {
                a(r1Var, aVar.f61949k, this.f61791a);
            }
            q1.a(r1Var, f0Var.f61488f, f0Var.f61484b, f0Var.f61485c, this.f61791a);
            a(r1Var, aVar, this.f61791a);
            if (!z10) {
                q1.a(r1Var, f0Var.f61489g, this.f61791a);
            }
            a(r1Var, f0Var.f61490h, this.f61791a);
            if (!z10) {
                a(r1Var, f0Var.f61491i.f61299a, this.f61791a);
                a(r1Var, f0Var.f61491i.f61300b, this.f61791a);
            }
            if (!TextUtils.isEmpty(str)) {
                r1Var.a(44, str.length() > 255 ? str.substring(0, 255) : str);
            }
            a();
            return 1;
        } catch (Exception e10) {
            x2.a("Create packet error: " + e10, e10);
            a();
            return 2;
        }
    }

    public synchronized byte[] a(String str, Map map) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, map, this.f61792b);
            this.f61791a.a(2, str);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 6", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(boolean z10, String str, String str2, Map map) {
        return a(7, z10, str, str2, map);
    }

    public synchronized byte[] a(Map map) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, map, this.f61792b);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 9", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(int i10, Map map) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, map, this.f61792b);
            this.f61791a.a(2, i10);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 13", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(long j10, String str, o1.a aVar) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, j10);
            this.f61792b.a();
            if (!TextUtils.isEmpty(str)) {
                this.f61792b.a(1, str);
            }
            if (aVar != null) {
                this.f61792b.a(2, aVar.f61741a);
            }
            if (aVar != null) {
                this.f61792b.a(3, aVar.f61742b);
            }
            if (aVar != null) {
                this.f61792b.a(4, aVar.f61743c);
            }
            if (this.f61792b.b() > 0) {
                this.f61791a.a(2, this.f61792b);
            }
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 1", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(String str, String str2, long j10, long j11) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f61791a.a(2, str2);
            }
            this.f61791a.a(3, j11);
            this.f61791a.a(4, j10);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 14", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(String str) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, str);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 33", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, str3);
            this.f61791a.a(2, str4);
            this.f61791a.a(3, str);
            this.f61791a.a(4, str2);
            if (!TextUtils.isEmpty(str5)) {
                this.f61792b.a();
                this.f61792b.a(1, str5);
                if (this.f61792b.b() > 0) {
                    this.f61791a.a(5, this.f61792b);
                }
            }
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 5", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, map, this.f61792b);
            this.f61792b.a();
            this.f61792b.a(1, str2);
            this.f61792b.a(2, str);
            this.f61792b.a(3, str3);
            if (this.f61792b.b() > 0) {
                this.f61791a.a(2, this.f61792b);
            }
            if (str3 != null) {
                this.f61791a.a(4, str4);
                this.f61791a.a(5, str5);
            }
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 10", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, int i10, String str5, String str6, Map map) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, map, this.f61792b);
            this.f61791a.a(2, str2);
            this.f61791a.a(3, str);
            this.f61791a.a(4, str3);
            if (str != null) {
                this.f61791a.a(5, str5);
                this.f61791a.a(6, str6);
            }
            this.f61791a.a(7, str4);
            this.f61791a.a(8, i10);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 32", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(String str, String str2) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f61791a.a(2, str2);
            }
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 15", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(AdEvent adEvent, String str) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, adEvent.network);
            if (adEvent.f61466a == 19) {
                this.f61791a.a(2, str);
                this.f61791a.a(3, adEvent.currency);
            }
            this.f61791a.a(4, adEvent.source);
            this.f61791a.a(5, adEvent.placementId);
            this.f61791a.a(6, adEvent.adId);
            this.f61791a.a(7, adEvent.adFormat);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: " + adEvent.f61466a, th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(int i10, String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, map, this.f61792b);
            this.f61791a.a(2, str2);
            this.f61791a.a(3, str4);
            this.f61791a.a(4, str5);
            this.f61791a.a(5, str);
            this.f61791a.a(6, str3);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: " + i10, th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(long j10) {
        try {
            this.f61791a.a();
            this.f61791a.a(2, j10);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 25", th2);
            return null;
        }
        return this.f61791a.c();
    }

    public synchronized byte[] a(long j10, long j11, long j12) {
        try {
            this.f61791a.a();
            this.f61791a.a(2, j10);
            this.f61791a.a(3, j11);
            this.f61791a.a(4, j12);
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: 27", th2);
            return null;
        }
        return this.f61791a.c();
    }

    private byte[] a(int i10, boolean z10, String str, String str2, Map map) {
        try {
            this.f61791a.a();
            this.f61791a.a(1, map, this.f61792b);
            if (!z10) {
                this.f61791a.a(2, str);
                this.f61791a.a(3, str2);
            }
            return this.f61791a.c();
        } catch (Throwable th2) {
            x2.b("Event serialization failed, type: " + i10, th2);
            return null;
        }
    }
}
