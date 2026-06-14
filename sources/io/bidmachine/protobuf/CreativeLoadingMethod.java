package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes11.dex */
public enum CreativeLoadingMethod implements j0.c {
    FullLoad(0),
    Stream(1),
    PartialLoad(2),
    UNRECOGNIZED(-1);

    public static final int FullLoad_VALUE = 0;
    public static final int PartialLoad_VALUE = 2;
    public static final int Stream_VALUE = 1;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: io.bidmachine.protobuf.CreativeLoadingMethod.1
        public CreativeLoadingMethod findValueByNumber(int i10) {
            return CreativeLoadingMethod.forNumber(i10);
        }
    };
    private static final CreativeLoadingMethod[] VALUES = values();

    CreativeLoadingMethod(int i10) {
        this.value = i10;
    }

    public static CreativeLoadingMethod forNumber(int i10) {
        if (i10 == 0) {
            return FullLoad;
        }
        if (i10 == 1) {
            return Stream;
        }
        if (i10 != 2) {
            return null;
        }
        return PartialLoad;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(6);
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
    public static CreativeLoadingMethod valueOf(int i10) {
        return forNumber(i10);
    }

    public static CreativeLoadingMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
