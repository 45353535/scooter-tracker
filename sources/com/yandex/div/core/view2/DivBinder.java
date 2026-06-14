package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivTreeVisitorKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.f7;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0011\u0018\u00002\u00020\u0001B©\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J'\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0012¢\u0006\u0004\b3\u00104J'\u00106\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000205H\u0012¢\u0006\u0004\b6\u00107J'\u00109\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000208H\u0012¢\u0006\u0004\b9\u0010:J'\u0010<\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020;H\u0012¢\u0006\u0004\b<\u0010=J/\u0010A\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020>2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bA\u0010BJ/\u0010D\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020C2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bD\u0010EJ/\u0010G\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020F2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bG\u0010HJ/\u0010J\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020I2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bJ\u0010KJ/\u0010M\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020L2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bM\u0010NJ/\u0010P\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020O2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bP\u0010QJ/\u0010S\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020R2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bS\u0010TJ'\u0010V\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020UH\u0012¢\u0006\u0004\bV\u0010WJ/\u0010Y\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020X2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bY\u0010ZJ/\u0010\\\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020[2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\b\\\u0010]J/\u0010_\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020^2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\b_\u0010`J/\u0010b\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020a2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bb\u0010cJ/\u0010e\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020d2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\be\u0010fJ'\u0010j\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020g2\u0006\u0010i\u001a\u00020hH\u0012¢\u0006\u0004\bj\u0010kJ/\u0010o\u001a\u0002022\u0006\u0010l\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010n\u001a\u00020m2\u0006\u0010@\u001a\u00020?H\u0017¢\u0006\u0004\bo\u0010pJ\u000f\u0010s\u001a\u000202H\u0011¢\u0006\u0004\bq\u0010rR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010tR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010uR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010vR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010wR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010xR\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010yR\u0014\u0010\u000f\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010zR\u0014\u0010\u0011\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010{R\u0014\u0010\u0013\u001a\u00020\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010|R\u0014\u0010\u0015\u001a\u00020\u00148\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010}R\u0014\u0010\u0017\u001a\u00020\u00168\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010~R\u0014\u0010\u0019\u001a\u00020\u00188\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u007fR\u0015\u0010\u001b\u001a\u00020\u001a8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0080\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0081\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0082\u0001R\u0015\u0010!\u001a\u00020 8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0083\u0001R\u0015\u0010#\u001a\u00020\"8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0084\u0001R\u0015\u0010%\u001a\u00020$8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0085\u0001R\u0015\u0010'\u001a\u00020&8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0086\u0001R\u0015\u0010)\u001a\u00020(8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0087\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/yandex/div/core/view2/DivBinder;", "", "Lcom/yandex/div/core/view2/DivValidator;", "validator", "Lcom/yandex/div/core/view2/divs/DivTextBinder;", "textBinder", "Lcom/yandex/div/core/view2/divs/DivContainerBinder;", "containerBinder", "Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;", "separatorBinder", "Lcom/yandex/div/core/view2/divs/DivImageBinder;", "imageBinder", "Lcom/yandex/div/core/view2/divs/DivGifImageBinder;", "gifImageBinder", "Lcom/yandex/div/core/view2/divs/DivGridBinder;", "gridBinder", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;", "galleryBinder", "Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;", "pagerBinder", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;", "tabsBinder", "Lcom/yandex/div/core/view2/divs/DivStateBinder;", "stateBinder", "Lcom/yandex/div/core/view2/divs/DivCustomBinder;", "customBinder", "Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;", "indicatorBinder", "Lcom/yandex/div/core/view2/divs/DivSliderBinder;", "sliderBinder", "Lcom/yandex/div/core/view2/divs/DivInputBinder;", "inputBinder", "Lcom/yandex/div/core/view2/divs/DivSelectBinder;", "selectBinder", "Lcom/yandex/div/core/view2/divs/DivVideoBinder;", "videoBinder", "Lcom/yandex/div/core/extension/DivExtensionController;", "extensionController", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "pagerIndicatorConnector", "Lcom/yandex/div/core/view2/divs/DivSwitchBinder;", "switchBinder", "<init>", "(Lcom/yandex/div/core/view2/DivValidator;Lcom/yandex/div/core/view2/divs/DivTextBinder;Lcom/yandex/div/core/view2/divs/DivContainerBinder;Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;Lcom/yandex/div/core/view2/divs/DivImageBinder;Lcom/yandex/div/core/view2/divs/DivGifImageBinder;Lcom/yandex/div/core/view2/divs/DivGridBinder;Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;Lcom/yandex/div/core/view2/divs/DivStateBinder;Lcom/yandex/div/core/view2/divs/DivCustomBinder;Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;Lcom/yandex/div/core/view2/divs/DivSliderBinder;Lcom/yandex/div/core/view2/divs/DivInputBinder;Lcom/yandex/div/core/view2/divs/DivSelectBinder;Lcom/yandex/div/core/view2/divs/DivVideoBinder;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;Lcom/yandex/div/core/view2/divs/DivSwitchBinder;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/y0$r;", "data", "", "bindText", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$r;)V", "Lk8/y0$h;", "bindImage", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$h;)V", "Lk8/y0$f;", "bindGifImage", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$f;)V", "Lk8/y0$m;", "bindSeparator", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$m;)V", "Lk8/y0$c;", "Lcom/yandex/div/core/state/DivStatePath;", "path", "bindContainer", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$c;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$g;", "bindGrid", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$g;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$e;", "bindGallery", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$e;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$k;", "bindPager", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$k;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$q;", "bindTabs", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$q;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$o;", "bindState", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$o;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$d;", "bindCustom", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$d;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$i;", "bindIndicator", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$i;)V", "Lk8/y0$n;", "bindSlider", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$n;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$j;", "bindInput", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$j;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$l;", "bindSelect", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$l;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$s;", "bindVideo", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$s;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$p;", "bindSwitch", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0$p;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/f7;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "bindLayoutParams", "(Landroid/view/View;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "parentContext", "Lk8/y0;", "div", "bind", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0;Lcom/yandex/div/core/state/DivStatePath;)V", "attachIndicators$div_release", "()V", "attachIndicators", "Lcom/yandex/div/core/view2/DivValidator;", "Lcom/yandex/div/core/view2/divs/DivTextBinder;", "Lcom/yandex/div/core/view2/divs/DivContainerBinder;", "Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;", "Lcom/yandex/div/core/view2/divs/DivImageBinder;", "Lcom/yandex/div/core/view2/divs/DivGifImageBinder;", "Lcom/yandex/div/core/view2/divs/DivGridBinder;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;", "Lcom/yandex/div/core/view2/divs/DivStateBinder;", "Lcom/yandex/div/core/view2/divs/DivCustomBinder;", "Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;", "Lcom/yandex/div/core/view2/divs/DivSliderBinder;", "Lcom/yandex/div/core/view2/divs/DivInputBinder;", "Lcom/yandex/div/core/view2/divs/DivSelectBinder;", "Lcom/yandex/div/core/view2/divs/DivVideoBinder;", "Lcom/yandex/div/core/extension/DivExtensionController;", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "Lcom/yandex/div/core/view2/divs/DivSwitchBinder;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivBinder {

    @NotNull
    private final DivContainerBinder containerBinder;

    @NotNull
    private final DivCustomBinder customBinder;

    @NotNull
    private final DivExtensionController extensionController;

    @NotNull
    private final DivGalleryBinder galleryBinder;

    @NotNull
    private final DivGifImageBinder gifImageBinder;

    @NotNull
    private final DivGridBinder gridBinder;

    @NotNull
    private final DivImageBinder imageBinder;

    @NotNull
    private final DivIndicatorBinder indicatorBinder;

    @NotNull
    private final DivInputBinder inputBinder;

    @NotNull
    private final DivPagerBinder pagerBinder;

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    @NotNull
    private final DivSelectBinder selectBinder;

    @NotNull
    private final DivSeparatorBinder separatorBinder;

    @NotNull
    private final DivSliderBinder sliderBinder;

    @NotNull
    private final DivStateBinder stateBinder;

    @NotNull
    private final DivSwitchBinder switchBinder;

    @NotNull
    private final DivTabsBinder tabsBinder;

    @NotNull
    private final DivTextBinder textBinder;

    @NotNull
    private final DivValidator validator;

    @NotNull
    private final DivVideoBinder videoBinder;

    public DivBinder(@NotNull DivValidator divValidator, @NotNull DivTextBinder divTextBinder, @NotNull DivContainerBinder divContainerBinder, @NotNull DivSeparatorBinder divSeparatorBinder, @NotNull DivImageBinder divImageBinder, @NotNull DivGifImageBinder divGifImageBinder, @NotNull DivGridBinder divGridBinder, @NotNull DivGalleryBinder divGalleryBinder, @NotNull DivPagerBinder divPagerBinder, @NotNull DivTabsBinder divTabsBinder, @NotNull DivStateBinder divStateBinder, @NotNull DivCustomBinder divCustomBinder, @NotNull DivIndicatorBinder divIndicatorBinder, @NotNull DivSliderBinder divSliderBinder, @NotNull DivInputBinder divInputBinder, @NotNull DivSelectBinder divSelectBinder, @NotNull DivVideoBinder divVideoBinder, @NotNull DivExtensionController divExtensionController, @NotNull PagerIndicatorConnector pagerIndicatorConnector, @NotNull DivSwitchBinder divSwitchBinder) {
        this.validator = divValidator;
        this.textBinder = divTextBinder;
        this.containerBinder = divContainerBinder;
        this.separatorBinder = divSeparatorBinder;
        this.imageBinder = divImageBinder;
        this.gifImageBinder = divGifImageBinder;
        this.gridBinder = divGridBinder;
        this.galleryBinder = divGalleryBinder;
        this.pagerBinder = divPagerBinder;
        this.tabsBinder = divTabsBinder;
        this.stateBinder = divStateBinder;
        this.customBinder = divCustomBinder;
        this.indicatorBinder = divIndicatorBinder;
        this.sliderBinder = divSliderBinder;
        this.inputBinder = divInputBinder;
        this.selectBinder = divSelectBinder;
        this.videoBinder = divVideoBinder;
        this.extensionController = divExtensionController;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.switchBinder = divSwitchBinder;
    }

    private void bindContainer(BindingContext context, View view, y0.c data, DivStatePath path) {
        DivContainerBinder divContainerBinder = this.containerBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        divContainerBinder.bindView(context, (ViewGroup) view, data, path);
    }

    private void bindCustom(BindingContext context, View view, y0.d data, DivStatePath path) {
        DivCustomBinder divCustomBinder = this.customBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCustomWrapper");
        divCustomBinder.bindView(context, (DivCustomWrapper) view, data, path);
    }

    private void bindGallery(BindingContext context, View view, y0.e data, DivStatePath path) {
        DivGalleryBinder divGalleryBinder = this.galleryBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivRecyclerView");
        divGalleryBinder.bindView(context, (DivRecyclerView) view, data, path);
    }

    private void bindGifImage(BindingContext context, View view, y0.f data) {
        DivGifImageBinder divGifImageBinder = this.gifImageBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGifImageView");
        divGifImageBinder.bindView(context, (DivGifImageView) view, data);
    }

    private void bindGrid(BindingContext context, View view, y0.g data, DivStatePath path) {
        DivGridBinder divGridBinder = this.gridBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGridLayout");
        divGridBinder.bindView(context, (DivGridLayout) view, data, path);
    }

    private void bindImage(BindingContext context, View view, y0.h data) {
        DivImageBinder divImageBinder = this.imageBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivImageView");
        divImageBinder.bindView(context, (DivImageView) view, data);
    }

    private void bindIndicator(BindingContext context, View view, y0.i data) {
        DivIndicatorBinder divIndicatorBinder = this.indicatorBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView");
        divIndicatorBinder.bindView(context, (DivPagerIndicatorView) view, data);
    }

    private void bindInput(BindingContext context, View view, y0.j data, DivStatePath path) {
        DivInputBinder divInputBinder = this.inputBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivInputView");
        divInputBinder.bindView(context, (DivInputView) view, data, path);
    }

    private void bindLayoutParams(View view, f7 data, ExpressionResolver resolver) {
        BaseDivViewExtensionsKt.applyMargins(view, data.d(), resolver);
    }

    private void bindPager(BindingContext context, View view, y0.k data, DivStatePath path) {
        DivPagerBinder divPagerBinder = this.pagerBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerView");
        divPagerBinder.bindView(context, (DivPagerView) view, data, path);
    }

    private void bindSelect(BindingContext context, View view, y0.l data, DivStatePath path) {
        DivSelectBinder divSelectBinder = this.selectBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSelectView");
        divSelectBinder.bindView(context, (DivSelectView) view, data, path);
    }

    private void bindSeparator(BindingContext context, View view, y0.m data) {
        DivSeparatorBinder divSeparatorBinder = this.separatorBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSeparatorView");
        divSeparatorBinder.bindView(context, (DivSeparatorView) view, data);
    }

    private void bindSlider(BindingContext context, View view, y0.n data, DivStatePath path) {
        DivSliderBinder divSliderBinder = this.sliderBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSliderView");
        divSliderBinder.bindView(context, (DivSliderView) view, data, path);
    }

    private void bindState(BindingContext context, View view, y0.o data, DivStatePath path) {
        DivStateBinder divStateBinder = this.stateBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivStateLayout");
        divStateBinder.bindView(context, (DivStateLayout) view, data, path);
    }

    private void bindSwitch(BindingContext context, View view, y0.p data, DivStatePath path) {
        DivSwitchBinder divSwitchBinder = this.switchBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSwitchView");
        divSwitchBinder.bindView(context, (DivSwitchView) view, data, path);
    }

    private void bindTabs(BindingContext context, View view, y0.q data, DivStatePath path) {
        DivTabsBinder divTabsBinder = this.tabsBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivTabsLayout");
        divTabsBinder.bindView(context, (DivTabsLayout) view, data, path);
    }

    private void bindText(BindingContext context, View view, y0.r data) {
        DivTextBinder divTextBinder = this.textBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView");
        divTextBinder.bindView(context, (DivLineHeightTextView) view, data);
    }

    private void bindVideo(BindingContext context, View view, y0.s data, DivStatePath path) {
        DivVideoBinder divVideoBinder = this.videoBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivVideoView");
        divVideoBinder.bindView(context, (DivVideoView) view, data, path);
    }

    @MainThread
    public void attachIndicators$div_release() {
        this.pagerIndicatorConnector.attach$div_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    public void bind(@NotNull BindingContext parentContext, @NotNull View view, @NotNull y0 div, @NotNull DivStatePath path) {
        try {
            BindingContext childContext = DivTreeVisitorKt.getChildContext(parentContext, div, path);
            Div2View divView = childContext.getDivView();
            ExpressionResolver expressionResolver = childContext.getExpressionResolver();
            ReusableTokenList currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release == null || currentRebindReusableList$div_release.pop(div) == null) {
                if (!this.validator.validate(div, expressionResolver)) {
                    bindLayoutParams(view, div.c(), expressionResolver);
                    return;
                }
                this.extensionController.beforeBindView(divView, expressionResolver, view, div.c());
                if (!(div instanceof y0.d)) {
                    Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<*>");
                    y0 div2 = ((DivHolderView) view).getDiv();
                    if (div2 != null) {
                        this.extensionController.unbindView(divView, expressionResolver, view, div2.c());
                    }
                }
                if (div instanceof y0.r) {
                    bindText(childContext, view, (y0.r) div);
                } else if (div instanceof y0.h) {
                    bindImage(childContext, view, (y0.h) div);
                } else if (div instanceof y0.f) {
                    bindGifImage(childContext, view, (y0.f) div);
                } else if (div instanceof y0.m) {
                    bindSeparator(childContext, view, (y0.m) div);
                } else if (div instanceof y0.c) {
                    bindContainer(childContext, view, (y0.c) div, path);
                } else if (div instanceof y0.g) {
                    bindGrid(childContext, view, (y0.g) div, path);
                } else if (div instanceof y0.e) {
                    bindGallery(childContext, view, (y0.e) div, path);
                } else if (div instanceof y0.k) {
                    bindPager(childContext, view, (y0.k) div, path);
                } else if (div instanceof y0.q) {
                    bindTabs(childContext, view, (y0.q) div, path);
                } else if (div instanceof y0.o) {
                    bindState(childContext, view, (y0.o) div, path);
                } else if (div instanceof y0.d) {
                    bindCustom(childContext, view, (y0.d) div, path);
                } else if (div instanceof y0.i) {
                    bindIndicator(childContext, view, (y0.i) div);
                } else if (div instanceof y0.n) {
                    bindSlider(childContext, view, (y0.n) div, path);
                } else if (div instanceof y0.j) {
                    bindInput(childContext, view, (y0.j) div, path);
                } else if (div instanceof y0.l) {
                    bindSelect(childContext, view, (y0.l) div, path);
                } else if (div instanceof y0.s) {
                    bindVideo(childContext, view, (y0.s) div, path);
                } else {
                    if (!(div instanceof y0.p)) {
                        throw new m();
                    }
                    bindSwitch(childContext, view, (y0.p) div, path);
                }
                Unit unit = Unit.f93236a;
                if (div instanceof y0.d) {
                    return;
                }
                this.extensionController.bindView(divView, expressionResolver, view, div.c());
            }
        } catch (ParsingException e10) {
            if (!ExpressionFallbacksHelperKt.isExpressionResolveFail(e10)) {
                throw e10;
            }
        }
    }
}
