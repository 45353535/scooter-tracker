package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f65279d = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f65280a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f65281b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f65282c = new HashMap();

    public final synchronized void a(s sVar) {
        try {
            this.f65280a.add(0, sVar);
            List arrayList = (List) this.f65281b.get(sVar.f65232b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f65281b.put(sVar.f65232b, arrayList);
            }
            arrayList.add(0, sVar);
            List arrayList2 = (List) this.f65282c.get(sVar.f65233c);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.f65282c.put(sVar.f65233c, arrayList2);
            }
            arrayList2.add(0, sVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
