package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"imageResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "res", "Landroid/content/res/Resources;", "id", "", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ImageResources_androidKt {
    @NotNull
    public static final ImageBitmap imageResource(@NotNull ImageBitmap.Companion companion, @NotNull Resources res, @DrawableRes int i10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Drawable drawable = res.getDrawable(i10, null);
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Intrinsics.checkNotNullExpressionValue(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
    }

    @Composable
    @NotNull
    public static final ImageBitmap imageResource(@NotNull ImageBitmap.Companion companion, @DrawableRes int i10, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        composer.startReplaceableGroup(-304919470);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, i11, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new TypedValue();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) objRememberedValue;
        context.getResources().getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        Intrinsics.checkNotNull(charSequence);
        String string = charSequence.toString();
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(string);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            objRememberedValue2 = imageResource(companion, resources, i10);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ImageBitmap imageBitmap = (ImageBitmap) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageBitmap;
    }
}
