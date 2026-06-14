package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import j$.util.Objects;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes9.dex */
public final class Jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Jk f37166a = new Jk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3986qh f37167b = new C3986qh();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f37168c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Deferred f37169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Mk f37170e;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (a((kotlin.coroutines.Continuation) r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Fk
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Fk r0 = (com.inmobi.media.Fk) r0
            int r1 = r0.f36872c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36872c = r1
            goto L18
        L13:
            com.inmobi.media.Fk r0 = new com.inmobi.media.Fk
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f36870a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36872c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r7)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.d.b(r7)
            goto L4c
        L38:
            kotlin.d.b(r7)
            com.inmobi.media.qh r7 = com.inmobi.media.Jk.f37167b
            com.inmobi.media.Gk r2 = new com.inmobi.media.Gk
            r5 = 0
            r2.<init>(r5)
            r0.f36872c = r4
            java.lang.Object r7 = com.inmobi.media.F3.a(r7, r2, r0)
            if (r7 != r1) goto L4c
            goto L54
        L4c:
            r0.f36872c = r3
            java.lang.Object r7 = a(r0)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jk.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static Object a(Continuation continuation) {
        C3986qh c3986qh = Yi.f38062a;
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getUnifiedIdServiceConfig();
        unifiedIdServiceConfig.getUrl();
        Object objA = F3.a(f37167b, new Hk(unifiedIdServiceConfig, null), continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation continuation) {
        if (inMobiUnifiedIdInterface != null) {
            kotlin.coroutines.jvm.internal.b.a(f37168c.add(inMobiUnifiedIdInterface));
        }
        if (f37167b.f39393b.get() != null) {
            Objects.toString(inMobiUnifiedIdInterface);
            return Unit.f93236a;
        }
        Object objA = a(continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
