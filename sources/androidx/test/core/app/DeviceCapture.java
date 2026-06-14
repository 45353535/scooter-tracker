package androidx.test.core.app;

import android.app.UiAutomation;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import androidx.annotation.RestrictTo;
import androidx.test.core.internal.os.HandlerExecutor;
import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.platform.graphics.HardwareRendererCompat;
import eg.w0;
import eg.x1;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.b;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\b\u0010\u0007\u001a\u00020\u0006H\u0007\u001a!\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"canTakeScreenshot", "", "forceRedrawGlobalWindowViews", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "takeScreenshot", "Landroid/graphics/Bitmap;", "takeScreenshotNoSync", "takeScreenshotOnNextFrame", "uiAutomation", "Landroid/app/UiAutomation;", "hardwareDrawingEnabled", "(Landroid/app/UiAutomation;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_java_androidx_test_core-core_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DeviceCapture {

    /* JADX INFO: renamed from: androidx.test.core.app.DeviceCapture$forceRedrawGlobalWindowViews$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.app.DeviceCapture", f = "DeviceCapture.kt", l = {126}, m = "forceRedrawGlobalWindowViews")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceCapture.forceRedrawGlobalWindowViews(this);
        }
    }

    /* JADX INFO: renamed from: androidx.test.core.app.DeviceCapture$takeScreenshotNoSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.app.DeviceCapture$takeScreenshotNoSync$1", f = "DeviceCapture.kt", l = {113}, m = "invokeSuspend")
    static final class C16871 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Ref$ObjectRef $bitmap;
        final /* synthetic */ Ref$ObjectRef $exception;
        final /* synthetic */ boolean $hardwareDrawingEnabled;
        final /* synthetic */ UiAutomation $uiAutomation;
        int label;

        /* JADX INFO: renamed from: androidx.test.core.app.DeviceCapture$takeScreenshotNoSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.app.DeviceCapture$takeScreenshotNoSync$1$1", f = "DeviceCapture.kt", l = {114, 115}, m = "invokeSuspend")
        static final class C01201 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Ref$ObjectRef $bitmap;
            final /* synthetic */ Ref$ObjectRef $exception;
            final /* synthetic */ boolean $hardwareDrawingEnabled;
            final /* synthetic */ UiAutomation $uiAutomation;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01201(Ref$ObjectRef ref$ObjectRef, UiAutomation uiAutomation, boolean z10, Ref$ObjectRef ref$ObjectRef2, Continuation continuation) {
                super(2, continuation);
                this.$bitmap = ref$ObjectRef;
                this.$uiAutomation = uiAutomation;
                this.$hardwareDrawingEnabled = z10;
                this.$exception = ref$ObjectRef2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C01201(this.$bitmap, this.$uiAutomation, this.$hardwareDrawingEnabled, this.$exception, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) throws java.lang.Exception {
                /*
                    r4 = this;
                    java.lang.Object r0 = pf.b.g()
                    int r1 = r4.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r4.L$0
                    kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
                    kotlin.d.b(r5)
                    goto L46
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1e:
                    kotlin.d.b(r5)
                    goto L2e
                L22:
                    kotlin.d.b(r5)
                    r4.label = r3
                    java.lang.Object r5 = androidx.test.core.app.DeviceCapture.access$forceRedrawGlobalWindowViews(r4)
                    if (r5 != r0) goto L2e
                    goto L43
                L2e:
                    kotlin.jvm.internal.Ref$ObjectRef r5 = r4.$bitmap
                    android.app.UiAutomation r1 = r4.$uiAutomation
                    java.lang.String r3 = "uiAutomation"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                    boolean r3 = r4.$hardwareDrawingEnabled
                    r4.L$0 = r5
                    r4.label = r2
                    java.lang.Object r1 = androidx.test.core.app.DeviceCapture.access$takeScreenshotOnNextFrame(r1, r3, r4)
                    if (r1 != r0) goto L44
                L43:
                    return r0
                L44:
                    r0 = r5
                    r5 = r1
                L46:
                    r0.f93280b = r5
                    kotlin.jvm.internal.Ref$ObjectRef r5 = r4.$exception
                    java.lang.Object r5 = r5.f93280b
                    java.lang.Exception r5 = (java.lang.Exception) r5
                    if (r5 != 0) goto L58
                    kotlin.jvm.internal.Ref$ObjectRef r5 = r4.$bitmap
                    java.lang.Object r5 = r5.f93280b
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                    return r5
                L58:
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.app.DeviceCapture.C16871.C01201.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((C01201) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16871(Ref$ObjectRef ref$ObjectRef, UiAutomation uiAutomation, boolean z10, Ref$ObjectRef ref$ObjectRef2, Continuation continuation) {
            super(2, continuation);
            this.$bitmap = ref$ObjectRef;
            this.$uiAutomation = uiAutomation;
            this.$hardwareDrawingEnabled = z10;
            this.$exception = ref$ObjectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C16871(this.$bitmap, this.$uiAutomation, this.$hardwareDrawingEnabled, this.$exception, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            b.a aVar = kotlin.time.b.f93560c;
            long jS = kotlin.time.c.s(5, cg.b.f6839f);
            C01201 c01201 = new C01201(this.$bitmap, this.$uiAutomation, this.$hardwareDrawingEnabled, this.$exception, null);
            this.label = 1;
            Object objD = x1.d(jS, c01201, this);
            return objD == objG ? objG : objD;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C16871) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean canTakeScreenshot() {
        return (InstrumentationRegistry.getInstrumentation().getUiAutomation() == null || Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object forceRedrawGlobalWindowViews(kotlin.coroutines.Continuation r5) throws androidx.test.platform.view.inspector.WindowInspectorCompat.ViewRetrievalException {
        /*
            boolean r0 = r5 instanceof androidx.test.core.app.DeviceCapture.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.test.core.app.DeviceCapture$forceRedrawGlobalWindowViews$1 r0 = (androidx.test.core.app.DeviceCapture.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.test.core.app.DeviceCapture$forceRedrawGlobalWindowViews$1 r0 = new androidx.test.core.app.DeviceCapture$forceRedrawGlobalWindowViews$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.L$0
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.d.b(r5)
            goto L60
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.d.b(r5)
            java.util.List r5 = androidx.test.platform.view.inspector.WindowInspectorCompat.getGlobalWindowViews()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Found "
            r2.append(r4)
            int r4 = r5.size()
            r2.append(r4)
            java.lang.String r4 = " global views to redraw"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "DeviceCapture"
            android.util.Log.d(r4, r2)
            java.util.Iterator r5 = r5.iterator()
            r2 = r5
        L60:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r2.next()
            android.view.View r5 = (android.view.View) r5
            java.lang.String r4 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r5 = androidx.test.core.view.ViewCapture.forceRedraw(r5, r0)
            if (r5 != r1) goto L60
            return r1
        L7c:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.app.DeviceCapture.forceRedrawGlobalWindowViews(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final Bitmap takeScreenshot() throws RuntimeException {
        InstrumentationRegistry.getInstrumentation().waitForIdleSync();
        return takeScreenshotNoSync();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final Bitmap takeScreenshotNoSync() throws RuntimeException {
        Checks.checkState(canTakeScreenshot());
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        CoroutineDispatcher coroutineDispatcherB = w0.b(new HandlerExecutor(new Handler(Looper.getMainLooper())));
        UiAutomation uiAutomation = InstrumentationRegistry.getInstrumentation().getUiAutomation();
        if (uiAutomation == null) {
            throw new RuntimeException("uiautomation is null");
        }
        boolean zIsDrawingEnabled = HardwareRendererCompat.isDrawingEnabled();
        HardwareRendererCompat.setDrawingEnabled(true);
        return (Bitmap) eg.g.e(coroutineDispatcherB, new C16871(ref$ObjectRef, uiAutomation, zIsDrawingEnabled, ref$ObjectRef2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object takeScreenshotOnNextFrame(final UiAutomation uiAutomation, final boolean z10, Continuation continuation) {
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.test.core.app.DeviceCapture$takeScreenshotOnNextFrame$2$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                Bitmap bitmapTakeScreenshot = null;
                int i10 = 1;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    bitmapTakeScreenshot = uiAutomation.takeScreenshot();
                    if (bitmapTakeScreenshot != null) {
                        Log.i("DeviceCapture", "got bitmap, returning");
                        break;
                    }
                    i10++;
                }
                HardwareRendererCompat.setDrawingEnabled(z10);
                if (bitmapTakeScreenshot != null) {
                    eVar.r(bitmapTakeScreenshot, new Function1<Throwable, Unit>() { // from class: androidx.test.core.app.DeviceCapture$takeScreenshotOnNextFrame$2$1.1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                            invoke2(th2);
                            return Unit.f93236a;
                        }
                    });
                    return;
                }
                Log.w("DeviceCapture", "failed to get bitmap, returning exception");
                CancellableContinuation cancellableContinuation = eVar;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(kotlin.d.a(new RuntimeException("uiAutomation.takeScreenshot returned null"))));
            }
        });
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }
}
