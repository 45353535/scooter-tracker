package io.bidmachine;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\u00020\u0001:\u0003$#%B]\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lio/bidmachine/AdResponseCacheParamsCollector;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "ioDispatcher", "", "Lio/bidmachine/TrackEventType;", "adResponseCacheEnabledEvents", "adaptiveResourcesCacheEnabledEvents", "Lv8/c;", "Lio/bidmachine/u;", "adResponseCacheParamsAdapter", "Lod/k;", "adaptiveResourcesCacheParamsAdapter", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/util/List;Ljava/util/List;Lv8/c;Lv8/c;)V", "trackEventType", "adResponse", "Lio/bidmachine/AdResponseCacheParamsCollector$Callback;", "callback", "", "collect", "(Lio/bidmachine/TrackEventType;Lio/bidmachine/u;Lio/bidmachine/AdResponseCacheParamsCollector$Callback;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/List;", "Lv8/c;", "Lwd/e;", "taskManager$delegate", "Lkotlin/Lazy;", "getTaskManager", "()Lwd/e;", "taskManager", "Lde/h;", "logger", "Lde/h;", com.taurusx.tax.f.y.f66058y, "Callback", "a", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdResponseCacheParamsCollector {

    @NotNull
    public static final List<TrackEventType> DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS;

    @NotNull
    public static final List<TrackEventType> DEFAULT_AD_RESPONSE_CACHE_EVENTS;

    @NotNull
    private static final String TAG = "AdResponseCacheParamsCollector";

    @NotNull
    private final List<TrackEventType> adResponseCacheEnabledEvents;

    @NotNull
    private final v8.c adResponseCacheParamsAdapter;

    @NotNull
    private final List<TrackEventType> adaptiveResourcesCacheEnabledEvents;

    @NotNull
    private final v8.c adaptiveResourcesCacheParamsAdapter;

    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    @NotNull
    private final de.h logger;

    @NotNull
    private final CoroutineDispatcher mainDispatcher;

    /* JADX INFO: renamed from: taskManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy taskManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lio/bidmachine/AdResponseCacheParamsCollector$Callback;", "", "onCollected", "", "cacheParams", "", "", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Callback {
        void onCollected(@NotNull Map<String, ? extends Object> cacheParams);
    }

    private final class a extends wd.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TrackEventType f79080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u f79081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Callback f79082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AdResponseCacheParamsCollector f79083f;

        /* JADX INFO: renamed from: io.bidmachine.AdResponseCacheParamsCollector$a$a, reason: collision with other inner class name */
        static final class C0931a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f79084r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f79085s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f79086t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f79087u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f79088v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            /* synthetic */ Object f79089w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f79091y;

            C0931a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f79089w = obj;
                this.f79091y |= Integer.MIN_VALUE;
                return a.this.e(null, this);
            }
        }

        static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Map f79093g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Map map) {
                super(0);
                this.f79093g = map;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return a.this.f79080c.getActionValue() + ". Collected cache params: " + pd.g0.O(this.f79093g);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f79094r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Map f79096t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Map map, Continuation continuation) {
                super(2, continuation);
                this.f79096t = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return a.this.new c(this.f79096t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f79094r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                a.this.f79082e.onCollected(this.f79096t);
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        public a(AdResponseCacheParamsCollector adResponseCacheParamsCollector, TrackEventType trackEventType, u uVar, Callback callback) {
            Intrinsics.checkNotNullParameter(trackEventType, "trackEventType");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f79083f = adResponseCacheParamsCollector;
            this.f79080c = trackEventType;
            this.f79081d = uVar;
            this.f79082e = callback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
        
            if (eg.g.g(r1, r3, r10) == r0) goto L57;
         */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[PHI: r4 r6
  0x00f2: PHI (r4v12 io.bidmachine.AdResponseCacheParamsCollector$a) = (r4v6 io.bidmachine.AdResponseCacheParamsCollector$a), (r4v13 io.bidmachine.AdResponseCacheParamsCollector$a) binds: [B:37:0x00b5, B:54:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r6v11 java.util.Map) = (r6v7 java.util.Map), (r6v13 java.util.Map) binds: [B:37:0x00b5, B:54:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // wd.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object e(kotlin.coroutines.CoroutineContext r10, kotlin.coroutines.Continuation r11) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.AdResponseCacheParamsCollector.a.e(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final xd.a invoke() {
            return new xd.a(AdResponseCacheParamsCollector.this.ioDispatcher);
        }
    }

    static {
        TrackEventType trackEventType = TrackEventType.AuctionRequest;
        TrackEventType trackEventType2 = TrackEventType.AuctionRequestExpired;
        TrackEventType trackEventType3 = TrackEventType.Click;
        TrackEventType trackEventType4 = TrackEventType.Close;
        TrackEventType trackEventType5 = TrackEventType.Destroy;
        TrackEventType trackEventType6 = TrackEventType.Expired;
        TrackEventType trackEventType7 = TrackEventType.FillAd;
        TrackEventType trackEventType8 = TrackEventType.Show;
        DEFAULT_AD_RESPONSE_CACHE_EVENTS = CollectionsKt.listOf((Object[]) new TrackEventType[]{trackEventType, trackEventType2, trackEventType3, trackEventType4, trackEventType5, trackEventType6, trackEventType7, TrackEventType.ImpressionOpportunity, trackEventType8});
        DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS = CollectionsKt.listOf((Object[]) new TrackEventType[]{trackEventType, trackEventType2, TrackEventType.BrokenCreativeDetector, trackEventType3, trackEventType4, trackEventType5, trackEventType6, trackEventType7, TrackEventType.Load, trackEventType8});
    }

    public AdResponseCacheParamsCollector() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final wd.e getTaskManager() {
        return (wd.e) this.taskManager.getValue();
    }

    public final void collect(@NotNull TrackEventType trackEventType, @Nullable u adResponse, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(trackEventType, "trackEventType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        getTaskManager().execute(new a(this, trackEventType, adResponse, callback));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher) {
        this(mainDispatcher, null, null, null, null, null, 62, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher) {
        this(mainDispatcher, ioDispatcher, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher, @NotNull List<? extends TrackEventType> adResponseCacheEnabledEvents) {
        this(mainDispatcher, ioDispatcher, adResponseCacheEnabledEvents, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher, @NotNull List<? extends TrackEventType> adResponseCacheEnabledEvents, @NotNull List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents) {
        this(mainDispatcher, ioDispatcher, adResponseCacheEnabledEvents, adaptiveResourcesCacheEnabledEvents, null, null, 48, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher, @NotNull List<? extends TrackEventType> adResponseCacheEnabledEvents, @NotNull List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents, @NotNull v8.c adResponseCacheParamsAdapter) {
        this(mainDispatcher, ioDispatcher, adResponseCacheEnabledEvents, adaptiveResourcesCacheEnabledEvents, adResponseCacheParamsAdapter, null, 32, null);
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adResponseCacheParamsAdapter, "adResponseCacheParamsAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdResponseCacheParamsCollector(@NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher, @NotNull List<? extends TrackEventType> adResponseCacheEnabledEvents, @NotNull List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents, @NotNull v8.c adResponseCacheParamsAdapter, @NotNull v8.c adaptiveResourcesCacheParamsAdapter) {
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
        Intrinsics.checkNotNullParameter(adResponseCacheParamsAdapter, "adResponseCacheParamsAdapter");
        Intrinsics.checkNotNullParameter(adaptiveResourcesCacheParamsAdapter, "adaptiveResourcesCacheParamsAdapter");
        this.mainDispatcher = mainDispatcher;
        this.ioDispatcher = ioDispatcher;
        this.adResponseCacheEnabledEvents = adResponseCacheEnabledEvents;
        this.adaptiveResourcesCacheEnabledEvents = adaptiveResourcesCacheEnabledEvents;
        this.adResponseCacheParamsAdapter = adResponseCacheParamsAdapter;
        this.adaptiveResourcesCacheParamsAdapter = adaptiveResourcesCacheParamsAdapter;
        this.taskManager = lf.i.a(new b());
        this.logger = new de.h();
    }

    public /* synthetic */ AdResponseCacheParamsCollector(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, List list, List list2, v8.c cVar, v8.c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        coroutineDispatcher = (i10 & 1) != 0 ? pd.x.f98252g.a().f() : coroutineDispatcher;
        coroutineDispatcher2 = (i10 & 2) != 0 ? pd.x.f98252g.a().e() : coroutineDispatcher2;
        list = (i10 & 4) != 0 ? DEFAULT_AD_RESPONSE_CACHE_EVENTS : list;
        list2 = (i10 & 8) != 0 ? DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS : list2;
        if ((i10 & 16) != 0) {
            w0 w0VarF = w0.f();
            Intrinsics.checkNotNullExpressionValue(w0VarF, "get()");
            cVar = new AdResponseCacheParamsAdapter(w0VarF);
        }
        this(coroutineDispatcher, coroutineDispatcher2, list, list2, cVar, (i10 & 32) != 0 ? new v8.b(null, ec.a.b(), 1, 0 == true ? 1 : 0) : cVar2);
    }
}
