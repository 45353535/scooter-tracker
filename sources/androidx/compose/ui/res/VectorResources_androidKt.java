package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a*\u0010\n\u001a\u00020\u000b*\u00020\f2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t\u001a\u001b\u0010\n\u001a\u00020\u000b*\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"loadVectorResourceInner", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "res", "parser", "Landroid/content/res/XmlResourceParser;", "changingConfigurations", "", "vectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "resId", "id", "(Landroidx/compose/ui/graphics/vector/ImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VectorResources_androidKt {
    @NotNull
    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(@Nullable Resources.Theme theme, @NotNull Resources res, @NotNull XmlResourceParser parser, int i10) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(parser, "parser");
        AttributeSet attrs = Xml.asAttributeSet(parser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(parser, 0, 2, null);
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        ImageVector.Builder builderCreateVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, res, theme, attrs);
        int currentVectorNode = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(parser)) {
            currentVectorNode = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, res, attrs, theme, builderCreateVectorImageBuilder, currentVectorNode);
            parser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(builderCreateVectorImageBuilder.build(), i10);
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i10);
    }

    @Composable
    @NotNull
    public static final ImageVector vectorResource(@NotNull ImageVector.Companion companion, @DrawableRes int i10, @Nullable Composer composer, int i11) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        composer.startReplaceableGroup(44534090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(44534090, i11, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = Resources_androidKt.resources(composer, 0);
        Resources.Theme theme = context.getTheme();
        Object[] objArr = {Integer.valueOf(i10), resources, theme, resources.getConfiguration()};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = vectorResource(companion, theme, resources, i10);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ImageVector imageVector = (ImageVector) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVector;
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i10);
    }

    @NotNull
    public static final ImageVector vectorResource(@NotNull ImageVector.Companion companion, @Nullable Resources.Theme theme, @NotNull Resources res, int i10) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        TypedValue typedValue = new TypedValue();
        res.getValue(i10, typedValue, true);
        XmlResourceParser vectorResource$lambda$1 = res.getXml(i10);
        Intrinsics.checkNotNullExpressionValue(vectorResource$lambda$1, "vectorResource$lambda$1");
        XmlVectorParser_androidKt.seekToStartTag(vectorResource$lambda$1);
        Unit unit = Unit.f93236a;
        Intrinsics.checkNotNullExpressionValue(vectorResource$lambda$1, "res.getXml(resId).apply { seekToStartTag() }");
        return loadVectorResourceInner(theme, res, vectorResource$lambda$1, typedValue.changingConfigurations).getImageVector();
    }
}
