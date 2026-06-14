package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import lf.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010J\u001a\u0004\u0018\u0001HK\"\u0014\b\u0000\u0010L*\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HN0\u0001\"\u0004\b\u0001\u0010M\"\u0004\b\u0002\u0010N\"\u0006\b\u0003\u0010K\u0018\u00012\b\u0010O\u001a\u0004\u0018\u0001HN2\u0006\u0010P\u001a\u0002HLH\u0080\b¢\u0006\u0002\u0010Q\u001a\"\u0010J\u001a\u0004\u0018\u0001HK\"\u0006\b\u0000\u0010K\u0018\u00012\b\u0010O\u001a\u0004\u0018\u00010\u0003H\u0080\b¢\u0006\u0002\u0010R\u001aI\u0010S\u001a\u00020\u0003\"\u0014\b\u0000\u0010L*\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HN0\u0001\"\u0004\b\u0001\u0010M\"\u0004\b\u0002\u0010N2\b\u0010O\u001a\u0004\u0018\u0001HM2\u0006\u0010P\u001a\u0002HL2\u0006\u0010T\u001a\u00020UH\u0000¢\u0006\u0002\u0010V\u001a\u001f\u0010S\u001a\u0004\u0018\u0001HL\"\u0004\b\u0000\u0010L2\b\u0010O\u001a\u0004\u0018\u0001HLH\u0000¢\u0006\u0002\u0010R\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"(\u0010\u0006\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b0\u0007\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000b\"\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\" \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0005\"\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0005\"\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u000b\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b-\u0010\u000b\"\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001*\u0002018@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u00103\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001*\u0002048@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u00105\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0001*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00107\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001*\u0002088@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u00109\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001*\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010;\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010=\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001*\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010?\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001*\u00020@8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u0010A\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001*\u00020B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010C\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001*\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010E\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001*\u00020F8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010G\"'\u00100\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u0001*\u00020H8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u0010I\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotationRangeListSaver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeSaver", "getAnnotationRangeSaver$annotations", "()V", "BaselineShiftSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "ColorSaver", "Landroidx/compose/ui/graphics/Color;", "FontWeightSaver", "Landroidx/compose/ui/text/font/FontWeight;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleSaver", "Landroidx/compose/ui/text/intl/Locale;", "OffsetSaver", "Landroidx/compose/ui/geometry/Offset;", "ParagraphStyleSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyleSaver", "ShadowSaver", "Landroidx/compose/ui/graphics/Shadow;", "SpanStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyleSaver", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextIndentSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextRangeSaver", "Landroidx/compose/ui/text/TextRange;", "TextUnitSaver", "Landroidx/compose/ui/unit/TextUnit;", "getTextUnitSaver$annotations", "UrlAnnotationSaver", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotationSaver$annotations", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Saver", "Landroidx/compose/ui/geometry/Offset$Companion;", "getSaver", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "restore", "Result", "T", "Original", "Saveable", "value", "saver", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "save", "scope", "Landroidx/compose/runtime/saveable/SaverScope;", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SaversKt {

    @NotNull
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new Function2<SaverScope, AnnotatedString, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull AnnotatedString it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.arrayListOf(SaversKt.save(it.getText()), SaversKt.save(it.getSpanStyles(), SaversKt.AnnotationRangeListSaver, Saver), SaversKt.save(it.getParagraphStyles(), SaversKt.AnnotationRangeListSaver, Saver), SaversKt.save(it.getAnnotations$ui_text_release(), SaversKt.AnnotationRangeListSaver, Saver));
        }
    }, new Function1<Object, AnnotatedString>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotatedString invoke(@NotNull Object it) {
            List list;
            List list2;
            Intrinsics.checkNotNullParameter(it, "it");
            List list3 = (List) it;
            Object obj = list3.get(1);
            Saver saver = SaversKt.AnnotationRangeListSaver;
            Boolean bool = Boolean.FALSE;
            List list4 = null;
            List list5 = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : (List) saver.restore(obj);
            Object obj2 = list3.get(2);
            List list6 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : (List) SaversKt.AnnotationRangeListSaver.restore(obj2);
            Object obj3 = list3.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            Intrinsics.checkNotNull(str);
            if (list5 != null) {
                List list7 = list5;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list = list7;
            } else {
                list = null;
            }
            if (list6 != null) {
                List list8 = list6;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list2 = list8;
            } else {
                list2 = null;
            }
            Object obj4 = list3.get(3);
            Saver saver2 = SaversKt.AnnotationRangeListSaver;
            if (!Intrinsics.areEqual(obj4, bool) && obj4 != null) {
                list4 = (List) saver2.restore(obj4);
            }
            return new AnnotatedString(str, list, list2, list4);
        }
    });

    @NotNull
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new Function2<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull List<? extends AnnotatedString.Range<? extends Object>> it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList arrayList = new ArrayList(it.size());
            int size = it.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.save(it.get(i10), SaversKt.AnnotationRangeSaver, Saver));
            }
            return arrayList;
        }
    }, new Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final List<? extends AnnotatedString.Range<? extends Object>> invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                Saver saver = SaversKt.AnnotationRangeSaver;
                AnnotatedString.Range range = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    range = (AnnotatedString.Range) saver.restore(obj);
                }
                Intrinsics.checkNotNull(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });

    @NotNull
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new Function2<SaverScope, AnnotatedString.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull AnnotatedString.Range<? extends Object> it) {
            Object objSave;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Object item = it.getItem();
            AnnotationType annotationType = item instanceof ParagraphStyle ? AnnotationType.Paragraph : item instanceof SpanStyle ? AnnotationType.Span : item instanceof VerbatimTtsAnnotation ? AnnotationType.VerbatimTts : item instanceof UrlAnnotation ? AnnotationType.Url : AnnotationType.String;
            int i10 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i10 == 1) {
                Object item2 = it.getItem();
                Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objSave = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), Saver);
            } else if (i10 == 2) {
                Object item3 = it.getItem();
                Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objSave = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), Saver);
            } else if (i10 == 3) {
                Object item4 = it.getItem();
                Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objSave = SaversKt.save((VerbatimTtsAnnotation) item4, SaversKt.VerbatimTtsAnnotationSaver, Saver);
            } else if (i10 == 4) {
                Object item5 = it.getItem();
                Intrinsics.checkNotNull(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objSave = SaversKt.save((UrlAnnotation) item5, SaversKt.UrlAnnotationSaver, Saver);
            } else {
                if (i10 != 5) {
                    throw new m();
                }
                objSave = SaversKt.save(it.getItem());
            }
            return CollectionsKt.arrayListOf(SaversKt.save(annotationType), objSave, SaversKt.save(Integer.valueOf(it.getStart())), SaversKt.save(Integer.valueOf(it.getEnd())), SaversKt.save(it.getTag()));
        }
    }, new Function1<Object, AnnotatedString.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotatedString.Range<? extends Object> invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            AnnotationType annotationType = obj != null ? (AnnotationType) obj : null;
            Intrinsics.checkNotNull(annotationType);
            Object obj2 = list.get(2);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(3);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            Intrinsics.checkNotNull(num2);
            int iIntValue2 = num2.intValue();
            Object obj4 = list.get(4);
            String str = obj4 != null ? (String) obj4 : null;
            Intrinsics.checkNotNull(str);
            int i10 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i10 == 1) {
                Object obj5 = list.get(1);
                Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
                if (!Intrinsics.areEqual(obj5, Boolean.FALSE) && obj5 != null) {
                    paragraphStyleRestore = paragraphStyleSaver.restore(obj5);
                }
                Intrinsics.checkNotNull(paragraphStyleRestore);
                return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
            }
            if (i10 == 2) {
                Object obj6 = list.get(1);
                Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
                if (!Intrinsics.areEqual(obj6, Boolean.FALSE) && obj6 != null) {
                    paragraphStyleRestore = spanStyleSaver.restore(obj6);
                }
                Intrinsics.checkNotNull(paragraphStyleRestore);
                return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
            }
            if (i10 == 3) {
                Object obj7 = list.get(1);
                Saver saver = SaversKt.VerbatimTtsAnnotationSaver;
                if (!Intrinsics.areEqual(obj7, Boolean.FALSE) && obj7 != null) {
                    paragraphStyleRestore = (VerbatimTtsAnnotation) saver.restore(obj7);
                }
                Intrinsics.checkNotNull(paragraphStyleRestore);
                return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new m();
                }
                Object obj8 = list.get(1);
                paragraphStyleRestore = obj8 != null ? (String) obj8 : null;
                Intrinsics.checkNotNull(paragraphStyleRestore);
                return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
            }
            Object obj9 = list.get(1);
            Saver saver2 = SaversKt.UrlAnnotationSaver;
            if (!Intrinsics.areEqual(obj9, Boolean.FALSE) && obj9 != null) {
                paragraphStyleRestore = (UrlAnnotation) saver2.restore(obj9);
            }
            Intrinsics.checkNotNull(paragraphStyleRestore);
            return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
        }
    });

    @NotNull
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new Function2<SaverScope, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull VerbatimTtsAnnotation it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return SaversKt.save(it.getVerbatim());
        }
    }, new Function1<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final VerbatimTtsAnnotation invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new VerbatimTtsAnnotation((String) it);
        }
    });

    @NotNull
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(new Function2<SaverScope, UrlAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull UrlAnnotation it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return SaversKt.save(it.getUrl());
        }
    }, new Function1<Object, UrlAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final UrlAnnotation invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new UrlAnnotation((String) it);
        }
    });

    @NotNull
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new Function2<SaverScope, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull ParagraphStyle it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.arrayListOf(SaversKt.save(it.getTextAlign()), SaversKt.save(it.getTextDirection()), SaversKt.save(TextUnit.m4122boximpl(it.getLineHeight()), SaversKt.getSaver(TextUnit.INSTANCE), Saver), SaversKt.save(it.getTextIndent(), SaversKt.getSaver(TextIndent.INSTANCE), Saver));
        }
    }, new Function1<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ParagraphStyle invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            TextIndent textIndentRestore = null;
            TextAlign textAlign = obj != null ? (TextAlign) obj : null;
            Object obj2 = list.get(1);
            TextDirection textDirection = obj2 != null ? (TextDirection) obj2 : null;
            Object obj3 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.INSTANCE);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : saver.restore(obj3);
            Intrinsics.checkNotNull(textUnitRestore);
            long packedValue = textUnitRestore.getPackedValue();
            Object obj4 = list.get(3);
            Saver<TextIndent, Object> saver2 = SaversKt.getSaver(TextIndent.INSTANCE);
            if (!Intrinsics.areEqual(obj4, bool) && obj4 != null) {
                textIndentRestore = saver2.restore(obj4);
            }
            return new ParagraphStyle(textAlign, textDirection, packedValue, textIndentRestore, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 240, (DefaultConstructorMarker) null);
        }
    });

    @NotNull
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new Function2<SaverScope, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull SpanStyle it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Color colorM1594boximpl = Color.m1594boximpl(it.m3463getColor0d7_KjU());
            Color.Companion companion = Color.INSTANCE;
            Object objSave = SaversKt.save(colorM1594boximpl, SaversKt.getSaver(companion), Saver);
            TextUnit textUnitM4122boximpl = TextUnit.m4122boximpl(it.getFontSize());
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            return CollectionsKt.arrayListOf(objSave, SaversKt.save(textUnitM4122boximpl, SaversKt.getSaver(companion2), Saver), SaversKt.save(it.getFontWeight(), SaversKt.getSaver(FontWeight.INSTANCE), Saver), SaversKt.save(it.getFontStyle()), SaversKt.save(it.getFontSynthesis()), SaversKt.save(-1), SaversKt.save(it.getFontFeatureSettings()), SaversKt.save(TextUnit.m4122boximpl(it.getLetterSpacing()), SaversKt.getSaver(companion2), Saver), SaversKt.save(it.getBaselineShift(), SaversKt.getSaver(BaselineShift.INSTANCE), Saver), SaversKt.save(it.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.INSTANCE), Saver), SaversKt.save(it.getLocaleList(), SaversKt.getSaver(LocaleList.INSTANCE), Saver), SaversKt.save(Color.m1594boximpl(it.getBackground()), SaversKt.getSaver(companion), Saver), SaversKt.save(it.getTextDecoration(), SaversKt.getSaver(TextDecoration.INSTANCE), Saver), SaversKt.save(it.getShadow(), SaversKt.getSaver(Shadow.INSTANCE), Saver));
        }
    }, new Function1<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final SpanStyle invoke(@NotNull Object it) {
            Shadow shadowRestore;
            BaselineShift baselineShift;
            long j10;
            String str;
            FontStyle fontStyle;
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Color.Companion companion = Color.INSTANCE;
            Saver<Color, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            Color colorRestore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(colorRestore);
            long jM1614unboximpl = colorRestore.m1614unboximpl();
            Object obj2 = list.get(1);
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            TextUnit textUnitRestore = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : SaversKt.getSaver(companion2).restore(obj2);
            Intrinsics.checkNotNull(textUnitRestore);
            long packedValue = textUnitRestore.getPackedValue();
            Object obj3 = list.get(2);
            FontWeight fontWeightRestore = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(FontWeight.INSTANCE).restore(obj3);
            Object obj4 = list.get(3);
            FontStyle fontStyle2 = obj4 != null ? (FontStyle) obj4 : null;
            Object obj5 = list.get(4);
            FontSynthesis fontSynthesis = obj5 != null ? (FontSynthesis) obj5 : null;
            Object obj6 = list.get(6);
            String str2 = obj6 != null ? (String) obj6 : null;
            Object obj7 = list.get(7);
            TextUnit textUnitRestore2 = (Intrinsics.areEqual(obj7, bool) || obj7 == null) ? null : SaversKt.getSaver(companion2).restore(obj7);
            Intrinsics.checkNotNull(textUnitRestore2);
            long packedValue2 = textUnitRestore2.getPackedValue();
            Object obj8 = list.get(8);
            BaselineShift baselineShiftRestore = (Intrinsics.areEqual(obj8, bool) || obj8 == null) ? null : SaversKt.getSaver(BaselineShift.INSTANCE).restore(obj8);
            Object obj9 = list.get(9);
            TextGeometricTransform textGeometricTransformRestore = (Intrinsics.areEqual(obj9, bool) || obj9 == null) ? null : SaversKt.getSaver(TextGeometricTransform.INSTANCE).restore(obj9);
            Object obj10 = list.get(10);
            TextGeometricTransform textGeometricTransform = textGeometricTransformRestore;
            LocaleList localeListRestore = (Intrinsics.areEqual(obj10, bool) || obj10 == null) ? null : SaversKt.getSaver(LocaleList.INSTANCE).restore(obj10);
            Object obj11 = list.get(11);
            Color colorRestore2 = (Intrinsics.areEqual(obj11, bool) || obj11 == null) ? null : SaversKt.getSaver(companion).restore(obj11);
            Intrinsics.checkNotNull(colorRestore2);
            long jM1614unboximpl2 = colorRestore2.m1614unboximpl();
            Object obj12 = list.get(12);
            TextDecoration textDecorationRestore = (Intrinsics.areEqual(obj12, bool) || obj12 == null) ? null : SaversKt.getSaver(TextDecoration.INSTANCE).restore(obj12);
            Object obj13 = list.get(13);
            Saver<Shadow, Object> saver2 = SaversKt.getSaver(Shadow.INSTANCE);
            if (Intrinsics.areEqual(obj13, bool) || obj13 == null) {
                String str3 = str2;
                baselineShift = baselineShiftRestore;
                j10 = packedValue;
                str = str3;
                fontStyle = fontStyle2;
                shadowRestore = null;
            } else {
                shadowRestore = saver2.restore(obj13);
                String str4 = str2;
                baselineShift = baselineShiftRestore;
                j10 = packedValue;
                str = str4;
                fontStyle = fontStyle2;
            }
            return new SpanStyle(jM1614unboximpl, j10, fontWeightRestore, fontStyle, fontSynthesis, (FontFamily) null, str, packedValue2, baselineShift, textGeometricTransform, localeListRestore, jM1614unboximpl2, textDecorationRestore, shadowRestore, 32, (DefaultConstructorMarker) null);
        }
    });

    @NotNull
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new Function2<SaverScope, TextDecoration, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextDecoration it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getMask());
        }
    }, new Function1<Object, TextDecoration>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextDecoration invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new TextDecoration(((Integer) it).intValue());
        }
    });

    @NotNull
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new Function2<SaverScope, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextGeometricTransform it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.arrayListOf(Float.valueOf(it.getScaleX()), Float.valueOf(it.getSkewX()));
        }
    }, new Function1<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextGeometricTransform invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });

    @NotNull
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new Function2<SaverScope, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull TextIndent it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            TextUnit textUnitM4122boximpl = TextUnit.m4122boximpl(it.getFirstLine());
            TextUnit.Companion companion = TextUnit.INSTANCE;
            return CollectionsKt.arrayListOf(SaversKt.save(textUnitM4122boximpl, SaversKt.getSaver(companion), Saver), SaversKt.save(TextUnit.m4122boximpl(it.getRestLine()), SaversKt.getSaver(companion), Saver));
        }
    }, new Function1<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextIndent invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            TextUnit.Companion companion = TextUnit.INSTANCE;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = null;
            TextUnit textUnitRestore2 = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(textUnitRestore2);
            long packedValue = textUnitRestore2.getPackedValue();
            Object obj2 = list.get(1);
            Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
            if (!Intrinsics.areEqual(obj2, bool) && obj2 != null) {
                textUnitRestore = saver2.restore(obj2);
            }
            Intrinsics.checkNotNull(textUnitRestore);
            return new TextIndent(packedValue, textUnitRestore.getPackedValue(), null);
        }
    });

    @NotNull
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new Function2<SaverScope, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull FontWeight it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getWeight());
        }
    }, new Function1<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final FontWeight invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FontWeight(((Integer) it).intValue());
        }
    });

    @NotNull
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new Function2<SaverScope, BaselineShift, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, BaselineShift baselineShift) {
            return m3443invoke8a2Sb4w(saverScope, baselineShift.m3752unboximpl());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-8a2Sb4w, reason: not valid java name */
        public final Object m3443invoke8a2Sb4w(@NotNull SaverScope Saver, float f10) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return Float.valueOf(f10);
        }
    }, new Function1<Object, BaselineShift>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
        public final BaselineShift invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BaselineShift.m3746boximpl(BaselineShift.m3747constructorimpl(((Float) it).floatValue()));
        }
    });

    @NotNull
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new Function2<SaverScope, TextRange, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextRange textRange) {
            return m3449invokeFDrldGo(saverScope, textRange.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-FDrldGo, reason: not valid java name */
        public final Object m3449invokeFDrldGo(@NotNull SaverScope Saver, long j10) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return CollectionsKt.arrayListOf((Integer) SaversKt.save(Integer.valueOf(TextRange.m3503getStartimpl(j10))), (Integer) SaversKt.save(Integer.valueOf(TextRange.m3498getEndimpl(j10))));
        }
    }, new Function1<Object, TextRange>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextRange invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Integer num = obj != null ? (Integer) obj : null;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Object obj2 = list.get(1);
            Integer num2 = obj2 != null ? (Integer) obj2 : null;
            Intrinsics.checkNotNull(num2);
            return TextRange.m3491boximpl(TextRangeKt.TextRange(iIntValue, num2.intValue()));
        }
    });

    @NotNull
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new Function2<SaverScope, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull Shadow it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.arrayListOf(SaversKt.save(Color.m1594boximpl(it.getColor()), SaversKt.getSaver(Color.INSTANCE), Saver), SaversKt.save(Offset.m1360boximpl(it.getOffset()), SaversKt.getSaver(Offset.INSTANCE), Saver), SaversKt.save(Float.valueOf(it.getBlurRadius())));
        }
    }, new Function1<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Shadow invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.INSTANCE);
            Boolean bool = Boolean.FALSE;
            Color colorRestore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(colorRestore);
            long jM1614unboximpl = colorRestore.m1614unboximpl();
            Object obj2 = list.get(1);
            Offset offsetRestore = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : SaversKt.getSaver(Offset.INSTANCE).restore(obj2);
            Intrinsics.checkNotNull(offsetRestore);
            long packedValue = offsetRestore.getPackedValue();
            Object obj3 = list.get(2);
            Float f10 = obj3 != null ? (Float) obj3 : null;
            Intrinsics.checkNotNull(f10);
            return new Shadow(jM1614unboximpl, packedValue, f10.floatValue(), null);
        }
    });

    @NotNull
    private static final Saver<Color, Object> ColorSaver = SaverKt.Saver(new Function2<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Color color) {
            return m3445invoke4WTKRHQ(saverScope, color.m1614unboximpl());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m3445invoke4WTKRHQ(@NotNull SaverScope Saver, long j10) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return v.a(j10);
        }
    }, new Function1<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Color.m1594boximpl(Color.m1600constructorimpl(((v) it).g()));
        }
    });

    @NotNull
    private static final Saver<TextUnit, Object> TextUnitSaver = SaverKt.Saver(new Function2<SaverScope, TextUnit, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextUnit textUnit) {
            return m3451invokempE4wyQ(saverScope, textUnit.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-mpE4wyQ, reason: not valid java name */
        public final Object m3451invokempE4wyQ(@NotNull SaverScope Saver, long j10) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return CollectionsKt.arrayListOf(SaversKt.save(Float.valueOf(TextUnit.m4132getValueimpl(j10))), SaversKt.save(TextUnitType.m4157boximpl(TextUnit.m4131getTypeUIouoOA(j10))));
        }
    }, new Function1<Object, TextUnit>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextUnit invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Float f10 = obj != null ? (Float) obj : null;
            Intrinsics.checkNotNull(f10);
            float fFloatValue = f10.floatValue();
            Object obj2 = list.get(1);
            TextUnitType textUnitType = obj2 != null ? (TextUnitType) obj2 : null;
            Intrinsics.checkNotNull(textUnitType);
            return TextUnit.m4122boximpl(TextUnitKt.m4144TextUnitanM5pPY(fFloatValue, textUnitType.getType()));
        }
    });

    @NotNull
    private static final Saver<Offset, Object> OffsetSaver = SaverKt.Saver(new Function2<SaverScope, Offset, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Offset offset) {
            return m3447invokeUv8p0NA(saverScope, offset.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final Object m3447invokeUv8p0NA(@NotNull SaverScope Saver, long j10) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return Offset.m1368equalsimpl0(j10, Offset.INSTANCE.m1386getUnspecifiedF1C5BW0()) ? Boolean.FALSE : CollectionsKt.arrayListOf((Float) SaversKt.save(Float.valueOf(Offset.m1371getXimpl(j10))), (Float) SaversKt.save(Float.valueOf(Offset.m1372getYimpl(j10))));
        }
    }, new Function1<Object, Offset>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Offset invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it, Boolean.FALSE)) {
                return Offset.m1360boximpl(Offset.INSTANCE.m1386getUnspecifiedF1C5BW0());
            }
            List list = (List) it;
            Object obj = list.get(0);
            Float f10 = obj != null ? (Float) obj : null;
            Intrinsics.checkNotNull(f10);
            float fFloatValue = f10.floatValue();
            Object obj2 = list.get(1);
            Float f11 = obj2 != null ? (Float) obj2 : null;
            Intrinsics.checkNotNull(f11);
            return Offset.m1360boximpl(OffsetKt.Offset(fFloatValue, f11.floatValue()));
        }
    });

    @NotNull
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new Function2<SaverScope, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull LocaleList it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            List<Locale> localeList = it.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList.size());
            int size = localeList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.save(localeList.get(i10), SaversKt.getSaver(Locale.INSTANCE), Saver));
            }
            return arrayList;
        }
    }, new Function1<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final LocaleList invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                Saver<Locale, Object> saver = SaversKt.getSaver(Locale.INSTANCE);
                Locale localeRestore = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    localeRestore = saver.restore(obj);
                }
                Intrinsics.checkNotNull(localeRestore);
                arrayList.add(localeRestore);
            }
            return new LocaleList(arrayList);
        }
    });

    @NotNull
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new Function2<SaverScope, Locale, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope Saver, @NotNull Locale it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toLanguageTag();
        }
    }, new Function1<Object, Locale>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Locale invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Locale((String) it);
        }
    });

    @NotNull
    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    private static /* synthetic */ void getAnnotationRangeSaver$annotations() {
    }

    @NotNull
    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    @NotNull
    public static final Saver<TextDecoration, Object> getSaver(@NotNull TextDecoration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextDecorationSaver;
    }

    @NotNull
    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    private static /* synthetic */ void getTextUnitSaver$annotations() {
    }

    private static /* synthetic */ void getUrlAnnotationSaver$annotations() {
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T saver) {
        Intrinsics.checkNotNullParameter(saver, "saver");
        if (Intrinsics.areEqual(saveable, Boolean.FALSE) || saveable == null) {
            return null;
        }
        Result result = (Result) saver.restore(saveable);
        Intrinsics.reifiedOperationMarker(1, "Result");
        return result;
    }

    @Nullable
    public static final <T> T save(@Nullable T t10) {
        return t10;
    }

    @NotNull
    public static final Saver<TextGeometricTransform, Object> getSaver(@NotNull TextGeometricTransform.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextGeometricTransformSaver;
    }

    @NotNull
    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(@Nullable Original original, @NotNull T saver, @NotNull SaverScope scope) {
        Object objSave;
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return (original == null || (objSave = saver.save(scope, original)) == null) ? Boolean.FALSE : objSave;
    }

    @NotNull
    public static final Saver<TextIndent, Object> getSaver(@NotNull TextIndent.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextIndentSaver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == 0) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(1, "Result");
        return obj;
    }

    @NotNull
    public static final Saver<FontWeight, Object> getSaver(@NotNull FontWeight.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return FontWeightSaver;
    }

    @NotNull
    public static final Saver<BaselineShift, Object> getSaver(@NotNull BaselineShift.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return BaselineShiftSaver;
    }

    @NotNull
    public static final Saver<TextRange, Object> getSaver(@NotNull TextRange.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextRangeSaver;
    }

    @NotNull
    public static final Saver<Shadow, Object> getSaver(@NotNull Shadow.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ShadowSaver;
    }

    @NotNull
    public static final Saver<Color, Object> getSaver(@NotNull Color.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ColorSaver;
    }

    @NotNull
    public static final Saver<TextUnit, Object> getSaver(@NotNull TextUnit.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return TextUnitSaver;
    }

    @NotNull
    public static final Saver<Offset, Object> getSaver(@NotNull Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetSaver;
    }

    @NotNull
    public static final Saver<LocaleList, Object> getSaver(@NotNull LocaleList.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return LocaleListSaver;
    }

    @NotNull
    public static final Saver<Locale, Object> getSaver(@NotNull Locale.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return LocaleSaver;
    }
}
