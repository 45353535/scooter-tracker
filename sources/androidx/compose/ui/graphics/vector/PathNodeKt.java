package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\f\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\tH\u0082\b¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000e\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000e\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000e\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000e\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000e\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000e\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000e\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u000e\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u000e\"\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#\"\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010#\"\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010#\"\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010#\"\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010#¨\u0006,"}, d2 = {"", "", "args", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "toPathNodes", "(C[F)Ljava/util/List;", "", "numArgs", "Lkotlin/Function1;", "nodeFor", "pathNodesFromArgs", "([FILkotlin/jvm/functions/Function1;)Ljava/util/List;", "RelativeCloseKey", "C", "CloseKey", "RelativeMoveToKey", "MoveToKey", "RelativeLineToKey", "LineToKey", "RelativeHorizontalToKey", "HorizontalToKey", "RelativeVerticalToKey", "VerticalToKey", "RelativeCurveToKey", "CurveToKey", "RelativeReflectiveCurveToKey", "ReflectiveCurveToKey", "RelativeQuadToKey", "QuadToKey", "RelativeReflectiveQuadToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "ArcToKey", "NUM_MOVE_TO_ARGS", "I", "NUM_LINE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "NUM_CURVE_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [float[], java.lang.Object] */
    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i10, Function1<? super float[], ? extends PathNode> function1) {
        d dVarT = g.t(new IntRange(0, fArr.length - i10), i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT, 10));
        Iterator it = dVarT.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            ?? CopyOfRange = ArraysKt.copyOfRange(fArr, iNextInt, iNextInt + i10);
            Object relativeLineTo = (PathNode) function1.invoke(CopyOfRange);
            if ((relativeLineTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.LineTo(CopyOfRange[0], CopyOfRange[1]);
            } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.RelativeLineTo(CopyOfRange[0], CopyOfRange[1]);
            }
            arrayList.add(relativeLineTo);
        }
        return arrayList;
    }

    @NotNull
    public static final List<PathNode> toPathNodes(char c10, @NotNull float[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (c10 == 'z' || c10 == 'Z') {
            return CollectionsKt.listOf(PathNode.Close.INSTANCE);
        }
        if (c10 == 'm') {
            d dVarT = g.t(new IntRange(0, args.length - 2), 2);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT, 10));
            Iterator it = dVarT.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                float[] fArrCopyOfRange = ArraysKt.copyOfRange(args, iNextInt, iNextInt + 2);
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                if (iNextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                }
                arrayList.add(relativeMoveTo);
            }
            return arrayList;
        }
        if (c10 == 'M') {
            d dVarT2 = g.t(new IntRange(0, args.length - 2), 2);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT2, 10));
            Iterator it2 = dVarT2.iterator();
            while (it2.hasNext()) {
                int iNextInt2 = ((IntIterator) it2).nextInt();
                float[] fArrCopyOfRange2 = ArraysKt.copyOfRange(args, iNextInt2, iNextInt2 + 2);
                PathNode moveTo = new PathNode.MoveTo(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                if (iNextInt2 > 0) {
                    moveTo = new PathNode.LineTo(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                }
                arrayList2.add(moveTo);
            }
            return arrayList2;
        }
        if (c10 == 'l') {
            d dVarT3 = g.t(new IntRange(0, args.length - 2), 2);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT3, 10));
            Iterator it3 = dVarT3.iterator();
            while (it3.hasNext()) {
                int iNextInt3 = ((IntIterator) it3).nextInt();
                float[] fArrCopyOfRange3 = ArraysKt.copyOfRange(args, iNextInt3, iNextInt3 + 2);
                arrayList3.add(new PathNode.RelativeLineTo(fArrCopyOfRange3[0], fArrCopyOfRange3[1]));
            }
            return arrayList3;
        }
        if (c10 == 'L') {
            d dVarT4 = g.t(new IntRange(0, args.length - 2), 2);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT4, 10));
            Iterator it4 = dVarT4.iterator();
            while (it4.hasNext()) {
                int iNextInt4 = ((IntIterator) it4).nextInt();
                float[] fArrCopyOfRange4 = ArraysKt.copyOfRange(args, iNextInt4, iNextInt4 + 2);
                arrayList4.add(new PathNode.LineTo(fArrCopyOfRange4[0], fArrCopyOfRange4[1]));
            }
            return arrayList4;
        }
        if (c10 == 'h') {
            d dVarT5 = g.t(new IntRange(0, args.length - 1), 1);
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT5, 10));
            Iterator it5 = dVarT5.iterator();
            while (it5.hasNext()) {
                int iNextInt5 = ((IntIterator) it5).nextInt();
                arrayList5.add(new PathNode.RelativeHorizontalTo(ArraysKt.copyOfRange(args, iNextInt5, iNextInt5 + 1)[0]));
            }
            return arrayList5;
        }
        if (c10 == 'H') {
            d dVarT6 = g.t(new IntRange(0, args.length - 1), 1);
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT6, 10));
            Iterator it6 = dVarT6.iterator();
            while (it6.hasNext()) {
                int iNextInt6 = ((IntIterator) it6).nextInt();
                arrayList6.add(new PathNode.HorizontalTo(ArraysKt.copyOfRange(args, iNextInt6, iNextInt6 + 1)[0]));
            }
            return arrayList6;
        }
        if (c10 == 'v') {
            d dVarT7 = g.t(new IntRange(0, args.length - 1), 1);
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT7, 10));
            Iterator it7 = dVarT7.iterator();
            while (it7.hasNext()) {
                int iNextInt7 = ((IntIterator) it7).nextInt();
                arrayList7.add(new PathNode.RelativeVerticalTo(ArraysKt.copyOfRange(args, iNextInt7, iNextInt7 + 1)[0]));
            }
            return arrayList7;
        }
        if (c10 == 'V') {
            d dVarT8 = g.t(new IntRange(0, args.length - 1), 1);
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT8, 10));
            Iterator it8 = dVarT8.iterator();
            while (it8.hasNext()) {
                int iNextInt8 = ((IntIterator) it8).nextInt();
                arrayList8.add(new PathNode.VerticalTo(ArraysKt.copyOfRange(args, iNextInt8, iNextInt8 + 1)[0]));
            }
            return arrayList8;
        }
        if (c10 == 'c') {
            d dVarT9 = g.t(new IntRange(0, args.length - 6), 6);
            ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT9, 10));
            Iterator it9 = dVarT9.iterator();
            while (it9.hasNext()) {
                int iNextInt9 = ((IntIterator) it9).nextInt();
                float[] fArrCopyOfRange5 = ArraysKt.copyOfRange(args, iNextInt9, iNextInt9 + 6);
                arrayList9.add(new PathNode.RelativeCurveTo(fArrCopyOfRange5[0], fArrCopyOfRange5[1], fArrCopyOfRange5[2], fArrCopyOfRange5[3], fArrCopyOfRange5[4], fArrCopyOfRange5[5]));
            }
            return arrayList9;
        }
        if (c10 == 'C') {
            d dVarT10 = g.t(new IntRange(0, args.length - 6), 6);
            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT10, 10));
            Iterator it10 = dVarT10.iterator();
            while (it10.hasNext()) {
                int iNextInt10 = ((IntIterator) it10).nextInt();
                float[] fArrCopyOfRange6 = ArraysKt.copyOfRange(args, iNextInt10, iNextInt10 + 6);
                arrayList10.add(new PathNode.CurveTo(fArrCopyOfRange6[0], fArrCopyOfRange6[1], fArrCopyOfRange6[2], fArrCopyOfRange6[3], fArrCopyOfRange6[4], fArrCopyOfRange6[5]));
            }
            return arrayList10;
        }
        if (c10 == 's') {
            d dVarT11 = g.t(new IntRange(0, args.length - 4), 4);
            ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT11, 10));
            Iterator it11 = dVarT11.iterator();
            while (it11.hasNext()) {
                int iNextInt11 = ((IntIterator) it11).nextInt();
                float[] fArrCopyOfRange7 = ArraysKt.copyOfRange(args, iNextInt11, iNextInt11 + 4);
                arrayList11.add(new PathNode.RelativeReflectiveCurveTo(fArrCopyOfRange7[0], fArrCopyOfRange7[1], fArrCopyOfRange7[2], fArrCopyOfRange7[3]));
            }
            return arrayList11;
        }
        if (c10 == 'S') {
            d dVarT12 = g.t(new IntRange(0, args.length - 4), 4);
            ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT12, 10));
            Iterator it12 = dVarT12.iterator();
            while (it12.hasNext()) {
                int iNextInt12 = ((IntIterator) it12).nextInt();
                float[] fArrCopyOfRange8 = ArraysKt.copyOfRange(args, iNextInt12, iNextInt12 + 4);
                arrayList12.add(new PathNode.ReflectiveCurveTo(fArrCopyOfRange8[0], fArrCopyOfRange8[1], fArrCopyOfRange8[2], fArrCopyOfRange8[3]));
            }
            return arrayList12;
        }
        if (c10 == 'q') {
            d dVarT13 = g.t(new IntRange(0, args.length - 4), 4);
            ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT13, 10));
            Iterator it13 = dVarT13.iterator();
            while (it13.hasNext()) {
                int iNextInt13 = ((IntIterator) it13).nextInt();
                float[] fArrCopyOfRange9 = ArraysKt.copyOfRange(args, iNextInt13, iNextInt13 + 4);
                arrayList13.add(new PathNode.RelativeQuadTo(fArrCopyOfRange9[0], fArrCopyOfRange9[1], fArrCopyOfRange9[2], fArrCopyOfRange9[3]));
            }
            return arrayList13;
        }
        if (c10 == 'Q') {
            d dVarT14 = g.t(new IntRange(0, args.length - 4), 4);
            ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT14, 10));
            Iterator it14 = dVarT14.iterator();
            while (it14.hasNext()) {
                int iNextInt14 = ((IntIterator) it14).nextInt();
                float[] fArrCopyOfRange10 = ArraysKt.copyOfRange(args, iNextInt14, iNextInt14 + 4);
                arrayList14.add(new PathNode.QuadTo(fArrCopyOfRange10[0], fArrCopyOfRange10[1], fArrCopyOfRange10[2], fArrCopyOfRange10[3]));
            }
            return arrayList14;
        }
        if (c10 == 't') {
            d dVarT15 = g.t(new IntRange(0, args.length - 2), 2);
            ArrayList arrayList15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT15, 10));
            Iterator it15 = dVarT15.iterator();
            while (it15.hasNext()) {
                int iNextInt15 = ((IntIterator) it15).nextInt();
                float[] fArrCopyOfRange11 = ArraysKt.copyOfRange(args, iNextInt15, iNextInt15 + 2);
                arrayList15.add(new PathNode.RelativeReflectiveQuadTo(fArrCopyOfRange11[0], fArrCopyOfRange11[1]));
            }
            return arrayList15;
        }
        if (c10 == 'T') {
            d dVarT16 = g.t(new IntRange(0, args.length - 2), 2);
            ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT16, 10));
            Iterator it16 = dVarT16.iterator();
            while (it16.hasNext()) {
                int iNextInt16 = ((IntIterator) it16).nextInt();
                float[] fArrCopyOfRange12 = ArraysKt.copyOfRange(args, iNextInt16, iNextInt16 + 2);
                arrayList16.add(new PathNode.ReflectiveQuadTo(fArrCopyOfRange12[0], fArrCopyOfRange12[1]));
            }
            return arrayList16;
        }
        if (c10 == 'a') {
            d dVarT17 = g.t(new IntRange(0, args.length - 7), 7);
            ArrayList arrayList17 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT17, 10));
            Iterator it17 = dVarT17.iterator();
            while (it17.hasNext()) {
                int iNextInt17 = ((IntIterator) it17).nextInt();
                float[] fArrCopyOfRange13 = ArraysKt.copyOfRange(args, iNextInt17, iNextInt17 + 7);
                arrayList17.add(new PathNode.RelativeArcTo(fArrCopyOfRange13[0], fArrCopyOfRange13[1], fArrCopyOfRange13[2], Float.compare(fArrCopyOfRange13[3], 0.0f) != 0, Float.compare(fArrCopyOfRange13[4], 0.0f) != 0, fArrCopyOfRange13[5], fArrCopyOfRange13[6]));
            }
            return arrayList17;
        }
        if (c10 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c10);
        }
        d dVarT18 = g.t(new IntRange(0, args.length - 7), 7);
        ArrayList arrayList18 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dVarT18, 10));
        Iterator it18 = dVarT18.iterator();
        while (it18.hasNext()) {
            int iNextInt18 = ((IntIterator) it18).nextInt();
            float[] fArrCopyOfRange14 = ArraysKt.copyOfRange(args, iNextInt18, iNextInt18 + 7);
            arrayList18.add(new PathNode.ArcTo(fArrCopyOfRange14[0], fArrCopyOfRange14[1], fArrCopyOfRange14[2], Float.compare(fArrCopyOfRange14[3], 0.0f) != 0, Float.compare(fArrCopyOfRange14[4], 0.0f) != 0, fArrCopyOfRange14[5], fArrCopyOfRange14[6]));
        }
        return arrayList18;
    }
}
