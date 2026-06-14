package yads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class pq2 extends z23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f114746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f114747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f114748d;

    public pq2() {
        super(new wj0());
        this.f114746b = -9223372036854775807L;
        this.f114747c = new long[0];
        this.f114748d = new long[0];
    }

    public static String b(w92 w92Var) {
        int iR = w92Var.r();
        int i10 = w92Var.f117357b;
        w92Var.e(i10 + iR);
        return new String(w92Var.f117356a, i10, iR);
    }

    public final boolean a(long j10, w92 w92Var) {
        if (w92Var.m() != 2 || !"onMetaData".equals(b(w92Var)) || w92Var.f117358c - w92Var.f117357b == 0 || w92Var.m() != 8) {
            return false;
        }
        HashMap mapA = a(w92Var);
        Object obj = mapA.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f114746b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapA.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f114747c = new long[size];
                this.f114748d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f114747c = new long[0];
                        this.f114748d = new long[0];
                        break;
                    }
                    this.f114747c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f114748d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public static Serializable a(int i10, w92 w92Var) {
        if (i10 == 8) {
            return a(w92Var);
        }
        if (i10 == 10) {
            int iP = w92Var.p();
            ArrayList arrayList = new ArrayList(iP);
            for (int i11 = 0; i11 < iP; i11++) {
                Serializable serializableA = a(w92Var.m(), w92Var);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        if (i10 == 11) {
            Date date = new Date((long) Double.longBitsToDouble(w92Var.i()));
            w92Var.e(w92Var.f117357b + 2);
            return date;
        }
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(w92Var.i()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(w92Var.m() == 1);
        }
        if (i10 == 2) {
            return b(w92Var);
        }
        if (i10 != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            String strB = b(w92Var);
            int iM = w92Var.m();
            if (iM == 9) {
                return map;
            }
            Serializable serializableA2 = a(iM, w92Var);
            if (serializableA2 != null) {
                map.put(strB, serializableA2);
            }
        }
    }

    public static HashMap a(w92 w92Var) {
        int iP = w92Var.p();
        HashMap map = new HashMap(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            String strB = b(w92Var);
            Serializable serializableA = a(w92Var.m(), w92Var);
            if (serializableA != null) {
                map.put(strB, serializableA);
            }
        }
        return map;
    }
}
