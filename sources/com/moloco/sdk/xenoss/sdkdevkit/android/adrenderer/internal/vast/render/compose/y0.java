package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CoroutineContext f58110a = com.moloco.sdk.internal.scheduling.c.a().getMain();

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58111r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58112s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MutableState f58113t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ MutableState f58114u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58115v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ State f58116w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ State f58117x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState mutableState, MutableState mutableState2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, State state, State state2, Continuation continuation) {
            super(2, continuation);
            this.f58113t = mutableState;
            this.f58114u = mutableState2;
            this.f58115v = gVar;
            this.f58116w = state;
            this.f58117x = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f58113t, this.f58114u, this.f58115v, this.f58116w, this.f58117x, continuation);
            aVar.f58112s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58111r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f58112s;
            y0.e(this.f58116w).invoke(kotlin.coroutines.jvm.internal.b.a(aVar.d()));
            this.f58113t.setValue(kotlin.coroutines.jvm.internal.b.a(aVar.d()));
            this.f58114u.setValue(kotlin.coroutines.jvm.internal.b.a(aVar.c()));
            y0.i(this.f58117x).invoke(kotlin.coroutines.jvm.internal.b.a(aVar.e()));
            View viewN = this.f58115v.N();
            if (viewN != null) {
                viewN.setKeepScreenOn(aVar.c());
            }
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58118r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58119s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ State f58120t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(State state, Continuation continuation) {
            super(2, continuation);
            this.f58120t = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation continuation) {
            return ((b) create(iVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f58120t, continuation);
            bVar.f58119s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58118r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            y0.l(this.f58120t).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) this.f58119s);
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58121r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58122s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ State f58123t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(State state, Continuation continuation) {
            super(2, continuation);
            this.f58123t = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar, Continuation continuation) {
            return ((c) create(lVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f58123t, continuation);
            cVar.f58122s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58121r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            y0.n(this.f58123t).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) this.f58122s);
            return Unit.f93236a;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58124r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58125s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58126t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f58126t = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f58126t, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f58125s
                r2 = 0
                r3 = 4
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L29
                if (r1 == r5) goto L20
                if (r1 != r4) goto L18
                java.lang.Object r0 = r6.f58124r
                android.view.View r0 = (android.view.View) r0
                kotlin.d.b(r7)
                goto L57
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r1 = r6.f58124r
                android.view.View r1 = (android.view.View) r1
                kotlin.d.b(r7)
                r7 = r1
                goto L44
            L29:
                kotlin.d.b(r7)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g r7 = r6.f58126t
                android.view.View r7 = r7.N()
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g r1 = r6.f58126t
                if (r7 == 0) goto L39
                r7.setVisibility(r3)
            L39:
                r6.f58124r = r7
                r6.f58125s = r5
                java.lang.Object r1 = r1.a(r6)
                if (r1 != r0) goto L44
                goto L55
            L44:
                if (r7 == 0) goto L49
                r7.setVisibility(r2)
            L49:
                r6.f58124r = r7
                r6.f58125s = r4
                r4 = 50
                java.lang.Object r1 = eg.k0.a(r4, r6)
                if (r1 != r0) goto L56
            L55:
                return r0
            L56:
                r0 = r7
            L57:
                if (r0 == 0) goto L5c
                r0.setVisibility(r3)
            L5c:
                if (r0 == 0) goto L61
                r0.setVisibility(r2)
            L61:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58127r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58128s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f58129t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o f58130u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o f58131v;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58132r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58133s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f58134t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o f58135u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o f58136v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar2, Continuation continuation) {
                super(2, continuation);
                this.f58133s = gVar;
                this.f58134t = str;
                this.f58135u = oVar;
                this.f58136v = oVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58133s, this.f58134t, this.f58135u, this.f58136v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f58132r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar = this.f58133s;
                String str = this.f58134t;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = this.f58135u;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar2 = this.f58136v;
                gVar.a(str);
                gVar.seekTo(((Number) oVar.a()).longValue());
                y0.j(gVar, oVar2);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar2, Continuation continuation) {
            super(2, continuation);
            this.f58128s = gVar;
            this.f58129t = str;
            this.f58130u = oVar;
            this.f58131v = oVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f58128s, this.f58129t, this.f58130u, this.f58131v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58127r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineContext coroutineContext = y0.f58110a;
                a aVar = new a(this.f58128s, this.f58129t, this.f58130u, this.f58131v, null);
                this.f58127r = 1;
                if (eg.g.g(coroutineContext, aVar, this) == objG) {
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

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58137r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58138s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o f58139t;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58140r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58141s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o f58142t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar, Continuation continuation) {
                super(2, continuation);
                this.f58141s = gVar;
                this.f58142t = oVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58141s, this.f58142t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f58140r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                y0.j(this.f58141s, this.f58142t);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar, Continuation continuation) {
            super(2, continuation);
            this.f58138s = gVar;
            this.f58139t = oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f58138s, this.f58139t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58137r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineContext coroutineContext = y0.f58110a;
                a aVar = new a(this.f58138s, this.f58139t, null);
                this.f58137r = 1;
                if (eg.g.g(coroutineContext, aVar, this) == objG) {
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
        public int f58143r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58144s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f58145t;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58146r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58147s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ boolean f58148t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, boolean z10, Continuation continuation) {
                super(2, continuation);
                this.f58147s = gVar;
                this.f58148t = z10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58147s, this.f58148t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f58146r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f58147s.b(this.f58148t);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f58144s = gVar;
            this.f58145t = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f58144s, this.f58145t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58143r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineContext coroutineContext = y0.f58110a;
                a aVar = new a(this.f58144s, this.f58145t, null);
                this.f58143r = 1;
                if (eg.g.g(coroutineContext, aVar, this) == objG) {
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

    public static final class h implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f58149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g f58150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State f58151c;

        public h(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, State state) {
            this.f58149a = list;
            this.f58150b = gVar;
            this.f58151c = state;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            Iterator it = this.f58149a.iterator();
            while (it.hasNext()) {
                Job.a.a((Job) it.next(), null, 1, null);
            }
            this.f58150b.destroy();
            y0.e(this.f58151c).invoke(Boolean.FALSE);
        }
    }

    public static final FrameLayout a(View view, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final DisposableEffectResult b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, State state, State state2, State state3, State state4, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new h(CollectionsKt.listOf((Object[]) new Job[]{hg.i.F(hg.i.K(gVar.isPlaying(), new a(mutableState, mutableState2, gVar, state, state2, null)), coroutineScope), hg.i.F(hg.i.K(gVar.o(), new b(state3, null)), coroutineScope), hg.i.F(hg.i.K(hg.i.w(gVar.f()), new c(state4, null)), coroutineScope)}), gVar, state);
    }

    public static final Unit c(String str, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar2, boolean z11, Function1 function1, Function1 function12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, Function1 function13, Function1 function14, Modifier modifier, int i10, int i11, int i12, Composer composer, int i13) {
        g(str, z10, oVar, oVar2, z11, function1, function12, tVar, function13, function14, modifier, composer, i10 | 1, i11, i12);
        return Unit.f93236a;
    }

    public static final CoroutineContext d() {
        return f58110a;
    }

    public static final Function1 e(State state) {
        return (Function1) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(final java.lang.String r34, final boolean r35, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o r36, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o r37, final boolean r38, final kotlin.jvm.functions.Function1 r39, final kotlin.jvm.functions.Function1 r40, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t r41, final kotlin.jvm.functions.Function1 r42, final kotlin.jvm.functions.Function1 r43, androidx.compose.ui.Modifier r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y0.g(java.lang.String, boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final MutableState h() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final Function1 i(State state) {
        return (Function1) state.getValue();
    }

    public static final void j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar) {
        if (((Boolean) oVar.a()).booleanValue()) {
            gVar.play();
        } else {
            gVar.pause();
        }
    }

    public static final MutableState k() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final Function1 l(State state) {
        return (Function1) state.getValue();
    }

    public static final Function1 n(State state) {
        return (Function1) state.getValue();
    }
}
