package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum ExpandableDirection implements j0.c {
    EXPANDABLE_DIRECTION_INVALID(0),
    EXPANDABLE_DIRECTION_LEFT(1),
    EXPANDABLE_DIRECTION_RIGHT(2),
    EXPANDABLE_DIRECTION_UP(3),
    EXPANDABLE_DIRECTION_DOWN(4),
    EXPANDABLE_DIRECTION_FULL_SCREEN(5),
    UNRECOGNIZED(-1);

    public static final int EXPANDABLE_DIRECTION_DOWN_VALUE = 4;
    public static final int EXPANDABLE_DIRECTION_FULL_SCREEN_VALUE = 5;
    public static final int EXPANDABLE_DIRECTION_INVALID_VALUE = 0;
    public static final int EXPANDABLE_DIRECTION_LEFT_VALUE = 1;
    public static final int EXPANDABLE_DIRECTION_RIGHT_VALUE = 2;
    public static final int EXPANDABLE_DIRECTION_UP_VALUE = 3;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.ExpandableDirection.a
    };
    private static final ExpandableDirection[] VALUES = values();

    ExpandableDirection(int i10) {
        this.value = i10;
    }

    public static ExpandableDirection forNumber(int i10) {
        if (i10 == 0) {
            return EXPANDABLE_DIRECTION_INVALID;
        }
        if (i10 == 1) {
            return EXPANDABLE_DIRECTION_LEFT;
        }
        if (i10 == 2) {
            return EXPANDABLE_DIRECTION_RIGHT;
        }
        if (i10 == 3) {
            return EXPANDABLE_DIRECTION_UP;
        }
        if (i10 == 4) {
            return EXPANDABLE_DIRECTION_DOWN;
        }
        if (i10 != 5) {
            return null;
        }
        return EXPANDABLE_DIRECTION_FULL_SCREEN;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(13);
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
    public static ExpandableDirection valueOf(int i10) {
        return forNumber(i10);
    }

    public static ExpandableDirection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
