package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.List;
import k8.c6;
import k8.cc;
import k8.df;
import k8.g7;
import k8.te;
import k8.wb;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J#\u0010 \u001a\u00020\u0013*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\u0013*\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b$\u0010%J+\u0010)\u001a\u00020\u0013*\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010*J+\u0010-\u001a\u00020\u0013*\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J3\u00102\u001a\u00020\u0013*\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00032\u0006\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b2\u00103J5\u00105\u001a\u00020\u0013*\u00020\u00042\u0006\u00104\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106J+\u00107\u001a\u000200*\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u000200*\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010:J-\u0010=\u001a\u00020\u0013*\u00020\u00042\u0006\u0010/\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J'\u0010@\u001a\u0002002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010AJ-\u0010B\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010\u0015J%\u0010H\u001a\u00020\u0013*\u00020C2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0013\u0010K\u001a\u00020\u0013*\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ-\u0010M\u001a\u00020\u0013*\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\bM\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010NR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010OR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010P¨\u0006Q"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivImageBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$h;", "Lk8/te;", "Lcom/yandex/div/core/view2/divs/widgets/DivImageView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/images/DivImageLoader;", "imageLoader", "Lcom/yandex/div/core/view2/DivPlaceholderLoader;", "placeholderLoader", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/images/DivImageLoader;Lcom/yandex/div/core/view2/DivPlaceholderLoader;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "newDiv", "oldDiv", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "bindImageScale", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lk8/te;Lk8/te;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/df;", "scale", "applyImageScale", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lk8/df;)V", "bindContentAlignment", "Lcom/yandex/div/internal/widget/AspectImageView;", "Lk8/y5;", "horizontalAlignment", "Lk8/z5;", "verticalAlignment", "applyContentAlignment", "(Lcom/yandex/div/internal/widget/AspectImageView;Lk8/y5;Lk8/z5;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "bindFilters", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lcom/yandex/div/core/view2/BindingContext;Lk8/te;Lk8/te;)V", "", "Lk8/cc;", "filters", "applyFiltersAndSetBitmap", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lcom/yandex/div/core/view2/BindingContext;Ljava/util/List;)V", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "observePlaceholders", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lcom/yandex/div/core/view2/BindingContext;Lk8/te;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "div", "", "synchronous", "applyPlaceholders", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lcom/yandex/div/core/view2/BindingContext;Lk8/te;ZLcom/yandex/div/core/view2/errors/ErrorCollector;)V", POBCoreNativeConstants.NATIVE_CONTEXT, "bindPreviewAndImage", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lcom/yandex/div/core/view2/BindingContext;Lk8/te;Lk8/te;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "applyImage", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lcom/yandex/div/core/view2/BindingContext;Lk8/te;Lcom/yandex/div/core/view2/errors/ErrorCollector;)Z", "isVectorCompatible", "(Lk8/te;)Z", "Lcom/yandex/div/core/images/BitmapSource;", "bitmapSource", "applyLoadingFade", "(Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lk8/te;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/images/BitmapSource;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "isHighPriorityShow", "(Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/divs/widgets/DivImageView;Lk8/te;)Z", "bindTint", "Lcom/yandex/div/core/widget/LoadableImageView;", "", "tintColor", "Lk8/g7;", "tintMode", "applyTint", "(Lcom/yandex/div/core/widget/LoadableImageView;Ljava/lang/Integer;Lk8/g7;)V", "Landroid/widget/ImageView;", "clearTint", "(Landroid/widget/ImageView;)V", "bind", "Lcom/yandex/div/core/images/DivImageLoader;", "Lcom/yandex/div/core/view2/DivPlaceholderLoader;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivImageBinder extends DivViewBinder<y0.h, te, DivImageView> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final DivPlaceholderLoader placeholderLoader;

    public DivImageBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivImageLoader divImageLoader, @NotNull DivPlaceholderLoader divPlaceholderLoader, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, y5 y5Var, z5 z5Var) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(y5Var, z5Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFiltersAndSetBitmap(final DivImageView divImageView, BindingContext bindingContext, List<? extends cc> list) {
        Bitmap currentBitmapWithoutFilters = divImageView.getCurrentBitmapWithoutFilters();
        if (currentBitmapWithoutFilters == null) {
            divImageView.setImageBitmap(null);
        } else {
            BaseDivViewExtensionsKt.applyBitmapFilters(divImageView, bindingContext, currentBitmapWithoutFilters, list, new Function1<Bitmap, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyFiltersAndSetBitmap.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                    invoke2(bitmap);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Bitmap bitmap) {
                    divImageView.setImageBitmap(bitmap);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyImage(final DivImageView divImageView, final BindingContext bindingContext, final te teVar, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final Uri uri = (Uri) teVar.B.evaluate(expressionResolver);
        if (Intrinsics.areEqual(uri, divImageView.getImageUrl())) {
            return false;
        }
        boolean zIsHighPriorityShow = isHighPriorityShow(expressionResolver, divImageView, teVar);
        divImageView.resetImageLoaded();
        clearTint(divImageView);
        LoadReference loadReference = divImageView.getLoadReference();
        if (loadReference != null) {
            loadReference.cancel();
        }
        applyPlaceholders(divImageView, bindingContext, teVar, zIsHighPriorityShow, errorCollector);
        divImageView.setImageUrl$div_release(uri);
        DivImageLoader divImageLoader = this.imageLoader;
        String string = uri.toString();
        final Div2View divView = bindingContext.getDivView();
        LoadReference loadReferenceLoadImage = divImageLoader.loadImage(string, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                divImageView.setImageUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                divImageView.setCurrentBitmapWithoutFilters$div_release(cachedBitmap.getBitmap());
                this.applyFiltersAndSetBitmap(divImageView, bindingContext, teVar.f91382t);
                this.applyLoadingFade(divImageView, teVar, expressionResolver, cachedBitmap.getFrom());
                divImageView.imageLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                Expression expression = teVar.P;
                divImageBinder.applyTint(divImageView2, expression != null ? (Integer) expression.evaluate(expressionResolver) : null, (g7) teVar.Q.evaluate(expressionResolver));
                divImageView.invalidate();
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                if (!this.isVectorCompatible(teVar)) {
                    onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, uri, null, 2, null));
                    return;
                }
                super.onSuccess(pictureDrawable);
                divImageView.setImageDrawable(pictureDrawable);
                this.applyLoadingFade(divImageView, teVar, expressionResolver, null);
                divImageView.imageLoaded();
                divImageView.invalidate();
            }
        });
        bindingContext.getDivView().addLoadReference(loadReferenceLoadImage, divImageView);
        divImageView.setLoadReference$div_release(loadReferenceLoadImage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImageScale(DivImageView divImageView, df dfVar) {
        divImageView.setImageScale(DivUtilKt.toImageScale(dfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLoadingFade(DivImageView divImageView, te teVar, ExpressionResolver expressionResolver, BitmapSource bitmapSource) {
        divImageView.animate().cancel();
        wb wbVar = teVar.f91371i;
        float fDoubleValue = (float) ((Number) teVar.getAlpha().evaluate(expressionResolver)).doubleValue();
        if (wbVar == null || bitmapSource == BitmapSource.MEMORY) {
            divImageView.setAlpha(fDoubleValue);
            return;
        }
        long jLongValue = ((Number) wbVar.b().evaluate(expressionResolver)).longValue();
        Interpolator androidInterpolator = DivUtilKt.getAndroidInterpolator((c6) wbVar.c().evaluate(expressionResolver));
        divImageView.setAlpha((float) ((Number) wbVar.f92147a.evaluate(expressionResolver)).doubleValue());
        divImageView.animate().alpha(fDoubleValue).setDuration(jLongValue).setInterpolator(androidInterpolator).setStartDelay(((Number) wbVar.d().evaluate(expressionResolver)).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final te teVar, boolean z10, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression expression = teVar.K;
        divPlaceholderLoader.applyPlaceholder(divImageView, errorCollector, expression != null ? (String) expression.evaluate(expressionResolver) : null, ((Number) teVar.G.evaluate(expressionResolver)).intValue(), z10, new Function1<Drawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyPlaceholders.1
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
                if (divImageView.isImageLoaded() || divImageView.isImagePreview()) {
                    return;
                }
                divImageView.setPlaceholder(drawable);
            }
        }, new Function1<ImageRepresentation, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.applyPlaceholders.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (divImageView.isImageLoaded()) {
                    return;
                }
                if (!(imageRepresentation instanceof ImageRepresentation.Bitmap)) {
                    if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                        divImageView.previewLoaded();
                        divImageView.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).getValue());
                        return;
                    }
                    return;
                }
                divImageView.setCurrentBitmapWithoutFilters$div_release(((ImageRepresentation.Bitmap) imageRepresentation).getValue());
                this.applyFiltersAndSetBitmap(divImageView, bindingContext, teVar.f91382t);
                divImageView.previewLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                Expression expression2 = teVar.P;
                divImageBinder.applyTint(divImageView2, expression2 != null ? (Integer) expression2.evaluate(expressionResolver) : null, (g7) teVar.Q.evaluate(expressionResolver));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTint(LoadableImageView loadableImageView, Integer num, g7 g7Var) {
        if ((loadableImageView.isImageLoaded() || loadableImageView.isImagePreview()) && num != null) {
            loadableImageView.setColorFilter(num.intValue(), DivUtilKt.toPorterDuffMode(g7Var));
        } else {
            clearTint(loadableImageView);
        }
    }

    private final void bindContentAlignment(final DivImageView divImageView, final te teVar, te teVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(teVar.f91377o, teVar2 != null ? teVar2.f91377o : null)) {
            if (ExpressionsKt.equalsToConstant(teVar.f91378p, teVar2 != null ? teVar2.f91378p : null)) {
                return;
            }
        }
        applyContentAlignment(divImageView, (y5) teVar.f91377o.evaluate(expressionResolver), (z5) teVar.f91378p.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(teVar.f91377o) && ExpressionsKt.isConstant(teVar.f91378p)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindContentAlignment$callback$1
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
                this.this$0.applyContentAlignment(divImageView, (y5) teVar.f91377o.evaluate(expressionResolver), (z5) teVar.f91378p.evaluate(expressionResolver));
            }
        };
        divImageView.addSubscription(teVar.f91377o.observe(expressionResolver, function1));
        divImageView.addSubscription(teVar.f91378p.observe(expressionResolver, function1));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindFilters(final com.yandex.div.core.view2.divs.widgets.DivImageView r9, final com.yandex.div.core.view2.BindingContext r10, final k8.te r11, k8.te r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivImageBinder.bindFilters(com.yandex.div.core.view2.divs.widgets.DivImageView, com.yandex.div.core.view2.BindingContext, k8.te, k8.te):void");
    }

    private final void bindImageScale(final DivImageView divImageView, te teVar, te teVar2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(teVar.N, teVar2 != null ? teVar2.N : null)) {
            return;
        }
        applyImageScale(divImageView, (df) teVar.N.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(teVar.N)) {
            return;
        }
        divImageView.addSubscription(teVar.N.observe(expressionResolver, new Function1<df, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder.bindImageScale.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                DivImageBinder.this.applyImageScale(divImageView, dfVar);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindPreviewAndImage(final com.yandex.div.core.view2.divs.widgets.DivImageView r9, final com.yandex.div.core.view2.BindingContext r10, final k8.te r11, k8.te r12, final com.yandex.div.core.view2.errors.ErrorCollector r13) {
        /*
            r8 = this;
            com.yandex.div.json.expressions.Expression r0 = r11.B
            r1 = 0
            if (r12 == 0) goto L8
            com.yandex.div.json.expressions.Expression r2 = r12.B
            goto L9
        L8:
            r2 = r1
        L9:
            boolean r0 = com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r0, r2)
            com.yandex.div.json.expressions.Expression r2 = r11.K
            if (r12 == 0) goto L14
            com.yandex.div.json.expressions.Expression r3 = r12.K
            goto L15
        L14:
            r3 = r1
        L15:
            boolean r2 = com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r2, r3)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2c
            com.yandex.div.json.expressions.Expression r2 = r11.G
            if (r12 == 0) goto L23
            com.yandex.div.json.expressions.Expression r1 = r12.G
        L23:
            boolean r12 = com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r2, r1)
            if (r12 != 0) goto L2a
            goto L2c
        L2a:
            r12 = r4
            goto L2d
        L2c:
            r12 = r3
        L2d:
            com.yandex.div.json.expressions.Expression r1 = r11.K
            boolean r1 = com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r1)
            if (r1 == 0) goto L3f
            com.yandex.div.json.expressions.Expression r1 = r11.G
            boolean r1 = com.yandex.div.json.expressions.ExpressionsKt.isConstant(r1)
            if (r1 == 0) goto L3f
            r1 = r3
            goto L40
        L3f:
            r1 = r4
        L40:
            boolean r2 = r9.isImageLoaded()
            if (r2 != 0) goto L4a
            if (r12 == 0) goto L4a
            r12 = r3
            goto L4b
        L4a:
            r12 = r4
        L4b:
            if (r12 == 0) goto L52
            if (r1 != 0) goto L52
            r8.observePlaceholders(r9, r10, r11, r13)
        L52:
            if (r0 != 0) goto L74
            com.yandex.div.json.expressions.Expression r0 = r11.B
            boolean r0 = com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r0)
            if (r0 != 0) goto L74
            com.yandex.div.json.expressions.Expression r6 = r11.B
            com.yandex.div.json.expressions.ExpressionResolver r7 = r10.getExpressionResolver()
            com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1 r0 = new com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r13
            r0.<init>()
            r4 = r0
            com.yandex.div.core.Disposable r4 = r6.observe(r7, r4)
            r9.addSubscription(r4)
        L74:
            boolean r4 = r8.applyImage(r9, r10, r11, r13)
            if (r4 != 0) goto L8c
            if (r12 == 0) goto L8c
            com.yandex.div.json.expressions.ExpressionResolver r12 = r10.getExpressionResolver()
            boolean r4 = r8.isHighPriorityShow(r12, r9, r11)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r0.applyPlaceholders(r1, r2, r3, r4, r5)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivImageBinder.bindPreviewAndImage(com.yandex.div.core.view2.divs.widgets.DivImageView, com.yandex.div.core.view2.BindingContext, k8.te, k8.te, com.yandex.div.core.view2.errors.ErrorCollector):void");
    }

    private final void bindTint(final DivImageView divImageView, final te teVar, te teVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(teVar.P, teVar2 != null ? teVar2.P : null)) {
            if (ExpressionsKt.equalsToConstant(teVar.Q, teVar2 != null ? teVar2.Q : null)) {
                return;
            }
        }
        Expression expression = teVar.P;
        applyTint(divImageView, expression != null ? (Integer) expression.evaluate(expressionResolver) : null, (g7) teVar.Q.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(teVar.P) && ExpressionsKt.isConstant(teVar.Q)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindTint$callback$1
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
                DivImageBinder divImageBinder = this.this$0;
                DivImageView divImageView2 = divImageView;
                Expression expression2 = teVar.P;
                divImageBinder.applyTint(divImageView2, expression2 != null ? (Integer) expression2.evaluate(expressionResolver) : null, (g7) teVar.Q.evaluate(expressionResolver));
            }
        };
        Expression expression2 = teVar.P;
        divImageView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
        divImageView.addSubscription(teVar.Q.observe(expressionResolver, function1));
    }

    private final void clearTint(ImageView imageView) {
        imageView.setColorFilter((ColorFilter) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHighPriorityShow(ExpressionResolver resolver, DivImageView view, te div) {
        return !view.isImageLoaded() && ((Boolean) div.f91386x.evaluate(resolver)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVectorCompatible(te teVar) {
        if (teVar.P != null) {
            return false;
        }
        List list = teVar.f91382t;
        return list == null || list.isEmpty();
    }

    private final void observePlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final te teVar, final ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observePlaceholders$callback$1
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
                if (divImageView.isImageLoaded()) {
                    return;
                }
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = divImageView;
                BindingContext bindingContext2 = bindingContext;
                te teVar2 = teVar;
                divImageBinder.applyPlaceholders(divImageView2, bindingContext2, teVar2, divImageBinder.isHighPriorityShow(expressionResolver, divImageView2, teVar2), errorCollector);
            }
        };
        Expression expression = teVar.K;
        divImageView.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        divImageView.addSubscription(teVar.G.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivImageView divImageView, @NotNull BindingContext bindingContext, @NotNull te teVar, @Nullable te teVar2) {
        BaseDivViewExtensionsKt.applyDivActions(divImageView, bindingContext, teVar.f91361b, teVar.f91365d, teVar.D, teVar.f91380r, teVar.f91388z, teVar.f91387y, teVar.J, teVar.I, teVar.f91363c, teVar.f91375m);
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(divImageView, teVar.f91372j, teVar2 != null ? teVar2.f91372j : null, expressionResolver);
        bindImageScale(divImageView, teVar, teVar2, expressionResolver);
        bindContentAlignment(divImageView, teVar, teVar2, expressionResolver);
        bindPreviewAndImage(divImageView, bindingContext, teVar, teVar2, orCreate);
        bindTint(divImageView, teVar, teVar2, expressionResolver);
        bindFilters(divImageView, bindingContext, teVar, teVar2);
    }
}
