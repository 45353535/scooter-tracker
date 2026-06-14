package sg;

import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final String a(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i10;
        int i21 = 2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i20 < 0 || i11 > bArr.length || i20 > i11) {
            throw new IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i20 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i20];
        int i22 = 0;
        while (i20 < i11) {
            byte b10 = bArr[i20];
            if (b10 >= 0) {
                i18 = i22 + 1;
                cArr[i22] = (char) b10;
                i20++;
                while (i20 < i11) {
                    byte b11 = bArr[i20];
                    if (b11 < 0) {
                        break;
                    }
                    i20++;
                    cArr[i18] = (char) b11;
                    i18++;
                }
                Unit unit = Unit.f93236a;
            } else if ((b10 >> 5) == -2) {
                int i23 = i20 + 1;
                if (i11 <= i23) {
                    i18 = i22 + 1;
                    cArr[i22] = (char) Utf8.REPLACEMENT_CODE_POINT;
                } else {
                    byte b12 = bArr[i23];
                    if ((b12 & 192) == 128) {
                        int i24 = (b10 << 6) ^ (b12 ^ UnsignedBytes.MAX_POWER_OF_TWO);
                        if (i24 < 128) {
                            i18 = i22 + 1;
                            cArr[i22] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        } else {
                            i18 = i22 + 1;
                            cArr[i22] = (char) i24;
                        }
                        Unit unit2 = Unit.f93236a;
                        i19 = i21;
                        i20 += i19;
                    } else {
                        i18 = i22 + 1;
                        cArr[i22] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                Unit unit3 = Unit.f93236a;
                i19 = 1;
                i20 += i19;
            } else {
                if ((b10 >> 4) == -2) {
                    int i25 = i20 + 2;
                    if (i11 <= i25) {
                        i15 = i22 + 1;
                        cArr[i22] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit4 = Unit.f93236a;
                        int i26 = i20 + 1;
                        i16 = (i11 <= i26 || (bArr[i26] & 192) != 128) ? 1 : i21;
                    } else {
                        byte b13 = bArr[i20 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i25];
                            if ((b14 & 192) == 128) {
                                int i27 = ((b14 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b13 << 6)) ^ (b10 << Ascii.FF);
                                if (i27 < 2048) {
                                    i17 = i22 + 1;
                                    cArr[i22] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i27 || i27 >= 57344) {
                                    char c10 = (char) i27;
                                    i17 = i22 + 1;
                                    cArr[i22] = c10;
                                } else {
                                    i17 = i22 + 1;
                                    cArr[i22] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                Unit unit5 = Unit.f93236a;
                                i15 = i17;
                                i16 = 3;
                            } else {
                                i15 = i22 + 1;
                                cArr[i22] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                Unit unit6 = Unit.f93236a;
                                i16 = i21;
                            }
                        } else {
                            i15 = i22 + 1;
                            cArr[i22] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit7 = Unit.f93236a;
                            i16 = 1;
                        }
                    }
                    i20 += i16;
                    i12 = i21;
                    i22 = i15;
                } else {
                    if ((b10 >> 3) == -2) {
                        int i28 = i20 + 3;
                        if (i11 <= i28) {
                            i13 = i22 + 1;
                            cArr[i22] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit8 = Unit.f93236a;
                            int i29 = i20 + 1;
                            if (i11 <= i29 || (bArr[i29] & 192) != 128) {
                                i12 = i21;
                                i21 = 1;
                                i20 += i21;
                            } else {
                                int i30 = i20 + 2;
                                if (i11 <= i30 || (bArr[i30] & 192) != 128) {
                                    i12 = i21;
                                    i20 += i21;
                                } else {
                                    i12 = i21;
                                    i21 = 3;
                                    i20 += i21;
                                }
                            }
                        } else {
                            byte b15 = bArr[i20 + 1];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i20 + 2];
                                i12 = i21;
                                if ((b16 & 192) == 128) {
                                    byte b17 = bArr[i28];
                                    if ((b17 & 192) == 128) {
                                        int i31 = (((b17 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b16 << 6)) ^ (b15 << Ascii.FF)) ^ (b10 << Ascii.DC2);
                                        if (i31 > 1114111) {
                                            i13 = i22 + 1;
                                            cArr[i22] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i31 || i31 >= 57344) && i31 >= 65536) {
                                            if (i31 != 65533) {
                                                cArr[i22] = (char) ((i31 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i14 = i22 + 2;
                                                cArr[i22 + 1] = (char) ((i31 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i22] = Utf8.REPLACEMENT_CHARACTER;
                                                i14 = i22 + 1;
                                            }
                                            Unit unit9 = Unit.f93236a;
                                            i13 = i14;
                                            i21 = 4;
                                        } else {
                                            i13 = i22 + 1;
                                            cArr[i22] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        Unit unit10 = Unit.f93236a;
                                        i21 = 4;
                                    } else {
                                        i13 = i22 + 1;
                                        cArr[i22] = Utf8.REPLACEMENT_CHARACTER;
                                        Unit unit11 = Unit.f93236a;
                                        i21 = 3;
                                    }
                                } else {
                                    i13 = i22 + 1;
                                    cArr[i22] = Utf8.REPLACEMENT_CHARACTER;
                                    Unit unit12 = Unit.f93236a;
                                    i21 = i12;
                                }
                                i20 += i21;
                            } else {
                                i12 = i21;
                                i13 = i22 + 1;
                                cArr[i22] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit13 = Unit.f93236a;
                                i21 = 1;
                                i20 += i21;
                            }
                        }
                    } else {
                        i12 = i21;
                        i13 = i22 + 1;
                        cArr[i22] = Utf8.REPLACEMENT_CHARACTER;
                        i20++;
                    }
                    i22 = i13;
                }
                i21 = i12;
            }
            i12 = i21;
            i22 = i18;
            i21 = i12;
        }
        return StringsKt.C(cArr, 0, i22);
    }

    public static /* synthetic */ String b(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return a(bArr, i10, i11);
    }
}
