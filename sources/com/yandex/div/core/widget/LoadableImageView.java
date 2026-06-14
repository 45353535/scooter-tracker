package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import com.bytedance.adsdk.ugeno.tvp.mml.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$id;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.drawable.ScaleDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001hB%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u001b\u0010\u001d\u001a\u00020\r2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0019\u0010\"\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\"\u0010\u0015J\u0019\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0015J\u0019\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b(\u0010\u0015J\u001f\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\tH\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0014¢\u0006\u0004\b.\u0010\u000fJ\u000f\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b/\u0010\u000fJ\u0017\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\r2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000104¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b8\u0010\u000fJ\u0013\u00109\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000200H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u0002002\u0006\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010?R*\u0010@\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b@\u0010A\u0012\u0004\bE\u0010\u000f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0019R$\u0010G\u001a\u0004\u0018\u00010F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR4\u0010U\u001a\u0004\u0018\u00010\u00122\b\u0010T\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bU\u0010P\u0012\u0004\bY\u0010\u000f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010\u0015R(\u0010^\u001a\u0004\u0018\u00010Q2\b\u0010T\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010`\u001a\u0004\u0018\u00010_8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010f\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010<R\u0014\u0010g\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010<¨\u0006i"}, d2 = {"Lcom/yandex/div/core/widget/LoadableImageView;", "Lcom/yandex/div/internal/widget/AspectImageView;", "Lcom/yandex/div/core/view2/divs/widgets/LoadableImage;", "", "Lcom/yandex/div/core/view2/Releasable;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "imageLoaded", "()V", "previewLoaded", "resetImageLoaded", "Landroid/graphics/drawable/Drawable;", "drawable", "setPlaceholder", "(Landroid/graphics/drawable/Drawable;)V", "setPreview", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/graphics/Bitmap;)V", "setImage", "Ljava/util/concurrent/Future;", "task", "saveLoadingTask", "(Ljava/util/concurrent/Future;)V", "getLoadingTask", "()Ljava/util/concurrent/Future;", "cleanLoadingTask", "setImageDrawable", "bm", "setImageBitmap", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, "invalidateDrawable", "who", "unscheduleDrawable", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "autoScale", "buildDrawingCache", "(Z)V", "Lkotlin/Function0;", "callback", "setImageChangeCallback", "(Lkotlin/jvm/functions/Function0;)V", "release", "scaleAccordingToDensity", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "shouldScaleAccordingToDensity", "()Z", "size", "wrapsSize", "(I)Z", "currentBitmapWithoutFilters", "Landroid/graphics/Bitmap;", "getCurrentBitmapWithoutFilters$div_release", "()Landroid/graphics/Bitmap;", "setCurrentBitmapWithoutFilters$div_release", "getCurrentBitmapWithoutFilters$div_release$annotations", "Lcom/yandex/div/core/images/LoadReference;", "loadReference", "Lcom/yandex/div/core/images/LoadReference;", "getLoadReference$div_release", "()Lcom/yandex/div/core/images/LoadReference;", "setLoadReference$div_release", "(Lcom/yandex/div/core/images/LoadReference;)V", "imageChangeCallback", "Lkotlin/jvm/functions/Function0;", "sourceDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "_imageTransformer", "Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "value", "externalImage", "getExternalImage", "()Landroid/graphics/drawable/Drawable;", "setExternalImage", "getExternalImage$annotations", "getImageTransformer", "()Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "setImageTransformer", "(Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;)V", "imageTransformer", "Lcom/yandex/div/core/widget/DivViewDelegate;", "delegate", "Lcom/yandex/div/core/widget/DivViewDelegate;", "getDelegate", "()Lcom/yandex/div/core/widget/DivViewDelegate;", "setDelegate", "(Lcom/yandex/div/core/widget/DivViewDelegate;)V", "isImageLoaded", "isImagePreview", "ImageTransformer", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LoadableImageView extends AspectImageView implements LoadableImage, Releasable {

    @NotNull
    private ImageTransformer _imageTransformer;

    @Nullable
    private Bitmap currentBitmapWithoutFilters;

    @Nullable
    private Drawable externalImage;

    @Nullable
    private Function0<Unit> imageChangeCallback;

    @Nullable
    private LoadReference loadReference;

    @Nullable
    private Drawable sourceDrawable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "", "transform", "Landroid/graphics/drawable/Drawable;", "drawable", "NOP", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ImageTransformer {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer$NOP;", "Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "()V", "transform", "Landroid/graphics/drawable/Drawable;", "drawable", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NOP implements ImageTransformer {

            @NotNull
            public static final NOP INSTANCE = new NOP();

            private NOP() {
            }

            @Override // com.yandex.div.core.widget.LoadableImageView.ImageTransformer
            @Nullable
            public Drawable transform(@Nullable Drawable drawable) {
                return drawable;
            }
        }

        @Nullable
        Drawable transform(@Nullable Drawable drawable);
    }

    public LoadableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this._imageTransformer = ImageTransformer.NOP.INSTANCE;
    }

    public static /* synthetic */ void getCurrentBitmapWithoutFilters$div_release$annotations() {
    }

    public static /* synthetic */ void getExternalImage$annotations() {
    }

    private final Drawable scaleAccordingToDensity(Drawable drawable) {
        if (shouldScaleAccordingToDensity()) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    bitmap.setDensity(160);
                }
                bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                return new ScaleDrawable(drawable, getContext().getResources().getDisplayMetrics().density);
            }
        }
        return drawable;
    }

    private final boolean shouldScaleAccordingToDensity() {
        return (wrapsSize(getLayoutParams().width) && wrapsSize(getLayoutParams().height)) || getImageScale() == AspectImageView.Scale.NO_SCALE;
    }

    private final boolean wrapsSize(int size) {
        return size == -3 || size == -2;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean autoScale) {
        getDelegate();
        super.buildDrawingCache(autoScale);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void cleanLoadingTask() {
        setTag(R$id.bitmap_load_references_tag, null);
    }

    @Nullable
    /* JADX INFO: renamed from: getCurrentBitmapWithoutFilters$div_release, reason: from getter */
    public final Bitmap getCurrentBitmapWithoutFilters() {
        return this.currentBitmapWithoutFilters;
    }

    @Nullable
    public DivViewDelegate getDelegate() {
        return null;
    }

    @Nullable
    public final Drawable getExternalImage() {
        return this.externalImage;
    }

    @Nullable
    /* JADX INFO: renamed from: getImageTransformer, reason: from getter */
    public final ImageTransformer get_imageTransformer() {
        return this._imageTransformer;
    }

    @Nullable
    /* JADX INFO: renamed from: getLoadReference$div_release, reason: from getter */
    public final LoadReference getLoadReference() {
        return this.loadReference;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    @Nullable
    public Future<?> getLoadingTask() {
        Object tag = getTag(R$id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    public void imageLoaded() {
        setTag(R$id.image_loaded_flag, Boolean.TRUE);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable dr) {
        getDelegate();
        super.invalidateDrawable(dr);
    }

    public boolean isImageLoaded() {
        return Intrinsics.areEqual(getTag(R$id.image_loaded_flag), Boolean.TRUE);
    }

    public boolean isImagePreview() {
        return Intrinsics.areEqual(getTag(R$id.image_loaded_flag), Boolean.FALSE);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getDelegate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDelegate();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int visibility) {
        getDelegate();
    }

    public void previewLoaded() {
        setTag(R$id.image_loaded_flag, Boolean.FALSE);
    }

    public void release() {
        this.currentBitmapWithoutFilters = null;
        setExternalImage(null);
        this.sourceDrawable = null;
        resetImageLoaded();
        Future<?> loadingTask = getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        cleanLoadingTask();
    }

    public void resetImageLoaded() {
        setTag(R$id.image_loaded_flag, null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void saveLoadingTask(@NotNull Future<?> task) {
        setTag(R$id.bitmap_load_references_tag, task);
    }

    public final void setCurrentBitmapWithoutFilters$div_release(@Nullable Bitmap bitmap) {
        this.currentBitmapWithoutFilters = bitmap;
    }

    public void setDelegate(@Nullable DivViewDelegate divViewDelegate) {
    }

    public final void setExternalImage(@Nullable Drawable drawable) {
        this.externalImage = drawable != null ? scaleAccordingToDensity(drawable) : null;
        invalidate();
    }

    public void setImage(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageBitmap(@Nullable Bitmap bm) {
        if (shouldScaleAccordingToDensity() && bm != null) {
            bm.setDensity(160);
        }
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bm));
    }

    public final void setImageChangeCallback(@Nullable Function0<Unit> callback) {
        this.imageChangeCallback = callback;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.sourceDrawable = drawable;
        if (this.externalImage == null) {
            Drawable drawableTransform = this._imageTransformer.transform(drawable);
            super.setImageDrawable(drawableTransform != null ? scaleAccordingToDensity(drawableTransform) : null);
            Function0<Unit> function0 = this.imageChangeCallback;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.externalImage;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        Function0<Unit> function02 = this.imageChangeCallback;
        if (function02 != null) {
            function02.invoke();
        }
    }

    public final void setImageTransformer(@Nullable ImageTransformer imageTransformer) {
        if (imageTransformer == null) {
            imageTransformer = ImageTransformer.NOP.INSTANCE;
        }
        this._imageTransformer = imageTransformer;
        Drawable drawable = this.sourceDrawable;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final void setLoadReference$div_release(@Nullable LoadReference loadReference) {
        this.loadReference = loadReference;
    }

    public void setPlaceholder(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(@Nullable Drawable who) {
        getDelegate();
        super.unscheduleDrawable(who);
    }

    public void setImage(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.externalImage == null) {
            ((Animatable) drawable2).start();
        }
    }

    public void setPreview(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }
}
