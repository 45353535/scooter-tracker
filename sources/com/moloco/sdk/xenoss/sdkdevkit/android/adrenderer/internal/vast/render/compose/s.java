package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class s {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58026r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m f58027s;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s$a$a, reason: collision with other inner class name */
        public static final class C0763a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58028r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m f58029s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0763a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, Continuation continuation) {
                super(2, continuation);
                this.f58029s = mVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0763a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0763a(this.f58029s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f58028r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f58029s.b();
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, Continuation continuation) {
            super(2, continuation);
            this.f58027s = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f58027s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58026r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0763a c0763a = new C0763a(this.f58027s, null);
                this.f58026r = 1;
                if (eg.g.g(main, c0763a, this) == objG) {
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

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1 {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) this.receiver).i(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) obj);
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58030r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58031s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function0 f58032t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m f58033u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, Continuation continuation) {
            super(2, continuation);
            this.f58032t = function0;
            this.f58033u = mVar;
        }

        public static final Unit i(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, Offset offset, Offset offset2) {
            if (function0 != null) {
                function0.invoke();
            } else {
                mVar.k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f57289a.c(offset.getPackedValue()));
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((c) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f58032t, this.f58033u, continuation);
            cVar.f58031s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58030r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f58031s;
                final Function0 function0 = this.f58032t;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar = this.f58033u;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return s.c.i(function0, mVar, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.f58030r = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.b(pointerInputScope, function2, this) == objG) {
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

    public /* synthetic */ class d extends kotlin.jvm.internal.y implements Function1 {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m.class, "onMuteChange", "onMuteChange(Z)V", 0);
        }

        public final void a(boolean z10) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) this.receiver).c(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.y implements Function0 {
        public e(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class f extends kotlin.jvm.internal.y implements Function0 {
        public f(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m) this.receiver).u();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class g implements Function6 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Alignment f58034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f58035c;

        public static final class a implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j f58036b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f58037c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function0 f58038d;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0 function0, Function0 function02) {
                this.f58036b = jVar;
                this.f58037c = function0;
                this.f58038d = function02;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(989733896, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous>.<anonymous> (Linear.kt:155)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = this.f58036b;
                if (jVar != null) {
                    a0.b(jVar, this.f58037c, this.f58038d, null, composer, 0, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.f93236a;
            }
        }

        public g(Alignment alignment, PaddingValues paddingValues) {
            this.f58034b = alignment;
            this.f58035c = paddingValues;
        }

        public final void a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0 onDisplayed, Function0 onClick, Composer composer, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onDisplayed, "onDisplayed");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i10 & 6) == 0) {
                i11 = (composer.changed(boxScope) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= composer.changed(jVar) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= composer.changed(onDisplayed) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= composer.changed(onClick) ? 2048 : 1024;
            }
            if ((i11 & 9363) == 9362 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903645392, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous> (Linear.kt:149)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(jVar != null, PaddingKt.padding(boxScope.align(Modifier.INSTANCE, this.f58034b), this.f58035c), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 989733896, true, new a(jVar, onDisplayed, onClick)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            a((BoxScope) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) obj2, (Function0) obj3, (Function0) obj4, (Composer) obj5, ((Number) obj6).intValue());
            return Unit.f93236a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o a(MutableState mutableState) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) mutableState.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o b(State state) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) state.getValue();
    }

    public static final Unit c(MutableState mutableState, boolean z10) {
        k(mutableState, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o(Boolean.valueOf(z10)));
        return Unit.f93236a;
    }

    public static final Unit d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, MutableState mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mVar.n(it);
        j(mutableState, it);
        return Unit.f93236a;
    }

    public static final Unit e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, MutableState mutableState, boolean z10) {
        mVar.e(z10);
        m(mutableState, z10);
        return Unit.f93236a;
    }

    public static final Unit f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, a.AbstractC0780a.c button, a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        mVar.m(button);
        mVar.p(buttonType);
        return Unit.f93236a;
    }

    public static final Unit g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, Function0 function0, Modifier modifier, Function7 function7, Function5 function5, Function6 function6, Function7 function72, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t tVar, Function0 function02, int i10, int i11, Composer composer, int i12) {
        l(mVar, function0, modifier, function7, function5, function6, function72, tVar, function02, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final Unit h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m mVar, boolean z10) {
        if (z10) {
            mVar.D();
        } else {
            mVar.F();
        }
        return Unit.f93236a;
    }

    public static final Function6 i(Alignment alignment, PaddingValues paddingValues, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1318345093);
        if ((i11 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomStart();
        }
        if ((i11 & 2) != 0) {
            paddingValues = PaddingKt.m411PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1318345093, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon (Linear.kt:148)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -903645392, true, new g(alignment, paddingValues));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final void j(MutableState mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        mutableState.setValue(iVar);
    }

    public static final void k(MutableState mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar) {
        mutableState.setValue(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m r32, final kotlin.jvm.functions.Function0 r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function7 r35, final kotlin.jvm.functions.Function5 r36, final kotlin.jvm.functions.Function6 r37, final kotlin.jvm.functions.Function7 r38, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t r39, final kotlin.jvm.functions.Function0 r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function7, kotlin.jvm.functions.Function5, kotlin.jvm.functions.Function6, kotlin.jvm.functions.Function7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void m(MutableState mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean n(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final boolean o(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i p(MutableState mutableState) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) mutableState.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j q(State state) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) state.getValue();
    }
}
