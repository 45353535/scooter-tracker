package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory33;", "", "()V", "isFallbackLineSpacingEnabled", "", "layout", "Landroid/text/StaticLayout;", "setLineBreakConfig", "", "builder", "Landroid/text/StaticLayout$Builder;", "lineBreakStyle", "", "lineBreakWordStyle", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class StaticLayoutFactory33 {

    @NotNull
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    @DoNotInline
    public static final boolean isFallbackLineSpacingEnabled(@NotNull StaticLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        return layout.isFallbackLineSpacingEnabled();
    }

    @DoNotInline
    public static final void setLineBreakConfig(@NotNull StaticLayout.Builder builder, int lineBreakStyle, int lineBreakWordStyle) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        LineBreakConfig lineBreakConfigBuild = m.a().setLineBreakStyle(lineBreakStyle).setLineBreakWordStyle(lineBreakWordStyle).build();
        Intrinsics.checkNotNullExpressionValue(lineBreakConfigBuild, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(lineBreakConfigBuild);
    }
}
