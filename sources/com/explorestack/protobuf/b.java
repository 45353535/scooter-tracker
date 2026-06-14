package com.explorestack.protobuf;

import com.explorestack.protobuf.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements p1 {
    private static final w EMPTY_REGISTRY = w.b();

    private MessageLite a(MessageLite messageLite) throws InvalidProtocolBufferException {
        if (messageLite == null || messageLite.isInitialized()) {
            return messageLite;
        }
        throw b(messageLite).d().setUnfinishedMessage(messageLite);
    }

    private p2 b(MessageLite messageLite) {
        return messageLite instanceof a ? ((a) messageLite).newUninitializedMessageException() : new p2(messageLite);
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseDelimitedFrom(InputStream inputStream, w wVar) throws InvalidProtocolBufferException {
        return a(m4472parsePartialDelimitedFrom(inputStream, wVar));
    }

    /* JADX INFO: renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4472parsePartialDelimitedFrom(InputStream inputStream, w wVar) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return m4477parsePartialFrom((InputStream) new a.AbstractC0320a.C0321a(inputStream, l.D(i10, inputStream)), wVar);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4471parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m4472parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4475parsePartialFrom(l lVar) throws InvalidProtocolBufferException {
        return (MessageLite) parsePartialFrom(lVar, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4474parsePartialFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        l lVarNewCodedInput = byteString.newCodedInput();
        MessageLite messageLite = (MessageLite) parsePartialFrom(lVarNewCodedInput, wVar);
        try {
            lVarNewCodedInput.a(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
        return a((MessageLite) parsePartialFrom(lVar, wVar));
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(l lVar) throws InvalidProtocolBufferException {
        return parseFrom(lVar, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return a(m4474parsePartialFrom(byteString, wVar));
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4473parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return m4474parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return parseFrom(byteString, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4480parsePartialFrom(byte[] bArr, int i10, int i11, w wVar) throws InvalidProtocolBufferException {
        l lVarM = l.m(bArr, i10, i11);
        MessageLite messageLite = (MessageLite) parsePartialFrom(lVarM, wVar);
        try {
            lVarM.a(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        l lVarJ = l.j(byteBuffer);
        MessageLite messageLite = (MessageLite) parsePartialFrom(lVarJ, wVar);
        try {
            lVarJ.a(0);
            return a(messageLite);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messageLite);
        }
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4479parsePartialFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return m4480parsePartialFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4481parsePartialFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return m4480parsePartialFrom(bArr, 0, bArr.length, wVar);
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4478parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return m4480parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4470parseFrom(byte[] bArr, int i10, int i11, w wVar) throws InvalidProtocolBufferException {
        return a(m4480parsePartialFrom(bArr, i10, i11, wVar));
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4477parsePartialFrom(InputStream inputStream, w wVar) throws InvalidProtocolBufferException {
        l lVarG = l.g(inputStream);
        MessageLite messageLite = (MessageLite) parsePartialFrom(lVarG, wVar);
        try {
            lVarG.a(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messageLite);
        }
    }

    /* JADX INFO: renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4469parseFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return m4470parseFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return m4470parseFrom(bArr, 0, bArr.length, wVar);
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(InputStream inputStream, w wVar) throws InvalidProtocolBufferException {
        return a(m4477parsePartialFrom(inputStream, wVar));
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageLite m4476parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return m4477parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.p1
    public MessageLite parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
