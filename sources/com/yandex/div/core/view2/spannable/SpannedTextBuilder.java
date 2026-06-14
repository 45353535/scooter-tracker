package com.yandex.div.core.view2.spannable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextViewKt;
import com.yandex.div.core.view2.spannable.MaskData;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.spannable.LetterSpacingSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import com.yandex.div.internal.spannable.TextColorSpan;
import com.yandex.div.internal.spannable.TypefaceSpan;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.impl.H2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import k8.ei;
import k8.g7;
import k8.iu;
import k8.j1;
import k8.jd;
import k8.jp;
import k8.oo;
import k8.pu;
import k8.st;
import k8.tu;
import k8.us;
import k8.vs;
import k8.xt;
import kf.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.text.CharsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 f2\u00020\u0001:\u0002fgB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J}\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00102\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010!\u001a\u00020 2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-J/\u00101\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u0010!\u001a\u00020 2\u0006\u00100\u001a\u00020\"H\u0002¢\u0006\u0004\b1\u00102JG\u00105\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020)2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010H\u0002¢\u0006\u0004\b5\u00106JK\u0010;\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020)2\b\u00108\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J7\u0010>\u001a\u00020=2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u0010!\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010?J/\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u0010@\u001a\u00020)H\u0002¢\u0006\u0004\bA\u0010BJ/\u0010C\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010DJ?\u0010F\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010E\u001a\u00020\u00112\u0006\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020)H\u0002¢\u0006\u0004\bF\u0010GJ5\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010H2\b\b\u0001\u0010J\u001a\u00020)H\u0002¢\u0006\u0004\bL\u0010MJ+\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bQ\u0010RJ\u0013\u0010U\u001a\u00020T*\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bW\u0010XJC\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010YJK\u0010\\\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010[\u001a\u00020Z2\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\\\u0010]R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010^R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082D¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder;", "", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "typefaceResolver", "Lcom/yandex/div/core/images/DivImageLoader;", "imageLoader", "<init>", "(Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/images/DivImageLoader;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Landroid/widget/TextView;", "textView", "Lk8/us;", "divText", "", "text", "", "Lk8/us$e;", "ranges", "Lk8/us$d;", "images", "Lk8/j1;", "actions", "Lkotlin/Function1;", "Landroid/text/Spanned;", "", "Lcom/yandex/div/core/view2/spannable/TextConsumer;", "textConsumer", "buildText", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/widget/TextView;Lk8/us;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Landroid/text/Spanned;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/view2/spannable/TextData;", "textData", "Lcom/yandex/div/core/view2/spannable/SpanData;", "preprocessSpans", "(Landroid/content/Context;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/spannable/TextData;Ljava/util/List;)Ljava/util/List;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "preprocessImages", "(Lcom/yandex/div/core/view2/spannable/TextData;Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "", "textLength", "image", "imagePosition", "(ILk8/us$d;Lcom/yandex/div/json/expressions/ExpressionResolver;)I", "Landroid/text/Spannable;", "spannedText", "span", "addSpan", "(Landroid/widget/TextView;Landroid/text/Spannable;Lcom/yandex/div/core/view2/spannable/TextData;Lcom/yandex/div/core/view2/spannable/SpanData;)V", "start", "end", "addActionSpan", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/widget/TextView;Landroid/text/Spannable;IILjava/util/List;)V", "Lk8/xt;", OutlinedTextFieldKt.BorderId, "Lk8/st;", H2.f75840g, "addDecorationSpan", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/widget/TextView;Landroid/text/Spannable;IILk8/xt;Lk8/st;)V", "Lcom/yandex/div/core/view2/spannable/ImageSpan;", "addImageSpan", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/widget/TextView;Landroid/text/Spannable;Lcom/yandex/div/core/view2/spannable/TextData;Lk8/us$d;)Lcom/yandex/div/core/view2/spannable/ImageSpan;", C4240b4.i.L, "getActionsForPosition", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/text/Spannable;I)Ljava/util/List;", "createTextData", "(Landroid/content/Context;Lcom/yandex/div/core/view2/BindingContext;Lk8/us;Ljava/lang/String;)Lcom/yandex/div/core/view2/spannable/TextData;", SessionDescription.ATTR_RANGE, "createSpanData", "(Landroid/content/Context;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/spannable/TextData;Lk8/us$e;II)Lcom/yandex/div/core/view2/spannable/SpanData;", "Lk8/oo;", "shadow", "textColor", "Lcom/yandex/div/core/view2/spannable/ShadowData;", "createShadowData", "(Landroid/content/Context;Lcom/yandex/div/core/view2/BindingContext;Lk8/oo;I)Lcom/yandex/div/core/view2/spannable/ShadowData;", "Lk8/iu;", "mask", "Lcom/yandex/div/core/view2/spannable/MaskData;", "createMaskData", "(Landroid/content/Context;Lcom/yandex/div/core/view2/BindingContext;Lk8/iu;)Lcom/yandex/div/core/view2/spannable/MaskData;", "Lk8/vs;", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "toTextVerticalAlignment", "(Lk8/vs;)Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "buildPlainText", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/widget/TextView;Lk8/us;)Landroid/text/Spanned;", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/widget/TextView;Lk8/us;Lkotlin/jvm/functions/Function1;)Landroid/text/Spanned;", "Lk8/us$c;", "ellipsis", "buildEllipsis", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/widget/TextView;Lk8/us;Lk8/us$c;Lkotlin/jvm/functions/Function1;)Landroid/text/Spanned;", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "Lcom/yandex/div/core/images/DivImageLoader;", "Landroid/graphics/Paint;", "tempPaint", "Landroid/graphics/Paint;", "", "debugFontMetrics", "Z", y.f66058y, "ImageDownloadCallbackImpl", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpannedTextBuilder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean debugFontMetrics;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final Paint tempPaint = new Paint();

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder$Companion;", "", "()V", "IMAGE_PLACEHOLDER", "", "WORD_JOINER", "ZWSP", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder$ImageDownloadCallbackImpl;", "Lcom/yandex/div/core/DivIdLoggingImageDownloadCallback;", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/us$d;", "image", "Lcom/yandex/div/core/view2/spannable/ImageSpan;", "imageSpan", "Landroid/text/Spanned;", "spannedText", "Lkotlin/Function1;", "", "Lcom/yandex/div/core/view2/spannable/TextConsumer;", "textConsumer", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/us$d;Lcom/yandex/div/core/view2/spannable/ImageSpan;Landroid/text/Spanned;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/core/images/CachedBitmap;", "cachedBitmap", "onSuccess", "(Lcom/yandex/div/core/images/CachedBitmap;)V", "Lcom/yandex/div/core/view2/BindingContext;", "Lk8/us$d;", "Lcom/yandex/div/core/view2/spannable/ImageSpan;", "Landroid/text/Spanned;", "Lkotlin/jvm/functions/Function1;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ImageDownloadCallbackImpl extends DivIdLoggingImageDownloadCallback {

        @NotNull
        private final BindingContext bindingContext;

        @NotNull
        private final us.d image;

        @NotNull
        private final ImageSpan imageSpan;

        @NotNull
        private final Spanned spannedText;

        @Nullable
        private final Function1<Spanned, Unit> textConsumer;

        /* JADX WARN: Multi-variable type inference failed */
        public ImageDownloadCallbackImpl(@NotNull BindingContext bindingContext, @NotNull us.d dVar, @NotNull ImageSpan imageSpan, @NotNull Spanned spanned, @Nullable Function1<? super Spanned, Unit> function1) {
            super(bindingContext.getDivView());
            this.bindingContext = bindingContext;
            this.image = dVar;
            this.imageSpan = imageSpan;
            this.spannedText = spanned;
            this.textConsumer = function1;
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
            super.onSuccess(cachedBitmap);
            Resources resources = this.bindingContext.getDivView().getResources();
            ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
            Expression expression = this.image.f91784g;
            Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
            PorterDuff.Mode porterDuffMode = DivUtilKt.toPorterDuffMode((g7) this.image.f91785h.evaluate(expressionResolver));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, cachedBitmap.getBitmap());
            if (num != null) {
                bitmapDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), porterDuffMode));
            }
            this.imageSpan.setImage(bitmapDrawable);
            Function1<Spanned, Unit> function1 = this.textConsumer;
            if (function1 != null) {
                function1.invoke(this.spannedText);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[us.d.EnumC1052d.values().length];
            try {
                iArr[us.d.EnumC1052d.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[us.d.EnumC1052d.REVERSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ei.values().length];
            try {
                iArr2[ei.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ei.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[us.d.a.c.values().length];
            try {
                iArr3[us.d.a.c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[us.d.a.c.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[us.d.a.c.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[us.d.a.c.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[us.d.a.c.AUTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[vs.values().length];
            try {
                iArr4[vs.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[vs.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[vs.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[vs.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public SpannedTextBuilder(@NotNull DivTypefaceResolver divTypefaceResolver, @NotNull DivImageLoader divImageLoader) {
        this.typefaceResolver = divTypefaceResolver;
        this.imageLoader = divImageLoader;
    }

    private final void addActionSpan(BindingContext bindingContext, TextView textView, Spannable spannedText, int start, int end, List<j1> actions) {
        List<j1> list = actions;
        if (list == null || list.isEmpty()) {
            return;
        }
        textView.setMovementMethod(SelectableLinkMovementMethod.INSTANCE);
        spannedText.setSpan(new PerformActionSpan(bindingContext, actions), start, end, 33);
        ViewCompat.enableAccessibleClickableSpanSupport(textView);
    }

    private final void addDecorationSpan(BindingContext bindingContext, TextView textView, Spannable spannedText, int start, int end, xt border, st background) {
        if (border == null && background == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(border, background);
        if (textView instanceof DivLineHeightTextView) {
            DivLineHeightTextView divLineHeightTextView = (DivLineHeightTextView) textView;
            if (DivLineHeightTextViewKt.hasBackgroundSpan(divLineHeightTextView, spannedText, divBackgroundSpan, start, end, expressionResolver)) {
                return;
            }
            spannedText.setSpan(divBackgroundSpan, start, end, 33);
            DivTextRangesBackgroundHelper textRoundedBgHelper = divLineHeightTextView.getTextRoundedBgHelper();
            if (textRoundedBgHelper != null) {
                textRoundedBgHelper.addBackgroundSpan$div_release(divBackgroundSpan);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.yandex.div.core.view2.spannable.ImageSpan addImageSpan(final com.yandex.div.core.view2.BindingContext r18, final android.widget.TextView r19, android.text.Spannable r20, com.yandex.div.core.view2.spannable.TextData r21, k8.us.d r22) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.spannable.SpannedTextBuilder.addImageSpan(com.yandex.div.core.view2.BindingContext, android.widget.TextView, android.text.Spannable, com.yandex.div.core.view2.spannable.TextData, k8.us$d):com.yandex.div.core.view2.spannable.ImageSpan");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addImageSpan$lambda$22$lambda$21$lambda$20(Div2View div2View, BindingContext bindingContext, TextView textView, List list) {
        div2View.getDiv2Component().getActionBinder().handleTapClick$div_release(bindingContext, textView, list);
    }

    private final void addSpan(final TextView textView, Spannable spannedText, TextData textData, SpanData span) {
        int start = span.getStart();
        int end = span.getEnd();
        if (start > end) {
            return;
        }
        vs alignmentVertical = span.getAlignmentVertical();
        if (alignmentVertical == null) {
            alignmentVertical = vs.BASELINE;
        }
        int baselineOffset = span.getBaselineOffset();
        if (baselineOffset != 0) {
            Integer lineHeight = span.getLineHeight();
            spannedText.setSpan(new BaselineShiftSpan(baselineOffset, (lineHeight == null && (lineHeight = textData.getLineHeight()) == null) ? 0 : lineHeight.intValue()), start, end, 33);
        } else if (alignmentVertical != vs.BASELINE) {
            Integer fontSize = span.getFontSize();
            spannedText.setSpan(new VerticalAlignmentSpan(fontSize != null ? fontSize.intValue() : 0, toTextVerticalAlignment(alignmentVertical), new a() { // from class: t7.a
                @Override // kf.a
                public final Object get() {
                    return textView.getLayout();
                }
            }), start, end, 33);
        }
        Integer fontSize2 = span.getFontSize();
        if (fontSize2 != null) {
            int iIntValue = fontSize2.intValue();
            Integer lineHeight2 = span.getLineHeight();
            spannedText.setSpan(new FontSizeSpan(iIntValue, (lineHeight2 == null && (lineHeight2 = textData.getLineHeight()) == null) ? 0 : lineHeight2.intValue()), start, end, 33);
        }
        String fontFeatureSettings = span.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            spannedText.setSpan(new FontFeatureSpan(fontFeatureSettings), start, end, 33);
        }
        Integer textColor = span.getTextColor();
        if (textColor != null) {
            spannedText.setSpan(new TextColorSpan(textColor.intValue()), start, end, 33);
        }
        Double letterSpacing = span.getLetterSpacing();
        if (letterSpacing != null) {
            spannedText.setSpan(new LetterSpacingSpan((float) letterSpacing.doubleValue()), start, end, 33);
        }
        ei strike = span.getStrike();
        if (strike != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[strike.ordinal()];
            if (i10 == 1) {
                spannedText.setSpan(new StrikethroughSpan(), start, end, 33);
            } else if (i10 == 2) {
                spannedText.setSpan(new NoStrikethroughSpan(), start, end, 33);
            }
        }
        ei underline = span.getUnderline();
        if (underline != null) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[underline.ordinal()];
            if (i11 == 1) {
                spannedText.setSpan(new UnderlineSpan(), start, end, 33);
            } else if (i11 == 2) {
                spannedText.setSpan(new NoUnderlineSpan(), start, end, 33);
            }
        }
        DivTypefaceResolver divTypefaceResolver = this.typefaceResolver;
        String fontFamily = span.getFontFamily();
        if (fontFamily == null) {
            fontFamily = textData.getFontFamily();
        }
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(fontFamily);
        if (span.getFontFamily() != null || span.getFontWeight() != null || span.getFontWeightValue() != null) {
            spannedText.setSpan(new TypefaceSpan(DivTypefaceResolverKt.getTypeface((span.getFontWeight() == null && span.getFontWeightValue() == null) ? DivTypefaceResolverKt.getTypefaceValue(textData.getFontWeight(), textData.getFontWeightValue()) : DivTypefaceResolverKt.getTypefaceValue(span.getFontWeight(), span.getFontWeightValue()), typefaceProvider)), start, end, 33);
        }
        if (TextViewExtensionsKt.getSupportFontVariations() && typefaceProvider.isVariable() && (span.getFontWeight() != null || span.getFontWeightValue() != null || span.getFontVariationSettings() != null)) {
            spannedText.setSpan(new FontVariationSpan(TextViewExtensionsKt.getFontVariations(span.getFontWeight(), span.getFontWeightValue(), span.getFontVariationSettings())), start, end, 33);
        }
        if (span.getLineHeight() != null || span.getTopOffset() != null) {
            int i12 = Intrinsics.areEqual(span.getLineHeight(), textData.getLineHeight()) ? 18 : 33;
            Integer topOffset = span.getTopOffset();
            int iIntValue2 = topOffset != null ? topOffset.intValue() : 0;
            Integer lineHeight3 = span.getLineHeight();
            int iIntValue3 = lineHeight3 != null ? lineHeight3.intValue() : 0;
            Integer topOffsetStart = span.getTopOffsetStart();
            int iIntValue4 = topOffsetStart != null ? topOffsetStart.intValue() : start;
            Integer topOffsetEnd = span.getTopOffsetEnd();
            spannedText.setSpan(new LineHeightWithTopOffsetSpan(iIntValue2, iIntValue3, iIntValue4, topOffsetEnd != null ? topOffsetEnd.intValue() : end), start, end, i12);
        }
        ShadowData textShadow = span.getTextShadow();
        if (textShadow != null) {
            spannedText.setSpan(new ShadowSpan(textShadow), start, end, 33);
        }
        MaskData mask = span.getMask();
        if (mask != null) {
            if (mask instanceof MaskData.Particles) {
                if (((MaskData.Particles) mask).getIsEnabled()) {
                    spannedText.setSpan(new MaskSpan(mask, textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null), start, end, 33);
                }
            } else if ((mask instanceof MaskData.Solid) && ((MaskData.Solid) mask).getIsEnabled()) {
                spannedText.setSpan(new MaskSpan(mask, textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null), start, end, 33);
            }
        }
    }

    private final MaskData createMaskData(Context context, BindingContext bindingContext, iu mask) {
        if (mask == null) {
            return null;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (mask instanceof iu.c) {
            pu puVarC = ((iu.c) mask).c();
            long jLongValue = ((Number) puVarC.f90454e.f92339b.evaluate(expressionResolver)).longValue();
            return new MaskData.Particles(((Number) puVarC.f90450a.evaluate(expressionResolver)).intValue(), (float) ((Number) puVarC.f90451b.evaluate(expressionResolver)).doubleValue(), ((Boolean) puVarC.f90452c.evaluate(expressionResolver)).booleanValue(), ((Boolean) puVarC.f90453d.evaluate(expressionResolver)).booleanValue(), BaseDivViewExtensionsKt.unitToPxF(Long.valueOf(jLongValue), displayMetrics, (jp) puVarC.f90454e.f92338a.evaluate(expressionResolver)));
        }
        if (!(mask instanceof iu.d)) {
            throw new m();
        }
        tu tuVarC = ((iu.d) mask).c();
        return new MaskData.Solid(((Number) tuVarC.f91524a.evaluate(expressionResolver)).intValue(), ((Boolean) tuVarC.f91525b.evaluate(expressionResolver)).booleanValue());
    }

    private final ShadowData createShadowData(Context context, BindingContext bindingContext, oo shadow, @ColorInt int textColor) {
        if (shadow == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        float fDpToPxF = BaseDivViewExtensionsKt.dpToPxF((Number) shadow.f90234b.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(shadow.f90236d.f92958a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(shadow.f90236d.f92959b, displayMetrics, expressionResolver);
        Paint paint = this.tempPaint;
        paint.setColor(((Number) shadow.f90235c.evaluate(expressionResolver)).intValue());
        paint.setAlpha((int) (((Number) shadow.f90233a.evaluate(expressionResolver)).doubleValue() * ((double) (textColor >>> 24))));
        return new ShadowData(px, px2, fDpToPxF, paint.getColor());
    }

    private final SpanData createSpanData(Context context, BindingContext bindingContext, TextData textData, us.e range, int start, int end) {
        Integer numValueOf;
        long j10;
        Integer numValueOf2;
        Double dValueOf;
        Integer numValueOf3;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int fontSizeValue = textData.getFontSizeValue();
        Expression expression = range.f91829i;
        if (expression != null) {
            long jLongValue = ((Number) expression.evaluate(expressionResolver)).longValue();
            long j11 = jLongValue >> 31;
            if (j11 == 0 || j11 == -1) {
                i12 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i12);
        } else {
            numValueOf = null;
        }
        jp jpVar = (jp) range.f91830j.evaluate(expressionResolver);
        Expression expression2 = range.f91822b;
        vs vsVar = expression2 != null ? (vs) expression2.evaluate(expressionResolver) : null;
        int iUnitToPx = BaseDivViewExtensionsKt.unitToPx((Number) range.f91824d.evaluate(expressionResolver), displayMetrics, jpVar);
        Expression expression3 = range.f91827g;
        String str = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = range.f91828h;
        String str2 = expression4 != null ? (String) expression4.evaluate(expressionResolver) : null;
        Integer numValueOf4 = numValueOf != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(numValueOf, displayMetrics, jpVar)) : null;
        Expression expression5 = range.f91832l;
        jd jdVar = expression5 != null ? (jd) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = range.f91833m;
        if (expression6 != null) {
            j10 = -1;
            long jLongValue2 = ((Number) expression6.evaluate(expressionResolver)).longValue();
            long j12 = jLongValue2 >> 31;
            if (j12 == 0 || j12 == -1) {
                i11 = (int) jLongValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                }
                i11 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf2 = Integer.valueOf(i11);
        } else {
            j10 = -1;
            numValueOf2 = null;
        }
        Expression expression7 = range.f91831k;
        JSONObject jSONObject = expression7 != null ? (JSONObject) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = range.f91834n;
        if (expression8 != null) {
            double dDoubleValue = ((Number) expression8.evaluate(expressionResolver)).doubleValue();
            if (numValueOf != null) {
                fontSizeValue = numValueOf.intValue();
            }
            dValueOf = Double.valueOf(dDoubleValue / ((double) fontSizeValue));
        } else {
            dValueOf = null;
        }
        Expression expression9 = range.f91835o;
        Integer numValueOf5 = expression9 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression9.evaluate(expressionResolver)).longValue()), displayMetrics, jpVar)) : null;
        MaskData maskDataCreateMaskData = createMaskData(context, bindingContext, range.f91836p);
        Expression expression10 = range.f91838r;
        ei eiVar = expression10 != null ? (ei) expression10.evaluate(expressionResolver) : null;
        Expression expression11 = range.f91839s;
        Integer num = expression11 != null ? (Integer) expression11.evaluate(expressionResolver) : null;
        ShadowData shadowDataCreateShadowData = createShadowData(context, bindingContext, range.f91840t, textData.getTextColor());
        Expression expression12 = range.f91841u;
        if (expression12 != null) {
            long jLongValue3 = ((Number) expression12.evaluate(expressionResolver)).longValue();
            long j13 = jLongValue3 >> 31;
            if (j13 == 0 || j13 == j10) {
                i10 = (int) jLongValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
                }
                i10 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf3 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i10), displayMetrics, jpVar));
        } else {
            numValueOf3 = null;
        }
        Integer numValueOf6 = range.f91841u != null ? Integer.valueOf(start) : null;
        Integer numValueOf7 = range.f91841u != null ? Integer.valueOf(end) : null;
        Expression expression13 = range.f91842v;
        return new SpanData(start, end, vsVar, iUnitToPx, str, str2, numValueOf4, jpVar, jdVar, numValueOf2, jSONObject, dValueOf, numValueOf5, maskDataCreateMaskData, eiVar, num, shadowDataCreateShadowData, numValueOf3, numValueOf6, numValueOf7, expression13 != null ? (ei) expression13.evaluate(expressionResolver) : null);
    }

    private final TextData createTextData(Context context, BindingContext bindingContext, us divText, String text) {
        int i10;
        char c10;
        Integer numValueOf;
        Integer numValueOf2;
        int i11;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        long jLongValue = ((Number) divText.f91756v.evaluate(expressionResolver)).longValue();
        long j10 = jLongValue >> 31;
        int i12 = Integer.MIN_VALUE;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        int i13 = i10;
        jp jpVar = (jp) divText.f91757w.evaluate(expressionResolver);
        int iUnitToPx = BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i13), displayMetrics, jpVar);
        Expression expression = divText.f91759y;
        jd jdVar = expression != null ? (jd) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divText.f91760z;
        if (expression2 != null) {
            c10 = 31;
            long jLongValue2 = ((Number) expression2.evaluate(expressionResolver)).longValue();
            long j11 = jLongValue2 >> 31;
            if (j11 == 0 || j11 == -1) {
                i11 = (int) jLongValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                }
                i11 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i11);
        } else {
            c10 = 31;
            numValueOf = null;
        }
        Expression expression3 = divText.f91754t;
        String str = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divText.I;
        if (expression4 != null) {
            long jLongValue3 = ((Number) expression4.evaluate(expressionResolver)).longValue();
            long j12 = jLongValue3 >> c10;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
                }
                if (jLongValue3 > 0) {
                    i12 = Integer.MAX_VALUE;
                }
            }
            numValueOf2 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i12), displayMetrics, jpVar));
        } else {
            numValueOf2 = null;
        }
        return new TextData(text, iUnitToPx, i13, jpVar, str, jdVar, numValueOf, numValueOf2, ((Number) divText.Z.evaluate(expressionResolver)).intValue());
    }

    private final List<j1> getActionsForPosition(BindingContext bindingContext, Spannable spannedText, int position) {
        PerformActionSpan[] performActionSpanArr = (PerformActionSpan[]) spannedText.getSpans(position, position + 1, PerformActionSpan.class);
        if (performActionSpanArr.length > 1) {
            DivActionTypedUtilsKt.logWarning(bindingContext.getDivView(), new Throwable("Two or more clickable ranges intersect."));
        }
        PerformActionSpan performActionSpan = (PerformActionSpan) ArraysKt.firstOrNull(performActionSpanArr);
        if (performActionSpan != null) {
            return performActionSpan.getActions();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int imagePosition(int textLength, us.d image, ExpressionResolver resolver) {
        long jLongValue = ((Number) image.f91783f.evaluate(resolver)).longValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[((us.d.EnumC1052d) image.f91781d.evaluate(resolver)).ordinal()];
        if (i10 == 1) {
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                return (int) jLongValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            return jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (i10 != 2) {
            throw new m();
        }
        long j11 = ((long) textLength) - jLongValue;
        long j12 = j11 >> 31;
        if (j12 == 0 || j12 == -1) {
            return (int) j11;
        }
        KAssert kAssert2 = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + j11 + "' to Int");
        }
        return j11 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    private final List<us.d> preprocessImages(final TextData textData, List<us.d> images, final ExpressionResolver resolver) {
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : images) {
                if (((Number) ((us.d) obj).f91783f.evaluate(resolver)).longValue() <= textData.getTextLength()) {
                    arrayList.add(obj);
                }
            }
            List<us.d> listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.spannable.SpannedTextBuilder$preprocessImages$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d(Integer.valueOf(this.this$0.imagePosition(textData.getTextLength(), (us.d) t10, resolver)), Integer.valueOf(this.this$0.imagePosition(textData.getTextLength(), (us.d) t11, resolver)));
                }
            });
            if (listSortedWith != null) {
                return listSortedWith;
            }
        }
        return CollectionsKt.emptyList();
    }

    private final List<SpanData> preprocessSpans(Context context, BindingContext bindingContext, TextData textData, List<us.e> ranges) {
        int i10;
        int iJ;
        int i11;
        List<us.e> list;
        if (textData.getLineHeight() == null && ((list = ranges) == null || list.isEmpty())) {
            return CollectionsKt.emptyList();
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int textLength = textData.getTextLength();
        int size = ranges != null ? ranges.size() : 0;
        TreeSet treeSetSortedSetOf = SetsKt.sortedSetOf(new Integer[0]);
        ArrayList arrayList = new ArrayList(size + 1);
        if (ranges != null) {
            for (us.e eVar : ranges) {
                long jLongValue = ((Number) eVar.f91837q.evaluate(expressionResolver)).longValue();
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
                int iJ2 = g.j(i10, textLength);
                Expression expression = eVar.f91826f;
                if (expression != null) {
                    long jLongValue2 = ((Number) expression.evaluate(expressionResolver)).longValue();
                    long j11 = jLongValue2 >> 31;
                    if (j11 == 0 || j11 == -1) {
                        i11 = (int) jLongValue2;
                    } else {
                        KAssert kAssert2 = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                        }
                        i11 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    iJ = g.j(i11, textLength);
                } else {
                    iJ = textLength;
                }
                if (iJ2 < iJ) {
                    SpanData spanDataCreateSpanData = createSpanData(context, bindingContext, textData, eVar, iJ2, iJ);
                    if (!spanDataCreateSpanData.isEmpty()) {
                        treeSetSortedSetOf.add(Integer.valueOf(iJ2));
                        treeSetSortedSetOf.add(Integer.valueOf(iJ));
                        arrayList.add(spanDataCreateSpanData);
                    }
                }
            }
        }
        CollectionsKt.sort(arrayList);
        Integer lineHeight = textData.getLineHeight();
        if (lineHeight != null) {
            int iIntValue = lineHeight.intValue();
            treeSetSortedSetOf.add(0);
            treeSetSortedSetOf.add(Integer.valueOf(textLength));
            arrayList.add(0, SpanData.INSTANCE.lineHeight$div_release(0, textLength, iIntValue));
        }
        if (arrayList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List list2 = CollectionsKt.toList(treeSetSortedSetOf);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int iIntValue2 = ((Number) CollectionsKt.first(list2)).intValue();
        if (list2.size() == 1) {
            SpanData spanDataEmpty$div_release = SpanData.INSTANCE.empty$div_release(iIntValue2, iIntValue2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                spanDataEmpty$div_release = spanDataEmpty$div_release.mergeWith((SpanData) it.next(), iIntValue2, iIntValue2);
            }
            arrayList2.add(spanDataEmpty$div_release);
            return arrayList2;
        }
        int size2 = list2.size();
        int i12 = 1;
        while (i12 < size2) {
            int iIntValue3 = ((Number) list2.get(i12)).intValue();
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                SpanData spanData = (SpanData) arrayList.get(i13);
                if (iIntValue3 < spanData.getStart()) {
                    break;
                }
                if (iIntValue3 > spanData.getStart() && iIntValue3 <= spanData.getEnd()) {
                    arrayList3.add(spanData);
                }
            }
            if (!arrayList3.isEmpty()) {
                SpanData spanDataEmpty$div_release2 = SpanData.INSTANCE.empty$div_release(iIntValue2, iIntValue3);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    spanDataEmpty$div_release2 = spanDataEmpty$div_release2.mergeWith((SpanData) it2.next(), iIntValue2, iIntValue3);
                }
                arrayList2.add(spanDataEmpty$div_release2);
            }
            arrayList3.clear();
            i12++;
            iIntValue2 = iIntValue3;
        }
        return arrayList2;
    }

    private final TextVerticalAlignment toTextVerticalAlignment(vs vsVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$3[vsVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? TextVerticalAlignment.BASELINE : TextVerticalAlignment.BOTTOM : TextVerticalAlignment.BASELINE : TextVerticalAlignment.CENTER : TextVerticalAlignment.TOP;
    }

    @NotNull
    public final Spanned buildEllipsis(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull us divText, @NotNull us.c ellipsis, @Nullable Function1<? super Spanned, Unit> textConsumer) {
        return buildText(bindingContext, textView, divText, (String) ellipsis.f91767d.evaluate(bindingContext.getExpressionResolver()), ellipsis.f91766c, ellipsis.f91765b, ellipsis.f91764a, textConsumer);
    }

    @NotNull
    public final Spanned buildPlainText(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull us divText) {
        return buildText(bindingContext, textView, divText, (String) divText.W.evaluate(bindingContext.getExpressionResolver()), null, null, null, null);
    }

    @NotNull
    public final Spanned buildText(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull us divText, @Nullable Function1<? super Spanned, Unit> textConsumer) {
        return buildText(bindingContext, textView, divText, (String) divText.W.evaluate(bindingContext.getExpressionResolver()), divText.Q, divText.F, null, textConsumer);
    }

    private final Spanned buildText(BindingContext bindingContext, TextView textView, us divText, String text, List<us.e> ranges, List<us.d> images, List<j1> actions, Function1<? super Spanned, Unit> textConsumer) {
        Function1<? super Spanned, Unit> function1;
        int i10;
        int iJ;
        int i11;
        TextView textView2 = textView;
        Context context = textView2.getContext();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text.length() == 0 ? "\u200b" : text);
        TextData textDataCreateTextData = createTextData(context, bindingContext, divText, text);
        int textLength = textDataCreateTextData.getTextLength();
        List<SpanData> listPreprocessSpans = preprocessSpans(context, bindingContext, textDataCreateTextData, ranges);
        List<us.d> listPreprocessImages = preprocessImages(textDataCreateTextData, images, expressionResolver);
        if (this.debugFontMetrics) {
            spannableStringBuilder.setSpan(new LineMetricsSpan(), 0, spannableStringBuilder.length(), 33);
        }
        DivLineHeightTextView divLineHeightTextView = textView2 instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView2 : null;
        if (divLineHeightTextView != null) {
            divLineHeightTextView.clearImageSpans$div_release();
            DivTextRangesBackgroundHelper textRoundedBgHelper = divLineHeightTextView.getTextRoundedBgHelper();
            if (textRoundedBgHelper != null) {
                textRoundedBgHelper.invalidateSpansCache$div_release();
            }
        }
        Iterator<T> it = listPreprocessSpans.iterator();
        while (it.hasNext()) {
            addSpan(textView2, spannableStringBuilder, textDataCreateTextData, (SpanData) it.next());
        }
        if (ranges != null) {
            List<us.e> list = ranges;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (us.e eVar : list) {
                    if (eVar.f91821a != null || eVar.f91823c != null || eVar.f91825e != null) {
                        if (ranges != null) {
                            for (us.e eVar2 : ranges) {
                                long jLongValue = ((Number) eVar2.f91837q.evaluate(expressionResolver)).longValue();
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
                                int iJ2 = g.j(i10, textLength);
                                Expression expression = eVar2.f91826f;
                                if (expression != null) {
                                    long jLongValue2 = ((Number) expression.evaluate(expressionResolver)).longValue();
                                    long j11 = jLongValue2 >> 31;
                                    if (j11 == 0 || j11 == -1) {
                                        i11 = (int) jLongValue2;
                                    } else {
                                        KAssert kAssert2 = KAssert.INSTANCE;
                                        if (Assert.isEnabled()) {
                                            Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                                        }
                                        i11 = jLongValue2 <= 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                                    }
                                    iJ = g.j(i11, textLength);
                                } else {
                                    iJ = textLength;
                                }
                                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                addActionSpan(bindingContext, textView2, spannableStringBuilder2, iJ2, iJ, eVar2.f91821a);
                                textView2 = textView;
                                addDecorationSpan(bindingContext, textView2, spannableStringBuilder2, iJ2, iJ, eVar2.f91825e, eVar2.f91823c);
                                spannableStringBuilder = spannableStringBuilder2;
                            }
                        }
                    }
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
        SpannedTextBuilder spannedTextBuilder = this;
        spannedTextBuilder.addActionSpan(bindingContext, textView, spannableStringBuilder3, 0, spannableStringBuilder3.length(), actions);
        int size = listPreprocessImages.size() - 1;
        if (size >= 0) {
            while (true) {
                int i12 = size - 1;
                us.d dVar = listPreprocessImages.get(size);
                int iImagePosition = spannedTextBuilder.imagePosition(textDataCreateTextData.getTextLength(), dVar, expressionResolver);
                int iImagePosition2 = size > 0 ? spannedTextBuilder.imagePosition(textDataCreateTextData.getTextLength(), listPreprocessImages.get(size - 1), expressionResolver) : Integer.MIN_VALUE;
                spannableStringBuilder3.insert(iImagePosition, (CharSequence) "#");
                TextData textData = textDataCreateTextData;
                ImageSpan imageSpanAddImageSpan = spannedTextBuilder.addImageSpan(bindingContext, textView, spannableStringBuilder3, textData, dVar);
                SpannedTextBuilder spannedTextBuilder2 = spannedTextBuilder;
                boolean z10 = iImagePosition2 + 1 == iImagePosition;
                boolean z11 = iImagePosition > 0 && !CharsKt.b(spannableStringBuilder3.charAt(iImagePosition + (-1)));
                if (!z10 && z11) {
                    spannableStringBuilder3.insert(iImagePosition, (CharSequence) "\u2060");
                }
                function1 = textConsumer;
                SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder3;
                spannableStringBuilder3 = spannableStringBuilder4;
                divView.addLoadReference(spannedTextBuilder2.imageLoader.loadImage(((Uri) dVar.f91786i.evaluate(expressionResolver)).toString(), new ImageDownloadCallbackImpl(bindingContext, dVar, imageSpanAddImageSpan, spannableStringBuilder4, function1)), textView);
                if (i12 < 0) {
                    break;
                }
                size = i12;
                spannedTextBuilder = spannedTextBuilder2;
                textDataCreateTextData = textData;
            }
        } else {
            function1 = textConsumer;
        }
        if (function1 != null) {
            function1.invoke(spannableStringBuilder3);
        }
        return spannableStringBuilder3;
    }
}
