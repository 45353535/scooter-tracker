package com.inmobi.media;

import com.inmobi.media.C4155xc;
import com.inmobi.media.I2;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4155xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f39923a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f39924b;

    public C4155xc() {
        Intrinsics.checkNotNullParameter("MultiEventBus", "name");
        this.f39924b = Executors.newSingleThreadExecutor(new B9("MultiEventBus", false));
    }

    public static final void a(I2 i22, C4155xc c4155xc) {
        int i10 = i22.f37045a;
        c4155xc.a(i22);
    }

    public final void b(final I2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            this.f39924b.execute(new Runnable() { // from class: w3.dd
                @Override // java.lang.Runnable
                public final void run() {
                    C4155xc.a(event, this);
                }
            });
        } catch (InternalError unused) {
            int i10 = event.f37045a;
            a(event);
        }
    }

    public static final boolean a(int[] iArr, I2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ArraysKt.contains(iArr, event.f37045a);
    }

    public final void a(final int[] eventIds, Function1 subscriber) {
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.f39923a.put(new Function1() { // from class: w3.ed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C4155xc.a(eventIds, (I2) obj));
            }
        }, new WeakReference(subscriber));
    }

    public final void a(Function1 subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Iterator it = this.f39923a.entrySet().iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(I2 i22) {
        Function1 function1;
        Set<Map.Entry> setEntrySet = this.f39923a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f39923a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.f39923a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : setEntrySet2) {
            Intrinsics.checkNotNull(entry2);
            Object key = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            Function1 function12 = (Function1) key;
            Object value = entry2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) function12.invoke(i22)).booleanValue() && (function1 = (Function1) weakReference.get()) != null) {
                    function1.invoke(i22);
                }
            } catch (Exception e10) {
                Lazy lazy = P9.f37527a;
                AbstractC3779i9.a(e10);
            }
        }
    }
}
