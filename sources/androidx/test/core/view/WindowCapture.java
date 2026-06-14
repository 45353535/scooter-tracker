package androidx.test.core.view;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Window;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.ListenableFuture;
import eg.o0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a!\u0010\b\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a)\u0010\t\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"captureRegionToBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/Window;", "boundsInWindow", "Landroid/graphics/Rect;", "(Landroid/view/Window;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "captureRegionToBitmapAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "generateBitmap", "generateBitmapFromPixelCopy", "destBitmap", "(Landroid/view/Window;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_java_androidx_test_core-core_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WindowCapture {

    /* JADX INFO: renamed from: androidx.test.core.view.WindowCapture$captureRegionToBitmap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.view.WindowCapture", f = "WindowCapture.kt", l = {57, 58}, m = "captureRegionToBitmap")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        boolean Z$0;
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
            return WindowCapture.captureRegionToBitmap(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.test.core.view.WindowCapture$captureRegionToBitmapAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.view.WindowCapture$captureRegionToBitmapAsync$1", f = "WindowCapture.kt", l = {69}, m = "invokeSuspend")
    static final class C16911 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Rect $boundsInWindow;
        final /* synthetic */ Window $this_captureRegionToBitmapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16911(Window window, Rect rect, Continuation continuation) {
            super(2, continuation);
            this.$this_captureRegionToBitmapAsync = window;
            this.$boundsInWindow = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C16911(this.$this_captureRegionToBitmapAsync, this.$boundsInWindow, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
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
            Window window = this.$this_captureRegionToBitmapAsync;
            Rect rect = this.$boundsInWindow;
            this.label = 1;
            Object objCaptureRegionToBitmap = WindowCapture.captureRegionToBitmap(window, rect, this);
            return objCaptureRegionToBitmap == objG ? objG : objCaptureRegionToBitmap;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C16911) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.test.core.view.WindowCapture$generateBitmap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.view.WindowCapture", f = "WindowCapture.kt", l = {84}, m = "generateBitmap")
    static final class C16921 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C16921(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WindowCapture.generateBitmap(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object captureRegionToBitmap(@org.jetbrains.annotations.NotNull android.view.Window r7, @org.jetbrains.annotations.Nullable android.graphics.Rect r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.test.core.view.WindowCapture.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.test.core.view.WindowCapture$captureRegionToBitmap$1 r0 = (androidx.test.core.view.WindowCapture.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.test.core.view.WindowCapture$captureRegionToBitmap$1 r0 = new androidx.test.core.view.WindowCapture$captureRegionToBitmap$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            boolean r7 = r0.Z$0
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L7d
        L2e:
            r8 = move-exception
            goto L88
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            java.lang.Object r2 = r0.L$0
            android.view.Window r2 = (android.view.Window) r2
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L2e
            r9 = r7
            r7 = r2
            goto L6a
        L48:
            kotlin.d.b(r9)
            boolean r9 = androidx.test.platform.graphics.HardwareRendererCompat.isDrawingEnabled()
            androidx.test.platform.graphics.HardwareRendererCompat.setDrawingEnabled(r4)
            android.view.View r2 = r7.getDecorView()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "decorView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Throwable -> L86
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L86
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L86
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L86
            r0.label = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = androidx.test.core.view.ViewCapture.forceRedraw(r2, r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L6a
            goto L79
        L6a:
            r2 = 0
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L86
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L86
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L86
            r0.label = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r7 = generateBitmap(r7, r8, r0)     // Catch: java.lang.Throwable -> L86
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            r6 = r9
            r9 = r7
            r7 = r6
        L7d:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9     // Catch: java.lang.Throwable -> L2e
            androidx.test.platform.graphics.HardwareRendererCompat.setDrawingEnabled(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            return r9
        L86:
            r8 = move-exception
            r7 = r9
        L88:
            androidx.test.platform.graphics.HardwareRendererCompat.setDrawingEnabled(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.view.WindowCapture.captureRegionToBitmap(android.view.Window, android.graphics.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object captureRegionToBitmap$default(Window window, Rect rect, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return captureRegionToBitmap(window, rect, continuation);
    }

    @NotNull
    public static final ListenableFuture<Bitmap> captureRegionToBitmapAsync(@NotNull Window window, @Nullable Rect rect) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        return SuspendToFutureAdapter.launchFuture$default(SuspendToFutureAdapter.INSTANCE, o0.c(), false, new C16911(window, rect, null), 2, null);
    }

    public static /* synthetic */ ListenableFuture captureRegionToBitmapAsync$default(Window window, Rect rect, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return captureRegionToBitmapAsync(window, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object generateBitmap(@org.jetbrains.annotations.NotNull android.view.Window r5, @org.jetbrains.annotations.Nullable android.graphics.Rect r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof androidx.test.core.view.WindowCapture.C16921
            if (r0 == 0) goto L13
            r0 = r7
            androidx.test.core.view.WindowCapture$generateBitmap$1 r0 = (androidx.test.core.view.WindowCapture.C16921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.test.core.view.WindowCapture$generateBitmap$1 r0 = new androidx.test.core.view.WindowCapture$generateBitmap$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            kotlin.d.b(r7)
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r7)
            if (r6 == 0) goto L3f
            int r7 = r6.width()
            goto L47
        L3f:
            android.view.View r7 = r5.getDecorView()
            int r7 = r7.getWidth()
        L47:
            if (r6 == 0) goto L4e
            int r2 = r6.height()
            goto L56
        L4e:
            android.view.View r2 = r5.getDecorView()
            int r2 = r2.getHeight()
        L56:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r2, r4)
            java.lang.String r2 = "createBitmap(\n      boun…p.Config.ARGB_8888,\n    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 >= r4) goto L74
            android.view.View r5 = r5.getDecorView()
            java.lang.String r0 = "decorView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            androidx.test.core.view.ViewCapture.generateBitmapFromDraw(r5, r7, r6)
            return r7
        L74:
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r5 = generateBitmapFromPixelCopy(r5, r6, r7, r0)
            if (r5 != r1) goto L7f
            return r1
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.view.WindowCapture.generateBitmap(android.view.Window, android.graphics.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object generateBitmap$default(Window window, Rect rect, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return generateBitmap(window, rect, continuation);
    }

    @RequiresApi(26)
    @Nullable
    public static final Object generateBitmapFromPixelCopy(@NotNull Window window, @Nullable Rect rect, @NotNull final Bitmap bitmap, @NotNull Continuation continuation) {
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        PixelCopy.request(window, rect, bitmap, a.a(new PixelCopy$OnPixelCopyFinishedListener() { // from class: androidx.test.core.view.WindowCapture$generateBitmapFromPixelCopy$2$onCopyFinished$1
            public final void onPixelCopyFinished(int i10) {
                if (i10 == 0) {
                    eVar.r(bitmap, new Function1<Throwable, Unit>() { // from class: androidx.test.core.view.WindowCapture$generateBitmapFromPixelCopy$2$onCopyFinished$1.1
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
                CancellableContinuation cancellableContinuation = eVar;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(kotlin.d.a(new RuntimeException("PixelCopy failed: " + i10))));
            }
        }), new Handler(Looper.getMainLooper()));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    public static /* synthetic */ Object generateBitmapFromPixelCopy$default(Window window, Rect rect, Bitmap bitmap, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return generateBitmapFromPixelCopy(window, rect, bitmap, continuation);
    }
}
