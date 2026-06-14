package yads;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f115813a = lf.i.a(rh3.f115452b);

    public static final void a(final ViewGroup viewGroup, final boolean z10) {
        ((Handler) f115813a.getValue()).post(new Runnable() { // from class: yads.eq0
            @Override // java.lang.Runnable
            public final void run() {
                sh3.b(viewGroup, z10);
            }
        });
    }

    public static final void b(ViewGroup viewGroup, boolean z10) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z10 ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof oo) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((oo) arrayList.get(i11)).c();
        }
        arrayList.clear();
    }
}
