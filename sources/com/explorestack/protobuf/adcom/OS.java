package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum OS implements j0.c {
    OS_INVALID(0),
    OS_ANDROID(2),
    OS_IOS(13),
    UNRECOGNIZED(-1);

    public static final int OS_ANDROID_VALUE = 2;
    public static final int OS_INVALID_VALUE = 0;
    public static final int OS_IOS_VALUE = 13;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.OS.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public OS m4456findValueByNumber(int i10) {
            return OS.forNumber(i10);
        }
    };
    private static final OS[] VALUES = values();

    OS(int i10) {
        this.value = i10;
    }

    public static OS forNumber(int i10) {
        if (i10 == 0) {
            return OS_INVALID;
        }
        if (i10 == 2) {
            return OS_ANDROID;
        }
        if (i10 != 13) {
            return null;
        }
        return OS_IOS;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(23);
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
    public static OS valueOf(int i10) {
        return forNumber(i10);
    }

    public static OS valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
