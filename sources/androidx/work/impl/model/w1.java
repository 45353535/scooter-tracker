package androidx.work.impl.model;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class w1 {
    public static void a(WorkTagDao workTagDao, String id2, Set tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            workTagDao.insert(new WorkTag((String) it.next(), id2));
        }
    }
}
