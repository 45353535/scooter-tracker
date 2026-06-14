package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum ConnectionStatus implements j0.c {
    CONNECTION_STATUS_UNDEFINED(0),
    CONNECTION_STATUS_ENABLED(1),
    CONNECTION_STATUS_DISABLED(2),
    UNRECOGNIZED(-1);

    public static final int CONNECTION_STATUS_DISABLED_VALUE = 2;
    public static final int CONNECTION_STATUS_ENABLED_VALUE = 1;
    public static final int CONNECTION_STATUS_UNDEFINED_VALUE = 0;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.ConnectionStatus.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public ConnectionStatus m4448findValueByNumber(int i10) {
            return ConnectionStatus.forNumber(i10);
        }
    };
    private static final ConnectionStatus[] VALUES = values();

    ConnectionStatus(int i10) {
        this.value = i10;
    }

    public static ConnectionStatus forNumber(int i10) {
        if (i10 == 0) {
            return CONNECTION_STATUS_UNDEFINED;
        }
        if (i10 == 1) {
            return CONNECTION_STATUS_ENABLED;
        }
        if (i10 != 2) {
            return null;
        }
        return CONNECTION_STATUS_DISABLED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(31);
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
    public static ConnectionStatus valueOf(int i10) {
        return forNumber(i10);
    }

    public static ConnectionStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
