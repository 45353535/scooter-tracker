package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.font.FontVariation;
import com.ironsource.C4240b4;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000e\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\b\u0010\u0015\u001a\u00020\u0016H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-Ej4NQ78", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", C4240b4.i.f42616b, "Ljava/io/File;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "path", "", "assetManager", "Landroid/content/res/AssetManager;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "generateAndroidFontKtForApiCompatibility", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidFontKt {
    @Stable
    @NotNull
    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m3536FontEj4NQ78(@NotNull File file, @NotNull FontWeight weight, int i10, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new Font(file, weight, i10, variationSettings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m3538FontEj4NQ78$default(File file, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m3593getNormal_LCdwA();
        }
        if ((i11 & 8) != 0) {
            settings = FontVariation.INSTANCE.m3608Settings6EWAqTQ(fontWeight, i10, new FontVariation.Setting[0]);
        }
        return m3536FontEj4NQ78(file, fontWeight, i10, settings);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m3539FontMuC2MFs(@NotNull String path, @NotNull AssetManager assetManager, @NotNull FontWeight weight, int i10, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new Font(assetManager, path, weight, i10, variationSettings, null);
    }

    /* JADX INFO: renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m3540FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 8) != 0) {
            i10 = FontStyle.INSTANCE.m3593getNormal_LCdwA();
        }
        if ((i11 & 16) != 0) {
            settings = FontVariation.INSTANCE.m3608Settings6EWAqTQ(fontWeight, i10, new FontVariation.Setting[0]);
        }
        return m3539FontMuC2MFs(str, assetManager, fontWeight, i10, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    @Stable
    @RequiresApi(26)
    @NotNull
    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m3535FontEj4NQ78(@NotNull ParcelFileDescriptor fileDescriptor, @NotNull FontWeight weight, int i10, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new Font(fileDescriptor, weight, i10, variationSettings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m3537FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m3593getNormal_LCdwA();
        }
        if ((i11 & 8) != 0) {
            settings = FontVariation.INSTANCE.m3608Settings6EWAqTQ(fontWeight, i10, new FontVariation.Setting[0]);
        }
        return m3535FontEj4NQ78(parcelFileDescriptor, fontWeight, i10, settings);
    }
}
