package yads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d72 {
    public static r62 a(km2 km2Var, long j10, List list) {
        cr crVar = km2Var.f112776p;
        if (crVar == null) {
            return new r62(304, null, r62.a(list), list, true);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((bz0) it.next()).f109154a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = crVar.f109530h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (bz0 bz0Var : crVar.f109530h) {
                    if (!treeSet.contains(bz0Var.f109154a)) {
                        arrayList.add(bz0Var);
                    }
                }
            }
        } else if (!crVar.f109529g.isEmpty()) {
            for (Map.Entry entry : crVar.f109529g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new bz0((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new r62(304, crVar.f109523a, r62.a(arrayList), arrayList, true);
    }

    public static byte[] a(InputStream inputStream, int i10, xq xqVar) throws Throwable {
        byte[] bArrA;
        xd2 xd2Var = new xd2(xqVar, i10);
        try {
            bArrA = xqVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    xd2Var.write(bArrA, 0, i11);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z10 = rj3.f115467a;
                        boolean z11 = lb1.f113032a;
                    }
                    xqVar.a(bArrA);
                    xd2Var.close();
                    throw th;
                }
            }
            byte[] byteArray = xd2Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z12 = rj3.f115467a;
                boolean z13 = lb1.f113032a;
            }
            xqVar.a(bArrA);
            xd2Var.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }
}
