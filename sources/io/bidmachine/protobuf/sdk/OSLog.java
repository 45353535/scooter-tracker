package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j2;
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
public final class OSLog extends h0 implements OSLogOrBuilder {
    private static final OSLog DEFAULT_INSTANCE = new OSLog();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.OSLog.1
        @Override // com.explorestack.protobuf.p1
        public OSLog parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new OSLog(lVar, wVar);
        }
    };
    public static final int RECORDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Record> records_;

    public static final class Record extends h0 implements RecordOrBuilder {
        public static final int LEVEL_FIELD_NUMBER = 3;
        public static final int MESSAGE_FIELD_NUMBER = 5;
        public static final int SOURCE_FIELD_NUMBER = 4;
        public static final int TAG_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object level_;
        private byte memoizedIsInitialized;
        private volatile Object message_;
        private volatile Object source_;
        private volatile Object tag_;
        private Timestamp timestamp_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.OSLog.Record.1
            @Override // com.explorestack.protobuf.p1
            public Record parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Record(lVar, wVar);
            }
        };

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Record parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Record) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Record)) {
                return super.equals(obj);
            }
            Record record = (Record) obj;
            if (hasTimestamp() != record.hasTimestamp()) {
                return false;
            }
            return (!hasTimestamp() || getTimestamp().equals(record.getTimestamp())) && getTag().equals(record.getTag()) && getLevel().equals(record.getLevel()) && getSource().equals(record.getSource()) && getMessage().equals(record.getMessage()) && this.unknownFields.equals(record.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public String getLevel() {
            Object obj = this.level_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.level_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public ByteString getLevelBytes() {
            Object obj = this.level_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.level_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public String getMessage() {
            Object obj = this.message_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.message_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public ByteString getMessageBytes() {
            Object obj = this.message_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.message_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            int iG = this.timestamp_ != null ? n.G(1, getTimestamp()) : 0;
            if (!getTagBytes().isEmpty()) {
                iG += h0.computeStringSize(2, this.tag_);
            }
            if (!getLevelBytes().isEmpty()) {
                iG += h0.computeStringSize(3, this.level_);
            }
            if (!getSourceBytes().isEmpty()) {
                iG += h0.computeStringSize(4, this.source_);
            }
            if (!getMessageBytes().isEmpty()) {
                iG += h0.computeStringSize(5, this.message_);
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public String getSource() {
            Object obj = this.source_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.source_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public ByteString getSourceBytes() {
            Object obj = this.source_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.source_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public String getTag() {
            Object obj = this.tag_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tag_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public ByteString getTagBytes() {
            Object obj = this.tag_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tag_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public j2 getTimestampOrBuilder() {
            return getTimestamp();
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTimestamp().hashCode();
            }
            int iHashCode2 = (((((((((((((((((iHashCode * 37) + 2) * 53) + getTag().hashCode()) * 37) + 3) * 53) + getLevel().hashCode()) * 37) + 4) * 53) + getSource().hashCode()) * 37) + 5) * 53) + getMessage().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable.d(Record.class, Builder.class);
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
            return new Record();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.timestamp_ != null) {
                nVar.J0(1, getTimestamp());
            }
            if (!getTagBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.tag_);
            }
            if (!getLevelBytes().isEmpty()) {
                h0.writeString(nVar, 3, this.level_);
            }
            if (!getSourceBytes().isEmpty()) {
                h0.writeString(nVar, 4, this.source_);
            }
            if (!getMessageBytes().isEmpty()) {
                h0.writeString(nVar, 5, this.message_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements RecordOrBuilder {
            private Object level_;
            private Object message_;
            private Object source_;
            private Object tag_;
            private a2 timestampBuilder_;
            private Timestamp timestamp_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
            }

            private a2 getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new a2(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearLevel() {
                this.level_ = Record.getDefaultInstance().getLevel();
                onChanged();
                return this;
            }

            public Builder clearMessage() {
                this.message_ = Record.getDefaultInstance().getMessage();
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.source_ = Record.getDefaultInstance().getSource();
                onChanged();
                return this;
            }

            public Builder clearTag() {
                this.tag_ = Record.getDefaultInstance().getTag();
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                    onChanged();
                    return this;
                }
                this.timestamp_ = null;
                this.timestampBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public String getLevel() {
                Object obj = this.level_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.level_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public ByteString getLevelBytes() {
                Object obj = this.level_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.level_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public String getMessage() {
                Object obj = this.message_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.message_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public ByteString getMessageBytes() {
                Object obj = this.message_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.message_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public String getSource() {
                Object obj = this.source_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.source_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public ByteString getSourceBytes() {
                Object obj = this.source_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.source_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public String getTag() {
                Object obj = this.tag_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tag_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public ByteString getTagBytes() {
                Object obj = this.tag_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tag_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public Timestamp getTimestamp() {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var != null) {
                    return (Timestamp) a2Var.e();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public Timestamp.Builder getTimestampBuilder() {
                onChanged();
                return (Timestamp.Builder) getTimestampFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public j2 getTimestampOrBuilder() {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var != null) {
                    return (j2) a2Var.f();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public boolean hasTimestamp() {
                return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable.d(Record.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var != null) {
                    a2Var.g(timestamp);
                    return this;
                }
                Timestamp timestamp2 = this.timestamp_;
                if (timestamp2 != null) {
                    this.timestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.timestamp_ = timestamp;
                }
                onChanged();
                return this;
            }

            public Builder setLevel(String str) {
                str.getClass();
                this.level_ = str;
                onChanged();
                return this;
            }

            public Builder setLevelBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.level_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMessage(String str) {
                str.getClass();
                this.message_ = str;
                onChanged();
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.message_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSource(String str) {
                str.getClass();
                this.source_ = str;
                onChanged();
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.source_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTag(String str) {
                str.getClass();
                this.tag_ = str;
                onChanged();
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.tag_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var != null) {
                    a2Var.i(timestamp);
                    return this;
                }
                timestamp.getClass();
                this.timestamp_ = timestamp;
                onChanged();
                return this;
            }

            private Builder() {
                this.tag_ = "";
                this.level_ = "";
                this.source_ = "";
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record build() {
                Record recordBuildPartial = buildPartial();
                if (recordBuildPartial.isInitialized()) {
                    return recordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) recordBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record buildPartial() {
                Record record = new Record(this);
                a2 a2Var = this.timestampBuilder_;
                if (a2Var == null) {
                    record.timestamp_ = this.timestamp_;
                } else {
                    record.timestamp_ = (Timestamp) a2Var.a();
                }
                record.tag_ = this.tag_;
                record.level_ = this.level_;
                record.source_ = this.source_;
                record.message_ = this.message_;
                onBuilt();
                return record;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Record getDefaultInstanceForType() {
                return Record.getDefaultInstance();
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

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                this.tag_ = "";
                this.level_ = "";
                this.source_ = "";
                this.message_ = "";
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                a2 a2Var = this.timestampBuilder_;
                if (a2Var == null) {
                    this.timestamp_ = builder.build();
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
                if (message instanceof Record) {
                    return mergeFrom((Record) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.tag_ = "";
                this.level_ = "";
                this.source_ = "";
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Record record) {
                if (record == Record.getDefaultInstance()) {
                    return this;
                }
                if (record.hasTimestamp()) {
                    mergeTimestamp(record.getTimestamp());
                }
                if (!record.getTag().isEmpty()) {
                    this.tag_ = record.tag_;
                    onChanged();
                }
                if (!record.getLevel().isEmpty()) {
                    this.level_ = record.level_;
                    onChanged();
                }
                if (!record.getSource().isEmpty()) {
                    this.source_ = record.source_;
                    onChanged();
                }
                if (!record.getMessage().isEmpty()) {
                    this.message_ = record.message_;
                    onChanged();
                }
                mergeUnknownFields(((h0) record).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.sdk.OSLog.Record.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.OSLog.Record.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.OSLog$Record r3 = (io.bidmachine.protobuf.sdk.OSLog.Record) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.OSLog$Record r4 = (io.bidmachine.protobuf.sdk.OSLog.Record) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.OSLog.Record.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.OSLog$Record$Builder");
            }
        }

        public static Builder newBuilder(Record record) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(record);
        }

        public static Record parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Record(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Record) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Record parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Record getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Record parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Record() {
            this.memoizedIsInitialized = (byte) -1;
            this.tag_ = "";
            this.level_ = "";
            this.source_ = "";
            this.message_ = "";
        }

        public static Record parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Record parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Record) PARSER.parseFrom(bArr, wVar);
        }

        public static Record parseFrom(InputStream inputStream) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        private Record(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                                    Timestamp timestamp = this.timestamp_;
                                    Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) lVar.A(Timestamp.parser(), wVar);
                                    this.timestamp_ = timestamp2;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp2);
                                        this.timestamp_ = builder.buildPartial();
                                    }
                                } else if (iK == 18) {
                                    this.tag_ = lVar.J();
                                } else if (iK == 26) {
                                    this.level_ = lVar.J();
                                } else if (iK == 34) {
                                    this.source_ = lVar.J();
                                } else if (iK != 42) {
                                    if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    }
                                } else {
                                    this.message_ = lVar.J();
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        }
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

        public static Record parseFrom(l lVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, lVar);
        }

        public static Record parseFrom(l lVar, w wVar) throws IOException {
            return (Record) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface RecordOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getLevel();

        ByteString getLevelBytes();

        String getMessage();

        ByteString getMessageBytes();

        String getSource();

        ByteString getSourceBytes();

        String getTag();

        ByteString getTagBytes();

        Timestamp getTimestamp();

        j2 getTimestampOrBuilder();

        boolean hasTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static OSLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static OSLog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OSLog) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static OSLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OSLog) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OSLog)) {
            return super.equals(obj);
        }
        OSLog oSLog = (OSLog) obj;
        return getRecordsList().equals(oSLog.getRecordsList()) && this.unknownFields.equals(oSLog.unknownFields);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public Record getRecords(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
        return this.records_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.records_.size(); i11++) {
            iG += n.G(1, this.records_.get(i11));
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
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
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getRecordsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getRecordsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable.d(OSLog.class, Builder.class);
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
        return new OSLog();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        for (int i10 = 0; i10 < this.records_.size(); i10++) {
            nVar.J0(1, this.records_.get(i10));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements OSLogOrBuilder {
        private int bitField0_;
        private v1 recordsBuilder_;
        private List<Record> records_;

        private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.records_ = new ArrayList(this.records_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
        }

        private v1 getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
                this.recordsBuilder_ = new v1(this.records_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.records_ = null;
            }
            return this.recordsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getRecordsFieldBuilder();
            }
        }

        public Builder addAllRecords(Iterable<? extends Record> iterable) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureRecordsIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.records_);
            onChanged();
            return this;
        }

        public Builder addRecords(Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.e(record);
                return this;
            }
            record.getClass();
            ensureRecordsIsMutable();
            this.records_.add(record);
            onChanged();
            return this;
        }

        public Record.Builder addRecordsBuilder() {
            return (Record.Builder) getRecordsFieldBuilder().c(Record.getDefaultInstance());
        }

        public Builder clearRecords() {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.records_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public Record getRecords(int i10) {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.get(i10) : (Record) v1Var.n(i10);
        }

        public Record.Builder getRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().k(i10);
        }

        public List<Record.Builder> getRecordsBuilderList() {
            return getRecordsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public int getRecordsCount() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public List<Record> getRecordsList() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.records_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i10) {
            v1 v1Var = this.recordsBuilder_;
            return v1Var == null ? this.records_.get(i10) : (RecordOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            v1 v1Var = this.recordsBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.records_);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable.d(OSLog.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeRecords(int i10) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureRecordsIsMutable();
            this.records_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setRecords(int i10, Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, record);
                return this;
            }
            record.getClass();
            ensureRecordsIsMutable();
            this.records_.set(i10, record);
            onChanged();
            return this;
        }

        private Builder() {
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public OSLog build() {
            OSLog oSLogBuildPartial = buildPartial();
            if (oSLogBuildPartial.isInitialized()) {
                return oSLogBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) oSLogBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public OSLog buildPartial() {
            OSLog oSLog = new OSLog(this);
            int i10 = this.bitField0_;
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                if ((i10 & 1) != 0) {
                    this.records_ = DesugarCollections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                oSLog.records_ = this.records_;
            } else {
                oSLog.records_ = v1Var.f();
            }
            onBuilt();
            return oSLog;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public OSLog getDefaultInstanceForType() {
            return OSLog.getDefaultInstance();
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

        public Record.Builder addRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().b(i10, Record.getDefaultInstance());
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
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                this.records_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            v1Var.g();
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.records_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addRecords(int i10, Record record) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.add(i10, record);
                onChanged();
                return this;
            }
            v1Var.d(i10, record);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof OSLog) {
                return mergeFrom((OSLog) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRecords(int i10, Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(OSLog oSLog) {
            if (oSLog == OSLog.getDefaultInstance()) {
                return this;
            }
            if (this.recordsBuilder_ == null) {
                if (!oSLog.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = oSLog.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(oSLog.records_);
                    }
                    onChanged();
                }
            } else if (!oSLog.records_.isEmpty()) {
                if (!this.recordsBuilder_.t()) {
                    this.recordsBuilder_.a(oSLog.records_);
                } else {
                    this.recordsBuilder_.h();
                    this.recordsBuilder_ = null;
                    this.records_ = oSLog.records_;
                    this.bitField0_ &= -2;
                    this.recordsBuilder_ = h0.alwaysUseFieldBuilders ? getRecordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) oSLog).unknownFields);
            onChanged();
            return this;
        }

        public Builder addRecords(Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addRecords(int i10, Record.Builder builder) {
            v1 v1Var = this.recordsBuilder_;
            if (v1Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.sdk.OSLog.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.OSLog.access$2300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.OSLog r3 = (io.bidmachine.protobuf.sdk.OSLog) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.OSLog r4 = (io.bidmachine.protobuf.sdk.OSLog) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.OSLog.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.OSLog$Builder");
        }
    }

    public static Builder newBuilder(OSLog oSLog) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(oSLog);
    }

    public static OSLog parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (OSLog) PARSER.parseFrom(byteBuffer, wVar);
    }

    private OSLog(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static OSLog parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (OSLog) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static OSLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OSLog) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public OSLog getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static OSLog parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (OSLog) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private OSLog() {
        this.memoizedIsInitialized = (byte) -1;
        this.records_ = Collections.EMPTY_LIST;
    }

    public static OSLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OSLog) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static OSLog parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (OSLog) PARSER.parseFrom(bArr, wVar);
    }

    public static OSLog parseFrom(InputStream inputStream) throws IOException {
        return (OSLog) h0.parseWithIOException(PARSER, inputStream);
    }

    private OSLog(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK != 10) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.records_ = new ArrayList();
                                    z11 = true;
                                }
                                this.records_.add((Record) lVar.A(Record.parser(), wVar));
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
                if (z11) {
                    this.records_ = DesugarCollections.unmodifiableList(this.records_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.records_ = DesugarCollections.unmodifiableList(this.records_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static OSLog parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (OSLog) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static OSLog parseFrom(l lVar) throws IOException {
        return (OSLog) h0.parseWithIOException(PARSER, lVar);
    }

    public static OSLog parseFrom(l lVar, w wVar) throws IOException {
        return (OSLog) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
