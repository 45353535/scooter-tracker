package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
public enum CategoryTaxonomy implements j0.c {
    CATEGORY_TAXONOMY_INVALID(0),
    CATEGORY_TAXONOMY_IAB_CONTENT_1_0(1),
    CATEGORY_TAXONOMY_IAB_CONTENT_2_0(2),
    CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0(3),
    UNRECOGNIZED(-1);

    public static final int CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0_VALUE = 3;
    public static final int CATEGORY_TAXONOMY_IAB_CONTENT_1_0_VALUE = 1;
    public static final int CATEGORY_TAXONOMY_IAB_CONTENT_2_0_VALUE = 2;
    public static final int CATEGORY_TAXONOMY_INVALID_VALUE = 0;
    private final int value;
    private static final j0.d internalValueMap = new j0.d() { // from class: com.explorestack.protobuf.adcom.CategoryTaxonomy.a
    };
    private static final CategoryTaxonomy[] VALUES = values();

    CategoryTaxonomy(int i10) {
        this.value = i10;
    }

    public static CategoryTaxonomy forNumber(int i10) {
        if (i10 == 0) {
            return CATEGORY_TAXONOMY_INVALID;
        }
        if (i10 == 1) {
            return CATEGORY_TAXONOMY_IAB_CONTENT_1_0;
        }
        if (i10 == 2) {
            return CATEGORY_TAXONOMY_IAB_CONTENT_2_0;
        }
        if (i10 != 3) {
            return null;
        }
        return CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(2);
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
    public static CategoryTaxonomy valueOf(int i10) {
        return forNumber(i10);
    }

    public static CategoryTaxonomy valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
