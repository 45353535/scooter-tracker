package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.y.z.w.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aD\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001a(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0013\b\b\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0083\b¢\u0006\u0002\u0010\u001c\u001a\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u001a\f\u0010\"\u001a\u00020\u001e*\u00020 H\u0000\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Popup", "", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Landroidx/compose/runtime/Composable;", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PopupTestTag", s.z.f67720z, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isPopupLayout", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "testTag", "isFlagSecureEnabled", "toIntBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroid/graphics/Rect;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidPopup_androidKt {

    @NotNull
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new Function0<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    /* JADX INFO: renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {301}, m = "invokeSuspend")
    static final class AnonymousClass5 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ PopupLayout $popupLayout;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(PopupLayout popupLayout, Continuation continuation) {
            super(2, continuation);
            this.$popupLayout = popupLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$popupLayout, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.d.b(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                kotlin.d.b(r4)
                java.lang.Object r4 = r3.L$0
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                r1 = r4
            L23:
                boolean r4 = kotlinx.coroutines.i.i(r1)
                if (r4 == 0) goto L3c
                androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r4 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5.1
                    static {
                        /*
                            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
                            r0.<init>()
                            
                            // error: 0x0005: SPUT (r0 I:androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1) androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5.1.INSTANCE androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.AnonymousClass5.AnonymousClass1.<clinit>():void");
                    }

                    {
                        /*
                            r1 = this;
                            r0 = 1
                            r1.<init>(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.AnonymousClass5.AnonymousClass1.<init>():void");
                    }

                    public final void invoke(long r1) {
                        /*
                            r0 = this;
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.AnonymousClass5.AnonymousClass1.invoke(long):void");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long r3) {
                        /*
                            r2 = this;
                            java.lang.Number r3 = (java.lang.Number) r3
                            long r0 = r3.longValue()
                            r2.invoke(r0)
                            kotlin.Unit r3 = kotlin.Unit.f93236a
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.AnonymousClass5.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                    }
                }
                r3.L$0 = r1
                r3.label = r2
                java.lang.Object r4 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.PopupLayout r4 = r3.$popupLayout
                r4.pollForLocationOnScreenChange()
                goto L23
            L3c:
                kotlin.Unit r4 = kotlin.Unit.f93236a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C16161 implements MeasurePolicy {
        public static final C16161 INSTANCE = new C16161();

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
            int i10;
            int i11;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            int size = measurables.size();
            if (size == 0) {
                return MeasureScope.CC.p(Layout, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.f93236a;
                    }
                }, 4, null);
            }
            int i12 = 0;
            if (size == 1) {
                final Placeable placeableMo3011measureBRTryo0 = measurables.get(0).mo3011measureBRTryo0(j10);
                return MeasureScope.CC.p(Layout, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, 0, 0, 0.0f, 4, null);
                    }
                }, 4, null);
            }
            final ArrayList arrayList = new ArrayList(measurables.size());
            int size2 = measurables.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList.add(measurables.get(i13).mo3011measureBRTryo0(j10));
            }
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (lastIndex >= 0) {
                int iMax = 0;
                int iMax2 = 0;
                while (true) {
                    Placeable placeable = (Placeable) arrayList.get(i12);
                    iMax = Math.max(iMax, placeable.getWidth());
                    iMax2 = Math.max(iMax2, placeable.getHeight());
                    if (i12 == lastIndex) {
                        break;
                    }
                    i12++;
                }
                i10 = iMax;
                i11 = iMax2;
            } else {
                i10 = 0;
                i11 = 0;
            }
            return MeasureScope.CC.p(Layout, i10, i11, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex2 < 0) {
                        return;
                    }
                    int i14 = 0;
                    while (true) {
                        Placeable.PlacementScope placementScope = layout;
                        Placeable.PlacementScope.placeRelative$default(placementScope, arrayList.get(i14), 0, 0, 0.0f, 4, null);
                        if (i14 == lastIndex2) {
                            return;
                        }
                        i14++;
                        layout = placementScope;
                    }
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0234 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0235  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Popup(@org.jetbrains.annotations.NotNull androidx.compose.ui.window.PopupPositionProvider r27, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r28, @org.jetbrains.annotations.Nullable androidx.compose.ui.window.PopupProperties r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.Popup(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> Popup$lambda$1(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m4190PopupK5zGePQ(@org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment r24, long r25, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.window.PopupProperties r28, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.m4190PopupK5zGePQ(androidx.compose.ui.Alignment, long, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void PopupTestTag(@NotNull final String tag, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-498879600);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(tag) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i11, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:331)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalPopupTestTag.provides(tag)}, content, composerStartRestartGroup, (i11 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.PopupTestTag.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                AndroidPopup_androidKt.PopupTestTag(tag, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        composer.startReplaceableGroup(1406149896);
        C16161 c16161 = C16161.INSTANCE;
        int i11 = ((i10 << 3) & 112) | ((i10 >> 3) & 14);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
        int i12 = ((i11 << 9) & 7168) | 6;
        if (!androidx.activity.s.a(composer.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer);
        Updater.m1255setimpl(composerM1248constructorimpl, c16161, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i12 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @NotNull
    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final boolean isFlagSecureEnabled(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final boolean isPopupLayout(@NotNull View view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof PopupLayout) {
            return str == null || Intrinsics.areEqual(str, ((PopupLayout) view).getTestTag());
        }
        return false;
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
