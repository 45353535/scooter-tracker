package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"nestedScroll", "Landroidx/compose/ui/Modifier;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NestedScrollModifierKt {
    @NotNull
    public static final Modifier nestedScroll(@NotNull Modifier modifier, @NotNull final NestedScrollConnection connection, @Nullable final NestedScrollDispatcher nestedScrollDispatcher) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(connection, "connection");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("nestedScroll");
                inspectorInfo.getProperties().set("connection", connection);
                inspectorInfo.getProperties().set("dispatcher", nestedScrollDispatcher);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll.2
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
                composer.startReplaceableGroup(410346167);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(410346167, i10, -1, "androidx.compose.ui.input.nestedscroll.nestedScroll.<anonymous> (NestedScrollModifier.kt:335)");
                }
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                NestedScrollDispatcher nestedScrollDispatcher2 = nestedScrollDispatcher;
                composer.startReplaceableGroup(100475956);
                if (nestedScrollDispatcher2 == null) {
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new NestedScrollDispatcher();
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    nestedScrollDispatcher2 = (NestedScrollDispatcher) objRememberedValue2;
                }
                composer.endReplaceableGroup();
                NestedScrollConnection nestedScrollConnection = connection;
                composer.startReplaceableGroup(1618982084);
                boolean zChanged = composer.changed(nestedScrollConnection) | composer.changed(nestedScrollDispatcher2) | composer.changed(coroutineScope);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    nestedScrollDispatcher2.setOriginNestedScrollScope$ui_release(coroutineScope);
                    objRememberedValue3 = new NestedScrollModifierLocal(nestedScrollDispatcher2, nestedScrollConnection);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                NestedScrollModifierLocal nestedScrollModifierLocal = (NestedScrollModifierLocal) objRememberedValue3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return nestedScrollModifierLocal;
            }
        });
    }

    public static /* synthetic */ Modifier nestedScroll$default(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return nestedScroll(modifier, nestedScrollConnection, nestedScrollDispatcher);
    }
}
