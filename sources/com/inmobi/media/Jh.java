package com.inmobi.media;

import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.I2;
import com.inmobi.media.Jh;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.taurusx.tax.y.z.w.s;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Jh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Jb f37149b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ab f37148a = Ab.f36563c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f37150c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ih f37151d = new Ih();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f37152e = new ReentrantLock();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Function1 f37153f = new Function1() { // from class: w3.c2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Jh.a((I2) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ReferenceQueue f37154g = new ReferenceQueue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap f37155h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f37156i = new AtomicBoolean(false);

    public static final Unit a(I2 it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = it.f37045a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                case 151:
                case 152:
                    Map map = it.f37047c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = it.f37047c.get("data");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        a((Q9) obj);
                    }
                    break;
            }
        } else {
            a(i10);
            f37150c.set(false);
            ((C4155xc) Ji.f37161e.getValue()).a(f37153f);
            f37149b = null;
        }
        return Unit.f93236a;
    }

    public static void b() {
        if (f37149b != null) {
            return;
        }
        ReentrantLock reentrantLock = f37152e;
        if (reentrantLock.tryLock()) {
            try {
                if (f37149b == null && f37150c.get()) {
                    Context context = Ji.f37157a;
                    if (context != null) {
                        C3774i4 c3774i4 = Y3.f38021a;
                        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                        TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class)).getLoggingConfig();
                        f37149b = new Jb(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * ((long) 1000), loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    Jb jb2 = f37149b;
                    if (jb2 != null) {
                        AbstractC3978q9.a(jb2);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                f37152e.unlock();
                throw th2;
            }
        }
    }

    public static final void c() throws InterruptedException {
        while (f37150c.get()) {
            a();
        }
    }

    public static void a(Object obj, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        try {
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            if (((TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC3878m9 != null) {
                    f37155h.put(new PhantomReference(obj, f37154g), new Pair(obj.toString(), new WeakReference(interfaceC3878m9)));
                    if (f37156i.getAndSet(true)) {
                        return;
                    }
                    CoroutineScope coroutineScope = Sb.f37702a;
                    Runnable runnable = new Runnable() { // from class: w3.d2
                        @Override // java.lang.Runnable
                        public final void run() throws InterruptedException {
                            Jh.c();
                        }
                    };
                    Intrinsics.checkNotNullParameter("RemoteLoggerComponent", s.z.f67720z);
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    try {
                        eg.i.d(Sb.f37702a, null, null, new Ob(runnable, null), 3, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static C3903n9 a(String logType, String placementType) {
        Intrinsics.checkNotNullParameter(logType, "logType");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Context context = Ji.f37157a;
        if (context != null) {
            try {
                b();
                C3774i4 c3774i4 = Y3.f38021a;
                Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) Y3.f38021a.a(TelemetryConfig.class)).getLoggingConfig();
                double dB = b(logType, placementType, loggingConfig);
                Ab logLevel = a(logType, placementType, loggingConfig);
                boolean z10 = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * ((long) 1000);
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(logLevel, "logLevel");
                return new C3903n9(context, dB, logLevel, z10, maxNoOfEntries, expiry);
            } catch (Exception e10) {
                Lazy lazy = P9.f37527a;
                AbstractC3779i9.a(e10);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Ab a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Bb.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Bb.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Bb.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return Bb.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (Intrinsics.areEqual(str2, "AB")) {
                        return Bb.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return Bb.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return Bb.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f37148a;
    }

    public static void a() throws InterruptedException {
        WeakReference weakReference;
        InterfaceC3878m9 interfaceC3878m9;
        Reference referenceRemove = f37154g.remove();
        ConcurrentHashMap concurrentHashMap = f37155h;
        if (CollectionsKt.contains(concurrentHashMap.keySet(), referenceRemove)) {
            Pair pair = (Pair) concurrentHashMap.get(referenceRemove);
            if (pair != null && (weakReference = (WeakReference) pair.getSecond()) != null && (interfaceC3878m9 = (InterfaceC3878m9) weakReference.get()) != null) {
                ((C3903n9) interfaceC3878m9).a("ReferenceTracker", " reference " + pair.getFirst() + " reference is GCed.");
            }
            kotlin.jvm.internal.b1.d(concurrentHashMap).remove(referenceRemove);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) ((Pair) entry.getValue()).getSecond()).get() == null) {
                f37155h.remove(entry.getKey());
            }
        }
    }

    public static void a(Q9 incident) throws JSONException {
        Intrinsics.checkNotNullParameter(incident, "incident");
        if (!(incident instanceof T4) && !(incident instanceof Wn)) {
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
            C3774i4 c3774i42 = Y3.f38021a;
            if (((CrashConfig) c3774i42.a(CrashConfig.class)).getAnr().getAppExitReason().getReportToLogs() && (incident instanceof C4194z1)) {
                Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
                Y9 y92 = new Y9(((CrashConfig) c3774i42.a(CrashConfig.class)).getAnr().getAppExitReason().getIncompleteLogThresholdTime());
                String message = incident.f38734a;
                String str = incident.f38735b;
                String exitData = str == null ? "" : str;
                int i10 = ((C4194z1) incident).f40026g;
                long j10 = incident.f38736c;
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(exitData, "exitData");
                CoroutineScope coroutineScope = Sb.f37702a;
                Rb.a(new X9(y92, j10, message, i10, exitData, null));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3978q9.f39363a;
        ArrayList<Ei> arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f37360a;
        Iterator it = Lb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Ei((Gh) it.next()));
        }
        for (Ei ei : arrayList) {
            Ab logLevel = Ab.f36563c;
            String str2 = incident.f38734a;
            long j11 = incident.f38736c;
            String str3 = incident.f38735b;
            if (str3 == null) {
                str3 = "";
            }
            String message2 = "TYPE - " + str2 + ", TIMESTAMP - " + j11 + ", PAYLOAD - " + str3;
            ei.getClass();
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("LOGGER CRASH", s.z.f67720z);
            Intrinsics.checkNotNullParameter(message2, "message");
            ei.f36806a.a(logLevel, "LOGGER CRASH", message2);
            if (incident instanceof T4) {
                ei.f36806a.b();
            }
        }
    }

    public static void a(int i10) throws JSONException {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3978q9.f39363a;
        ArrayList<Ei> arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f37360a;
        Iterator it = Lb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Ei((Gh) it.next()));
        }
        for (Ei ei : arrayList) {
            Ab logLevel = Ab.f36563c;
            String message = "SYSTEM SHUTDOWN RECEIVED - " + i10;
            ei.getClass();
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("LOGGER CRASH", s.z.f67720z);
            Intrinsics.checkNotNullParameter(message, "message");
            ei.f36806a.a(logLevel, "LOGGER CRASH", message);
            ei.f36806a.b();
        }
        f37150c.set(false);
        ((C4155xc) Ji.f37161e.getValue()).a(f37153f);
        f37149b = null;
    }
}
