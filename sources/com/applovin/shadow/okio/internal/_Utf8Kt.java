package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String str) {
        int i10;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (Intrinsics.compare((int) cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i12 = i11;
                while (i11 < length2) {
                    char cCharAt3 = str.charAt(i11);
                    if (Intrinsics.compare((int) cCharAt3, 128) < 0) {
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) cCharAt3;
                        i11++;
                        while (true) {
                            i12 = i13;
                            if (i11 >= length2 || Intrinsics.compare((int) str.charAt(i11), 128) >= 0) {
                                break;
                            }
                            i13 = i12 + 1;
                            bArr[i12] = (byte) str.charAt(i11);
                            i11++;
                        }
                    } else {
                        if (Intrinsics.compare((int) cCharAt3, 2048) < 0) {
                            bArr[i12] = (byte) ((cCharAt3 >> 6) | 192);
                            i12 += 2;
                            bArr[i12 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i12] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i12 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i12 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (Intrinsics.compare((int) cCharAt3, 56319) > 0 || length2 <= (i10 = i11 + 1) || 56320 > (cCharAt = str.charAt(i10)) || cCharAt >= 57344) {
                            bArr[i12] = Utf8.REPLACEMENT_BYTE;
                            i11++;
                            i12++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i10)) - 56613888;
                            bArr[i12] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i12 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i12 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i12 + 3] = (byte) ((iCharAt & 63) | 128);
                            i11 += 2;
                        }
                        i11++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i11] = (byte) cCharAt2;
            i11++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    @NotNull
    public static final String commonToUtf8String(@NotNull byte[] bArr, int i10, int i11) {
        byte b10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i10;
        int i19 = 2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i18 < 0 || i11 > bArr.length || i18 > i11) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i18 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i18];
        int i20 = 0;
        while (i18 < i11) {
            byte b11 = bArr[i18];
            if (b11 >= 0) {
                int i21 = i20 + 1;
                cArr[i20] = (char) b11;
                i18++;
                while (true) {
                    i20 = i21;
                    if (i18 >= i11 || (b10 = bArr[i18]) < 0) {
                        break;
                    }
                    i18++;
                    i21 = i20 + 1;
                    cArr[i20] = (char) b10;
                }
            } else if ((b11 >> 5) == -2) {
                int i22 = i18 + 1;
                if (i11 <= i22) {
                    i12 = i20 + 1;
                    cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                } else {
                    byte b12 = bArr[i22];
                    if ((b12 & 192) == 128) {
                        int i23 = (b11 << 6) ^ (b12 ^ UnsignedBytes.MAX_POWER_OF_TWO);
                        if (i23 < 128) {
                            i12 = i20 + 1;
                            cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        } else {
                            i12 = i20 + 1;
                            cArr[i20] = (char) i23;
                        }
                        Unit unit = Unit.f93236a;
                        i13 = i19;
                        i20 = i12;
                        i18 += i13;
                    } else {
                        i12 = i20 + 1;
                        cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                Unit unit2 = Unit.f93236a;
                i13 = 1;
                i20 = i12;
                i18 += i13;
            } else if ((b11 >> 4) == -2) {
                int i24 = i18 + 2;
                if (i11 <= i24) {
                    int i25 = i20 + 1;
                    cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    Unit unit3 = Unit.f93236a;
                    int i26 = i18 + 1;
                    i16 = (i11 <= i26 || (bArr[i26] & 192) != 128) ? 1 : i19;
                    i20 = i25;
                } else {
                    byte b13 = bArr[i18 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i24];
                        if ((b14 & 192) == 128) {
                            int i27 = ((b14 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b13 << 6)) ^ (b11 << Ascii.FF);
                            if (i27 < 2048) {
                                i17 = i20 + 1;
                                cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else if (55296 > i27 || i27 >= 57344) {
                                char c10 = (char) i27;
                                i17 = i20 + 1;
                                cArr[i20] = c10;
                            } else {
                                i17 = i20 + 1;
                                cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            }
                            Unit unit4 = Unit.f93236a;
                            i20 = i17;
                            i16 = 3;
                        } else {
                            cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit5 = Unit.f93236a;
                            i20++;
                            i16 = i19;
                        }
                    } else {
                        cArr[i20] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit6 = Unit.f93236a;
                        i20++;
                        i16 = 1;
                    }
                }
                i18 += i16;
            } else if ((b11 >> 3) == -2) {
                int i28 = i18 + 3;
                if (i11 <= i28) {
                    int i29 = i20 + 1;
                    cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                    Unit unit7 = Unit.f93236a;
                    int i30 = i18 + 1;
                    if (i11 <= i30 || (bArr[i30] & 192) != 128) {
                        i20 = i29;
                        i14 = i19;
                        i19 = 1;
                        i18 += i19;
                        i19 = i14;
                    } else {
                        int i31 = i18 + 2;
                        if (i11 <= i31 || (bArr[i31] & 192) != 128) {
                            i20 = i29;
                            i14 = i19;
                            i18 += i19;
                            i19 = i14;
                        } else {
                            i20 = i29;
                            i14 = i19;
                            i19 = 3;
                            i18 += i19;
                            i19 = i14;
                        }
                    }
                } else {
                    byte b15 = bArr[i18 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i18 + 2];
                        i14 = i19;
                        if ((b16 & 192) == 128) {
                            byte b17 = bArr[i28];
                            if ((b17 & 192) == 128) {
                                int i32 = (((b17 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b16 << 6)) ^ (b15 << Ascii.FF)) ^ (b11 << Ascii.DC2);
                                if (i32 > 1114111) {
                                    i15 = i20 + 1;
                                    cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                } else if ((55296 > i32 || i32 >= 57344) && i32 >= 65536 && i32 != 65533) {
                                    cArr[i20] = (char) ((i32 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                    cArr[i20 + 1] = (char) ((i32 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                    i15 = i20 + 2;
                                } else {
                                    i15 = i20 + 1;
                                    cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                }
                                Unit unit8 = Unit.f93236a;
                                i20 = i15;
                                i19 = 4;
                            } else {
                                cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit9 = Unit.f93236a;
                                i20++;
                                i19 = 3;
                            }
                        } else {
                            cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit10 = Unit.f93236a;
                            i20++;
                            i19 = i14;
                        }
                        i18 += i19;
                        i19 = i14;
                    } else {
                        i14 = i19;
                        cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                        Unit unit11 = Unit.f93236a;
                        i20++;
                        i19 = 1;
                        i18 += i19;
                        i19 = i14;
                    }
                }
            } else {
                cArr[i20] = Utf8.REPLACEMENT_CHARACTER;
                i18++;
                i20++;
            }
        }
        return StringsKt.C(cArr, 0, i20);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return commonToUtf8String(bArr, i10, i11);
    }
}
