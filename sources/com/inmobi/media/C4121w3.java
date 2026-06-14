package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.inmobi.media.C4121w3;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4121w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4121w3 f39816a = new C4121w3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f39817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static CoroutineScope f39818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerC3723g3 f39819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HandlerThread f39820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static List f39821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f39822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f39823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f39824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f39825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Function1 f39826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C4046t3 f39827l;

    static {
        String TAG = C4121w3.class.getSimpleName();
        f39817b = lf.i.a(new Function0() { // from class: w3.cc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4121w3.b();
            }
        });
        f39821f = new ArrayList();
        f39822g = new AtomicBoolean(false);
        f39823h = new AtomicBoolean(true);
        f39824i = new Object();
        f39825j = new LinkedHashMap();
        f39826k = new Function1() { // from class: w3.dc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4121w3.a((I2) obj);
            }
        };
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Runnable runnable = new Runnable() { // from class: w3.ec
            @Override // java.lang.Runnable
            public final void run() {
                C4121w3.a();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
        f39827l = new C4046t3();
    }

    public static final Unit a(I2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = event.f37045a;
        if (i10 == 1 || i10 == 2) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            f39823h.set(false);
        } else if (i10 != 10) {
            if (i10 != 11) {
                Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            } else if (!Boolean.parseBoolean(event.f37046b)) {
                f();
            }
        } else if (Intrinsics.areEqual("available", event.f37046b)) {
            f();
        }
        return Unit.f93236a;
    }

    public static final void b(S2 s22) {
        int i10 = s22.f37689f;
        if (i10 > 0) {
            s22.f37689f = i10 - 1;
            s22.f37690g = System.currentTimeMillis();
            eg.h.b(null, new C4096v3(s22, null), 1, null);
        }
    }

    public static AdConfig.ImaiConfig c() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f38021a.a(AdConfig.class)).getImai();
    }

    public static void d() {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            Intrinsics.checkNotNullParameter("w3", "name");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new B9("w3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f39818c = kotlinx.coroutines.i.a(eg.w0.c(threadPoolExecutor).plus(eg.m1.b(null, 1, null)));
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f39820e = handlerThread;
            H6.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = f39820e;
            Intrinsics.checkNotNull(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
            f39819d = new HandlerC3723g3(looper);
            ((C4155xc) Ji.f37161e.getValue()).a(new int[]{10, 11, 2, 1}, f39826k);
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            e10.getMessage();
        }
    }

    public static boolean e() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        return !((RootConfig) Y3.f38021a.a(RootConfig.class)).getMonetizationDisabled();
    }

    public static void f() {
        HandlerThread handlerThread;
        try {
            if (Re.a() != null) {
                return;
            }
            synchronized (f39824i) {
                try {
                    if (f39822g.compareAndSet(false, true)) {
                        Intrinsics.checkNotNullExpressionValue("w3", "TAG");
                        if (f39820e == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            f39820e = handlerThread2;
                            H6.a(handlerThread2, "pingHandlerThread");
                        }
                        if (f39819d == null && (handlerThread = f39820e) != null) {
                            Looper looper = handlerThread.getLooper();
                            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
                            f39819d = new HandlerC3723g3(looper);
                        }
                        eg.h.b(null, new C4071u3(null), 1, null);
                    }
                    Unit unit = Unit.f93236a;
                } finally {
                }
            }
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            e10.getMessage();
        }
    }

    public static void g() {
        try {
            AtomicBoolean atomicBoolean = f39822g;
            atomicBoolean.set(false);
            synchronized (f39824i) {
                try {
                    if (!atomicBoolean.get()) {
                        HandlerThread handlerThread = f39820e;
                        if (handlerThread != null) {
                            handlerThread.getLooper().quit();
                            handlerThread.interrupt();
                        }
                        f39820e = null;
                        f39819d = null;
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            e10.getMessage();
        }
    }

    public static final W2 b() {
        return new W2(AbstractC3754h9.b());
    }

    public static final HashMap a(S2 s22) {
        HashMap map = new HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - s22.f37689f) + 1;
            if (maxRetries > 0) {
                map.put("X-im-retry-count", String.valueOf(maxRetries));
                return map;
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
        }
        return map;
    }

    public static final void a() {
        d();
    }

    public static void a(String url, boolean z10, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullExpressionValue("w3", "TAG");
        Dg.a(Ag.f36573b, new C3872m3(url, z10, interfaceC3878m9, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.S2 r18, com.inmobi.media.C3565a0 r19, com.inmobi.media.InterfaceC3878m9 r20, kotlin.coroutines.jvm.internal.d r21) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4121w3.a(com.inmobi.media.S2, com.inmobi.media.a0, com.inmobi.media.m9, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static void a(S2 click, String reason) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(reason, "error");
        LinkedHashMap linkedHashMap = f39825j;
        C3565a0 c3565a0 = (C3565a0) linkedHashMap.get(Integer.valueOf(click.f37684a));
        if (c3565a0 != null) {
            Intrinsics.checkNotNullParameter(click, "click");
            Intrinsics.checkNotNullParameter(reason, "error");
            C3740gk c3740gk = c3565a0.f38139b;
            Intrinsics.checkNotNullParameter(reason, "reason");
            LinkedHashMap linkedHashMapA = c3740gk.a();
            linkedHashMapA.put("networkType", C4148x5.m());
            linkedHashMapA.put("errorCode", (short) 2178);
            linkedHashMapA.put("reason", reason);
            String str = c3740gk.f38660d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj = Wj.f37959a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3585ak.f38215a);
        }
        linkedHashMap.remove(Integer.valueOf(click.f37684a));
    }
}
