package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum AuditStatusCode implements j0.c {
    AUDIT_STATUS_CODE_INVALID(0),
    AUDIT_STATUS_CODE_PENDING_AUDIT(1),
    AUDIT_STATUS_CODE_PRE_APPROVED(2),
    AUDIT_STATUS_CODE_APPROVED(3),
    AUDIT_STATUS_CODE_DENIED(4),
    AUDIT_STATUS_CODE_CHANGED(5),
    UNRECOGNIZED(-1);

    public static final int AUDIT_STATUS_CODE_APPROVED_VALUE = 3;
    public static final int AUDIT_STATUS_CODE_CHANGED_VALUE = 5;
    public static final int AUDIT_STATUS_CODE_DENIED_VALUE = 4;
    public static final int AUDIT_STATUS_CODE_INVALID_VALUE = 0;
    public static final int AUDIT_STATUS_CODE_PENDING_AUDIT_VALUE = 1;
    public static final int AUDIT_STATUS_CODE_PRE_APPROVED_VALUE = 2;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.AuditStatusCode.a
    };
    private static final AuditStatusCode[] VALUES = values();

    AuditStatusCode(int i10) {
        this.value = i10;
    }

    public static AuditStatusCode forNumber(int i10) {
        if (i10 == 0) {
            return AUDIT_STATUS_CODE_INVALID;
        }
        if (i10 == 1) {
            return AUDIT_STATUS_CODE_PENDING_AUDIT;
        }
        if (i10 == 2) {
            return AUDIT_STATUS_CODE_PRE_APPROVED;
        }
        if (i10 == 3) {
            return AUDIT_STATUS_CODE_APPROVED;
        }
        if (i10 == 4) {
            return AUDIT_STATUS_CODE_DENIED;
        }
        if (i10 != 5) {
            return null;
        }
        return AUDIT_STATUS_CODE_CHANGED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(0);
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
    public static AuditStatusCode valueOf(int i10) {
        return forNumber(i10);
    }

    public static AuditStatusCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
