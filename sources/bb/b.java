package bb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import n9.t;
import n9.v;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6146f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        q9.a.a(i11 == -1 || i11 > 0);
        this.f6141a = i10;
        this.f6142b = str;
        this.f6143c = str2;
        this.f6144d = str3;
        this.f6145e = z10;
        this.f6146f = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b b(Map map) {
        boolean z10;
        int i10;
        b bVar;
        String str;
        String str2;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str3 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str3) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        u.h("IcyHeaders", "Invalid bitrate: " + str3);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        u.h("IcyHeaders", "Invalid bitrate header: " + str3);
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        String str4 = null;
        if (list2 != null) {
            String str5 = (String) list2.get(0);
            bVar = null;
            str4 = str5;
            z10 = true;
        } else {
            bVar = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str = (String) list3.get(0);
            z10 = true;
        } else {
            str = bVar;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str2 = (String) list4.get(0);
            z10 = true;
        } else {
            str2 = bVar;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str6 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str6);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        u.h("IcyHeaders", "Invalid metadata interval: " + str6);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        u.h("IcyHeaders", "Invalid metadata interval: " + str6);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z10) {
            bVar = new b(i10, str4, str, str2, zEquals, i14);
        }
        return bVar;
    }

    @Override // n9.v.a
    public void a(t.b bVar) {
        String str = this.f6143c;
        if (str != null) {
            bVar.m0(str);
        }
        String str2 = this.f6142b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6141a == bVar.f6141a && Objects.equals(this.f6142b, bVar.f6142b) && Objects.equals(this.f6143c, bVar.f6143c) && Objects.equals(this.f6144d, bVar.f6144d) && this.f6145e == bVar.f6145e && this.f6146f == bVar.f6146f) {
                return true;
            }
        }
        return false;
    }

    @Override // n9.v.a
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return n9.u.a(this);
    }

    @Override // n9.v.a
    public /* synthetic */ io.bidmachine.media3.common.a getWrappedMetadataFormat() {
        return n9.u.b(this);
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f6141a) * 31;
        String str = this.f6142b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6143c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6144d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f6145e ? 1 : 0)) * 31) + this.f6146f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f6143c + "\", genre=\"" + this.f6142b + "\", bitrate=" + this.f6141a + ", metadataInterval=" + this.f6146f;
    }
}
