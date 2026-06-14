package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum MediaRating implements j0.c {
    MEDIA_RATING_INVALID(0),
    MEDIA_RATING_ALL_AUDIENCES(1),
    MEDIA_RATING_EVERYONE_OVER_AGE_12(2),
    MEDIA_RATING_MATURE_AUDIENCES(3),
    UNRECOGNIZED(-1);

    public static final int MEDIA_RATING_ALL_AUDIENCES_VALUE = 1;
    public static final int MEDIA_RATING_EVERYONE_OVER_AGE_12_VALUE = 2;
    public static final int MEDIA_RATING_INVALID_VALUE = 0;
    public static final int MEDIA_RATING_MATURE_AUDIENCES_VALUE = 3;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.MediaRating.a
    };
    private static final MediaRating[] VALUES = values();

    MediaRating(int i10) {
        this.value = i10;
    }

    public static MediaRating forNumber(int i10) {
        if (i10 == 0) {
            return MEDIA_RATING_INVALID;
        }
        if (i10 == 1) {
            return MEDIA_RATING_ALL_AUDIENCES;
        }
        if (i10 == 2) {
            return MEDIA_RATING_EVERYONE_OVER_AGE_12;
        }
        if (i10 != 3) {
            return null;
        }
        return MEDIA_RATING_MATURE_AUDIENCES;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(19);
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
    public static MediaRating valueOf(int i10) {
        return forNumber(i10);
    }

    public static MediaRating valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
