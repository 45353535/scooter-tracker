package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum DeviceType implements j0.c {
    DEVICE_TYPE_INVALID(0),
    DEVICE_TYPE_MOBILE(1),
    DEVICE_TYPE_PHONE_DEVICE(4),
    DEVICE_TYPE_TABLET(5),
    UNRECOGNIZED(-1);

    public static final int DEVICE_TYPE_INVALID_VALUE = 0;
    public static final int DEVICE_TYPE_MOBILE_VALUE = 1;
    public static final int DEVICE_TYPE_PHONE_DEVICE_VALUE = 4;
    public static final int DEVICE_TYPE_TABLET_VALUE = 5;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.DeviceType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public DeviceType m4450findValueByNumber(int i10) {
            return DeviceType.forNumber(i10);
        }
    };
    private static final DeviceType[] VALUES = values();

    DeviceType(int i10) {
        this.value = i10;
    }

    public static DeviceType forNumber(int i10) {
        if (i10 == 0) {
            return DEVICE_TYPE_INVALID;
        }
        if (i10 == 1) {
            return DEVICE_TYPE_MOBILE;
        }
        if (i10 == 4) {
            return DEVICE_TYPE_PHONE_DEVICE;
        }
        if (i10 != 5) {
            return null;
        }
        return DEVICE_TYPE_TABLET;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(9);
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
    public static DeviceType valueOf(int i10) {
        return forNumber(i10);
    }

    public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
