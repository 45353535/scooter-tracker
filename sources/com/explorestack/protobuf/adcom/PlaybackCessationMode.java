package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum PlaybackCessationMode implements j0.c {
    PLAYBACK_CESSATION_MODE_INVALID(0),
    PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION(1),
    PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT(2),
    PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING(3),
    UNRECOGNIZED(-1);

    public static final int PLAYBACK_CESSATION_MODE_INVALID_VALUE = 0;
    public static final int PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING_VALUE = 3;
    public static final int PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_VALUE = 2;
    public static final int PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION_VALUE = 1;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.PlaybackCessationMode.a
    };
    private static final PlaybackCessationMode[] VALUES = values();

    PlaybackCessationMode(int i10) {
        this.value = i10;
    }

    public static PlaybackCessationMode forNumber(int i10) {
        if (i10 == 0) {
            return PLAYBACK_CESSATION_MODE_INVALID;
        }
        if (i10 == 1) {
            return PLAYBACK_CESSATION_MODE_ON_VIDEO_COMPLETION;
        }
        if (i10 == 2) {
            return PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT;
        }
        if (i10 != 3) {
            return null;
        }
        return PLAYBACK_CESSATION_MODE_ON_LEAVING_VIEWPORT_CONTINUES_FLOATING;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(24);
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
    public static PlaybackCessationMode valueOf(int i10) {
        return forNumber(i10);
    }

    public static PlaybackCessationMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
