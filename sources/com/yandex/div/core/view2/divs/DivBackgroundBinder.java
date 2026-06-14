package com.yandex.div.core.view2.divs;

import android.R;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PictureDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$drawable;
import com.yandex.div.R$id;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.NinePatchDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k8.a7;
import k8.cc;
import k8.cn;
import k8.df;
import k8.fm;
import k8.jp;
import k8.sm;
import k8.ue;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0011\u0018\u00002\u00020\u0001:\u0001PB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0017\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0012¢\u0006\u0004\b\u0017\u0010\u0018Jo\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u001b\u0010\u001cJC\u0010\u001e\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u0012*\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\nH\u0012¢\u0006\u0004\b!\u0010\"JC\u0010(\u001a\u00020\u00122\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120&H\u0012¢\u0006\u0004\b(\u0010)J7\u0010+\u001a\u0004\u0018\u00010\n*\n\u0012\u0004\u0012\u00020*\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0012¢\u0006\u0004\b+\u0010,J+\u00101\u001a\u00020**\u00020\r2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010%\u001a\u00020$H\u0012¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u000204*\u0002032\u0006\u0010%\u001a\u00020$H\u0012¢\u0006\u0004\b5\u00106J#\u00101\u001a\u000208*\u0002072\u0006\u00100\u001a\u00020/2\u0006\u0010%\u001a\u00020$H\u0012¢\u0006\u0004\b1\u00109J#\u00101\u001a\u00020;*\u00020:2\u0006\u00100\u001a\u00020/2\u0006\u0010%\u001a\u00020$H\u0012¢\u0006\u0004\b1\u0010<J\u001b\u00101\u001a\u00020>*\u00020=2\u0006\u0010%\u001a\u00020$H\u0012¢\u0006\u0004\b1\u0010?Jw\u0010@\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR>\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\f*\u00020\b2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\f8R@RX\u0092\u000e¢\u0006\u0012\u0012\u0004\bH\u0010I\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR>\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\f*\u00020\b2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\f8R@RX\u0092\u000e¢\u0006\u0012\u0012\u0004\bL\u0010I\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR,\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010\n8R@RX\u0092\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\"¨\u0006Q"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder;", "", "Lcom/yandex/div/core/images/DivImageLoader;", "imageLoader", "<init>", "(Lcom/yandex/div/core/images/DivImageLoader;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/graphics/drawable/Drawable;", "newAdditionalLayer", "", "Lk8/a7;", "newDefaultBackgroundList", "oldDefaultBackgroundList", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "", "bindDefaultBackground", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Landroid/graphics/drawable/Drawable;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "additionalLayer", "defaultBackgroundList", "applyDefaultBackground", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Landroid/graphics/drawable/Drawable;Ljava/util/List;)V", "newFocusedBackgroundList", "oldFocusedBackgroundList", "bindFocusBackground", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Landroid/graphics/drawable/Drawable;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "focusedBackgroundList", "applyFocusedBackground", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Landroid/graphics/drawable/Drawable;Ljava/util/List;Ljava/util/List;)V", "drawable", "updateBackground", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "backgroundList", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lkotlin/Function1;", "callback", "addBackgroundSubscriptions", "(Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "toDrawable", "(Ljava/util/List;Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Landroid/util/DisplayMetrics;", "metrics", "toBackgroundState", "(Lk8/a7;Lcom/yandex/div/core/view2/Div2View;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "Lk8/ue;", "", "isVectorCompatible", "(Lk8/ue;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/fm;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "(Lk8/fm;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "Lk8/sm;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "(Lk8/sm;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "Lk8/cc;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "(Lk8/cc;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "bindBackground", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/internal/core/ExpressionSubscriber;Landroid/graphics/drawable/Drawable;)V", "Lcom/yandex/div/core/images/DivImageLoader;", "value", "getDefaultBackgroundList", "(Landroid/view/View;)Ljava/util/List;", "setDefaultBackgroundList", "(Landroid/view/View;Ljava/util/List;)V", "getDefaultBackgroundList$annotations", "(Landroid/view/View;)V", "getFocusedBackgroundList", "setFocusedBackgroundList", "getFocusedBackgroundList$annotations", "getAdditionalLayer", "(Landroid/view/View;)Landroid/graphics/drawable/Drawable;", "setAdditionalLayer", "DivBackgroundState", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivBackgroundBinder {

    @NotNull
    private final DivImageLoader imageLoader;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "", "()V", "toDrawable", "Landroid/graphics/drawable/Drawable;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/view2/BindingContext;", TypedValues.AttributesType.S_TARGET, "Landroid/view/View;", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "Image", "LinearGradient", "NinePatch", "RadialGradient", "Solid", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$LinearGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$NinePatch;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Solid;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static abstract class DivBackgroundState {

        @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001:\u0001FBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010BR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b\u0011\u0010?¨\u0006G"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "", "alpha", "Lk8/y5;", "contentAlignmentHorizontal", "Lk8/z5;", "contentAlignmentVertical", "Landroid/net/Uri;", "imageUrl", "", "preloadRequired", "Lk8/df;", "scale", "", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "filters", "isVectorCompatible", "<init>", "(DLk8/y5;Lk8/z5;Landroid/net/Uri;ZLk8/df;Ljava/util/List;Z)V", "Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "toScaleType", "(Lk8/df;)Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "isRtl", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "toHorizontalAlignment", "(Lk8/y5;Z)Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "toVerticalAlignment", "(Lk8/z5;)Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/view/View;", TypedValues.AttributesType.S_TARGET, "Lcom/yandex/div/core/images/DivImageLoader;", "imageLoader", "Landroid/graphics/drawable/Drawable;", "getDivImageBackground", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lcom/yandex/div/core/images/DivImageLoader;)Landroid/graphics/drawable/Drawable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getAlpha", "()D", "Lk8/y5;", "getContentAlignmentHorizontal", "()Lk8/y5;", "Lk8/z5;", "getContentAlignmentVertical", "()Lk8/z5;", "Landroid/net/Uri;", "getImageUrl", "()Landroid/net/Uri;", "Z", "getPreloadRequired", "()Z", "Lk8/df;", "getScale", "()Lk8/df;", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "Filter", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Image extends DivBackgroundState {
            private final double alpha;

            @NotNull
            private final y5 contentAlignmentHorizontal;

            @NotNull
            private final z5 contentAlignmentVertical;

            @Nullable
            private final List<Filter> filters;

            @NotNull
            private final Uri imageUrl;
            private final boolean isVectorCompatible;
            private final boolean preloadRequired;

            @NotNull
            private final df scale;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "", "<init>", "()V", "Lk8/cc;", "toDiv", "()Lk8/cc;", "Blur", "RtlMirror", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$Blur;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$RtlMirror;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static abstract class Filter {

                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$Blur;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "", "radius", "Lk8/cc$a;", "div", "<init>", "(ILk8/cc$a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRadius", "Lk8/cc$a;", "getDiv", "()Lk8/cc$a;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Blur extends Filter {

                    @NotNull
                    private final cc.a div;
                    private final int radius;

                    public Blur(int i10, @NotNull cc.a aVar) {
                        super(null);
                        this.radius = i10;
                        this.div = aVar;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Blur)) {
                            return false;
                        }
                        Blur blur = (Blur) other;
                        return this.radius == blur.radius && Intrinsics.areEqual(this.div, blur.div);
                    }

                    @NotNull
                    public final cc.a getDiv() {
                        return this.div;
                    }

                    public int hashCode() {
                        return (this.radius * 31) + this.div.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Blur(radius=" + this.radius + ", div=" + this.div + ')';
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$RtlMirror;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "Lk8/cc$d;", "div", "<init>", "(Lk8/cc$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk8/cc$d;", "getDiv", "()Lk8/cc$d;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class RtlMirror extends Filter {

                    @NotNull
                    private final cc.d div;

                    public RtlMirror(@NotNull cc.d dVar) {
                        super(null);
                        this.div = dVar;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof RtlMirror) && Intrinsics.areEqual(this.div, ((RtlMirror) other).div);
                    }

                    @NotNull
                    public final cc.d getDiv() {
                        return this.div;
                    }

                    public int hashCode() {
                        return this.div.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "RtlMirror(div=" + this.div + ')';
                    }
                }

                public /* synthetic */ Filter(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final cc toDiv() {
                    if (this instanceof Blur) {
                        return ((Blur) this).getDiv();
                    }
                    if (this instanceof RtlMirror) {
                        return ((RtlMirror) this).getDiv();
                    }
                    throw new m();
                }

                private Filter() {
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[df.values().length];
                    try {
                        iArr[df.FILL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[df.FIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[df.STRETCH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[y5.values().length];
                    try {
                        iArr2[y5.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[y5.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[y5.RIGHT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr2[y5.START.ordinal()] = 4;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr2[y5.END.ordinal()] = 5;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                    int[] iArr3 = new int[z5.values().length];
                    try {
                        iArr3[z5.CENTER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr3[z5.BOTTOM.ordinal()] = 2;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$2 = iArr3;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Image(double d10, @NotNull y5 y5Var, @NotNull z5 z5Var, @NotNull Uri uri, boolean z10, @NotNull df dfVar, @Nullable List<? extends Filter> list, boolean z11) {
                super(null);
                this.alpha = d10;
                this.contentAlignmentHorizontal = y5Var;
                this.contentAlignmentVertical = z5Var;
                this.imageUrl = uri;
                this.preloadRequired = z10;
                this.scale = dfVar;
                this.filters = list;
                this.isVectorCompatible = z11;
            }

            private final ScalingDrawable.AlignmentHorizontal toHorizontalAlignment(y5 y5Var, boolean z10) {
                int i10 = WhenMappings.$EnumSwitchMapping$1[y5Var.ordinal()];
                if (i10 == 1) {
                    return ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i10 == 2) {
                    return ScalingDrawable.AlignmentHorizontal.CENTER;
                }
                if (i10 == 3) {
                    return ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                if (i10 == 4) {
                    return z10 ? ScalingDrawable.AlignmentHorizontal.RIGHT : ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i10 == 5) {
                    return z10 ? ScalingDrawable.AlignmentHorizontal.LEFT : ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                throw new m();
            }

            private final ScalingDrawable.ScaleType toScaleType(df dfVar) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[dfVar.ordinal()];
                return i10 != 1 ? i10 != 2 ? i10 != 3 ? ScalingDrawable.ScaleType.NO_SCALE : ScalingDrawable.ScaleType.STRETCH : ScalingDrawable.ScaleType.FIT : ScalingDrawable.ScaleType.FILL;
            }

            private final ScalingDrawable.AlignmentVertical toVerticalAlignment(z5 z5Var) {
                int i10 = WhenMappings.$EnumSwitchMapping$2[z5Var.ordinal()];
                return i10 != 1 ? i10 != 2 ? ScalingDrawable.AlignmentVertical.TOP : ScalingDrawable.AlignmentVertical.BOTTOM : ScalingDrawable.AlignmentVertical.CENTER;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Double.compare(this.alpha, image.alpha) == 0 && this.contentAlignmentHorizontal == image.contentAlignmentHorizontal && this.contentAlignmentVertical == image.contentAlignmentVertical && Intrinsics.areEqual(this.imageUrl, image.imageUrl) && this.preloadRequired == image.preloadRequired && this.scale == image.scale && Intrinsics.areEqual(this.filters, image.filters) && this.isVectorCompatible == image.isVectorCompatible;
            }

            @NotNull
            public final Drawable getDivImageBackground(@NotNull final BindingContext context, @NotNull final View target, @NotNull DivImageLoader imageLoader) {
                final ScalingDrawable scalingDrawable = new ScalingDrawable();
                scalingDrawable.setAlpha((int) (this.alpha * ((double) 255)));
                scalingDrawable.setCustomScaleType(toScaleType(this.scale));
                scalingDrawable.setAlignmentHorizontal(toHorizontalAlignment(this.contentAlignmentHorizontal, ViewsKt.isLayoutRtl(target)));
                scalingDrawable.setAlignmentVertical(toVerticalAlignment(this.contentAlignmentVertical));
                String string = this.imageUrl.toString();
                final Div2View divView = context.getDivView();
                context.getDivView().addLoadReference(imageLoader.loadImage(string, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                        ArrayList arrayList;
                        View view = target;
                        BindingContext bindingContext = context;
                        Bitmap bitmap = cachedBitmap.getBitmap();
                        List<DivBackgroundBinder.DivBackgroundState.Image.Filter> filters = this.getFilters();
                        if (filters != null) {
                            List<DivBackgroundBinder.DivBackgroundState.Image.Filter> list = filters;
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((DivBackgroundBinder.DivBackgroundState.Image.Filter) it.next()).toDiv());
                            }
                        } else {
                            arrayList = null;
                        }
                        final ScalingDrawable scalingDrawable2 = scalingDrawable;
                        BaseDivViewExtensionsKt.applyBitmapFilters(view, bindingContext, bitmap, arrayList, new Function1<Bitmap, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap2) {
                                invoke2(bitmap2);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Bitmap bitmap2) {
                                scalingDrawable2.setBitmap(bitmap2);
                            }
                        });
                    }

                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                        if (!this.getIsVectorCompatible()) {
                            onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, this.getImageUrl(), null, 2, null));
                        } else {
                            scalingDrawable.setPicture(pictureDrawable.getPicture());
                        }
                    }
                }), target);
                return scalingDrawable;
            }

            @Nullable
            public final List<Filter> getFilters() {
                return this.filters;
            }

            @NotNull
            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v7, types: [int] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v2 */
            public int hashCode() {
                int iA = ((((((androidx.collection.a.a(this.alpha) * 31) + this.contentAlignmentHorizontal.hashCode()) * 31) + this.contentAlignmentVertical.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
                boolean z10 = this.preloadRequired;
                ?? r12 = z10;
                if (z10) {
                    r12 = 1;
                }
                int iHashCode = (((iA + r12) * 31) + this.scale.hashCode()) * 31;
                List<Filter> list = this.filters;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                boolean z11 = this.isVectorCompatible;
                return iHashCode2 + (z11 ? 1 : z11);
            }

            /* JADX INFO: renamed from: isVectorCompatible, reason: from getter */
            public final boolean getIsVectorCompatible() {
                return this.isVectorCompatible;
            }

            @NotNull
            public String toString() {
                return "Image(alpha=" + this.alpha + ", contentAlignmentHorizontal=" + this.contentAlignmentHorizontal + ", contentAlignmentVertical=" + this.contentAlignmentVertical + ", imageUrl=" + this.imageUrl + ", preloadRequired=" + this.preloadRequired + ", scale=" + this.scale + ", filters=" + this.filters + ", isVectorCompatible=" + this.isVectorCompatible + ')';
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$LinearGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "", "angle", "Lcom/yandex/div/internal/graphics/Colormap;", "colormap", "<init>", "(ILcom/yandex/div/internal/graphics/Colormap;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAngle", "Lcom/yandex/div/internal/graphics/Colormap;", "getColormap", "()Lcom/yandex/div/internal/graphics/Colormap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class LinearGradient extends DivBackgroundState {
            private final int angle;

            @NotNull
            private final Colormap colormap;

            public LinearGradient(int i10, @NotNull Colormap colormap) {
                super(null);
                this.angle = i10;
                this.colormap = colormap;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LinearGradient)) {
                    return false;
                }
                LinearGradient linearGradient = (LinearGradient) other;
                return this.angle == linearGradient.angle && Intrinsics.areEqual(this.colormap, linearGradient.colormap);
            }

            public final int getAngle() {
                return this.angle;
            }

            @NotNull
            public final Colormap getColormap() {
                return this.colormap;
            }

            public int hashCode() {
                return (this.angle * 31) + this.colormap.hashCode();
            }

            @NotNull
            public String toString() {
                return "LinearGradient(angle=" + this.angle + ", colormap=" + this.colormap + ')';
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$NinePatch;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "Landroid/net/Uri;", "imageUrl", "Landroid/graphics/Rect;", "insets", "<init>", "(Landroid/net/Uri;Landroid/graphics/Rect;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Landroid/view/View;", TypedValues.AttributesType.S_TARGET, "Lcom/yandex/div/core/images/DivImageLoader;", "imageLoader", "Landroid/graphics/drawable/Drawable;", "getNinePatchDrawable", "(Lcom/yandex/div/core/view2/Div2View;Landroid/view/View;Lcom/yandex/div/core/images/DivImageLoader;)Landroid/graphics/drawable/Drawable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getImageUrl", "()Landroid/net/Uri;", "Landroid/graphics/Rect;", "getInsets", "()Landroid/graphics/Rect;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class NinePatch extends DivBackgroundState {

            @NotNull
            private final Uri imageUrl;

            @NotNull
            private final Rect insets;

            public NinePatch(@NotNull Uri uri, @NotNull Rect rect) {
                super(null);
                this.imageUrl = uri;
                this.insets = rect;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NinePatch)) {
                    return false;
                }
                NinePatch ninePatch = (NinePatch) other;
                return Intrinsics.areEqual(this.imageUrl, ninePatch.imageUrl) && Intrinsics.areEqual(this.insets, ninePatch.insets);
            }

            @NotNull
            public final Rect getInsets() {
                return this.insets;
            }

            @NotNull
            public final Drawable getNinePatchDrawable(@NotNull final Div2View divView, @NotNull View target, @NotNull DivImageLoader imageLoader) {
                final NinePatchDrawable ninePatchDrawable = new NinePatchDrawable();
                divView.addLoadReference(imageLoader.loadImage(this.imageUrl.toString(), new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$NinePatch$getNinePatchDrawable$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                        NinePatchDrawable ninePatchDrawable2 = ninePatchDrawable;
                        DivBackgroundBinder.DivBackgroundState.NinePatch ninePatch = this;
                        ninePatchDrawable2.setBottom(ninePatch.getInsets().bottom);
                        ninePatchDrawable2.setLeft(ninePatch.getInsets().left);
                        ninePatchDrawable2.setRight(ninePatch.getInsets().right);
                        ninePatchDrawable2.setTop(ninePatch.getInsets().top);
                        ninePatchDrawable2.setBitmap(cachedBitmap.getBitmap());
                    }
                }), target);
                return ninePatchDrawable;
            }

            public int hashCode() {
                return (this.imageUrl.hashCode() * 31) + this.insets.hashCode();
            }

            @NotNull
            public String toString() {
                return "NinePatch(imageUrl=" + this.imageUrl + ", insets=" + this.insets + ')';
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0002 !B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "centerX", "centerY", "", "", "colors", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "radius", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;Ljava/util/List;Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "getCenterX", "()Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "getCenterY", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "getRadius", "()Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "Center", "Radius", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class RadialGradient extends DivBackgroundState {

            @NotNull
            private final Center centerX;

            @NotNull
            private final Center centerY;

            @NotNull
            private final List<Integer> colors;

            @NotNull
            private final Radius radius;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "", "()V", "toRadialGradientDrawableCenter", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "Fixed", "Relative", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Relative;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static abstract class Center {

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "", "valuePx", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getValuePx", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Fixed extends Center {
                    private final float valuePx;

                    public Fixed(float f10) {
                        super(null);
                        this.valuePx = f10;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) other).valuePx) == 0;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    public int hashCode() {
                        return Float.floatToIntBits(this.valuePx);
                    }

                    @NotNull
                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Relative;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "", "value", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getValue", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Relative extends Center {
                    private final float value;

                    public Relative(float f10) {
                        super(null);
                        this.value = f10;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Relative) && Float.compare(this.value, ((Relative) other).value) == 0;
                    }

                    public final float getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return Float.floatToIntBits(this.value);
                    }

                    @NotNull
                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }
                }

                public /* synthetic */ Center(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final RadialGradientDrawable.Center toRadialGradientDrawableCenter() {
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Center.Fixed(((Fixed) this).getValuePx());
                    }
                    if (this instanceof Relative) {
                        return new RadialGradientDrawable.Center.Relative(((Relative) this).getValue());
                    }
                    throw new m();
                }

                private Center() {
                }
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "", "()V", "toRadialGradientDrawableRadius", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "Fixed", "Relative", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Relative;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static abstract class Radius {

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "", "valuePx", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getValuePx", "()F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Fixed extends Radius {
                    private final float valuePx;

                    public Fixed(float f10) {
                        super(null);
                        this.valuePx = f10;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) other).valuePx) == 0;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    public int hashCode() {
                        return Float.floatToIntBits(this.valuePx);
                    }

                    @NotNull
                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Relative;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "Lk8/cn$c;", "value", "<init>", "(Lk8/cn$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk8/cn$c;", "getValue", "()Lk8/cn$c;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Relative extends Radius {

                    @NotNull
                    private final cn.c value;

                    public Relative(@NotNull cn.c cVar) {
                        super(null);
                        this.value = cVar;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Relative) && this.value == ((Relative) other).value;
                    }

                    @NotNull
                    public final cn.c getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }
                }

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[cn.c.values().length];
                        try {
                            iArr[cn.c.FARTHEST_CORNER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[cn.c.NEAREST_CORNER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[cn.c.FARTHEST_SIDE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[cn.c.NEAREST_SIDE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Radius(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius() {
                    RadialGradientDrawable.Radius.Relative.Type type;
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Radius.Fixed(((Fixed) this).getValuePx());
                    }
                    if (!(this instanceof Relative)) {
                        throw new m();
                    }
                    int i10 = WhenMappings.$EnumSwitchMapping$0[((Relative) this).getValue().ordinal()];
                    if (i10 == 1) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
                    } else if (i10 == 2) {
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
                    } else if (i10 == 3) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
                    } else {
                        if (i10 != 4) {
                            throw new m();
                        }
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
                    }
                    return new RadialGradientDrawable.Radius.Relative(type);
                }

                private Radius() {
                }
            }

            public RadialGradient(@NotNull Center center, @NotNull Center center2, @NotNull List<Integer> list, @NotNull Radius radius) {
                super(null);
                this.centerX = center;
                this.centerY = center2;
                this.colors = list;
                this.radius = radius;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RadialGradient)) {
                    return false;
                }
                RadialGradient radialGradient = (RadialGradient) other;
                return Intrinsics.areEqual(this.centerX, radialGradient.centerX) && Intrinsics.areEqual(this.centerY, radialGradient.centerY) && Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.radius, radialGradient.radius);
            }

            @NotNull
            public final Center getCenterX() {
                return this.centerX;
            }

            @NotNull
            public final Center getCenterY() {
                return this.centerY;
            }

            @NotNull
            public final List<Integer> getColors() {
                return this.colors;
            }

            @NotNull
            public final Radius getRadius() {
                return this.radius;
            }

            public int hashCode() {
                return (((((this.centerX.hashCode() * 31) + this.centerY.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.radius.hashCode();
            }

            @NotNull
            public String toString() {
                return "RadialGradient(centerX=" + this.centerX + ", centerY=" + this.centerY + ", colors=" + this.colors + ", radius=" + this.radius + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Solid;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "", "color", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getColor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Solid extends DivBackgroundState {
            private final int color;

            public Solid(int i10) {
                super(null);
                this.color = i10;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Solid) && this.color == ((Solid) other).color;
            }

            public final int getColor() {
                return this.color;
            }

            public int hashCode() {
                return this.color;
            }

            @NotNull
            public String toString() {
                return "Solid(color=" + this.color + ')';
            }
        }

        public /* synthetic */ DivBackgroundState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Drawable toDrawable(@NotNull BindingContext context, @NotNull View target, @NotNull DivImageLoader imageLoader) {
            if (this instanceof Image) {
                return ((Image) this).getDivImageBackground(context, target, imageLoader);
            }
            if (this instanceof NinePatch) {
                return ((NinePatch) this).getNinePatchDrawable(context.getDivView(), target, imageLoader);
            }
            if (this instanceof Solid) {
                return new ColorDrawable(((Solid) this).getColor());
            }
            if (this instanceof LinearGradient) {
                return new LinearGradientDrawable(r4.getAngle(), ((LinearGradient) this).getColormap());
            }
            if (!(this instanceof RadialGradient)) {
                throw new m();
            }
            RadialGradient radialGradient = (RadialGradient) this;
            return new RadialGradientDrawable(radialGradient.getRadius().toRadialGradientDrawableRadius(), radialGradient.getCenterX().toRadialGradientDrawableCenter(), radialGradient.getCenterY().toRadialGradientDrawableCenter(), CollectionsKt.toIntArray(radialGradient.getColors()));
        }

        private DivBackgroundState() {
        }
    }

    public DivBackgroundBinder(@NotNull DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    private void addBackgroundSubscriptions(List<? extends a7> backgroundList, ExpressionResolver resolver, ExpressionSubscriber subscriber, Function1<Object, Unit> callback) {
        if (backgroundList != null) {
            Iterator<T> it = backgroundList.iterator();
            while (it.hasNext()) {
                ExpressionSubscribersKt.observeBackground(subscriber, (a7) it.next(), resolver, callback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDefaultBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends a7> list) {
        List<? extends DivBackgroundState> listEmptyList;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            List<? extends a7> list2 = list;
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                listEmptyList.add(toBackgroundState((a7) it.next(), bindingContext.getDivView(), displayMetrics, expressionResolver));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (Intrinsics.areEqual(defaultBackgroundList, listEmptyList) && Intrinsics.areEqual(additionalLayer, drawable)) {
            return;
        }
        updateBackground(view, toDrawable(listEmptyList, bindingContext, view, drawable));
        setDefaultBackgroundList(view, listEmptyList);
        setFocusedBackgroundList(view, null);
        setAdditionalLayer(view, drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyFocusedBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends a7> list, List<? extends a7> list2) {
        List<? extends DivBackgroundState> listEmptyList;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            List<? extends a7> list3 = list;
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                listEmptyList.add(toBackgroundState((a7) it.next(), divView, displayMetrics, expressionResolver));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<? extends a7> list4 = list2;
        List<? extends DivBackgroundState> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList.add(toBackgroundState((a7) it2.next(), divView, displayMetrics, expressionResolver));
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        List<DivBackgroundState> focusedBackgroundList = getFocusedBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (Intrinsics.areEqual(defaultBackgroundList, listEmptyList) && Intrinsics.areEqual(focusedBackgroundList, arrayList) && Intrinsics.areEqual(additionalLayer, drawable)) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, toDrawable(arrayList, bindingContext, view, drawable));
        if (list != null || drawable != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, toDrawable(listEmptyList, bindingContext, view, drawable));
        }
        updateBackground(view, stateListDrawable);
        setDefaultBackgroundList(view, listEmptyList);
        setFocusedBackgroundList(view, arrayList);
        setAdditionalLayer(view, drawable);
    }

    private void bindDefaultBackground(final BindingContext context, final View view, final Drawable newAdditionalLayer, final List<? extends a7> newDefaultBackgroundList, List<? extends a7> oldDefaultBackgroundList, ExpressionSubscriber subscriber) {
        List<? extends a7> listEmptyList = newDefaultBackgroundList == null ? CollectionsKt.emptyList() : newDefaultBackgroundList;
        if (oldDefaultBackgroundList == null) {
            oldDefaultBackgroundList = CollectionsKt.emptyList();
        }
        Drawable additionalLayer = getAdditionalLayer(view);
        if (listEmptyList.size() == oldDefaultBackgroundList.size()) {
            Iterator<T> it = listEmptyList.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!DivDataExtensionsKt.equalsToConstant((a7) next, oldDefaultBackgroundList.get(i10))) {
                        break;
                    } else {
                        i10 = i11;
                    }
                } else if (Intrinsics.areEqual(newAdditionalLayer, additionalLayer)) {
                    return;
                }
            }
        }
        applyDefaultBackground(view, context, newAdditionalLayer, newDefaultBackgroundList);
        List<? extends a7> list = listEmptyList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!DivDataExtensionsKt.isConstant((a7) it2.next())) {
                addBackgroundSubscriptions(newDefaultBackgroundList, context.getExpressionResolver(), subscriber, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindDefaultBackground$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        this.this$0.applyDefaultBackground(view, context, newAdditionalLayer, newDefaultBackgroundList);
                    }
                });
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void bindFocusBackground(final com.yandex.div.core.view2.BindingContext r11, final android.view.View r12, final android.graphics.drawable.Drawable r13, final java.util.List<? extends k8.a7> r14, java.util.List<? extends k8.a7> r15, final java.util.List<? extends k8.a7> r16, java.util.List<? extends k8.a7> r17, com.yandex.div.internal.core.ExpressionSubscriber r18) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivBackgroundBinder.bindFocusBackground(com.yandex.div.core.view2.BindingContext, android.view.View, android.graphics.drawable.Drawable, java.util.List, java.util.List, java.util.List, java.util.List, com.yandex.div.internal.core.ExpressionSubscriber):void");
    }

    private Drawable getAdditionalLayer(View view) {
        Object tag = view.getTag(R$id.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getDefaultBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_default_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getFocusedBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_focused_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private boolean isVectorCompatible(ue ueVar, ExpressionResolver expressionResolver) {
        if (((Number) ueVar.f91658a.evaluate(expressionResolver)).doubleValue() != 1.0d) {
            return false;
        }
        List list = ueVar.f91661d;
        return list == null || list.isEmpty();
    }

    private void setAdditionalLayer(View view, Drawable drawable) {
        view.setTag(R$id.div_additional_background_layer_tag, drawable);
    }

    private void setDefaultBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_default_background_list_tag, list);
    }

    private void setFocusedBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_focused_background_list_tag, list);
    }

    private DivBackgroundState toBackgroundState(a7 a7Var, Div2View div2View, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        List listEmptyList;
        int i14;
        if (a7Var instanceof a7.d) {
            a7.d dVar = (a7.d) a7Var;
            long jLongValue = ((Number) dVar.c().f87514a.evaluate(expressionResolver)).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i14 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i14 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.LinearGradient(i14, ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(dVar.c(), expressionResolver), div2View));
        }
        if (a7Var instanceof a7.f) {
            a7.f fVar = (a7.f) a7Var;
            DivBackgroundState.RadialGradient.Center backgroundState = toBackgroundState(fVar.c().f87339a, displayMetrics, expressionResolver);
            DivBackgroundState.RadialGradient.Center backgroundState2 = toBackgroundState(fVar.c().f87340b, displayMetrics, expressionResolver);
            ExpressionList expressionList = fVar.c().f87342d;
            if (expressionList == null || (listEmptyList = expressionList.evaluate(expressionResolver)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new DivBackgroundState.RadialGradient(backgroundState, backgroundState2, listEmptyList, toBackgroundState(fVar.c().f87343e, displayMetrics, expressionResolver));
        }
        if (a7Var instanceof a7.c) {
            a7.c cVar = (a7.c) a7Var;
            double dDoubleValue = ((Number) cVar.c().f91658a.evaluate(expressionResolver)).doubleValue();
            y5 y5Var = (y5) cVar.c().f91659b.evaluate(expressionResolver);
            z5 z5Var = (z5) cVar.c().f91660c.evaluate(expressionResolver);
            Uri uri = (Uri) cVar.c().f91662e.evaluate(expressionResolver);
            boolean zBooleanValue = ((Boolean) cVar.c().f91663f.evaluate(expressionResolver)).booleanValue();
            df dfVar = (df) cVar.c().f91664g.evaluate(expressionResolver);
            List list = cVar.c().f91661d;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(toBackgroundState((cc) it.next(), expressionResolver));
                }
            } else {
                arrayList = null;
            }
            return new DivBackgroundState.Image(dDoubleValue, y5Var, z5Var, uri, zBooleanValue, dfVar, arrayList, isVectorCompatible(cVar.c(), expressionResolver));
        }
        if (a7Var instanceof a7.g) {
            return new DivBackgroundState.Solid(((Number) ((a7.g) a7Var).c().f87894a.evaluate(expressionResolver)).intValue());
        }
        if (!(a7Var instanceof a7.e)) {
            throw new m();
        }
        a7.e eVar = (a7.e) a7Var;
        Uri uri2 = (Uri) eVar.c().f92188a.evaluate(expressionResolver);
        long jLongValue2 = ((Number) eVar.c().f92189b.f92845b.evaluate(expressionResolver)).longValue();
        long j11 = jLongValue2 >> 31;
        if (j11 == 0 || j11 == -1) {
            i10 = (int) jLongValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
            }
            i10 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue3 = ((Number) eVar.c().f92189b.f92847d.evaluate(expressionResolver)).longValue();
        long j12 = jLongValue3 >> 31;
        if (j12 == 0 || j12 == -1) {
            i11 = (int) jLongValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
            }
            i11 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue4 = ((Number) eVar.c().f92189b.f92846c.evaluate(expressionResolver)).longValue();
        long j13 = jLongValue4 >> 31;
        if (j13 == 0 || j13 == -1) {
            i12 = (int) jLongValue4;
        } else {
            KAssert kAssert4 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue4 + "' to Int");
            }
            i12 = jLongValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue5 = ((Number) eVar.c().f92189b.f92844a.evaluate(expressionResolver)).longValue();
        long j14 = jLongValue5 >> 31;
        if (j14 == 0 || j14 == -1) {
            i13 = (int) jLongValue5;
        } else {
            KAssert kAssert5 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue5 + "' to Int");
            }
            i13 = jLongValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return new DivBackgroundState.NinePatch(uri2, new Rect(i10, i11, i12, i13));
    }

    private Drawable toDrawable(List<? extends DivBackgroundState> list, BindingContext bindingContext, View view, Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        if (list == null) {
            if (drawable != null) {
                return new LayerDrawable(new Drawable[]{drawable});
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Drawable drawableMutate = ((DivBackgroundState) it.next()).toDrawable(bindingContext, view, this.imageLoader).mutate();
            if (drawableMutate != null) {
                arrayList.add(drawableMutate);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (drawable != null) {
            mutableList.add(drawable);
        }
        List list2 = mutableList;
        if (list2.isEmpty()) {
            return null;
        }
        return new LayerDrawable((Drawable[]) list2.toArray(new Drawable[0]));
    }

    private void updateBackground(View view, Drawable drawable) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R$drawable.native_animation_background) : null) != null) {
            Drawable drawable2 = ContextCompat.getDrawable(view.getContext(), R$drawable.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z10) {
            Drawable background2 = view.getBackground();
            Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable background3 = view.getBackground();
            Intrinsics.checkNotNull(background3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, R$drawable.native_animation_background);
        }
    }

    public void bindBackground(@NotNull BindingContext context, @NotNull View view, @Nullable List<? extends a7> newDefaultBackgroundList, @Nullable List<? extends a7> oldDefaultBackgroundList, @Nullable List<? extends a7> newFocusedBackgroundList, @Nullable List<? extends a7> oldFocusedBackgroundList, @NotNull ExpressionSubscriber subscriber, @Nullable Drawable additionalLayer) {
        if (newFocusedBackgroundList == null) {
            bindDefaultBackground(context, view, additionalLayer, newDefaultBackgroundList, oldDefaultBackgroundList, subscriber);
        } else {
            bindFocusBackground(context, view, additionalLayer, newDefaultBackgroundList, oldDefaultBackgroundList, newFocusedBackgroundList, oldFocusedBackgroundList, subscriber);
        }
    }

    private DivBackgroundState.RadialGradient.Center toBackgroundState(fm fmVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (fmVar instanceof fm.c) {
            fm.c cVar = (fm.c) fmVar;
            return new DivBackgroundState.RadialGradient.Center.Fixed(BaseDivViewExtensionsKt.toPxF(((Number) cVar.c().f89023b.evaluate(expressionResolver)).longValue(), (jp) cVar.c().f89022a.evaluate(expressionResolver), displayMetrics));
        }
        if (fmVar instanceof fm.d) {
            return new DivBackgroundState.RadialGradient.Center.Relative((float) ((Number) ((fm.d) fmVar).c().f92408a.evaluate(expressionResolver)).doubleValue());
        }
        throw new m();
    }

    private DivBackgroundState.RadialGradient.Radius toBackgroundState(sm smVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (smVar instanceof sm.c) {
            return new DivBackgroundState.RadialGradient.Radius.Fixed(BaseDivViewExtensionsKt.toPxF(((sm.c) smVar).c(), displayMetrics, expressionResolver));
        }
        if (smVar instanceof sm.d) {
            return new DivBackgroundState.RadialGradient.Radius.Relative((cn.c) ((sm.d) smVar).c().f86759a.evaluate(expressionResolver));
        }
        throw new m();
    }

    private DivBackgroundState.Image.Filter toBackgroundState(cc ccVar, ExpressionResolver expressionResolver) {
        int i10;
        if (ccVar instanceof cc.a) {
            cc.a aVar = (cc.a) ccVar;
            long jLongValue = ((Number) aVar.c().f87989a.evaluate(expressionResolver)).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.Image.Filter.Blur(i10, aVar);
        }
        if (ccVar instanceof cc.d) {
            return new DivBackgroundState.Image.Filter.RtlMirror((cc.d) ccVar);
        }
        throw new m();
    }
}
