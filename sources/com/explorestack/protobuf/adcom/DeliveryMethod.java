package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum DeliveryMethod implements j0.c {
    DELIVERY_METHOD_INVALID(0),
    DELIVERY_METHOD_STREAMING(1),
    DELIVERY_METHOD_PROGRESSIVE(2),
    DELIVERY_METHOD_DOWNLOAD(3),
    UNRECOGNIZED(-1);

    public static final int DELIVERY_METHOD_DOWNLOAD_VALUE = 3;
    public static final int DELIVERY_METHOD_INVALID_VALUE = 0;
    public static final int DELIVERY_METHOD_PROGRESSIVE_VALUE = 2;
    public static final int DELIVERY_METHOD_STREAMING_VALUE = 1;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.DeliveryMethod.a
    };
    private static final DeliveryMethod[] VALUES = values();

    DeliveryMethod(int i10) {
        this.value = i10;
    }

    public static DeliveryMethod forNumber(int i10) {
        if (i10 == 0) {
            return DELIVERY_METHOD_INVALID;
        }
        if (i10 == 1) {
            return DELIVERY_METHOD_STREAMING;
        }
        if (i10 == 2) {
            return DELIVERY_METHOD_PROGRESSIVE;
        }
        if (i10 != 3) {
            return null;
        }
        return DELIVERY_METHOD_DOWNLOAD;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(8);
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
    public static DeliveryMethod valueOf(int i10) {
        return forNumber(i10);
    }

    public static DeliveryMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
