package ua;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oa.n;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f105354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f105355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f105356d;

    public d() {
        super(new n());
        this.f105354b = -9223372036854775807L;
        this.f105355c = new long[0];
        this.f105356d = new long[0];
    }

    private static Boolean g(d0 d0Var) {
        return Boolean.valueOf(d0Var.H() == 1);
    }

    private static Object h(d0 d0Var, int i10) {
        if (i10 == 0) {
            return j(d0Var);
        }
        if (i10 == 1) {
            return g(d0Var);
        }
        if (i10 == 2) {
            return n(d0Var);
        }
        if (i10 == 3) {
            return l(d0Var);
        }
        if (i10 == 8) {
            return k(d0Var);
        }
        if (i10 == 10) {
            return m(d0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return i(d0Var);
    }

    private static Date i(d0 d0Var) {
        Date date = new Date((long) j(d0Var).doubleValue());
        d0Var.X(2);
        return date;
    }

    private static Double j(d0 d0Var) {
        return Double.valueOf(Double.longBitsToDouble(d0Var.A()));
    }

    private static HashMap k(d0 d0Var) {
        int iL = d0Var.L();
        HashMap map = new HashMap(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            String strN = n(d0Var);
            Object objH = h(d0Var, o(d0Var));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static HashMap l(d0 d0Var) {
        HashMap map = new HashMap();
        while (true) {
            String strN = n(d0Var);
            int iO = o(d0Var);
            if (iO == 9) {
                return map;
            }
            Object objH = h(d0Var, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    private static ArrayList m(d0 d0Var) {
        int iL = d0Var.L();
        ArrayList arrayList = new ArrayList(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            Object objH = h(d0Var, o(d0Var));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(d0 d0Var) {
        int iP = d0Var.P();
        int iF = d0Var.f();
        d0Var.X(iP);
        return new String(d0Var.e(), iF, iP);
    }

    private static int o(d0 d0Var) {
        return d0Var.H();
    }

    @Override // ua.e
    protected boolean b(d0 d0Var) {
        return true;
    }

    @Override // ua.e
    protected boolean c(d0 d0Var, long j10) {
        if (o(d0Var) != 2 || !"onMetaData".equals(n(d0Var)) || d0Var.a() == 0 || o(d0Var) != 8) {
            return false;
        }
        HashMap mapK = k(d0Var);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f105354b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f105355c = new long[size];
                this.f105356d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f105355c = new long[0];
                        this.f105356d = new long[0];
                        break;
                    }
                    this.f105355c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f105356d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f105354b;
    }

    public long[] e() {
        return this.f105356d;
    }

    public long[] f() {
        return this.f105355c;
    }
}
