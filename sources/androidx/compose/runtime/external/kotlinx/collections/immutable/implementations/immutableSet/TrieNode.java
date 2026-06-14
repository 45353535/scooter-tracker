package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001_B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0004H\u0002J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u0004H\u0002J#\u0010)\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u0015\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b3JE\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010:J=\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010?J3\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010AJ5\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ6\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ+\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010JJ'\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ,\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J'\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ(\u0010O\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J(\u0010Q\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J;\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010?J5\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ2\u0010T\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ&\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J2\u0010W\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ,\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001a\u00020\tH\u0002J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002J)\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J$\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", ExifInterface.LONGITUDE_EAST, "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$runtime_release", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "owner", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRemoveElementAtIndex", "mutableCollisionRetainAll", "mutableMoveElementToNode", "mutableRemove", "mutableRemoveAll", "mutableRemoveCellAtIndex", "cellIndex", "mutableRetainAll", "mutableUpdateNodeAtIndex", "nodeIndex", "newNode", "nodeAtIndex", "remove", "removeCellAtIndex", "updateNodeAtIndex", y.f66058y, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TrieNode<E> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);
    private int bitmap;

    @NotNull
    private Object[] buffer;

    @Nullable
    private MutabilityOwnership ownedBy;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }

        private Companion() {
        }
    }

    public TrieNode(int i10, @NotNull Object[] buffer, @Nullable MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.bitmap = i10;
        this.buffer = buffer;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int positionMask, E element) {
        return new TrieNode<>(positionMask | this.bitmap, TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(positionMask), element));
    }

    private final int calculateSize() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int iCalculateSize = 0;
        for (Object obj : this.buffer) {
            iCalculateSize += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return iCalculateSize;
    }

    private final TrieNode<E> collisionAdd(E element) {
        return collisionContainsElement(element) ? this : new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, element));
    }

    private final boolean collisionContainsElement(E element) {
        return ArraysKt.contains((E[]) this.buffer, element);
    }

    private final TrieNode<E> collisionRemove(E element) {
        int iIndexOf = ArraysKt.indexOf((E[]) this.buffer, element);
        return iIndexOf != -1 ? collisionRemoveElementAtIndex(iIndexOf) : this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i10) {
        return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i10));
    }

    private final E elementAtIndex(int index) {
        return (E) this.buffer[index];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.bitmap != otherNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.buffer[i10] != otherNode.buffer[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoCellAt(int positionMask) {
        return (positionMask & this.bitmap) == 0;
    }

    private final TrieNode<E> makeNode(int elementHash1, E element1, int elementHash2, E element2, int shift, MutabilityOwnership owner) {
        if (shift > 30) {
            return new TrieNode<>(0, new Object[]{element1, element2}, owner);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(elementHash1, shift);
        int iIndexSegment2 = TrieNodeKt.indexSegment(elementHash2, shift);
        if (iIndexSegment != iIndexSegment2) {
            return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), iIndexSegment < iIndexSegment2 ? new Object[]{element1, element2} : new Object[]{element2, element1}, owner);
        }
        return new TrieNode<>(1 << iIndexSegment, new Object[]{makeNode(elementHash1, element1, elementHash2, element2, shift + 5, owner)}, owner);
    }

    private final TrieNode<E> makeNodeAtIndex(int elementIndex, int newElementHash, E newElement, int shift, MutabilityOwnership owner) {
        E eElementAtIndex = elementAtIndex(elementIndex);
        return makeNode(eElementAtIndex != null ? eElementAtIndex.hashCode() : 0, eElementAtIndex, newElementHash, newElement, shift + 5, owner);
    }

    private final TrieNode<E> moveElementToNode(int elementIndex, int newElementHash, E newElement, int shift) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, null);
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int positionMask, E element, MutabilityOwnership owner) {
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(positionMask);
        if (this.ownedBy != owner) {
            return new TrieNode<>(positionMask | this.bitmap, TrieNodeKt.addElementAtIndex(this.buffer, iIndexOfCellAt$runtime_release, element), owner);
        }
        this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, iIndexOfCellAt$runtime_release, element);
        this.bitmap = positionMask | this.bitmap;
        return this;
    }

    private final TrieNode<E> mutableCollisionAdd(E element, PersistentHashSetBuilder<?> mutator) {
        if (collisionContainsElement(element)) {
            return this;
        }
        mutator.setSize(mutator.size() + 1);
        if (this.ownedBy != mutator.getOwnership()) {
            return new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, element), mutator.getOwnership());
        }
        this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, 0, element);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        Object[] objArr2 = otherNode.buffer;
        int length = this.buffer.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr2.length) {
            CommonFunctionsKt.m1260assert(i11 <= i10);
            if (!collisionContainsElement(objArr2[i10])) {
                objArrCopyOf[length + i11] = objArr2[i10];
                i11++;
                CommonFunctionsKt.m1260assert(length + i11 <= objArrCopyOf.length);
            }
            i10++;
        }
        int length2 = i11 + this.buffer.length;
        intersectionSizeRef.plusAssign(objArrCopyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == otherNode.buffer.length) {
            return otherNode;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        }
        if (!Intrinsics.areEqual(this.ownedBy, owner)) {
            return new TrieNode<>(0, objArrCopyOf, owner);
        }
        this.buffer = objArrCopyOf;
        return this;
    }

    private final TrieNode<E> mutableCollisionRemove(E element, PersistentHashSetBuilder<?> mutator) {
        int iIndexOf = ArraysKt.indexOf((E[]) this.buffer, element);
        if (iIndexOf == -1) {
            return this;
        }
        mutator.setSize(mutator.size() - 1);
        return mutableCollisionRemoveElementAtIndex(iIndexOf, mutator.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return EMPTY;
        }
        Object[] objArr = Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m1260assert(i11 <= i10);
            if (!otherNode.collisionContainsElement(objArr2[i10])) {
                objArr[i11] = objArr2[i10];
                i11++;
                CommonFunctionsKt.m1260assert(i11 <= objArr.length);
            }
            i10++;
        }
        intersectionSizeRef.plusAssign(this.buffer.length - i11);
        if (i11 == 0) {
            return EMPTY;
        }
        if (i11 == 1) {
            return objArr[0];
        }
        if (i11 == this.buffer.length) {
            return this;
        }
        if (i11 == objArr.length) {
            return new TrieNode(0, objArr, owner);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        return new TrieNode(0, objArrCopyOf, owner);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i10, MutabilityOwnership owner) {
        if (this.ownedBy != owner) {
            return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i10), owner);
        }
        this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, otherNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m1260assert(i11 <= i10);
            if (otherNode.collisionContainsElement(objArr2[i10])) {
                objArr[i11] = objArr2[i10];
                i11++;
                CommonFunctionsKt.m1260assert(i11 <= objArr.length);
            }
            i10++;
        }
        intersectionSizeRef.plusAssign(i11);
        if (i11 == 0) {
            return EMPTY;
        }
        if (i11 == 1) {
            return objArr[0];
        }
        if (i11 == this.buffer.length) {
            return this;
        }
        if (i11 == otherNode.buffer.length) {
            return otherNode;
        }
        if (i11 == objArr.length) {
            return new TrieNode(0, objArr, owner);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        return new TrieNode(0, objArrCopyOf, owner);
    }

    private final TrieNode<E> mutableMoveElementToNode(int elementIndex, int newElementHash, E newElement, int shift, MutabilityOwnership owner) {
        if (this.ownedBy == owner) {
            this.buffer[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, owner);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, owner);
        return new TrieNode<>(this.bitmap, objArrCopyOf, owner);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int cellIndex, int positionMask, MutabilityOwnership owner) {
        if (this.ownedBy != owner) {
            return new TrieNode<>(positionMask ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex), owner);
        }
        this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex);
        this.bitmap ^= positionMask;
        return this;
    }

    private final TrieNode<E> mutableUpdateNodeAtIndex(int nodeIndex, TrieNode<E> newNode, MutabilityOwnership owner) {
        Object[] objArr = newNode.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = (TrieNode<E>) obj;
            }
        }
        if (this.ownedBy == owner) {
            this.buffer[nodeIndex] = newNode;
            return this;
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[nodeIndex] = newNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf, owner);
    }

    private final TrieNode<E> nodeAtIndex(int index) {
        Object obj = this.buffer[index];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> removeCellAtIndex(int cellIndex, int positionMask) {
        return new TrieNode<>(positionMask ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex));
    }

    private final TrieNode<E> updateNodeAtIndex(int nodeIndex, TrieNode<E> newNode) {
        Object[] objArr = newNode.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = (TrieNode<E>) obj;
            }
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[nodeIndex] = newNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    @NotNull
    public final TrieNode<E> add(int elementHash, E element, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(iIndexSegment)) {
            return addElementAt(iIndexSegment, element);
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            TrieNode<E> trieNodeCollisionAdd = shift == 30 ? trieNodeNodeAtIndex.collisionAdd(element) : trieNodeNodeAtIndex.add(elementHash, element, shift + 5);
            if (trieNodeNodeAtIndex != trieNodeCollisionAdd) {
                return updateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeCollisionAdd);
            }
        } else if (!Intrinsics.areEqual(element, obj)) {
            return moveElementToNode(iIndexOfCellAt$runtime_release, elementHash, element, shift);
        }
        return this;
    }

    public final boolean contains(int elementHash, E element, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(iIndexSegment)) {
            return false;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(element, obj);
        }
        TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
        return shift == 30 ? trieNodeNodeAtIndex.collisionContainsElement(element) : trieNodeNodeAtIndex.contains(elementHash, element, shift + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@NotNull TrieNode<E> otherNode, int shift) {
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        if (this == otherNode) {
            return true;
        }
        if (shift > 30) {
            for (Object obj : otherNode.buffer) {
                if (!ArraysKt.contains(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i10 = this.bitmap;
        int i11 = otherNode.bitmap;
        int i12 = i10 & i11;
        if (i12 != i11) {
            return false;
        }
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object obj2 = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj3 = otherNode.buffer[iIndexOfCellAt$runtime_release2];
            boolean z10 = obj2 instanceof TrieNode;
            boolean z11 = obj3 instanceof TrieNode;
            if (z10 && z11) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, shift + 5)) {
                    return false;
                }
            } else if (z10) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, shift + 5)) {
                    return false;
                }
            } else if (z11 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i12 ^= iLowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @Nullable
    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime_release(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.bitmap);
    }

    @NotNull
    public final TrieNode<E> mutableAdd(int elementHash, E element, int shift, @NotNull PersistentHashSetBuilder<?> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(iIndexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableAddElementAt(iIndexSegment, element, mutator.getOwnership());
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            TrieNode<E> trieNodeMutableCollisionAdd = shift == 30 ? trieNodeNodeAtIndex.mutableCollisionAdd(element, mutator) : trieNodeNodeAtIndex.mutableAdd(elementHash, element, shift + 5, mutator);
            if (trieNodeNodeAtIndex != trieNodeMutableCollisionAdd) {
                return mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeMutableCollisionAdd, mutator.getOwnership());
            }
        } else if (!Intrinsics.areEqual(element, obj)) {
            mutator.setSize(mutator.size() + 1);
            return mutableMoveElementToNode(iIndexOfCellAt$runtime_release, elementHash, element, shift, mutator.getOwnership());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TrieNode<E> mutableAddAll(@NotNull TrieNode<E> otherNode, int shift, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        Object objMakeNode;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + calculateSize());
            return this;
        }
        if (shift > 30) {
            return mutableCollisionAddAll(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i10 = this.bitmap;
        int i11 = otherNode.bitmap | i10;
        TrieNode<E> trieNode = (i11 == i10 && Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) ? this : new TrieNode<>(i11, new Object[Integer.bitCount(i11)], mutator.getOwnership());
        int i12 = i11;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object[] objArr2 = trieNode.buffer;
            if (hasNoCellAt(iLowestOneBit)) {
                objMakeNode = otherNode.buffer[iIndexOfCellAt$runtime_release2];
            } else if (otherNode.hasNoCellAt(iLowestOneBit)) {
                objMakeNode = this.buffer[iIndexOfCellAt$runtime_release];
            } else {
                objMakeNode = this.buffer[iIndexOfCellAt$runtime_release];
                Object obj = otherNode.buffer[iIndexOfCellAt$runtime_release2];
                boolean z10 = objMakeNode instanceof TrieNode;
                boolean z11 = obj instanceof TrieNode;
                if (z10 && z11) {
                    Intrinsics.checkNotNull(objMakeNode, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    objMakeNode = ((TrieNode) objMakeNode).mutableAddAll((TrieNode) obj, shift + 5, intersectionSizeRef, mutator);
                } else if (z10) {
                    Intrinsics.checkNotNull(objMakeNode, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    TrieNode trieNode2 = (TrieNode) objMakeNode;
                    int size = mutator.size();
                    objMakeNode = trieNode2.mutableAdd(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                    if (mutator.size() == size) {
                        intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                    }
                    Unit unit = Unit.f93236a;
                } else if (z11) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    TrieNode trieNode3 = (TrieNode) obj;
                    int size2 = mutator.size();
                    objMakeNode = trieNode3.mutableAdd(objMakeNode != null ? objMakeNode.hashCode() : 0, objMakeNode, shift + 5, mutator);
                    if (mutator.size() == size2) {
                        intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                    }
                    Unit unit2 = Unit.f93236a;
                } else if (Intrinsics.areEqual(objMakeNode, obj)) {
                    intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                    Unit unit3 = Unit.f93236a;
                } else {
                    objArr = objArr2;
                    objMakeNode = makeNode(objMakeNode != null ? objMakeNode.hashCode() : 0, objMakeNode, obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator.getOwnership());
                    objArr[i13] = objMakeNode;
                    i13++;
                    i12 ^= iLowestOneBit;
                }
            }
            objArr = objArr2;
            objArr[i13] = objMakeNode;
            i13++;
            i12 ^= iLowestOneBit;
        }
        return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
    }

    @NotNull
    public final TrieNode<E> mutableRemove(int elementHash, E element, int shift, @NotNull PersistentHashSetBuilder<?> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (!hasNoCellAt(iIndexSegment)) {
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
            Object obj = this.buffer[iIndexOfCellAt$runtime_release];
            if (obj instanceof TrieNode) {
                TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
                TrieNode<E> trieNodeMutableCollisionRemove = shift == 30 ? trieNodeNodeAtIndex.mutableCollisionRemove(element, mutator) : trieNodeNodeAtIndex.mutableRemove(elementHash, element, shift + 5, mutator);
                if (this.ownedBy == mutator.getOwnership() || trieNodeNodeAtIndex != trieNodeMutableCollisionRemove) {
                    return mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeMutableCollisionRemove, mutator.getOwnership());
                }
            } else if (Intrinsics.areEqual(element, obj)) {
                mutator.setSize(mutator.size() - 1);
                return mutableRemoveCellAtIndex(iIndexOfCellAt$runtime_release, iIndexSegment, mutator.getOwnership());
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mutableRemoveAll(@org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r19, int r20, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r21, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r22) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object mutableRetainAll(@NotNull TrieNode<E> otherNode, int shift, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return this;
        }
        if (shift > 30) {
            return mutableCollisionRetainAll(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i10 = this.bitmap & otherNode.bitmap;
        if (i10 == 0) {
            return EMPTY;
        }
        TrieNode<E> trieNode = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && i10 == this.bitmap) ? this : new TrieNode<>(i10, new Object[Integer.bitCount(i10)], mutator.getOwnership());
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        while (i11 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i11);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object objMutableRetainAll = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj = otherNode.buffer[iIndexOfCellAt$runtime_release2];
            boolean z10 = objMutableRetainAll instanceof TrieNode;
            boolean z11 = obj instanceof TrieNode;
            if (z10 && z11) {
                Intrinsics.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                objMutableRetainAll = ((TrieNode) objMutableRetainAll).mutableRetainAll((TrieNode) obj, shift + 5, intersectionSizeRef, mutator);
            } else if (z10) {
                Intrinsics.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((TrieNode) objMutableRetainAll).contains(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                    objMutableRetainAll = obj;
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (z11) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((TrieNode) obj).contains(objMutableRetainAll != null ? objMutableRetainAll.hashCode() : 0, objMutableRetainAll, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (Intrinsics.areEqual(objMutableRetainAll, obj)) {
                intersectionSizeRef.plusAssign(1);
            } else {
                objMutableRetainAll = EMPTY;
            }
            if (objMutableRetainAll != EMPTY) {
                i12 |= iLowestOneBit;
            }
            trieNode.buffer[i13] = objMutableRetainAll;
            i13++;
            i11 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i12);
        if (i12 == 0) {
            return EMPTY;
        }
        if (i12 == i10) {
            return trieNode.elementsIdentityEquals(this) ? this : trieNode.elementsIdentityEquals(otherNode) ? otherNode : trieNode;
        }
        if (iBitCount == 1 && shift != 0) {
            Object obj2 = trieNode.buffer[trieNode.indexOfCellAt$runtime_release(i12)];
            return obj2 instanceof TrieNode ? new TrieNode(i12, new Object[]{obj2}, mutator.getOwnership()) : obj2;
        }
        Object[] objArr = new Object[iBitCount];
        Object[] objArr2 = trieNode.buffer;
        int i14 = 0;
        int i15 = 0;
        while (i14 < objArr2.length) {
            CommonFunctionsKt.m1260assert(i15 <= i14);
            if (objArr2[i14] != INSTANCE.getEMPTY$runtime_release()) {
                objArr[i15] = objArr2[i14];
                i15++;
                CommonFunctionsKt.m1260assert(i15 <= iBitCount);
            }
            i14++;
        }
        return new TrieNode(i12, objArr, mutator.getOwnership());
    }

    @NotNull
    public final TrieNode<E> remove(int elementHash, E element, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (!hasNoCellAt(iIndexSegment)) {
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
            Object obj = this.buffer[iIndexOfCellAt$runtime_release];
            if (obj instanceof TrieNode) {
                TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
                TrieNode<E> trieNodeCollisionRemove = shift == 30 ? trieNodeNodeAtIndex.collisionRemove(element) : trieNodeNodeAtIndex.remove(elementHash, element, shift + 5);
                if (trieNodeNodeAtIndex != trieNodeCollisionRemove) {
                    return updateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeCollisionRemove);
                }
            } else if (Intrinsics.areEqual(element, obj)) {
                return removeCellAtIndex(iIndexOfCellAt$runtime_release, iIndexSegment);
            }
        }
        return this;
    }

    public final void setBitmap(int i10) {
        this.bitmap = i10;
    }

    public final void setBuffer(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.buffer = objArr;
    }

    public final void setOwnedBy(@Nullable MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i10, @NotNull Object[] buffer) {
        this(i10, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }
}
