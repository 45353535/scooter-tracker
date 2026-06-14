package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
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
public abstract class o {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57209r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f57210s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f57211t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f57212u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Animatable f57213v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function0 f57214w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ MutableState f57215x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, Animatable animatable, Function0 function0, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f57211t = i10;
            this.f57212u = i11;
            this.f57213v = animatable;
            this.f57214w = function0;
            this.f57215x = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f57211t, this.f57212u, this.f57213v, this.f57214w, this.f57215x, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        
            if (r15.snapTo(r2, r14) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[PHI: r11
  0x00a7: PHI (r11v4 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o$a) = 
  (r11v1 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o$a)
  (r11v9 com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o$a)
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
                int r1 = r14.f57210s
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L2d
                if (r1 == r2) goto L26
                if (r1 != r3) goto L1e
                int r1 = r14.f57209r
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
                int r1 = r14.f57209r
                kotlin.d.b(r15)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L1b
                r11 = r14
                goto L83
            L2d:
                kotlin.d.b(r15)
                androidx.compose.runtime.MutableState r15 = r14.f57215x
                int r15 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o.r(r15)
                int r1 = r14.f57211t
                int r4 = r14.f57212u
                float r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.f.a(r1, r4)
                if (r1 >= r15) goto L6f
                int r15 = r15 - r1
                r5 = 0
                int r15 = kotlin.ranges.g.e(r15, r5)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                int r15 = r15 * 1000
                int r15 = kotlin.ranges.g.e(r15, r5)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                androidx.compose.animation.core.Animatable r6 = r14.f57213v     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.c(r4)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                androidx.compose.animation.core.Easing r4 = androidx.compose.animation.core.EasingKt.getLinearEasing()     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                r8 = 0
                androidx.compose.animation.core.TweenSpec r8 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r15, r5, r4, r3, r8)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                r14.f57209r = r1     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
                r14.f57210s = r2     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L6c
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
                androidx.compose.animation.core.Animatable r15 = r11.f57213v     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.c(r4)     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                r11.f57209r = r1     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                r11.f57210s = r3     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                java.lang.Object r15 = r15.snapTo(r2, r14)     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
                if (r15 != r0) goto L81
            L80:
                return r0
            L81:
                kotlin.Unit r15 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L8d java.util.concurrent.CancellationException -> L9e
            L83:
                androidx.compose.runtime.MutableState r15 = r11.f57215x
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o.n(r15, r1)
                int r15 = r11.f57211t
                if (r15 != 0) goto Lac
                goto La7
            L8d:
                r0 = move-exception
            L8e:
                r15 = r0
            L8f:
                androidx.compose.runtime.MutableState r0 = r11.f57215x
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o.n(r0, r1)
                int r0 = r11.f57211t
                if (r0 != 0) goto L9d
                kotlin.jvm.functions.Function0 r0 = r11.f57214w
                r0.invoke()
            L9d:
                throw r15
            L9e:
                androidx.compose.runtime.MutableState r15 = r11.f57215x
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o.n(r15, r1)
                int r15 = r11.f57211t
                if (r15 != 0) goto Lac
            La7:
                kotlin.jvm.functions.Function0 r15 = r11.f57214w
                r15.invoke()
            Lac:
                kotlin.Unit r15 = kotlin.Unit.f93236a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57216r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Animatable f57217s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MutableState f57218t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable animatable, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f57217s = animatable;
            this.f57218t = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f57217s, this.f57218t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57216r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                if (!o.o(this.f57218t)) {
                    Animatable animatable = this.f57217s;
                    this.f57216r = 1;
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
        public final /* synthetic */ LifecycleOwner f57219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LifecycleEventObserver f57220b;

        public c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.f57219a = lifecycleOwner;
            this.f57220b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f57219a.getLifecycle().removeObserver(this.f57220b);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57221a;

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
            f57221a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long a(MutableState mutableState) {
        return ((IntSize) mutableState.getValue()).getPackedValue();
    }

    public static final DisposableEffectResult b(LifecycleOwner lifecycleOwner, final Animatable animatable, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.n
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                o.i(animatable, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final MutableState c(int i10) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i10), null, 2, null);
    }

    public static final Unit d(long j10, float f10, Animatable animatable, long j11, MutableState mutableState, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long jSize = SizeKt.Size(IntSize.m4111getWidthimpl(a(mutableState)), IntSize.m4110getHeightimpl(a(mutableState)));
        float fMo308toPx0680j_4 = Canvas.mo308toPx0680j_4(f10);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        androidx.compose.ui.graphics.drawscope.b.v(Canvas, j10, 360.0f, 360.0f, false, 0L, jSize, 0.0f, new Stroke(fMo308toPx0680j_4, 0.0f, companion.m1928getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            androidx.compose.ui.graphics.drawscope.b.v(Canvas, j11, 270.0f, kotlin.ranges.g.d(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, SizeKt.Size(IntSize.m4111getWidthimpl(a(mutableState)), IntSize.m4110getHeightimpl(a(mutableState))), 0.0f, new Stroke(Canvas.mo308toPx0680j_4(f10), 0.0f, companion.m1928getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return Unit.f93236a;
    }

    public static final Unit e(long j10, long j11, Modifier modifier, float f10, float f11, Function0 function0, String str, LifecycleOwner lifecycleOwner, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        h(j10, j11, modifier, f10, f11, function0, str, lifecycleOwner, i10, i11, composer, i12 | 1, i13);
        return Unit.f93236a;
    }

    public static final Unit f(MutableState mutableState, IntSize intSize) {
        k(mutableState, intSize.getPackedValue());
        return Unit.f93236a;
    }

    public static final Unit g(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final long r43, final long r45, androidx.compose.ui.Modifier r47, float r48, float r49, final kotlin.jvm.functions.Function0 r50, final java.lang.String r51, androidx.lifecycle.LifecycleOwner r52, final int r53, final int r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instruction units count: 1611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.o.h(long, long, androidx.compose.ui.Modifier, float, float, kotlin.jvm.functions.Function0, java.lang.String, androidx.lifecycle.LifecycleOwner, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void i(Animatable animatable, MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.f57221a[event.ordinal()];
        if (i10 == 1) {
            l(mutableState, false);
        } else if (i10 == 2 && ((Number) animatable.getValue()).floatValue() > 0.0f) {
            l(mutableState, true);
        }
    }

    public static final void j(MutableState mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    public static final void k(MutableState mutableState, long j10) {
        mutableState.setValue(IntSize.m4103boximpl(j10));
    }

    public static final void l(MutableState mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    public static final Unit m(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.f93236a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean o(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int p(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }
}
