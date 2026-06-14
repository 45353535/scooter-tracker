package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f58645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f58646b;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ List A;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a B;
        public final /* synthetic */ a.AbstractC0780a.f C;
        public final /* synthetic */ y D;
        public final /* synthetic */ List E;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z F;
        public final /* synthetic */ Integer G;
        public final /* synthetic */ String H;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58647r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58648s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58649t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58650u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58651v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f58652w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f58653x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f58654y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f58655z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, a.AbstractC0780a.f fVar, y yVar, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, Integer num, String str, Continuation continuation) {
            super(2, continuation);
            this.A = list;
            this.B = aVar;
            this.C = fVar;
            this.D = yVar;
            this.E = list2;
            this.F = zVar;
            this.G = num;
            this.H = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0063 -> B:19:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0065 -> B:19:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:18:0x008d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r13.f58655z
                r2 = 1
                if (r1 == 0) goto L38
                if (r1 != r2) goto L30
                java.lang.Object r1 = r13.f58654y
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r13.f58653x
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r13.f58652w
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.lang.Object r5 = r13.f58651v
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z) r5
                java.lang.Object r6 = r13.f58650u
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r13.f58649t
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y r7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y) r7
                java.lang.Object r8 = r13.f58648s
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$f r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0780a.f) r8
                java.lang.Object r9 = r13.f58647r
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) r9
                kotlin.d.b(r14)
                goto L8d
            L30:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L38:
                kotlin.d.b(r14)
                java.util.List r14 = r13.A
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a r1 = r13.B
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$f r3 = r13.C
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y r4 = r13.D
                java.util.List r5 = r13.E
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z r6 = r13.F
                java.lang.Integer r7 = r13.G
                java.lang.String r8 = r13.H
                java.util.Iterator r14 = r14.iterator()
                r9 = r5
                r12 = r6
                r11 = r7
                r5 = r1
                r6 = r3
                r3 = r4
                r1 = r14
                r14 = r8
            L57:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto Lb3
                java.lang.Object r4 = r1.next()
                java.lang.String r4 = (java.lang.String) r4
                if (r5 == 0) goto L97
                if (r6 == 0) goto L97
                long r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n.a()
                r13.f58647r = r5
                r13.f58648s = r6
                r13.f58649t = r3
                r13.f58650u = r9
                r13.f58651v = r12
                r13.f58652w = r11
                r13.f58653x = r14
                r13.f58654y = r1
                r13.f58655z = r2
                r10 = r13
                java.lang.Object r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y.d(r3, r4, r5, r6, r7, r9, r10)
                if (r4 != r0) goto L85
                return r0
            L85:
                r7 = r3
                r8 = r6
                r6 = r9
                r3 = r14
                r14 = r4
                r9 = r5
                r4 = r11
                r5 = r12
            L8d:
                java.lang.String r14 = (java.lang.String) r14
                r11 = r4
                r12 = r5
                r5 = r9
                r4 = r14
                r14 = r3
                r9 = r6
                r3 = r7
                r6 = r8
            L97:
                if (r12 == 0) goto La2
                int r7 = r12.g()
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.d(r7)
                goto La3
            La2:
                r7 = 0
            La3:
                java.lang.String r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0.h()
                java.lang.String r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0.d(r4, r7, r11, r14, r8)
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y.c(r3)
                r7.a(r4)
                goto L57
            Lb3:
                kotlin.Unit r14 = kotlin.Unit.f93236a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public y(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f58645a = persistentHttpRequest;
        this.f58646b = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getDefault());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x
    public void a(List urls, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, Integer num, String str) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        f(urls, zVar, num, str, CollectionsKt.emptyList(), null, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x
    public void b(List urls, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, Integer num, String str, List renderedButtons, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, a.AbstractC0780a.f lastClickPosition) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(renderedButtons, "renderedButtons");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        f(urls, zVar, num, str, renderedButtons, customUserEventBuilderService, lastClickPosition);
    }

    public final Object e(String str, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, a.AbstractC0780a.f fVar, long j10, List list, Continuation continuation) {
        return aVar.a(j10, new a.AbstractC0780a.d(fVar, null, null, list, 6, null), str, continuation);
    }

    public final void f(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, Integer num, String str, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, a.AbstractC0780a.f fVar) {
        if (list.isEmpty()) {
            return;
        }
        eg.i.d(this.f58646b, null, null, new a(list, aVar, fVar, this, list2, zVar, num, str, null), 3, null);
    }
}
