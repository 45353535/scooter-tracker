package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@CheckReturnValue
final class MessageSetSchema<T> implements Schema<T> {
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(messageLite);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10) {
        return unknownFieldSchema.getSerializedSizeAsMessageSet(unknownFieldSchema.getFromMessage(t10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t10, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        UnknownFieldSchema<UT, UB> unknownFieldSchema2;
        ExtensionSchema<ET> extensionSchema2;
        Reader reader2;
        ExtensionRegistryLite extensionRegistryLite2;
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(t10);
        Object mutableExtensions = extensionSchema.getMutableExtensions(t10);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                unknownFieldSchema2 = unknownFieldSchema;
                extensionSchema2 = extensionSchema;
                reader2 = reader;
                extensionRegistryLite2 = extensionRegistryLite;
            } catch (Throwable th2) {
                th = th2;
                unknownFieldSchema2 = unknownFieldSchema;
            }
            try {
                if (!parseMessageSetItemOrUnknownField(reader2, extensionRegistryLite2, extensionSchema2, mutableExtensions, unknownFieldSchema2, builderFromMessage)) {
                    unknownFieldSchema2.setBuilderToMessage(t10, builderFromMessage);
                    return;
                }
                reader = reader2;
                extensionRegistryLite = extensionRegistryLite2;
                extensionSchema = extensionSchema2;
                unknownFieldSchema = unknownFieldSchema2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                unknownFieldSchema2.setBuilderToMessage(t10, builderFromMessage);
                throw th4;
            }
        }
        unknownFieldSchema.setBuilderToMessage(t10, builderFromMessage);
    }

    static <T> MessageSetSchema<T> newSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema<>(unknownFieldSchema, extensionSchema, messageLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema<ET> extensionSchema, FieldSet<ET> fieldSet, UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub2) throws IOException {
        int tag = reader.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return reader.skipField();
            }
            Object objFindExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return unknownFieldSchema.mergeOneFieldFrom(ub2, reader, 0);
            }
            extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = reader.readUInt32();
                objFindExtensionByNumber2 = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                extensionSchema.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                unknownFieldSchema.addLengthDelimited(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10, Writer writer) throws IOException {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(t10), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T t10, T t11) {
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T t10) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t10).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T t10) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t10).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T t10) {
        return this.extensionSchema.getExtensions(t10).isInitialized();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T t10) {
        this.unknownFieldSchema.makeImmutable(t10);
        this.extensionSchema.makeImmutable(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t10, T t11) {
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t10, Writer writer) throws IOException {
        for (T t11 : this.extensionSchema.getExtensions(t10)) {
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) t11.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t11 instanceof LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.LazyEntry) t11).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), t11.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t10, writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(T r11, byte[] r12, int r13, int r14, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSetSchema.mergeFrom(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.ArrayDecoders$Registers):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t10, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, reader, extensionRegistryLite);
    }
}
