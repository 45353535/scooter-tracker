package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum NullValue implements j0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.NullValue.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public NullValue m4440findValueByNumber(int i10) {
            return NullValue.forNumber(i10);
        }
    };
    private static final NullValue[] VALUES = values();

    NullValue(int i10) {
        this.value = i10;
    }

    public static NullValue forNumber(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return f2.a().getEnumTypes().get(0);
    }

    public static j0.d internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.explorestack.protobuf.j0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i10) {
        return forNumber(i10);
    }

    public static NullValue valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
