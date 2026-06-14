package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import java.util.Deque;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
final class TrieParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Joiner f34086a = Joiner.on("");

    private static int a(Deque deque, CharSequence charSequence, int i10, ImmutableMap.Builder builder) {
        int length = charSequence.length();
        char cCharAt = 0;
        int i11 = i10;
        while (i11 < length && (cCharAt = charSequence.charAt(i11)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i11++;
        }
        deque.push(d(charSequence.subSequence(i10, i11)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strJoin = f34086a.join(deque);
            if (strJoin.length() > 0) {
                builder.put(strJoin, PublicSuffixType.g(cCharAt));
            }
        }
        int iA = i11 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iA < length) {
                iA += a(deque, charSequence, iA, builder);
                if (charSequence.charAt(iA) == '?' || charSequence.charAt(iA) == ',') {
                    iA++;
                    break;
                }
            }
        }
        deque.pop();
        return iA - i10;
    }

    static ImmutableMap b(String str) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int length = str.length();
        int iA = 0;
        while (iA < length) {
            iA += a(Queues.newArrayDeque(), str, iA, builder);
        }
        return builder.buildOrThrow();
    }

    static ImmutableMap c(CharSequence... charSequenceArr) {
        return b(f34086a.join(charSequenceArr));
    }

    private static CharSequence d(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
