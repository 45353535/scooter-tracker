package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g {
    public static final Bitmap a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    if (bitmapDecodeByteArray != null) {
                        return bitmapDecodeByteArray;
                    }
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "BitmapCreationError", "BitmapFactory failed to decode the byte array", null, false, 12, null);
                    return bitmapDecodeByteArray;
                }
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "BitmapCreationError", "Error creating bitmap from base64", e10, false, 8, null);
                return null;
            }
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BitmapCreationError", "Base64 string is null or empty", false, 4, null);
        return null;
    }

    public static final Unit b(ImageBitmap imageBitmap, DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float width = imageBitmap.getWidth();
        float height = imageBitmap.getHeight();
        float fM1440getWidthimpl = Size.m1440getWidthimpl(Canvas.mo2040getSizeNHjbRc());
        float fM1437getHeightimpl = Size.m1437getHeightimpl(Canvas.mo2040getSizeNHjbRc());
        float f10 = 0.0f;
        while (f10 < fM1440getWidthimpl) {
            float f11 = 0.0f;
            while (f11 < fM1437getHeightimpl) {
                androidx.compose.ui.graphics.drawscope.b.A(Canvas, imageBitmap, OffsetKt.Offset(f10, f11), 0.0f, null, null, 0, 60, null);
                f11 += height;
                Canvas = drawScope;
            }
            f10 += width;
            Canvas = drawScope;
        }
        return Unit.f93236a;
    }

    public static final Unit c(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.f93236a;
    }

    public static final Unit d(String str, Function2 function2, int i10, Composer composer, int i11) {
        e(str, function2, composer, i10 | 1);
        return Unit.f93236a;
    }

    public static final void e(final String str, final Function2 content, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(701452993);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(701452993, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.WatermarkComposable (Watermark.kt:79)");
            }
            composerStartRestartGroup.startReplaceableGroup(1831107047);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = f(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ImageBitmap imageBitmap = (ImageBitmap) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1831111327);
            if (imageBitmap == null) {
                content.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.d(str, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1831116600);
            final String str2 = "Watermark Overlay";
            boolean zChanged2 = composerStartRestartGroup.changed("Watermark Overlay");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.c(str2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue2, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics$default);
            if (!androidx.activity.s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(602568249);
            boolean zChanged3 = composerStartRestartGroup.changed(imageBitmap);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.b(imageBitmap, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default2, (Function1) objRememberedValue3, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.g(str, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final ImageBitmap f(String str) {
        Bitmap bitmapA = a(str);
        if (bitmapA != null) {
            return AndroidImageBitmap_androidKt.asImageBitmap(bitmapA);
        }
        return null;
    }

    public static final Unit g(String str, Function2 function2, int i10, Composer composer, int i11) {
        e(str, function2, composer, i10 | 1);
        return Unit.f93236a;
    }
}
