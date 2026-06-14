package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<Rect> f104510a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f104513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f104514b;

        a(int i10, int i11) {
            this.f104513a = i10;
            this.f104514b = i11;
        }

        final boolean a(a aVar) {
            return this.f104513a <= aVar.f104514b && this.f104514b >= aVar.f104513a;
        }

        public final String toString() {
            return String.format("Range: %s - %s", Integer.valueOf(this.f104513a), Integer.valueOf(this.f104514b));
        }
    }

    m(List<Rect> list, int[] iArr) {
        List<Integer> listA = a(list);
        this.f104510a = new ArrayList();
        int i10 = 0;
        while (i10 < listA.size() - 1) {
            int iIntValue = listA.get(i10).intValue();
            i10++;
            int iIntValue2 = listA.get(i10).intValue();
            if (iIntValue < iIntValue2) {
                a aVar = new a(iIntValue, iIntValue2);
                this.f104510a.addAll(b(aVar, a(aVar, list)));
            }
        }
        Collections.sort(this.f104510a, new Comparator<Rect>() { // from class: sg.bigo.ads.core.mraid.m.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Rect rect, Rect rect2) {
                Rect rect3 = rect;
                Rect rect4 = rect2;
                return (rect3.width() * rect3.height()) - (rect4.width() * rect4.height());
            }
        });
        Iterator<Rect> it = this.f104510a.iterator();
        while (it.hasNext()) {
            it.next().offset(-iArr[0], -iArr[1]);
        }
    }

    private static List<Rect> b(a aVar, List<a> list) {
        ArrayList arrayList = new ArrayList();
        for (a aVar2 : list) {
            arrayList.add(new Rect(aVar.f104513a, aVar2.f104513a, aVar.f104514b, aVar2.f104514b));
        }
        return arrayList;
    }

    final float a() {
        float fWidth = 0.0f;
        for (Rect rect : this.f104510a) {
            fWidth += rect.width() * rect.height();
        }
        return fWidth;
    }

    private List<Integer> a(List<Rect> list) {
        ArrayList arrayList = new ArrayList();
        for (Rect rect : list) {
            arrayList.add(Integer.valueOf(rect.left));
            arrayList.add(Integer.valueOf(rect.right));
        }
        Collections.sort(arrayList, new Comparator<Integer>() { // from class: sg.bigo.ads.core.mraid.m.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Integer num, Integer num2) {
                return num.intValue() - num2.intValue();
            }
        });
        return arrayList;
    }

    private static List<a> a(List<a> list, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            a aVar2 = list.get(i10);
            if (!aVar.a(aVar2)) {
                arrayList.add(aVar2);
            } else if (aVar.a(aVar2)) {
                int i11 = aVar.f104513a;
                int i12 = aVar2.f104513a;
                if (i11 >= i12) {
                    i11 = i12;
                }
                int i13 = aVar.f104514b;
                int i14 = aVar2.f104514b;
                if (i13 <= i14) {
                    i13 = i14;
                }
                aVar = new a(i11, i13);
            }
        }
        arrayList.add(aVar);
        return arrayList;
    }

    private static List<a> a(a aVar, List<Rect> list) {
        List<a> arrayList = new ArrayList<>();
        for (Rect rect : list) {
            if (aVar.f104513a < rect.right && aVar.f104514b > rect.left) {
                arrayList = a(arrayList, new a(rect.top, rect.bottom));
            }
        }
        return arrayList;
    }
}
