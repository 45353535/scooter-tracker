package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum ProductionQuality implements j0.c {
    PRODUCTION_QUALITY_INVALID(0),
    PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED(1),
    PRODUCTION_QUALITY_PROSUMER(2),
    PRODUCTION_QUALITY_USER_GENERATED(3),
    UNRECOGNIZED(-1);

    public static final int PRODUCTION_QUALITY_INVALID_VALUE = 0;
    public static final int PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED_VALUE = 1;
    public static final int PRODUCTION_QUALITY_PROSUMER_VALUE = 2;
    public static final int PRODUCTION_QUALITY_USER_GENERATED_VALUE = 3;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.ProductionQuality.a
    };
    private static final ProductionQuality[] VALUES = values();

    ProductionQuality(int i10) {
        this.value = i10;
    }

    public static ProductionQuality forNumber(int i10) {
        if (i10 == 0) {
            return PRODUCTION_QUALITY_INVALID;
        }
        if (i10 == 1) {
            return PRODUCTION_QUALITY_PROFESSIONALLY_PRODUCED;
        }
        if (i10 == 2) {
            return PRODUCTION_QUALITY_PROSUMER;
        }
        if (i10 != 3) {
            return null;
        }
        return PRODUCTION_QUALITY_USER_GENERATED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(27);
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
    public static ProductionQuality valueOf(int i10) {
        return forNumber(i10);
    }

    public static ProductionQuality valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
