package com.explorestack.protobuf;

import com.explorestack.protobuf.v0;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
interface y0 {
    v0.b forMapMetadata(Object obj);

    Map forMutableMapData(Object obj);

    int getSerializedSize(int i10, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
