package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.media.C3968q;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3968q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AudioManager f39324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3818k f39325c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Job f39328f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Function1 f39331i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3968q f39323a = new C3968q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f39326d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f39327e = new AtomicReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CoroutineScope f39329g = A9.f36558d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CopyOnWriteArraySet f39330h = new CopyOnWriteArraySet();

    public static final Unit a(long j10, I2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = it.f37045a;
        if (i10 != 101) {
            if (i10 == 102) {
                Job job = f39328f;
                if (job != null) {
                    Job.a.a(job, null, 1, null);
                }
                f39328f = null;
            }
        } else if (f39328f == null && f39326d.get()) {
            f39328f = F3.a(f39329g, 0L, j10, new C3918o(null));
        }
        return Unit.f93236a;
    }

    public static boolean b() {
        AudioManager audioManager;
        AudioManager audioManager2;
        C4148x5.f39893a.getClass();
        if (!C4148x5.w() ? (audioManager = f39324b) == null || audioManager.getStreamVolume(3) != 0 : (audioManager2 = f39324b) == null || !audioManager2.isStreamMute(3)) {
            if (!Ji.f37162f) {
                return false;
            }
        }
        return true;
    }

    public static void a(final long j10) {
        Function1 function1 = new Function1() { // from class: w3.ja
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3968q.a(j10, (I2) obj);
            }
        };
        f39331i = function1;
        ((C4155xc) Ji.f37161e.getValue()).a(new int[]{102, 101}, function1);
    }

    public static void a(final InterfaceC3878m9 interfaceC3878m9) {
        final Context context = Ji.f37157a;
        if (context == null) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        final long muteChangeInterval = ((AdConfig) Y3.f38021a.a(AdConfig.class)).getMraid3().getMuteChangeInterval();
        Throwable thG = Result.g(H3.a(new Function0() { // from class: w3.la
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3968q.a(interfaceC3878m9, context, muteChangeInterval);
            }
        }));
        if (thG != null) {
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("AdAudioTracker", "Error starting audio volume tracking - " + thG.getMessage());
            }
            a((Float) null);
        }
    }

    public static final Object a(InterfaceC3878m9 interfaceC3878m9, Context context, long j10) {
        if (f39326d.compareAndSet(false, true)) {
            return eg.i.d(f39329g, null, null, new C3943p(interfaceC3878m9, context, j10, null), 3, null);
        }
        if (interfaceC3878m9 == null) {
            return null;
        }
        ((C3903n9) interfaceC3878m9).c("AdAudioTracker", "Audio volume tracking is already started");
        return Unit.f93236a;
    }

    public static void a(final Context context, InterfaceC3878m9 interfaceC3878m9) {
        Throwable thG = Result.g(H3.a(new Function0() { // from class: w3.ia
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3968q.a(context);
            }
        }));
        if (thG == null || interfaceC3878m9 == null) {
            return;
        }
        ((C3903n9) interfaceC3878m9).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + thG.getMessage());
    }

    public static final Unit a(final Context context) {
        final C3818k c3818k = f39325c;
        if (c3818k != null) {
            H3.a(new Function0() { // from class: w3.ka
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3968q.a(context, c3818k);
                }
            });
            f39325c = null;
        }
        Job job = f39328f;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Function1 function1 = f39331i;
        if (function1 != null) {
            ((C4155xc) Ji.f37161e.getValue()).a(function1);
        }
        f39331i = null;
        f39328f = null;
        return Unit.f93236a;
    }

    public static final Unit a(Context context, C3818k c3818k) {
        context.unregisterReceiver(c3818k);
        return Unit.f93236a;
    }

    public final synchronized float a() {
        try {
            boolean zB = b();
            AudioManager audioManager = f39324b;
            int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
            AudioManager audioManager2 = f39324b;
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (zB) {
                return 0.0f;
            }
            if (streamVolume < 0) {
                return 0.0f;
            }
            if (streamVolume > streamMaxVolume) {
                return 1.0f;
            }
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void a(Float f10) {
        if (Intrinsics.areEqual((Float) f39327e.getAndSet(f10), f10)) {
            return;
        }
        Iterator it = f39330h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC3793j interfaceC3793j = (InterfaceC3793j) ((WeakReference) it.next()).get();
            if (interfaceC3793j != null) {
                ((Ph) interfaceC3793j).a(f10 != null ? Float.valueOf(F3.a(f10.floatValue() * 100.0f)) : null);
            }
        }
    }
}
