package com.ironsource;

import android.content.Context;
import com.ironsource.C4536sb;
import com.ironsource.C9;
import com.ironsource.D0;
import com.ironsource.I8;
import com.ironsource.Ib;
import com.ironsource.K7;
import com.ironsource.Ld;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4536sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4536sb f44908a = new C4536sb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C4553tb f44909b = new C4553tb();

    /* JADX INFO: renamed from: com.ironsource.sb$a */
    public static final class a implements InterfaceC4385je {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f44910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f44911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4360i5 f44912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f44913d;

        a(LevelPlayInitRequest levelPlayInitRequest, Context context, C4360i5 c4360i5, LevelPlayInitListener levelPlayInitListener) {
            this.f44910a = levelPlayInitRequest;
            this.f44911b = context;
            this.f44912c = c4360i5;
            this.f44913d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC4385je
        public void a(@NotNull final C4284de sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C4553tb c4553tb = C4536sb.f44909b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f44910a;
            final Context context = this.f44911b;
            final C4360i5 c4360i5 = this.f44912c;
            final LevelPlayInitListener levelPlayInitListener = this.f44913d;
            c4553tb.a(new Runnable() { // from class: com.ironsource.dm
                @Override // java.lang.Runnable
                public final void run() {
                    C4536sb.a.a(levelPlayInitRequest, sdkConfig, context, c4360i5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, C4284de sdkConfig, Context context, C4360i5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            C4536sb.f44908a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC4385je
        public void a(@NotNull final C4318fe error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C4553tb c4553tb = C4536sb.f44909b;
            final LevelPlayInitListener levelPlayInitListener = this.f44913d;
            final C4360i5 c4360i5 = this.f44912c;
            c4553tb.a(new Runnable() { // from class: com.ironsource.em
                @Override // java.lang.Runnable
                public final void run() {
                    C4536sb.a.a(levelPlayInitListener, c4360i5, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C4360i5 initDuration, C4318fe error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            C4536sb.f44908a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sb$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Xa f44914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4360i5 f44915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f44916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f44917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Xa xa2, C4360i5 c4360i5, long j10, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f44914a = xa2;
            this.f44915b = c4360i5;
            this.f44916c = j10;
            this.f44917d = levelPlayInitListener;
        }

        public final void a() {
            C4536sb.f44908a.a(this.f44914a, this.f44915b, this.f44916c, this.f44917d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sb$c */
    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f44919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, List<String> list) {
            super(0);
            this.f44918a = str;
            this.f44919b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.r.m().a(this.f44918a, this.f44919b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f93236a;
        }
    }

    private C4536sb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        f44908a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C4360i5 c4360i5 = new C4360i5();
        C4553tb c4553tb = f44909b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        C4539se.f45413a.a(context, new C4419le(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), ArraysKt.toMutableList(c4553tb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c4360i5, levelPlayInitListener));
    }

    public final void b(@NotNull LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.r.m().a(a(segment));
    }

    public final void b(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.r.m().a(new C4247bb(listener));
    }

    public static /* synthetic */ void a(C4536sb c4536sb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            levelPlayInitListener = null;
        }
        c4536sb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(@NotNull final Context context, @NotNull final LevelPlayInitRequest initRequest, @Nullable final LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        f44909b.d(new Runnable() { // from class: com.ironsource.bm
            @Override // java.lang.Runnable
            public final void run() {
                C4536sb.b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    public final void a(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.r.m().b(new C4247bb(listener));
    }

    private final C4246ba a(LevelPlaySegment levelPlaySegment) {
        C4246ba c4246ba = new C4246ba();
        c4246ba.a(levelPlaySegment.getLevel());
        c4246ba.a(levelPlaySegment.getIapTotal());
        c4246ba.a(levelPlaySegment.isPaying());
        c4246ba.a(levelPlaySegment.getUserCreationDate());
        c4246ba.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c4246ba.a((String) pair.getFirst(), (String) pair.getSecond());
        }
        return c4246ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C4284de c4284de, Context context, C4360i5 c4360i5, LevelPlayInitListener levelPlayInitListener) {
        Ib.b bVar = Ib.f41088s;
        I8.a aVarD = bVar.a().D();
        Xa xa2 = new Xa(c4284de);
        if (xa2.k()) {
            f44909b.a(context);
        }
        K7.a aVarA = bVar.a().a();
        C4553tb c4553tb = f44909b;
        xa2.b(c4553tb).a(aVarA);
        xa2.a(c4553tb).a(bVar.a().l());
        xa2.c(c4553tb).a(bVar.a().v());
        C4536sb c4536sb = f44908a;
        c4536sb.a(levelPlayInitRequest, xa2);
        long jD = bVar.d().g().d();
        c4536sb.a(jD, new b(xa2, c4360i5, jD, levelPlayInitListener));
        aVarD.a(xa2);
        if (c4284de.a().e()) {
            new C4623xd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j10, Function0<Unit> function0) {
        if (!Ib.f41088s.d().e().c() && j10 > 0) {
            f44909b.a(function0, j10);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Xa xa2, C4360i5 c4360i5, long j10, final LevelPlayInitListener levelPlayInitListener) {
        Ib.f41088s.a().D().d();
        long jA = C4360i5.a(c4360i5);
        C4553tb c4553tb = f44909b;
        C4553tb.a(c4553tb, jA, xa2.f(), j10, null, 8, null);
        c4553tb.e(new Runnable() { // from class: com.ironsource.am
            @Override // java.lang.Runnable
            public final void run() {
                C4536sb.a(levelPlayInitListener, xa2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Xa levelPlayConfig) {
        Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Xa xa2) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && xa2.d().c().f() != null) {
            Ld.a aVar = Ld.f41286z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            Ld ldA = aVar.a(new C4304f0(aVar2, C4600w7.f45720a.a(), "", null, null, null, 56, null), xa2, true);
            List<C4588vc> listC = xa2.c(adFormat);
            D0.b bVar = D0.b.MEDIATION;
            new C4505qd(new V0(new C4441n0(aVar2, bVar), ldA, bVar), adFormat, listC, ldA).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && xa2.d().c().d() != null) {
            C9.a aVar3 = C9.f40479z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            C9 c9A = aVar3.a(new C4304f0(aVar4, C4600w7.f45720a.a(), "", null, null, null, 56, null), xa2, true);
            List<C4588vc> listC2 = xa2.c(adFormat2);
            D0.b bVar2 = D0.b.MEDIATION;
            new C4505qd(new V0(new C4441n0(aVar4, bVar2), c9A, bVar2), adFormat2, listC2, c9A).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || xa2.d().c().c() == null) {
            return;
        }
        L2 l2A = L2.f41223z.a(new I2(), xa2, true);
        List<C4588vc> listC3 = xa2.c(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        D0.b bVar3 = D0.b.MEDIATION;
        new C4505qd(new V0(new C4441n0(aVar5, bVar3), l2A, bVar3), adFormat3, listC3, l2A).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, C4360i5 c4360i5, final C4318fe c4318fe) {
        long jA = C4360i5.a(c4360i5);
        C4553tb c4553tb = f44909b;
        final C4318fe c4318feB = c4553tb.b(c4318fe);
        C4553tb.a(c4553tb, c4318feB, jA, null, 4, null);
        c4553tb.e(new Runnable() { // from class: com.ironsource.cm
            @Override // java.lang.Runnable
            public final void run() {
                C4536sb.a(c4318fe, levelPlayInitListener, c4318feB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4318fe error, LevelPlayInitListener levelPlayInitListener, C4318fe eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(f44909b.a(eventError)));
        }
    }

    public final void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        a(key, arrayList);
    }

    public final void a(@NotNull String key, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        a(new c(key, values));
    }

    public final void a(@NotNull Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (Ib.f41088s.c().g().h()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, AbstractRunnableC4232ae.f42430a.a(task), 0L, 2, null);
        } else {
            task.invoke();
        }
    }
}
