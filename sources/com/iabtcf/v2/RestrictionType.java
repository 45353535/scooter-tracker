package com.iabtcf.v2;

/* JADX INFO: loaded from: classes9.dex */
public enum RestrictionType {
    NOT_ALLOWED,
    REQUIRE_CONSENT,
    REQUIRE_LEGITIMATE_INTEREST,
    UNDEFINED;

    public static RestrictionType from(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? NOT_ALLOWED : UNDEFINED : REQUIRE_LEGITIMATE_INTEREST : REQUIRE_CONSENT : NOT_ALLOWED;
    }
}
