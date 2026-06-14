package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@GwtCompatible
public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f34084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f34085c;

    PublicSuffixType(char c10, char c11) {
        this.f34084b = c10;
        this.f34085c = c11;
    }

    static PublicSuffixType g(char c10) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.h() == c10 || publicSuffixType.i() == c10) {
                return publicSuffixType;
            }
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + c10);
    }

    char h() {
        return this.f34084b;
    }

    char i() {
        return this.f34085c;
    }
}
