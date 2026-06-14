package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006JH\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "Landroidx/compose/ui/Modifier;", "", "matchTextFieldWidth", "exposedDropdownSize", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenu", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
public interface ExposedDropdownMenuBoxScope {

    /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuBoxScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x019d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(final androidx.compose.material.ExposedDropdownMenuBoxScope r19, boolean r20, final kotlin.jvm.functions.Function0 r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function3 r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
            /*
                Method dump skipped, instruction units count: 433
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.CC.a(androidx.compose.material.ExposedDropdownMenuBoxScope, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
        }

        public static /* synthetic */ Modifier c(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z10);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @Deprecated
        public static void ExposedDropdownMenu(@NotNull ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z10, @NotNull Function0<Unit> onDismissRequest, @Nullable Modifier modifier, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
            Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
            Intrinsics.checkNotNullParameter(content, "content");
            CC.a(exposedDropdownMenuBoxScope, z10, onDismissRequest, modifier, content, composer, i10, i11);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    void ExposedDropdownMenu(boolean z10, @NotNull Function0<Unit> function0, @Nullable Modifier modifier, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i10, int i11);

    @NotNull
    Modifier exposedDropdownSize(@NotNull Modifier modifier, boolean z10);
}
