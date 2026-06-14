package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class ParseRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f31124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f31125b;

    private ParseRequest(String str, int i10) {
        this.f31124a = str;
        this.f31125b = i10;
    }

    static ParseRequest a(String str) {
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = str.charAt(0);
        int i10 = 16;
        if (str.startsWith("0x") || str.startsWith("0X")) {
            str = str.substring(2);
        } else if (cCharAt == '#') {
            str = str.substring(1);
        } else if (cCharAt != '0' || str.length() <= 1) {
            i10 = 10;
        } else {
            str = str.substring(1);
            i10 = 8;
        }
        return new ParseRequest(str, i10);
    }
}
