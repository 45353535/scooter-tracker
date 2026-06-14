package com.yandex.div.core.view2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.y.z.w.s;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKit;
import com.yandex.div.core.DivViewConfig;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.timer.DivTimerEventDispatcher;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.SingleTimeOnAttachCallback;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.logging.bind.BindingEventReporter;
import com.yandex.div.core.view2.logging.bind.BindingEventReporterProvider;
import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.logging.bind.SimpleRebindReporter;
import com.yandex.div.core.view2.logging.patch.PatchEventReporterProvider;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.histogram.Div2ViewHistogramReporter;
import com.yandex.div.histogram.RenderConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber$Listener;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.util.DivDataUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k8.aw;
import k8.ea;
import k8.j1;
import k8.y0;
import k8.zv;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Þ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0099\u0003B/\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB'\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ%\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0012¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0012H\u0012¢\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0012¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0012¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0012H\u0012¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0012H\u0012¢\u0006\u0004\b&\u0010\u0018J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u001dH\u0012¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0012¢\u0006\u0004\b*\u0010\u0018J\u000f\u0010+\u001a\u00020\u0012H\u0012¢\u0006\u0004\b+\u0010\u0018J)\u0010.\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0012¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\t*\u00020\u000eH\u0012¢\u0006\u0004\b0\u00101J\u0015\u0010!\u001a\u0004\u0018\u00010 *\u00020\u000eH\u0012¢\u0006\u0004\b!\u00102J\u001f\u00104\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\t2\u0006\u00103\u001a\u00020\u001dH\u0012¢\u0006\u0004\b4\u00105JK\u0010=\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010-\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u00108\u001a\u00020 2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001dH\u0012¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u0002092\u0006\u00100\u001a\u00020\t2\u0006\u00103\u001a\u00020\u001dH\u0012¢\u0006\u0004\b?\u0010@J)\u0010B\u001a\u0002092\u0006\u00108\u001a\u00020 2\u0006\u00100\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u001dH\u0012¢\u0006\u0004\bB\u0010CJ)\u0010D\u001a\u0002092\u0006\u00108\u001a\u00020 2\u0006\u00100\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u001dH\u0012¢\u0006\u0004\bD\u0010CJ7\u0010G\u001a\u0004\u0018\u00010F2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010-\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u0001062\b\u0010E\u001a\u0004\u0018\u000106H\u0012¢\u0006\u0004\bG\u0010HJ/\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M2\b\u0010I\u001a\u0004\u0018\u00010\u000e2\u0006\u0010J\u001a\u0002062\u0006\u0010L\u001a\u00020KH\u0012¢\u0006\u0004\bO\u0010PJ'\u0010S\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020RH\u0012¢\u0006\u0004\bS\u0010TJ'\u0010V\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020UH\u0012¢\u0006\u0004\bV\u0010WJ!\u0010X\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bX\u0010YJ+\u0010X\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010Z\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\bX\u0010[J\u000f\u0010\\\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\\\u0010\u0018J\u000f\u0010]\u001a\u00020\u0012H\u0016¢\u0006\u0004\b]\u0010\u0018J\u000f\u0010^\u001a\u00020\u0012H\u0016¢\u0006\u0004\b^\u0010\u0018J\u000f\u0010b\u001a\u00020_H\u0010¢\u0006\u0004\b`\u0010aJ\u0017\u0010e\u001a\u00020\u001d2\u0006\u0010d\u001a\u00020cH\u0017¢\u0006\u0004\be\u0010fJ7\u0010l\u001a\u00020\u00122\u0006\u0010g\u001a\u00020\u001d2\u0006\u0010h\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00072\u0006\u0010j\u001a\u00020\u00072\u0006\u0010k\u001a\u00020\u0007H\u0014¢\u0006\u0004\bl\u0010mJ\u001f\u0010p\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u0007H\u0014¢\u0006\u0004\bp\u0010qJ\u0017\u0010t\u001a\u00020\u00122\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\u0012H\u0014¢\u0006\u0004\bv\u0010\u0018J\u000f\u0010w\u001a\u00020\u0012H\u0014¢\u0006\u0004\bw\u0010\u0018J\u001f\u0010{\u001a\u00020\u00122\u0006\u0010y\u001a\u00020x2\u0006\u0010z\u001a\u000209H\u0016¢\u0006\u0004\b{\u0010|J\u000f\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0018J\u001f\u0010}\u001a\u00020\u00122\u0006\u00100\u001a\u00020\t2\u0006\u00103\u001a\u00020\u001dH\u0016¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u007f\u0010\u0018J\"\u0010}\u001a\u00020\u00122\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u00103\u001a\u00020\u001dH\u0016¢\u0006\u0005\b}\u0010\u0082\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u00122\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0010¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0089\u0001\u001a\u00020\u00122\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0010¢\u0006\u0006\b\u0088\u0001\u0010\u0086\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u008a\u0001\u0010\u0018J\u0014\u0010\u008d\u0001\u001a\u0004\u0018\u000106H\u0010¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J2\u0010\u0092\u0001\u001a\u00020\u00122\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\n\b\u0002\u0010\u0091\u0001\u001a\u00030\u0090\u00012\b\b\u0002\u0010L\u001a\u00020KH\u0017¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J2\u0010\u0094\u0001\u001a\u00020\u001d2\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\n\b\u0002\u0010\u0091\u0001\u001a\u00030\u0090\u00012\b\b\u0002\u0010L\u001a\u00020KH\u0017¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001c\u0010\u0098\u0001\u001a\u00020\u00122\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0013\u0010\u009a\u0001\u001a\u00030\u0096\u0001H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0012\u0010\u009c\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010 \u0001\u001a\u00020\u00122\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0016¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0011\u0010¢\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¢\u0001\u0010\u0018J\u0012\u0010£\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0015\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0012\u0010¨\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0012\u0010ª\u0001\u001a\u00020KH\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001c\u0010\u00ad\u0001\u001a\u00020\u00122\b\u0010¬\u0001\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J%\u0010\u00ad\u0001\u001a\u00020\u00122\b\u0010¬\u0001\u001a\u00030\u0090\u00012\u0007\u0010¯\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0006\b\u00ad\u0001\u0010°\u0001J\u001c\u0010±\u0001\u001a\u00020\u00122\b\u0010¬\u0001\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\b±\u0001\u0010®\u0001J\u0011\u0010²\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b²\u0001\u0010\u0018J\u0019\u0010³\u0001\u001a\u00020\u00122\u0006\u0010s\u001a\u00020rH\u0014¢\u0006\u0005\b³\u0001\u0010uJ.\u0010¶\u0001\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020r2\t\u0010´\u0001\u001a\u0004\u0018\u0001092\u0007\u0010µ\u0001\u001a\u00020\tH\u0014¢\u0006\u0006\b¶\u0001\u0010·\u0001J#\u0010»\u0001\u001a\u00020\u00122\u0007\u0010¸\u0001\u001a\u0002092\u0006\u0010J\u001a\u000206H\u0010¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001d\u0010¾\u0001\u001a\u0004\u0018\u0001062\u0007\u0010¸\u0001\u001a\u000209H\u0010¢\u0006\u0006\b¼\u0001\u0010½\u0001J)\u0010Â\u0001\u001a\u0005\u0018\u00010Á\u00012\b\u0010¿\u0001\u001a\u00030\u0090\u00012\b\u0010À\u0001\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J&\u0010Æ\u0001\u001a\u00020\u00122\b\u0010Ä\u0001\u001a\u00030\u0090\u00012\b\u0010Å\u0001\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J1\u0010Ê\u0001\u001a\u00020\u001d2\b\u0010È\u0001\u001a\u00030\u0090\u00012\b\u0010Å\u0001\u001a\u00030\u0090\u00012\t\b\u0002\u0010É\u0001\u001a\u00020KH\u0017¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001d\u0010Í\u0001\u001a\u0004\u0018\u0001062\u0007\u0010¸\u0001\u001a\u000209H\u0010¢\u0006\u0006\bÌ\u0001\u0010½\u0001J\u001b\u0010Î\u0001\u001a\u0004\u0018\u00010 2\u0006\u0010I\u001a\u00020\u000eH\u0016¢\u0006\u0005\bÎ\u0001\u00102J\"\u0010Ó\u0001\u001a\u00020\u00122\u000e\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120Ï\u0001H\u0010¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001R\u001d\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010\n\u001a\u00020\t8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\n\u0010×\u0001R \u0010Ù\u0001\u001a\u00030Ø\u00018\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R \u0010Þ\u0001\u001a\u00030Ý\u00018\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u0017\u0010â\u0001\u001a\u00020\u001d8\u0012X\u0092\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0017\u0010ä\u0001\u001a\u00020\u001d8\u0012X\u0092\u0004¢\u0006\b\n\u0006\bä\u0001\u0010ã\u0001R\u0018\u0010æ\u0001\u001a\u00030å\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010é\u0001\u001a\u00030è\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ì\u0001\u001a\u00030ë\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0018\u0010ï\u0001\u001a\u00030î\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u001e\u0010ò\u0001\u001a\t\u0012\u0004\u0012\u00020x0ñ\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u001f\u0010ô\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010ñ\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bô\u0001\u0010ó\u0001R\u001f\u0010ö\u0001\u001a\n\u0012\u0005\u0012\u00030õ\u00010ñ\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bö\u0001\u0010ó\u0001R\u001f\u0010ø\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010÷\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R$\u0010û\u0001\u001a\u000f\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u0002060ú\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R\u001c\u0010þ\u0001\u001a\u00070ý\u0001R\u00020\u00008\u0012X\u0092\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u001c\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R*\u0010\u0083\u0002\u001a\u00030\u0080\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010\u0082\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R(\u0010\u0088\u0002\u001a\u00020\u001d8\u0010@\u0010X\u0090\u000e¢\u0006\u0017\n\u0006\b\u0088\u0002\u0010ã\u0001\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0005\b\u008b\u0002\u0010)R*\u0010\u008d\u0002\u001a\u00030\u008c\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R,\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u0093\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002\"\u0006\b\u0098\u0002\u0010\u0099\u0002R/\u0010\u009a\u0002\u001a\u00020\u001d8\u0010@\u0010X\u0091\u000e¢\u0006\u001e\n\u0006\b\u009a\u0002\u0010ã\u0001\u0012\u0005\b\u009d\u0002\u0010\u0018\u001a\u0006\b\u009b\u0002\u0010\u008a\u0002\"\u0005\b\u009c\u0002\u0010)R\u0018\u0010\u009e\u0002\u001a\u00030õ\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R3\u0010¡\u0002\u001a\u0005\u0018\u00010 \u00028\u0010@\u0010X\u0091\u000e¢\u0006\u001f\n\u0006\b¡\u0002\u0010¢\u0002\u0012\u0005\b§\u0002\u0010\u0018\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R\u001c\u0010¨\u0002\u001a\u0005\u0018\u00010 \u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010¢\u0002R\u001c\u0010©\u0002\u001a\u0005\u0018\u00010 \u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b©\u0002\u0010¢\u0002R.\u00100\u001a\u00020\t8\u0010@\u0010X\u0091\u000e¢\u0006\u001e\n\u0005\b0\u0010×\u0001\u0012\u0005\b\u00ad\u0002\u0010\u0018\u001a\u0006\bª\u0002\u0010¤\u0001\"\u0006\b«\u0002\u0010¬\u0002R$\u0010¯\u0002\u001a\r ®\u0002*\u0005\u0018\u00010\u0096\u00010\u0096\u00018\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u001c\u0010²\u0002\u001a\u0005\u0018\u00010±\u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R)\u0010µ\u0002\u001a\u0014\u0012\u000f\u0012\r ®\u0002*\u0005\u0018\u00010´\u00020´\u00020Ï\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R!\u0010¼\u0002\u001a\u00030·\u00028RX\u0092\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0002\u0010¹\u0002\u001a\u0006\bº\u0002\u0010»\u0002R\u0018\u0010¾\u0002\u001a\u00030½\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R \u0010Á\u0002\u001a\u00030À\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bÁ\u0002\u0010Â\u0002\u001a\u0006\bÃ\u0002\u0010Ä\u0002R:\u0010Æ\u0002\u001a\u001d\u0012\u0004\u0012\u00020K\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\u00070Å\u00020Å\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bÆ\u0002\u0010Ç\u0002\u001a\u0006\bÈ\u0002\u0010É\u0002R-\u0010Ë\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0005\u0012\u00030Ê\u00020Å\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bË\u0002\u0010Ç\u0002\u001a\u0006\bÌ\u0002\u0010É\u0002R,\u0010Î\u0002\u001a\u0005\u0018\u00010Í\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\bÎ\u0002\u0010Ï\u0002\u001a\u0006\bÐ\u0002\u0010Ñ\u0002\"\u0006\bÒ\u0002\u0010Ó\u0002R2\u0010Ô\u0002\u001a\u00020\u00102\u0007\u0010À\u0001\u001a\u00020\u00108\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\bÔ\u0002\u0010Õ\u0002\u001a\u0006\bÖ\u0002\u0010\u009d\u0001\"\u0006\b×\u0002\u0010Ø\u0002R2\u0010Ú\u0002\u001a\u00020\u00102\u0007\u0010Ù\u0002\u001a\u00020\u00108\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\bÚ\u0002\u0010Õ\u0002\u001a\u0006\bÛ\u0002\u0010\u009d\u0001\"\u0006\bÜ\u0002\u0010Ø\u0002R3\u0010I\u001a\u0004\u0018\u00010\u000e2\t\u0010À\u0001\u001a\u0004\u0018\u00010\u000e8\u0016@PX\u0096\u000e¢\u0006\u0016\n\u0005\bI\u0010Ý\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002\"\u0005\bà\u0002\u0010\u0016R,\u0010â\u0002\u001a\u0005\u0018\u00010á\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bâ\u0002\u0010ã\u0002\u001a\u0006\bä\u0002\u0010å\u0002\"\u0006\bæ\u0002\u0010ç\u0002R\u0019\u0010è\u0002\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bè\u0002\u0010×\u0001R\u001f\u0010é\u0002\u001a\u00030\u0090\u00018\u0012X\u0093\u0004¢\u0006\u000f\n\u0006\bé\u0002\u0010ê\u0002\u0012\u0005\bë\u0002\u0010\u0018R\u0019\u0010ì\u0002\u001a\u00020\u001d8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bì\u0002\u0010ã\u0001R \u0010î\u0002\u001a\u00030í\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bî\u0002\u0010ï\u0002\u001a\u0006\bð\u0002\u0010ñ\u0002R\u0018\u0010õ\u0002\u001a\u00030ò\u00028RX\u0092\u0004¢\u0006\b\u001a\u0006\bó\u0002\u0010ô\u0002R\u0018\u0010ù\u0002\u001a\u00030ö\u00028RX\u0092\u0004¢\u0006\b\u001a\u0006\b÷\u0002\u0010ø\u0002R\u001d\u0010L\u001a\u00020K*\u0005\u0018\u00010\u0080\u00028RX\u0092\u0004¢\u0006\b\u001a\u0006\bú\u0002\u0010û\u0002R\u001c\u0010Î\u0001\u001a\u0004\u0018\u00010 *\u00020\u000e8RX\u0092\u0004¢\u0006\u0007\u001a\u0005\bü\u0002\u00102R\u0018\u0010\u0080\u0003\u001a\u00030ý\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010ÿ\u0002R\u0018\u0010\u0084\u0003\u001a\u00030\u0081\u00038PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0082\u0003\u0010\u0083\u0003R\u0017\u0010\u0086\u0003\u001a\u00020K8PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0085\u0003\u0010«\u0001R\u001a\u0010\u008a\u0003\u001a\u0005\u0018\u00010\u0087\u00038PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0088\u0003\u0010\u0089\u0003R\u0017\u0010\u008c\u0003\u001a\u00020\u001d8PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u008b\u0003\u0010\u008a\u0002R\u0018\u0010\u008f\u0003\u001a\u00030\u0090\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0003\u0010\u008e\u0003R0\u0010\u0092\u0003\u001a\u0005\u0018\u00010\u0090\u00012\n\u0010À\u0001\u001a\u0005\u0018\u00010\u0090\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0003\u0010\u008e\u0003\"\u0006\b\u0091\u0003\u0010®\u0001R\u0018\u0010\u0095\u0003\u001a\u00030\u0080\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0093\u0003\u0010\u0094\u0003R)\u0010\u0098\u0003\u001a\u00020\u001d2\u0007\u0010À\u0001\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0096\u0003\u0010\u008a\u0002\"\u0005\b\u0097\u0003\u0010)¨\u0006\u009a\u0003"}, d2 = {"Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/DivViewFacade;", "Lcom/yandex/div/core/Div2Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "constructorCallTime", "<init>", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;IJ)V", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;I)V", "Lk8/ea;", "data", "Lcom/yandex/div/DivDataTag;", s.z.f67720z, "", "updateRuntimeStore", "(Lk8/ea;Lcom/yandex/div/DivDataTag;)V", "tryAttachVariableTriggers", "(Lk8/ea;)V", "updateTimers", "()V", "notifyBindStarted", "notifyBindEnded", "Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;", "reporter", "", "updateNow", "(Lk8/ea;Lcom/yandex/div/DivDataTag;Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;)Z", "Lk8/ea$c;", "state", "trackStateVisibility", "(Lk8/ea$c;)V", "discardStateVisibility", "discardChildrenVisibility", "sendCreationHistograms", "removeChildren", "cleanup", "(Z)V", "stopLoadAndSubscriptions", "cancelImageLoads", "oldData", "newData", "switchToDivData", "(Lk8/ea;Lk8/ea;Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;)Z", "stateId", "(Lk8/ea;)J", "(Lk8/ea;)Lk8/ea$c;", "temporary", "forceSwitchToState", "(JZ)Z", "Lk8/y0;", "oldDiv", "newState", "Landroid/view/View;", "newStateView", "allowsTransition", "bindBeforeViewAdded", "addNewStateViewWithTransition", "(Lk8/ea;Lk8/ea;Lk8/y0;Lk8/ea$c;Landroid/view/View;ZZ)V", "updateState", "(JZ)Landroid/view/View;", "isUpdateTemporary", "buildViewAndUpdateState", "(Lk8/ea$c;JZ)Landroid/view/View;", "buildViewAsyncAndUpdateState", "newDiv", "Landroidx/transition/Transition;", "prepareTransition", "(Lk8/ea;Lk8/ea;Lk8/y0;Lk8/y0;)Landroidx/transition/Transition;", "divData", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lkotlin/sequences/Sequence;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "itemSequenceForTransition", "(Lk8/ea;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lkotlin/sequences/Sequence;", "isAutoanimations", "Lcom/yandex/div/core/view2/logging/bind/SimpleRebindReporter;", "rebind", "(Lk8/ea;ZLcom/yandex/div/core/view2/logging/bind/SimpleRebindReporter;)V", "Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;", "complexRebind", "(Lk8/ea;Lk8/ea;Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;)Z", "setData", "(Lk8/ea;Lcom/yandex/div/DivDataTag;)Z", "oldDivData", "(Lk8/ea;Lk8/ea;Lcom/yandex/div/DivDataTag;)Z", "tryLogVisibility", "discardVisibilityTracking", "trackChildrenVisibility", "Lcom/yandex/div/core/DivCustomContainerChildFactory;", "getCustomContainerChildFactory$div_release", "()Lcom/yandex/div/core/DivCustomContainerChildFactory;", "getCustomContainerChildFactory", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/yandex/div/core/images/LoadReference;", "loadReference", "targetView", "addLoadReference", "(Lcom/yandex/div/core/images/LoadReference;Landroid/view/View;)V", "switchToState", "(JZ)V", "switchToInitialState", "Lcom/yandex/div/core/state/DivStatePath;", "path", "(Lcom/yandex/div/core/state/DivStatePath;Z)V", "Lcom/yandex/div/core/downloader/PersistentDivDataObserver;", "observer", "addPersistentDivDataObserver$div_release", "(Lcom/yandex/div/core/downloader/PersistentDivDataObserver;)V", "addPersistentDivDataObserver", "removePersistentDivDataObserver$div_release", "removePersistentDivDataObserver", "resetToInitialState", "rootDiv$div_release", "()Lk8/y0;", "rootDiv", "Lk8/j1;", "action", "", "reason", "handleAction", "(Lk8/j1;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "handleActionWithResult", "(Lk8/j1;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lcom/yandex/div/core/DivViewConfig;", "viewConfig", "setConfig", "(Lcom/yandex/div/core/DivViewConfig;)V", "getConfig", "()Lcom/yandex/div/core/DivViewConfig;", "getDivTag", "()Lcom/yandex/div/DivDataTag;", "Lcom/yandex/div/internal/widget/menu/OverflowMenuSubscriber$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "subscribe", "(Lcom/yandex/div/internal/widget/menu/OverflowMenuSubscriber$Listener;)V", "clearSubscriptions", "getCurrentStateId", "()J", "Lcom/yandex/div/core/state/DivViewState;", "getCurrentState", "()Lcom/yandex/div/core/state/DivViewState;", "getView", "()Lcom/yandex/div/core/view2/Div2View;", "getExpressionResolver", "()Lcom/yandex/div/json/expressions/ExpressionResolver;", "tooltipId", "showTooltip", "(Ljava/lang/String;)V", "multiple", "(Ljava/lang/String;Z)V", "hideTooltip", "cancelTooltips", "dispatchDraw", "child", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "bindViewToDiv$div_release", "(Landroid/view/View;Lk8/y0;)V", "bindViewToDiv", "takeBindingDiv$div_release", "(Landroid/view/View;)Lk8/y0;", "takeBindingDiv", "name", "value", "Lcom/yandex/div/data/VariableMutationException;", "setVariable", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/data/VariableMutationException;", "id", f.b.f45113g, "applyTimerCommand", "(Ljava/lang/String;Ljava/lang/String;)V", "divId", "expressionResolver", "applyVideoCommand", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "unbindViewFromDiv$div_release", "unbindViewFromDiv", "stateToBind", "Lkotlin/Function0;", "function", "bulkActions$div_release", "(Lkotlin/jvm/functions/Function0;)V", "bulkActions", "Lcom/yandex/div/core/Div2Context;", "getContext$div_release", "()Lcom/yandex/div/core/Div2Context;", "J", "Lcom/yandex/div/core/dagger/Div2Component;", "div2Component", "Lcom/yandex/div/core/dagger/Div2Component;", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/Div2Component;", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "viewComponent", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "getViewComponent$div_release", "()Lcom/yandex/div/core/dagger/Div2ViewComponent;", "bindOnAttachEnabled", "Z", "complexRebindEnabled", "Lcom/yandex/div/core/view2/ViewBindingProvider;", "bindingProvider", "Lcom/yandex/div/core/view2/ViewBindingProvider;", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporterProvider;", "bindingReporterProvider", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporterProvider;", "Lcom/yandex/div/core/view2/logging/patch/PatchEventReporterProvider;", "patchReporterProvider", "Lcom/yandex/div/core/view2/logging/patch/PatchEventReporterProvider;", "Lcom/yandex/div/core/view2/Div2Builder;", "divBuilder", "Lcom/yandex/div/core/view2/Div2Builder;", "", "loadReferences", "Ljava/util/List;", "overflowMenuListeners", "", "divDataChangedObservers", "Lcom/yandex/div/core/ObserverList;", "persistentDivDataObservers", "Lcom/yandex/div/core/ObserverList;", "Ljava/util/WeakHashMap;", "viewToDivBindings", "Ljava/util/WeakHashMap;", "Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "bulkActionsHandler", "Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "oldRuntimeStore", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "runtimeStore", "getRuntimeStore$div_release", "()Lcom/yandex/div/core/expression/local/RuntimeStore;", "setRuntimeStore$div_release", "(Lcom/yandex/div/core/expression/local/RuntimeStore;)V", "inMiddleOfBind", "getInMiddleOfBind$div_release", "()Z", "setInMiddleOfBind$div_release", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext$div_release", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext$div_release", "(Lcom/yandex/div/core/view2/BindingContext;)V", "Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "divTimerEventDispatcher", "Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "getDivTimerEventDispatcher$div_release", "()Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "setDivTimerEventDispatcher$div_release", "(Lcom/yandex/div/core/timer/DivTimerEventDispatcher;)V", "forceCanvasClipping", "getForceCanvasClipping", "setForceCanvasClipping", "getForceCanvasClipping$annotations", "monitor", "Ljava/lang/Object;", "Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "bindOnAttachRunnable", "Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "getBindOnAttachRunnable$div_release", "()Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "setBindOnAttachRunnable$div_release", "(Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;)V", "getBindOnAttachRunnable$div_release$annotations", "reportBindingResumedRunnable", "reportBindingFinishedRunnable", "getStateId$div_release", "setStateId$div_release", "(J)V", "getStateId$div_release$annotations", "kotlin.jvm.PlatformType", "config", "Lcom/yandex/div/core/DivViewConfig;", "Lcom/yandex/div/core/view2/reuse/RebindTask;", "rebindTask", "Lcom/yandex/div/core/view2/reuse/RebindTask;", "Lcom/yandex/div/histogram/RenderConfiguration;", "renderConfig", "Lkotlin/jvm/functions/Function0;", "Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "histogramReporter$delegate", "Lkotlin/Lazy;", "getHistogramReporter", "()Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "histogramReporter", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "inputFocusTracker", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "getInputFocusTracker$div_release", "()Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "", "layoutSizes", "Ljava/util/Map;", "getLayoutSizes$div_release", "()Ljava/util/Map;", "Lcom/yandex/div/core/view2/divs/DivLayoutProviderVariablesHolder;", "variablesHolders", "getVariablesHolders$div_release", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "clearVariablesListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getClearVariablesListener$div_release", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setClearVariablesListener$div_release", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "dataTag", "Lcom/yandex/div/DivDataTag;", "getDataTag", "setDataTag$div_release", "(Lcom/yandex/div/DivDataTag;)V", "<set-?>", "prevDataTag", "getPrevDataTag", "setPrevDataTag$div_release", "Lk8/ea;", "getDivData", "()Lk8/ea;", "setDivData$div_release", "Lcom/yandex/div/core/DivActionHandler;", "actionHandler", "Lcom/yandex/div/core/DivActionHandler;", "getActionHandler", "()Lcom/yandex/div/core/DivActionHandler;", "setActionHandler", "(Lcom/yandex/div/core/DivActionHandler;)V", "timeCreated", "viewCreateCallType", "Ljava/lang/String;", "getViewCreateCallType$annotations", "drawWasSkipped", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "divTransitionHandler", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "getDivTransitionHandler$div_release", "()Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "Lcom/yandex/div/core/player/DivVideoActionHandler;", "getDivVideoActionHandler", "()Lcom/yandex/div/core/player/DivVideoActionHandler;", "divVideoActionHandler", "Lcom/yandex/div/core/tooltip/DivTooltipController;", "getTooltipController", "()Lcom/yandex/div/core/tooltip/DivTooltipController;", "tooltipController", "getResolver", "(Lcom/yandex/div/core/expression/local/RuntimeStore;)Lcom/yandex/div/json/expressions/ExpressionResolver;", "getStateToBind", "Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "getReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "releaseViewVisitor", "Lcom/yandex/div/core/view2/divs/widgets/MediaReleaseViewVisitor;", "getMediaReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/MediaReleaseViewVisitor;", "mediaReleaseViewVisitor", "getOldExpressionResolver$div_release", "oldExpressionResolver", "Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "getCurrentRebindReusableList$div_release", "()Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "currentRebindReusableList", "getComplexRebindInProgress$div_release", "complexRebindInProgress", "getLogId", "()Ljava/lang/String;", "logId", "getComponentName", "setComponentName", "componentName", "getCurrentRootPath$div_release", "()Lcom/yandex/div/core/state/DivStatePath;", "currentRootPath", "getVisualErrorsEnabled", "setVisualErrorsEnabled", "visualErrorsEnabled", "BulkActionHandler", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public class Div2View extends FrameContainerLayout implements DivViewFacade {

    @Nullable
    private DivActionHandler actionHandler;
    private final boolean bindOnAttachEnabled;

    @Nullable
    private SingleTimeOnAttachCallback bindOnAttachRunnable;

    @NotNull
    private BindingContext bindingContext;

    @NotNull
    private final ViewBindingProvider bindingProvider;

    @NotNull
    private final BindingEventReporterProvider bindingReporterProvider;

    @NotNull
    private final BulkActionHandler bulkActionsHandler;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener clearVariablesListener;
    private final boolean complexRebindEnabled;
    private DivViewConfig config;
    private final long constructorCallTime;

    @NotNull
    private final Div2Context context;

    @NotNull
    private DivDataTag dataTag;

    @NotNull
    private final Div2Component div2Component;

    @NotNull
    private final Div2Builder divBuilder;

    @Nullable
    private ea divData;

    @NotNull
    private final List<Object> divDataChangedObservers;

    @Nullable
    private DivTimerEventDispatcher divTimerEventDispatcher;

    @NotNull
    private final DivTransitionHandler divTransitionHandler;
    private boolean drawWasSkipped;
    private boolean forceCanvasClipping;

    @NotNull
    private final GestureDetector gestureDetector;

    /* JADX INFO: renamed from: histogramReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy histogramReporter;
    private boolean inMiddleOfBind;

    @NotNull
    private final InputFocusTracker inputFocusTracker;

    @NotNull
    private final Map<ExpressionResolver, Map<String, Integer>> layoutSizes;

    @NotNull
    private final List<LoadReference> loadReferences;

    @NotNull
    private final Object monitor;

    @Nullable
    private RuntimeStore oldRuntimeStore;

    @NotNull
    private final List<OverflowMenuSubscriber$Listener> overflowMenuListeners;

    @NotNull
    private final PatchEventReporterProvider patchReporterProvider;

    @NotNull
    private final ObserverList<PersistentDivDataObserver> persistentDivDataObservers;

    @NotNull
    private DivDataTag prevDataTag;

    @Nullable
    private RebindTask rebindTask;

    @NotNull
    private final Function0<RenderConfiguration> renderConfig;

    @Nullable
    private SingleTimeOnAttachCallback reportBindingFinishedRunnable;

    @Nullable
    private SingleTimeOnAttachCallback reportBindingResumedRunnable;

    @NotNull
    private RuntimeStore runtimeStore;
    private long stateId;
    private long timeCreated;

    @NotNull
    private final Map<ea, DivLayoutProviderVariablesHolder> variablesHolders;

    @NotNull
    private final Div2ViewComponent viewComponent;

    @NotNull
    private final String viewCreateCallType;

    @NotNull
    private final WeakHashMap<View, y0> viewToDivBindings;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0006R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "", "<init>", "(Lcom/yandex/div/core/view2/Div2View;)V", "", "reset", "()V", "Lkotlin/Function0;", "function", "bulkActions", "(Lkotlin/jvm/functions/Function0;)V", "Lk8/ea$c;", "state", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "temporary", "switchState", "(Lk8/ea$c;Lcom/yandex/div/core/state/DivStatePath;Z)V", "", "paths", "switchMultipleStates", "(Lk8/ea$c;Ljava/util/List;Z)V", "runBulkActions", "", "bulkModeDepth", "I", "pendingState", "Lk8/ea$c;", "isPendingStateTemporary", "Z", "", "pendingPaths", "Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class BulkActionHandler {
        private int bulkModeDepth;
        private boolean isPendingStateTemporary = true;

        @NotNull
        private final List<DivStatePath> pendingPaths = new ArrayList();

        @Nullable
        private ea.c pendingState;

        public BulkActionHandler() {
        }

        private final void reset() {
            this.pendingState = null;
            this.isPendingStateTemporary = true;
            this.pendingPaths.clear();
        }

        public final void bulkActions(@NotNull Function0<Unit> function) {
            this.bulkModeDepth++;
            function.invoke();
            int i10 = this.bulkModeDepth - 1;
            this.bulkModeDepth = i10;
            if (i10 == 0) {
                runBulkActions();
            }
        }

        public final void runBulkActions() {
            ea.c cVar = this.pendingState;
            if (cVar == null) {
                return;
            }
            if (cVar.f87216b != Div2View.this.getStateId()) {
                Div2View.this.switchToState(cVar.f87216b, this.isPendingStateTemporary);
            } else if (Div2View.this.getChildCount() > 0) {
                try {
                    Div2View.this.getViewComponent().getStateSwitcher().switchStates(cVar, CollectionsKt.immutableCopy(this.pendingPaths), Div2View.this.getExpressionResolver());
                } catch (StateConflictException e10) {
                    DivActionTypedUtilsKt.logError(Div2View.this, e10);
                    Div2View.this.resetToInitialState();
                }
            }
            reset();
        }

        public final void switchMultipleStates(@Nullable ea.c state, @NotNull List<DivStatePath> paths, boolean temporary) {
            ea.c cVar = this.pendingState;
            if (cVar != null && !Intrinsics.areEqual(state, cVar)) {
                reset();
            }
            this.pendingState = state;
            this.isPendingStateTemporary = this.isPendingStateTemporary && temporary;
            List<DivStatePath> list = paths;
            kotlin.collections.CollectionsKt.addAll(this.pendingPaths, list);
            Div2View div2View = Div2View.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                div2View.getDiv2Component().getStateManager().updateStates(div2View.getDivTag().getId(), (DivStatePath) it.next(), temporary);
            }
            if (this.bulkModeDepth == 0) {
                runBulkActions();
            }
        }

        public final void switchState(@Nullable ea.c state, @NotNull DivStatePath path, boolean temporary) {
            switchMultipleStates(state, kotlin.collections.CollectionsKt.listOf(path), temporary);
        }
    }

    private Div2View(Div2Context div2Context, AttributeSet attributeSet, int i10, long j10) {
        super(div2Context, attributeSet, i10);
        this.context = div2Context;
        this.constructorCallTime = j10;
        this.div2Component = getContext().getDiv2Component();
        this.viewComponent = getDiv2Component().viewComponent().divView(this).build();
        this.bindOnAttachEnabled = getDiv2Component().isBindOnAttachEnabled();
        this.complexRebindEnabled = getDiv2Component().isComplexRebindEnabled();
        this.bindingProvider = getViewComponent().getBindingProvider();
        this.bindingReporterProvider = new BindingEventReporterProvider(this);
        this.patchReporterProvider = new PatchEventReporterProvider(this);
        this.divBuilder = getContext().getDiv2Component().getDiv2Builder();
        this.loadReferences = new ArrayList();
        this.overflowMenuListeners = new ArrayList();
        this.divDataChangedObservers = new ArrayList();
        this.persistentDivDataObservers = new ObserverList<>();
        this.viewToDivBindings = new WeakHashMap<>();
        this.bulkActionsHandler = new BulkActionHandler();
        this.runtimeStore = RuntimeStore.INSTANCE.getEMPTY();
        this.bindingContext = new BindingContext(this, ExpressionResolver.EMPTY);
        this.monitor = new Object();
        this.stateId = DivDataUtilsKt.getINVALID_STATE_ID(ea.f87200j);
        this.config = DivViewConfig.DEFAULT;
        this.renderConfig = new Function0<RenderConfiguration>() { // from class: com.yandex.div.core.view2.Div2View$renderConfig$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RenderConfiguration invoke() {
                return (RenderConfiguration) DivKit.INSTANCE.getInstance(this.this$0.getContext()).getComponent().getHistogramRecordConfiguration().getRenderConfiguration().get();
            }
        };
        this.histogramReporter = i.b(l.f94211d, new Function0<Div2ViewHistogramReporter>() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Div2ViewHistogramReporter invoke() {
                final Div2View div2View = this.this$0;
                return new Div2ViewHistogramReporter(new Function0<HistogramReporter>() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final HistogramReporter invoke() {
                        return div2View.getDiv2Component().getHistogramReporter();
                    }
                }, this.this$0.renderConfig);
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.div.core.view2.Div2View$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(@NotNull MotionEvent e10) {
                Div2View div2View = this.this$0;
                BaseDivViewExtensionsKt.clearFocusOnClick(div2View, div2View.getInputFocusTracker());
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        this.inputFocusTracker = getViewComponent().getInputFocusTracker();
        this.layoutSizes = new LinkedHashMap();
        this.variablesHolders = new LinkedHashMap();
        DivDataTag divDataTag = DivDataTag.INVALID;
        this.dataTag = divDataTag;
        this.prevDataTag = divDataTag;
        this.timeCreated = -1L;
        this.viewCreateCallType = getDiv2Component().getDivCreationTracker().getViewCreateCallType();
        this.drawWasSkipped = true;
        this.divTransitionHandler = new DivTransitionHandler(this);
        this.timeCreated = DivCreationTracker.INSTANCE.getCurrentUptimeMillis();
        getDiv2Component().getReleaseManager().observeDivLifecycle(this);
    }

    private void addNewStateViewWithTransition(ea oldData, ea newData, y0 oldDiv, ea.c newState, View newStateView, boolean allowsTransition, boolean bindBeforeViewAdded) {
        Transition transitionPrepareTransition = allowsTransition ? prepareTransition(oldData, newData, oldDiv, newState.f87215a) : null;
        if (transitionPrepareTransition != null) {
            Scene currentScene = Scene.getCurrentScene(this);
            if (currentScene != null) {
                currentScene.setExitAction(new Runnable() { // from class: l7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Div2View.addNewStateViewWithTransition$lambda$41(this.f94057b);
                    }
                });
            }
        } else {
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this, this);
        }
        if (bindBeforeViewAdded) {
            getDiv2Component().getDivBinder().bind(getBindingContext(), newStateView, newState.f87215a, DivStatePath.INSTANCE.fromState$div_release(newState));
        }
        if (transitionPrepareTransition == null) {
            addView(newStateView);
            getViewComponent().getErrorMonitor().connect(this);
        } else {
            TransitionManager.endTransitions(this);
            Scene scene = new Scene(this, newStateView);
            SceneRootWatcher.INSTANCE.watchFor(scene, transitionPrepareTransition);
            TransitionManager.go(scene, transitionPrepareTransition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNewStateViewWithTransition$lambda$41(Div2View div2View) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(div2View, div2View);
    }

    private View buildViewAndUpdateState(ea.c newState, long stateId, boolean isUpdateTemporary) {
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, isUpdateTemporary);
        View viewBuildView = this.divBuilder.buildView(newState.f87215a, getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(newState));
        getDiv2Component().getDivBinder().attachIndicators$div_release();
        return viewBuildView;
    }

    static /* synthetic */ View buildViewAndUpdateState$default(Div2View div2View, ea.c cVar, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAndUpdateState");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return div2View.buildViewAndUpdateState(cVar, j10, z10);
    }

    private View buildViewAsyncAndUpdateState(final ea.c newState, long stateId, boolean isUpdateTemporary) {
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, isUpdateTemporary);
        final DivStatePath divStatePathFromState$div_release = DivStatePath.INSTANCE.fromState$div_release(newState);
        final View viewCreateView = this.divBuilder.createView(newState.f87215a, getBindingContext(), divStatePathFromState$div_release);
        if (this.bindOnAttachEnabled) {
            setBindOnAttachRunnable$div_release(new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View.buildViewAsyncAndUpdateState.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Div2View div2View = Div2View.this;
                    View view = viewCreateView;
                    ea.c cVar = newState;
                    try {
                        div2View.getDiv2Component().getDivBinder().bind(div2View.getBindingContext(), view, cVar.f87215a, divStatePathFromState$div_release);
                    } catch (ParsingException e10) {
                        if (!ExpressionFallbacksHelperKt.isExpressionResolveFail(e10)) {
                            throw e10;
                        }
                    }
                    Div2View.this.getDiv2Component().getDivBinder().attachIndicators$div_release();
                }
            }));
            return viewCreateView;
        }
        getDiv2Component().getDivBinder().bind(getBindingContext(), viewCreateView, newState.f87215a, divStatePathFromState$div_release);
        if (isAttachedToWindow()) {
            getDiv2Component().getDivBinder().attachIndicators$div_release();
            return viewCreateView;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                this.removeOnAttachStateChangeListener(this);
                this.getDiv2Component().getDivBinder().attachIndicators$div_release();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
            }
        });
        return viewCreateView;
    }

    static /* synthetic */ View buildViewAsyncAndUpdateState$default(Div2View div2View, ea.c cVar, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAsyncAndUpdateState");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return div2View.buildViewAsyncAndUpdateState(cVar, j10, z10);
    }

    private void cancelImageLoads() {
        Iterator<T> it = this.loadReferences.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.loadReferences.clear();
    }

    private boolean complexRebind(ea newData, ea oldData, ComplexRebindReporter reporter) {
        ea.c stateToBind = getStateToBind(newData);
        if (stateToBind == null) {
            reporter.onComplexRebindFatalNoState();
            return false;
        }
        getHistogramReporter().onRebindingStarted();
        setDivData$div_release(newData);
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask == null) {
            RebindTask rebindTask2 = new RebindTask(this, getDiv2Component().getDivBinder(), getOldExpressionResolver$div_release(), getExpressionResolver(), reporter);
            this.rebindTask = rebindTask2;
            rebindTask = rebindTask2;
        }
        getDiv2Component().getStateManager().updateState(getDataTag(), stateToBind.f87216b, false);
        View childAt = getView().getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        if (!rebindTask.prepareAndRebind(oldData, newData, (ViewGroup) childAt, DivStatePath.INSTANCE.fromState$div_release(stateToBind))) {
            return false;
        }
        requestLayout();
        getHistogramReporter().onRebindingFinished();
        return true;
    }

    private void discardChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component().getVisibilityActionTracker();
        for (Map.Entry<View, y0> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            y0 value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
            }
        }
    }

    private void discardStateVisibility(ea.c state) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component().getVisibilityActionTracker(), this, getExpressionResolver(), null, state.f87215a, null, null, 48, null);
    }

    private boolean forceSwitchToState(long stateId, boolean temporary) {
        Object next;
        Object next2;
        setStateId$div_release(stateId);
        DivViewState currentState = getCurrentState();
        Long lValueOf = currentState != null ? Long.valueOf(currentState.getCurrentDivStateId()) : null;
        ea divData = getDivData();
        if (divData == null) {
            return false;
        }
        Iterator it = divData.f87205c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long j10 = ((ea.c) next).f87216b;
            if (lValueOf != null && j10 == lValueOf.longValue()) {
                break;
            }
        }
        ea.c cVar = (ea.c) next;
        Iterator it2 = divData.f87205c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((ea.c) next2).f87216b == stateId) {
                break;
            }
        }
        ea.c cVar2 = (ea.c) next2;
        if (cVar2 == null) {
            return false;
        }
        if (cVar != null) {
            discardStateVisibility(cVar);
        }
        trackStateVisibility(cVar2);
        boolean zAreDivsReplaceable$default = DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, cVar != null ? cVar.f87215a : null, cVar2.f87215a, getExpressionResolver(), getExpressionResolver(), null, 16, null);
        addNewStateViewWithTransition(divData, divData, cVar != null ? cVar.f87215a : null, cVar2, zAreDivsReplaceable$default ? updateState(stateId, temporary) : buildViewAndUpdateState(cVar2, stateId, temporary), DivTransitionsKt.allowsTransitionsOnDataChange(divData, getExpressionResolver()), zAreDivsReplaceable$default);
        return true;
    }

    @VisibleForTesting
    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    private DivVideoActionHandler getDivVideoActionHandler() {
        return getDiv2Component().getDivVideoActionHandler();
    }

    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Div2ViewHistogramReporter getHistogramReporter() {
        return (Div2ViewHistogramReporter) this.histogramReporter.getValue();
    }

    private ExpressionResolver getResolver(RuntimeStore runtimeStore) {
        ExpressionsRuntime rootRuntime;
        ExpressionResolverImpl expressionResolver;
        RuntimeStoreImpl runtimeStoreImpl = runtimeStore instanceof RuntimeStoreImpl ? (RuntimeStoreImpl) runtimeStore : null;
        return (runtimeStoreImpl == null || (rootRuntime = runtimeStoreImpl.getRootRuntime()) == null || (expressionResolver = rootRuntime.getExpressionResolver()) == null) ? ExpressionResolver.EMPTY : expressionResolver;
    }

    @VisibleForTesting
    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private ea.c getStateToBind(ea eaVar) {
        Object next;
        Iterator it = eaVar.f87205c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ea.c) next).f87216b == getStateId()) {
                break;
            }
        }
        ea.c cVar = (ea.c) next;
        return cVar == null ? (ea.c) kotlin.collections.CollectionsKt.firstOrNull(eaVar.f87205c) : cVar;
    }

    private DivTooltipController getTooltipController() {
        return getDiv2Component().getTooltipController();
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    private Sequence<DivItemBuilderResult> itemSequenceForTransition(ea divData, y0 div, final ExpressionResolver resolver) {
        zv zvVar;
        Expression expression;
        final ArrayDeque arrayDeque = new ArrayDeque();
        if (divData == null || (expression = divData.f87207e) == null || (zvVar = (zv) expression.evaluate(resolver)) == null) {
            zvVar = zv.NONE;
        }
        arrayDeque.addLast(zvVar);
        return k.E(DivTreeWalkKt.walk(div, resolver).onEnter(new Function1<y0, Boolean>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull y0 y0Var) {
                if (y0Var instanceof y0.o) {
                    arrayDeque.addLast((zv) ((y0.o) y0Var).d().L.evaluate(resolver));
                }
                return Boolean.TRUE;
            }
        }).onLeave(new Function1<y0, Unit>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(y0 y0Var) {
                invoke2(y0Var);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull y0 y0Var) {
                if (y0Var instanceof y0.o) {
                    arrayDeque.removeLast();
                }
            }
        }), new Function1<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                boolean zAllowsTransitionsOnDataChange;
                List listL = divItemBuilderResult.getDiv().c().l();
                if (listL != null) {
                    zAllowsTransitionsOnDataChange = DivTransitionsKt.allowsTransitionsOnDataChange((List<? extends aw>) listL);
                } else {
                    zv zvVarLastOrNull = arrayDeque.lastOrNull();
                    zAllowsTransitionsOnDataChange = zvVarLastOrNull != null ? DivTransitionsKt.allowsTransitionsOnDataChange(zvVarLastOrNull) : false;
                }
                return Boolean.valueOf(zAllowsTransitionsOnDataChange);
            }
        });
    }

    private void notifyBindEnded() {
        setInMiddleOfBind$div_release(false);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onAfterDivDataChanged();
        }
    }

    private void notifyBindStarted() {
        if (getInMiddleOfBind()) {
            DivActionTypedUtilsKt.logError(this, new RuntimeException("New binding started when previous not ended!"));
        }
        setInMiddleOfBind$div_release(true);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onBeforeDivDataChanged();
        }
    }

    private Transition prepareTransition(ea oldData, final ea newData, y0 oldDiv, y0 newDiv) {
        if (oldDiv == newDiv) {
            return null;
        }
        final TransitionSet transitionSetBuildTransitions = getViewComponent().getTransitionBuilder().buildTransitions(oldDiv != null ? itemSequenceForTransition(oldData, oldDiv, getOldExpressionResolver$div_release()) : null, newDiv != null ? itemSequenceForTransition(newData, newDiv, getExpressionResolver()) : null, getOldExpressionResolver$div_release(), getExpressionResolver());
        if (transitionSetBuildTransitions.getTransitionCount() == 0) {
            return null;
        }
        final DivDataChangeListener divDataChangeListener = getDiv2Component().getDivDataChangeListener();
        divDataChangeListener.beforeAnimatedDataChange(this, newData);
        transitionSetBuildTransitions.addListener((Transition.TransitionListener) new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.Div2View$prepareTransition$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition) {
                divDataChangeListener.afterAnimatedDataChange(this, newData);
                transitionSetBuildTransitions.removeListener(this);
            }
        });
        return transitionSetBuildTransitions;
    }

    private void rebind(ea newData, boolean isAutoanimations, SimpleRebindReporter reporter) {
        try {
            if (getChildCount() == 0) {
                reporter.onSimpleRebindNoChild();
                updateNow(newData, getDataTag(), reporter);
                return;
            }
            ea.c stateToBind = getStateToBind(newData);
            if (stateToBind == null) {
                reporter.onSimpleRebindFatalNoState();
                return;
            }
            getHistogramReporter().onRebindingStarted();
            ErrorCollector orNull = getViewComponent().getErrorCollectors().getOrNull(getDataTag(), getDivData());
            if (orNull != null) {
                orNull.cleanRuntimeWarningsAndErrors();
            }
            setDivData$div_release(newData);
            getDiv2Component().getStateManager().updateState(getDataTag(), stateToBind.f87216b, true);
            getDiv2Component().getDivBinder().bind(getBindingContext(), getChildAt(0), stateToBind.f87215a, DivStatePath.INSTANCE.fromState$div_release(stateToBind));
            requestLayout();
            if (isAutoanimations) {
                getDiv2Component().getDivStateChangeListener().onDivAnimatedStateChanged(this);
            }
            tryAttachVariableTriggers(newData);
            getHistogramReporter().onRebindingFinished();
            reporter.onSimpleRebindSuccess();
        } catch (Exception e10) {
            reporter.onSimpleRebindException(e10);
            updateNow(newData, getDataTag(), reporter);
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("", e10);
            }
        }
    }

    private void sendCreationHistograms() {
        if (this.timeCreated < 0) {
            return;
        }
        getDiv2Component().getDivCreationTracker().sendHistograms(this.constructorCallTime, this.timeCreated, getDiv2Component().getHistogramReporter(), this.viewCreateCallType);
        this.timeCreated = -1L;
    }

    private ea.c state(ea eaVar) {
        Object next;
        long jStateId = stateId(eaVar);
        Iterator it = eaVar.f87205c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ea.c) next).f87216b == jStateId) {
                break;
            }
        }
        return (ea.c) next;
    }

    private long stateId(ea eaVar) {
        DivViewState currentState = getCurrentState();
        return currentState != null ? currentState.getCurrentDivStateId() : DivDataUtilsKt.getInitialStateId(eaVar);
    }

    private void stopLoadAndSubscriptions() {
        this.viewToDivBindings.clear();
        cancelTooltips();
        clearSubscriptions();
        this.divDataChangedObservers.clear();
    }

    private boolean switchToDivData(ea oldData, ea newData, ForceRebindReporter reporter) {
        Div2View div2View;
        View viewBuildViewAndUpdateState$default;
        ea.c cVarState = oldData != null ? state(oldData) : null;
        ea.c cVarState2 = state(newData);
        setStateId$div_release(stateId(newData));
        if (cVarState2 == null) {
            reporter.onForceRebindFatalNoState();
            return false;
        }
        if (oldData == null) {
            div2View = this;
            viewBuildViewAndUpdateState$default = buildViewAsyncAndUpdateState$default(div2View, cVarState2, getStateId(), false, 4, null);
        } else {
            div2View = this;
            viewBuildViewAndUpdateState$default = buildViewAndUpdateState$default(div2View, cVarState2, getStateId(), false, 4, null);
        }
        View view = viewBuildViewAndUpdateState$default;
        if (cVarState != null) {
            discardStateVisibility(cVarState);
        }
        trackStateVisibility(cVarState2);
        div2View.addNewStateViewWithTransition(oldData, newData, cVarState != null ? cVarState.f87215a : null, cVarState2, view, (oldData != null && DivTransitionsKt.allowsTransitionsOnDataChange(oldData, getOldExpressionResolver$div_release())) || DivTransitionsKt.allowsTransitionsOnDataChange(newData, getExpressionResolver()), false);
        if (oldData != null) {
            reporter.onForceRebindSuccess();
        } else {
            reporter.onFirstBindingCompleted();
        }
        return true;
    }

    private void trackStateVisibility(ea.c state) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component().getVisibilityActionTracker(), this, getExpressionResolver(), getView(), state.f87215a, null, null, 48, null);
    }

    private void tryAttachVariableTriggers(ea data) {
        ea.c cVarState;
        if ((this.bindOnAttachEnabled && !getView().isAttachedToWindow()) || data == null || (cVarState = state(data)) == null) {
            return;
        }
        getViewComponent().getRuntimeVisitor().createAndAttachRuntimes(cVarState.f87215a, DivStatePath.INSTANCE.fromState$div_release(cVarState), this);
    }

    private boolean updateNow(ea data, DivDataTag tag, ForceRebindReporter reporter) {
        ea divData = getDivData();
        if (divData == null) {
            getHistogramReporter().onBindingStarted();
        } else {
            getHistogramReporter().onRebindingStarted();
        }
        cleanup(false);
        setDataTag$div_release(tag);
        setDivData$div_release(data);
        boolean zSwitchToDivData = switchToDivData(divData, data, reporter);
        tryAttachVariableTriggers(data);
        if (divData != null) {
            getHistogramReporter().onRebindingFinished();
            return zSwitchToDivData;
        }
        if (!this.bindOnAttachEnabled) {
            getHistogramReporter().onBindingFinished();
            return zSwitchToDivData;
        }
        getHistogramReporter().onBindingPaused();
        this.reportBindingResumedRunnable = new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View.updateNow.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Div2View.this.getHistogramReporter().onBindingResumed();
            }
        });
        this.reportBindingFinishedRunnable = new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View.updateNow.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Div2View.this.getHistogramReporter().onBindingFinished();
            }
        });
        return zSwitchToDivData;
    }

    private void updateRuntimeStore(ea data, DivDataTag tag) {
        RuntimeStore runtimeStore;
        if (data == null) {
            return;
        }
        this.oldRuntimeStore = getRuntimeStore();
        setRuntimeStore$div_release(getDiv2Component().getRuntimeStoreProvider().getOrCreate$div_release(tag, data, this));
        getRuntimeStore().updateSubscriptions();
        if (!Intrinsics.areEqual(this.oldRuntimeStore, getRuntimeStore()) && (runtimeStore = this.oldRuntimeStore) != null) {
            runtimeStore.clearBindings(this);
        }
        setBindingContext$div_release(new BindingContext(this, getExpressionResolver()));
    }

    static /* synthetic */ void updateRuntimeStore$default(Div2View div2View, ea eaVar, DivDataTag divDataTag, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRuntimeStore");
        }
        if ((i10 & 1) != 0) {
            eaVar = div2View.getDivData();
        }
        if ((i10 & 2) != 0) {
            divDataTag = div2View.getDataTag();
        }
        div2View.updateRuntimeStore(eaVar, divDataTag);
    }

    private View updateState(long stateId, boolean temporary) {
        View childAt = getView().getChildAt(0);
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, temporary);
        getDiv2Component().getDivBinder().attachIndicators$div_release();
        return childAt;
    }

    private void updateTimers() {
        DivTimerEventDispatcher divTimerEventDispatcher;
        ea divData = getDivData();
        if (divData == null) {
            return;
        }
        DivTimerEventDispatcher orCreate$div_release = getDiv2Component().getDivTimersControllerProvider().getOrCreate$div_release(getDataTag(), divData, getExpressionResolver());
        if (!Intrinsics.areEqual(getDivTimerEventDispatcher(), orCreate$div_release) && (divTimerEventDispatcher = getDivTimerEventDispatcher()) != null) {
            divTimerEventDispatcher.onDetach(this);
        }
        setDivTimerEventDispatcher$div_release(orCreate$div_release);
        if (orCreate$div_release != null) {
            orCreate$div_release.onAttach(this);
        }
    }

    public void addLoadReference(@NotNull LoadReference loadReference, @NotNull View targetView) {
        synchronized (this.monitor) {
            this.loadReferences.add(loadReference);
        }
    }

    public void addPersistentDivDataObserver$div_release(@NotNull PersistentDivDataObserver observer) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.addObserver(observer);
        }
    }

    public void applyTimerCommand(@NotNull String id2, @NotNull String command) {
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.changeState(id2, command);
        }
    }

    public boolean applyVideoCommand(@NotNull String divId, @NotNull String command, @NotNull ExpressionResolver expressionResolver) {
        return getDivVideoActionHandler().handleAction(this, divId, command, expressionResolver);
    }

    public /* synthetic */ void b(long j10) {
        o.a(this, j10);
    }

    public void bindViewToDiv$div_release(@NotNull View view, @NotNull y0 div) {
        this.viewToDivBindings.put(view, div);
    }

    public void bulkActions$div_release(@NotNull Function0<Unit> function) {
        this.bulkActionsHandler.bulkActions(function);
    }

    public void cancelTooltips() {
        getTooltipController().cancelTooltips(this);
    }

    public void cleanup() {
        synchronized (this.monitor) {
            cleanup(true);
            Unit unit = Unit.f93236a;
        }
    }

    public void clearSubscriptions() {
        synchronized (this.monitor) {
            this.overflowMenuListeners.clear();
            Unit unit = Unit.f93236a;
        }
    }

    public void discardVisibilityTracking() {
        List list;
        ea divData = getDivData();
        ea.c cVar = null;
        Object obj = null;
        cVar = null;
        if (divData != null && (list = divData.f87205c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ea.c) next).f87216b == getStateId()) {
                    obj = next;
                    break;
                }
            }
            cVar = (ea.c) obj;
        }
        if (cVar != null) {
            discardStateVisibility(cVar);
        }
        discardChildrenVisibility();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawStarted();
        }
        super.dispatchDraw(canvas);
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawFinished();
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        this.drawWasSkipped = false;
        getHistogramReporter().onDrawStarted();
        super.draw(canvas);
        getHistogramReporter().onDrawFinished();
        this.drawWasSkipped = true;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Nullable
    public DivActionHandler getActionHandler() {
        return this.actionHandler;
    }

    @Nullable
    /* JADX INFO: renamed from: getBindOnAttachRunnable$div_release, reason: from getter */
    public SingleTimeOnAttachCallback getBindOnAttachRunnable() {
        return this.bindOnAttachRunnable;
    }

    @NotNull
    /* JADX INFO: renamed from: getBindingContext$div_release, reason: from getter */
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Nullable
    /* JADX INFO: renamed from: getClearVariablesListener$div_release, reason: from getter */
    public ViewTreeObserver.OnPreDrawListener getClearVariablesListener() {
        return this.clearVariablesListener;
    }

    public boolean getComplexRebindInProgress$div_release() {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            return rebindTask.getRebindInProgress();
        }
        return false;
    }

    @Nullable
    public String getComponentName() {
        return getHistogramReporter().getComponent();
    }

    @NotNull
    public DivViewConfig getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: getContext$div_release, reason: from getter */
    public Div2Context getContext() {
        return this.context;
    }

    @Nullable
    public ReusableTokenList getCurrentRebindReusableList$div_release() {
        RebindTask rebindTask;
        if (getComplexRebindInProgress$div_release() && (rebindTask = this.rebindTask) != null) {
            return rebindTask.getReusableList();
        }
        return null;
    }

    @NotNull
    public DivStatePath getCurrentRootPath$div_release() {
        List list;
        Object next;
        DivStatePath divStatePathFromState$div_release;
        ea divData = getDivData();
        if (divData != null && (list = divData.f87205c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ea.c) next).f87216b == getStateId()) {
                    break;
                }
            }
            ea.c cVar = (ea.c) next;
            if (cVar != null && (divStatePathFromState$div_release = DivStatePath.INSTANCE.fromState$div_release(cVar)) != null) {
                return divStatePathFromState$div_release;
            }
        }
        return DivStatePath.INSTANCE.fromState(getStateId());
    }

    @Nullable
    public DivViewState getCurrentState() {
        ea divData = getDivData();
        if (divData == null) {
            return null;
        }
        DivViewState state = getDiv2Component().getStateManager().getState(getDataTag());
        List<ea.c> list = divData.f87205c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ea.c cVar : list) {
                if (state != null && cVar.f87216b == state.getCurrentDivStateId()) {
                    return state;
                }
            }
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId();
    }

    @NotNull
    public DivCustomContainerChildFactory getCustomContainerChildFactory$div_release() {
        return getDiv2Component().getDivCustomContainerChildFactory();
    }

    @NotNull
    public DivDataTag getDataTag() {
        return this.dataTag;
    }

    @NotNull
    /* JADX INFO: renamed from: getDiv2Component$div_release, reason: from getter */
    public Div2Component getDiv2Component() {
        return this.div2Component;
    }

    @Nullable
    public ea getDivData() {
        return this.divData;
    }

    @NotNull
    public DivDataTag getDivTag() {
        return getDataTag();
    }

    @Nullable
    /* JADX INFO: renamed from: getDivTimerEventDispatcher$div_release, reason: from getter */
    public DivTimerEventDispatcher getDivTimerEventDispatcher() {
        return this.divTimerEventDispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: getDivTransitionHandler$div_release, reason: from getter */
    public DivTransitionHandler getDivTransitionHandler() {
        return this.divTransitionHandler;
    }

    @NotNull
    public ExpressionResolver getExpressionResolver() {
        return getResolver(getRuntimeStore());
    }

    public boolean getForceCanvasClipping() {
        return this.forceCanvasClipping;
    }

    /* JADX INFO: renamed from: getInMiddleOfBind$div_release, reason: from getter */
    public boolean getInMiddleOfBind() {
        return this.inMiddleOfBind;
    }

    @NotNull
    /* JADX INFO: renamed from: getInputFocusTracker$div_release, reason: from getter */
    public InputFocusTracker getInputFocusTracker() {
        return this.inputFocusTracker;
    }

    @NotNull
    public Map<ExpressionResolver, Map<String, Integer>> getLayoutSizes$div_release() {
        return this.layoutSizes;
    }

    @NotNull
    public String getLogId() {
        String str;
        ea divData = getDivData();
        return (divData == null || (str = divData.f87204b) == null) ? "" : str;
    }

    @NotNull
    public MediaReleaseViewVisitor getMediaReleaseViewVisitor$div_release() {
        return getViewComponent().getMediaReleaseViewVisitor();
    }

    @NotNull
    public ExpressionResolver getOldExpressionResolver$div_release() {
        return getResolver(this.oldRuntimeStore);
    }

    @NotNull
    public DivDataTag getPrevDataTag() {
        return this.prevDataTag;
    }

    @NotNull
    public ReleaseViewVisitor getReleaseViewVisitor$div_release() {
        return getViewComponent().getReleaseViewVisitor();
    }

    @NotNull
    /* JADX INFO: renamed from: getRuntimeStore$div_release, reason: from getter */
    public RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    /* JADX INFO: renamed from: getStateId$div_release, reason: from getter */
    public long getStateId() {
        return this.stateId;
    }

    @NotNull
    public Map<ea, DivLayoutProviderVariablesHolder> getVariablesHolders$div_release() {
        return this.variablesHolders;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public Div2View getView() {
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: getViewComponent$div_release, reason: from getter */
    public Div2ViewComponent getViewComponent() {
        return this.viewComponent;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent().getErrorMonitor().getEnabled();
    }

    public void handleAction(@NotNull j1 action, @NotNull String reason, @NotNull ExpressionResolver resolver) {
        handleActionWithResult(action, reason, resolver);
    }

    public boolean handleActionWithResult(@NotNull j1 action, @NotNull String reason, @NotNull ExpressionResolver resolver) {
        return getDiv2Component().getActionBinder().handleAction$div_release(this, resolver, action, reason, null, getActionHandler());
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void hideTooltip(@NotNull String tooltipId) {
        getTooltipController().hideTooltip(tooltipId, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SingleTimeOnAttachCallback singleTimeOnAttachCallback = this.reportBindingResumedRunnable;
        if (singleTimeOnAttachCallback != null) {
            singleTimeOnAttachCallback.onAttach();
        }
        tryAttachVariableTriggers(getDivData());
        SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
        if (bindOnAttachRunnable != null) {
            bindOnAttachRunnable.onAttach();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback2 = this.reportBindingFinishedRunnable;
        if (singleTimeOnAttachCallback2 != null) {
            singleTimeOnAttachCallback2.onAttach();
        }
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.onAttach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        discardVisibilityTracking();
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.onDetach(this);
        }
        getViewComponent().getAnimatorController().onDetachedFromWindow();
        getRuntimeStore().onDetachedFromWindow(this);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        getHistogramReporter().onLayoutStarted();
        super.onLayout(changed, left, top, right, bottom);
        tryLogVisibility();
        getHistogramReporter().onLayoutFinished();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getHistogramReporter().onMeasureStarted();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        getHistogramReporter().onMeasureFinished();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        if (getInputFocusTracker().isFocusedOnInput()) {
            this.gestureDetector.onTouchEvent(event);
            if (event.getAction() == 0) {
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public void removePersistentDivDataObserver$div_release(@NotNull PersistentDivDataObserver observer) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.removeObserver(observer);
        }
    }

    public void resetToInitialState() {
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            currentState.reset();
        }
        getDiv2Component().getTemporaryDivStateCache().resetCard(getDivTag().getId());
        switchToInitialState();
    }

    @Nullable
    public y0 rootDiv$div_release() {
        ea.c cVarState;
        ea divData = getDivData();
        if (divData == null || (cVarState = state(divData)) == null) {
            return null;
        }
        return cVarState.f87215a;
    }

    public void setActionHandler(@Nullable DivActionHandler divActionHandler) {
        this.actionHandler = divActionHandler;
    }

    public void setBindOnAttachRunnable$div_release(@Nullable SingleTimeOnAttachCallback singleTimeOnAttachCallback) {
        this.bindOnAttachRunnable = singleTimeOnAttachCallback;
    }

    public void setBindingContext$div_release(@NotNull BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    public void setClearVariablesListener$div_release(@Nullable ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.clearVariablesListener = onPreDrawListener;
    }

    public void setComponentName(@Nullable String str) {
        getHistogramReporter().setComponent(str);
    }

    public void setConfig(@NotNull DivViewConfig viewConfig) {
        this.config = viewConfig;
    }

    public boolean setData(@Nullable ea data, @NotNull DivDataTag tag) {
        return setData(data, getDivData(), tag);
    }

    public void setDataTag$div_release(@NotNull DivDataTag divDataTag) {
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = divDataTag;
        this.bindingProvider.update(divDataTag, getDivData());
    }

    public void setDivData$div_release(@Nullable ea eaVar) {
        this.divData = eaVar;
        updateRuntimeStore$default(this, null, null, 3, null);
        updateTimers();
        this.bindingProvider.update(getDataTag(), this.divData);
    }

    public void setDivTimerEventDispatcher$div_release(@Nullable DivTimerEventDispatcher divTimerEventDispatcher) {
        this.divTimerEventDispatcher = divTimerEventDispatcher;
    }

    public void setForceCanvasClipping(boolean z10) {
        this.forceCanvasClipping = z10;
    }

    public void setInMiddleOfBind$div_release(boolean z10) {
        this.inMiddleOfBind = z10;
    }

    public void setPrevDataTag$div_release(@NotNull DivDataTag divDataTag) {
        this.prevDataTag = divDataTag;
    }

    public void setRuntimeStore$div_release(@NotNull RuntimeStore runtimeStore) {
        this.runtimeStore = runtimeStore;
    }

    public void setStateId$div_release(long j10) {
        this.stateId = j10;
    }

    @Nullable
    public VariableMutationException setVariable(@NotNull String name, @NotNull String value) {
        return VariableMutationHandler.INSTANCE.setVariable(this, name, value, getExpressionResolver());
    }

    public void setVisualErrorsEnabled(boolean z10) {
        getViewComponent().getErrorMonitor().setEnabled$div_release(z10);
    }

    public void showTooltip(@NotNull String tooltipId) {
        DivTooltipController.showTooltip$default(getTooltipController(), tooltipId, getBindingContext(), false, 4, null);
    }

    @Nullable
    public ea.c stateToBind(@NotNull ea divData) {
        return getStateToBind(divData);
    }

    public void subscribe(@NotNull OverflowMenuSubscriber$Listener listener) {
        synchronized (this.monitor) {
            this.overflowMenuListeners.add(listener);
        }
    }

    public void switchToInitialState() {
        ea divData = getDivData();
        if (divData == null) {
            return;
        }
        long initialStateId = DivDataUtilsKt.getInitialStateId(divData);
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            initialStateId = currentState.getCurrentDivStateId();
        }
        b(initialStateId);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(long stateId, boolean temporary) {
        synchronized (this.monitor) {
            try {
                if (stateId != DivDataUtilsKt.getINVALID_STATE_ID(ea.f87200j)) {
                    SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
                    if (bindOnAttachRunnable != null) {
                        bindOnAttachRunnable.cancel();
                    }
                    forceSwitchToState(stateId, temporary);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public y0 takeBindingDiv$div_release(@NotNull View view) {
        return this.viewToDivBindings.get(view);
    }

    public void trackChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component().getVisibilityActionTracker();
        for (Map.Entry<View, y0> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            y0 value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                if (ViewCompat.isAttachedToWindow(key)) {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, key, value, null, null, 48, null);
                } else {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
                }
            }
        }
    }

    public void tryLogVisibility() {
        List list;
        ea divData = getDivData();
        ea.c cVar = null;
        Object obj = null;
        cVar = null;
        if (divData != null && (list = divData.f87205c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ea.c) next).f87216b == getStateId()) {
                    obj = next;
                    break;
                }
            }
            cVar = (ea.c) obj;
        }
        if (cVar != null) {
            trackStateVisibility(cVar);
        }
        trackChildrenVisibility();
    }

    @Nullable
    public y0 unbindViewFromDiv$div_release(@NotNull View view) {
        return this.viewToDivBindings.remove(view);
    }

    public boolean setData(@Nullable ea data, @Nullable ea oldDivData, @NotNull DivDataTag tag) {
        synchronized (this.monitor) {
            ea eaVar = oldDivData;
            BindingEventReporter bindingEventReporter = this.bindingReporterProvider.get(eaVar, data);
            boolean zUpdateNow = false;
            if (data == null) {
                bindingEventReporter.onBindingFatalNoData();
                return false;
            }
            if (getDivData() == data) {
                bindingEventReporter.onBindingFatalSameData();
                return false;
            }
            notifyBindStarted();
            SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
            if (bindOnAttachRunnable != null) {
                bindOnAttachRunnable.cancel();
            }
            getHistogramReporter().onRenderStarted();
            ea divData = getDivData();
            if (divData != null) {
                eaVar = divData;
            }
            updateRuntimeStore(data, tag);
            setDataTag$div_release(tag);
            for (ea.c cVar : data.f87205c) {
                DivViewDataPreloader.preload$default(getDiv2Component().getDivViewDataPreloader(), cVar.f87215a, getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(cVar), null, 8, null);
            }
            boolean zIsDivDataReplaceable = DivComparator.INSTANCE.isDivDataReplaceable(eaVar, data, getStateId(), getOldExpressionResolver$div_release(), getExpressionResolver(), bindingEventReporter);
            if (eaVar == null || DivTransitionsKt.allowsTransitionsOnDataChange(data, getExpressionResolver())) {
                zUpdateNow = updateNow(data, tag, bindingEventReporter);
            } else if (zIsDivDataReplaceable || !this.complexRebindEnabled || !(getView().getChildAt(0) instanceof ViewGroup) || !complexRebind(data, eaVar, bindingEventReporter)) {
                if (zIsDivDataReplaceable) {
                    rebind(data, false, bindingEventReporter);
                } else {
                    zUpdateNow = updateNow(data, tag, bindingEventReporter);
                }
            }
            getDiv2Component().getDivBinder().attachIndicators$div_release();
            sendCreationHistograms();
            notifyBindEnded();
            return zUpdateNow;
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(@NotNull String tooltipId, boolean multiple) {
        getTooltipController().showTooltip(tooltipId, getBindingContext(), multiple);
    }

    private void cleanup(boolean removeChildren) {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            rebindTask.clear();
            Unit unit = Unit.f93236a;
            this.rebindTask = null;
        }
        discardVisibilityTracking();
        cancelImageLoads();
        ReleaseUtils releaseUtils = ReleaseUtils.INSTANCE;
        releaseUtils.releaseMedia$div_release(this, this);
        stopLoadAndSubscriptions();
        getDiv2Component().getBitmapEffectHelper().release();
        if (removeChildren) {
            releaseUtils.releaseAndRemoveChildren$div_release(this, this);
        }
        ErrorCollector orNull = getViewComponent().getErrorCollectors().getOrNull(getDataTag(), getDivData());
        if (orNull != null) {
            orNull.cleanRuntimeWarningsAndErrors();
        }
        setDivData$div_release(null);
        setDataTag$div_release(DivDataTag.INVALID);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(@NotNull DivStatePath path, boolean temporary) {
        List list;
        synchronized (this.monitor) {
            try {
                ea divData = getDivData();
                ea.c cVar = null;
                Object obj = null;
                cVar = null;
                if (divData != null && (list = divData.f87205c) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((ea.c) next).f87216b == path.getTopLevelStateId()) {
                            obj = next;
                            break;
                        }
                    }
                    cVar = (ea.c) obj;
                }
                this.bulkActionsHandler.switchState(cVar, path, temporary);
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public Div2View(@NotNull Div2Context div2Context, @Nullable AttributeSet attributeSet, int i10) {
        this(div2Context, attributeSet, i10, SystemClock.uptimeMillis());
    }
}
