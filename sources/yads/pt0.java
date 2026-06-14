package yads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pt0 implements ca2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ca2 f114769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f114770b;

    public pt0(ca2 ca2Var, List list) {
        this.f114769a = ca2Var;
        this.f114770b = list;
    }

    @Override // yads.ca2
    public final Object a(Uri uri, e30 e30Var) {
        ot0 ot0Var = (ot0) this.f114769a.a(uri, e30Var);
        List list = this.f114770b;
        if (list == null || list.isEmpty()) {
            return ot0Var;
        }
        List list2 = this.f114770b;
        p20 p20Var = (p20) ot0Var;
        p20Var.getClass();
        LinkedList linkedList = new LinkedList(list2);
        Collections.sort(linkedList);
        linkedList.add(new h13(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= p20Var.f114538m.size()) {
                break;
            }
            if (((h13) linkedList.peek()).f111438b != i10) {
                long jB = p20Var.b(i10);
                if (jB != -9223372036854775807L) {
                    j10 += jB;
                }
            } else {
                sa2 sa2Var = (sa2) p20Var.f114538m.get(i10);
                List list3 = sa2Var.f115732c;
                h13 h13Var = (h13) linkedList.poll();
                int i11 = h13Var.f111438b;
                ArrayList arrayList2 = new ArrayList();
                do {
                    int i12 = h13Var.f111439c;
                    xb xbVar = (xb) list3.get(i12);
                    List list4 = xbVar.f117770c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((gm2) list4.get(h13Var.f111440d));
                        h13Var = (h13) linkedList.poll();
                        if (h13Var.f111438b != i11) {
                            break;
                        }
                    } while (h13Var.f111439c == i12);
                    arrayList2.add(new xb(xbVar.f117768a, xbVar.f117769b, arrayList3, xbVar.f117771d, xbVar.f117772e, xbVar.f117773f));
                } while (h13Var.f111438b == i11);
                linkedList.addFirst(h13Var);
                arrayList.add(new sa2(sa2Var.f115730a, sa2Var.f115731b - j10, arrayList2, sa2Var.f115733d));
            }
            i10++;
        }
        long j11 = p20Var.f114527b;
        return new p20(p20Var.f114526a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, p20Var.f114528c, p20Var.f114529d, p20Var.f114530e, p20Var.f114531f, p20Var.f114532g, p20Var.f114533h, p20Var.f114537l, p20Var.f114534i, p20Var.f114535j, p20Var.f114536k, arrayList);
    }
}
