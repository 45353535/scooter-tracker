package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface p0 extends t1 {
    void c(ByteString byteString);

    ByteString getByteString(int i10);

    Object getRaw(int i10);

    List getUnderlyingElements();

    p0 getUnmodifiableView();
}
