package com.explorestack.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface p1 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, w wVar);

    Object parseFrom(ByteString byteString);

    Object parseFrom(ByteString byteString, w wVar);

    Object parseFrom(l lVar);

    Object parseFrom(l lVar, w wVar);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, w wVar);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, w wVar);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, w wVar);

    Object parsePartialFrom(l lVar, w wVar);
}
