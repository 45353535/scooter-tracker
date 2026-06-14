package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.e1;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.r2;
import com.ironsource.C4240b4;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractMessage extends a implements Message {
    protected int memoizedSize = -1;

    public static abstract class Builder<BuilderType extends Builder<BuilderType>> extends a.AbstractC0320a implements Message.Builder {
        protected static p2 newUninitializedMessageException(Message message) {
            return new p2(e1.b(message));
        }

        void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public List<String> findInitializationErrors() {
            return e1.b(this);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public String getInitializationErrorString() {
            return e1.a(findInitializationErrors());
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public abstract /* synthetic */ boolean isInitialized();

        void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return super.mergeDelimitedFrom(inputStream);
        }

        public String toString() {
            return TextFormat.printer().printToString(this);
        }

        public BuilderType clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            throw new UnsupportedOperationException("clearOneof() is not implemented.");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.a.AbstractC0320a
        public BuilderType internalMergeFrom(a aVar) {
            return (BuilderType) mergeFrom((Message) aVar);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return super.mergeDelimitedFrom(inputStream, wVar);
        }

        public BuilderType mergeUnknownFields(r2 r2Var) {
            setUnknownFields(r2.h(getUnknownFields()).x(r2Var).build());
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType clear() {
            Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> it = getAllFields().entrySet().iterator();
            while (it.hasNext()) {
                clearField(it.next().getKey());
            }
            return this;
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public BuilderType mo4427clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        public BuilderType mergeFrom(Message message) {
            return (BuilderType) mergeFrom(message, message.getAllFields());
        }

        BuilderType mergeFrom(Message message, Map<Descriptors.FieldDescriptor, Object> map) {
            if (message.getDescriptorForType() == getDescriptorForType()) {
                for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
                    Descriptors.FieldDescriptor key = entry.getKey();
                    if (key.isRepeated()) {
                        Iterator it = ((List) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            addRepeatedField(key, it.next());
                        }
                    } else if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        Message message2 = (Message) getField(key);
                        if (message2 == message2.getDefaultInstanceForType()) {
                            setField(key, entry.getValue());
                        } else {
                            setField(key, message2.newBuilderForType().mergeFrom(message2).mergeFrom((Message) entry.getValue()).build());
                        }
                    } else {
                        setField(key, entry.getValue());
                    }
                }
                mergeUnknownFields(message.getUnknownFields());
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(l lVar) throws IOException {
            return (BuilderType) mergeFrom(lVar, (w) u.g());
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(l lVar, w wVar) throws IOException {
            r2.b bVarH = lVar.N() ? null : r2.h(getUnknownFields());
            while (true) {
                int iK = lVar.K();
                if (iK == 0) {
                    break;
                }
                l lVar2 = lVar;
                w wVar2 = wVar;
                if (!e1.f(lVar2, bVarH, wVar2, getDescriptorForType(), new e1.b(this), iK)) {
                    break;
                }
                lVar = lVar2;
                wVar = wVar2;
            }
            if (bVarH != null) {
                setUnknownFields(bVarH.build());
            }
            return this;
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(byteString);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, wVar);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, w wVar) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, i10, i11, wVar);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            return (BuilderType) super.mergeFrom(inputStream);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(InputStream inputStream, w wVar) throws IOException {
            return (BuilderType) super.mergeFrom(inputStream, wVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface BuilderParent {
        void markDirty();
    }

    private static boolean compareBytes(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : toByteString(obj).equals(toByteString(obj2));
    }

    static boolean compareFields(Map<Descriptors.FieldDescriptor, Object> map, Map<Descriptors.FieldDescriptor, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Descriptors.FieldDescriptor fieldDescriptor : map.keySet()) {
            if (!map2.containsKey(fieldDescriptor)) {
                return false;
            }
            Object obj = map.get(fieldDescriptor);
            Object obj2 = map2.get(fieldDescriptor);
            if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                if (fieldDescriptor.isRepeated()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!compareBytes(list.get(i10), list2.get(i10))) {
                            return false;
                        }
                    }
                } else if (!compareBytes(obj, obj2)) {
                    return false;
                }
            } else if (fieldDescriptor.isMapField()) {
                if (!compareMapField(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareMapField(Object obj, Object obj2) {
        return x0.l(convertMapEntryListToMap((List) obj), convertMapEntryListToMap((List) obj2));
    }

    private static Map convertMapEntryListToMap(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        Message message = (Message) it.next();
        Descriptors.Descriptor descriptorForType = message.getDescriptorForType();
        Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(C4240b4.i.W);
        Descriptors.FieldDescriptor fieldDescriptorFindFieldByName2 = descriptorForType.findFieldByName("value");
        Object field = message.getField(fieldDescriptorFindFieldByName2);
        if (field instanceof Descriptors.EnumValueDescriptor) {
            field = Integer.valueOf(((Descriptors.EnumValueDescriptor) field).getNumber());
        }
        map.put(message.getField(fieldDescriptorFindFieldByName), field);
        while (it.hasNext()) {
            Message message2 = (Message) it.next();
            Object field2 = message2.getField(fieldDescriptorFindFieldByName2);
            if (field2 instanceof Descriptors.EnumValueDescriptor) {
                field2 = Integer.valueOf(((Descriptors.EnumValueDescriptor) field2).getNumber());
            }
            map.put(message2.getField(fieldDescriptorFindFieldByName), field2);
        }
        return map;
    }

    @Deprecated
    protected static int hashBoolean(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    @Deprecated
    protected static int hashEnum(j0.c cVar) {
        return cVar.getNumber();
    }

    @Deprecated
    protected static int hashEnumList(List<? extends j0.c> list) {
        Iterator<? extends j0.c> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    protected static int hashFields(int i10, Map<Descriptors.FieldDescriptor, Object> map) {
        int i11;
        int iG;
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            int number = (i10 * 37) + key.getNumber();
            if (key.isMapField()) {
                i11 = number * 53;
                iG = hashMapField(value);
            } else if (key.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                i11 = number * 53;
                iG = value.hashCode();
            } else if (key.isRepeated()) {
                i11 = number * 53;
                iG = j0.h((List) value);
            } else {
                i11 = number * 53;
                iG = j0.g((j0.c) value);
            }
            i10 = i11 + iG;
        }
        return i10;
    }

    @Deprecated
    protected static int hashLong(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    private static int hashMapField(Object obj) {
        return x0.a(convertMapEntryListToMap((List) obj));
    }

    private static ByteString toByteString(Object obj) {
        return obj instanceof byte[] ? ByteString.copyFrom((byte[]) obj) : (ByteString) obj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return getDescriptorForType() == message.getDescriptorForType() && compareFields(getAllFields(), message.getAllFields()) && getUnknownFields().equals(message.getUnknownFields());
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public List<String> findInitializationErrors() {
        return e1.b(this);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public String getInitializationErrorString() {
        return e1.a(findInitializationErrors());
    }

    @Override // com.explorestack.protobuf.a
    int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iD = e1.d(this, getAllFields());
        this.memoizedSize = iD;
        return iD;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashFields = (hashFields(779 + getDescriptorForType().hashCode(), getAllFields()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashFields;
        return iHashFields;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return e1.e(this);
    }

    protected Message.Builder newBuilderForType(BuilderParent builderParent) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.explorestack.protobuf.a
    p2 newUninitializedMessageException() {
        return Builder.newUninitializedMessageException((Message) this);
    }

    @Override // com.explorestack.protobuf.a
    void setMemoizedSerializedSize(int i10) {
        this.memoizedSize = i10;
    }

    @Override // com.explorestack.protobuf.Message
    public final String toString() {
        return TextFormat.printer().printToString(this);
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        e1.i(this, getAllFields(), nVar, false);
    }
}
