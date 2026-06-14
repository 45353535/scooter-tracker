package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class aq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f108749a;

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bp1 bp1Var = (bp1) it.next();
            List<ap1> list2 = bp1Var.f109079c;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (ap1 ap1Var : list2) {
                try {
                    androidx.privacysandbox.ads.adservices.topics.a.a(jk2.a(ap1Var.f108747b, new Object[0]));
                } catch (Exception unused) {
                }
                arrayList2.add(new mp1(ap1Var.f108746a, null, false));
            }
            String str = this.f108749a;
            this.f108749a = null;
            arrayList.add(new np1(bp1Var.f109077a, bp1Var.f109078b.f116339b, str, arrayList2));
        }
        return arrayList;
    }
}
