package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.w;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Event extends h0 implements EventOrBuilder {
    public static final int EXTRAS_PRIVATE_FIELD_NUMBER = 3;
    public static final int MONITOR_FIELD_NUMBER = 1;
    public static final int READER_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Struct extrasPrivate_;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;
    private static final Event DEFAULT_INSTANCE = new Event();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.sdk.Event.1
        @Override // com.explorestack.protobuf.p1
        public Event parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new Event(lVar, wVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.Event$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase = iArr;
            try {
                iArr[PayloadCase.MONITOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[PayloadCase.READER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum PayloadCase implements j0.c {
        MONITOR(1),
        READER(2),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }

        public static PayloadCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 1) {
                return MONITOR;
            }
            if (i10 != 2) {
                return null;
            }
            return READER;
        }

        @Override // com.explorestack.protobuf.j0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static Event getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Event) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return super.equals(obj);
        }
        Event event = (Event) obj;
        if (hasExtrasPrivate() != event.hasExtrasPrivate()) {
            return false;
        }
        if ((hasExtrasPrivate() && !getExtrasPrivate().equals(event.getExtrasPrivate())) || !getPayloadCase().equals(event.getPayloadCase())) {
            return false;
        }
        int i10 = this.payloadCase_;
        if (i10 != 1) {
            if (i10 == 2 && !getReader().equals(event.getReader())) {
                return false;
            }
        } else if (!getMonitor().equals(event.getMonitor())) {
            return false;
        }
        return this.unknownFields.equals(event.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Struct getExtrasPrivate() {
        Struct struct = this.extrasPrivate_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public e2 getExtrasPrivateOrBuilder() {
        return getExtrasPrivate();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Monitor getMonitor() {
        return this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public MonitorOrBuilder getMonitorOrBuilder() {
        return this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Reader getReader() {
        return this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public ReaderOrBuilder getReaderOrBuilder() {
        return this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.payloadCase_ == 1 ? n.G(1, (Monitor) this.payload_) : 0;
        if (this.payloadCase_ == 2) {
            iG += n.G(2, (Reader) this.payload_);
        }
        if (this.extrasPrivate_ != null) {
            iG += n.G(3, getExtrasPrivate());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasExtrasPrivate() {
        return this.extrasPrivate_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasMonitor() {
        return this.payloadCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasReader() {
        return this.payloadCase_ == 2;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = 779 + getDescriptor().hashCode();
        if (hasExtrasPrivate()) {
            iHashCode2 = (((iHashCode2 * 37) + 3) * 53) + getExtrasPrivate().hashCode();
        }
        int i12 = this.payloadCase_;
        if (i12 != 1) {
            if (i12 == 2) {
                i10 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getReader().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        i10 = ((iHashCode2 * 37) + 1) * 53;
        iHashCode = getMonitor().hashCode();
        iHashCode2 = i10 + iHashCode;
        int iHashCode32 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable.d(Event.class, Builder.class);
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
        return new Event();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.payloadCase_ == 1) {
            nVar.J0(1, (Monitor) this.payload_);
        }
        if (this.payloadCase_ == 2) {
            nVar.J0(2, (Reader) this.payload_);
        }
        if (this.extrasPrivate_ != null) {
            nVar.J0(3, getExtrasPrivate());
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements EventOrBuilder {
        private a2 extrasPrivateBuilder_;
        private Struct extrasPrivate_;
        private a2 monitorBuilder_;
        private int payloadCase_;
        private Object payload_;
        private a2 readerBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
        }

        private a2 getExtrasPrivateFieldBuilder() {
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivateBuilder_ = new a2(getExtrasPrivate(), getParentForChildren(), isClean());
                this.extrasPrivate_ = null;
            }
            return this.extrasPrivateBuilder_;
        }

        private a2 getMonitorFieldBuilder() {
            if (this.monitorBuilder_ == null) {
                if (this.payloadCase_ != 1) {
                    this.payload_ = Monitor.getDefaultInstance();
                }
                this.monitorBuilder_ = new a2((Monitor) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 1;
            onChanged();
            return this.monitorBuilder_;
        }

        private a2 getReaderFieldBuilder() {
            if (this.readerBuilder_ == null) {
                if (this.payloadCase_ != 2) {
                    this.payload_ = Reader.getDefaultInstance();
                }
                this.readerBuilder_ = new a2((Reader) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 2;
            onChanged();
            return this.readerBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = h0.alwaysUseFieldBuilders;
        }

        public Builder clearExtrasPrivate() {
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivate_ = null;
                onChanged();
                return this;
            }
            this.extrasPrivate_ = null;
            this.extrasPrivateBuilder_ = null;
            return this;
        }

        public Builder clearMonitor() {
            a2 a2Var = this.monitorBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            a2Var.b();
            return this;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearReader() {
            a2 a2Var = this.readerBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
            a2Var.b();
            return this;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Struct getExtrasPrivate() {
            a2 a2Var = this.extrasPrivateBuilder_;
            if (a2Var != null) {
                return (Struct) a2Var.e();
            }
            Struct struct = this.extrasPrivate_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtrasPrivateBuilder() {
            onChanged();
            return (Struct.Builder) getExtrasPrivateFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public e2 getExtrasPrivateOrBuilder() {
            a2 a2Var = this.extrasPrivateBuilder_;
            if (a2Var != null) {
                return (e2) a2Var.f();
            }
            Struct struct = this.extrasPrivate_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Monitor getMonitor() {
            a2 a2Var = this.monitorBuilder_;
            return a2Var == null ? this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance() : this.payloadCase_ == 1 ? (Monitor) a2Var.e() : Monitor.getDefaultInstance();
        }

        public Monitor.Builder getMonitorBuilder() {
            return (Monitor.Builder) getMonitorFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public MonitorOrBuilder getMonitorOrBuilder() {
            a2 a2Var;
            int i10 = this.payloadCase_;
            return (i10 != 1 || (a2Var = this.monitorBuilder_) == null) ? i10 == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance() : (MonitorOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Reader getReader() {
            a2 a2Var = this.readerBuilder_;
            return a2Var == null ? this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance() : this.payloadCase_ == 2 ? (Reader) a2Var.e() : Reader.getDefaultInstance();
        }

        public Reader.Builder getReaderBuilder() {
            return (Reader.Builder) getReaderFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public ReaderOrBuilder getReaderOrBuilder() {
            a2 a2Var;
            int i10 = this.payloadCase_;
            return (i10 != 2 || (a2Var = this.readerBuilder_) == null) ? i10 == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance() : (ReaderOrBuilder) a2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasExtrasPrivate() {
            return (this.extrasPrivateBuilder_ == null && this.extrasPrivate_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasMonitor() {
            return this.payloadCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasReader() {
            return this.payloadCase_ == 2;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable.d(Event.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeExtrasPrivate(Struct struct) {
            a2 a2Var = this.extrasPrivateBuilder_;
            if (a2Var != null) {
                a2Var.g(struct);
                return this;
            }
            Struct struct2 = this.extrasPrivate_;
            if (struct2 != null) {
                this.extrasPrivate_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
            } else {
                this.extrasPrivate_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeMonitor(Monitor monitor) {
            a2 a2Var = this.monitorBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ != 1 || this.payload_ == Monitor.getDefaultInstance()) {
                    this.payload_ = monitor;
                } else {
                    this.payload_ = Monitor.newBuilder((Monitor) this.payload_).mergeFrom(monitor).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 1) {
                    a2Var.g(monitor);
                }
                this.monitorBuilder_.i(monitor);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder mergeReader(Reader reader) {
            a2 a2Var = this.readerBuilder_;
            if (a2Var == null) {
                if (this.payloadCase_ != 2 || this.payload_ == Reader.getDefaultInstance()) {
                    this.payload_ = reader;
                } else {
                    this.payload_ = Reader.newBuilder((Reader) this.payload_).mergeFrom(reader).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 2) {
                    a2Var.g(reader);
                }
                this.readerBuilder_.i(reader);
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder setExtrasPrivate(Struct struct) {
            a2 a2Var = this.extrasPrivateBuilder_;
            if (a2Var != null) {
                a2Var.i(struct);
                return this;
            }
            struct.getClass();
            this.extrasPrivate_ = struct;
            onChanged();
            return this;
        }

        public Builder setMonitor(Monitor monitor) {
            a2 a2Var = this.monitorBuilder_;
            if (a2Var == null) {
                monitor.getClass();
                this.payload_ = monitor;
                onChanged();
            } else {
                a2Var.i(monitor);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setReader(Reader reader) {
            a2 a2Var = this.readerBuilder_;
            if (a2Var == null) {
                reader.getClass();
                this.payload_ = reader;
                onChanged();
            } else {
                a2Var.i(reader);
            }
            this.payloadCase_ = 2;
            return this;
        }

        private Builder() {
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Event build() {
            Event eventBuildPartial = buildPartial();
            if (eventBuildPartial.isInitialized()) {
                return eventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Event buildPartial() {
            Event event = new Event(this);
            if (this.payloadCase_ == 1) {
                a2 a2Var = this.monitorBuilder_;
                if (a2Var == null) {
                    event.payload_ = this.payload_;
                } else {
                    event.payload_ = a2Var.a();
                }
            }
            if (this.payloadCase_ == 2) {
                a2 a2Var2 = this.readerBuilder_;
                if (a2Var2 == null) {
                    event.payload_ = this.payload_;
                } else {
                    event.payload_ = a2Var2.a();
                }
            }
            a2 a2Var3 = this.extrasPrivateBuilder_;
            if (a2Var3 == null) {
                event.extrasPrivate_ = this.extrasPrivate_;
            } else {
                event.extrasPrivate_ = (Struct) a2Var3.a();
            }
            event.payloadCase_ = this.payloadCase_;
            onBuilt();
            return event;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Event getDefaultInstanceForType() {
            return Event.getDefaultInstance();
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
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivate_ = null;
            } else {
                this.extrasPrivate_ = null;
                this.extrasPrivateBuilder_ = null;
            }
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder setExtrasPrivate(Struct.Builder builder) {
            a2 a2Var = this.extrasPrivateBuilder_;
            if (a2Var == null) {
                this.extrasPrivate_ = builder.build();
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
            if (message instanceof Event) {
                return mergeFrom((Event) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMonitor(Monitor.Builder builder) {
            a2 a2Var = this.monitorBuilder_;
            if (a2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setReader(Reader.Builder builder) {
            a2 a2Var = this.readerBuilder_;
            if (a2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                a2Var.i(builder.build());
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder mergeFrom(Event event) {
            if (event == Event.getDefaultInstance()) {
                return this;
            }
            if (event.hasExtrasPrivate()) {
                mergeExtrasPrivate(event.getExtrasPrivate());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[event.getPayloadCase().ordinal()];
            if (i10 == 1) {
                mergeMonitor(event.getMonitor());
            } else if (i10 == 2) {
                mergeReader(event.getReader());
            }
            mergeUnknownFields(((h0) event).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.sdk.Event.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.sdk.Event.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Event r3 = (io.bidmachine.protobuf.sdk.Event) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Event r4 = (io.bidmachine.protobuf.sdk.Event) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Event.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.sdk.Event$Builder");
        }
    }

    public static Builder newBuilder(Event event) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
    }

    public static Event parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(byteBuffer, wVar);
    }

    private Event(h0.b bVar) {
        super(bVar);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Event parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (Event) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Event getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Event parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    private Event() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Event parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (Event) PARSER.parseFrom(bArr, wVar);
    }

    public static Event parseFrom(InputStream inputStream) throws IOException {
        return (Event) h0.parseWithIOException(PARSER, inputStream);
    }

    private Event(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            Monitor.Builder builder = this.payloadCase_ == 1 ? ((Monitor) this.payload_).toBuilder() : null;
                            MessageLite messageLiteA = lVar.A(Monitor.parser(), wVar);
                            this.payload_ = messageLiteA;
                            if (builder != null) {
                                builder.mergeFrom((Monitor) messageLiteA);
                                this.payload_ = builder.buildPartial();
                            }
                            this.payloadCase_ = 1;
                        } else if (iK == 18) {
                            Reader.Builder builder2 = this.payloadCase_ == 2 ? ((Reader) this.payload_).toBuilder() : null;
                            MessageLite messageLiteA2 = lVar.A(Reader.parser(), wVar);
                            this.payload_ = messageLiteA2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Reader) messageLiteA2);
                                this.payload_ = builder2.buildPartial();
                            }
                            this.payloadCase_ = 2;
                        } else if (iK != 26) {
                            if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                            }
                        } else {
                            Struct struct = this.extrasPrivate_;
                            Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) lVar.A(Struct.parser(), wVar);
                            this.extrasPrivate_ = struct2;
                            if (builder3 != null) {
                                builder3.mergeFrom(struct2);
                                this.extrasPrivate_ = builder3.buildPartial();
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

    public static Event parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (Event) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static Event parseFrom(l lVar) throws IOException {
        return (Event) h0.parseWithIOException(PARSER, lVar);
    }

    public static Event parseFrom(l lVar, w wVar) throws IOException {
        return (Event) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
