package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.font.FontVariation;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.AndroidFileDescriptorFont, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0010¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\fH\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "getFileDescriptor", "()Landroid/os/ParcelFileDescriptor;", "doLoad", "Landroid/graphics/Typeface;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "doLoad$ui_text_release", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Font extends AndroidPreloadedFont {

    @Nullable
    private final String cacheKey;

    @NotNull
    private final ParcelFileDescriptor fileDescriptor;

    public /* synthetic */ Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, fontWeight, i10, settings);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public android.graphics.Typeface doLoad$ui_text_release(@Nullable Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromFileDescriptor(this.fileDescriptor, context, getVariationSettings());
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @NotNull
    public String toString() {
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3590toStringimpl(getStyle())) + ')';
    }

    public /* synthetic */ Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, (i11 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight, (i11 & 4) != 0 ? FontStyle.INSTANCE.m3593getNormal_LCdwA() : i10, settings, null);
    }

    private Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        super(fontWeight, i10, settings, null);
        this.fileDescriptor = parcelFileDescriptor;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }
}
