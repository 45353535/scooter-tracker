package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class bh3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f109006c = CollectionsKt.listOf((Object[]) new String[]{"clickTracking", "impression"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af3 f109007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i83 f109008b;

    public bh3(Context context) {
        this.f109007a = new af3(context);
        this.f109008b = new i83(context);
    }

    public final void a(ah3 ah3Var, String str) {
        List list = (List) ah3Var.a().get(str);
        if (f109006c.contains(str)) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f109008b.a((String) it.next()));
                }
                list = arrayList;
            } else {
                list = null;
            }
        }
        if (list != null) {
            this.f109007a.a(list, null);
        }
    }
}
