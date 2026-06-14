package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import k8.df;
import k8.ee;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002/0B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0017\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001a\u001a\u00020\u0016*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010!\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\u0016*\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b%\u0010&J-\u0010*\u001a\u00020\u0016*\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.¨\u00061"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$f;", "Lk8/ee;", "Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/images/DivImageLoader;", "imageLoader", "Lcom/yandex/div/core/view2/DivPlaceholderLoader;", "placeholderLoader", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/images/DivImageLoader;Lcom/yandex/div/core/view2/DivPlaceholderLoader;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/json/expressions/Expression;", "Lk8/y5;", "horizontalAlignment", "Lk8/z5;", "verticalAlignment", "", "observeContentAlignment", "(Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;)V", "Lcom/yandex/div/internal/widget/AspectImageView;", "applyContentAlignment", "(Lcom/yandex/div/internal/widget/AspectImageView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "div", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "applyGifImage", "(Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/ee;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "Lcom/yandex/div/core/images/CachedBitmap;", "cachedBitmap", "loadDrawable", "(Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;Lcom/yandex/div/core/images/CachedBitmap;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "oldDiv", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;Lcom/yandex/div/core/view2/BindingContext;Lk8/ee;Lk8/ee;)V", "Lcom/yandex/div/core/images/DivImageLoader;", "Lcom/yandex/div/core/view2/DivPlaceholderLoader;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", y.f66058y, "LoadDrawableOnPostPTask", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGifImageBinder extends DivViewBinder<y0.f, ee, DivGifImageView> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final DivPlaceholderLoader placeholderLoader;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0010\"\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder$LoadDrawableOnPostPTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Landroid/graphics/drawable/Drawable;", "Ljava/lang/ref/WeakReference;", "Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/images/CachedBitmap;", "cachedBitmap", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/yandex/div/core/images/CachedBitmap;)V", "createDrawableFromBytes", "()Landroid/graphics/drawable/Drawable;", "Landroid/graphics/ImageDecoder$Source;", "createSourceFromUri", "()Landroid/graphics/ImageDecoder$Source;", "", "params", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/drawable/Drawable;", "result", "", "onPostExecute", "(Landroid/graphics/drawable/Drawable;)V", "Ljava/lang/ref/WeakReference;", "getView", "()Ljava/lang/ref/WeakReference;", "Lcom/yandex/div/core/images/CachedBitmap;", "getCachedBitmap", "()Lcom/yandex/div/core/images/CachedBitmap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(28)
    public static final class LoadDrawableOnPostPTask extends AsyncTask<Void, Void, Drawable> {

        @NotNull
        private final CachedBitmap cachedBitmap;

        @NotNull
        private final WeakReference<DivGifImageView> view;

        public LoadDrawableOnPostPTask(@NotNull WeakReference<DivGifImageView> weakReference, @NotNull CachedBitmap cachedBitmap) {
            this.view = weakReference;
            this.cachedBitmap = cachedBitmap;
        }

        private final Drawable createDrawableFromBytes() throws IllegalStateException, IOException {
            Context context;
            byte[] bytes = this.cachedBitmap.getBytes();
            if (bytes == null) {
                throw new IllegalStateException("no bytes stored in cached bitmap");
            }
            DivGifImageView divGifImageView = this.view.get();
            if (divGifImageView == null || (context = divGifImageView.getContext()) == null) {
                throw new IllegalStateException("failed retrieve context");
            }
            File fileCreateTempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
            try {
                i.n(fileCreateTempFile, bytes);
                return ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileCreateTempFile));
            } finally {
                fileCreateTempFile.delete();
            }
        }

        private final ImageDecoder.Source createSourceFromUri() {
            Uri cacheUri = this.cachedBitmap.getCacheUri();
            String path = cacheUri != null ? cacheUri.getPath() : null;
            if (path == null) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivGifImageBinder", "No bytes or file in cache to decode gif drawable");
                }
                return null;
            }
            try {
                return ImageDecoder.createSource(new File(path));
            } catch (IOException e10) {
                if (!KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                    return null;
                }
                Log.e("DivGifImageBinder", "", e10);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.drawable.Drawable doInBackground(@org.jetbrains.annotations.NotNull java.lang.Void... r6) {
            /*
                r5 = this;
                java.lang.String r6 = "DivGifImageBinder"
                r0 = 6
                android.graphics.drawable.Drawable r6 = r5.createDrawableFromBytes()     // Catch: java.lang.IllegalStateException -> L8 java.io.IOException -> L2c
                return r6
            L8:
                r1 = move-exception
                com.yandex.div.internal.KLog r2 = com.yandex.div.internal.KLog.INSTANCE
                com.yandex.div.logging.Severity r3 = com.yandex.div.logging.Severity.ERROR
                boolean r3 = r2.isAtLeast(r3)
                if (r3 == 0) goto L4f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed create drawable from bytes, exception: "
                r3.append(r4)
                java.lang.String r1 = r1.getMessage()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.print(r0, r6, r1)
                goto L4f
            L2c:
                r1 = move-exception
                com.yandex.div.internal.KLog r2 = com.yandex.div.internal.KLog.INSTANCE
                com.yandex.div.logging.Severity r3 = com.yandex.div.logging.Severity.ERROR
                boolean r3 = r2.isAtLeast(r3)
                if (r3 == 0) goto L4f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed writing bytes to temp file, exception: "
                r3.append(r4)
                java.lang.String r1 = r1.getMessage()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.print(r0, r6, r1)
            L4f:
                android.graphics.ImageDecoder$Source r1 = r5.createSourceFromUri()
                if (r1 == 0) goto L7d
                android.graphics.drawable.Drawable r6 = com.bytedance.sdk.component.mzz.mml.lnr.ud.b.a(r1)     // Catch: java.io.IOException -> L5a
                return r6
            L5a:
                r1 = move-exception
                com.yandex.div.internal.KLog r2 = com.yandex.div.internal.KLog.INSTANCE
                com.yandex.div.logging.Severity r3 = com.yandex.div.logging.Severity.ERROR
                boolean r3 = r2.isAtLeast(r3)
                if (r3 == 0) goto L7d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Decode drawable from uri exception "
                r3.append(r4)
                java.lang.String r1 = r1.getMessage()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.print(r0, r6, r1)
            L7d:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivGifImageBinder.LoadDrawableOnPostPTask.doInBackground(java.lang.Void[]):android.graphics.drawable.Drawable");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(@Nullable Drawable result) {
            super.onPostExecute(result);
            if (result == null || !com.bytedance.adsdk.ugeno.tvp.mml.a.a(result)) {
                DivGifImageView divGifImageView = this.view.get();
                if (divGifImageView != null) {
                    divGifImageView.setImage(this.cachedBitmap.getBitmap());
                }
            } else {
                DivGifImageView divGifImageView2 = this.view.get();
                if (divGifImageView2 != null) {
                    divGifImageView2.setImage(result);
                }
            }
            DivGifImageView divGifImageView3 = this.view.get();
            if (divGifImageView3 != null) {
                divGifImageView3.imageLoaded();
            }
        }
    }

    public DivGifImageBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivImageLoader divImageLoader, @NotNull DivPlaceholderLoader divPlaceholderLoader, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, ExpressionResolver expressionResolver, Expression<y5> expression, Expression<z5> expression2) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGifImage(final DivGifImageView divGifImageView, final Div2View div2View, ExpressionResolver expressionResolver, ee eeVar, ErrorCollector errorCollector) {
        Uri uri = (Uri) eeVar.f87254u.evaluate(expressionResolver);
        if (Intrinsics.areEqual(uri, divGifImageView.getGifUrl())) {
            return;
        }
        divGifImageView.resetImageLoaded();
        LoadReference loadReference = divGifImageView.getLoadReference();
        if (loadReference != null) {
            loadReference.cancel();
        }
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression expression = eeVar.H;
        divPlaceholderLoader.applyPlaceholder(divGifImageView, errorCollector, expression != null ? (String) expression.evaluate(expressionResolver) : null, ((Number) eeVar.D.evaluate(expressionResolver)).intValue(), false, new Function1<Drawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder.applyGifImage.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                invoke2(drawable);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Drawable drawable) {
                if (divGifImageView.isImageLoaded() || divGifImageView.isImagePreview()) {
                    return;
                }
                divGifImageView.setPlaceholder(drawable);
            }
        }, new Function1<ImageRepresentation, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder.applyGifImage.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ImageRepresentation imageRepresentation) {
                if (divGifImageView.isImageLoaded()) {
                    return;
                }
                if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                    divGifImageView.setPreview(((ImageRepresentation.Bitmap) imageRepresentation).getValue());
                } else if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                    divGifImageView.setPreview(((ImageRepresentation.PictureDrawable) imageRepresentation).getValue());
                }
                divGifImageView.previewLoaded();
            }
        });
        divGifImageView.setGifUrl$div_release(uri);
        LoadReference loadReferenceLoadImageBytes = this.imageLoader.loadImageBytes(uri.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                divGifImageView.setGifUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                if (Build.VERSION.SDK_INT >= 28) {
                    this.loadDrawable(divGifImageView, cachedBitmap);
                } else {
                    divGifImageView.setImage(cachedBitmap.getBitmap());
                    divGifImageView.imageLoaded();
                }
            }
        });
        div2View.addLoadReference(loadReferenceLoadImageBytes, divGifImageView);
        divGifImageView.setLoadReference$div_release(loadReferenceLoadImageBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(28)
    public final void loadDrawable(DivGifImageView divGifImageView, CachedBitmap cachedBitmap) {
        new LoadDrawableOnPostPTask(new WeakReference(divGifImageView), cachedBitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private final void observeContentAlignment(final DivGifImageView divGifImageView, final ExpressionResolver expressionResolver, final Expression<y5> expression, final Expression<z5> expression2) {
        applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
        Function1<? super y5, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
            }
        };
        divGifImageView.addSubscription(expression.observe(expressionResolver, function1));
        divGifImageView.addSubscription(expression2.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivGifImageView divGifImageView, @NotNull BindingContext bindingContext, @NotNull final ee eeVar, @Nullable ee eeVar2) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.applyDivActions(divGifImageView, bindingContext, eeVar.f87235b, eeVar.f87237d, eeVar.A, eeVar.f87250q, eeVar.f87257x, eeVar.f87256w, eeVar.G, eeVar.F, eeVar.f87236c, eeVar.f87245l);
        BaseDivViewExtensionsKt.bindAspectRatio(divGifImageView, eeVar.f87242i, eeVar2 != null ? eeVar2.f87242i : null, expressionResolver);
        divGifImageView.addSubscription(eeVar.K.observeAndGet(expressionResolver, new Function1<df, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder.bind.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(df dfVar) {
                invoke2(dfVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull df dfVar) {
                divGifImageView.setImageScale(DivUtilKt.toImageScale(dfVar));
            }
        }));
        observeContentAlignment(divGifImageView, expressionResolver, eeVar.f87247n, eeVar.f87248o);
        divGifImageView.addSubscription(eeVar.f87254u.observeAndGet(expressionResolver, new Function1<Uri, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder.bind.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
                invoke2(uri);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Uri uri) {
                DivGifImageBinder.this.applyGifImage(divGifImageView, divView, expressionResolver, eeVar, orCreate);
            }
        }));
    }
}
