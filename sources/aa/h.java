package aa;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import n9.t;
import n9.u;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4157c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f4160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f4161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f4162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f4163f;

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f4158a = i10;
            this.f4159b = i11;
            this.f4160c = str;
            this.f4161d = str2;
            this.f4162e = str3;
            this.f4163f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f4158a == aVar.f4158a && this.f4159b == aVar.f4159b && TextUtils.equals(this.f4160c, aVar.f4160c) && TextUtils.equals(this.f4161d, aVar.f4161d) && TextUtils.equals(this.f4162e, aVar.f4162e) && TextUtils.equals(this.f4163f, aVar.f4163f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f4158a * 31) + this.f4159b) * 31;
            String str = this.f4160c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4161d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f4162e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f4163f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public h(String str, String str2, List list) {
        this.f4155a = str;
        this.f4156b = str2;
        this.f4157c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // n9.v.a
    public /* synthetic */ void a(t.b bVar) {
        u.c(this, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (TextUtils.equals(this.f4155a, hVar.f4155a) && TextUtils.equals(this.f4156b, hVar.f4156b) && this.f4157c.equals(hVar.f4157c)) {
                return true;
            }
        }
        return false;
    }

    @Override // n9.v.a
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return u.a(this);
    }

    @Override // n9.v.a
    public /* synthetic */ io.bidmachine.media3.common.a getWrappedMetadataFormat() {
        return u.b(this);
    }

    public int hashCode() {
        String str = this.f4155a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4156b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f4157c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f4155a != null) {
            str = " [" + this.f4155a + ", " + this.f4156b + C4240b4.j.f42674e;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
