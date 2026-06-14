package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5161i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f77368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5213k5 f77369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f77370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5518wa f77371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f77372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5338p4 f77373f;

    public C5161i4(Context context, C5213k5 c5213k5) {
        this(context, c5213k5, new C5338p4());
    }

    public final InterfaceC5263m4 a(X3 x32, C5512w4 c5512w4) {
        InterfaceC5263m4 interfaceC5263m4A;
        synchronized (this.f77368a) {
            try {
                interfaceC5263m4A = (InterfaceC5263m4) this.f77370c.get(x32);
                if (interfaceC5263m4A == null) {
                    this.f77373f.getClass();
                    interfaceC5263m4A = C5338p4.a(x32).a(this.f77372e, this.f77369b, x32, c5512w4);
                    this.f77370c.put(x32, interfaceC5263m4A);
                    this.f77371d.a(new C5135h4(x32.f76658b, x32.f76659c, x32.f76660d), x32);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC5263m4A;
    }

    public C5161i4(Context context, C5213k5 c5213k5, C5338p4 c5338p4) {
        this.f77368a = new Object();
        this.f77370c = new HashMap();
        this.f77371d = new C5518wa();
        this.f77372e = context.getApplicationContext();
        this.f77369b = c5213k5;
        this.f77373f = c5338p4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f77368a) {
            try {
                C5518wa c5518wa = this.f77371d;
                Collection collection = (Collection) c5518wa.f78497a.remove(new C5135h4(str, num, str2));
                if (!no.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC5263m4) this.f77370c.remove((X3) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC5263m4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
