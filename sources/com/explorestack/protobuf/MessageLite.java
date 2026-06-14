package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public interface MessageLite {

    public interface Builder extends Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        Builder clear();

        /* JADX INFO: renamed from: clone */
        Builder mo4427clone();

        /* synthetic */ MessageLite getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, w wVar) throws IOException;

        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        Builder mergeFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException;

        Builder mergeFrom(MessageLite messageLite);

        Builder mergeFrom(l lVar) throws IOException;

        Builder mergeFrom(l lVar, w wVar) throws IOException;

        Builder mergeFrom(InputStream inputStream) throws IOException;

        Builder mergeFrom(InputStream inputStream, w wVar) throws IOException;

        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11, w wVar) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException;
    }

    /* synthetic */ MessageLite getDefaultInstanceForType();

    p1 getParserForType();

    int getSerializedSize();

    /* synthetic */ boolean isInitialized();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(n nVar) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
