package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000  2\u00020\u0001:\u0001 R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\u001bX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", y.f66058y, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ComposeUiNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R)\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "getConstructor", "()Lkotlin/jvm/functions/Function0;", "VirtualConstructor", "getVirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier;", "", "SetModifier", "Lkotlin/jvm/functions/Function2;", "getSetModifier", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/unit/Density;", "SetDensity", "getSetDensity", "Landroidx/compose/ui/layout/MeasurePolicy;", "SetMeasurePolicy", "getSetMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "SetLayoutDirection", "getSetLayoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "SetViewConfiguration", "getSetViewConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Function0<ComposeUiNode> Constructor = LayoutNode.INSTANCE.getConstructor$ui_release();

        @NotNull
        private static final Function0<ComposeUiNode> VirtualConstructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };

        @NotNull
        private static final Function2<ComposeUiNode, Modifier, Unit> SetModifier = new Function2<ComposeUiNode, Modifier, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                invoke2(composeUiNode, modifier);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ComposeUiNode composeUiNode, @NotNull Modifier it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setModifier(it);
            }
        };

        @NotNull
        private static final Function2<ComposeUiNode, Density, Unit> SetDensity = new Function2<ComposeUiNode, Density, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Density density) {
                invoke2(composeUiNode, density);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ComposeUiNode composeUiNode, @NotNull Density it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setDensity(it);
            }
        };

        @NotNull
        private static final Function2<ComposeUiNode, MeasurePolicy, Unit> SetMeasurePolicy = new Function2<ComposeUiNode, MeasurePolicy, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                invoke2(composeUiNode, measurePolicy);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ComposeUiNode composeUiNode, @NotNull MeasurePolicy it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setMeasurePolicy(it);
            }
        };

        @NotNull
        private static final Function2<ComposeUiNode, LayoutDirection, Unit> SetLayoutDirection = new Function2<ComposeUiNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                invoke2(composeUiNode, layoutDirection);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ComposeUiNode composeUiNode, @NotNull LayoutDirection it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setLayoutDirection(it);
            }
        };

        @NotNull
        private static final Function2<ComposeUiNode, ViewConfiguration, Unit> SetViewConfiguration = new Function2<ComposeUiNode, ViewConfiguration, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                invoke2(composeUiNode, viewConfiguration);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ComposeUiNode composeUiNode, @NotNull ViewConfiguration it) {
                Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode.setViewConfiguration(it);
            }
        };

        private Companion() {
        }

        @NotNull
        public final Function0<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        @NotNull
        public final Function2<ComposeUiNode, Density, Unit> getSetDensity() {
            return SetDensity;
        }

        @NotNull
        public final Function2<ComposeUiNode, LayoutDirection, Unit> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        @NotNull
        public final Function2<ComposeUiNode, MeasurePolicy, Unit> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        @NotNull
        public final Function2<ComposeUiNode, Modifier, Unit> getSetModifier() {
            return SetModifier;
        }

        @NotNull
        public final Function2<ComposeUiNode, ViewConfiguration, Unit> getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        @NotNull
        public final Function0<ComposeUiNode> getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    @NotNull
    Density getDensity();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    MeasurePolicy getMeasurePolicy();

    @NotNull
    Modifier getModifier();

    @NotNull
    ViewConfiguration getViewConfiguration();

    void setDensity(@NotNull Density density);

    void setLayoutDirection(@NotNull LayoutDirection layoutDirection);

    void setMeasurePolicy(@NotNull MeasurePolicy measurePolicy);

    void setModifier(@NotNull Modifier modifier);

    void setViewConfiguration(@NotNull ViewConfiguration viewConfiguration);
}
