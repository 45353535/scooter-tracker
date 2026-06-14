package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.constraintlayout.motion.widget.Key;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a©\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Group", "", "name", "", Key.ROTATION, "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", Reporting.EventType.FILL, "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    @androidx.compose.ui.graphics.vector.VectorComposable
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Group(@org.jetbrains.annotations.Nullable java.lang.String r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.Group(java.lang.String, float, float, float, float, float, float, float, java.util.List, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    @VectorComposable
    @Composable
    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m2155Path9cdaXJ4(@NotNull final List<? extends PathNode> pathData, int i10, @Nullable String str, @Nullable Brush brush, float f10, @Nullable Brush brush2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, @Nullable Composer composer, int i13, int i14, final int i15) {
        float f17;
        int i16;
        float f18;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478270750);
        int defaultFillType = (i15 & 2) != 0 ? VectorKt.getDefaultFillType() : i10;
        String str2 = (i15 & 4) != 0 ? "" : str;
        Brush brush3 = (i15 & 8) != 0 ? null : brush;
        float f19 = (i15 & 16) != 0 ? 1.0f : f10;
        Brush brush4 = (i15 & 32) == 0 ? brush2 : null;
        float f20 = (i15 & 64) != 0 ? 1.0f : f11;
        float f21 = (i15 & 128) != 0 ? 0.0f : f12;
        int defaultStrokeLineCap = (i15 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i11;
        int defaultStrokeLineJoin = (i15 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i12;
        float f22 = (i15 & 1024) != 0 ? 4.0f : f13;
        float f23 = (i15 & 2048) != 0 ? 0.0f : f14;
        float f24 = (i15 & 4096) != 0 ? 1.0f : f15;
        float f25 = (i15 & 8192) != 0 ? 0.0f : f16;
        if (ComposerKt.isTraceInProgress()) {
            f17 = f25;
            i16 = defaultFillType;
            f18 = f19;
            i17 = i13;
            i18 = i14;
            ComposerKt.traceEventStart(-1478270750, i17, i18, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:99)");
        } else {
            f17 = f25;
            i16 = defaultFillType;
            f18 = f19;
            i17 = i13;
            i18 = i14;
        }
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PathComponent invoke() {
                return new PathComponent();
            }
        };
        composerStartRestartGroup.startReplaceableGroup(1886828752);
        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final PathComponent invoke() {
                    return vectorComposeKt$Path$1.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
        Updater.m1255setimpl(composerM1248constructorimpl, str2, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str3) {
                invoke2(pathComponent, str3);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @NotNull String it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setName(it);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, pathData, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list) {
                invoke2(pathComponent, list);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @NotNull List<? extends PathNode> it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setPathData(it);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, PathFillType.m1850boximpl(i16), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                m2157invokepweu1eQ(pathComponent, pathFillType.getValue());
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m2157invokepweu1eQ(@NotNull PathComponent set, int i19) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2152setPathFillTypeoQ8Xj4U(i19);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @Nullable Brush brush5) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setFill(brush5);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f26) {
                invoke(pathComponent, f26.floatValue());
                return Unit.f93236a;
            }

            public final void invoke(@NotNull PathComponent set, float f26) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setFillAlpha(f26);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, brush4, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @Nullable Brush brush5) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStroke(brush5);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f26) {
                invoke(pathComponent, f26.floatValue());
                return Unit.f93236a;
            }

            public final void invoke(@NotNull PathComponent set, float f26) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeAlpha(f26);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, Float.valueOf(f21), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f26) {
                invoke(pathComponent, f26.floatValue());
                return Unit.f93236a;
            }

            public final void invoke(@NotNull PathComponent set, float f26) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeLineWidth(f26);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, StrokeJoin.m1930boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                m2158invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m2158invokekLtJ_vA(@NotNull PathComponent set, int i19) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2154setStrokeLineJoinWw9F2mQ(i19);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, StrokeCap.m1920boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                m2156invokeCSYIeUk(pathComponent, strokeCap.getValue());
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m2156invokeCSYIeUk(@NotNull PathComponent set, int i19) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2153setStrokeLineCapBeK7IIE(i19);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, Float.valueOf(f22), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f26) {
                invoke(pathComponent, f26.floatValue());
                return Unit.f93236a;
            }

            public final void invoke(@NotNull PathComponent set, float f26) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeLineMiter(f26);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, Float.valueOf(f23), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f26) {
                invoke(pathComponent, f26.floatValue());
                return Unit.f93236a;
            }

            public final void invoke(@NotNull PathComponent set, float f26) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathStart(f26);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, Float.valueOf(f24), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f26) {
                invoke(pathComponent, f26.floatValue());
                return Unit.f93236a;
            }

            public final void invoke(@NotNull PathComponent set, float f26) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathEnd(f26);
            }
        });
        Updater.m1255setimpl(composerM1248constructorimpl, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f26) {
                invoke(pathComponent, f26.floatValue());
                return Unit.f93236a;
            }

            public final void invoke(@NotNull PathComponent set, float f26) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathOffset(f26);
            }
        });
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final float f26 = f24;
        final float f27 = f23;
        final int i19 = defaultStrokeLineCap;
        final int i20 = i18;
        final String str3 = str2;
        final Brush brush5 = brush3;
        final Brush brush6 = brush4;
        final float f28 = f20;
        final float f29 = f21;
        final int i21 = defaultStrokeLineJoin;
        final float f30 = f22;
        final float f31 = f17;
        final float f32 = f18;
        final int i22 = i17;
        final int i23 = i16;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i24) {
                VectorComposeKt.m2155Path9cdaXJ4(pathData, i23, str3, brush5, f32, brush6, f28, f29, i19, i21, f30, f27, f26, f31, composer2, RecomposeScopeImplKt.updateChangedFlags(i22 | 1), RecomposeScopeImplKt.updateChangedFlags(i20), i15);
            }
        });
    }
}
