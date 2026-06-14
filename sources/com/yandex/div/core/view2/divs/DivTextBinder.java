package com.yandex.div.core.view2.divs;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.ShadowData;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.internal.widget.TextViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k8.ar;
import k8.cn;
import k8.ei;
import k8.em;
import k8.fi;
import k8.fm;
import k8.gq;
import k8.iu;
import k8.oa;
import k8.oo;
import k8.pu;
import k8.rb;
import k8.sm;
import k8.st;
import k8.tu;
import k8.us;
import k8.xt;
import k8.y0;
import k8.y5;
import k8.z5;
import k8.zl;
import k8.zs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010 \u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J/\u0010)\u001a\u00020\u0012*\u00020\u00042\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010*J-\u0010,\u001a\u00020\u0012*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010\u001aJ-\u0010-\u001a\u00020\u0012*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010\u001aJ-\u0010.\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b.\u0010\u001aJ\u001d\u00101\u001a\u00020\u0012*\u00020\u001b2\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J-\u00103\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010\u001aJ-\u00104\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b4\u0010\u001aJ%\u00108\u001a\u00020\u0012*\u00020\u001b2\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b8\u00109J-\u0010:\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b:\u0010\u001aJ\u001b\u0010=\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J-\u0010?\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b?\u0010\u001aJ\u001b\u0010A\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010@\u001a\u00020;H\u0002¢\u0006\u0004\bA\u0010>J-\u0010B\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bB\u0010\u001aJ\u001b\u0010D\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010C\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bF\u0010\u001aJ\u001b\u0010H\u001a\u00020\u0012*\u00020\u00042\u0006\u0010G\u001a\u00020\u000bH\u0002¢\u0006\u0004\bH\u0010IJ5\u0010J\u001a\u00020\u0012*\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bJ\u0010KJ5\u0010P\u001a\u00020\u0012*\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010M\u001a\u00020L2\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bP\u0010QJ#\u0010U\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010R\u001a\u00020&2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ-\u0010X\u001a\u00020\u0012*\u00020\u00042\u0006\u0010M\u001a\u00020W2\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bX\u0010YJ9\u0010a\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\\2\f\u0010`\u001a\b\u0012\u0004\u0012\u0002050_H\u0002¢\u0006\u0004\ba\u0010bJ#\u0010f\u001a\u00020Z*\u00020c2\u0006\u0010e\u001a\u00020d2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bf\u0010gJ#\u0010i\u001a\u00020\\*\u00020h2\u0006\u0010e\u001a\u00020d2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bi\u0010jJ-\u0010k\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\bk\u0010lJ#\u0010m\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\bm\u0010nJ#\u0010o\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\bo\u0010pJ-\u0010q\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\bq\u0010lJ#\u0010s\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020\u0003H\u0002¢\u0006\u0004\bs\u0010pJ\u001b\u0010u\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010t\u001a\u00020/H\u0002¢\u0006\u0004\bu\u00102J-\u0010v\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\bv\u0010lJ/\u0010z\u001a\u00020\u0012*\u00020\u00042\b\u0010x\u001a\u0004\u0018\u00010w2\b\u0010y\u001a\u0004\u0018\u00010w2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bz\u0010{J\u001d\u0010}\u001a\u00020\u0012*\u00020\u00042\b\u0010|\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b}\u0010~J#\u0010\u007f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u007f\u0010nJ'\u0010\u0081\u0001\u001a\u00020\u0012*\u00030\u0080\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J/\u0010\u0083\u0001\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u0083\u0001\u0010\u001aJ\"\u0010\u0086\u0001\u001a\u00020\u0012*\u00020\u001b2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J/\u0010\u0088\u0001\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u001aJ&\u0010\u0089\u0001\u001a\u00020\u0012*\u00020\u00042\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001f\u0010\u008c\u0001\u001a\u00020\u0012*\u00030\u008b\u00012\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J2\u0010\u0091\u0001\u001a\u00030\u0084\u0001*\u00030\u008e\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0007\u0010\u008f\u0001\u001a\u00020d2\u0007\u0010\u0090\u0001\u001a\u000205H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J/\u0010\u0093\u0001\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0005\b\u0093\u0001\u0010lR\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0094\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0095\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u0096\u0001R\u001b\u0010\u0099\u0001\u001a\u000205*\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivTextBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$r;", "Lk8/us;", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "typefaceResolver", "Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder;", "spannedTextBuilder", "", "isHyphenationEnabled", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder;Z)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "configureView", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;)V", "newDiv", "oldDiv", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "bindTextAlignment", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lk8/us;Lk8/us;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Landroid/widget/TextView;", "Lk8/y5;", "horizontalAlignment", "Lk8/z5;", "verticalAlignment", "applyTextAlignment", "(Landroid/widget/TextView;Lk8/y5;Lk8/z5;)V", "bindMaxLines", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lcom/yandex/div/core/view2/BindingContext;Lk8/us;Lk8/us;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "", "maxLines", "minHiddenLines", "applyMaxLines", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Long;Ljava/lang/Long;)V", "div", "bindFontSize", "bindLetterSpacing", "bindFontFeatureSettings", "", "settings", "applyFontFeatureSettings", "(Landroid/widget/TextView;Ljava/lang/String;)V", "bindTypeface", "bindTextColor", "", "textColor", "focusedTextColor", "applyTextColor", "(Landroid/widget/TextView;ILjava/lang/Integer;)V", "bindUnderline", "Lk8/ei;", "underline", "applyUnderline", "(Landroid/widget/TextView;Lk8/ei;)V", "bindStrikethrough", "strikethrough", "applyStrikethrough", "bindSelectable", "selectable", "applySelectable", "(Landroid/widget/TextView;Z)V", "bindTightenWidth", "tight", "applyTightenWidth", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Z)V", "bindTextGradient", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lcom/yandex/div/core/view2/Div2View;Lk8/us;Lk8/us;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/fi;", "newTextGradient", "Lk8/zs;", "oldTextGradient", "bindLinearTextGradient", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lcom/yandex/div/core/view2/Div2View;Lk8/fi;Lk8/zs;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "angle", "Lcom/yandex/div/internal/graphics/Colormap;", "colormap", "applyLinearTextGradientColor", "(Landroid/widget/TextView;JLcom/yandex/div/internal/graphics/Colormap;)V", "Lk8/em;", "bindRadialTextGradient", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lk8/em;Lk8/zs;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "radius", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "centerX", "centerY", "", "colors", "applyRadialTextGradientColor", "(Landroid/widget/TextView;Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;Ljava/util/List;)V", "Lk8/sm;", "Landroid/util/DisplayMetrics;", "metrics", "toRadialGradientDrawableRadius", "(Lk8/sm;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "Lk8/fm;", "toRadialGradientDrawableCenter", "(Lk8/fm;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "bindText", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lcom/yandex/div/core/view2/BindingContext;Lk8/us;Lk8/us;)V", "bindRichText", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lcom/yandex/div/core/view2/BindingContext;Lk8/us;)V", "applyRichText", "(Landroid/widget/TextView;Lcom/yandex/div/core/view2/BindingContext;Lk8/us;)V", "bindPlainText", "divText", "applyPlainText", "text", "applyHyphenation", "bindEllipsis", "Lk8/us$c;", "newEllipsis", "oldEllipsis", "bindPlainEllipsis", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lk8/us$c;Lk8/us$c;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "ellipsis", "applyPlainEllipsis", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Ljava/lang/String;)V", "bindRichEllipsis", "Lcom/yandex/div/internal/widget/EllipsizedTextView;", "applyRichEllipsis", "(Lcom/yandex/div/internal/widget/EllipsizedTextView;Lcom/yandex/div/core/view2/BindingContext;Lk8/us;)V", "bindTextShadow", "Lcom/yandex/div/core/view2/spannable/ShadowData;", "shadowParams", "applyTextShadow", "(Landroid/widget/TextView;Lcom/yandex/div/core/view2/spannable/ShadowData;)V", "bindEllipsize", "applyEllipsize", "(Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;Lk8/us;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Landroid/view/View;", "updateFocusableState", "(Landroid/view/View;Lk8/us;)V", "Lk8/oo;", "displayMetrics", "fontColor", "getShadowData", "(Lk8/oo;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/util/DisplayMetrics;I)Lcom/yandex/div/core/view2/spannable/ShadowData;", "bind", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "Lcom/yandex/div/core/view2/spannable/SpannedTextBuilder;", "Z", "getRealTextWidth", "(Landroid/widget/TextView;)I", "realTextWidth", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTextBinder extends DivViewBinder<y0.r, us, DivLineHeightTextView> {
    private final boolean isHyphenationEnabled;

    @NotNull
    private final SpannedTextBuilder spannedTextBuilder;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[y5.values().length];
            try {
                iArr[y5.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y5.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y5.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y5.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y5.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ei.values().length];
            try {
                iArr2[ei.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ei.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[cn.c.values().length];
            try {
                iArr3[cn.c.FARTHEST_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[cn.c.NEAREST_CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[cn.c.FARTHEST_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[cn.c.NEAREST_SIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[us.f.values().length];
            try {
                iArr4[us.f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[us.f.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[us.f.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[us.f.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public DivTextBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull SpannedTextBuilder spannedTextBuilder, boolean z10) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.spannedTextBuilder = spannedTextBuilder;
        this.isHyphenationEnabled = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void applyEllipsize(com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView r5, k8.us r6, com.yandex.div.json.expressions.ExpressionResolver r7) {
        /*
            r4 = this;
            com.yandex.div.json.expressions.Expression r0 = r6.f91736j0
            java.lang.Object r0 = r0.evaluate(r7)
            k8.us$f r0 = (k8.us.f) r0
            int[] r1 = com.yandex.div.core.view2.divs.DivTextBinder.WhenMappings.$EnumSwitchMapping$3
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L2b
            r3 = 2
            if (r1 == r3) goto L28
            r3 = 3
            if (r1 == r3) goto L25
            r3 = 4
            if (r1 != r3) goto L1f
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            goto L2c
        L1f:
            lf.m r5 = new lf.m
            r5.<init>()
            throw r5
        L25:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L2c
        L28:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r5.setEllipsisLocation(r1)
            k8.us$f r1 = k8.us.f.NONE
            r3 = 0
            if (r0 == r1) goto L47
            com.yandex.div.json.expressions.Expression r6 = r6.f91733i
            if (r6 == 0) goto L43
            java.lang.Object r6 = r6.evaluate(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L44
        L43:
            r6 = r3
        L44:
            if (r6 == 0) goto L47
            goto L48
        L47:
            r2 = r3
        L48:
            r5.setAutoEllipsize(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivTextBinder.applyEllipsize(com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView, k8.us, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFontFeatureSettings(TextView textView, String str) {
        if (str == null || !(!StringsKt.y0(str))) {
            str = null;
        }
        textView.setFontFeatureSettings(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHyphenation(TextView textView, String str) {
        if (TextViewsKt.checkHyphenationSupported()) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i10 = 0;
            if (this.isHyphenationEnabled && StringsKt.f0(str, (char) 173, false, 2, null)) {
                i10 = 1;
            }
            if (hyphenationFrequency != i10) {
                textView.setHyphenationFrequency(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLinearTextGradientColor(final TextView textView, final long j10, final Colormap colormap) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyLinearTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(LinearGradientDrawable.INSTANCE.createLinearGradient(j10, colormap.getColors(), colormap.getPositions(), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(LinearGradientDrawable.INSTANCE.createLinearGradient(j10, colormap.getColors(), colormap.getPositions(), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMaxLines(DivLineHeightTextView divLineHeightTextView, Div2View div2View, Long l10, Long l11) {
        int i10;
        AdaptiveMaxLines adaptiveMaxLines = divLineHeightTextView.getAdaptiveMaxLines();
        if (adaptiveMaxLines != null) {
            adaptiveMaxLines.reset();
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        if (l10 == null || l11 == null) {
            if (l10 != null) {
                long jLongValue = l10.longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i11 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    if (jLongValue > 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                }
                i12 = i11;
            }
            divLineHeightTextView.setMaxLines(i12);
            return;
        }
        AdaptiveMaxLines adaptiveMaxLines2 = new AdaptiveMaxLines(divLineHeightTextView, div2View.getViewComponent().getDrawingPassOverrideStrategy());
        long jLongValue2 = l10.longValue();
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
        long jLongValue3 = l11.longValue();
        long j12 = jLongValue3 >> 31;
        if (j12 == 0 || j12 == -1) {
            i11 = (int) jLongValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
            }
            if (jLongValue3 > 0) {
                i11 = Integer.MAX_VALUE;
            }
        }
        adaptiveMaxLines2.apply(new AdaptiveMaxLines.Params(i10, i11));
        divLineHeightTextView.setAdaptiveMaxLines$div_release(adaptiveMaxLines2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainEllipsis(DivLineHeightTextView divLineHeightTextView, String str) {
        if (str == null) {
            str = "…";
        }
        divLineHeightTextView.setEllipsis(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainText(TextView textView, BindingContext bindingContext, us usVar) {
        textView.setText(this.spannedTextBuilder.buildPlainText(bindingContext, textView, usVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRadialTextGradientColor(final TextView textView, final RadialGradientDrawable.Radius radius, final RadialGradientDrawable.Center center, final RadialGradientDrawable.Center center2, final List<Integer> list) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRadialTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(RadialGradientDrawable.INSTANCE.createRadialGradient(radius, center, center2, CollectionsKt.toIntArray(list), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(RadialGradientDrawable.INSTANCE.createRadialGradient(radius, center, center2, CollectionsKt.toIntArray(list), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichEllipsis(final EllipsizedTextView ellipsizedTextView, BindingContext bindingContext, us usVar) {
        us.c cVar = usVar.f91747p;
        if (cVar == null) {
            ellipsizedTextView.setEllipsis("…");
        } else {
            this.spannedTextBuilder.buildEllipsis(bindingContext, ellipsizedTextView, usVar, cVar, new Function1<Spanned, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.applyRichEllipsis.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Spanned spanned) {
                    invoke2(spanned);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Spanned spanned) {
                    ellipsizedTextView.setEllipsis(spanned);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichText(final TextView textView, BindingContext bindingContext, us usVar) {
        this.spannedTextBuilder.buildText(bindingContext, textView, usVar, new Function1<Spanned, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.applyRichText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Spanned spanned) {
                invoke2(spanned);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Spanned spanned) {
                textView.setText(spanned, TextView.BufferType.NORMAL);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySelectable(TextView textView, boolean z10) {
        MovementMethod movementMethod = textView.getMovementMethod();
        textView.setTextIsSelectable(z10);
        if (movementMethod instanceof SelectableLinkMovementMethod) {
            textView.setMovementMethod(movementMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStrikethrough(TextView textView, ei eiVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[eiVar.ordinal()];
        if (i10 == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            if (i10 != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextAlignment(TextView textView, y5 y5Var, z5 z5Var) {
        textView.setGravity(DivUtilKt.evaluateGravity(y5Var, z5Var));
        int i10 = WhenMappings.$EnumSwitchMapping$0[y5Var.ordinal()];
        int i11 = 5;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 4;
            } else if (i10 == 3 || (i10 != 4 && i10 == 5)) {
                i11 = 6;
            }
        }
        textView.setTextAlignment(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextColor(TextView textView, int i10, Integer num) {
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{num != null ? num.intValue() : i10, i10}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextShadow(TextView textView, ShadowData shadowData) {
        DivViewWrapper divViewWrapper;
        if (shadowData == null) {
            ViewParent parent = textView.getParent();
            divViewWrapper = parent instanceof DivViewWrapper ? (DivViewWrapper) parent : null;
            if (divViewWrapper != null) {
                divViewWrapper.setClipChildren(true);
                divViewWrapper.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        divViewWrapper = parent2 instanceof DivViewWrapper ? (DivViewWrapper) parent2 : null;
        if (divViewWrapper != null) {
            divViewWrapper.setClipChildren(false);
            divViewWrapper.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTightenWidth(DivLineHeightTextView divLineHeightTextView, boolean z10) {
        divLineHeightTextView.setTightenWidth(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyUnderline(TextView textView, ei eiVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[eiVar.ordinal()];
        if (i10 == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            if (i10 != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    private final void bindEllipsis(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, us usVar, us usVar2) {
        us.c cVar = usVar.f91747p;
        if ((cVar != null ? cVar.f91766c : null) == null) {
            if ((cVar != null ? cVar.f91765b : null) == null) {
                if ((cVar != null ? cVar.f91764a : null) == null) {
                    bindPlainEllipsis(divLineHeightTextView, cVar, usVar2 != null ? usVar2.f91747p : null, bindingContext.getExpressionResolver());
                    return;
                }
            }
        }
        bindRichEllipsis(divLineHeightTextView, bindingContext, usVar);
    }

    private final void bindEllipsize(final DivLineHeightTextView divLineHeightTextView, final us usVar, us usVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.f91733i, usVar2 != null ? usVar2.f91733i : null)) {
            if (ExpressionsKt.equalsToConstant(usVar.f91736j0, usVar2 != null ? usVar2.f91736j0 : null)) {
                return;
            }
        }
        applyEllipsize(divLineHeightTextView, usVar, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(usVar.f91733i) && ExpressionsKt.isConstant(usVar.f91736j0)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
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
                this.this$0.applyEllipsize(divLineHeightTextView, usVar, expressionResolver);
            }
        };
        Expression expression = usVar.f91733i;
        if (expression != null) {
            divLineHeightTextView.addSubscription(expression.observe(expressionResolver, function1));
        }
        divLineHeightTextView.addSubscription(usVar.f91736j0.observe(expressionResolver, function1));
    }

    private final void bindFontFeatureSettings(final DivLineHeightTextView divLineHeightTextView, final us usVar, us usVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.f91755u, usVar2 != null ? usVar2.f91755u : null)) {
            return;
        }
        Expression expression = usVar.f91755u;
        applyFontFeatureSettings(divLineHeightTextView, expression != null ? (String) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(usVar.f91755u)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindFontFeatureSettings$callback$1
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
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Expression expression2 = usVar.f91755u;
                divTextBinder.applyFontFeatureSettings(divLineHeightTextView2, expression2 != null ? (String) expression2.evaluate(expressionResolver) : null);
            }
        };
        Expression expression2 = usVar.f91755u;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
    }

    private final void bindFontSize(DivLineHeightTextView divLineHeightTextView, us usVar, us usVar2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeFontSize(divLineHeightTextView, usVar.f91756v, usVar.f91757w, usVar2 != null ? usVar2.f91756v : null, usVar2 != null ? usVar2.f91757w : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLetterSpacing(DivLineHeightTextView divLineHeightTextView, us usVar, us usVar2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeLetterSpacing(divLineHeightTextView, usVar.H, usVar.f91756v, usVar2 != null ? usVar2.H : null, usVar2 != null ? usVar2.f91756v : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLinearTextGradient(final DivLineHeightTextView divLineHeightTextView, final Div2View div2View, final fi fiVar, zs zsVar, final ExpressionResolver expressionResolver) {
        if (zsVar instanceof zs.c) {
            zs.c cVar = (zs.c) zsVar;
            if (ExpressionsKt.equalsToConstant(fiVar.f87514a, cVar.c().f87514a) && ExpressionsKt.equalsToConstant(fiVar.f87516c, cVar.c().f87516c)) {
                List list = fiVar.f87515b;
                List list2 = cVar.c().f87515b;
                if (list == null && list2 == null) {
                    return;
                }
                if (list != null && list2 != null && list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (DivDataExtensionsKt.equalsToConstant((fi.a) obj, (fi.a) list2.get(i10))) {
                            i10 = i11;
                        }
                    }
                    return;
                }
            }
        }
        applyLinearTextGradientColor(divLineHeightTextView, ((Number) fiVar.f87514a.evaluate(expressionResolver)).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(fiVar, expressionResolver), div2View));
        if (ExpressionsKt.isConstant(fiVar.f87514a) && ExpressionsKt.isConstantOrNull(fiVar.f87516c)) {
            List list3 = fiVar.f87515b;
            if (list3 != null) {
                List list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    return;
                }
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((fi.a) it.next())) {
                    }
                }
                return;
            }
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindLinearTextGradient$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                invoke2(obj2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj2) {
                this.this$0.applyLinearTextGradientColor(divLineHeightTextView, ((Number) fiVar.f87514a.evaluate(expressionResolver)).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(fiVar, expressionResolver), div2View));
            }
        };
        divLineHeightTextView.addSubscription(fiVar.f87514a.observe(expressionResolver, function1));
        ExpressionList expressionList = fiVar.f87516c;
        divLineHeightTextView.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, function1) : null);
        List list5 = fiVar.f87515b;
        if (list5 != null) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                ExpressionSubscribersKt.observeColorPoint(divLineHeightTextView, (fi.a) it2.next(), expressionResolver, function1);
            }
        }
    }

    private final void bindMaxLines(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final us usVar, us usVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.L, usVar2 != null ? usVar2.L : null)) {
            if (ExpressionsKt.equalsToConstant(usVar.M, usVar2 != null ? usVar2.M : null)) {
                return;
            }
        }
        Div2View divView = bindingContext.getDivView();
        Expression expression = usVar.L;
        Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = usVar.M;
        applyMaxLines(divLineHeightTextView, divView, l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(usVar.L) && ExpressionsKt.isConstantOrNull(usVar.M)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindMaxLines$callback$1
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
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Div2View divView2 = bindingContext.getDivView();
                Expression expression3 = usVar.L;
                Long l11 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
                Expression expression4 = usVar.M;
                divTextBinder.applyMaxLines(divLineHeightTextView2, divView2, l11, expression4 != null ? (Long) expression4.evaluate(expressionResolver) : null);
            }
        };
        Expression expression3 = usVar.L;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, function1) : null);
        Expression expression4 = usVar.M;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function1) : null);
    }

    private final void bindPlainEllipsis(final DivLineHeightTextView divLineHeightTextView, us.c cVar, us.c cVar2, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(cVar != null ? cVar.f91767d : null, cVar2 != null ? cVar2.f91767d : null)) {
            return;
        }
        applyPlainEllipsis(divLineHeightTextView, (cVar == null || (expression2 = cVar.f91767d) == null) ? null : (String) expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(cVar != null ? cVar.f91767d : null)) {
            if (ExpressionsKt.isConstantOrNull(cVar != null ? cVar.f91767d : null)) {
                return;
            }
        }
        if (cVar != null && (expression = cVar.f91767d) != null) {
            disposableObserve = expression.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindPlainEllipsis.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String str) {
                    DivTextBinder.this.applyPlainEllipsis(divLineHeightTextView, str);
                }
            });
        }
        divLineHeightTextView.addSubscription(disposableObserve);
    }

    private final void bindPlainText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final us usVar, us usVar2) {
        if (ExpressionsKt.equalsToConstant(usVar.W, usVar2 != null ? usVar2.W : null)) {
            if (ExpressionsKt.equalsToConstant(usVar.I, usVar2 != null ? usVar2.I : null)) {
                if (ExpressionsKt.equalsToConstant(usVar.f91757w, usVar2 != null ? usVar2.f91757w : null)) {
                    List extensions = usVar.getExtensions();
                    List extensions2 = usVar2 != null ? usVar2.getExtensions() : null;
                    if (extensions == null && extensions2 == null) {
                        return;
                    }
                    if (extensions != null && extensions2 != null && extensions.size() == extensions2.size()) {
                        int i10 = 0;
                        for (Object obj : extensions) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (Intrinsics.areEqual(((rb) obj).f90670a, ((rb) extensions2.get(i10)).f90670a)) {
                                i10 = i11;
                            }
                        }
                        return;
                    }
                }
            }
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        String str = (String) usVar.W.evaluate(expressionResolver);
        applyPlainText(divLineHeightTextView, bindingContext, usVar);
        applyHyphenation(divLineHeightTextView, str);
        if (ExpressionsKt.isConstant(usVar.W) && ExpressionsKt.isConstantOrNull(usVar.I) && ExpressionsKt.isConstantOrNull(usVar.f91757w)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                invoke2(obj2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj2) {
                String str2 = (String) usVar.W.evaluate(expressionResolver);
                this.applyPlainText(divLineHeightTextView, bindingContext, usVar);
                this.applyHyphenation(divLineHeightTextView, str2);
            }
        };
        divLineHeightTextView.addSubscription(usVar.W.observe(expressionResolver, function1));
        Expression expression = usVar.I;
        divLineHeightTextView.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        divLineHeightTextView.addSubscription(usVar.f91757w.observe(expressionResolver, function1));
    }

    private final void bindRadialTextGradient(final DivLineHeightTextView divLineHeightTextView, final em emVar, zs zsVar, final ExpressionResolver expressionResolver) {
        List<Integer> listEmptyList;
        if (zsVar instanceof zs.d) {
            zs.d dVar = (zs.d) zsVar;
            if (Intrinsics.areEqual(emVar.f87343e, dVar.c().f87343e) && Intrinsics.areEqual(emVar.f87339a, dVar.c().f87339a) && Intrinsics.areEqual(emVar.f87340b, dVar.c().f87340b) && ExpressionsKt.equalsToConstant(emVar.f87342d, dVar.c().f87342d)) {
                return;
            }
        }
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        RadialGradientDrawable.Radius radialGradientDrawableRadius = toRadialGradientDrawableRadius(emVar.f87343e, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter = toRadialGradientDrawableCenter(emVar.f87339a, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter2 = toRadialGradientDrawableCenter(emVar.f87340b, displayMetrics, expressionResolver);
        ExpressionList expressionList = emVar.f87342d;
        if (expressionList == null || (listEmptyList = expressionList.evaluate(expressionResolver)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        applyRadialTextGradientColor(divLineHeightTextView, radialGradientDrawableRadius, radialGradientDrawableCenter, radialGradientDrawableCenter2, listEmptyList);
        if (ExpressionsKt.isConstantOrNull(emVar.f87342d)) {
            return;
        }
        ExpressionList expressionList2 = emVar.f87342d;
        divLineHeightTextView.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, new Function1<List<? extends Integer>, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindRadialTextGradient.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list) {
                invoke2((List<Integer>) list);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<Integer> list) {
                DivTextBinder divTextBinder = DivTextBinder.this;
                divTextBinder.applyRadialTextGradientColor(divLineHeightTextView, divTextBinder.toRadialGradientDrawableRadius(emVar.f87343e, displayMetrics, expressionResolver), DivTextBinder.this.toRadialGradientDrawableCenter(emVar.f87339a, displayMetrics, expressionResolver), DivTextBinder.this.toRadialGradientDrawableCenter(emVar.f87340b, displayMetrics, expressionResolver), list);
            }
        }) : null);
    }

    private final void bindRichEllipsis(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final us usVar) {
        ar arVar;
        Expression expression;
        ar arVar2;
        Expression expression2;
        applyRichEllipsis(divLineHeightTextView, bindingContext, usVar);
        us.c cVar = usVar.f91747p;
        if (cVar == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichEllipsis$callback$1
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
                this.this$0.applyRichEllipsis(divLineHeightTextView, bindingContext, usVar);
            }
        };
        divLineHeightTextView.addSubscription(cVar.f91767d.observe(expressionResolver, function1));
        List<us.e> list = cVar.f91766c;
        if (list != null) {
            for (us.e eVar : list) {
                divLineHeightTextView.addSubscription(eVar.f91837q.observe(expressionResolver, function1));
                Expression expression3 = eVar.f91826f;
                divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, function1) : null);
                Expression expression4 = eVar.f91822b;
                divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(eVar.f91824d.observe(expressionResolver, function1));
                Expression expression5 = eVar.f91829i;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(eVar.f91830j.observe(expressionResolver, function1));
                Expression expression6 = eVar.f91827g;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, function1) : null);
                Expression expression7 = eVar.f91832l;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, function1) : null);
                Expression expression8 = eVar.f91833m;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, function1) : null);
                Expression expression9 = eVar.f91828h;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, function1) : null);
                Expression expression10 = eVar.f91834n;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, function1) : null);
                Expression expression11 = eVar.f91835o;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, function1) : null);
                Expression expression12 = eVar.f91838r;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, function1) : null);
                Expression expression13 = eVar.f91839s;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, function1) : null);
                Expression expression14 = eVar.f91841u;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, function1) : null);
                Expression expression15 = eVar.f91842v;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, function1) : null);
                st stVar = eVar.f91823c;
                Object objB = stVar != null ? stVar.b() : null;
                if (objB instanceof gq) {
                    divLineHeightTextView.addSubscription(((gq) objB).f87894a.observe(expressionResolver, function1));
                }
                iu iuVar = eVar.f91836p;
                Object objB2 = iuVar != null ? iuVar.b() : null;
                if (objB2 instanceof tu) {
                    tu tuVar = (tu) objB2;
                    divLineHeightTextView.addSubscription(tuVar.f91525b.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(tuVar.f91524a.observe(expressionResolver, function1));
                } else if (objB2 instanceof pu) {
                    pu puVar = (pu) objB2;
                    divLineHeightTextView.addSubscription(puVar.f90453d.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90450a.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90451b.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90452c.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90454e.f92339b.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90454e.f92338a.observe(expressionResolver, function1));
                }
                xt xtVar = eVar.f91825e;
                divLineHeightTextView.addSubscription((xtVar == null || (arVar2 = xtVar.f92416b) == null || (expression2 = arVar2.f86313a) == null) ? null : expression2.observe(expressionResolver, function1));
                xt xtVar2 = eVar.f91825e;
                divLineHeightTextView.addSubscription((xtVar2 == null || (arVar = xtVar2.f92416b) == null || (expression = arVar.f86316d) == null) ? null : expression.observe(expressionResolver, function1));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression expression16 = eVar.f91831k;
                    divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, function1) : null);
                }
            }
        }
        List<us.d> list2 = cVar.f91765b;
        if (list2 != null) {
            for (us.d dVar : list2) {
                divLineHeightTextView.addSubscription(dVar.f91783f.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(dVar.f91786i.observe(expressionResolver, function1));
                Expression expression17 = dVar.f91784g;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(dVar.f91787j.f92339b.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(dVar.f91787j.f92338a.observe(expressionResolver, function1));
            }
        }
    }

    private final void bindRichText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final us usVar) {
        ar arVar;
        Expression expression;
        ar arVar2;
        Expression expression2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyRichText(divLineHeightTextView, bindingContext, usVar);
        applyHyphenation(divLineHeightTextView, (String) usVar.W.evaluate(expressionResolver));
        divLineHeightTextView.addSubscription(usVar.W.observe(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindRichText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                DivTextBinder.this.applyRichText(divLineHeightTextView, bindingContext, usVar);
                DivTextBinder.this.applyHyphenation(divLineHeightTextView, str);
            }
        }));
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$callback$1
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
                this.this$0.applyRichText(divLineHeightTextView, bindingContext, usVar);
            }
        };
        divLineHeightTextView.addSubscription(usVar.f91756v.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription(usVar.f91757w.observe(expressionResolver, function1));
        Expression expression3 = usVar.f91754t;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, function1) : null);
        Expression expression4 = usVar.I;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function1) : null);
        List<us.e> list = usVar.Q;
        if (list != null) {
            for (us.e eVar : list) {
                divLineHeightTextView.addSubscription(eVar.f91837q.observe(expressionResolver, function1));
                Expression expression5 = eVar.f91826f;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, function1) : null);
                Expression expression6 = eVar.f91822b;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(eVar.f91824d.observe(expressionResolver, function1));
                Expression expression7 = eVar.f91829i;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(eVar.f91830j.observe(expressionResolver, function1));
                Expression expression8 = eVar.f91827g;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, function1) : null);
                Expression expression9 = eVar.f91832l;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, function1) : null);
                Expression expression10 = eVar.f91833m;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, function1) : null);
                Expression expression11 = eVar.f91828h;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, function1) : null);
                Expression expression12 = eVar.f91834n;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, function1) : null);
                Expression expression13 = eVar.f91835o;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, function1) : null);
                Expression expression14 = eVar.f91838r;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, function1) : null);
                Expression expression15 = eVar.f91839s;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, function1) : null);
                Expression expression16 = eVar.f91841u;
                divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, function1) : null);
                Expression expression17 = eVar.f91842v;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, function1) : null);
                st stVar = eVar.f91823c;
                Object objB = stVar != null ? stVar.b() : null;
                if (objB instanceof gq) {
                    divLineHeightTextView.addSubscription(((gq) objB).f87894a.observe(expressionResolver, function1));
                }
                iu iuVar = eVar.f91836p;
                Object objB2 = iuVar != null ? iuVar.b() : null;
                if (objB2 instanceof tu) {
                    tu tuVar = (tu) objB2;
                    divLineHeightTextView.addSubscription(tuVar.f91525b.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(tuVar.f91524a.observe(expressionResolver, function1));
                } else if (objB2 instanceof pu) {
                    pu puVar = (pu) objB2;
                    divLineHeightTextView.addSubscription(puVar.f90453d.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90450a.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90451b.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90452c.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90454e.f92339b.observe(expressionResolver, function1));
                    divLineHeightTextView.addSubscription(puVar.f90454e.f92338a.observe(expressionResolver, function1));
                }
                xt xtVar = eVar.f91825e;
                divLineHeightTextView.addSubscription((xtVar == null || (arVar2 = xtVar.f92416b) == null || (expression2 = arVar2.f86313a) == null) ? null : expression2.observe(expressionResolver, function1));
                xt xtVar2 = eVar.f91825e;
                divLineHeightTextView.addSubscription((xtVar2 == null || (arVar = xtVar2.f92416b) == null || (expression = arVar.f86316d) == null) ? null : expression.observe(expressionResolver, function1));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression expression18 = eVar.f91831k;
                    divLineHeightTextView.addSubscription(expression18 != null ? expression18.observe(expressionResolver, function1) : null);
                }
            }
        }
        List<us.d> list2 = usVar.F;
        if (list2 != null) {
            for (us.d dVar : list2) {
                divLineHeightTextView.addSubscription(dVar.f91783f.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(dVar.f91781d.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(dVar.f91786i.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(dVar.f91779b.observe(expressionResolver, function1));
                Expression expression19 = dVar.f91784g;
                divLineHeightTextView.addSubscription(expression19 != null ? expression19.observe(expressionResolver, function1) : null);
                divLineHeightTextView.addSubscription(dVar.f91787j.f92339b.observe(expressionResolver, function1));
                divLineHeightTextView.addSubscription(dVar.f91787j.f92338a.observe(expressionResolver, function1));
            }
        }
    }

    private final void bindSelectable(final DivLineHeightTextView divLineHeightTextView, us usVar, us usVar2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.T, usVar2 != null ? usVar2.T : null)) {
            return;
        }
        applySelectable(divLineHeightTextView, ((Boolean) usVar.T.evaluate(expressionResolver)).booleanValue());
        if (ExpressionsKt.isConstant(usVar.T)) {
            return;
        }
        divLineHeightTextView.addSubscription(usVar.T.observe(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindSelectable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                DivTextBinder.this.applySelectable(divLineHeightTextView, z10);
            }
        }));
    }

    private final void bindStrikethrough(final DivLineHeightTextView divLineHeightTextView, us usVar, us usVar2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.V, usVar2 != null ? usVar2.V : null)) {
            return;
        }
        applyStrikethrough(divLineHeightTextView, (ei) usVar.V.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(usVar.V)) {
            return;
        }
        divLineHeightTextView.addSubscription(usVar.V.observe(expressionResolver, new Function1<ei, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindStrikethrough.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ei eiVar) {
                invoke2(eiVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ei eiVar) {
                DivTextBinder.this.applyStrikethrough(divLineHeightTextView, eiVar);
            }
        }));
    }

    private final void bindText(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, us usVar, us usVar2) {
        if (usVar.Q == null && usVar.F == null) {
            bindPlainText(divLineHeightTextView, bindingContext, usVar, usVar2);
        } else {
            bindRichText(divLineHeightTextView, bindingContext, usVar);
        }
    }

    private final void bindTextAlignment(final DivLineHeightTextView divLineHeightTextView, final us usVar, us usVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.X, usVar2 != null ? usVar2.X : null)) {
            if (ExpressionsKt.equalsToConstant(usVar.Y, usVar2 != null ? usVar2.Y : null)) {
                return;
            }
        }
        applyTextAlignment(divLineHeightTextView, (y5) usVar.X.evaluate(expressionResolver), (z5) usVar.Y.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(usVar.X) && ExpressionsKt.isConstant(usVar.Y)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextAlignment$callback$1
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
                this.this$0.applyTextAlignment(divLineHeightTextView, (y5) usVar.X.evaluate(expressionResolver), (z5) usVar.Y.evaluate(expressionResolver));
            }
        };
        divLineHeightTextView.addSubscription(usVar.X.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription(usVar.Y.observe(expressionResolver, function1));
    }

    private final void bindTextColor(final DivLineHeightTextView divLineHeightTextView, final us usVar, us usVar2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.Z, usVar2 != null ? usVar2.Z : null)) {
            if (ExpressionsKt.equalsToConstant(usVar.f91753s, usVar2 != null ? usVar2.f91753s : null)) {
                return;
            }
        }
        int iIntValue = ((Number) usVar.Z.evaluate(expressionResolver)).intValue();
        Expression expression = usVar.f91753s;
        applyTextColor(divLineHeightTextView, iIntValue, expression != null ? (Integer) expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstant(usVar.Z) && ExpressionsKt.isConstantOrNull(usVar.f91753s)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextColor$callback$1
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
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                int iIntValue2 = ((Number) usVar.Z.evaluate(expressionResolver)).intValue();
                Expression expression2 = usVar.f91753s;
                divTextBinder.applyTextColor(divLineHeightTextView2, iIntValue2, expression2 != null ? (Integer) expression2.evaluate(expressionResolver) : null);
            }
        };
        divLineHeightTextView.addSubscription(usVar.Z.observe(expressionResolver, function1));
        Expression expression2 = usVar.f91753s;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
    }

    private final void bindTextGradient(DivLineHeightTextView divLineHeightTextView, Div2View div2View, us usVar, us usVar2, ExpressionResolver expressionResolver) {
        zs zsVar = usVar.f91718a0;
        if (zsVar == null) {
            divLineHeightTextView.getPaint().setShader(null);
        } else if (zsVar instanceof zs.c) {
            bindLinearTextGradient(divLineHeightTextView, div2View, ((zs.c) zsVar).c(), usVar2 != null ? usVar2.f91718a0 : null, expressionResolver);
        } else if (zsVar instanceof zs.d) {
            bindRadialTextGradient(divLineHeightTextView, ((zs.d) zsVar).c(), usVar2 != null ? usVar2.f91718a0 : null, expressionResolver);
        }
    }

    private final void bindTextShadow(final DivLineHeightTextView divLineHeightTextView, final us usVar, us usVar2, final ExpressionResolver expressionResolver) {
        zl zlVar;
        oa oaVar;
        Expression expression;
        zl zlVar2;
        oa oaVar2;
        Expression expression2;
        zl zlVar3;
        oa oaVar3;
        Expression expression3;
        zl zlVar4;
        oa oaVar4;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        zl zlVar5;
        oa oaVar5;
        zl zlVar6;
        oa oaVar6;
        zl zlVar7;
        oa oaVar7;
        zl zlVar8;
        oa oaVar8;
        oo ooVar;
        zl zlVar9;
        oa oaVar9;
        zl zlVar10;
        oa oaVar10;
        oo ooVar2;
        zl zlVar11;
        oa oaVar11;
        zl zlVar12;
        oa oaVar12;
        oo ooVar3;
        zl zlVar13;
        oa oaVar13;
        zl zlVar14;
        oa oaVar14;
        oo ooVar4;
        zl zlVar15;
        oa oaVar15;
        zl zlVar16;
        oa oaVar16;
        oo ooVar5;
        oo ooVar6;
        oo ooVar7;
        oo ooVar8 = usVar.f91720b0;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(ooVar8 != null ? ooVar8.f90233a : null, (usVar2 == null || (ooVar7 = usVar2.f91720b0) == null) ? null : ooVar7.f90233a)) {
            oo ooVar9 = usVar.f91720b0;
            if (ExpressionsKt.equalsToConstant(ooVar9 != null ? ooVar9.f90234b : null, (usVar2 == null || (ooVar6 = usVar2.f91720b0) == null) ? null : ooVar6.f90234b)) {
                oo ooVar10 = usVar.f91720b0;
                if (ExpressionsKt.equalsToConstant(ooVar10 != null ? ooVar10.f90235c : null, (usVar2 == null || (ooVar5 = usVar2.f91720b0) == null) ? null : ooVar5.f90235c)) {
                    oo ooVar11 = usVar.f91720b0;
                    if (ExpressionsKt.equalsToConstant((ooVar11 == null || (zlVar16 = ooVar11.f90236d) == null || (oaVar16 = zlVar16.f92958a) == null) ? null : oaVar16.f90180b, (usVar2 == null || (ooVar4 = usVar2.f91720b0) == null || (zlVar15 = ooVar4.f90236d) == null || (oaVar15 = zlVar15.f92958a) == null) ? null : oaVar15.f90180b)) {
                        oo ooVar12 = usVar.f91720b0;
                        if (ExpressionsKt.equalsToConstant((ooVar12 == null || (zlVar14 = ooVar12.f90236d) == null || (oaVar14 = zlVar14.f92958a) == null) ? null : oaVar14.f90179a, (usVar2 == null || (ooVar3 = usVar2.f91720b0) == null || (zlVar13 = ooVar3.f90236d) == null || (oaVar13 = zlVar13.f92958a) == null) ? null : oaVar13.f90179a)) {
                            oo ooVar13 = usVar.f91720b0;
                            if (ExpressionsKt.equalsToConstant((ooVar13 == null || (zlVar12 = ooVar13.f90236d) == null || (oaVar12 = zlVar12.f92959b) == null) ? null : oaVar12.f90180b, (usVar2 == null || (ooVar2 = usVar2.f91720b0) == null || (zlVar11 = ooVar2.f90236d) == null || (oaVar11 = zlVar11.f92959b) == null) ? null : oaVar11.f90180b)) {
                                oo ooVar14 = usVar.f91720b0;
                                if (ExpressionsKt.equalsToConstant((ooVar14 == null || (zlVar10 = ooVar14.f90236d) == null || (oaVar10 = zlVar10.f92959b) == null) ? null : oaVar10.f90179a, (usVar2 == null || (ooVar = usVar2.f91720b0) == null || (zlVar9 = ooVar.f90236d) == null || (oaVar9 = zlVar9.f92959b) == null) ? null : oaVar9.f90179a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        final oo ooVar15 = usVar.f91720b0;
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        applyTextShadow(divLineHeightTextView, ooVar15 != null ? getShadowData(ooVar15, expressionResolver, displayMetrics, ((Number) usVar.Z.evaluate(expressionResolver)).intValue()) : null);
        oo ooVar16 = usVar.f91720b0;
        if (ExpressionsKt.isConstantOrNull(ooVar16 != null ? ooVar16.f90233a : null)) {
            oo ooVar17 = usVar.f91720b0;
            if (ExpressionsKt.isConstantOrNull(ooVar17 != null ? ooVar17.f90234b : null)) {
                oo ooVar18 = usVar.f91720b0;
                if (ExpressionsKt.isConstantOrNull(ooVar18 != null ? ooVar18.f90235c : null)) {
                    oo ooVar19 = usVar.f91720b0;
                    if (ExpressionsKt.isConstantOrNull((ooVar19 == null || (zlVar8 = ooVar19.f90236d) == null || (oaVar8 = zlVar8.f92958a) == null) ? null : oaVar8.f90180b)) {
                        oo ooVar20 = usVar.f91720b0;
                        if (ExpressionsKt.isConstantOrNull((ooVar20 == null || (zlVar7 = ooVar20.f90236d) == null || (oaVar7 = zlVar7.f92958a) == null) ? null : oaVar7.f90179a)) {
                            oo ooVar21 = usVar.f91720b0;
                            if (ExpressionsKt.isConstantOrNull((ooVar21 == null || (zlVar6 = ooVar21.f90236d) == null || (oaVar6 = zlVar6.f92959b) == null) ? null : oaVar6.f90180b)) {
                                oo ooVar22 = usVar.f91720b0;
                                if (ExpressionsKt.isConstantOrNull((ooVar22 == null || (zlVar5 = ooVar22.f90236d) == null || (oaVar5 = zlVar5.f92959b) == null) ? null : oaVar5.f90179a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
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
                ShadowData shadowData;
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                oo ooVar23 = ooVar15;
                if (ooVar23 != null) {
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    shadowData = divTextBinder.getShadowData(ooVar23, expressionResolver2, displayMetrics, ((Number) usVar.Z.evaluate(expressionResolver2)).intValue());
                } else {
                    shadowData = null;
                }
                divTextBinder.applyTextShadow(divLineHeightTextView2, shadowData);
            }
        };
        divLineHeightTextView.addSubscription((ooVar15 == null || (expression7 = ooVar15.f90233a) == null) ? null : expression7.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((ooVar15 == null || (expression6 = ooVar15.f90235c) == null) ? null : expression6.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((ooVar15 == null || (expression5 = ooVar15.f90234b) == null) ? null : expression5.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((ooVar15 == null || (zlVar4 = ooVar15.f90236d) == null || (oaVar4 = zlVar4.f92958a) == null || (expression4 = oaVar4.f90180b) == null) ? null : expression4.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((ooVar15 == null || (zlVar3 = ooVar15.f90236d) == null || (oaVar3 = zlVar3.f92958a) == null || (expression3 = oaVar3.f90179a) == null) ? null : expression3.observe(expressionResolver, function1));
        divLineHeightTextView.addSubscription((ooVar15 == null || (zlVar2 = ooVar15.f90236d) == null || (oaVar2 = zlVar2.f92959b) == null || (expression2 = oaVar2.f90180b) == null) ? null : expression2.observe(expressionResolver, function1));
        if (ooVar15 != null && (zlVar = ooVar15.f90236d) != null && (oaVar = zlVar.f92959b) != null && (expression = oaVar.f90179a) != null) {
            disposableObserve = expression.observe(expressionResolver, function1);
        }
        divLineHeightTextView.addSubscription(disposableObserve);
    }

    private final void bindTightenWidth(final DivLineHeightTextView divLineHeightTextView, us usVar, us usVar2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.f91722c0, usVar2 != null ? usVar2.f91722c0 : null)) {
            return;
        }
        applyTightenWidth(divLineHeightTextView, ((Boolean) usVar.f91722c0.evaluate(expressionResolver)).booleanValue());
        if (ExpressionsKt.isConstant(usVar.f91722c0)) {
            return;
        }
        divLineHeightTextView.addSubscription(usVar.f91722c0.observe(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindTightenWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                DivTextBinder.this.applyTightenWidth(divLineHeightTextView, z10);
            }
        }));
    }

    private final void bindTypeface(DivLineHeightTextView divLineHeightTextView, us usVar, us usVar2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeTypeface(divLineHeightTextView, usVar.f91754t, usVar.f91759y, usVar.f91760z, usVar.f91758x, usVar2 != null ? usVar2.f91754t : null, usVar2 != null ? usVar2.f91759y : null, usVar2 != null ? usVar2.f91760z : null, usVar2 != null ? usVar2.f91758x : null, usVar2, this.typefaceResolver, expressionResolver);
    }

    private final void bindUnderline(final DivLineHeightTextView divLineHeightTextView, us usVar, us usVar2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(usVar.f91738k0, usVar2 != null ? usVar2.f91738k0 : null)) {
            return;
        }
        applyUnderline(divLineHeightTextView, (ei) usVar.f91738k0.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(usVar.f91738k0)) {
            return;
        }
        divLineHeightTextView.addSubscription(usVar.f91738k0.observe(expressionResolver, new Function1<ei, Unit>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindUnderline.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ei eiVar) {
                invoke2(eiVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ei eiVar) {
                DivTextBinder.this.applyUnderline(divLineHeightTextView, eiVar);
            }
        }));
    }

    private final void configureView(BindingContext bindingContext, DivLineHeightTextView view) {
        view.setDrawingPassOverrideStrategy$div_release(bindingContext.getDivView().getViewComponent().getDrawingPassOverrideStrategy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealTextWidth(TextView textView) {
        return Math.min((textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft(), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShadowData getShadowData(oo ooVar, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, int i10) {
        float fDpToPxF = BaseDivViewExtensionsKt.dpToPxF((Number) ooVar.f90234b.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(ooVar.f90236d.f92958a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(ooVar.f90236d.f92959b, displayMetrics, expressionResolver);
        Paint paint = new Paint();
        paint.setColor(((Number) ooVar.f90235c.evaluate(expressionResolver)).intValue());
        paint.setAlpha((int) (((Number) ooVar.f90233a.evaluate(expressionResolver)).doubleValue() * ((double) (i10 >>> 24))));
        return new ShadowData(px, px2, fDpToPxF, paint.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Center toRadialGradientDrawableCenter(fm fmVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (fmVar instanceof fm.c) {
            return new RadialGradientDrawable.Center.Fixed(BaseDivViewExtensionsKt.dpToPxF((Number) ((fm.c) fmVar).c().f89023b.evaluate(expressionResolver), displayMetrics));
        }
        if (fmVar instanceof fm.d) {
            return new RadialGradientDrawable.Center.Relative((float) ((Number) ((fm.d) fmVar).c().f92408a.evaluate(expressionResolver)).doubleValue());
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius(sm smVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        RadialGradientDrawable.Radius.Relative.Type type;
        if (smVar instanceof sm.c) {
            return new RadialGradientDrawable.Radius.Fixed(BaseDivViewExtensionsKt.dpToPxF((Number) ((sm.c) smVar).c().f92339b.evaluate(expressionResolver), displayMetrics));
        }
        if (!(smVar instanceof sm.d)) {
            throw new m();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$2[((cn.c) ((sm.d) smVar).c().f86759a.evaluate(expressionResolver)).ordinal()];
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

    private final void updateFocusableState(View view, us usVar) {
        view.setFocusable(view.isFocusable() || usVar.f91753s != null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivLineHeightTextView divLineHeightTextView, @NotNull BindingContext bindingContext, @NotNull us usVar, @Nullable us usVar2) {
        configureView(bindingContext, divLineHeightTextView);
        BaseDivViewExtensionsKt.applyDivActions(divLineHeightTextView, bindingContext, usVar.f91719b, usVar.f91723d, usVar.J, usVar.f91745o, usVar.D, usVar.C, usVar.P, usVar.O, usVar.f91721c, usVar.f91739l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        bindTypeface(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindTextAlignment(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindFontSize(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindLetterSpacing(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindFontFeatureSettings(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindTextColor(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindUnderline(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindStrikethrough(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindMaxLines(divLineHeightTextView, bindingContext, usVar, usVar2, expressionResolver);
        bindText(divLineHeightTextView, bindingContext, usVar, usVar2);
        bindEllipsis(divLineHeightTextView, bindingContext, usVar, usVar2);
        bindEllipsize(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindTextGradient(divLineHeightTextView, bindingContext.getDivView(), usVar, usVar2, expressionResolver);
        bindTextShadow(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindSelectable(divLineHeightTextView, usVar, usVar2, expressionResolver);
        bindTightenWidth(divLineHeightTextView, usVar, usVar2, expressionResolver);
        updateFocusableState(divLineHeightTextView, usVar);
    }
}
