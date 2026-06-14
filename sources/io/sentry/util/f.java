package io.sentry.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
                throw null;
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}
