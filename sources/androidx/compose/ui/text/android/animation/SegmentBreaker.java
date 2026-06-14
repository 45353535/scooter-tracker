package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "()V", "breakInWords", "", "", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "breakOffsets", "segmentType", "Landroidx/compose/ui/text/android/animation/SegmentType;", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/Segment;", "dropSpaces", "", "breakSegmentWithDocument", "breakSegmentWithLine", "breakSegmentWithParagraph", "breakSegmentWithWord", "breakSegments", "breakWithBreakIterator", "text", "", "breaker", "Ljava/text/BreakIterator;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SegmentBreaker {
    public static final int $stable = 0;

    @NotNull
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        CharSequence text = layoutHelper.getLayout().getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(lineInstance, "getLineInstance(Locale.getDefault())");
        List<Integer> listBreakWithBreakIterator = breakWithBreakIterator(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = listBreakWithBreakIterator.size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(Integer.valueOf(listBreakWithBreakIterator.get(i10).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i11 = 0; i11 < paragraphCount; i11++) {
            Bidi bidiAnalyzeBidi = layoutHelper.analyzeBidi(i11);
            if (bidiAnalyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i11);
                int runCount = bidiAnalyzeBidi.getRunCount();
                for (int i12 = 0; i12 < runCount; i12++) {
                    treeSet.add(Integer.valueOf(bidiAnalyzeBidi.getRunStart(i12) + paragraphStart));
                }
            }
        }
        return CollectionsKt.toList(treeSet);
    }

    private final List<Segment> breakSegmentWithChar(LayoutHelper layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
        if (listBreakOffsets.size() != 0) {
            boolean z10 = true;
            if (listBreakOffsets.size() != 1) {
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = CollectionsKt.getLastIndex(listBreakOffsets);
                int i10 = 0;
                while (i10 < lastIndex) {
                    i10++;
                    Integer num2 = listBreakOffsets.get(i10);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (!dropSpaces || iIntValue != iIntValue2 + 1 || !layoutHelper.isLineEndSpace(layout.getText().charAt(iIntValue2))) {
                        int lineForOffset = LayoutCompatKt.getLineForOffset(layout, iIntValue2, z11);
                        boolean z12 = layout.getParagraphDirection(lineForOffset) == -1 ? z10 : z11;
                        boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                        if (zIsRtlCharAt != z12) {
                            z10 = z11;
                        }
                        int iCeil = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z10, z11));
                        int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, zIsRtlCharAt == z12, true));
                        arrayList.add(new Segment(iIntValue2, iIntValue, Math.min(iCeil, iCeil2), layout.getLineTop(lineForOffset), Math.max(iCeil, iCeil2), layout.getLineBottom(lineForOffset)));
                    }
                    arrayList2.add(Unit.f93236a);
                    num = num2;
                    z10 = true;
                    z11 = false;
                }
                return arrayList;
            }
        }
        CollectionsKt.emptyList();
        return arrayList;
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        return CollectionsKt.listOf(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            arrayList.add(new Segment(layout.getLineStart(i10), layout.getLineEnd(i10), dropSpaces ? (int) Math.ceil(layout.getLineLeft(i10)) : 0, layout.getLineTop(i10), dropSpaces ? (int) Math.ceil(layout.getLineRight(i10)) : layout.getWidth(), layout.getLineBottom(i10)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i10 = 0; i10 < paragraphCount; i10++) {
            int paragraphStart = layoutHelper.getParagraphStart(i10);
            int paragraphEnd = layoutHelper.getParagraphEnd(i10);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean dropSpaces) {
        int i10;
        Layout layout = layoutHelper.getLayout();
        int iCeil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (listBreakOffsets.size() != 0) {
            boolean z10 = true;
            if (listBreakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = CollectionsKt.getLastIndex(listBreakOffsets);
                int i11 = 0;
                while (i11 < lastIndex) {
                    i11++;
                    Integer num2 = listBreakOffsets.get(i11);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, iIntValue2, z11);
                    boolean z12 = layout.getParagraphDirection(lineForOffset) == -1 ? z10 : z11;
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z12) {
                        z10 = z11;
                    }
                    int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z10, z11));
                    int iCeil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, zIsRtlCharAt == z12, true));
                    int iMin = Math.min(iCeil2, iCeil3);
                    int iMax = Math.max(iCeil2, iCeil3);
                    if (dropSpaces && iIntValue != 0 && layout.getText().charAt(iIntValue - 1) == ' ') {
                        i10 = lineForOffset;
                        if (layout.getLineEnd(i10) != iIntValue) {
                            if (zIsRtlCharAt) {
                                iMin += iCeil;
                            } else {
                                iMax -= iCeil;
                            }
                        }
                    } else {
                        i10 = lineForOffset;
                    }
                    arrayList.add(new Segment(iIntValue2, iIntValue, iMin, layout.getLineTop(i10), iMax, layout.getLineBottom(i10)));
                    num = num2;
                    z10 = true;
                    z11 = false;
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    private final List<Integer> breakWithBreakIterator(CharSequence text, BreakIterator breaker) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(text, 0, text.length());
        List<Integer> listMutableListOf = CollectionsKt.mutableListOf(0);
        breaker.setText(charSequenceCharacterIterator);
        while (breaker.next() != -1) {
            listMutableListOf.add(Integer.valueOf(breaker.current()));
        }
        return listMutableListOf;
    }

    @NotNull
    public final List<Integer> breakOffsets(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType) {
        int i10 = 0;
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i11 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i11 == 1) {
            return CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
        }
        if (i11 == 2) {
            List<Integer> listMutableListOf = CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i10 < paragraphCount) {
                listMutableListOf.add(Integer.valueOf(layoutHelper.getParagraphEnd(i10)));
                i10++;
            }
            return listMutableListOf;
        }
        if (i11 == 3) {
            List<Integer> listMutableListOf2 = CollectionsKt.mutableListOf(0);
            int lineCount = layout.getLineCount();
            while (i10 < lineCount) {
                listMutableListOf2.add(Integer.valueOf(layout.getLineEnd(i10)));
                i10++;
            }
            return listMutableListOf2;
        }
        if (i11 == 4) {
            return breakInWords(layoutHelper);
        }
        if (i11 != 5) {
            throw new m();
        }
        Intrinsics.checkNotNullExpressionValue(text, "text");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(Locale.getDefault())");
        return breakWithBreakIterator(text, characterInstance);
    }

    @NotNull
    public final List<Segment> breakSegments(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType, boolean dropSpaces) {
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i10 == 1) {
            return breakSegmentWithDocument(layoutHelper);
        }
        if (i10 == 2) {
            return breakSegmentWithParagraph(layoutHelper);
        }
        if (i10 == 3) {
            return breakSegmentWithLine(layoutHelper, dropSpaces);
        }
        if (i10 == 4) {
            return breakSegmentWithWord(layoutHelper, dropSpaces);
        }
        if (i10 == 5) {
            return breakSegmentWithChar(layoutHelper, dropSpaces);
        }
        throw new m();
    }
}
