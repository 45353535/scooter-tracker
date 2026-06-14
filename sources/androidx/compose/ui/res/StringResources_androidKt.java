package androidx.compose.ui.res;

import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"pluralStringResource", "", "id", "", "count", "(IILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "(II[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "stringArrayResource", "(ILandroidx/compose/runtime/Composer;I)[Ljava/lang/String;", "stringResource", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringResources_androidKt {
    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String pluralStringResource(@PluralsRes int i10, int i11, @Nullable Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1784741530, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i10, i11);
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityString(id, count)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String[] stringArrayResource(@ArrayRes int i10, @Nullable Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1562162650, i11, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = Resources_androidKt.resources(composer, 0).getStringArray(i10);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(id)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringArray;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String stringResource(@StringRes int i10, @Nullable Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String pluralStringResource(@PluralsRes int i10, int i11, @NotNull Object[] formatArgs, @Nullable Composer composer, int i12) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(523207213, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i10, i11, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String stringResource(@StringRes int i10, @NotNull Object[] formatArgs, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2071230100, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i10, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id, *formatArgs)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
