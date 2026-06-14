package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ys0 f112569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cj f112570b;

    public /* synthetic */ k31() {
        this(new ys0(), new cj());
    }

    public final Set a(List list) {
        Object next;
        List listEmptyList;
        m0 m0Var;
        List listEmptyList2;
        oh0 oh0Var;
        List list2;
        Object next2;
        this.f112570b.getClass();
        Set mutableSet = CollectionsKt.toMutableSet(cj.a(list));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((gi) next).f111213a, "feedback")) {
                break;
            }
        }
        gi giVar = (gi) next;
        this.f112569a.getClass();
        if ((giVar != null ? giVar.f111215c : null) instanceof bt0) {
            List listListOfNotNull = CollectionsKt.listOfNotNull(((bt0) giVar.f111215c).f109095a);
            td1 td1Var = giVar.f111216d;
            if (td1Var == null || (list2 = td1Var.f116205a) == null) {
                m0Var = null;
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(((m0) next2).a(), "divkit_adtune")) {
                        break;
                    }
                }
                m0Var = (m0) next2;
            }
            zg0 zg0Var = m0Var instanceof zg0 ? (zg0) m0Var : null;
            if (zg0Var == null || (oh0Var = zg0Var.f118658b) == null || (listEmptyList2 = oh0Var.f114320d) == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            listEmptyList = CollectionsKt.plus((Collection) listListOfNotNull, (Iterable) listEmptyList2);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        mutableSet.addAll(listEmptyList);
        return mutableSet;
    }

    public k31(ys0 ys0Var, cj cjVar) {
        this.f112569a = ys0Var;
        this.f112570b = cjVar;
    }
}
