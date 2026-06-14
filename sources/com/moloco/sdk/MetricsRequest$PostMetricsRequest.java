package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MetricsRequest$PostMetricsRequest extends GeneratedMessageLite<MetricsRequest$PostMetricsRequest, a> implements MessageLiteOrBuilder {
    public static final int COUNTS_FIELD_NUMBER = 1;
    private static final MetricsRequest$PostMetricsRequest DEFAULT_INSTANCE;
    public static final int DURATIONS_FIELD_NUMBER = 2;
    private static volatile Parser<MetricsRequest$PostMetricsRequest> PARSER;
    private Internal.ProtobufList<CountEvent> counts_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TimerEvent> durations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class CountEvent extends GeneratedMessageLite<CountEvent, a> implements b {
        public static final int COUNT_FIELD_NUMBER = 2;
        private static final CountEvent DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<CountEvent> PARSER = null;
        public static final int TAGS_FIELD_NUMBER = 3;
        private int count_;
        private String name_ = "";
        private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.Builder implements b {
            public a a(Iterable iterable) {
                copyOnWrite();
                ((CountEvent) this.instance).addAllTags(iterable);
                return this;
            }

            public a b(int i10) {
                copyOnWrite();
                ((CountEvent) this.instance).setCount(i10);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((CountEvent) this.instance).setName(str);
                return this;
            }

            private a() {
                super(CountEvent.DEFAULT_INSTANCE);
            }
        }

        static {
            CountEvent countEvent = new CountEvent();
            DEFAULT_INSTANCE = countEvent;
            GeneratedMessageLite.registerDefaultInstance(CountEvent.class, countEvent);
        }

        private CountEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTags(Iterable<String> iterable) {
            ensureTagsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
        }

        private void addTags(String str) {
            str.getClass();
            ensureTagsIsMutable();
            this.tags_.add(str);
        }

        private void addTagsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureTagsIsMutable();
            this.tags_.add(byteString.toStringUtf8());
        }

        private void clearCount() {
            this.count_ = 0;
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearTags() {
            this.tags_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTagsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.tags_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static CountEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CountEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CountEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CountEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int i10) {
            this.count_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        private void setTags(int i10, String str) {
            str.getClass();
            ensureTagsIsMutable();
            this.tags_.set(i10, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (l.f55782a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CountEvent();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003Ț", new Object[]{"name_", "count_", "tags_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CountEvent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CountEvent.class) {
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

        public int getCount() {
            return this.count_;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public String getTags(int i10) {
            return this.tags_.get(i10);
        }

        public ByteString getTagsBytes(int i10) {
            return ByteString.copyFromUtf8(this.tags_.get(i10));
        }

        public int getTagsCount() {
            return this.tags_.size();
        }

        public List<String> getTagsList() {
            return this.tags_;
        }

        public static a newBuilder(CountEvent countEvent) {
            return DEFAULT_INSTANCE.createBuilder(countEvent);
        }

        public static CountEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CountEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CountEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CountEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CountEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CountEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CountEvent parseFrom(InputStream inputStream) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CountEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CountEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CountEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CountEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TimerEvent extends GeneratedMessageLite<TimerEvent, a> implements c {
        private static final TimerEvent DEFAULT_INSTANCE;
        public static final int ELAPSED_TIME_MILLIS_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<TimerEvent> PARSER = null;
        public static final int TAGS_FIELD_NUMBER = 3;
        private long elapsedTimeMillis_;
        private String name_ = "";
        private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.Builder implements c {
            public a a(Iterable iterable) {
                copyOnWrite();
                ((TimerEvent) this.instance).addAllTags(iterable);
                return this;
            }

            public a b(long j10) {
                copyOnWrite();
                ((TimerEvent) this.instance).setElapsedTimeMillis(j10);
                return this;
            }

            public a c(String str) {
                copyOnWrite();
                ((TimerEvent) this.instance).setName(str);
                return this;
            }

            private a() {
                super(TimerEvent.DEFAULT_INSTANCE);
            }
        }

        static {
            TimerEvent timerEvent = new TimerEvent();
            DEFAULT_INSTANCE = timerEvent;
            GeneratedMessageLite.registerDefaultInstance(TimerEvent.class, timerEvent);
        }

        private TimerEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTags(Iterable<String> iterable) {
            ensureTagsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
        }

        private void addTags(String str) {
            str.getClass();
            ensureTagsIsMutable();
            this.tags_.add(str);
        }

        private void addTagsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureTagsIsMutable();
            this.tags_.add(byteString.toStringUtf8());
        }

        private void clearElapsedTimeMillis() {
            this.elapsedTimeMillis_ = 0L;
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void clearTags() {
            this.tags_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTagsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.tags_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static TimerEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TimerEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimerEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TimerEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setElapsedTimeMillis(long j10) {
            this.elapsedTimeMillis_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        private void setNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        private void setTags(int i10, String str) {
            str.getClass();
            ensureTagsIsMutable();
            this.tags_.set(i10, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (l.f55782a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TimerEvent();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ț", new Object[]{"name_", "elapsedTimeMillis_", "tags_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TimerEvent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TimerEvent.class) {
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

        public long getElapsedTimeMillis() {
            return this.elapsedTimeMillis_;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public String getTags(int i10) {
            return this.tags_.get(i10);
        }

        public ByteString getTagsBytes(int i10) {
            return ByteString.copyFromUtf8(this.tags_.get(i10));
        }

        public int getTagsCount() {
            return this.tags_.size();
        }

        public List<String> getTagsList() {
            return this.tags_;
        }

        public static a newBuilder(TimerEvent timerEvent) {
            return DEFAULT_INSTANCE.createBuilder(timerEvent);
        }

        public static TimerEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TimerEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TimerEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(InputStream inputStream) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TimerEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TimerEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TimerEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TimerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public a a(Iterable iterable) {
            copyOnWrite();
            ((MetricsRequest$PostMetricsRequest) this.instance).addAllCounts(iterable);
            return this;
        }

        public a b(Iterable iterable) {
            copyOnWrite();
            ((MetricsRequest$PostMetricsRequest) this.instance).addAllDurations(iterable);
            return this;
        }

        private a() {
            super(MetricsRequest$PostMetricsRequest.DEFAULT_INSTANCE);
        }
    }

    public interface b extends MessageLiteOrBuilder {
    }

    public interface c extends MessageLiteOrBuilder {
    }

    static {
        MetricsRequest$PostMetricsRequest metricsRequest$PostMetricsRequest = new MetricsRequest$PostMetricsRequest();
        DEFAULT_INSTANCE = metricsRequest$PostMetricsRequest;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$PostMetricsRequest.class, metricsRequest$PostMetricsRequest);
    }

    private MetricsRequest$PostMetricsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCounts(Iterable<? extends CountEvent> iterable) {
        ensureCountsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.counts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDurations(Iterable<? extends TimerEvent> iterable) {
        ensureDurationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.durations_);
    }

    private void addCounts(CountEvent countEvent) {
        countEvent.getClass();
        ensureCountsIsMutable();
        this.counts_.add(countEvent);
    }

    private void addDurations(TimerEvent timerEvent) {
        timerEvent.getClass();
        ensureDurationsIsMutable();
        this.durations_.add(timerEvent);
    }

    private void clearCounts() {
        this.counts_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDurations() {
        this.durations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureCountsIsMutable() {
        Internal.ProtobufList<CountEvent> protobufList = this.counts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.counts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDurationsIsMutable() {
        Internal.ProtobufList<TimerEvent> protobufList = this.durations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.durations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MetricsRequest$PostMetricsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricsRequest$PostMetricsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricsRequest$PostMetricsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeCounts(int i10) {
        ensureCountsIsMutable();
        this.counts_.remove(i10);
    }

    private void removeDurations(int i10) {
        ensureDurationsIsMutable();
        this.durations_.remove(i10);
    }

    private void setCounts(int i10, CountEvent countEvent) {
        countEvent.getClass();
        ensureCountsIsMutable();
        this.counts_.set(i10, countEvent);
    }

    private void setDurations(int i10, TimerEvent timerEvent) {
        timerEvent.getClass();
        ensureDurationsIsMutable();
        this.durations_.set(i10, timerEvent);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (l.f55782a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$PostMetricsRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"counts_", CountEvent.class, "durations_", TimerEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$PostMetricsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricsRequest$PostMetricsRequest.class) {
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

    public CountEvent getCounts(int i10) {
        return this.counts_.get(i10);
    }

    public int getCountsCount() {
        return this.counts_.size();
    }

    public List<CountEvent> getCountsList() {
        return this.counts_;
    }

    public b getCountsOrBuilder(int i10) {
        return this.counts_.get(i10);
    }

    public List<? extends b> getCountsOrBuilderList() {
        return this.counts_;
    }

    public TimerEvent getDurations(int i10) {
        return this.durations_.get(i10);
    }

    public int getDurationsCount() {
        return this.durations_.size();
    }

    public List<TimerEvent> getDurationsList() {
        return this.durations_;
    }

    public c getDurationsOrBuilder(int i10) {
        return this.durations_.get(i10);
    }

    public List<? extends c> getDurationsOrBuilderList() {
        return this.durations_;
    }

    public static a newBuilder(MetricsRequest$PostMetricsRequest metricsRequest$PostMetricsRequest) {
        return DEFAULT_INSTANCE.createBuilder(metricsRequest$PostMetricsRequest);
    }

    public static MetricsRequest$PostMetricsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addCounts(int i10, CountEvent countEvent) {
        countEvent.getClass();
        ensureCountsIsMutable();
        this.counts_.add(i10, countEvent);
    }

    private void addDurations(int i10, TimerEvent timerEvent) {
        timerEvent.getClass();
        ensureDurationsIsMutable();
        this.durations_.add(i10, timerEvent);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricsRequest$PostMetricsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$PostMetricsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
