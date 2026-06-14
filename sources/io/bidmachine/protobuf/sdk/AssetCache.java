package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AssetCache extends h0 implements AssetCacheOrBuilder {
    private static final AssetCache DEFAULT_INSTANCE = new AssetCache();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AssetCache.1
        @Override // com.explorestack.protobuf.p1
        public AssetCache parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new AssetCache(lVar, wVar);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    public static final class CleanConfiguration extends h0 implements CleanConfigurationOrBuilder {
        private static final CleanConfiguration DEFAULT_INSTANCE = new CleanConfiguration();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AssetCache.CleanConfiguration.1
            @Override // com.explorestack.protobuf.p1
            public CleanConfiguration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new CleanConfiguration(lVar, wVar);
            }
        };
        public static final int TRIGGER_ON_CACHING_FIELD_NUMBER = 2;
        public static final int TRIGGER_ON_DISK_ISSUE_FIELD_NUMBER = 3;
        public static final int TRIGGER_ON_STARTUP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private boolean triggerOnCaching_;
        private boolean triggerOnDiskIssue_;
        private boolean triggerOnStartup_;

        public static CleanConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CleanConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CleanConfiguration) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CleanConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CleanConfiguration)) {
                return super.equals(obj);
            }
            CleanConfiguration cleanConfiguration = (CleanConfiguration) obj;
            return getTriggerOnStartup() == cleanConfiguration.getTriggerOnStartup() && getTriggerOnCaching() == cleanConfiguration.getTriggerOnCaching() && getTriggerOnDiskIssue() == cleanConfiguration.getTriggerOnDiskIssue() && this.unknownFields.equals(cleanConfiguration.unknownFields);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            boolean z10 = this.triggerOnStartup_;
            int iE = z10 ? n.e(1, z10) : 0;
            boolean z11 = this.triggerOnCaching_;
            if (z11) {
                iE += n.e(2, z11);
            }
            boolean z12 = this.triggerOnDiskIssue_;
            if (z12) {
                iE += n.e(3, z12);
            }
            int serializedSize = iE + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnCaching() {
            return this.triggerOnCaching_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnDiskIssue() {
            return this.triggerOnDiskIssue_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnStartup() {
            return this.triggerOnStartup_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.d(getTriggerOnStartup())) * 37) + 2) * 53) + j0.d(getTriggerOnCaching())) * 37) + 3) * 53) + j0.d(getTriggerOnDiskIssue())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_fieldAccessorTable.d(CleanConfiguration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new CleanConfiguration();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            boolean z10 = this.triggerOnStartup_;
            if (z10) {
                nVar.n0(1, z10);
            }
            boolean z11 = this.triggerOnCaching_;
            if (z11) {
                nVar.n0(2, z11);
            }
            boolean z12 = this.triggerOnDiskIssue_;
            if (z12) {
                nVar.n0(3, z12);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements CleanConfigurationOrBuilder {
            private boolean triggerOnCaching_;
            private boolean triggerOnDiskIssue_;
            private boolean triggerOnStartup_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearTriggerOnCaching() {
                this.triggerOnCaching_ = false;
                onChanged();
                return this;
            }

            public Builder clearTriggerOnDiskIssue() {
                this.triggerOnDiskIssue_ = false;
                onChanged();
                return this;
            }

            public Builder clearTriggerOnStartup() {
                this.triggerOnStartup_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnCaching() {
                return this.triggerOnCaching_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnDiskIssue() {
                return this.triggerOnDiskIssue_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnStartup() {
                return this.triggerOnStartup_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_fieldAccessorTable.d(CleanConfiguration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setTriggerOnCaching(boolean z10) {
                this.triggerOnCaching_ = z10;
                onChanged();
                return this;
            }

            public Builder setTriggerOnDiskIssue(boolean z10) {
                this.triggerOnDiskIssue_ = z10;
                onChanged();
                return this;
            }

            public Builder setTriggerOnStartup(boolean z10) {
                this.triggerOnStartup_ = z10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public CleanConfiguration build() {
                CleanConfiguration cleanConfigurationBuildPartial = buildPartial();
                if (cleanConfigurationBuildPartial.isInitialized()) {
                    return cleanConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cleanConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public CleanConfiguration buildPartial() {
                CleanConfiguration cleanConfiguration = new CleanConfiguration(this);
                cleanConfiguration.triggerOnStartup_ = this.triggerOnStartup_;
                cleanConfiguration.triggerOnCaching_ = this.triggerOnCaching_;
                cleanConfiguration.triggerOnDiskIssue_ = this.triggerOnDiskIssue_;
                onBuilt();
                return cleanConfiguration;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public CleanConfiguration getDefaultInstanceForType() {
                return CleanConfiguration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            private Builder(h0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.triggerOnStartup_ = false;
                this.triggerOnCaching_ = false;
                this.triggerOnDiskIssue_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CleanConfiguration) {
                    return mergeFrom((CleanConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CleanConfiguration cleanConfiguration) {
                if (cleanConfiguration == CleanConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (cleanConfiguration.getTriggerOnStartup()) {
                    setTriggerOnStartup(cleanConfiguration.getTriggerOnStartup());
                }
                if (cleanConfiguration.getTriggerOnCaching()) {
                    setTriggerOnCaching(cleanConfiguration.getTriggerOnCaching());
                }
                if (cleanConfiguration.getTriggerOnDiskIssue()) {
                    setTriggerOnDiskIssue(cleanConfiguration.getTriggerOnDiskIssue());
                }
                mergeUnknownFields(((h0) cleanConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AssetCache.CleanConfiguration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AssetCache.CleanConfiguration.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AssetCache$CleanConfiguration r3 = (io.bidmachine.protobuf.sdk.AssetCache.CleanConfiguration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.sdk.AssetCache$CleanConfiguration r4 = (io.bidmachine.protobuf.sdk.AssetCache.CleanConfiguration) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AssetCache.CleanConfiguration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AssetCache$CleanConfiguration$Builder");
            }
        }

        public static Builder newBuilder(CleanConfiguration cleanConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cleanConfiguration);
        }

        public static CleanConfiguration parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(byteBuffer, wVar);
        }

        private CleanConfiguration(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CleanConfiguration parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (CleanConfiguration) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static CleanConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public CleanConfiguration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static CleanConfiguration parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private CleanConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CleanConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static CleanConfiguration parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (CleanConfiguration) PARSER.parseFrom(bArr, wVar);
        }

        private CleanConfiguration(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.triggerOnStartup_ = lVar.q();
                            } else if (iK == 16) {
                                this.triggerOnCaching_ = lVar.q();
                            } else if (iK != 24) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.triggerOnDiskIssue_ = lVar.q();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static CleanConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (CleanConfiguration) h0.parseWithIOException(PARSER, inputStream);
        }

        public static CleanConfiguration parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (CleanConfiguration) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static CleanConfiguration parseFrom(l lVar) throws IOException {
            return (CleanConfiguration) h0.parseWithIOException(PARSER, lVar);
        }

        public static CleanConfiguration parseFrom(l lVar, w wVar) throws IOException {
            return (CleanConfiguration) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface CleanConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        boolean getTriggerOnCaching();

        boolean getTriggerOnDiskIssue();

        boolean getTriggerOnStartup();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Configuration extends h0 implements ConfigurationOrBuilder {
        public static final int CLEAN_CONFIGURATION_FIELD_NUMBER = 1;
        public static final int CONNECTION_CONFIGURATION_FIELD_NUMBER = 2;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AssetCache.Configuration.1
            @Override // com.explorestack.protobuf.p1
            public Configuration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Configuration(lVar, wVar);
            }
        };
        public static final int POLICY_CONFIGURATION_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private CleanConfiguration cleanConfiguration_;
        private ConnectionConfiguration connectionConfiguration_;
        private byte memoizedIsInitialized;
        private PolicyConfiguration policyConfiguration_;

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            if (hasCleanConfiguration() != configuration.hasCleanConfiguration()) {
                return false;
            }
            if ((hasCleanConfiguration() && !getCleanConfiguration().equals(configuration.getCleanConfiguration())) || hasConnectionConfiguration() != configuration.hasConnectionConfiguration()) {
                return false;
            }
            if ((!hasConnectionConfiguration() || getConnectionConfiguration().equals(configuration.getConnectionConfiguration())) && hasPolicyConfiguration() == configuration.hasPolicyConfiguration()) {
                return (!hasPolicyConfiguration() || getPolicyConfiguration().equals(configuration.getPolicyConfiguration())) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public CleanConfiguration getCleanConfiguration() {
            CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
            return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public CleanConfigurationOrBuilder getCleanConfigurationOrBuilder() {
            return getCleanConfiguration();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public ConnectionConfiguration getConnectionConfiguration() {
            ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
            return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder() {
            return getConnectionConfiguration();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public PolicyConfiguration getPolicyConfiguration() {
            PolicyConfiguration policyConfiguration = this.policyConfiguration_;
            return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder() {
            return getPolicyConfiguration();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.cleanConfiguration_ != null ? n.G(1, getCleanConfiguration()) : 0;
            if (this.connectionConfiguration_ != null) {
                iG += n.G(2, getConnectionConfiguration());
            }
            if (this.policyConfiguration_ != null) {
                iG += n.G(3, getPolicyConfiguration());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasCleanConfiguration() {
            return this.cleanConfiguration_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasConnectionConfiguration() {
            return this.connectionConfiguration_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasPolicyConfiguration() {
            return this.policyConfiguration_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasCleanConfiguration()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCleanConfiguration().hashCode();
            }
            if (hasConnectionConfiguration()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getConnectionConfiguration().hashCode();
            }
            if (hasPolicyConfiguration()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPolicyConfiguration().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new Configuration();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.cleanConfiguration_ != null) {
                nVar.J0(1, getCleanConfiguration());
            }
            if (this.connectionConfiguration_ != null) {
                nVar.J0(2, getConnectionConfiguration());
            }
            if (this.policyConfiguration_ != null) {
                nVar.J0(3, getPolicyConfiguration());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ConfigurationOrBuilder {
            private a2 cleanConfigurationBuilder_;
            private CleanConfiguration cleanConfiguration_;
            private a2 connectionConfigurationBuilder_;
            private ConnectionConfiguration connectionConfiguration_;
            private a2 policyConfigurationBuilder_;
            private PolicyConfiguration policyConfiguration_;

            private a2 getCleanConfigurationFieldBuilder() {
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfigurationBuilder_ = new a2(getCleanConfiguration(), getParentForChildren(), isClean());
                    this.cleanConfiguration_ = null;
                }
                return this.cleanConfigurationBuilder_;
            }

            private a2 getConnectionConfigurationFieldBuilder() {
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfigurationBuilder_ = new a2(getConnectionConfiguration(), getParentForChildren(), isClean());
                    this.connectionConfiguration_ = null;
                }
                return this.connectionConfigurationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
            }

            private a2 getPolicyConfigurationFieldBuilder() {
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfigurationBuilder_ = new a2(getPolicyConfiguration(), getParentForChildren(), isClean());
                    this.policyConfiguration_ = null;
                }
                return this.policyConfigurationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearCleanConfiguration() {
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfiguration_ = null;
                    onChanged();
                    return this;
                }
                this.cleanConfiguration_ = null;
                this.cleanConfigurationBuilder_ = null;
                return this;
            }

            public Builder clearConnectionConfiguration() {
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfiguration_ = null;
                    onChanged();
                    return this;
                }
                this.connectionConfiguration_ = null;
                this.connectionConfigurationBuilder_ = null;
                return this;
            }

            public Builder clearPolicyConfiguration() {
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfiguration_ = null;
                    onChanged();
                    return this;
                }
                this.policyConfiguration_ = null;
                this.policyConfigurationBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public CleanConfiguration getCleanConfiguration() {
                a2 a2Var = this.cleanConfigurationBuilder_;
                if (a2Var != null) {
                    return (CleanConfiguration) a2Var.e();
                }
                CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
            }

            public CleanConfiguration.Builder getCleanConfigurationBuilder() {
                onChanged();
                return (CleanConfiguration.Builder) getCleanConfigurationFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public CleanConfigurationOrBuilder getCleanConfigurationOrBuilder() {
                a2 a2Var = this.cleanConfigurationBuilder_;
                if (a2Var != null) {
                    return (CleanConfigurationOrBuilder) a2Var.f();
                }
                CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public ConnectionConfiguration getConnectionConfiguration() {
                a2 a2Var = this.connectionConfigurationBuilder_;
                if (a2Var != null) {
                    return (ConnectionConfiguration) a2Var.e();
                }
                ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
            }

            public ConnectionConfiguration.Builder getConnectionConfigurationBuilder() {
                onChanged();
                return (ConnectionConfiguration.Builder) getConnectionConfigurationFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder() {
                a2 a2Var = this.connectionConfigurationBuilder_;
                if (a2Var != null) {
                    return (ConnectionConfigurationOrBuilder) a2Var.f();
                }
                ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public PolicyConfiguration getPolicyConfiguration() {
                a2 a2Var = this.policyConfigurationBuilder_;
                if (a2Var != null) {
                    return (PolicyConfiguration) a2Var.e();
                }
                PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
            }

            public PolicyConfiguration.Builder getPolicyConfigurationBuilder() {
                onChanged();
                return (PolicyConfiguration.Builder) getPolicyConfigurationFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder() {
                a2 a2Var = this.policyConfigurationBuilder_;
                if (a2Var != null) {
                    return (PolicyConfigurationOrBuilder) a2Var.f();
                }
                PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasCleanConfiguration() {
                return (this.cleanConfigurationBuilder_ == null && this.cleanConfiguration_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasConnectionConfiguration() {
                return (this.connectionConfigurationBuilder_ == null && this.connectionConfiguration_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasPolicyConfiguration() {
                return (this.policyConfigurationBuilder_ == null && this.policyConfiguration_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCleanConfiguration(CleanConfiguration cleanConfiguration) {
                a2 a2Var = this.cleanConfigurationBuilder_;
                if (a2Var != null) {
                    a2Var.g(cleanConfiguration);
                    return this;
                }
                CleanConfiguration cleanConfiguration2 = this.cleanConfiguration_;
                if (cleanConfiguration2 != null) {
                    this.cleanConfiguration_ = CleanConfiguration.newBuilder(cleanConfiguration2).mergeFrom(cleanConfiguration).buildPartial();
                } else {
                    this.cleanConfiguration_ = cleanConfiguration;
                }
                onChanged();
                return this;
            }

            public Builder mergeConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
                a2 a2Var = this.connectionConfigurationBuilder_;
                if (a2Var != null) {
                    a2Var.g(connectionConfiguration);
                    return this;
                }
                ConnectionConfiguration connectionConfiguration2 = this.connectionConfiguration_;
                if (connectionConfiguration2 != null) {
                    this.connectionConfiguration_ = ConnectionConfiguration.newBuilder(connectionConfiguration2).mergeFrom(connectionConfiguration).buildPartial();
                } else {
                    this.connectionConfiguration_ = connectionConfiguration;
                }
                onChanged();
                return this;
            }

            public Builder mergePolicyConfiguration(PolicyConfiguration policyConfiguration) {
                a2 a2Var = this.policyConfigurationBuilder_;
                if (a2Var != null) {
                    a2Var.g(policyConfiguration);
                    return this;
                }
                PolicyConfiguration policyConfiguration2 = this.policyConfiguration_;
                if (policyConfiguration2 != null) {
                    this.policyConfiguration_ = PolicyConfiguration.newBuilder(policyConfiguration2).mergeFrom(policyConfiguration).buildPartial();
                } else {
                    this.policyConfiguration_ = policyConfiguration;
                }
                onChanged();
                return this;
            }

            public Builder setCleanConfiguration(CleanConfiguration cleanConfiguration) {
                a2 a2Var = this.cleanConfigurationBuilder_;
                if (a2Var != null) {
                    a2Var.i(cleanConfiguration);
                    return this;
                }
                cleanConfiguration.getClass();
                this.cleanConfiguration_ = cleanConfiguration;
                onChanged();
                return this;
            }

            public Builder setConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
                a2 a2Var = this.connectionConfigurationBuilder_;
                if (a2Var != null) {
                    a2Var.i(connectionConfiguration);
                    return this;
                }
                connectionConfiguration.getClass();
                this.connectionConfiguration_ = connectionConfiguration;
                onChanged();
                return this;
            }

            public Builder setPolicyConfiguration(PolicyConfiguration policyConfiguration) {
                a2 a2Var = this.policyConfigurationBuilder_;
                if (a2Var != null) {
                    a2Var.i(policyConfiguration);
                    return this;
                }
                policyConfiguration.getClass();
                this.policyConfiguration_ = policyConfiguration;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration build() {
                Configuration configurationBuildPartial = buildPartial();
                if (configurationBuildPartial.isInitialized()) {
                    return configurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                a2 a2Var = this.cleanConfigurationBuilder_;
                if (a2Var == null) {
                    configuration.cleanConfiguration_ = this.cleanConfiguration_;
                } else {
                    configuration.cleanConfiguration_ = (CleanConfiguration) a2Var.a();
                }
                a2 a2Var2 = this.connectionConfigurationBuilder_;
                if (a2Var2 == null) {
                    configuration.connectionConfiguration_ = this.connectionConfiguration_;
                } else {
                    configuration.connectionConfiguration_ = (ConnectionConfiguration) a2Var2.a();
                }
                a2 a2Var3 = this.policyConfigurationBuilder_;
                if (a2Var3 == null) {
                    configuration.policyConfiguration_ = this.policyConfiguration_;
                } else {
                    configuration.policyConfiguration_ = (PolicyConfiguration) a2Var3.a();
                }
                onBuilt();
                return configuration;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Configuration getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            private Builder(h0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfiguration_ = null;
                } else {
                    this.cleanConfiguration_ = null;
                    this.cleanConfigurationBuilder_ = null;
                }
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfiguration_ = null;
                } else {
                    this.connectionConfiguration_ = null;
                    this.connectionConfigurationBuilder_ = null;
                }
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfiguration_ = null;
                    return this;
                }
                this.policyConfiguration_ = null;
                this.policyConfigurationBuilder_ = null;
                return this;
            }

            public Builder setCleanConfiguration(CleanConfiguration.Builder builder) {
                a2 a2Var = this.cleanConfigurationBuilder_;
                if (a2Var == null) {
                    this.cleanConfiguration_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setConnectionConfiguration(ConnectionConfiguration.Builder builder) {
                a2 a2Var = this.connectionConfigurationBuilder_;
                if (a2Var == null) {
                    this.connectionConfiguration_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setPolicyConfiguration(PolicyConfiguration.Builder builder) {
                a2 a2Var = this.policyConfigurationBuilder_;
                if (a2Var == null) {
                    this.policyConfiguration_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasCleanConfiguration()) {
                    mergeCleanConfiguration(configuration.getCleanConfiguration());
                }
                if (configuration.hasConnectionConfiguration()) {
                    mergeConnectionConfiguration(configuration.getConnectionConfiguration());
                }
                if (configuration.hasPolicyConfiguration()) {
                    mergePolicyConfiguration(configuration.getPolicyConfiguration());
                }
                mergeUnknownFields(((h0) configuration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AssetCache.Configuration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AssetCache.Configuration.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AssetCache$Configuration r3 = (io.bidmachine.protobuf.sdk.AssetCache.Configuration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.sdk.AssetCache$Configuration r4 = (io.bidmachine.protobuf.sdk.AssetCache.Configuration) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AssetCache.Configuration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AssetCache$Configuration$Builder");
            }
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Configuration(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Configuration) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Configuration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Configuration parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Configuration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Configuration parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Configuration) PARSER.parseFrom(bArr, wVar);
        }

        private Configuration(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = lVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                                    CleanConfiguration.Builder builder = cleanConfiguration != null ? cleanConfiguration.toBuilder() : null;
                                    CleanConfiguration cleanConfiguration2 = (CleanConfiguration) lVar.A(CleanConfiguration.parser(), wVar);
                                    this.cleanConfiguration_ = cleanConfiguration2;
                                    if (builder != null) {
                                        builder.mergeFrom(cleanConfiguration2);
                                        this.cleanConfiguration_ = builder.buildPartial();
                                    }
                                } else if (iK == 18) {
                                    ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                                    ConnectionConfiguration.Builder builder2 = connectionConfiguration != null ? connectionConfiguration.toBuilder() : null;
                                    ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) lVar.A(ConnectionConfiguration.parser(), wVar);
                                    this.connectionConfiguration_ = connectionConfiguration2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(connectionConfiguration2);
                                        this.connectionConfiguration_ = builder2.buildPartial();
                                    }
                                } else if (iK != 26) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                                    PolicyConfiguration.Builder builder3 = policyConfiguration != null ? policyConfiguration.toBuilder() : null;
                                    PolicyConfiguration policyConfiguration2 = (PolicyConfiguration) lVar.A(PolicyConfiguration.parser(), wVar);
                                    this.policyConfiguration_ = policyConfiguration2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(policyConfiguration2);
                                        this.policyConfiguration_ = builder3.buildPartial();
                                    }
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Configuration parseFrom(l lVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, lVar);
        }

        public static Configuration parseFrom(l lVar, w wVar) throws IOException {
            return (Configuration) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        CleanConfiguration getCleanConfiguration();

        CleanConfigurationOrBuilder getCleanConfigurationOrBuilder();

        ConnectionConfiguration getConnectionConfiguration();

        ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        PolicyConfiguration getPolicyConfiguration();

        PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder();

        boolean hasCleanConfiguration();

        boolean hasConnectionConfiguration();

        boolean hasPolicyConfiguration();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class ConnectionConfiguration extends h0 implements ConnectionConfigurationOrBuilder {
        public static final int DOWNLOAD_REQUEST_TIMEOUT_MS_FIELD_NUMBER = 2;
        public static final int HEAD_REQUEST_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private long downloadRequestTimeoutMs_;
        private long headRequestTimeoutMs_;
        private byte memoizedIsInitialized;
        private static final ConnectionConfiguration DEFAULT_INSTANCE = new ConnectionConfiguration();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfiguration.1
            @Override // com.explorestack.protobuf.p1
            public ConnectionConfiguration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new ConnectionConfiguration(lVar, wVar);
            }
        };

        public static ConnectionConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConnectionConfiguration) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectionConfiguration)) {
                return super.equals(obj);
            }
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            return getHeadRequestTimeoutMs() == connectionConfiguration.getHeadRequestTimeoutMs() && getDownloadRequestTimeoutMs() == connectionConfiguration.getDownloadRequestTimeoutMs() && this.unknownFields.equals(connectionConfiguration.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
        public long getDownloadRequestTimeoutMs() {
            return this.downloadRequestTimeoutMs_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
        public long getHeadRequestTimeoutMs() {
            return this.headRequestTimeoutMs_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.headRequestTimeoutMs_;
            int iZ = j10 != 0 ? n.z(1, j10) : 0;
            long j11 = this.downloadRequestTimeoutMs_;
            if (j11 != 0) {
                iZ += n.z(2, j11);
            }
            int serializedSize = iZ + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(getHeadRequestTimeoutMs())) * 37) + 2) * 53) + j0.i(getDownloadRequestTimeoutMs())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_fieldAccessorTable.d(ConnectionConfiguration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new ConnectionConfiguration();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            long j10 = this.headRequestTimeoutMs_;
            if (j10 != 0) {
                nVar.H0(1, j10);
            }
            long j11 = this.downloadRequestTimeoutMs_;
            if (j11 != 0) {
                nVar.H0(2, j11);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ConnectionConfigurationOrBuilder {
            private long downloadRequestTimeoutMs_;
            private long headRequestTimeoutMs_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearDownloadRequestTimeoutMs() {
                this.downloadRequestTimeoutMs_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearHeadRequestTimeoutMs() {
                this.headRequestTimeoutMs_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
            public long getDownloadRequestTimeoutMs() {
                return this.downloadRequestTimeoutMs_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
            public long getHeadRequestTimeoutMs() {
                return this.headRequestTimeoutMs_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_fieldAccessorTable.d(ConnectionConfiguration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDownloadRequestTimeoutMs(long j10) {
                this.downloadRequestTimeoutMs_ = j10;
                onChanged();
                return this;
            }

            public Builder setHeadRequestTimeoutMs(long j10) {
                this.headRequestTimeoutMs_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ConnectionConfiguration build() {
                ConnectionConfiguration connectionConfigurationBuildPartial = buildPartial();
                if (connectionConfigurationBuildPartial.isInitialized()) {
                    return connectionConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ConnectionConfiguration buildPartial() {
                ConnectionConfiguration connectionConfiguration = new ConnectionConfiguration(this);
                connectionConfiguration.headRequestTimeoutMs_ = this.headRequestTimeoutMs_;
                connectionConfiguration.downloadRequestTimeoutMs_ = this.downloadRequestTimeoutMs_;
                onBuilt();
                return connectionConfiguration;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public ConnectionConfiguration getDefaultInstanceForType() {
                return ConnectionConfiguration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            private Builder(h0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.headRequestTimeoutMs_ = 0L;
                this.downloadRequestTimeoutMs_ = 0L;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionConfiguration) {
                    return mergeFrom((ConnectionConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionConfiguration connectionConfiguration) {
                if (connectionConfiguration == ConnectionConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (connectionConfiguration.getHeadRequestTimeoutMs() != 0) {
                    setHeadRequestTimeoutMs(connectionConfiguration.getHeadRequestTimeoutMs());
                }
                if (connectionConfiguration.getDownloadRequestTimeoutMs() != 0) {
                    setDownloadRequestTimeoutMs(connectionConfiguration.getDownloadRequestTimeoutMs());
                }
                mergeUnknownFields(((h0) connectionConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfiguration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfiguration.access$2700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AssetCache$ConnectionConfiguration r3 = (io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfiguration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.sdk.AssetCache$ConnectionConfiguration r4 = (io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfiguration) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfiguration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AssetCache$ConnectionConfiguration$Builder");
            }
        }

        public static Builder newBuilder(ConnectionConfiguration connectionConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionConfiguration);
        }

        public static ConnectionConfiguration parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(byteBuffer, wVar);
        }

        private ConnectionConfiguration(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionConfiguration parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (ConnectionConfiguration) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static ConnectionConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ConnectionConfiguration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ConnectionConfiguration parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ConnectionConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static ConnectionConfiguration parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (ConnectionConfiguration) PARSER.parseFrom(bArr, wVar);
        }

        private ConnectionConfiguration(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.headRequestTimeoutMs_ = lVar.z();
                            } else if (iK != 16) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.downloadRequestTimeoutMs_ = lVar.z();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static ConnectionConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (ConnectionConfiguration) h0.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionConfiguration parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (ConnectionConfiguration) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static ConnectionConfiguration parseFrom(l lVar) throws IOException {
            return (ConnectionConfiguration) h0.parseWithIOException(PARSER, lVar);
        }

        public static ConnectionConfiguration parseFrom(l lVar, w wVar) throws IOException {
            return (ConnectionConfiguration) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface ConnectionConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        long getDownloadRequestTimeoutMs();

        long getHeadRequestTimeoutMs();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class DownloadPolicy extends h0 implements DownloadPolicyOrBuilder {
        public static final int MAX_FILE_SIZE_BYTES_FIELD_NUMBER = 2;
        public static final int MAX_PING_TIME_MS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private PolicyLimit maxFileSizeBytes_;
        private PolicyLimit maxPingTimeMs_;
        private byte memoizedIsInitialized;
        private static final DownloadPolicy DEFAULT_INSTANCE = new DownloadPolicy();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicy.1
            @Override // com.explorestack.protobuf.p1
            public DownloadPolicy parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new DownloadPolicy(lVar, wVar);
            }
        };

        public static DownloadPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DownloadPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DownloadPolicy) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DownloadPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DownloadPolicy)) {
                return super.equals(obj);
            }
            DownloadPolicy downloadPolicy = (DownloadPolicy) obj;
            if (hasMaxPingTimeMs() != downloadPolicy.hasMaxPingTimeMs()) {
                return false;
            }
            if ((!hasMaxPingTimeMs() || getMaxPingTimeMs().equals(downloadPolicy.getMaxPingTimeMs())) && hasMaxFileSizeBytes() == downloadPolicy.hasMaxFileSizeBytes()) {
                return (!hasMaxFileSizeBytes() || getMaxFileSizeBytes().equals(downloadPolicy.getMaxFileSizeBytes())) && this.unknownFields.equals(downloadPolicy.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimit getMaxFileSizeBytes() {
            PolicyLimit policyLimit = this.maxFileSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder() {
            return getMaxFileSizeBytes();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimit getMaxPingTimeMs() {
            PolicyLimit policyLimit = this.maxPingTimeMs_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder() {
            return getMaxPingTimeMs();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.maxPingTimeMs_ != null ? n.G(1, getMaxPingTimeMs()) : 0;
            if (this.maxFileSizeBytes_ != null) {
                iG += n.G(2, getMaxFileSizeBytes());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public boolean hasMaxFileSizeBytes() {
            return this.maxFileSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public boolean hasMaxPingTimeMs() {
            return this.maxPingTimeMs_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasMaxPingTimeMs()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMaxPingTimeMs().hashCode();
            }
            if (hasMaxFileSizeBytes()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMaxFileSizeBytes().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_fieldAccessorTable.d(DownloadPolicy.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new DownloadPolicy();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.maxPingTimeMs_ != null) {
                nVar.J0(1, getMaxPingTimeMs());
            }
            if (this.maxFileSizeBytes_ != null) {
                nVar.J0(2, getMaxFileSizeBytes());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements DownloadPolicyOrBuilder {
            private a2 maxFileSizeBytesBuilder_;
            private PolicyLimit maxFileSizeBytes_;
            private a2 maxPingTimeMsBuilder_;
            private PolicyLimit maxPingTimeMs_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
            }

            private a2 getMaxFileSizeBytesFieldBuilder() {
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytesBuilder_ = new a2(getMaxFileSizeBytes(), getParentForChildren(), isClean());
                    this.maxFileSizeBytes_ = null;
                }
                return this.maxFileSizeBytesBuilder_;
            }

            private a2 getMaxPingTimeMsFieldBuilder() {
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMsBuilder_ = new a2(getMaxPingTimeMs(), getParentForChildren(), isClean());
                    this.maxPingTimeMs_ = null;
                }
                return this.maxPingTimeMsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearMaxFileSizeBytes() {
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytes_ = null;
                    onChanged();
                    return this;
                }
                this.maxFileSizeBytes_ = null;
                this.maxFileSizeBytesBuilder_ = null;
                return this;
            }

            public Builder clearMaxPingTimeMs() {
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMs_ = null;
                    onChanged();
                    return this;
                }
                this.maxPingTimeMs_ = null;
                this.maxPingTimeMsBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimit getMaxFileSizeBytes() {
                a2 a2Var = this.maxFileSizeBytesBuilder_;
                if (a2Var != null) {
                    return (PolicyLimit) a2Var.e();
                }
                PolicyLimit policyLimit = this.maxFileSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxFileSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxFileSizeBytesFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder() {
                a2 a2Var = this.maxFileSizeBytesBuilder_;
                if (a2Var != null) {
                    return (PolicyLimitOrBuilder) a2Var.f();
                }
                PolicyLimit policyLimit = this.maxFileSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimit getMaxPingTimeMs() {
                a2 a2Var = this.maxPingTimeMsBuilder_;
                if (a2Var != null) {
                    return (PolicyLimit) a2Var.e();
                }
                PolicyLimit policyLimit = this.maxPingTimeMs_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxPingTimeMsBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxPingTimeMsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder() {
                a2 a2Var = this.maxPingTimeMsBuilder_;
                if (a2Var != null) {
                    return (PolicyLimitOrBuilder) a2Var.f();
                }
                PolicyLimit policyLimit = this.maxPingTimeMs_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public boolean hasMaxFileSizeBytes() {
                return (this.maxFileSizeBytesBuilder_ == null && this.maxFileSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public boolean hasMaxPingTimeMs() {
                return (this.maxPingTimeMsBuilder_ == null && this.maxPingTimeMs_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_fieldAccessorTable.d(DownloadPolicy.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMaxFileSizeBytes(PolicyLimit policyLimit) {
                a2 a2Var = this.maxFileSizeBytesBuilder_;
                if (a2Var != null) {
                    a2Var.g(policyLimit);
                    return this;
                }
                PolicyLimit policyLimit2 = this.maxFileSizeBytes_;
                if (policyLimit2 != null) {
                    this.maxFileSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                } else {
                    this.maxFileSizeBytes_ = policyLimit;
                }
                onChanged();
                return this;
            }

            public Builder mergeMaxPingTimeMs(PolicyLimit policyLimit) {
                a2 a2Var = this.maxPingTimeMsBuilder_;
                if (a2Var != null) {
                    a2Var.g(policyLimit);
                    return this;
                }
                PolicyLimit policyLimit2 = this.maxPingTimeMs_;
                if (policyLimit2 != null) {
                    this.maxPingTimeMs_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                } else {
                    this.maxPingTimeMs_ = policyLimit;
                }
                onChanged();
                return this;
            }

            public Builder setMaxFileSizeBytes(PolicyLimit policyLimit) {
                a2 a2Var = this.maxFileSizeBytesBuilder_;
                if (a2Var != null) {
                    a2Var.i(policyLimit);
                    return this;
                }
                policyLimit.getClass();
                this.maxFileSizeBytes_ = policyLimit;
                onChanged();
                return this;
            }

            public Builder setMaxPingTimeMs(PolicyLimit policyLimit) {
                a2 a2Var = this.maxPingTimeMsBuilder_;
                if (a2Var != null) {
                    a2Var.i(policyLimit);
                    return this;
                }
                policyLimit.getClass();
                this.maxPingTimeMs_ = policyLimit;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DownloadPolicy build() {
                DownloadPolicy downloadPolicyBuildPartial = buildPartial();
                if (downloadPolicyBuildPartial.isInitialized()) {
                    return downloadPolicyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) downloadPolicyBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DownloadPolicy buildPartial() {
                DownloadPolicy downloadPolicy = new DownloadPolicy(this);
                a2 a2Var = this.maxPingTimeMsBuilder_;
                if (a2Var == null) {
                    downloadPolicy.maxPingTimeMs_ = this.maxPingTimeMs_;
                } else {
                    downloadPolicy.maxPingTimeMs_ = (PolicyLimit) a2Var.a();
                }
                a2 a2Var2 = this.maxFileSizeBytesBuilder_;
                if (a2Var2 == null) {
                    downloadPolicy.maxFileSizeBytes_ = this.maxFileSizeBytes_;
                } else {
                    downloadPolicy.maxFileSizeBytes_ = (PolicyLimit) a2Var2.a();
                }
                onBuilt();
                return downloadPolicy;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public DownloadPolicy getDefaultInstanceForType() {
                return DownloadPolicy.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            private Builder(h0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMs_ = null;
                } else {
                    this.maxPingTimeMs_ = null;
                    this.maxPingTimeMsBuilder_ = null;
                }
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytes_ = null;
                    return this;
                }
                this.maxFileSizeBytes_ = null;
                this.maxFileSizeBytesBuilder_ = null;
                return this;
            }

            public Builder setMaxFileSizeBytes(PolicyLimit.Builder builder) {
                a2 a2Var = this.maxFileSizeBytesBuilder_;
                if (a2Var == null) {
                    this.maxFileSizeBytes_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setMaxPingTimeMs(PolicyLimit.Builder builder) {
                a2 a2Var = this.maxPingTimeMsBuilder_;
                if (a2Var == null) {
                    this.maxPingTimeMs_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DownloadPolicy) {
                    return mergeFrom((DownloadPolicy) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DownloadPolicy downloadPolicy) {
                if (downloadPolicy == DownloadPolicy.getDefaultInstance()) {
                    return this;
                }
                if (downloadPolicy.hasMaxPingTimeMs()) {
                    mergeMaxPingTimeMs(downloadPolicy.getMaxPingTimeMs());
                }
                if (downloadPolicy.hasMaxFileSizeBytes()) {
                    mergeMaxFileSizeBytes(downloadPolicy.getMaxFileSizeBytes());
                }
                mergeUnknownFields(((h0) downloadPolicy).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicy.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicy.access$6000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AssetCache$DownloadPolicy r3 = (io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicy) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.sdk.AssetCache$DownloadPolicy r4 = (io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicy) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicy.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AssetCache$DownloadPolicy$Builder");
            }
        }

        public static Builder newBuilder(DownloadPolicy downloadPolicy) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(downloadPolicy);
        }

        public static DownloadPolicy parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(byteBuffer, wVar);
        }

        private DownloadPolicy(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadPolicy parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (DownloadPolicy) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static DownloadPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public DownloadPolicy getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DownloadPolicy parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DownloadPolicy() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static DownloadPolicy parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (DownloadPolicy) PARSER.parseFrom(bArr, wVar);
        }

        private DownloadPolicy(l lVar, w wVar) throws InvalidProtocolBufferException {
            PolicyLimit.Builder builder;
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                PolicyLimit policyLimit = this.maxPingTimeMs_;
                                builder = policyLimit != null ? policyLimit.toBuilder() : null;
                                PolicyLimit policyLimit2 = (PolicyLimit) lVar.A(PolicyLimit.parser(), wVar);
                                this.maxPingTimeMs_ = policyLimit2;
                                if (builder != null) {
                                    builder.mergeFrom(policyLimit2);
                                    this.maxPingTimeMs_ = builder.buildPartial();
                                }
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                PolicyLimit policyLimit3 = this.maxFileSizeBytes_;
                                builder = policyLimit3 != null ? policyLimit3.toBuilder() : null;
                                PolicyLimit policyLimit4 = (PolicyLimit) lVar.A(PolicyLimit.parser(), wVar);
                                this.maxFileSizeBytes_ = policyLimit4;
                                if (builder != null) {
                                    builder.mergeFrom(policyLimit4);
                                    this.maxFileSizeBytes_ = builder.buildPartial();
                                }
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static DownloadPolicy parseFrom(InputStream inputStream) throws IOException {
            return (DownloadPolicy) h0.parseWithIOException(PARSER, inputStream);
        }

        public static DownloadPolicy parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (DownloadPolicy) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static DownloadPolicy parseFrom(l lVar) throws IOException {
            return (DownloadPolicy) h0.parseWithIOException(PARSER, lVar);
        }

        public static DownloadPolicy parseFrom(l lVar, w wVar) throws IOException {
            return (DownloadPolicy) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface DownloadPolicyOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        PolicyLimit getMaxFileSizeBytes();

        PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder();

        PolicyLimit getMaxPingTimeMs();

        PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder();

        boolean hasMaxFileSizeBytes();

        boolean hasMaxPingTimeMs();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class EvictionPolicy extends h0 implements EvictionPolicyOrBuilder {
        public static final int MAX_DISK_APPLIED_PERCENT_FIELD_NUMBER = 3;
        public static final int MAX_IMAGE_SIZE_BYTES_FIELD_NUMBER = 6;
        public static final int MAX_TTL_SECONDS_FIELD_NUMBER = 4;
        public static final int MAX_VIDEO_SIZE_BYTES_FIELD_NUMBER = 7;
        public static final int MIN_DISK_APPLIED_PERCENT_FIELD_NUMBER = 2;
        public static final int MIN_FREQUENCY_FIELD_NUMBER = 5;
        public static final int SCORE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private double maxDiskAppliedPercent_;
        private PolicyLimit maxImageSizeBytes_;
        private PolicyLimit maxTtlSeconds_;
        private PolicyLimit maxVideoSizeBytes_;
        private byte memoizedIsInitialized;
        private double minDiskAppliedPercent_;
        private PolicyLimit minFrequency_;
        private double score_;
        private static final EvictionPolicy DEFAULT_INSTANCE = new EvictionPolicy();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicy.1
            @Override // com.explorestack.protobuf.p1
            public EvictionPolicy parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new EvictionPolicy(lVar, wVar);
            }
        };

        public static EvictionPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EvictionPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EvictionPolicy) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EvictionPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvictionPolicy)) {
                return super.equals(obj);
            }
            EvictionPolicy evictionPolicy = (EvictionPolicy) obj;
            if (Double.doubleToLongBits(getScore()) != Double.doubleToLongBits(evictionPolicy.getScore()) || Double.doubleToLongBits(getMinDiskAppliedPercent()) != Double.doubleToLongBits(evictionPolicy.getMinDiskAppliedPercent()) || Double.doubleToLongBits(getMaxDiskAppliedPercent()) != Double.doubleToLongBits(evictionPolicy.getMaxDiskAppliedPercent()) || hasMaxTtlSeconds() != evictionPolicy.hasMaxTtlSeconds()) {
                return false;
            }
            if ((hasMaxTtlSeconds() && !getMaxTtlSeconds().equals(evictionPolicy.getMaxTtlSeconds())) || hasMinFrequency() != evictionPolicy.hasMinFrequency()) {
                return false;
            }
            if ((hasMinFrequency() && !getMinFrequency().equals(evictionPolicy.getMinFrequency())) || hasMaxImageSizeBytes() != evictionPolicy.hasMaxImageSizeBytes()) {
                return false;
            }
            if ((!hasMaxImageSizeBytes() || getMaxImageSizeBytes().equals(evictionPolicy.getMaxImageSizeBytes())) && hasMaxVideoSizeBytes() == evictionPolicy.hasMaxVideoSizeBytes()) {
                return (!hasMaxVideoSizeBytes() || getMaxVideoSizeBytes().equals(evictionPolicy.getMaxVideoSizeBytes())) && this.unknownFields.equals(evictionPolicy.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getMaxDiskAppliedPercent() {
            return this.maxDiskAppliedPercent_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxImageSizeBytes() {
            PolicyLimit policyLimit = this.maxImageSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder() {
            return getMaxImageSizeBytes();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxTtlSeconds() {
            PolicyLimit policyLimit = this.maxTtlSeconds_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder() {
            return getMaxTtlSeconds();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxVideoSizeBytes() {
            PolicyLimit policyLimit = this.maxVideoSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder() {
            return getMaxVideoSizeBytes();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getMinDiskAppliedPercent() {
            return this.minDiskAppliedPercent_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMinFrequency() {
            PolicyLimit policyLimit = this.minFrequency_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMinFrequencyOrBuilder() {
            return getMinFrequency();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getScore() {
            return this.score_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            double d10 = this.score_;
            int iJ = d10 != 0.0d ? n.j(1, d10) : 0;
            double d11 = this.minDiskAppliedPercent_;
            if (d11 != 0.0d) {
                iJ += n.j(2, d11);
            }
            double d12 = this.maxDiskAppliedPercent_;
            if (d12 != 0.0d) {
                iJ += n.j(3, d12);
            }
            if (this.maxTtlSeconds_ != null) {
                iJ += n.G(4, getMaxTtlSeconds());
            }
            if (this.minFrequency_ != null) {
                iJ += n.G(5, getMinFrequency());
            }
            if (this.maxImageSizeBytes_ != null) {
                iJ += n.G(6, getMaxImageSizeBytes());
            }
            if (this.maxVideoSizeBytes_ != null) {
                iJ += n.G(7, getMaxVideoSizeBytes());
            }
            int serializedSize = iJ + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxImageSizeBytes() {
            return this.maxImageSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxTtlSeconds() {
            return this.maxTtlSeconds_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxVideoSizeBytes() {
            return this.maxVideoSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMinFrequency() {
            return this.minFrequency_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(Double.doubleToLongBits(getScore()))) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getMinDiskAppliedPercent()))) * 37) + 3) * 53) + j0.i(Double.doubleToLongBits(getMaxDiskAppliedPercent()));
            if (hasMaxTtlSeconds()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMaxTtlSeconds().hashCode();
            }
            if (hasMinFrequency()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getMinFrequency().hashCode();
            }
            if (hasMaxImageSizeBytes()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getMaxImageSizeBytes().hashCode();
            }
            if (hasMaxVideoSizeBytes()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getMaxVideoSizeBytes().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_fieldAccessorTable.d(EvictionPolicy.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new EvictionPolicy();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            double d10 = this.score_;
            if (d10 != 0.0d) {
                nVar.t0(1, d10);
            }
            double d11 = this.minDiskAppliedPercent_;
            if (d11 != 0.0d) {
                nVar.t0(2, d11);
            }
            double d12 = this.maxDiskAppliedPercent_;
            if (d12 != 0.0d) {
                nVar.t0(3, d12);
            }
            if (this.maxTtlSeconds_ != null) {
                nVar.J0(4, getMaxTtlSeconds());
            }
            if (this.minFrequency_ != null) {
                nVar.J0(5, getMinFrequency());
            }
            if (this.maxImageSizeBytes_ != null) {
                nVar.J0(6, getMaxImageSizeBytes());
            }
            if (this.maxVideoSizeBytes_ != null) {
                nVar.J0(7, getMaxVideoSizeBytes());
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements EvictionPolicyOrBuilder {
            private double maxDiskAppliedPercent_;
            private a2 maxImageSizeBytesBuilder_;
            private PolicyLimit maxImageSizeBytes_;
            private a2 maxTtlSecondsBuilder_;
            private PolicyLimit maxTtlSeconds_;
            private a2 maxVideoSizeBytesBuilder_;
            private PolicyLimit maxVideoSizeBytes_;
            private double minDiskAppliedPercent_;
            private a2 minFrequencyBuilder_;
            private PolicyLimit minFrequency_;
            private double score_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
            }

            private a2 getMaxImageSizeBytesFieldBuilder() {
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytesBuilder_ = new a2(getMaxImageSizeBytes(), getParentForChildren(), isClean());
                    this.maxImageSizeBytes_ = null;
                }
                return this.maxImageSizeBytesBuilder_;
            }

            private a2 getMaxTtlSecondsFieldBuilder() {
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSecondsBuilder_ = new a2(getMaxTtlSeconds(), getParentForChildren(), isClean());
                    this.maxTtlSeconds_ = null;
                }
                return this.maxTtlSecondsBuilder_;
            }

            private a2 getMaxVideoSizeBytesFieldBuilder() {
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytesBuilder_ = new a2(getMaxVideoSizeBytes(), getParentForChildren(), isClean());
                    this.maxVideoSizeBytes_ = null;
                }
                return this.maxVideoSizeBytesBuilder_;
            }

            private a2 getMinFrequencyFieldBuilder() {
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequencyBuilder_ = new a2(getMinFrequency(), getParentForChildren(), isClean());
                    this.minFrequency_ = null;
                }
                return this.minFrequencyBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearMaxDiskAppliedPercent() {
                this.maxDiskAppliedPercent_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearMaxImageSizeBytes() {
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytes_ = null;
                    onChanged();
                    return this;
                }
                this.maxImageSizeBytes_ = null;
                this.maxImageSizeBytesBuilder_ = null;
                return this;
            }

            public Builder clearMaxTtlSeconds() {
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSeconds_ = null;
                    onChanged();
                    return this;
                }
                this.maxTtlSeconds_ = null;
                this.maxTtlSecondsBuilder_ = null;
                return this;
            }

            public Builder clearMaxVideoSizeBytes() {
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytes_ = null;
                    onChanged();
                    return this;
                }
                this.maxVideoSizeBytes_ = null;
                this.maxVideoSizeBytesBuilder_ = null;
                return this;
            }

            public Builder clearMinDiskAppliedPercent() {
                this.minDiskAppliedPercent_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearMinFrequency() {
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequency_ = null;
                    onChanged();
                    return this;
                }
                this.minFrequency_ = null;
                this.minFrequencyBuilder_ = null;
                return this;
            }

            public Builder clearScore() {
                this.score_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getMaxDiskAppliedPercent() {
                return this.maxDiskAppliedPercent_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxImageSizeBytes() {
                a2 a2Var = this.maxImageSizeBytesBuilder_;
                if (a2Var != null) {
                    return (PolicyLimit) a2Var.e();
                }
                PolicyLimit policyLimit = this.maxImageSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxImageSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxImageSizeBytesFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder() {
                a2 a2Var = this.maxImageSizeBytesBuilder_;
                if (a2Var != null) {
                    return (PolicyLimitOrBuilder) a2Var.f();
                }
                PolicyLimit policyLimit = this.maxImageSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxTtlSeconds() {
                a2 a2Var = this.maxTtlSecondsBuilder_;
                if (a2Var != null) {
                    return (PolicyLimit) a2Var.e();
                }
                PolicyLimit policyLimit = this.maxTtlSeconds_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxTtlSecondsBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxTtlSecondsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder() {
                a2 a2Var = this.maxTtlSecondsBuilder_;
                if (a2Var != null) {
                    return (PolicyLimitOrBuilder) a2Var.f();
                }
                PolicyLimit policyLimit = this.maxTtlSeconds_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxVideoSizeBytes() {
                a2 a2Var = this.maxVideoSizeBytesBuilder_;
                if (a2Var != null) {
                    return (PolicyLimit) a2Var.e();
                }
                PolicyLimit policyLimit = this.maxVideoSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxVideoSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxVideoSizeBytesFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder() {
                a2 a2Var = this.maxVideoSizeBytesBuilder_;
                if (a2Var != null) {
                    return (PolicyLimitOrBuilder) a2Var.f();
                }
                PolicyLimit policyLimit = this.maxVideoSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getMinDiskAppliedPercent() {
                return this.minDiskAppliedPercent_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMinFrequency() {
                a2 a2Var = this.minFrequencyBuilder_;
                if (a2Var != null) {
                    return (PolicyLimit) a2Var.e();
                }
                PolicyLimit policyLimit = this.minFrequency_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMinFrequencyBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMinFrequencyFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMinFrequencyOrBuilder() {
                a2 a2Var = this.minFrequencyBuilder_;
                if (a2Var != null) {
                    return (PolicyLimitOrBuilder) a2Var.f();
                }
                PolicyLimit policyLimit = this.minFrequency_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getScore() {
                return this.score_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxImageSizeBytes() {
                return (this.maxImageSizeBytesBuilder_ == null && this.maxImageSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxTtlSeconds() {
                return (this.maxTtlSecondsBuilder_ == null && this.maxTtlSeconds_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxVideoSizeBytes() {
                return (this.maxVideoSizeBytesBuilder_ == null && this.maxVideoSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMinFrequency() {
                return (this.minFrequencyBuilder_ == null && this.minFrequency_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_fieldAccessorTable.d(EvictionPolicy.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMaxImageSizeBytes(PolicyLimit policyLimit) {
                a2 a2Var = this.maxImageSizeBytesBuilder_;
                if (a2Var != null) {
                    a2Var.g(policyLimit);
                    return this;
                }
                PolicyLimit policyLimit2 = this.maxImageSizeBytes_;
                if (policyLimit2 != null) {
                    this.maxImageSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                } else {
                    this.maxImageSizeBytes_ = policyLimit;
                }
                onChanged();
                return this;
            }

            public Builder mergeMaxTtlSeconds(PolicyLimit policyLimit) {
                a2 a2Var = this.maxTtlSecondsBuilder_;
                if (a2Var != null) {
                    a2Var.g(policyLimit);
                    return this;
                }
                PolicyLimit policyLimit2 = this.maxTtlSeconds_;
                if (policyLimit2 != null) {
                    this.maxTtlSeconds_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                } else {
                    this.maxTtlSeconds_ = policyLimit;
                }
                onChanged();
                return this;
            }

            public Builder mergeMaxVideoSizeBytes(PolicyLimit policyLimit) {
                a2 a2Var = this.maxVideoSizeBytesBuilder_;
                if (a2Var != null) {
                    a2Var.g(policyLimit);
                    return this;
                }
                PolicyLimit policyLimit2 = this.maxVideoSizeBytes_;
                if (policyLimit2 != null) {
                    this.maxVideoSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                } else {
                    this.maxVideoSizeBytes_ = policyLimit;
                }
                onChanged();
                return this;
            }

            public Builder mergeMinFrequency(PolicyLimit policyLimit) {
                a2 a2Var = this.minFrequencyBuilder_;
                if (a2Var != null) {
                    a2Var.g(policyLimit);
                    return this;
                }
                PolicyLimit policyLimit2 = this.minFrequency_;
                if (policyLimit2 != null) {
                    this.minFrequency_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                } else {
                    this.minFrequency_ = policyLimit;
                }
                onChanged();
                return this;
            }

            public Builder setMaxDiskAppliedPercent(double d10) {
                this.maxDiskAppliedPercent_ = d10;
                onChanged();
                return this;
            }

            public Builder setMaxImageSizeBytes(PolicyLimit policyLimit) {
                a2 a2Var = this.maxImageSizeBytesBuilder_;
                if (a2Var != null) {
                    a2Var.i(policyLimit);
                    return this;
                }
                policyLimit.getClass();
                this.maxImageSizeBytes_ = policyLimit;
                onChanged();
                return this;
            }

            public Builder setMaxTtlSeconds(PolicyLimit policyLimit) {
                a2 a2Var = this.maxTtlSecondsBuilder_;
                if (a2Var != null) {
                    a2Var.i(policyLimit);
                    return this;
                }
                policyLimit.getClass();
                this.maxTtlSeconds_ = policyLimit;
                onChanged();
                return this;
            }

            public Builder setMaxVideoSizeBytes(PolicyLimit policyLimit) {
                a2 a2Var = this.maxVideoSizeBytesBuilder_;
                if (a2Var != null) {
                    a2Var.i(policyLimit);
                    return this;
                }
                policyLimit.getClass();
                this.maxVideoSizeBytes_ = policyLimit;
                onChanged();
                return this;
            }

            public Builder setMinDiskAppliedPercent(double d10) {
                this.minDiskAppliedPercent_ = d10;
                onChanged();
                return this;
            }

            public Builder setMinFrequency(PolicyLimit policyLimit) {
                a2 a2Var = this.minFrequencyBuilder_;
                if (a2Var != null) {
                    a2Var.i(policyLimit);
                    return this;
                }
                policyLimit.getClass();
                this.minFrequency_ = policyLimit;
                onChanged();
                return this;
            }

            public Builder setScore(double d10) {
                this.score_ = d10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EvictionPolicy build() {
                EvictionPolicy evictionPolicyBuildPartial = buildPartial();
                if (evictionPolicyBuildPartial.isInitialized()) {
                    return evictionPolicyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) evictionPolicyBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EvictionPolicy buildPartial() {
                EvictionPolicy evictionPolicy = new EvictionPolicy(this);
                evictionPolicy.score_ = this.score_;
                evictionPolicy.minDiskAppliedPercent_ = this.minDiskAppliedPercent_;
                evictionPolicy.maxDiskAppliedPercent_ = this.maxDiskAppliedPercent_;
                a2 a2Var = this.maxTtlSecondsBuilder_;
                if (a2Var == null) {
                    evictionPolicy.maxTtlSeconds_ = this.maxTtlSeconds_;
                } else {
                    evictionPolicy.maxTtlSeconds_ = (PolicyLimit) a2Var.a();
                }
                a2 a2Var2 = this.minFrequencyBuilder_;
                if (a2Var2 == null) {
                    evictionPolicy.minFrequency_ = this.minFrequency_;
                } else {
                    evictionPolicy.minFrequency_ = (PolicyLimit) a2Var2.a();
                }
                a2 a2Var3 = this.maxImageSizeBytesBuilder_;
                if (a2Var3 == null) {
                    evictionPolicy.maxImageSizeBytes_ = this.maxImageSizeBytes_;
                } else {
                    evictionPolicy.maxImageSizeBytes_ = (PolicyLimit) a2Var3.a();
                }
                a2 a2Var4 = this.maxVideoSizeBytesBuilder_;
                if (a2Var4 == null) {
                    evictionPolicy.maxVideoSizeBytes_ = this.maxVideoSizeBytes_;
                } else {
                    evictionPolicy.maxVideoSizeBytes_ = (PolicyLimit) a2Var4.a();
                }
                onBuilt();
                return evictionPolicy;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public EvictionPolicy getDefaultInstanceForType() {
                return EvictionPolicy.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            private Builder(h0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.score_ = 0.0d;
                this.minDiskAppliedPercent_ = 0.0d;
                this.maxDiskAppliedPercent_ = 0.0d;
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSeconds_ = null;
                } else {
                    this.maxTtlSeconds_ = null;
                    this.maxTtlSecondsBuilder_ = null;
                }
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequency_ = null;
                } else {
                    this.minFrequency_ = null;
                    this.minFrequencyBuilder_ = null;
                }
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytes_ = null;
                } else {
                    this.maxImageSizeBytes_ = null;
                    this.maxImageSizeBytesBuilder_ = null;
                }
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytes_ = null;
                    return this;
                }
                this.maxVideoSizeBytes_ = null;
                this.maxVideoSizeBytesBuilder_ = null;
                return this;
            }

            public Builder setMaxImageSizeBytes(PolicyLimit.Builder builder) {
                a2 a2Var = this.maxImageSizeBytesBuilder_;
                if (a2Var == null) {
                    this.maxImageSizeBytes_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setMaxTtlSeconds(PolicyLimit.Builder builder) {
                a2 a2Var = this.maxTtlSecondsBuilder_;
                if (a2Var == null) {
                    this.maxTtlSeconds_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setMaxVideoSizeBytes(PolicyLimit.Builder builder) {
                a2 a2Var = this.maxVideoSizeBytesBuilder_;
                if (a2Var == null) {
                    this.maxVideoSizeBytes_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setMinFrequency(PolicyLimit.Builder builder) {
                a2 a2Var = this.minFrequencyBuilder_;
                if (a2Var == null) {
                    this.minFrequency_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EvictionPolicy) {
                    return mergeFrom((EvictionPolicy) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EvictionPolicy evictionPolicy) {
                if (evictionPolicy == EvictionPolicy.getDefaultInstance()) {
                    return this;
                }
                if (evictionPolicy.getScore() != 0.0d) {
                    setScore(evictionPolicy.getScore());
                }
                if (evictionPolicy.getMinDiskAppliedPercent() != 0.0d) {
                    setMinDiskAppliedPercent(evictionPolicy.getMinDiskAppliedPercent());
                }
                if (evictionPolicy.getMaxDiskAppliedPercent() != 0.0d) {
                    setMaxDiskAppliedPercent(evictionPolicy.getMaxDiskAppliedPercent());
                }
                if (evictionPolicy.hasMaxTtlSeconds()) {
                    mergeMaxTtlSeconds(evictionPolicy.getMaxTtlSeconds());
                }
                if (evictionPolicy.hasMinFrequency()) {
                    mergeMinFrequency(evictionPolicy.getMinFrequency());
                }
                if (evictionPolicy.hasMaxImageSizeBytes()) {
                    mergeMaxImageSizeBytes(evictionPolicy.getMaxImageSizeBytes());
                }
                if (evictionPolicy.hasMaxVideoSizeBytes()) {
                    mergeMaxVideoSizeBytes(evictionPolicy.getMaxVideoSizeBytes());
                }
                mergeUnknownFields(((h0) evictionPolicy).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicy.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicy.access$5100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AssetCache$EvictionPolicy r3 = (io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicy) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.sdk.AssetCache$EvictionPolicy r4 = (io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicy) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicy.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AssetCache$EvictionPolicy$Builder");
            }
        }

        public static Builder newBuilder(EvictionPolicy evictionPolicy) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(evictionPolicy);
        }

        public static EvictionPolicy parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(byteBuffer, wVar);
        }

        private EvictionPolicy(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EvictionPolicy parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (EvictionPolicy) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static EvictionPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public EvictionPolicy getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EvictionPolicy parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EvictionPolicy() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EvictionPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static EvictionPolicy parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (EvictionPolicy) PARSER.parseFrom(bArr, wVar);
        }

        private EvictionPolicy(l lVar, w wVar) throws InvalidProtocolBufferException {
            PolicyLimit.Builder builder;
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 9) {
                                this.score_ = lVar.s();
                            } else if (iK == 17) {
                                this.minDiskAppliedPercent_ = lVar.s();
                            } else if (iK != 25) {
                                if (iK == 34) {
                                    PolicyLimit policyLimit = this.maxTtlSeconds_;
                                    builder = policyLimit != null ? policyLimit.toBuilder() : null;
                                    PolicyLimit policyLimit2 = (PolicyLimit) lVar.A(PolicyLimit.parser(), wVar);
                                    this.maxTtlSeconds_ = policyLimit2;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit2);
                                        this.maxTtlSeconds_ = builder.buildPartial();
                                    }
                                } else if (iK == 42) {
                                    PolicyLimit policyLimit3 = this.minFrequency_;
                                    builder = policyLimit3 != null ? policyLimit3.toBuilder() : null;
                                    PolicyLimit policyLimit4 = (PolicyLimit) lVar.A(PolicyLimit.parser(), wVar);
                                    this.minFrequency_ = policyLimit4;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit4);
                                        this.minFrequency_ = builder.buildPartial();
                                    }
                                } else if (iK == 50) {
                                    PolicyLimit policyLimit5 = this.maxImageSizeBytes_;
                                    builder = policyLimit5 != null ? policyLimit5.toBuilder() : null;
                                    PolicyLimit policyLimit6 = (PolicyLimit) lVar.A(PolicyLimit.parser(), wVar);
                                    this.maxImageSizeBytes_ = policyLimit6;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit6);
                                        this.maxImageSizeBytes_ = builder.buildPartial();
                                    }
                                } else if (iK != 58) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    PolicyLimit policyLimit7 = this.maxVideoSizeBytes_;
                                    builder = policyLimit7 != null ? policyLimit7.toBuilder() : null;
                                    PolicyLimit policyLimit8 = (PolicyLimit) lVar.A(PolicyLimit.parser(), wVar);
                                    this.maxVideoSizeBytes_ = policyLimit8;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit8);
                                        this.maxVideoSizeBytes_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.maxDiskAppliedPercent_ = lVar.s();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static EvictionPolicy parseFrom(InputStream inputStream) throws IOException {
            return (EvictionPolicy) h0.parseWithIOException(PARSER, inputStream);
        }

        public static EvictionPolicy parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (EvictionPolicy) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static EvictionPolicy parseFrom(l lVar) throws IOException {
            return (EvictionPolicy) h0.parseWithIOException(PARSER, lVar);
        }

        public static EvictionPolicy parseFrom(l lVar, w wVar) throws IOException {
            return (EvictionPolicy) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface EvictionPolicyOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        double getMaxDiskAppliedPercent();

        PolicyLimit getMaxImageSizeBytes();

        PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder();

        PolicyLimit getMaxTtlSeconds();

        PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder();

        PolicyLimit getMaxVideoSizeBytes();

        PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder();

        double getMinDiskAppliedPercent();

        PolicyLimit getMinFrequency();

        PolicyLimitOrBuilder getMinFrequencyOrBuilder();

        double getScore();

        boolean hasMaxImageSizeBytes();

        boolean hasMaxTtlSeconds();

        boolean hasMaxVideoSizeBytes();

        boolean hasMinFrequency();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class PolicyConfiguration extends h0 implements PolicyConfigurationOrBuilder {
        public static final int DOWNLOAD_POLICY_FIELD_NUMBER = 1;
        public static final int EVICTION_POLICIES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private DownloadPolicy downloadPolicy_;
        private List<EvictionPolicy> evictionPolicies_;
        private byte memoizedIsInitialized;
        private static final PolicyConfiguration DEFAULT_INSTANCE = new PolicyConfiguration();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AssetCache.PolicyConfiguration.1
            @Override // com.explorestack.protobuf.p1
            public PolicyConfiguration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new PolicyConfiguration(lVar, wVar);
            }
        };

        public static PolicyConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PolicyConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PolicyConfiguration) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PolicyConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PolicyConfiguration)) {
                return super.equals(obj);
            }
            PolicyConfiguration policyConfiguration = (PolicyConfiguration) obj;
            if (hasDownloadPolicy() != policyConfiguration.hasDownloadPolicy()) {
                return false;
            }
            return (!hasDownloadPolicy() || getDownloadPolicy().equals(policyConfiguration.getDownloadPolicy())) && getEvictionPoliciesList().equals(policyConfiguration.getEvictionPoliciesList()) && this.unknownFields.equals(policyConfiguration.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public DownloadPolicy getDownloadPolicy() {
            DownloadPolicy downloadPolicy = this.downloadPolicy_;
            return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public DownloadPolicyOrBuilder getDownloadPolicyOrBuilder() {
            return getDownloadPolicy();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public EvictionPolicy getEvictionPolicies(int i10) {
            return this.evictionPolicies_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public int getEvictionPoliciesCount() {
            return this.evictionPolicies_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public List<EvictionPolicy> getEvictionPoliciesList() {
            return this.evictionPolicies_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i10) {
            return this.evictionPolicies_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList() {
            return this.evictionPolicies_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.downloadPolicy_ != null ? n.G(1, getDownloadPolicy()) : 0;
            for (int i11 = 0; i11 < this.evictionPolicies_.size(); i11++) {
                iG += n.G(2, this.evictionPolicies_.get(i11));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public boolean hasDownloadPolicy() {
            return this.downloadPolicy_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasDownloadPolicy()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getDownloadPolicy().hashCode();
            }
            if (getEvictionPoliciesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEvictionPoliciesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_fieldAccessorTable.d(PolicyConfiguration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new PolicyConfiguration();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.downloadPolicy_ != null) {
                nVar.J0(1, getDownloadPolicy());
            }
            for (int i10 = 0; i10 < this.evictionPolicies_.size(); i10++) {
                nVar.J0(2, this.evictionPolicies_.get(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements PolicyConfigurationOrBuilder {
            private int bitField0_;
            private a2 downloadPolicyBuilder_;
            private DownloadPolicy downloadPolicy_;
            private v1 evictionPoliciesBuilder_;
            private List<EvictionPolicy> evictionPolicies_;

            private void ensureEvictionPoliciesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.evictionPolicies_ = new ArrayList(this.evictionPolicies_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
            }

            private a2 getDownloadPolicyFieldBuilder() {
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicyBuilder_ = new a2(getDownloadPolicy(), getParentForChildren(), isClean());
                    this.downloadPolicy_ = null;
                }
                return this.downloadPolicyBuilder_;
            }

            private v1 getEvictionPoliciesFieldBuilder() {
                if (this.evictionPoliciesBuilder_ == null) {
                    this.evictionPoliciesBuilder_ = new v1(this.evictionPolicies_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.evictionPolicies_ = null;
                }
                return this.evictionPoliciesBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getEvictionPoliciesFieldBuilder();
                }
            }

            public Builder addAllEvictionPolicies(Iterable<? extends EvictionPolicy> iterable) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureEvictionPoliciesIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.evictionPolicies_);
                onChanged();
                return this;
            }

            public Builder addEvictionPolicies(EvictionPolicy evictionPolicy) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var != null) {
                    v1Var.e(evictionPolicy);
                    return this;
                }
                evictionPolicy.getClass();
                ensureEvictionPoliciesIsMutable();
                this.evictionPolicies_.add(evictionPolicy);
                onChanged();
                return this;
            }

            public EvictionPolicy.Builder addEvictionPoliciesBuilder() {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().c(EvictionPolicy.getDefaultInstance());
            }

            public Builder clearDownloadPolicy() {
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicy_ = null;
                    onChanged();
                    return this;
                }
                this.downloadPolicy_ = null;
                this.downloadPolicyBuilder_ = null;
                return this;
            }

            public Builder clearEvictionPolicies() {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.evictionPolicies_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public DownloadPolicy getDownloadPolicy() {
                a2 a2Var = this.downloadPolicyBuilder_;
                if (a2Var != null) {
                    return (DownloadPolicy) a2Var.e();
                }
                DownloadPolicy downloadPolicy = this.downloadPolicy_;
                return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
            }

            public DownloadPolicy.Builder getDownloadPolicyBuilder() {
                onChanged();
                return (DownloadPolicy.Builder) getDownloadPolicyFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public DownloadPolicyOrBuilder getDownloadPolicyOrBuilder() {
                a2 a2Var = this.downloadPolicyBuilder_;
                if (a2Var != null) {
                    return (DownloadPolicyOrBuilder) a2Var.f();
                }
                DownloadPolicy downloadPolicy = this.downloadPolicy_;
                return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public EvictionPolicy getEvictionPolicies(int i10) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                return v1Var == null ? this.evictionPolicies_.get(i10) : (EvictionPolicy) v1Var.n(i10);
            }

            public EvictionPolicy.Builder getEvictionPoliciesBuilder(int i10) {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().k(i10);
            }

            public List<EvictionPolicy.Builder> getEvictionPoliciesBuilderList() {
                return getEvictionPoliciesFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public int getEvictionPoliciesCount() {
                v1 v1Var = this.evictionPoliciesBuilder_;
                return v1Var == null ? this.evictionPolicies_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public List<EvictionPolicy> getEvictionPoliciesList() {
                v1 v1Var = this.evictionPoliciesBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.evictionPolicies_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i10) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                return v1Var == null ? this.evictionPolicies_.get(i10) : (EvictionPolicyOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList() {
                v1 v1Var = this.evictionPoliciesBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.evictionPolicies_);
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public boolean hasDownloadPolicy() {
                return (this.downloadPolicyBuilder_ == null && this.downloadPolicy_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_fieldAccessorTable.d(PolicyConfiguration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDownloadPolicy(DownloadPolicy downloadPolicy) {
                a2 a2Var = this.downloadPolicyBuilder_;
                if (a2Var != null) {
                    a2Var.g(downloadPolicy);
                    return this;
                }
                DownloadPolicy downloadPolicy2 = this.downloadPolicy_;
                if (downloadPolicy2 != null) {
                    this.downloadPolicy_ = DownloadPolicy.newBuilder(downloadPolicy2).mergeFrom(downloadPolicy).buildPartial();
                } else {
                    this.downloadPolicy_ = downloadPolicy;
                }
                onChanged();
                return this;
            }

            public Builder removeEvictionPolicies(int i10) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureEvictionPoliciesIsMutable();
                this.evictionPolicies_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setDownloadPolicy(DownloadPolicy downloadPolicy) {
                a2 a2Var = this.downloadPolicyBuilder_;
                if (a2Var != null) {
                    a2Var.i(downloadPolicy);
                    return this;
                }
                downloadPolicy.getClass();
                this.downloadPolicy_ = downloadPolicy;
                onChanged();
                return this;
            }

            public Builder setEvictionPolicies(int i10, EvictionPolicy evictionPolicy) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, evictionPolicy);
                    return this;
                }
                evictionPolicy.getClass();
                ensureEvictionPoliciesIsMutable();
                this.evictionPolicies_.set(i10, evictionPolicy);
                onChanged();
                return this;
            }

            private Builder() {
                this.evictionPolicies_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyConfiguration build() {
                PolicyConfiguration policyConfigurationBuildPartial = buildPartial();
                if (policyConfigurationBuildPartial.isInitialized()) {
                    return policyConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) policyConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyConfiguration buildPartial() {
                PolicyConfiguration policyConfiguration = new PolicyConfiguration(this);
                a2 a2Var = this.downloadPolicyBuilder_;
                if (a2Var == null) {
                    policyConfiguration.downloadPolicy_ = this.downloadPolicy_;
                } else {
                    policyConfiguration.downloadPolicy_ = (DownloadPolicy) a2Var.a();
                }
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var != null) {
                    policyConfiguration.evictionPolicies_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.evictionPolicies_ = DesugarCollections.unmodifiableList(this.evictionPolicies_);
                        this.bitField0_ &= -2;
                    }
                    policyConfiguration.evictionPolicies_ = this.evictionPolicies_;
                }
                onBuilt();
                return policyConfiguration;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public PolicyConfiguration getDefaultInstanceForType() {
                return PolicyConfiguration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            public EvictionPolicy.Builder addEvictionPoliciesBuilder(int i10) {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().b(i10, EvictionPolicy.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicy_ = null;
                } else {
                    this.downloadPolicy_ = null;
                    this.downloadPolicyBuilder_ = null;
                }
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var == null) {
                    this.evictionPolicies_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                v1Var.g();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.evictionPolicies_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setDownloadPolicy(DownloadPolicy.Builder builder) {
                a2 a2Var = this.downloadPolicyBuilder_;
                if (a2Var == null) {
                    this.downloadPolicy_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder addEvictionPolicies(int i10, EvictionPolicy evictionPolicy) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var == null) {
                    evictionPolicy.getClass();
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(i10, evictionPolicy);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, evictionPolicy);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PolicyConfiguration) {
                    return mergeFrom((PolicyConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEvictionPolicies(int i10, EvictionPolicy.Builder builder) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(PolicyConfiguration policyConfiguration) {
                if (policyConfiguration == PolicyConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (policyConfiguration.hasDownloadPolicy()) {
                    mergeDownloadPolicy(policyConfiguration.getDownloadPolicy());
                }
                if (this.evictionPoliciesBuilder_ == null) {
                    if (!policyConfiguration.evictionPolicies_.isEmpty()) {
                        if (this.evictionPolicies_.isEmpty()) {
                            this.evictionPolicies_ = policyConfiguration.evictionPolicies_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureEvictionPoliciesIsMutable();
                            this.evictionPolicies_.addAll(policyConfiguration.evictionPolicies_);
                        }
                        onChanged();
                    }
                } else if (!policyConfiguration.evictionPolicies_.isEmpty()) {
                    if (!this.evictionPoliciesBuilder_.t()) {
                        this.evictionPoliciesBuilder_.a(policyConfiguration.evictionPolicies_);
                    } else {
                        this.evictionPoliciesBuilder_.h();
                        this.evictionPoliciesBuilder_ = null;
                        this.evictionPolicies_ = policyConfiguration.evictionPolicies_;
                        this.bitField0_ &= -2;
                        this.evictionPoliciesBuilder_ = h0.alwaysUseFieldBuilders ? getEvictionPoliciesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) policyConfiguration).unknownFields);
                onChanged();
                return this;
            }

            public Builder addEvictionPolicies(EvictionPolicy.Builder builder) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addEvictionPolicies(int i10, EvictionPolicy.Builder builder) {
                v1 v1Var = this.evictionPoliciesBuilder_;
                if (v1Var == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.d(i10, builder.build());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AssetCache.PolicyConfiguration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AssetCache.PolicyConfiguration.access$3700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AssetCache$PolicyConfiguration r3 = (io.bidmachine.protobuf.sdk.AssetCache.PolicyConfiguration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.sdk.AssetCache$PolicyConfiguration r4 = (io.bidmachine.protobuf.sdk.AssetCache.PolicyConfiguration) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AssetCache.PolicyConfiguration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AssetCache$PolicyConfiguration$Builder");
            }
        }

        public static Builder newBuilder(PolicyConfiguration policyConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(policyConfiguration);
        }

        public static PolicyConfiguration parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(byteBuffer, wVar);
        }

        private PolicyConfiguration(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PolicyConfiguration parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (PolicyConfiguration) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static PolicyConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public PolicyConfiguration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static PolicyConfiguration parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private PolicyConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
            this.evictionPolicies_ = Collections.EMPTY_LIST;
        }

        public static PolicyConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static PolicyConfiguration parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (PolicyConfiguration) PARSER.parseFrom(bArr, wVar);
        }

        public static PolicyConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (PolicyConfiguration) h0.parseWithIOException(PARSER, inputStream);
        }

        private PolicyConfiguration(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                DownloadPolicy downloadPolicy = this.downloadPolicy_;
                                DownloadPolicy.Builder builder = downloadPolicy != null ? downloadPolicy.toBuilder() : null;
                                DownloadPolicy downloadPolicy2 = (DownloadPolicy) lVar.A(DownloadPolicy.parser(), wVar);
                                this.downloadPolicy_ = downloadPolicy2;
                                if (builder != null) {
                                    builder.mergeFrom(downloadPolicy2);
                                    this.downloadPolicy_ = builder.buildPartial();
                                }
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.evictionPolicies_ = new ArrayList();
                                    z11 = true;
                                }
                                this.evictionPolicies_.add((EvictionPolicy) lVar.A(EvictionPolicy.parser(), wVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.evictionPolicies_ = DesugarCollections.unmodifiableList(this.evictionPolicies_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.evictionPolicies_ = DesugarCollections.unmodifiableList(this.evictionPolicies_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static PolicyConfiguration parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (PolicyConfiguration) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static PolicyConfiguration parseFrom(l lVar) throws IOException {
            return (PolicyConfiguration) h0.parseWithIOException(PARSER, lVar);
        }

        public static PolicyConfiguration parseFrom(l lVar, w wVar) throws IOException {
            return (PolicyConfiguration) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface PolicyConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        DownloadPolicy getDownloadPolicy();

        DownloadPolicyOrBuilder getDownloadPolicyOrBuilder();

        EvictionPolicy getEvictionPolicies(int i10);

        int getEvictionPoliciesCount();

        List<EvictionPolicy> getEvictionPoliciesList();

        EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i10);

        List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList();

        boolean hasDownloadPolicy();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class PolicyLimit extends h0 implements PolicyLimitOrBuilder {
        private static final PolicyLimit DEFAULT_INSTANCE = new PolicyLimit();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.AssetCache.PolicyLimit.1
            @Override // com.explorestack.protobuf.p1
            public PolicyLimit parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new PolicyLimit(lVar, wVar);
            }
        };
        public static final int THRESHOLD_FIELD_NUMBER = 1;
        public static final int WEIGHT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long threshold_;
        private double weight_;

        public static PolicyLimit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PolicyLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PolicyLimit) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PolicyLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PolicyLimit)) {
                return super.equals(obj);
            }
            PolicyLimit policyLimit = (PolicyLimit) obj;
            return getThreshold() == policyLimit.getThreshold() && Double.doubleToLongBits(getWeight()) == Double.doubleToLongBits(policyLimit.getWeight()) && this.unknownFields.equals(policyLimit.unknownFields);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.threshold_;
            int iZ = j10 != 0 ? n.z(1, j10) : 0;
            double d10 = this.weight_;
            if (d10 != 0.0d) {
                iZ += n.j(2, d10);
            }
            int serializedSize = iZ + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
        public long getThreshold() {
            return this.threshold_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
        public double getWeight() {
            return this.weight_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + j0.i(getThreshold())) * 37) + 2) * 53) + j0.i(Double.doubleToLongBits(getWeight()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_fieldAccessorTable.d(PolicyLimit.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new PolicyLimit();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            long j10 = this.threshold_;
            if (j10 != 0) {
                nVar.H0(1, j10);
            }
            double d10 = this.weight_;
            if (d10 != 0.0d) {
                nVar.t0(2, d10);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements PolicyLimitOrBuilder {
            private long threshold_;
            private double weight_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearThreshold() {
                this.threshold_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearWeight() {
                this.weight_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
            public long getThreshold() {
                return this.threshold_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
            public double getWeight() {
                return this.weight_;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_fieldAccessorTable.d(PolicyLimit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setThreshold(long j10) {
                this.threshold_ = j10;
                onChanged();
                return this;
            }

            public Builder setWeight(double d10) {
                this.weight_ = d10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyLimit build() {
                PolicyLimit policyLimitBuildPartial = buildPartial();
                if (policyLimitBuildPartial.isInitialized()) {
                    return policyLimitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) policyLimitBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyLimit buildPartial() {
                PolicyLimit policyLimit = new PolicyLimit(this);
                policyLimit.threshold_ = this.threshold_;
                policyLimit.weight_ = this.weight_;
                onBuilt();
                return policyLimit;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public PolicyLimit getDefaultInstanceForType() {
                return PolicyLimit.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            private Builder(h0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.threshold_ = 0L;
                this.weight_ = 0.0d;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PolicyLimit) {
                    return mergeFrom((PolicyLimit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PolicyLimit policyLimit) {
                if (policyLimit == PolicyLimit.getDefaultInstance()) {
                    return this;
                }
                if (policyLimit.getThreshold() != 0) {
                    setThreshold(policyLimit.getThreshold());
                }
                if (policyLimit.getWeight() != 0.0d) {
                    setWeight(policyLimit.getWeight());
                }
                mergeUnknownFields(((h0) policyLimit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.AssetCache.PolicyLimit.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AssetCache.PolicyLimit.access$6900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.AssetCache$PolicyLimit r3 = (io.bidmachine.protobuf.sdk.AssetCache.PolicyLimit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.sdk.AssetCache$PolicyLimit r4 = (io.bidmachine.protobuf.sdk.AssetCache.PolicyLimit) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AssetCache.PolicyLimit.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AssetCache$PolicyLimit$Builder");
            }
        }

        public static Builder newBuilder(PolicyLimit policyLimit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(policyLimit);
        }

        public static PolicyLimit parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(byteBuffer, wVar);
        }

        private PolicyLimit(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PolicyLimit parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (PolicyLimit) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static PolicyLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public PolicyLimit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static PolicyLimit parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private PolicyLimit() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PolicyLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static PolicyLimit parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (PolicyLimit) PARSER.parseFrom(bArr, wVar);
        }

        private PolicyLimit(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.threshold_ = lVar.z();
                            } else if (iK != 17) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.weight_ = lVar.s();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static PolicyLimit parseFrom(InputStream inputStream) throws IOException {
            return (PolicyLimit) h0.parseWithIOException(PARSER, inputStream);
        }

        public static PolicyLimit parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (PolicyLimit) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static PolicyLimit parseFrom(l lVar) throws IOException {
            return (PolicyLimit) h0.parseWithIOException(PARSER, lVar);
        }

        public static PolicyLimit parseFrom(l lVar, w wVar) throws IOException {
            return (PolicyLimit) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface PolicyLimitOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        long getThreshold();

        double getWeight();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static AssetCache getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AssetCache parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AssetCache) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AssetCache parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return !(obj instanceof AssetCache) ? super.equals(obj) : this.unknownFields.equals(((AssetCache) obj).unknownFields);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int serializedSize = this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_fieldAccessorTable.d(AssetCache.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new AssetCache();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements AssetCacheOrBuilder {
        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_fieldAccessorTable.d(AssetCache.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AssetCache build() {
            AssetCache assetCacheBuildPartial = buildPartial();
            if (assetCacheBuildPartial.isInitialized()) {
                return assetCacheBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetCacheBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AssetCache buildPartial() {
            AssetCache assetCache = new AssetCache(this);
            onBuilt();
            return assetCache;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public AssetCache getDefaultInstanceForType() {
            return AssetCache.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(r2 r2Var) {
            return (Builder) super.setUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(r2 r2Var) {
            return (Builder) super.mergeUnknownFields(r2Var);
        }

        private Builder(h0.c cVar) {
            super(cVar);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AssetCache) {
                return mergeFrom((AssetCache) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AssetCache assetCache) {
            if (assetCache == AssetCache.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(((h0) assetCache).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.AssetCache.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.AssetCache.access$7600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.AssetCache r3 = (io.bidmachine.protobuf.sdk.AssetCache) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.sdk.AssetCache r4 = (io.bidmachine.protobuf.sdk.AssetCache) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.AssetCache.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.AssetCache$Builder");
        }
    }

    public static Builder newBuilder(AssetCache assetCache) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetCache);
    }

    public static AssetCache parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(byteBuffer, wVar);
    }

    private AssetCache(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AssetCache parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (AssetCache) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static AssetCache parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AssetCache getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AssetCache parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AssetCache() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AssetCache parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static AssetCache parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (AssetCache) PARSER.parseFrom(bArr, wVar);
    }

    private AssetCache(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    if (iK == 0 || !parseUnknownField(lVar, bVarG, wVar, iK)) {
                        z10 = true;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } finally {
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static AssetCache parseFrom(InputStream inputStream) throws IOException {
        return (AssetCache) h0.parseWithIOException(PARSER, inputStream);
    }

    public static AssetCache parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (AssetCache) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static AssetCache parseFrom(l lVar) throws IOException {
        return (AssetCache) h0.parseWithIOException(PARSER, lVar);
    }

    public static AssetCache parseFrom(l lVar, w wVar) throws IOException {
        return (AssetCache) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
