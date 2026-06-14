package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes12.dex */
public enum PlacementTag implements j0.c {
    PLACEMENT_TAG_INVALID(0),
    PLACEMENT_TAG_DISPLAY_BANNER(1),
    PLACEMENT_TAG_DISPLAY_INTERSTITIAL(2),
    PLACEMENT_TAG_DISPLAY_NATIVE(3),
    PLACEMENT_TAG_VIDEO(4),
    PLACEMENT_TAG_REWARDED_VIDEO(5),
    UNRECOGNIZED(-1);

    public static final int PLACEMENT_TAG_DISPLAY_BANNER_VALUE = 1;
    public static final int PLACEMENT_TAG_DISPLAY_INTERSTITIAL_VALUE = 2;
    public static final int PLACEMENT_TAG_DISPLAY_NATIVE_VALUE = 3;
    public static final int PLACEMENT_TAG_INVALID_VALUE = 0;
    public static final int PLACEMENT_TAG_REWARDED_VIDEO_VALUE = 5;
    public static final int PLACEMENT_TAG_VIDEO_VALUE = 4;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: io.bidmachine.protobuf.analytics.PlacementTag.1
        public PlacementTag findValueByNumber(int i10) {
            return PlacementTag.forNumber(i10);
        }
    };
    private static final PlacementTag[] VALUES = values();

    PlacementTag(int i10) {
        this.value = i10;
    }

    public static PlacementTag forNumber(int i10) {
        if (i10 == 0) {
            return PLACEMENT_TAG_INVALID;
        }
        if (i10 == 1) {
            return PLACEMENT_TAG_DISPLAY_BANNER;
        }
        if (i10 == 2) {
            return PLACEMENT_TAG_DISPLAY_INTERSTITIAL;
        }
        if (i10 == 3) {
            return PLACEMENT_TAG_DISPLAY_NATIVE;
        }
        if (i10 == 4) {
            return PLACEMENT_TAG_VIDEO;
        }
        if (i10 != 5) {
            return null;
        }
        return PLACEMENT_TAG_REWARDED_VIDEO;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AnalyticsProto.getDescriptor().getEnumTypes().get(0);
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
    public static PlacementTag valueOf(int i10) {
        return forNumber(i10);
    }

    public static PlacementTag valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
