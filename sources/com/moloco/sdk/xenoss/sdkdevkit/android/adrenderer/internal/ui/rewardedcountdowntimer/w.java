package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57245r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f57246s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f57247t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f57248u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Animatable f57249v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function0 f57250w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ MutableState f57251x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, Animatable animatable, Function0 function0, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f57247t = i10;
            this.f57248u = i11;
            this.f57249v = animatable;
            this.f57250w = function0;
            this.f57251x = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f57247t, this.f57248u, this.f57249v, this.f57250w, this.f57251x, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        
            if (r15.snapTo(r2, r14) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[PHI: r11
  0x00a7: PHI (r11v4 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w$a) = 
  (r11v1 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w$a)
  (r11v9 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w$a)
 binds: [B:41:0x00a5, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r14.f57246s
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L2d
                if (r1 == r2) goto L26
                if (r1 != r3) goto L1e
                int r1 = r14.f57245r
                kotlin.d.b(r15)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L1b
                r11 = r14
                goto L81
            L16:
                r0 = move-exception
                r15 = r0
                r11 = r14
                goto L8f
            L1b:
                r11 = r14
                goto L9e
            L1e:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L26:
                int r1 = r14.f57245r
                kotlin.d.b(r15)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L1b
                r11 = r14
                goto L83
            L2d:
                kotlin.d.b(r15)
                androidx.compose.runtime.MutableState r15 = r14.f57251x
                int r15 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w.o(r15)
                int r1 = r14.f57247t
                int r4 = r14.f57248u
                float r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.f.a(r1, r4)
                if (r1 >= r15) goto L6f
                int r15 = r15 - r1
                r5 = 0
                int r15 = kotlin.ranges.g.e(r15, r5)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                int r15 = r15 * 1000
                int r15 = kotlin.ranges.g.e(r15, r5)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                androidx.compose.animation.core.Animatable r6 = r14.f57249v     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.c(r4)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                androidx.compose.animation.core.Easing r4 = androidx.compose.animation.core.EasingKt.getLinearEasing()     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                r8 = 0
                androidx.compose.animation.core.TweenSpec r8 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r15, r5, r4, r3, r8)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                r14.f57245r = r1     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                r14.f57246s = r2     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                r9 = 0
                r10 = 0
                r12 = 12
                r13 = 0
                r11 = r14
                java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                if (r15 != r0) goto L83
                goto L80
            L6c:
                r0 = move-exception
                r11 = r14
                goto L8e
            L6f:
                r11 = r14
                androidx.compose.animation.core.Animatable r15 = r11.f57249v     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.c(r4)     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                r11.f57245r = r1     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                r11.f57246s = r3     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                java.lang.Object r15 = r15.snapTo(r2, r14)     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                if (r15 != r0) goto L81
            L80:
                return r0
            L81:
                kotlin.Unit r15 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
            L83:
                androidx.compose.runtime.MutableState r15 = r11.f57251x
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w.m(r15, r1)
                int r15 = r11.f57247t
                if (r15 != 0) goto Lac
                goto La7
            L8d:
                r0 = move-exception
            L8e:
                r15 = r0
            L8f:
                androidx.compose.runtime.MutableState r0 = r11.f57251x
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w.m(r0, r1)
                int r0 = r11.f57247t
                if (r0 != 0) goto L9d
                kotlin.jvm.functions.Function0 r0 = r11.f57250w
                r0.invoke()
            L9d:
                throw r15
            L9e:
                androidx.compose.runtime.MutableState r15 = r11.f57251x
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w.m(r15, r1)
                int r15 = r11.f57247t
                if (r15 != 0) goto Lac
            La7:
                kotlin.jvm.functions.Function0 r15 = r11.f57250w
                r15.invoke()
            Lac:
                kotlin.Unit r15 = kotlin.Unit.f93236a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57252r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Animatable f57253s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MutableState f57254t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable animatable, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f57253s = animatable;
            this.f57254t = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f57253s, this.f57254t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57252r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                if (!w.j(this.f57254t)) {
                    Animatable animatable = this.f57253s;
                    this.f57252r = 1;
                    if (animatable.stop(this) == objG) {
                        return objG;
                    }
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

    public static final class c implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f57255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LifecycleEventObserver f57256b;

        public c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.f57255a = lifecycleOwner;
            this.f57256b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f57255a.getLifecycle().removeObserver(this.f57256b);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57257a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f57257a = iArr;
        }
    }

    public static final DisposableEffectResult a(LifecycleOwner lifecycleOwner, final Animatable animatable, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.v
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                w.g(animatable, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final MutableState b(int i10) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i10), null, 2, null);
    }

    public static final Unit c(long j10, float f10, Animatable animatable, long j11, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long jSize = SizeKt.Size(Size.m1440getWidthimpl(Canvas.mo2040getSizeNHjbRc()), Size.m1437getHeightimpl(Canvas.mo2040getSizeNHjbRc()));
        float fMo308toPx0680j_4 = Canvas.mo308toPx0680j_4(f10);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        androidx.compose.ui.graphics.drawscope.b.v(Canvas, j10, 360.0f, 360.0f, false, 0L, jSize, 0.0f, new Stroke(fMo308toPx0680j_4, 0.0f, companion.m1928getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            androidx.compose.ui.graphics.drawscope.b.v(Canvas, j11, 270.0f, kotlin.ranges.g.d(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, SizeKt.Size(Size.m1440getWidthimpl(Canvas.mo2040getSizeNHjbRc()), Size.m1437getHeightimpl(Canvas.mo2040getSizeNHjbRc())), 0.0f, new Stroke(Canvas.mo308toPx0680j_4(f10), 0.0f, companion.m1928getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return Unit.f93236a;
    }

    public static final Unit d(long j10, long j11, Modifier modifier, float f10, float f11, Function0 function0, LifecycleOwner lifecycleOwner, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        f(j10, j11, modifier, f10, f11, function0, lifecycleOwner, i10, i11, composer, i12 | 1, i13);
        return Unit.f93236a;
    }

    public static final Unit e(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final long r34, final long r36, androidx.compose.ui.Modifier r38, float r39, float r40, final kotlin.jvm.functions.Function0 r41, androidx.lifecycle.LifecycleOwner r42, final int r43, final int r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.w.f(long, long, androidx.compose.ui.Modifier, float, float, kotlin.jvm.functions.Function0, androidx.lifecycle.LifecycleOwner, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(Animatable animatable, MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.f57257a[event.ordinal()];
        if (i10 == 1) {
            i(mutableState, false);
        } else if (i10 == 2 && ((Number) animatable.getValue()).floatValue() > 0.0f) {
            i(mutableState, true);
        }
    }

    public static final void h(MutableState mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    public static final void i(MutableState mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean j(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int k(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final Unit l(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.f93236a;
    }
}
