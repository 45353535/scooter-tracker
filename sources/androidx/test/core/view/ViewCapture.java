package androidx.test.core.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import androidx.test.core.internal.os.HandlerExecutor;
import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.os.ControlledLooper;
import androidx.test.internal.platform.reflect.ReflectionException;
import androidx.test.internal.platform.reflect.ReflectiveField;
import androidx.test.internal.platform.reflect.ReflectiveMethod;
import com.google.common.util.concurrent.ListenableFuture;
import eg.o0;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a!\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a)\u0010\u0010\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0083@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0010\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0083@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0083@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\u0006*\u00020\u0004H\u0002\u001a\f\u0010\u0019\u001a\u00020\u0006*\u00020\u0004H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0013*\u00020\u0004H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"getControlledLooper", "Landroidx/test/internal/platform/os/ControlledLooper;", "captureToBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/View;", "rect", "Landroid/graphics/Rect;", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "captureToBitmapAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "forceRedraw", "", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateBitmap", "generateBitmapFromDraw", "destBitmap", "generateBitmapFromPixelCopy", "(Landroid/view/View;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "surface", "Landroid/view/Surface;", "(Landroid/view/View;Landroid/view/Surface;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateBitmapFromSurfaceViewPixelCopy", "Landroid/view/SurfaceView;", "(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoundsInSurface", "getBoundsInWindow", "getSurface", "reflectivelyGetLocationInSurface", "locationInSurface", "", "core_java_androidx_test_core-core_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewCapture {

    /* JADX INFO: renamed from: androidx.test.core.view.ViewCapture$captureToBitmap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.view.ViewCapture", f = "ViewCapture.kt", l = {93, 94}, m = "captureToBitmap")
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
            return ViewCapture.captureToBitmap(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.test.core.view.ViewCapture$captureToBitmapAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.view.ViewCapture$captureToBitmapAsync$1", f = "ViewCapture.kt", l = {110}, m = "invokeSuspend")
    static final class C16881 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Rect $rect;
        final /* synthetic */ View $this_captureToBitmapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16881(View view, Rect rect, Continuation continuation) {
            super(2, continuation);
            this.$this_captureToBitmapAsync = view;
            this.$rect = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C16881(this.$this_captureToBitmapAsync, this.$rect, continuation);
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
            View view = this.$this_captureToBitmapAsync;
            Rect rect = this.$rect;
            this.label = 1;
            Object objCaptureToBitmap = ViewCapture.captureToBitmap(view, rect, this);
            return objCaptureToBitmap == objG ? objG : objCaptureToBitmap;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C16881) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.test.core.view.ViewCapture$forceRedraw$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.test.core.view.ViewCapture", f = "ViewCapture.kt", l = {322}, m = "forceRedraw")
    static final class C16891 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C16891(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ViewCapture.forceRedraw(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object captureToBitmap(@org.jetbrains.annotations.NotNull android.view.View r8, @org.jetbrains.annotations.Nullable android.graphics.Rect r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.view.ViewCapture.captureToBitmap(android.view.View, android.graphics.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object captureToBitmap$default(View view, Rect rect, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return captureToBitmap(view, rect, continuation);
    }

    @NotNull
    public static final ListenableFuture<Bitmap> captureToBitmapAsync(@NotNull View view, @Nullable Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return SuspendToFutureAdapter.launchFuture$default(SuspendToFutureAdapter.INSTANCE, o0.c(), false, new C16881(view, rect, null), 2, null);
    }

    public static /* synthetic */ ListenableFuture captureToBitmapAsync$default(View view, Rect rect, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return captureToBitmapAsync(view, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object forceRedraw(@org.jetbrains.annotations.NotNull android.view.View r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.view.ViewCapture.forceRedraw(android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object generateBitmap(View view, Rect rect, Continuation continuation) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect != null ? rect.width() : view.getWidth(), rect != null ? rect.height() : view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(rectWidth, … Bitmap.Config.ARGB_8888)");
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 26 ? generateBitmapFromDraw(view, bitmapCreateBitmap, rect) : i10 >= 34 ? generateBitmapFromPixelCopy(view, bitmapCreateBitmap, rect, continuation) : view instanceof SurfaceView ? generateBitmapFromSurfaceViewPixelCopy((SurfaceView) view, bitmapCreateBitmap, rect, continuation) : generateBitmapFromPixelCopy(view, getSurface(view), bitmapCreateBitmap, rect, continuation);
    }

    static /* synthetic */ Object generateBitmap$default(View view, Rect rect, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return generateBitmap(view, rect, continuation);
    }

    @NotNull
    public static final Bitmap generateBitmapFromDraw(@NotNull View view, @NotNull Bitmap destBitmap, @Nullable Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(destBitmap, "destBitmap");
        destBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
        view.computeScroll();
        Canvas canvas = new Canvas(destBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        if (rect != null) {
            canvas.translate(-rect.left, -rect.top);
        }
        view.draw(canvas);
        return destBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(26)
    public static final Object generateBitmapFromPixelCopy(View view, Surface surface, final Bitmap bitmap, Rect rect, Continuation continuation) throws ReflectionException {
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        Rect boundsInSurface = getBoundsInSurface(view);
        if (rect != null) {
            int i10 = boundsInSurface.left;
            int i11 = rect.left + i10;
            int i12 = boundsInSurface.top;
            boundsInSurface = new Rect(i11, rect.top + i12, i10 + rect.right, i12 + rect.bottom);
        }
        PixelCopy.request(surface, boundsInSurface, bitmap, a.a(new PixelCopy$OnPixelCopyFinishedListener() { // from class: androidx.test.core.view.ViewCapture$generateBitmapFromPixelCopy$2$onCopyFinished$1
            public final void onPixelCopyFinished(int i13) {
                if (i13 == 0) {
                    CancellableContinuation cancellableContinuation = eVar;
                    Result.Companion companion = Result.f93230c;
                    cancellableContinuation.resumeWith(Result.b(bitmap));
                } else {
                    CancellableContinuation cancellableContinuation2 = eVar;
                    Result.Companion companion2 = Result.f93230c;
                    cancellableContinuation2.resumeWith(Result.b(kotlin.d.a(new RuntimeException("PixelCopy failed: " + i13))));
                }
            }
        }), new Handler(Looper.getMainLooper()));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    static /* synthetic */ Object generateBitmapFromPixelCopy$default(View view, Bitmap bitmap, Rect rect, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rect = null;
        }
        return generateBitmapFromPixelCopy(view, bitmap, rect, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(26)
    public static final Object generateBitmapFromSurfaceViewPixelCopy(SurfaceView surfaceView, final Bitmap bitmap, Rect rect, Continuation continuation) {
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        PixelCopy.request(surfaceView, rect, bitmap, a.a(new PixelCopy$OnPixelCopyFinishedListener() { // from class: androidx.test.core.view.ViewCapture$generateBitmapFromSurfaceViewPixelCopy$2$onCopyFinished$1
            public final void onPixelCopyFinished(int i10) {
                if (i10 == 0) {
                    CancellableContinuation cancellableContinuation = eVar;
                    Result.Companion companion = Result.f93230c;
                    cancellableContinuation.resumeWith(Result.b(bitmap));
                    return;
                }
                CancellableContinuation cancellableContinuation2 = eVar;
                a1 a1Var = a1.f93282a;
                String str = String.format("PixelCopy failed: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                RuntimeException runtimeException = new RuntimeException(str);
                Result.Companion companion2 = Result.f93230c;
                cancellableContinuation2.resumeWith(Result.b(kotlin.d.a(runtimeException)));
            }
        }), surfaceView.getHandler());
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getBoundsInSurface(View view) throws ReflectionException {
        int[] iArr = {0, 0};
        if (Build.VERSION.SDK_INT < 29) {
            reflectivelyGetLocationInSurface(view, iArr);
        } else {
            view.getLocationInSurface(iArr);
        }
        int i10 = iArr[0];
        int i11 = iArr[1];
        Rect rect = new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11);
        Log.d("ViewCapture", "getBoundsInSurface " + rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getBoundsInWindow(View view) {
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11);
    }

    private static final ControlledLooper getControlledLooper() {
        Object objLoadSingleService = ServiceLoaderWrapper.loadSingleService(ControlledLooper.class, new ServiceLoaderWrapper.Factory() { // from class: androidx.test.core.view.ViewCapture.getControlledLooper.1
            @Override // androidx.test.internal.platform.ServiceLoaderWrapper.Factory
            public final ControlledLooper create() {
                return ControlledLooper.NO_OP_CONTROLLED_LOOPER;
            }
        });
        Intrinsics.checkNotNullExpressionValue(objLoadSingleService, "loadSingleService(Contro…_OP_CONTROLLED_LOOPER\n  }");
        return (ControlledLooper) objLoadSingleService;
    }

    private static final Surface getSurface(View view) throws ReflectionException {
        Object obj = new ReflectiveField("android.view.ViewRootImpl", "mSurface").get(new ReflectiveMethod((Class<?>) View.class, "getViewRootImpl", (Class<?>[]) new Class[0]).invoke(view, new Object[0]));
        Intrinsics.checkNotNullExpressionValue(obj, "ReflectiveField<Surface>…rface\").get(viewRootImpl)");
        return (Surface) obj;
    }

    @SuppressLint({"NewApi"})
    private static final void reflectivelyGetLocationInSurface(View view, int[] iArr) throws ReflectionException {
        view.getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT >= 28) {
            Log.w("ViewCapture", "Could not calculate offset of view in surface on API 28, resulting image may have incorrect positioning");
            return;
        }
        Rect rect = (Rect) new ReflectiveField((Class<?>) WindowManager.LayoutParams.class, "surfaceInsets").get((WindowManager.LayoutParams) new ReflectiveField("android.view.ViewRootImpl", "mWindowAttributes").get(new ReflectiveMethod((Class<?>) View.class, "getViewRootImpl", (Class<?>[]) new Class[0]).invoke(view, new Object[0])));
        iArr[0] = iArr[0] + rect.left;
        iArr[1] = iArr[1] + rect.top;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(34)
    public static final Object generateBitmapFromPixelCopy(View view, Bitmap bitmap, Rect rect, Continuation continuation) {
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        PixelCopy.Request.Builder builderOfWindow = PixelCopy.Request.Builder.ofWindow(view);
        if (rect == null) {
            rect = getBoundsInWindow(view);
        }
        PixelCopy.Request requestBuild = builderOfWindow.setSourceRect(rect).setDestinationBitmap(bitmap).build();
        Intrinsics.checkNotNullExpressionValue(requestBuild, "ofWindow(this)\n        .…tBitmap)\n        .build()");
        Consumer consumer = new Consumer() { // from class: androidx.test.core.view.ViewCapture$generateBitmapFromPixelCopy$4$onCopyFinished$1
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public /* bridge */ /* synthetic */ void p(Object obj) {
                accept(m.a(obj));
            }

            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }

            public final void accept(PixelCopy.Result result) {
                if (result.getStatus() == 0) {
                    CancellableContinuation cancellableContinuation = eVar;
                    Result.Companion companion = Result.f93230c;
                    cancellableContinuation.resumeWith(Result.b(result.getBitmap()));
                } else {
                    CancellableContinuation cancellableContinuation2 = eVar;
                    Result.Companion companion2 = Result.f93230c;
                    cancellableContinuation2.resumeWith(Result.b(kotlin.d.a(new RuntimeException("PixelCopy failed: $(result.status)"))));
                }
            }
        };
        Handler handler = view.getHandler();
        Intrinsics.checkNotNullExpressionValue(handler, "handler");
        PixelCopy.request(requestBuild, new HandlerExecutor(handler), consumer);
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }
}
