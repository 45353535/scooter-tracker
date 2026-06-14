package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import android.util.Base64;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55642d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55643e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f55644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f55645c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55646r;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return h.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55646r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            h.this.f55644b.edit().clear().commit();
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55648r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55649s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f55650t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h f55651u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.internal.services.init.a aVar2, h hVar, Continuation continuation) {
            super(2, continuation);
            this.f55649s = aVar;
            this.f55650t = aVar2;
            this.f55651u = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f55649s, this.f55650t, this.f55651u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55648r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.acm.f fVarC = this.f55649s.c("SDKInitCacheClear");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Clearing cache for cacheKey: " + this.f55650t.b(), null, false, 12, null);
                SharedPreferences.Editor editorEdit = this.f55651u.f55644b.edit();
                h hVar = this.f55651u;
                com.moloco.sdk.internal.services.init.a aVar = this.f55650t;
                Intrinsics.checkNotNull(editorEdit);
                hVar.e(aVar, editorEdit);
                editorEdit.remove(this.f55650t.b());
                if (editorEdit.commit()) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully cleared cache for cacheKey: " + this.f55650t.b(), null, false, 12, null);
                    this.f55649s.b(new com.moloco.sdk.acm.c("SDKInitCacheClear").e("Result", "success"));
                    this.f55649s.a(fVarC.f("Result", "success"));
                } else {
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to clear cache for cacheKey: " + this.f55650t.b(), null, false, 12, null);
                    this.f55649s.b(new com.moloco.sdk.acm.c("SDKInitCacheClear").e("Result", "failure").e("Reason", "commit_failure"));
                    this.f55649s.a(fVarC.f("Result", "failure").f("Reason", "commit_failure"));
                }
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to clear cache for cacheKey: " + this.f55650t.b() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar2 = this.f55649s;
                com.moloco.sdk.acm.c cVarE = new com.moloco.sdk.acm.c("SDKInitCacheClear").e("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                aVar2.b(cVarE.e("Reason", simpleName));
                com.moloco.sdk.acm.recorder.a aVar3 = this.f55649s;
                com.moloco.sdk.acm.f fVarF = fVarC.f("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                aVar3.a(fVarF.f("Reason", simpleName2));
            }
            return Unit.f93236a;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55652r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55653s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f55654t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h f55655u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.internal.services.init.a aVar2, h hVar, Continuation continuation) {
            super(2, continuation);
            this.f55653s = aVar;
            this.f55654t = aVar2;
            this.f55655u = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f55653s, this.f55654t, this.f55655u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55652r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.acm.f fVarC = this.f55653s.c("SDKInitCacheRead");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Reading cache for cacheKey: " + this.f55654t.b(), null, false, 12, null);
                h hVar = this.f55655u;
                hVar.i(this.f55654t, hVar.f55644b);
                String string = this.f55655u.f55644b.getString(this.f55654t.b(), null);
                Init$SDKInitResponse from = string != null ? Init$SDKInitResponse.parseFrom(Base64.decode(string, 0)) : null;
                if (from != null) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully read cache for cacheKey: " + this.f55654t.b(), null, false, 12, null);
                    this.f55653s.a(fVarC.f("Result", "success"));
                    this.f55653s.b(new com.moloco.sdk.acm.c("SDKInitCacheRead").e("Result", "success"));
                    return from;
                }
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Failed to read from cache (cache_miss) for cacheKey: " + this.f55654t.b(), null, false, 12, null);
                this.f55653s.a(fVarC.f("Result", "failure").f("Reason", "cache_miss"));
                this.f55653s.b(new com.moloco.sdk.acm.c("SDKInitCacheRead").e("Result", "failure").e("Reason", "cache_miss"));
                return from;
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to read cache for cacheKey: " + this.f55654t.b() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar = this.f55653s;
                com.moloco.sdk.acm.f fVarF = fVarC.f("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                aVar.a(fVarF.f("Reason", simpleName));
                com.moloco.sdk.acm.recorder.a aVar2 = this.f55653s;
                com.moloco.sdk.acm.c cVarE = new com.moloco.sdk.acm.c("SDKInitCacheRead").e("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                aVar2.b(cVarE.e("Reason", simpleName2));
                return null;
            }
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55656r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55657s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.a f55658t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Init$SDKInitResponse f55659u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h f55660v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.internal.services.init.a aVar2, Init$SDKInitResponse init$SDKInitResponse, h hVar, Continuation continuation) {
            super(2, continuation);
            this.f55657s = aVar;
            this.f55658t = aVar2;
            this.f55659u = init$SDKInitResponse;
            this.f55660v = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f55657s, this.f55658t, this.f55659u, this.f55660v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean z10;
            pf.b.g();
            if (this.f55656r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.acm.f fVarC = this.f55657s.c("SDKInitCacheWrite");
            try {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Updating cache for cacheKey: " + this.f55658t.b(), null, false, 12, null);
                String strEncodeToString = Base64.encodeToString(this.f55659u.toByteArray(), 0);
                if (strEncodeToString == null || strEncodeToString.length() == 0) {
                    str = strEncodeToString;
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to encode SDKInitResponse for cacheKey: " + this.f55658t.b(), null, false, 12, null);
                    z10 = true;
                } else {
                    str = strEncodeToString;
                    z10 = false;
                }
                if (!z10 ? this.f55660v.f55644b.edit().putString(this.f55658t.b(), str).commit() : false) {
                    MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Successfully updated cache for cacheKey: " + this.f55658t.b(), null, false, 12, null);
                    this.f55657s.a(fVarC.f("Result", "success"));
                    this.f55657s.b(new com.moloco.sdk.acm.c("SDKInitCacheWrite").e("Result", "success"));
                } else {
                    String str2 = z10 ? "encoding_failure" : "commit_failure";
                    MolocoLogger.warn$default(molocoLogger, "InitCacheImpl", "Failed to update cache for cacheKey: " + this.f55658t.b() + " with error: " + str2, null, false, 12, null);
                    this.f55657s.a(fVarC.f("Result", "failure").f("Reason", str2));
                    this.f55657s.b(new com.moloco.sdk.acm.c("SDKInitCacheWrite").e("Result", "failure").e("Reason", str2));
                }
            } catch (Exception e10) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Failed to update cache for cacheKey: " + this.f55658t.b() + " with exception", e10, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar = this.f55657s;
                com.moloco.sdk.acm.f fVarF = fVarC.f("Result", "failure");
                String simpleName = e10.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                aVar.a(fVarF.f("Reason", simpleName));
                com.moloco.sdk.acm.recorder.a aVar2 = this.f55657s;
                com.moloco.sdk.acm.c cVarE = new com.moloco.sdk.acm.c("SDKInitCacheWrite").e("Result", "failure");
                String simpleName2 = e10.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                aVar2.b(cVarE.e("Reason", simpleName2));
            }
            return Unit.f93236a;
        }
    }

    public h(SharedPreferences sharedPreferences, CoroutineContext ioDispatcherContext) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(ioDispatcherContext, "ioDispatcherContext");
        this.f55644b = sharedPreferences;
        this.f55645c = ioDispatcherContext;
    }

    @Override // com.moloco.sdk.internal.services.init.g
    public Object a(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.a aVar2, Init$SDKInitResponse init$SDKInitResponse, Continuation continuation) {
        Object objG = eg.g.g(this.f55645c, new e(aVar2, aVar, init$SDKInitResponse, this, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // com.moloco.sdk.internal.services.init.g
    public Object b(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.a aVar2, Continuation continuation) {
        return eg.g.g(this.f55645c, new d(aVar2, aVar, this, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.init.g
    public Object c(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.a aVar2, Continuation continuation) {
        Object objG = eg.g.g(this.f55645c, new c(aVar2, aVar, this, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public final void e(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences.Editor editor) {
        Iterator it = aVar.c().iterator();
        while (it.hasNext()) {
            editor.remove((String) it.next());
        }
    }

    public final void f(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences sharedPreferences) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Migrating from v0 to v1 for cache key: " + aVar.b(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Total keys in cache: " + sharedPreferences.getAll().size(), null, false, 12, null);
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            List listSplit$default = StringsKt.split$default(key, new String[]{"___"}, false, 0, 6, null);
            if (Intrinsics.areEqual(CollectionsKt.firstOrNull(listSplit$default), aVar.a()) && Intrinsics.areEqual(CollectionsKt.lastOrNull(listSplit$default), "v0")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Number of existing V0 keys in cache: " + linkedHashMap.size(), null, false, 12, null);
        if (linkedHashMap.isEmpty()) {
            MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "No v0 cache keys found for migration for appKey: " + aVar.a(), null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Found v0 cache key: " + ((String) CollectionsKt.first(linkedHashMap.keySet())) + ", migrating to new key: " + aVar.b(), null, false, 12, null);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        String strB = aVar.b();
        Object objFirst = CollectionsKt.first(linkedHashMap.values());
        editor.putString(strB, objFirst instanceof String ? (String) objFirst : null);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            editor.remove((String) ((Map.Entry) it.next()).getKey());
        }
        editor.commit();
    }

    public final void i(com.moloco.sdk.internal.services.init.a aVar, SharedPreferences sharedPreferences) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitCacheImpl", "Performing migration for cache key: " + aVar.b(), null, false, 12, null);
        f(aVar, sharedPreferences);
    }

    @Override // com.moloco.sdk.internal.services.init.g
    public Object a(Continuation continuation) {
        Object objG = eg.g.g(this.f55645c, new b(null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
