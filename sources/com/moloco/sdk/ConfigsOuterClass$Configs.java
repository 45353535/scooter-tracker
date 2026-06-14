package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class ConfigsOuterClass$Configs extends GeneratedMessageLite<ConfigsOuterClass$Configs, a> implements MessageLiteOrBuilder {
    public static final int ANDROID_CONFIG_FIELD_NUMBER = 1;
    public static final int COMMON_CONFIGS_FIELD_NUMBER = 3;
    private static final ConfigsOuterClass$Configs DEFAULT_INSTANCE;
    public static final int IOS_CONFIG_FIELD_NUMBER = 2;
    private static volatile Parser<ConfigsOuterClass$Configs> PARSER;
    private int clientConfigsCase_ = 0;
    private Object clientConfigs_;
    private CommonConfigs commonConfigs_;

    public static final class AndroidConfigs extends GeneratedMessageLite<AndroidConfigs, a> implements MessageLiteOrBuilder {
        private static final AndroidConfigs DEFAULT_INSTANCE;
        private static volatile Parser<AndroidConfigs> PARSER;

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(AndroidConfigs.DEFAULT_INSTANCE);
            }
        }

        static {
            AndroidConfigs androidConfigs = new AndroidConfigs();
            DEFAULT_INSTANCE = androidConfigs;
            GeneratedMessageLite.registerDefaultInstance(AndroidConfigs.class, androidConfigs);
        }

        private AndroidConfigs() {
        }

        public static AndroidConfigs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AndroidConfigs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AndroidConfigs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AndroidConfigs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e.f54122a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AndroidConfigs();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AndroidConfigs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AndroidConfigs.class) {
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

        public static a newBuilder(AndroidConfigs androidConfigs) {
            return DEFAULT_INSTANCE.createBuilder(androidConfigs);
        }

        public static AndroidConfigs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AndroidConfigs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AndroidConfigs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(InputStream inputStream) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AndroidConfigs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AndroidConfigs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CommonConfigs extends GeneratedMessageLite<CommonConfigs, a> implements MessageLiteOrBuilder {
        private static final CommonConfigs DEFAULT_INSTANCE;
        public static final int MEDIA_CONFIG_FIELD_NUMBER = 1;
        private static volatile Parser<CommonConfigs> PARSER;
        private MediaConfig mediaConfig_;

        public static final class MediaConfig extends GeneratedMessageLite<MediaConfig, a> implements MessageLiteOrBuilder {
            private static final MediaConfig DEFAULT_INSTANCE;
            public static final int MIN_STREAMING_PLAYABLE_DURATION_ON_TIMEOUT_SECS_FIELD_NUMBER = 2;
            private static volatile Parser<MediaConfig> PARSER = null;
            public static final int STREAMING_CHUNK_SIZE_KILOBYTES_FIELD_NUMBER = 1;
            private int bitField0_;
            private double minStreamingPlayableDurationOnTimeoutSecs_;
            private long streamingChunkSizeKilobytes_;

            public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
                private a() {
                    super(MediaConfig.DEFAULT_INSTANCE);
                }
            }

            static {
                MediaConfig mediaConfig = new MediaConfig();
                DEFAULT_INSTANCE = mediaConfig;
                GeneratedMessageLite.registerDefaultInstance(MediaConfig.class, mediaConfig);
            }

            private MediaConfig() {
            }

            private void clearMinStreamingPlayableDurationOnTimeoutSecs() {
                this.bitField0_ &= -3;
                this.minStreamingPlayableDurationOnTimeoutSecs_ = 0.0d;
            }

            private void clearStreamingChunkSizeKilobytes() {
                this.bitField0_ &= -2;
                this.streamingChunkSizeKilobytes_ = 0L;
            }

            public static MediaConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static MediaConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MediaConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<MediaConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setMinStreamingPlayableDurationOnTimeoutSecs(double d10) {
                this.bitField0_ |= 2;
                this.minStreamingPlayableDurationOnTimeoutSecs_ = d10;
            }

            private void setStreamingChunkSizeKilobytes(long j10) {
                this.bitField0_ |= 1;
                this.streamingChunkSizeKilobytes_ = j10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (e.f54122a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new MediaConfig();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001", new Object[]{"bitField0_", "streamingChunkSizeKilobytes_", "minStreamingPlayableDurationOnTimeoutSecs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<MediaConfig> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (MediaConfig.class) {
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

            public double getMinStreamingPlayableDurationOnTimeoutSecs() {
                return this.minStreamingPlayableDurationOnTimeoutSecs_;
            }

            public long getStreamingChunkSizeKilobytes() {
                return this.streamingChunkSizeKilobytes_;
            }

            public boolean hasMinStreamingPlayableDurationOnTimeoutSecs() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStreamingChunkSizeKilobytes() {
                return (this.bitField0_ & 1) != 0;
            }

            public static a newBuilder(MediaConfig mediaConfig) {
                return DEFAULT_INSTANCE.createBuilder(mediaConfig);
            }

            public static MediaConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static MediaConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static MediaConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(InputStream inputStream) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MediaConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static MediaConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(CommonConfigs.DEFAULT_INSTANCE);
            }
        }

        static {
            CommonConfigs commonConfigs = new CommonConfigs();
            DEFAULT_INSTANCE = commonConfigs;
            GeneratedMessageLite.registerDefaultInstance(CommonConfigs.class, commonConfigs);
        }

        private CommonConfigs() {
        }

        private void clearMediaConfig() {
            this.mediaConfig_ = null;
        }

        public static CommonConfigs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeMediaConfig(MediaConfig mediaConfig) {
            mediaConfig.getClass();
            MediaConfig mediaConfig2 = this.mediaConfig_;
            if (mediaConfig2 == null || mediaConfig2 == MediaConfig.getDefaultInstance()) {
                this.mediaConfig_ = mediaConfig;
            } else {
                this.mediaConfig_ = (MediaConfig) ((MediaConfig.a) MediaConfig.newBuilder(this.mediaConfig_).mergeFrom(mediaConfig)).buildPartial();
            }
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CommonConfigs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommonConfigs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CommonConfigs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMediaConfig(MediaConfig mediaConfig) {
            mediaConfig.getClass();
            this.mediaConfig_ = mediaConfig;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e.f54122a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CommonConfigs();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"mediaConfig_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CommonConfigs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CommonConfigs.class) {
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

        public MediaConfig getMediaConfig() {
            MediaConfig mediaConfig = this.mediaConfig_;
            return mediaConfig == null ? MediaConfig.getDefaultInstance() : mediaConfig;
        }

        public boolean hasMediaConfig() {
            return this.mediaConfig_ != null;
        }

        public static a newBuilder(CommonConfigs commonConfigs) {
            return DEFAULT_INSTANCE.createBuilder(commonConfigs);
        }

        public static CommonConfigs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CommonConfigs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommonConfigs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(InputStream inputStream) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommonConfigs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CommonConfigs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IOSConfigs extends GeneratedMessageLite<IOSConfigs, a> implements MessageLiteOrBuilder {
        private static final IOSConfigs DEFAULT_INSTANCE;
        private static volatile Parser<IOSConfigs> PARSER;

        public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private a() {
                super(IOSConfigs.DEFAULT_INSTANCE);
            }
        }

        static {
            IOSConfigs iOSConfigs = new IOSConfigs();
            DEFAULT_INSTANCE = iOSConfigs;
            GeneratedMessageLite.registerDefaultInstance(IOSConfigs.class, iOSConfigs);
        }

        private IOSConfigs() {
        }

        public static IOSConfigs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IOSConfigs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IOSConfigs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IOSConfigs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e.f54122a[methodToInvoke.ordinal()]) {
                case 1:
                    return new IOSConfigs();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<IOSConfigs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (IOSConfigs.class) {
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

        public static a newBuilder(IOSConfigs iOSConfigs) {
            return DEFAULT_INSTANCE.createBuilder(iOSConfigs);
        }

        public static IOSConfigs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IOSConfigs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IOSConfigs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(InputStream inputStream) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IOSConfigs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IOSConfigs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private a() {
            super(ConfigsOuterClass$Configs.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        ANDROID_CONFIG(1),
        IOS_CONFIG(2),
        CLIENTCONFIGS_NOT_SET(0);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53811b;

        b(int i10) {
            this.f53811b = i10;
        }

        public static b g(int i10) {
            if (i10 == 0) {
                return CLIENTCONFIGS_NOT_SET;
            }
            if (i10 == 1) {
                return ANDROID_CONFIG;
            }
            if (i10 != 2) {
                return null;
            }
            return IOS_CONFIG;
        }
    }

    static {
        ConfigsOuterClass$Configs configsOuterClass$Configs = new ConfigsOuterClass$Configs();
        DEFAULT_INSTANCE = configsOuterClass$Configs;
        GeneratedMessageLite.registerDefaultInstance(ConfigsOuterClass$Configs.class, configsOuterClass$Configs);
    }

    private ConfigsOuterClass$Configs() {
    }

    private void clearAndroidConfig() {
        if (this.clientConfigsCase_ == 1) {
            this.clientConfigsCase_ = 0;
            this.clientConfigs_ = null;
        }
    }

    private void clearClientConfigs() {
        this.clientConfigsCase_ = 0;
        this.clientConfigs_ = null;
    }

    private void clearCommonConfigs() {
        this.commonConfigs_ = null;
    }

    private void clearIosConfig() {
        if (this.clientConfigsCase_ == 2) {
            this.clientConfigsCase_ = 0;
            this.clientConfigs_ = null;
        }
    }

    public static ConfigsOuterClass$Configs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAndroidConfig(AndroidConfigs androidConfigs) {
        androidConfigs.getClass();
        if (this.clientConfigsCase_ != 1 || this.clientConfigs_ == AndroidConfigs.getDefaultInstance()) {
            this.clientConfigs_ = androidConfigs;
        } else {
            this.clientConfigs_ = ((AndroidConfigs.a) AndroidConfigs.newBuilder((AndroidConfigs) this.clientConfigs_).mergeFrom(androidConfigs)).buildPartial();
        }
        this.clientConfigsCase_ = 1;
    }

    private void mergeCommonConfigs(CommonConfigs commonConfigs) {
        commonConfigs.getClass();
        CommonConfigs commonConfigs2 = this.commonConfigs_;
        if (commonConfigs2 == null || commonConfigs2 == CommonConfigs.getDefaultInstance()) {
            this.commonConfigs_ = commonConfigs;
        } else {
            this.commonConfigs_ = (CommonConfigs) ((CommonConfigs.a) CommonConfigs.newBuilder(this.commonConfigs_).mergeFrom(commonConfigs)).buildPartial();
        }
    }

    private void mergeIosConfig(IOSConfigs iOSConfigs) {
        iOSConfigs.getClass();
        if (this.clientConfigsCase_ != 2 || this.clientConfigs_ == IOSConfigs.getDefaultInstance()) {
            this.clientConfigs_ = iOSConfigs;
        } else {
            this.clientConfigs_ = ((IOSConfigs.a) IOSConfigs.newBuilder((IOSConfigs) this.clientConfigs_).mergeFrom(iOSConfigs)).buildPartial();
        }
        this.clientConfigsCase_ = 2;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigsOuterClass$Configs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigsOuterClass$Configs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ConfigsOuterClass$Configs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidConfig(AndroidConfigs androidConfigs) {
        androidConfigs.getClass();
        this.clientConfigs_ = androidConfigs;
        this.clientConfigsCase_ = 1;
    }

    private void setCommonConfigs(CommonConfigs commonConfigs) {
        commonConfigs.getClass();
        this.commonConfigs_ = commonConfigs;
    }

    private void setIosConfig(IOSConfigs iOSConfigs) {
        iOSConfigs.getClass();
        this.clientConfigs_ = iOSConfigs;
        this.clientConfigsCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (e.f54122a[methodToInvoke.ordinal()]) {
            case 1:
                return new ConfigsOuterClass$Configs();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\t", new Object[]{"clientConfigs_", "clientConfigsCase_", AndroidConfigs.class, IOSConfigs.class, "commonConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ConfigsOuterClass$Configs> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ConfigsOuterClass$Configs.class) {
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

    public AndroidConfigs getAndroidConfig() {
        return this.clientConfigsCase_ == 1 ? (AndroidConfigs) this.clientConfigs_ : AndroidConfigs.getDefaultInstance();
    }

    public b getClientConfigsCase() {
        return b.g(this.clientConfigsCase_);
    }

    public CommonConfigs getCommonConfigs() {
        CommonConfigs commonConfigs = this.commonConfigs_;
        return commonConfigs == null ? CommonConfigs.getDefaultInstance() : commonConfigs;
    }

    public IOSConfigs getIosConfig() {
        return this.clientConfigsCase_ == 2 ? (IOSConfigs) this.clientConfigs_ : IOSConfigs.getDefaultInstance();
    }

    public boolean hasAndroidConfig() {
        return this.clientConfigsCase_ == 1;
    }

    public boolean hasCommonConfigs() {
        return this.commonConfigs_ != null;
    }

    public boolean hasIosConfig() {
        return this.clientConfigsCase_ == 2;
    }

    public static a newBuilder(ConfigsOuterClass$Configs configsOuterClass$Configs) {
        return DEFAULT_INSTANCE.createBuilder(configsOuterClass$Configs);
    }

    public static ConfigsOuterClass$Configs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ConfigsOuterClass$Configs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfigsOuterClass$Configs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(InputStream inputStream) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigsOuterClass$Configs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ConfigsOuterClass$Configs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
