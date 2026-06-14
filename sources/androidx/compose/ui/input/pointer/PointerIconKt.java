package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PointerIconKt {
    @Stable
    @NotNull
    public static final Modifier pointerHoverIcon(@NotNull Modifier modifier, @NotNull final PointerIcon icon, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("pointerHoverIcon");
                inspectorInfo.getProperties().set("icon", icon);
                inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon.2

            /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", l = {85}, m = "invokeSuspend")
            static final class AnonymousClass1 extends k implements Function2<PointerInputScope, Continuation, Object> {
                final /* synthetic */ PointerIcon $icon;
                final /* synthetic */ boolean $overrideDescendants;
                final /* synthetic */ PointerIconService $pointerIconService;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", l = {91}, m = "invokeSuspend")
                static final class C01011 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
                    final /* synthetic */ PointerIcon $icon;
                    final /* synthetic */ boolean $overrideDescendants;
                    final /* synthetic */ PointerIconService $pointerIconService;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01011(boolean z10, PointerIconService pointerIconService, PointerIcon pointerIcon, Continuation continuation) {
                        super(2, continuation);
                        this.$overrideDescendants = z10;
                        this.$pointerIconService = pointerIconService;
                        this.$icon = pointerIcon;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        C01011 c01011 = new C01011(this.$overrideDescendants, this.$pointerIconService, this.$icon, continuation);
                        c01011.L$0 = obj;
                        return c01011;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                        return ((C01011) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[ADDED_TO_REGION] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0034 -> B:16:0x0037). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                        /*
                            r10 = this;
                            java.lang.Object r0 = pf.b.g()
                            int r1 = r10.label
                            r2 = 1
                            if (r1 == 0) goto L1b
                            if (r1 != r2) goto L13
                            java.lang.Object r1 = r10.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                            kotlin.d.b(r11)
                            goto L37
                        L13:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r11.<init>(r0)
                            throw r11
                        L1b:
                            kotlin.d.b(r11)
                            java.lang.Object r11 = r10.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                            r1 = r11
                        L23:
                            boolean r11 = r10.$overrideDescendants
                            if (r11 == 0) goto L2a
                            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            goto L2c
                        L2a:
                            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        L2c:
                            r10.L$0 = r1
                            r10.label = r2
                            java.lang.Object r11 = r1.awaitPointerEvent(r11, r10)
                            if (r11 != r0) goto L37
                            return r0
                        L37:
                            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
                            int r3 = r11.getType()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                            int r5 = r4.m2866getRelease7fucELk()
                            boolean r3 = androidx.compose.ui.input.pointer.PointerEventType.m2858equalsimpl0(r3, r5)
                            r5 = 0
                            if (r3 == 0) goto L65
                            java.util.List r3 = r11.getChanges()
                            java.lang.Object r3 = r3.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
                            long r6 = r1.mo2822getSizeYbymL2g()
                            androidx.compose.ui.geometry.Size$Companion r8 = androidx.compose.ui.geometry.Size.INSTANCE
                            long r8 = r8.m1449getZeroNHjbRc()
                            boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.m2854isOutOfBoundsjwHxaWs(r3, r6, r8)
                            if (r3 == 0) goto L65
                            r5 = r2
                        L65:
                            int r11 = r11.getType()
                            int r3 = r4.m2863getExit7fucELk()
                            boolean r11 = androidx.compose.ui.input.pointer.PointerEventType.m2858equalsimpl0(r11, r3)
                            if (r11 != 0) goto L23
                            if (r5 != 0) goto L23
                            androidx.compose.ui.input.pointer.PointerIconService r11 = r10.$pointerIconService
                            androidx.compose.ui.input.pointer.PointerIcon r3 = r10.$icon
                            r11.setCurrent(r3)
                            goto L23
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerIconKt.AnonymousClass2.AnonymousClass1.C01011.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z10, PointerIconService pointerIconService, PointerIcon pointerIcon, Continuation continuation) {
                    super(2, continuation);
                    this.$overrideDescendants = z10;
                    this.$pointerIconService = pointerIconService;
                    this.$icon = pointerIcon;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideDescendants, this.$pointerIconService, this.$icon, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C01011 c01011 = new C01011(this.$overrideDescendants, this.$pointerIconService, this.$icon, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c01011, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    return Unit.f93236a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(811087536);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(811087536, i10, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:78)");
                }
                PointerIconService pointerIconService = (PointerIconService) composer.consume(CompositionLocalsKt.getLocalPointerIconService());
                Modifier modifierPointerInput = pointerIconService == null ? Modifier.INSTANCE : SuspendingPointerInputFilterKt.pointerInput(composed, icon, Boolean.valueOf(z10), new AnonymousClass1(z10, pointerIconService, icon, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }
        });
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z10);
    }
}
