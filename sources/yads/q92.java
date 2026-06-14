package yads;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class q92 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        cj3 cj3Var = qi3.f115019a;
        ViewParent parent = view.getParent();
        ?? r22 = view;
        ?? r12 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        while (r12 != 0) {
            int childCount = r12.getChildCount();
            for (int iIndexOfChild = r12.indexOfChild(r22) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                arrayList.addAll(b(r12.getChildAt(iIndexOfChild)));
            }
            ViewParent parent2 = r12.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            r22 = r12;
            r12 = viewGroup;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (view.getZ() <= ((View) obj).getZ()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static List b(View view) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (!qi3.b(view)) {
            if (!(view instanceof ViewGroup) || qi3.c(view)) {
                listCreateListBuilder.add(view);
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    listCreateListBuilder2.addAll(b(viewGroup.getChildAt(i10)));
                }
                listCreateListBuilder.addAll(CollectionsKt.build(listCreateListBuilder2));
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
