package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    UnknownFieldSchema() {
    }

    private final void mergeFrom(B b10, Reader reader, int i10) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b10, reader, i10)) {
        }
    }

    abstract void addFixed32(B b10, int i10, int i11);

    abstract void addFixed64(B b10, int i10, long j10);

    abstract void addGroup(B b10, int i10, T t10);

    abstract void addLengthDelimited(B b10, int i10, ByteString byteString);

    abstract void addVarint(B b10, int i10, long j10);

    abstract B getBuilderFromMessage(Object obj);

    abstract T getFromMessage(Object obj);

    abstract int getSerializedSize(T t10);

    abstract int getSerializedSizeAsMessageSet(T t10);

    abstract void makeImmutable(Object obj);

    abstract T merge(T t10, T t11);

    final boolean mergeOneFieldFrom(B b10, Reader reader, int i10) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b10, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b10, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b10, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b10, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i11 = i10 + 1;
        if (i11 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(bNewBuilder, reader, i11);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b10, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    abstract B newBuilder();

    abstract void setBuilderToMessage(Object obj, B b10);

    public void setRecursionLimit(int i10) {
        recursionLimit = i10;
    }

    abstract void setToMessage(Object obj, T t10);

    abstract boolean shouldDiscardUnknownFields(Reader reader);

    abstract T toImmutable(B b10);

    abstract void writeAsMessageSetTo(T t10, Writer writer) throws IOException;

    abstract void writeTo(T t10, Writer writer) throws IOException;
}
