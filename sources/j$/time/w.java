package j$.time;

import com.google.common.net.HttpHeaders;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w implements Serializable {
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f C();

    public abstract void F(ObjectOutput objectOutput);

    public abstract String i();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.v("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.v("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.v("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.v("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.v("AST", "America/Anchorage"), j$.com.android.tools.r8.a.v("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.v("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.v("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.v("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.v("CST", "America/Chicago"), j$.com.android.tools.r8.a.v("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.v("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.v(HttpHeaders.ECT, "Europe/Paris"), j$.com.android.tools.r8.a.v("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.v("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.v("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.v("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.v("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.v("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.v("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.v("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.v("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.v("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.v("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.v("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.v("EST", "-05:00"), j$.com.android.tools.r8.a.v("MST", "-07:00"), j$.com.android.tools.r8.a.v("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i10 = 0; i10 < 28; i10++) {
            Map.Entry entry = entryArr[i10];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        Collections.unmodifiableMap(map);
    }

    public static w D(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.f84540a != 0) {
            str = str.concat(zoneOffset.f84541b);
        }
        return new x(str, zoneOffset.C());
    }

    public static w E(String str, int i10) {
        String strSubstring = str.substring(0, i10);
        if (str.length() == i10) {
            return D(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return x.G(str);
        }
        try {
            ZoneOffset zoneOffsetG = ZoneOffset.G(str.substring(i10));
            if (zoneOffsetG == ZoneOffset.UTC) {
                return D(strSubstring, zoneOffsetG);
            }
            return D(strSubstring, zoneOffsetG);
        } catch (b e10) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e10);
        }
    }

    public w() {
        if (getClass() != ZoneOffset.class && getClass() != x.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return i().equals(((w) obj).i());
        }
        return false;
    }

    public int hashCode() {
        return i().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return i();
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }
}
