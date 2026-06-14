package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public interface Message extends MessageLite, MessageOrBuilder {

    public interface Builder extends MessageLite.Builder, MessageOrBuilder {
        Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        Message build();

        Message buildPartial();

        Builder clear();

        Builder clearField(Descriptors.FieldDescriptor fieldDescriptor);

        Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor);

        /* JADX INFO: renamed from: clone */
        Builder mo4427clone();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        Descriptors.Descriptor getDescriptorForType();

        Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor);

        Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, w wVar) throws IOException;

        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        Builder mergeFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException;

        Builder mergeFrom(Message message);

        Builder mergeFrom(l lVar) throws IOException;

        Builder mergeFrom(l lVar, w wVar) throws IOException;

        Builder mergeFrom(InputStream inputStream) throws IOException;

        Builder mergeFrom(InputStream inputStream, w wVar) throws IOException;

        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11, w wVar) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException;

        Builder mergeUnknownFields(r2 r2Var);

        Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor);

        Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj);

        Builder setUnknownFields(r2 r2Var);
    }

    boolean equals(Object obj);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    p1 getParserForType();

    int hashCode();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();

    Builder newBuilderForType();

    Builder toBuilder();

    String toString();
}
