package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aé\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aÓ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextKt {

    @NotNull
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TextStyle invoke() {
            return TextStyle.INSTANCE.getDefault();
        }
    });

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideTextStyle(@NotNull final TextStyle value, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1772272796);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772272796, i11, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:360)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) composerStartRestartGroup.consume(providableCompositionLocal)).merge(value))}, content, composerStartRestartGroup, (i11 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt.ProvideTextStyle.1
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                TextKt.ProvideTextStyle(value, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0432 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1190Text4IGK_g(@org.jetbrains.annotations.NotNull final java.lang.String r66, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r67, long r68, long r70, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontStyle r72, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontWeight r73, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontFamily r74, long r75, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextDecoration r77, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextAlign r78, long r79, int r81, boolean r82, int r83, int r84, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r85, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r86, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r87, final int r88, final int r89, final int r90) {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1190Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x045b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1191TextIbK3jfQ(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.AnnotatedString r67, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r68, long r69, long r71, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontStyle r73, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontWeight r74, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.font.FontFamily r75, long r76, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextDecoration r78, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextAlign r79, long r80, int r82, boolean r83, int r84, int r85, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r86, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r87, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r88, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instruction units count: 1141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1191TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0385 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1192TextfLXpl1I(final java.lang.String r37, androidx.compose.ui.Modifier r38, long r39, long r41, androidx.compose.ui.text.font.FontStyle r43, androidx.compose.ui.text.font.FontWeight r44, androidx.compose.ui.text.font.FontFamily r45, long r46, androidx.compose.ui.text.style.TextDecoration r48, androidx.compose.ui.text.style.TextAlign r49, long r50, int r52, boolean r53, int r54, kotlin.jvm.functions.Function1 r55, androidx.compose.ui.text.TextStyle r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1192TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0137  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1189Text4IGK_g(final androidx.compose.ui.text.AnnotatedString r37, androidx.compose.ui.Modifier r38, long r39, long r41, androidx.compose.ui.text.font.FontStyle r43, androidx.compose.ui.text.font.FontWeight r44, androidx.compose.ui.text.font.FontFamily r45, long r46, androidx.compose.ui.text.style.TextDecoration r48, androidx.compose.ui.text.style.TextAlign r49, long r50, int r52, boolean r53, int r54, java.util.Map r55, kotlin.jvm.functions.Function1 r56, androidx.compose.ui.text.TextStyle r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1189Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
