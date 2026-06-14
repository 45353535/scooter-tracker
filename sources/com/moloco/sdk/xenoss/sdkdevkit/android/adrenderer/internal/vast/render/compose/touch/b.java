package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58052r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58053s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f58054t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2 f58055u;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a, reason: collision with other inner class name */
        public static final class C0765a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58056r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f58057s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f58058t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function2 f58059u;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a$a, reason: collision with other inner class name */
            public static final class C0766a extends j implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f58060r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f58061s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f58062t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function2 f58063u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0766a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, Function2 function2, Continuation continuation) {
                    super(2, continuation);
                    this.f58062t = aVar;
                    this.f58063u = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((C0766a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    C0766a c0766a = new C0766a(this.f58062t, this.f58063u, continuation);
                    c0766a.f58061s = obj;
                    return c0766a;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = pf.b.g()
                        int r1 = r5.f58060r
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L26
                        if (r1 == r3) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r0 = r5.f58061s
                        androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                        kotlin.d.b(r6)
                        goto L56
                    L16:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1e:
                        java.lang.Object r1 = r5.f58061s
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.d.b(r6)
                        goto L3a
                    L26:
                        kotlin.d.b(r6)
                        java.lang.Object r6 = r5.f58061s
                        r1 = r6
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        r5.f58061s = r1
                        r5.f58060r = r3
                        r6 = 0
                        java.lang.Object r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r6, r5)
                        if (r6 != r0) goto L3a
                        goto L53
                    L3a:
                        androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
                        boolean r3 = r6.getPressed()
                        boolean r4 = r6.getPreviousPressed()
                        if (r3 == r4) goto L49
                        r6.consume()
                    L49:
                        r5.f58061s = r6
                        r5.f58060r = r2
                        java.lang.Object r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(r1, r5)
                        if (r1 != r0) goto L54
                    L53:
                        return r0
                    L54:
                        r0 = r6
                        r6 = r1
                    L56:
                        androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
                        if (r6 != 0) goto L60
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r6 = r5.f58062t
                        r6.a()
                        goto L7a
                    L60:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r1 = r5.f58062t
                        r1.b()
                        kotlin.jvm.functions.Function2 r1 = r5.f58063u
                        long r2 = r0.getPosition()
                        androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m1360boximpl(r2)
                        long r2 = r6.getPosition()
                        androidx.compose.ui.geometry.Offset r6 = androidx.compose.ui.geometry.Offset.m1360boximpl(r2)
                        r1.invoke(r0, r6)
                    L7a:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0765a.C0766a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0765a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.f58057s = aVar;
                this.f58058t = pointerInputScope;
                this.f58059u = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0765a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0765a(this.f58057s, this.f58058t, this.f58059u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f58056r;
                if (i10 == 0) {
                    d.b(obj);
                    this.f58057s.c();
                    PointerInputScope pointerInputScope = this.f58058t;
                    C0766a c0766a = new C0766a(this.f58057s, this.f58059u, null);
                    this.f58056r = 1;
                    if (pointerInputScope.awaitPointerEventScope(c0766a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f58054t = aVar;
            this.f58055u = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((a) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f58054t, this.f58055u, continuation);
            aVar.f58053s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58052r;
            if (i10 == 0) {
                d.b(obj);
                C0765a c0765a = new C0765a(this.f58054t, (PointerInputScope) this.f58053s, this.f58055u, null);
                this.f58052r = 1;
                if (i.g(c0765a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b, reason: collision with other inner class name */
    public static final class C0767b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58064r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58065s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f58066t;

        public C0767b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58065s = obj;
            this.f58066t |= Integer.MIN_VALUE;
            return b.c(null, this);
        }
    }

    public static final Object b(PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
        Object objForEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a(pointerInputScope), function2, null), continuation);
        return objForEachGesture == pf.b.g() ? objForEachGesture : Unit.f93236a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[PHI: r13 r14
  0x0053: PHI (r13v1 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r13v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r13v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:18:0x0050, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r14v2 java.lang.Object) = (r14v8 java.lang.Object), (r14v1 java.lang.Object) binds: [B:18:0x0050, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a0 -> B:36:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.AwaitPointerEventScope r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
