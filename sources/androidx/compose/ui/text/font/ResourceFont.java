package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B:\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020#H\u0016R'\u0010\n\u001a\u00020\u000b8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001f\u0010\u0006\u001a\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "getLoadingStrategy-PKNRLFQ", "()I", "I", "getResId", "getStyle-_-LCdwA", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", MenuActionType.COPY, "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;

    @NotNull
    private final FontVariation.Settings variationSettings;

    @NotNull
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, @ExperimentalTextApi FontVariation.Settings settings, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, fontWeight, i11, settings, i12);
    }

    /* JADX INFO: renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m3620copyF3nL8kk$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, FontVariation.Settings settings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i13 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i13 & 4) != 0) {
            i11 = resourceFont.getStyle();
        }
        if ((i13 & 8) != 0) {
            i12 = resourceFont.getLoadingStrategy();
        }
        if ((i13 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i14 = i11;
        return resourceFont.m3623copyF3nL8kk(i10, fontWeight, i14, i12, settings2);
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m3621copyRetOiIg$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i12 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i12 & 4) != 0) {
            i11 = resourceFont.getStyle();
        }
        return resourceFont.m3624copyRetOiIg(i10, fontWeight, i11);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m3622getLoadingStrategyPKNRLFQ$annotations() {
    }

    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m3623copyF3nL8kk(int resId, @NotNull FontWeight weight, int style, int loadingStrategy, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new ResourceFont(resId, weight, style, variationSettings, loadingStrategy, null);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m3624copyRetOiIg(int resId, @NotNull FontWeight weight, int style) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        return m3620copyF3nL8kk$default(this, resId, weight, style, getLoadingStrategy(), null, 16, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && FontStyle.m3588equalsimpl0(getStyle(), resourceFont.getStyle()) && Intrinsics.areEqual(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m3575equalsimpl0(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    @Override // androidx.compose.ui.text.font.Font
    @ExperimentalTextApi
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    @ExperimentalTextApi
    @NotNull
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m3589hashCodeimpl(getStyle())) * 31) + FontLoadingStrategy.m3576hashCodeimpl(getLoadingStrategy())) * 31) + this.variationSettings.hashCode();
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3590toStringimpl(getStyle())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m3577toStringimpl(getLoadingStrategy())) + ')';
    }

    private ResourceFont(int i10, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12) {
        this.resId = i10;
        this.weight = fontWeight;
        this.style = i11;
        this.variationSettings = settings;
        this.loadingStrategy = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        FontWeight normal = (i13 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight;
        int iM3593getNormal_LCdwA = (i13 & 4) != 0 ? FontStyle.INSTANCE.m3593getNormal_LCdwA() : i11;
        this(i10, normal, iM3593getNormal_LCdwA, (i13 & 8) != 0 ? FontVariation.INSTANCE.m3608Settings6EWAqTQ(normal, iM3593getNormal_LCdwA, new FontVariation.Setting[0]) : settings, (i13 & 16) != 0 ? FontLoadingStrategy.INSTANCE.m3579getAsyncPKNRLFQ() : i12, null);
    }
}
