package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class u43 implements oq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nq f116493g = new nq() { // from class: yads.xq0
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return u43.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f116496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yv0[] f116497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f116498f;

    public u43(String str, yv0... yv0VarArr) {
        fi.a(yv0VarArr.length > 0);
        this.f116495c = str;
        this.f116497e = yv0VarArr;
        this.f116494b = yv0VarArr.length;
        int iD = tr1.d(yv0VarArr[0].f118398m);
        this.f116496d = iD == -1 ? tr1.d(yv0VarArr[0].f118397l) : iD;
        a();
    }

    public final yv0 a(int i10) {
        return this.f116497e[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u43.class == obj.getClass()) {
            u43 u43Var = (u43) obj;
            if (this.f116495c.equals(u43Var.f116495c) && Arrays.equals(this.f116497e, u43Var.f116497e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f116498f == 0) {
            this.f116498f = j4.a(this.f116495c, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + Arrays.hashCode(this.f116497e);
        }
        return this.f116498f;
    }

    public final int a(yv0 yv0Var) {
        int i10 = 0;
        while (true) {
            yv0[] yv0VarArr = this.f116497e;
            if (i10 >= yv0VarArr.length) {
                return -1;
            }
            if (yv0Var == yv0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public static u43 a(Bundle bundle) {
        nk2 nk2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            v31 v31Var = y31.f118068c;
            nk2VarA = nk2.f113952f;
        } else {
            nk2VarA = pq.a(yv0.I, parcelableArrayList);
        }
        return new u43(bundle.getString(Integer.toString(1, 36), ""), (yv0[]) nk2VarA.toArray(new yv0[0]));
    }

    public u43(yv0... yv0VarArr) {
        this("", yv0VarArr);
    }

    public final void a() {
        String str = this.f116497e[0].f118389d;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i10 = this.f116497e[0].f118391f | 16384;
        int i11 = 1;
        while (true) {
            yv0[] yv0VarArr = this.f116497e;
            if (i11 >= yv0VarArr.length) {
                return;
            }
            String str2 = yv0VarArr[i11].f118389d;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                yv0[] yv0VarArr2 = this.f116497e;
                uf1.b("TrackGroup", uf1.a("", new IllegalStateException("Different languages combined in one TrackGroup: '" + yv0VarArr2[0].f118389d + "' (track 0) and '" + yv0VarArr2[i11].f118389d + "' (track " + i11 + ")")));
                return;
            }
            yv0[] yv0VarArr3 = this.f116497e;
            if (i10 != (yv0VarArr3[i11].f118391f | 16384)) {
                uf1.b("TrackGroup", uf1.a("", new IllegalStateException("Different role flags combined in one TrackGroup: '" + Integer.toBinaryString(yv0VarArr3[0].f118391f) + "' (track 0) and '" + Integer.toBinaryString(this.f116497e[i11].f118391f) + "' (track " + i11 + ")")));
                return;
            }
            i11++;
        }
    }
}
