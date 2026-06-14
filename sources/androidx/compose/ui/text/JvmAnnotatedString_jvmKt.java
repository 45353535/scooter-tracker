package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a,\u0010\b\u001a\u00020\t*\u00020\t2\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0000¨\u0006\f"}, d2 = {"collectRangeTransitions", "", "ranges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", TypedValues.AttributesType.S_TARGET, "Ljava/util/SortedSet;", "", "transform", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<?> range = list.get(i10);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    @NotNull
    public static final AnnotatedString transform(@NotNull final AnnotatedString annotatedString, @NotNull final Function3<? super String, ? super Integer, ? super Integer, String> transform) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        TreeSet treeSetSortedSetOf = SetsKt.sortedSetOf(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getSpanStylesOrNull$ui_text_release(), treeSetSortedSetOf);
        collectRangeTransitions(annotatedString.getParagraphStylesOrNull$ui_text_release(), treeSetSortedSetOf);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), treeSetSortedSetOf);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = "";
        final Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(0, 0));
        CollectionsKt.windowed$default(treeSetSortedSetOf, 2, 0, false, new Function1<List<? extends Integer>, Integer>() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Integer invoke2(@NotNull List<Integer> list) {
                Intrinsics.checkNotNullParameter(list, "<name for destructuring parameter 0>");
                int iIntValue = list.get(0).intValue();
                int iIntValue2 = list.get(1).intValue();
                ref$ObjectRef.f93280b = ((String) ref$ObjectRef.f93280b) + transform.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                return mapMutableMapOf.put(Integer.valueOf(iIntValue2), Integer.valueOf(((String) ref$ObjectRef.f93280b).length()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(List<? extends Integer> list) {
                return invoke2((List<Integer>) list);
            }
        }, 6, null);
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        ArrayList arrayList3 = null;
        if (spanStylesOrNull$ui_text_release != null) {
            arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i10);
                SpanStyle item = range.getItem();
                Object obj = mapMutableMapOf.get(Integer.valueOf(range.getStart()));
                Intrinsics.checkNotNull(obj);
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = mapMutableMapOf.get(Integer.valueOf(range.getEnd()));
                Intrinsics.checkNotNull(obj2);
                arrayList.add(new AnnotatedString.Range(item, iIntValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release != null) {
            arrayList2 = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size2 = paragraphStylesOrNull$ui_text_release.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotatedString.Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i11);
                ParagraphStyle item2 = range2.getItem();
                Object obj3 = mapMutableMapOf.get(Integer.valueOf(range2.getStart()));
                Intrinsics.checkNotNull(obj3);
                int iIntValue2 = ((Number) obj3).intValue();
                Object obj4 = mapMutableMapOf.get(Integer.valueOf(range2.getEnd()));
                Intrinsics.checkNotNull(obj4);
                arrayList2.add(new AnnotatedString.Range(item2, iIntValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList3 = new ArrayList(annotations$ui_text_release.size());
            int size3 = annotations$ui_text_release.size();
            for (int i12 = 0; i12 < size3; i12++) {
                AnnotatedString.Range<? extends Object> range3 = annotations$ui_text_release.get(i12);
                Object item3 = range3.getItem();
                Object obj5 = mapMutableMapOf.get(Integer.valueOf(range3.getStart()));
                Intrinsics.checkNotNull(obj5);
                int iIntValue3 = ((Number) obj5).intValue();
                Object obj6 = mapMutableMapOf.get(Integer.valueOf(range3.getEnd()));
                Intrinsics.checkNotNull(obj6);
                arrayList3.add(new AnnotatedString.Range(item3, iIntValue3, ((Number) obj6).intValue()));
            }
        }
        return new AnnotatedString((String) ref$ObjectRef.f93280b, arrayList, arrayList2, arrayList3);
    }
}
