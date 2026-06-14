package com.my.target;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f60893a = new HashMap();

    public interface a {
        void a();

        void a(Object obj);
    }

    public void a(String str, Object obj) {
        synchronized (this.f60893a) {
            try {
                List list = (List) this.f60893a.get(str);
                if (list == null) {
                    return;
                }
                if (obj == null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).a(obj);
                    }
                }
                this.f60893a.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(String str, a aVar) {
        boolean z10;
        synchronized (this.f60893a) {
            try {
                if (this.f60893a.containsKey(str)) {
                    List list = (List) this.f60893a.get(str);
                    if (list != null) {
                        list.add(aVar);
                    }
                    z10 = true;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    this.f60893a.put(str, arrayList);
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }
}
