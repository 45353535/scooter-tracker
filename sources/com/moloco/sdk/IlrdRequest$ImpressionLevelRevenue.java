package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.moloco.sdk.IlrdRequest$LevelPlayImpression;
import com.moloco.sdk.IlrdRequest$MaxImpression;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class IlrdRequest$ImpressionLevelRevenue extends GeneratedMessageLite<IlrdRequest$ImpressionLevelRevenue, a> implements h {
    private static final IlrdRequest$ImpressionLevelRevenue DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int LEVELPLAY_FIELD_NUMBER = 4;
    public static final int MAX_FIELD_NUMBER = 3;
    private static volatile Parser<IlrdRequest$ImpressionLevelRevenue> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private Object platform_;
    private int platformCase_ = 0;
    private String sessionId_ = "";
    private String eventId_ = "";

    public static final class a extends GeneratedMessageLite.Builder implements h {
        public a a(String str) {
            copyOnWrite();
            ((IlrdRequest$ImpressionLevelRevenue) this.instance).setEventId(str);
            return this;
        }

        public a b(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
            copyOnWrite();
            ((IlrdRequest$ImpressionLevelRevenue) this.instance).setMax(ilrdRequest$MaxImpression);
            return this;
        }

        public a c(String str) {
            copyOnWrite();
            ((IlrdRequest$ImpressionLevelRevenue) this.instance).setSessionId(str);
            return this;
        }

        private a() {
            super(IlrdRequest$ImpressionLevelRevenue.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        MAX(3),
        LEVELPLAY(4),
        PLATFORM_NOT_SET(0);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53816b;

        b(int i10) {
            this.f53816b = i10;
        }

        public static b g(int i10) {
            if (i10 == 0) {
                return PLATFORM_NOT_SET;
            }
            if (i10 == 3) {
                return MAX;
            }
            if (i10 != 4) {
                return null;
            }
            return LEVELPLAY;
        }
    }

    static {
        IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue = new IlrdRequest$ImpressionLevelRevenue();
        DEFAULT_INSTANCE = ilrdRequest$ImpressionLevelRevenue;
        GeneratedMessageLite.registerDefaultInstance(IlrdRequest$ImpressionLevelRevenue.class, ilrdRequest$ImpressionLevelRevenue);
    }

    private IlrdRequest$ImpressionLevelRevenue() {
    }

    private void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    private void clearLevelplay() {
        if (this.platformCase_ == 4) {
            this.platformCase_ = 0;
            this.platform_ = null;
        }
    }

    private void clearMax() {
        if (this.platformCase_ == 3) {
            this.platformCase_ = 0;
            this.platform_ = null;
        }
    }

    private void clearPlatform() {
        this.platformCase_ = 0;
        this.platform_ = null;
    }

    private void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    public static IlrdRequest$ImpressionLevelRevenue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLevelplay(IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression) {
        ilrdRequest$LevelPlayImpression.getClass();
        if (this.platformCase_ != 4 || this.platform_ == IlrdRequest$LevelPlayImpression.getDefaultInstance()) {
            this.platform_ = ilrdRequest$LevelPlayImpression;
        } else {
            this.platform_ = ((IlrdRequest$LevelPlayImpression.a) IlrdRequest$LevelPlayImpression.newBuilder((IlrdRequest$LevelPlayImpression) this.platform_).mergeFrom(ilrdRequest$LevelPlayImpression)).buildPartial();
        }
        this.platformCase_ = 4;
    }

    private void mergeMax(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
        ilrdRequest$MaxImpression.getClass();
        if (this.platformCase_ != 3 || this.platform_ == IlrdRequest$MaxImpression.getDefaultInstance()) {
            this.platform_ = ilrdRequest$MaxImpression;
        } else {
            this.platform_ = ((IlrdRequest$MaxImpression.a) IlrdRequest$MaxImpression.newBuilder((IlrdRequest$MaxImpression) this.platform_).mergeFrom(ilrdRequest$MaxImpression)).buildPartial();
        }
        this.platformCase_ = 3;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IlrdRequest$ImpressionLevelRevenue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IlrdRequest$ImpressionLevelRevenue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    private void setEventIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventId_ = byteString.toStringUtf8();
    }

    private void setLevelplay(IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression) {
        ilrdRequest$LevelPlayImpression.getClass();
        this.platform_ = ilrdRequest$LevelPlayImpression;
        this.platformCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMax(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
        ilrdRequest$MaxImpression.getClass();
        this.platform_ = ilrdRequest$MaxImpression;
        this.platformCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    private void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (g.f54123a[methodToInvoke.ordinal()]) {
            case 1:
                return new IlrdRequest$ImpressionLevelRevenue();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000", new Object[]{"platform_", "platformCase_", "sessionId_", "eventId_", IlrdRequest$MaxImpression.class, IlrdRequest$LevelPlayImpression.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IlrdRequest$ImpressionLevelRevenue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IlrdRequest$ImpressionLevelRevenue.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getEventId() {
        return this.eventId_;
    }

    public ByteString getEventIdBytes() {
        return ByteString.copyFromUtf8(this.eventId_);
    }

    public IlrdRequest$LevelPlayImpression getLevelplay() {
        return this.platformCase_ == 4 ? (IlrdRequest$LevelPlayImpression) this.platform_ : IlrdRequest$LevelPlayImpression.getDefaultInstance();
    }

    public IlrdRequest$MaxImpression getMax() {
        return this.platformCase_ == 3 ? (IlrdRequest$MaxImpression) this.platform_ : IlrdRequest$MaxImpression.getDefaultInstance();
    }

    public b getPlatformCase() {
        return b.g(this.platformCase_);
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    public boolean hasLevelplay() {
        return this.platformCase_ == 4;
    }

    public boolean hasMax() {
        return this.platformCase_ == 3;
    }

    public static a newBuilder(IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue) {
        return DEFAULT_INSTANCE.createBuilder(ilrdRequest$ImpressionLevelRevenue);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
