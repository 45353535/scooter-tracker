package com.inmobi.media;

import androidx.media3.common.MediaLibraryInfo;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Sm {
    public static final void a(String str) {
        try {
            Class.forName("androidx.media3.exoplayer.ExoPlayerImpl");
            if (str == null || str.length() == 0) {
                return;
            }
            String str2 = null;
            try {
                String str3 = MediaLibraryInfo.TAG;
                Field declaredField = MediaLibraryInfo.class.getDeclaredField("VERSION");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                String str4 = obj instanceof String ? (String) obj : null;
                if (str4 != null) {
                    if (!StringsKt.y0(str4)) {
                        str2 = str4;
                    }
                }
            } catch (Throwable unused) {
            }
            if (str2 == null) {
                throw new C4009rg(8800);
            }
            Mi miB = b(str2);
            if (miB == null) {
                throw new C4009rg(8802);
            }
            Mi miB2 = b(str);
            if (miB2 == null) {
                throw new C4009rg(8803);
            }
            int i10 = miB.f37379a;
            int i11 = miB2.f37379a;
            if (i10 >= i11) {
                if (i10 != i11 || miB.f37380b > miB2.f37380b) {
                    throw new C4009rg(8804);
                }
            }
        } catch (ClassNotFoundException unused2) {
            throw new C4009rg(8800);
        }
    }

    public static final Mi b(String str) {
        List listSplit$default = StringsKt.split$default(str, new String[]{"."}, false, 3, 2, null);
        if (listSplit$default.size() < 2) {
            return null;
        }
        int iC = c((String) listSplit$default.get(0));
        int iC2 = c((String) listSplit$default.get(1));
        int iC3 = listSplit$default.size() >= 3 ? c((String) listSplit$default.get(2)) : 0;
        if (iC < 0 || iC2 < 0) {
            return null;
        }
        return new Mi(iC, iC2, iC3);
    }

    public static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!Character.isDigit(str.charAt(i10))) {
                str = str.substring(0, i10);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                break;
            }
            i10++;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }
}
