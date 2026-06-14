package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57326r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f57327s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ gg.v f57328t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ View f57329u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gg.v vVar, View view, Continuation continuation) {
            super(2, continuation);
            this.f57328t = vVar;
            this.f57329u = view;
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((a) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f57328t, this.f57329u, continuation);
            aVar.f57327s = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.k(r5, r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r5.w(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.f57326r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.d.b(r5)
                goto L3f
            L1b:
                kotlin.d.b(r5)
                boolean r5 = r4.f57327s
                if (r5 == 0) goto L2f
                gg.v r5 = r4.f57328t
                android.view.View r1 = r4.f57329u
                r4.f57326r = r3
                java.lang.Object r5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.h(r5, r1, r4)
                if (r5 != r0) goto L3f
                goto L3e
            L2f:
                gg.v r5 = r4.f57328t
                r1 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
                r4.f57326r = r2
                java.lang.Object r5 = r5.w(r1, r4)
                if (r5 != r0) goto L3f
            L3e:
                return r0
            L3f:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57330r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f57331s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ gg.v f57332t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gg.v vVar, Continuation continuation) {
            super(2, continuation);
            this.f57332t = vVar;
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((b) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f57332t, continuation);
            bVar.f57331s = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57330r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                boolean z10 = this.f57331s;
                gg.v vVar = this.f57332t;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(z10);
                this.f57330r = 1;
                if (vVar.w(boolA, this) == objG) {
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

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57333r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57334s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ gg.v f57335t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ View f57336u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gg.v vVar, View view, Continuation continuation) {
            super(2, continuation);
            this.f57335t = vVar;
            this.f57336u = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Boolean bool, Continuation continuation) {
            return ((c) create(bool, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f57335t, this.f57336u, continuation);
            cVar.f57334s = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.j(r6, r1, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r6.w(r1, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f57333r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
                goto L49
            L1b:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.f57334s
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r1 = 0
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r1)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
                if (r6 != 0) goto L3a
                gg.v r6 = r5.f57335t
                android.view.View r1 = r5.f57336u
                r5.f57333r = r3
                java.lang.Object r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.e(r6, r1, r5)
                if (r6 != r0) goto L49
                goto L48
            L3a:
                gg.v r6 = r5.f57335t
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
                r5.f57333r = r2
                java.lang.Object r6 = r6.w(r1, r5)
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57337r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57338s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ View f57339t;

        public static final class a implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ gg.v f57340b;

            public a(gg.v vVar) {
                this.f57340b = vVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                this.f57340b.e(Boolean.TRUE);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                this.f57340b.e(Boolean.FALSE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, Continuation continuation) {
            super(2, continuation);
            this.f57339t = view;
        }

        public static final Unit i(View view, a aVar) {
            view.removeOnAttachStateChangeListener(aVar);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.v vVar, Continuation continuation) {
            return ((d) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.f57339t, continuation);
            dVar.f57338s = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (gg.t.b(r1, r4, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f57337r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r6)
                goto L5c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f57338s
                gg.v r1 = (gg.v) r1
                kotlin.d.b(r6)
                goto L3f
            L22:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.f57338s
                r1 = r6
                gg.v r1 = (gg.v) r1
                android.view.View r6 = r5.f57339t
                boolean r6 = r6.isAttachedToWindow()
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
                r5.f57338s = r1
                r5.f57337r = r3
                java.lang.Object r6 = r1.w(r6, r5)
                if (r6 != r0) goto L3f
                goto L5b
            L3f:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v$d$a r6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v$d$a
                r6.<init>(r1)
                android.view.View r3 = r5.f57339t
                r3.addOnAttachStateChangeListener(r6)
                android.view.View r3 = r5.f57339t
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w
                r4.<init>()
                r6 = 0
                r5.f57338s = r6
                r5.f57337r = r2
                java.lang.Object r6 = gg.t.b(r1, r4, r5)
                if (r6 != r0) goto L5c
            L5b:
                return r0
            L5c:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57341r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f57342s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f57343t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ View f57344u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view, Continuation continuation) {
            super(2, continuation);
            this.f57344u = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = new e(this.f57344u, continuation);
            eVar.f57343t = obj;
            return eVar;
        }

        /* JADX WARN: Path cross not found for [B:13:0x0044, B:16:0x004e], limit reached: 22 */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[PHI: r1 r5
  0x0060: PHI (r1v2 android.graphics.Rect) = (r1v3 android.graphics.Rect), (r1v5 android.graphics.Rect) binds: [B:18:0x005d, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0060: PHI (r5v2 kotlinx.coroutines.flow.FlowCollector) = (r5v3 kotlinx.coroutines.flow.FlowCollector), (r5v5 kotlinx.coroutines.flow.FlowCollector) binds: [B:18:0x005d, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006c -> B:11:0x003c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r8.f57342s
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f57341r
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                java.lang.Object r5 = r8.f57343t
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.d.b(r9)
                goto L3c
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f57341r
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                java.lang.Object r5 = r8.f57343t
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.d.b(r9)
                goto L60
            L2f:
                kotlin.d.b(r9)
                java.lang.Object r9 = r8.f57343t
                r5 = r9
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r4, r4, r4, r4)
            L3c:
                android.view.View r9 = r8.f57344u
                boolean r9 = r9.isShown()
                if (r9 == 0) goto L4e
                android.view.View r9 = r8.f57344u
                boolean r9 = r9.getGlobalVisibleRect(r1)
                if (r9 == 0) goto L4e
                r9 = r3
                goto L4f
            L4e:
                r9 = r4
            L4f:
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r9)
                r8.f57343t = r5
                r8.f57341r = r1
                r8.f57342s = r3
                java.lang.Object r9 = r5.emit(r9, r8)
                if (r9 != r0) goto L60
                goto L6e
            L60:
                r8.f57343t = r5
                r8.f57341r = r1
                r8.f57342s = r2
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r9 = eg.k0.a(r6, r8)
                if (r9 != r0) goto L3c
            L6e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57345r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57346s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f57347t;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57348a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57348a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Lifecycle lifecycle, Continuation continuation) {
            super(2, continuation);
            this.f57347t = lifecycle;
        }

        public static final Unit i(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            lifecycle.removeObserver(lifecycleEventObserver);
            return Unit.f93236a;
        }

        public static final void j(gg.v vVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i10 = a.f57348a[event.ordinal()];
            if (i10 == 1) {
                gg.k.b(vVar.e(Boolean.FALSE));
            } else if (i10 != 2) {
                Unit unit = Unit.f93236a;
            } else {
                gg.k.b(vVar.e(Boolean.TRUE));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.v vVar, Continuation continuation) {
            return ((f) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(this.f57347t, continuation);
            fVar.f57346s = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57345r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                final gg.v vVar = (gg.v) this.f57346s;
                final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        v.f.j(vVar, lifecycleOwner, event);
                    }
                };
                this.f57347t.addObserver(lifecycleEventObserver);
                final Lifecycle lifecycle = this.f57347t;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v.f.i(lifecycle, lifecycleEventObserver);
                    }
                };
                this.f57345r = 1;
                if (gg.t.b(vVar, function0, this) == objG) {
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

    public static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57349r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57350s;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((g) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            g gVar = new g(continuation);
            gVar.f57350s = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57349r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f57350s;
                this.f57349r = 1;
                if (flowCollector.emit(null, this) == objG) {
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

    public static final Flow b(View view) {
        return g(hg.i.f(new d(view, null)));
    }

    public static final Flow c(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        return (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? hg.i.B(new g(null)) : g(hg.i.f(new f(lifecycle, null)));
    }

    public static final Flow f(View view) {
        return g(hg.i.B(new e(view, null)));
    }

    public static final Flow g(Flow flow) {
        return hg.i.E(hg.i.p(hg.i.n(flow)), com.moloco.sdk.internal.scheduling.c.a().getMain());
    }

    public static final Object i(gg.v vVar, View view, Continuation continuation) {
        Object objL = hg.i.l(b(view), new a(vVar, view, null), continuation);
        return objL == pf.b.g() ? objL : Unit.f93236a;
    }

    public static final Object j(gg.v vVar, View view, Continuation continuation) {
        Object objL = hg.i.l(f(view), new b(vVar, null), continuation);
        return objL == pf.b.g() ? objL : Unit.f93236a;
    }

    public static final Object k(gg.v vVar, View view, Continuation continuation) {
        Object objL = hg.i.l(c(ViewTreeLifecycleOwner.get(view)), new c(vVar, view, null), continuation);
        return objL == pf.b.g() ? objL : Unit.f93236a;
    }
}
