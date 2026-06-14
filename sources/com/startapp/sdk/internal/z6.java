package com.startapp.sdk.internal;

import com.ironsource.C4240b4;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.EventTracerMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes11.dex */
public final class z6 implements y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f65667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f65668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f65669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f65670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f65671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f65672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f65673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f65674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f65675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f65676j;

    static {
        Intrinsics.checkNotNullExpressionValue(z6.class.getSimpleName(), "getSimpleName(...)");
    }

    public z6(f3 clock, final kb metadataRef, final lb executorRef, Function2 sendReport) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(metadataRef, "metadataRef");
        Intrinsics.checkNotNullParameter(executorRef, "executorRef");
        Intrinsics.checkNotNullParameter(sendReport, "sendReport");
        this.f65667a = clock;
        this.f65668b = sendReport;
        this.f65669c = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.kn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(z6.a(metadataRef, this));
            }
        });
        this.f65670d = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.ln
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(z6.d(metadataRef));
            }
        });
        this.f65671e = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.mn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z6.e(metadataRef);
            }
        });
        this.f65672f = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.nn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z6.c(metadataRef);
            }
        });
        this.f65673g = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.on
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z6.a(metadataRef);
            }
        });
        this.f65674h = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.pn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z6.b(metadataRef);
            }
        });
        this.f65675i = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.qn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z6.a(executorRef);
            }
        });
        this.f65676j = new ArrayList();
    }

    public static final String a(kb metadataRef) {
        String strB;
        Intrinsics.checkNotNullParameter(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f64826a.a()).get();
        if (eventTracerMetadata == null || (strB = eventTracerMetadata.b()) == null) {
            return "[=,:;]";
        }
        if (strB.length() < 6) {
            strB = null;
        }
        return strB == null ? "[=,:;]" : strB;
    }

    public static final String b(kb metadataRef) {
        String strC;
        Intrinsics.checkNotNullParameter(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f64826a.a()).get();
        if (eventTracerMetadata == null || (strC = eventTracerMetadata.c()) == null) {
            return "_";
        }
        if (strC.length() < 1) {
            strC = null;
        }
        return strC == null ? "_" : strC;
    }

    public static final String c(kb metadataRef) {
        String strA;
        Intrinsics.checkNotNullParameter(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f64826a.a()).get();
        if (eventTracerMetadata == null || (strA = eventTracerMetadata.a()) == null) {
            return "=,:;";
        }
        if (strA.length() < 4) {
            strA = null;
        }
        return strA == null ? "=,:;" : strA;
    }

    public static final int d(kb metadataRef) {
        int iE;
        Intrinsics.checkNotNullParameter(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f64826a.a()).get();
        if (eventTracerMetadata == null || (iE = eventTracerMetadata.e()) < 1) {
            return Integer.MAX_VALUE;
        }
        return iE;
    }

    public static final Set e(kb metadataRef) {
        Set setF;
        Intrinsics.checkNotNullParameter(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f64826a.a()).get();
        return (eventTracerMetadata == null || (setF = eventTracerMetadata.f()) == null) ? SetsKt.emptySet() : setF;
    }

    public final void a(Object emitterObj, Object relativeEmitterObject) {
        Intrinsics.checkNotNullParameter(emitterObj, "emitterObj");
        Intrinsics.checkNotNullParameter(relativeEmitterObject, "relativeEmitterObject");
        if (((Boolean) this.f65669c.getValue()).booleanValue()) {
            synchronized (this.f65676j) {
                try {
                    ArrayList arrayList = this.f65676j;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        a7 a7Var = (a7) obj;
                        a7Var.getClass();
                        Intrinsics.checkNotNullParameter(emitterObj, "emitterObj");
                        if (a7Var.f64257c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((a7) it.next()).a(emitterObj, relativeEmitterObject);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b(Object obj, hi startEvent) {
        Intrinsics.checkNotNullParameter(obj, "rootEmitterObj");
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        if (((Boolean) this.f65669c.getValue()).booleanValue()) {
            synchronized (this.f65676j) {
                try {
                    ArrayList arrayList = this.f65676j;
                    ArrayList<a7> arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        a7 a7Var = (a7) obj2;
                        a7Var.getClass();
                        Intrinsics.checkNotNullParameter(obj, "emitterObj");
                        x6 x6Var = a7Var.f64257c;
                        x6Var.getClass();
                        Intrinsics.checkNotNullParameter(obj, "obj");
                        if (x6Var.f65527a.get() == obj && Intrinsics.areEqual(a7Var.f64255a, startEvent)) {
                            arrayList2.add(obj2);
                        }
                    }
                    for (a7 a7Var2 : arrayList2) {
                        Function2 block = new Function2() { // from class: com.startapp.sdk.internal.rn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                return z6.a(this.f65230b, (List) obj3, (Map) obj4);
                            }
                        };
                        a7Var2.getClass();
                        Intrinsics.checkNotNullParameter(obj, "rootEmitterObj");
                        Intrinsics.checkNotNullParameter(block, "block");
                        x6 x6Var2 = a7Var2.f64257c;
                        x6Var2.getClass();
                        Intrinsics.checkNotNullParameter(obj, "obj");
                        if (x6Var2.f65527a.get() == obj) {
                            block.invoke(a7Var2.f64258d, a7Var2.f64259e);
                        }
                        this.f65676j.remove(a7Var2);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(Object emitterObj, hi event) {
        Intrinsics.checkNotNullParameter(emitterObj, "emitterObj");
        Intrinsics.checkNotNullParameter(event, "event");
        if (((Boolean) this.f65669c.getValue()).booleanValue()) {
            synchronized (this.f65676j) {
                try {
                    ArrayList arrayList = this.f65676j;
                    ArrayList<a7> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        a7 a7Var = (a7) obj;
                        a7Var.getClass();
                        Intrinsics.checkNotNullParameter(emitterObj, "emitterObj");
                        if (a7Var.f64257c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (a7 a7Var2 : arrayList2) {
                        a7Var2.getClass();
                        Intrinsics.checkNotNullParameter(emitterObj, "emitterObj");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (a7Var2.f64257c.a(emitterObj)) {
                            a7Var2.f64258d.add(new Pair(event, Long.valueOf(a7Var2.f64256b.a())));
                        }
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final boolean a(kb metadataRef, z6 this$0) {
        EnabledConfig enabledConfigD;
        Intrinsics.checkNotNullParameter(metadataRef, "$metadataRef");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        f3 f3Var = this$0.f65667a;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f64826a.a()).get();
        return (eventTracerMetadata == null || (enabledConfigD = eventTracerMetadata.d()) == null || !enabledConfigD.a(f3Var)) ? false : true;
    }

    public final boolean a(Object obj, hi event) {
        Intrinsics.checkNotNullParameter(obj, "rootEmitterObj");
        Intrinsics.checkNotNullParameter(event, "startEvent");
        boolean z10 = false;
        if (!((Boolean) this.f65669c.getValue()).booleanValue() || !((Set) this.f65671e.getValue()).contains(event.f64651a)) {
            return false;
        }
        synchronized (this.f65676j) {
            try {
                if (this.f65676j.size() < ((Number) this.f65670d.getValue()).intValue()) {
                    ArrayList<a7> arrayList = this.f65676j;
                    if (!androidx.activity.s.a(arrayList) || !arrayList.isEmpty()) {
                        for (a7 a7Var : arrayList) {
                            a7Var.getClass();
                            Intrinsics.checkNotNullParameter(obj, "emitterObj");
                            x6 x6Var = a7Var.f64257c;
                            x6Var.getClass();
                            Intrinsics.checkNotNullParameter(obj, "obj");
                            if (x6Var.f65527a.get() == obj && Intrinsics.areEqual(a7Var.f64255a, event)) {
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = this.f65676j;
                    f3 f3Var = this.f65667a;
                    a7 a7Var2 = new a7(obj, event, f3Var);
                    Intrinsics.checkNotNullParameter(obj, "emitterObj");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (a7Var2.f64257c.a(obj)) {
                        a7Var2.f64258d.add(new Pair(event, Long.valueOf(f3Var.a())));
                    }
                    if (arrayList2.add(a7Var2)) {
                        z10 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static final void b(z6 this$0, List events, Map data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(events, "$events");
        Intrinsics.checkNotNullParameter(data, "$data");
        this$0.getClass();
        if (events.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = ((String) this$0.f65672f.getValue()).charAt(0);
        char cCharAt2 = ((String) this$0.f65672f.getValue()).charAt(1);
        char cCharAt3 = ((String) this$0.f65672f.getValue()).charAt(2);
        char cCharAt4 = ((String) this$0.f65672f.getValue()).charAt(3);
        Iterator it = events.iterator();
        long j10 = 0;
        String str = null;
        long j11 = 0;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str2 = ((hi) pair.getFirst()).f64651a;
            long jLongValue = ((Number) pair.getSecond()).longValue();
            if (str == null) {
                str = str2;
                j11 = jLongValue;
            } else {
                sb2.append(str2);
                sb2.append(cCharAt);
                sb2.append(jLongValue - j10);
                sb2.append(cCharAt2);
            }
            j10 = jLongValue;
        }
        if (str == null) {
            return;
        }
        sb2.append(C4240b4.i.f42636l);
        sb2.append(cCharAt);
        sb2.append(j10 - j11);
        sb2.append(cCharAt4);
        for (Map.Entry entry : data.entrySet()) {
            hi hiVar = (hi) entry.getKey();
            List<Pair> list = (List) entry.getValue();
            sb2.append(hiVar.f64651a);
            char c10 = cCharAt3;
            for (Pair pair2 : list) {
                String strReplace = new Regex((String) this$0.f65673g.getValue()).replace((CharSequence) pair2.getFirst(), (String) this$0.f65674h.getValue());
                long jLongValue2 = ((Number) pair2.getSecond()).longValue() - j11;
                sb2.append(c10);
                sb2.append(strReplace);
                sb2.append(cCharAt);
                sb2.append(jLongValue2);
                c10 = cCharAt2;
            }
            sb2.append(cCharAt4);
        }
        Function2 function2 = this$0.f65668b;
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        function2.invoke(str, string);
    }

    public final void a(p8 emitterObj, HashMap keyValues) {
        Intrinsics.checkNotNullParameter(emitterObj, "emitterObj");
        Intrinsics.checkNotNullParameter(keyValues, "keyValues");
        if (((Boolean) this.f65669c.getValue()).booleanValue()) {
            synchronized (this.f65676j) {
                try {
                    ArrayList arrayList = this.f65676j;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        a7 a7Var = (a7) obj;
                        a7Var.getClass();
                        Intrinsics.checkNotNullParameter(emitterObj, "emitterObj");
                        if (a7Var.f64257c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((a7) it.next()).a(emitterObj, keyValues);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final Executor a(lb executorRef) {
        Intrinsics.checkNotNullParameter(executorRef, "$executorRef");
        return (Executor) executorRef.a();
    }

    public static final Unit a(final z6 this$0, final List events, final Map data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(data, "data");
        Object value = this$0.f65675i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Executor) value).execute(new Runnable() { // from class: com.startapp.sdk.internal.sn
            @Override // java.lang.Runnable
            public final void run() {
                z6.b(this.f65276b, events, data);
            }
        });
        return Unit.f93236a;
    }
}
