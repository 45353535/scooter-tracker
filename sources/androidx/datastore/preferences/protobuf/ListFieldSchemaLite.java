package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    ListFieldSchemaLite() {
    }

    static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j10) {
        return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object obj, long j10) {
        getProtobufList(obj, j10).makeImmutable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.datastore.preferences.protobuf.Internal$ProtobufList, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object obj, Object obj2, long j10) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j10);
        ?? protobufList2 = getProtobufList(obj2, j10);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        ?? r02 = protobufList;
        r02 = protobufList;
        if (size > 0 && size2 > 0) {
            boolean zIsModifiable = protobufList.isModifiable();
            ?? MutableCopyWithCapacity2 = protobufList;
            if (!zIsModifiable) {
                MutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            MutableCopyWithCapacity2.addAll(protobufList2);
            r02 = MutableCopyWithCapacity2;
        }
        if (size > 0) {
            protobufList2 = r02;
        }
        UnsafeUtil.putObject(obj, j10, (Object) protobufList2);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object obj, long j10) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j10);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        UnsafeUtil.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
        return protobufListMutableCopyWithCapacity2;
    }
}
