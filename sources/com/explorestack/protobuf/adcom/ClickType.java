package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum ClickType implements j0.c {
    CLICK_TYPE_NON_CLICKABLE(0),
    CLICK_TYPE_CLICKABLE_UNKNOWN(1),
    CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER(2),
    CLICK_TYPE_CLICKABLE_NATIVE_BROWSER(3),
    UNRECOGNIZED(-1);

    public static final int CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER_VALUE = 2;
    public static final int CLICK_TYPE_CLICKABLE_NATIVE_BROWSER_VALUE = 3;
    public static final int CLICK_TYPE_CLICKABLE_UNKNOWN_VALUE = 1;
    public static final int CLICK_TYPE_NON_CLICKABLE_VALUE = 0;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.ClickType.a
    };
    private static final ClickType[] VALUES = values();

    ClickType(int i10) {
        this.value = i10;
    }

    public static ClickType forNumber(int i10) {
        if (i10 == 0) {
            return CLICK_TYPE_NON_CLICKABLE;
        }
        if (i10 == 1) {
            return CLICK_TYPE_CLICKABLE_UNKNOWN;
        }
        if (i10 == 2) {
            return CLICK_TYPE_CLICKABLE_EMBEDDED_BROWSER;
        }
        if (i10 != 3) {
            return null;
        }
        return CLICK_TYPE_CLICKABLE_NATIVE_BROWSER;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(3);
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
    public static ClickType valueOf(int i10) {
        return forNumber(i10);
    }

    public static ClickType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
