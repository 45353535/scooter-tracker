package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class Jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ll f76008a;

    public Jl(Ll ll) {
        this.f76008a = ll;
    }

    public final void a(String str, Nl nl, C5204jm c5204jm) {
        ArrayList arrayList;
        synchronized (this.f76008a.f76095b) {
            try {
                Collection collection = (Collection) this.f76008a.f76094a.f78497a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ul) it.next()).a(nl, c5204jm);
        }
    }
}
