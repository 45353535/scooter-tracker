package com.appodeal.ads;

import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.SdkInternalEvent;
import com.appodeal.ads.initializing.ApdInitializationError;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import com.appodeal.ads.network.IndexProvider;
import com.appodeal.ads.service.ServiceError;
import com.appodeal.ads.storage.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l4 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.appodeal.ads.networking.usecases.b f13595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8 f13596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.appodeal.ads.initializing.m f13597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j5 f13598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.appodeal.ads.utils.tracker.b f13599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.appodeal.ads.utils.session.r f13600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b9 f13601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.appodeal.ads.storage.e0 f13602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f13603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppodealAnalytics f13604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v3 f13605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IndexProvider f13606l;

    public l4(com.appodeal.ads.networking.usecases.b getConfig, n8 registerServices, com.appodeal.ads.initializing.m errorContainer, j5 initRequest, com.appodeal.ads.utils.tracker.b memoryTracker, com.appodeal.ads.utils.session.r sessionManager, b9 adLifecycleTracker, com.appodeal.ads.storage.e0 keyValueStorage, d0 keyValueStorageInitializer, AppodealAnalytics sdkAnalytics, v3 getGeneralParams, IndexProvider endpointIndexProvider) {
        Intrinsics.checkNotNullParameter(getConfig, "getConfig");
        Intrinsics.checkNotNullParameter(registerServices, "registerServices");
        Intrinsics.checkNotNullParameter(errorContainer, "errorContainer");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(memoryTracker, "memoryTracker");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(adLifecycleTracker, "adLifecycleTracker");
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        Intrinsics.checkNotNullParameter(keyValueStorageInitializer, "keyValueStorageInitializer");
        Intrinsics.checkNotNullParameter(sdkAnalytics, "sdkAnalytics");
        Intrinsics.checkNotNullParameter(getGeneralParams, "getGeneralParams");
        Intrinsics.checkNotNullParameter(endpointIndexProvider, "endpointIndexProvider");
        this.f13595a = getConfig;
        this.f13596b = registerServices;
        this.f13597c = errorContainer;
        this.f13598d = initRequest;
        this.f13599e = memoryTracker;
        this.f13600f = sessionManager;
        this.f13601g = adLifecycleTracker;
        this.f13602h = keyValueStorage;
        this.f13603i = keyValueStorageInitializer;
        this.f13604j = sdkAnalytics;
        this.f13605k = getGeneralParams;
        this.f13606l = endpointIndexProvider;
    }

    public static final Event a(long j10) {
        return new SdkInternalEvent.SdkInternalCmp(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.appodeal.ads.l4 r4, android.content.Context r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.appodeal.ads.w2
            if (r0 == 0) goto L16
            r0 = r6
            com.appodeal.ads.w2 r0 = (com.appodeal.ads.w2) r0
            int r1 = r0.f15171t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15171t = r1
            goto L1b
        L16:
            com.appodeal.ads.w2 r0 = new com.appodeal.ads.w2
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f15169r
            java.lang.Object r6 = pf.b.g()
            int r1 = r0.f15171t
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.d.b(r4)
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.d.b(r4)
            com.appodeal.advertising.AdvertisingInfo r4 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            r0.f15171t = r2
            java.lang.Object r4 = r4.getAdvertisingProfile(r5, r0)
            if (r4 != r6) goto L42
            return r6
        L42:
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r4 = (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r4
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "AdvertisingProfile"
            java.lang.String r0 = "Extract"
            com.appodeal.ads.utils.Log.log(r6, r0, r5)
            com.appodeal.ads.v4 r5 = com.appodeal.ads.v4.f15140a
            java.lang.String r5 = "applyAdvertisingProfile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r5 = com.appodeal.ads.v4.f15145f
            boolean r5 = r5.getIsLimitAdTrackingEnabled()
            boolean r6 = r4.getIsLimitAdTrackingEnabled()
            if (r5 != r6) goto L72
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r5 = com.appodeal.ads.v4.f15145f
            java.lang.String r5 = r5.getId()
            java.lang.String r6 = r4.getId()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 != 0) goto L7a
        L72:
            com.appodeal.ads.v4.j()
            com.appodeal.ads.v4.f15145f = r4
            com.appodeal.ads.v4.j()
        L7a:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.l4.d(com.appodeal.ads.l4, android.content.Context, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final void g(l4 l4Var, Map map) {
        Throwable thG;
        l4Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            ServiceVariant serviceVariant = (ServiceVariant) entry.getKey();
            Object objL = ((Result) entry.getValue()).l();
            if (Result.i(objL) && (thG = Result.g(objL)) != null) {
                ServiceError serviceError = thG instanceof ServiceError ? (ServiceError) thG : null;
                Object error = Intrinsics.areEqual(serviceError, ServiceError.Adjust.NoAppToken.INSTANCE) ? ApdInitializationError.NonCritical.AdjustNotInitialized.NoAppToken.INSTANCE : Intrinsics.areEqual(serviceError, ServiceError.Adjust.NoEnvironment.INSTANCE) ? ApdInitializationError.NonCritical.AdjustNotInitialized.NoEnvironment.INSTANCE : Intrinsics.areEqual(serviceError, ServiceError.Appsflyer.NoAppIdProvided.INSTANCE) ? ApdInitializationError.NonCritical.AppsflyerNotInitialized.NoAppIdProvided.INSTANCE : Intrinsics.areEqual(serviceError, ServiceError.Appsflyer.NoDevKeyProvided.INSTANCE) ? ApdInitializationError.NonCritical.AppsflyerNotInitialized.NoDevKeyProvided.INSTANCE : Intrinsics.areEqual(serviceError, ServiceError.FacebookAnalytics.AppIdIsNotOverridden.INSTANCE) ? ApdInitializationError.NonCritical.FacebookAnalyticsNotInitialized.AppIdIsNotOverridden.INSTANCE : Intrinsics.areEqual(serviceError, ServiceError.FacebookAnalytics.ClientTokenIsNotOverridden.INSTANCE) ? ApdInitializationError.NonCritical.FacebookAnalyticsNotInitialized.ClientTokenIsNotOverridden.INSTANCE : Intrinsics.areEqual(serviceError, ServiceError.FirebaseAnalytics.GoogleServicesNotApplied.INSTANCE) ? ApdInitializationError.NonCritical.FirebaseAnalyticsNotInitialized.GoogleServicesNotApplied.INSTANCE : new ApdInitializationError.NonCritical.OtherError(serviceVariant.getServiceName(), thG.getMessage());
                com.appodeal.ads.initializing.m mVar = l4Var.f13597c;
                Intrinsics.checkNotNullParameter(error, "error");
                mVar.f13486a.add(error);
            }
        }
    }

    public static void h(ArrayList arrayList) {
        String message;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ApdInitializationError apdInitializationError = (ApdInitializationError) it.next();
            if (apdInitializationError instanceof ApdInitializationError.Critical) {
                message = ((ApdInitializationError.Critical) apdInitializationError).getDescription();
            } else if (apdInitializationError instanceof ApdInitializationError.NonCritical) {
                ApdInitializationError.NonCritical nonCritical = (ApdInitializationError.NonCritical) apdInitializationError;
                message = nonCritical.getComponentName() + ": " + nonCritical.getDescription();
            } else {
                if (!(apdInitializationError instanceof ApdInitializationError.InternalError)) {
                    throw new lf.m();
                }
                message = apdInitializationError.getMessage();
            }
            x5 x5VarC = o2.c();
            if (message == null) {
                message = "";
            }
            x5VarC.b(message);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r6.c(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(com.appodeal.ads.l4 r6, android.content.Context r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof com.appodeal.ads.e3
            if (r0 == 0) goto L16
            r0 = r8
            com.appodeal.ads.e3 r0 = (com.appodeal.ads.e3) r0
            int r1 = r0.f13267u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f13267u = r1
            goto L1b
        L16:
            com.appodeal.ads.e3 r0 = new com.appodeal.ads.e3
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f13265s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13267u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.d.b(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            android.content.Context r7 = r0.f13264r
            kotlin.d.b(r8)
            goto L5d
        L3e:
            kotlin.d.b(r8)
            com.appodeal.ads.storage.e0 r6 = r6.f13602h
            r0.f13264r = r7
            r0.f13267u = r5
            com.appodeal.ads.storage.a0 r6 = r6.f14800a
            kotlin.Lazy r8 = r6.f14783a
            java.lang.Object r8 = r8.getValue()
            kotlinx.coroutines.s r8 = (kotlinx.coroutines.s) r8
            com.appodeal.ads.storage.i r2 = new com.appodeal.ads.storage.i
            r2.<init>(r6, r3)
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L5d
            goto L7a
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 != 0) goto L7b
            com.appodeal.ads.k7 r6 = com.appodeal.ads.k7.f13545a
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r8 = "getPackageName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.f13264r = r3
            r0.f13267u = r4
            java.lang.Object r6 = r6.c(r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.l4.j(com.appodeal.ads.l4, android.content.Context, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final com.appodeal.ads.analytics.models.GeneralParams m(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (eg.g.g(r2, r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.content.Context r7, java.lang.String r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.appodeal.ads.s3
            if (r0 == 0) goto L13
            r0 = r9
            com.appodeal.ads.s3 r0 = (com.appodeal.ads.s3) r0
            int r1 = r0.f14455w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14455w = r1
            goto L18
        L13:
            com.appodeal.ads.s3 r0 = new com.appodeal.ads.s3
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f14453u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14455w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.appodeal.ads.l4 r7 = r0.f14450r
            kotlin.d.b(r9)
            goto L7e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            android.content.Context r7 = r0.f14452t
            java.lang.String r8 = r0.f14451s
            com.appodeal.ads.l4 r2 = r0.f14450r
            kotlin.d.b(r9)
            r9 = r8
            r8 = r7
            r7 = r2
            goto L60
        L43:
            kotlin.d.b(r9)
            android.content.Context r7 = r7.getApplicationContext()
            com.appodeal.ads.storage.d0 r9 = r6.f13603i
            r0.f14450r = r6
            r0.f14451s = r8
            r0.f14452t = r7
            r0.f14455w = r4
            com.appodeal.ads.storage.a0 r9 = r9.f14796a
            java.lang.Object r9 = r9.e(r0)
            if (r9 != r1) goto L5d
            goto L7d
        L5d:
            r9 = r8
            r8 = r7
            r7 = r6
        L60:
            com.appodeal.ads.x5 r2 = com.appodeal.ads.o2.f14208a
            r4 = 0
            r2.a(r4)
            kotlinx.coroutines.CoroutineDispatcher r2 = eg.o0.b()
            com.appodeal.ads.b4 r5 = new com.appodeal.ads.b4
            r5.<init>(r7, r8, r9, r4)
            r0.f14450r = r7
            r0.f14451s = r4
            r0.f14452t = r4
            r0.f14455w = r3
            java.lang.Object r8 = eg.g.g(r2, r5, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            com.appodeal.ads.initializing.m r8 = r7.f13597c
            java.util.ArrayList r8 = r8.f13486a
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r8)
            com.appodeal.ads.initializing.m r9 = r7.f13597c
            java.util.ArrayList r9 = r9.f13486a
            h(r9)
            com.appodeal.ads.initializing.m r7 = r7.f13597c
            java.util.ArrayList r7 = r7.f13486a
            r7.clear()
            java.lang.Object r7 = com.appodeal.ads.ext.ResultExtKt.asSuccess(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.l4.c(android.content.Context, java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.appodeal.ads.a3
            if (r0 == 0) goto L13
            r0 = r8
            com.appodeal.ads.a3 r0 = (com.appodeal.ads.a3) r0
            int r1 = r0.f11873u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11873u = r1
            goto L18
        L13:
            com.appodeal.ads.a3 r0 = new com.appodeal.ads.a3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f11871s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f11873u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r0 = r0.f11870r
            kotlin.d.b(r8)
            goto L48
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.d.b(r8)
            long r4 = java.lang.System.currentTimeMillis()
            com.appodeal.ads.v4 r8 = com.appodeal.ads.v4.f15140a
            r0.f11870r = r4
            r0.f11873u = r3
            java.lang.Object r7 = r8.b(r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            com.appodeal.ads.analytics.AppodealAnalytics r7 = com.appodeal.ads.analytics.AppodealAnalytics.INSTANCE
            com.appodeal.ads.j4 r8 = new com.appodeal.ads.j4
            r8.<init>()
            r7.internalEvent(r8)
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.l4.e(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void f() {
        this.f13604j.setGeneralParamsProvider(new Function0() { // from class: com.appodeal.ads.k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l4.m(this.f13537b);
            }
        });
    }
}
