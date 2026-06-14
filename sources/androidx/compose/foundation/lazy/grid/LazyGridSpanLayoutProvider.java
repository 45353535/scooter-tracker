package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003+,-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u0006H\u0002ø\u0001\u0000J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006J\u001e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020(H\u0002J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000eø\u0001\u0000¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;)V", "bucketSize", "", "getBucketSize", "()I", "buckets", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "Lkotlin/collections/ArrayList;", "cachedBucket", "", "cachedBucketIndex", "lastLineIndex", "lastLineStartItemIndex", "lastLineStartKnownSpan", "previousDefaultSpans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "value", "slotsPerLine", "getSlotsPerLine", "setSlotsPerLine", "(I)V", "totalSize", "getTotalSize", "getDefaultSpans", "currentSlotsPerLine", "getLineConfiguration", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "lineIndex", "getLineIndexOfItem", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "itemIndex", "getLineIndexOfItem--_Ze7BM", "(I)I", "invalidateCache", "", "spanOf", "maxSpan", "Bucket", "LazyGridItemSpanScopeImpl", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridSpanLayoutProvider {

    @NotNull
    private final ArrayList<Bucket> buckets;

    @NotNull
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;

    @NotNull
    private final LazyGridItemProvider itemProvider;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;

    @NotNull
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "()V", "maxCurrentLineSpan", "", "getMaxCurrentLineSpan", "()I", "setMaxCurrentLineSpan", "(I)V", "maxLineSpan", "getMaxLineSpan", "setMaxLineSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {

        @NotNull
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxCurrentLineSpan(int i10) {
            maxCurrentLineSpan = i10;
        }

        public void setMaxLineSpan(int i10) {
            maxLineSpan = i10;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001e\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "firstItemIndex", "", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "(ILjava/util/List;)V", "getFirstItemIndex", "()I", "getSpans", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;

        @NotNull
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i10, @NotNull List<GridItemSpan> spans) {
            Intrinsics.checkNotNullParameter(spans, "spans");
            this.firstItemIndex = i10;
            this.spans = spans;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        @NotNull
        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(@NotNull LazyGridItemProvider itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.itemProvider = itemProvider;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        int i10 = 0;
        arrayList.add(new Bucket(i10, i10, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = CollectionsKt.emptyList();
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((((double) getTotalSize()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(currentSlotsPerLine);
        for (int i10 = 0; i10 < currentSlotsPerLine; i10++) {
            arrayList.add(GridItemSpan.m542boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void invalidateCache() {
        this.buckets.clear();
        int i10 = 0;
        this.buckets.add(new Bucket(i10, i10, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r11) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    /* JADX INFO: renamed from: getLineIndexOfItem--_Ze7BM, reason: not valid java name */
    public final int m591getLineIndexOfItem_Ze7BM(final int itemIndex) {
        int i10 = 0;
        if (getTotalSize() <= 0) {
            return LineIndex.m600constructorimpl(0);
        }
        if (itemIndex >= getTotalSize()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.itemProvider.getHasCustomSpans()) {
            return LineIndex.m600constructorimpl(itemIndex / this.slotsPerLine);
        }
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.buckets, 0, 0, new Function1<Bucket, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull LazyGridSpanLayoutProvider.Bucket it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getFirstItemIndex() - itemIndex);
            }
        }, 3, (Object) null);
        int i11 = 2;
        if (iBinarySearch$default < 0) {
            iBinarySearch$default = (-iBinarySearch$default) - 2;
        }
        int bucketSize = getBucketSize() * iBinarySearch$default;
        int firstItemIndex = this.buckets.get(iBinarySearch$default).getFirstItemIndex();
        if (firstItemIndex > itemIndex) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = 0;
        while (firstItemIndex < itemIndex) {
            int i13 = firstItemIndex + 1;
            int iSpanOf = spanOf(firstItemIndex, this.slotsPerLine - i12);
            i12 += iSpanOf;
            int i14 = this.slotsPerLine;
            if (i12 >= i14) {
                if (i12 == i14) {
                    bucketSize++;
                    i12 = 0;
                } else {
                    bucketSize++;
                    i12 = iSpanOf;
                }
            }
            if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                this.buckets.add(new Bucket(i13 - (i12 > 0 ? 1 : 0), i10, i11, null));
            }
            firstItemIndex = i13;
        }
        if (i12 + spanOf(itemIndex, this.slotsPerLine - i12) > this.slotsPerLine) {
            bucketSize++;
        }
        return LineIndex.m600constructorimpl(bucketSize);
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.itemProvider.getItemCount();
    }

    public final void setSlotsPerLine(int i10) {
        if (i10 != this.slotsPerLine) {
            this.slotsPerLine = i10;
            invalidateCache();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int spanOf(int itemIndex, int maxSpan) {
        LazyGridItemProvider lazyGridItemProvider = this.itemProvider;
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(maxSpan);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        return g.n(GridItemSpan.m546getCurrentLineSpanimpl(lazyGridItemProvider.mo576getSpan_orMbw(lazyGridItemSpanScopeImpl, itemIndex)), 1, this.slotsPerLine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "", "firstItemIndex", "", "firstItemKnownSpan", "(II)V", "getFirstItemIndex", "()I", "getFirstItemKnownSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int i10, int i11) {
            this.firstItemIndex = i10;
            this.firstItemKnownSpan = i11;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ Bucket(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }
    }
}
