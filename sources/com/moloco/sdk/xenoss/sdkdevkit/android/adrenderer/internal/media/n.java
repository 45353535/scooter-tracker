package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f56287j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f56288k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f56289l = "MediaCacheRepository";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f56290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f56291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a f56292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f56293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineScope f56294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f56295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f56296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f56297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CoroutineScope f56298i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(String str) {
            return str + "TEMP";
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56299r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f56300s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f56301t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f56302u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f56303v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f56304w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ n f56305x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, n nVar, Continuation continuation) {
            super(2, continuation);
            this.f56304w = str;
            this.f56305x = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f56304w, this.f56305x, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x01a1 A[Catch: all -> 0x01dc, Exception -> 0x01df, TryCatch #6 {Exception -> 0x01df, all -> 0x01dc, blocks: (B:61:0x019b, B:63:0x01a1, B:65:0x01b5, B:72:0x01e3), top: B:91:0x019b }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01ec  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 560
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56306r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f56307s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f56308t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f56309u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f56310v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f56311w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ n f56312x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f56313y;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56314r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n f56315s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f56316t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ File f56317u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f56318v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g f56319w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar, String str, File file, String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar, Continuation continuation) {
                super(2, continuation);
                this.f56315s = nVar;
                this.f56316t = str;
                this.f56317u = file;
                this.f56318v = str2;
                this.f56319w = gVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f56315s, this.f56316t, this.f56317u, this.f56318v, this.f56319w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object objG = pf.b.g();
                int i10 = this.f56314r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a aVar2 = this.f56315s.f56292c;
                    String str = this.f56316t;
                    File file = this.f56317u;
                    String str2 = this.f56318v;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar = this.f56319w;
                    this.f56314r = 1;
                    aVar = this;
                    if (aVar2.c(str, file, str2, gVar, aVar) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    aVar = this;
                }
                aVar.f56315s.f56296g.remove(aVar.f56316t);
                aVar.f56315s.f56297h.remove(aVar.f56316t);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, n nVar, String str2, Continuation continuation) {
            super(2, continuation);
            this.f56311w = str;
            this.f56312x = nVar;
            this.f56313y = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f56311w, this.f56312x, this.f56313y, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            n nVar;
            String str;
            String str2;
            Object objPutIfAbsent;
            Object objPutIfAbsent2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h cVar;
            Object objG = pf.b.g();
            int i10 = this.f56310v;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, n.f56289l, "Streaming media for: " + this.f56311w, null, false, 12, null);
                if (this.f56311w.length() == 0) {
                    return new h.b(m.a.AbstractC0696a.k.f56278a);
                }
                ConcurrentHashMap concurrentHashMap = this.f56312x.f56295f;
                String str3 = this.f56311w;
                Object objB = concurrentHashMap.get(str3);
                if (objB == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str3, (objB = ng.f.b(false, 1, null)))) != null) {
                    objB = objPutIfAbsent;
                }
                mutex = (Mutex) objB;
                Intrinsics.checkNotNull(mutex);
                n nVar2 = this.f56312x;
                String str4 = this.f56311w;
                String str5 = this.f56313y;
                this.f56306r = mutex;
                this.f56307s = nVar2;
                this.f56308t = str4;
                this.f56309u = str5;
                this.f56310v = 1;
                if (mutex.lock(null, this) == objG) {
                    return objG;
                }
                nVar = nVar2;
                str = str4;
                str2 = str5;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str6 = (String) this.f56309u;
                String str7 = (String) this.f56308t;
                n nVar3 = (n) this.f56307s;
                mutex = (Mutex) this.f56306r;
                kotlin.d.b(obj);
                str2 = str6;
                str = str7;
                nVar = nVar3;
            }
            try {
                h0 h0VarH = nVar.h();
                if (h0VarH instanceof h0.a) {
                    return ((h0.a) h0VarH).a();
                }
                if (!(h0VarH instanceof h0.b)) {
                    throw new lf.m();
                }
                File fileE = nVar.e(str, (File) ((h0.b) h0VarH).a());
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, n.f56289l, "Going to download the media file to location: " + fileE.getAbsolutePath(), null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g) nVar.f56297h.get(str);
                if (nVar.f56296g.contains(str)) {
                    MolocoLogger.info$default(molocoLogger, n.f56289l, "Media file is already being downloaded, so returning in progress status for url: " + str, null, false, 12, null);
                    if (gVar == null || (cVar = gVar.d()) == null) {
                        cVar = new h.c(fileE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a());
                    }
                    return cVar;
                }
                if (nVar.f56292c.a(fileE)) {
                    return new h.a(fileE);
                }
                MolocoLogger.info$default(molocoLogger, n.f56289l, "Media file needs to be downloaded: " + str, null, false, 12, null);
                nVar.f56296g.add(str);
                ConcurrentHashMap concurrentHashMap2 = nVar.f56297h;
                Object gVar2 = concurrentHashMap2.get(str);
                if (gVar2 == null && (objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(str, (gVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g(new h.c(fileE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a()))))) != null) {
                    gVar2 = objPutIfAbsent2;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g) gVar2;
                eg.i.d(nVar.f56294e, null, null, new a(nVar, str, fileE, str2, gVar3, null), 3, null);
                return gVar3.d();
            } finally {
                mutex.unlock(null);
            }
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56320r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56321s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ File f56322t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, Continuation continuation) {
            super(2, continuation);
            this.f56322t = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f56322t, continuation);
            dVar.f56321s = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56320r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f56321s;
                h.a aVar = new h.a(this.f56322t);
                this.f56320r = 1;
                if (flowCollector.emit(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56323r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ h0 f56324s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h0 h0Var, Continuation continuation) {
            super(2, continuation);
            this.f56324s = h0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f56324s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56323r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ((h0.a) this.f56324s).a();
            return Unit.f93236a;
        }
    }

    public n(o mediaConfig, j legacyMediaDownloader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a chunkedMediaDownloader, k mediaCacheLocationProvider) {
        Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        Intrinsics.checkNotNullParameter(legacyMediaDownloader, "legacyMediaDownloader");
        Intrinsics.checkNotNullParameter(chunkedMediaDownloader, "chunkedMediaDownloader");
        Intrinsics.checkNotNullParameter(mediaCacheLocationProvider, "mediaCacheLocationProvider");
        this.f56290a = mediaConfig;
        this.f56291b = legacyMediaDownloader;
        this.f56292c = chunkedMediaDownloader;
        this.f56293d = mediaCacheLocationProvider;
        this.f56294e = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getIo());
        this.f56295f = new ConcurrentHashMap();
        this.f56296g = new HashSet();
        this.f56297h = new ConcurrentHashMap();
        this.f56298i = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getIo());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m
    public Object a(String str, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new b(str, this, null), continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m
    public Flow b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        h0 h0VarH = h();
        if (h0VarH instanceof h0.a) {
            return hg.i.B(new e(h0VarH, null));
        }
        if (!(h0VarH instanceof h0.b)) {
            throw new lf.m();
        }
        File file = (File) ((h0.b) h0VarH).a();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = f56289l;
        MolocoLogger.info$default(molocoLogger, str, "Collecting status for media file: " + url, null, false, 12, null);
        File fileE = e(url, file);
        if (fileE.exists() && this.f56292c.a(fileE)) {
            return hg.i.B(new d(fileE, null));
        }
        MolocoLogger.info$default(molocoLogger, str, "Media file needs to be downloaded: " + url, null, false, 12, null);
        ConcurrentHashMap concurrentHashMap = this.f56297h;
        Object gVar = concurrentHashMap.get(url);
        if (gVar == null) {
            MolocoLogger.info$default(molocoLogger, str, "Download has not yet started for: " + url, null, false, 12, null);
            gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g(new h.c(fileE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a()));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(url, gVar);
            if (objPutIfAbsent != null) {
                gVar = objPutIfAbsent;
            }
        }
        return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g) gVar).g();
    }

    public final File e(String str, File file) {
        return new File(file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j.a(str));
    }

    public final h0 h() {
        h0 h0VarJ = j();
        if (!(h0VarJ instanceof h0.a)) {
            if (h0VarJ instanceof h0.b) {
                return new h0.b(((h0.b) h0VarJ).a());
            }
            throw new lf.m();
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = f56289l;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to retrieve storageDir with error code: ");
        h0.a aVar = (h0.a) h0VarJ;
        sb2.append(((com.moloco.sdk.internal.q) aVar.a()).b());
        MolocoLogger.warn$default(molocoLogger, str, sb2.toString(), null, false, 12, null);
        switch (((com.moloco.sdk.internal.q) aVar.a()).b()) {
            case 100:
                return new h0.a(new h.b(m.a.AbstractC0696a.c.f56270a));
            case 101:
                return new h0.a(new h.b(m.a.AbstractC0696a.b.f56269a));
            case 102:
                return new h0.a(new h.b(m.a.AbstractC0696a.C0697a.f56268a));
            default:
                return new h0.a(new h.b(m.a.AbstractC0696a.d.f56271a));
        }
    }

    public final h0 j() {
        h0 h0VarA = this.f56293d.a();
        if (h0VarA instanceof h0.a) {
            return this.f56293d.b();
        }
        if (h0VarA instanceof h0.b) {
            return h0VarA;
        }
        throw new lf.m();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h a(String url) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVarD;
        Intrinsics.checkNotNullParameter(url, "url");
        h0 h0VarH = h();
        if (h0VarH instanceof h0.a) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) ((h0.a) h0VarH).a();
        }
        if (!(h0VarH instanceof h0.b)) {
            throw new lf.m();
        }
        File fileE = e(url, (File) ((h0.b) h0VarH).a());
        if (fileE.exists() && this.f56292c.a(fileE)) {
            return new h.a(fileE);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g) this.f56297h.get(url);
        return (gVar == null || (hVarD = gVar.d()) == null) ? new h.c(fileE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a()) : hVarD;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m
    public Object b(String str, String str2, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new c(str, this, str2, null), continuation);
    }
}
