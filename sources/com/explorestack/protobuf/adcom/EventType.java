package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum EventType implements j0.c {
    EVENT_TYPE_INVALID(0),
    EVENT_TYPE_IMPRESSION(1),
    EVENT_TYPE_VIEWABLE_MRC_50(2),
    EVENT_TYPE_VIEWABLE_MRC_100(3),
    EVENT_TYPE_VIEWABLE_VIDEO_50(4),
    UNRECOGNIZED(-1);

    public static final int EVENT_TYPE_IMPRESSION_VALUE = 1;
    public static final int EVENT_TYPE_INVALID_VALUE = 0;
    public static final int EVENT_TYPE_VIEWABLE_MRC_100_VALUE = 3;
    public static final int EVENT_TYPE_VIEWABLE_MRC_50_VALUE = 2;
    public static final int EVENT_TYPE_VIEWABLE_VIDEO_50_VALUE = 4;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.EventType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public EventType m4451findValueByNumber(int i10) {
            return EventType.forNumber(i10);
        }
    };
    private static final EventType[] VALUES = values();

    EventType(int i10) {
        this.value = i10;
    }

    public static EventType forNumber(int i10) {
        if (i10 == 0) {
            return EVENT_TYPE_INVALID;
        }
        if (i10 == 1) {
            return EVENT_TYPE_IMPRESSION;
        }
        if (i10 == 2) {
            return EVENT_TYPE_VIEWABLE_MRC_50;
        }
        if (i10 == 3) {
            return EVENT_TYPE_VIEWABLE_MRC_100;
        }
        if (i10 != 4) {
            return null;
        }
        return EVENT_TYPE_VIEWABLE_VIDEO_50;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(15);
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
    public static EventType valueOf(int i10) {
        return forNumber(i10);
    }

    public static EventType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
