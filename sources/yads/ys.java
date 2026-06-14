package yads;

import androidx.core.internal.view.SupportMenu;
import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ys extends ft {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f118349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f118350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f118351j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f118355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f118356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f118357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f118358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f118359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f118360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f118361t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f118362u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f118364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f118365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f118346y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f118347z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w92 f118348g = new w92();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f118353l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public xs f118354m = new xs(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f118363v = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f118352k = 16000000;

    public ys(String str, int i10) {
        this.f118349h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f118351j = 0;
            this.f118350i = 0;
        } else if (i10 == 2) {
            this.f118351j = 1;
            this.f118350i = 0;
        } else if (i10 == 3) {
            this.f118351j = 0;
            this.f118350i = 1;
        } else if (i10 != 4) {
            uf1.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f118351j = 0;
            this.f118350i = 0;
        } else {
            this.f118351j = 1;
            this.f118350i = 1;
        }
        a(0);
        h();
        this.f118364w = true;
        this.f118365x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1 A[FALL_THROUGH] */
    @Override // yads.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.dt r14) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ys.a(yads.dt):void");
    }

    @Override // yads.ft
    public final gt c() {
        List list = this.f118355n;
        this.f118356o = list;
        list.getClass();
        return new gt(list);
    }

    @Override // yads.ft, yads.ba0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final j23 a() {
        j23 j23VarE;
        j23 j23VarA = super.a();
        if (j23VarA != null) {
            return j23VarA;
        }
        long j10 = this.f118352k;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f118365x;
        if (j11 == -9223372036854775807L || this.f110854e - j11 < j10 || (j23VarE = e()) == null) {
            return null;
        }
        this.f118355n = Collections.EMPTY_LIST;
        this.f118365x = -9223372036854775807L;
        gt gtVarC = c();
        long j12 = this.f110854e;
        j23VarE.f111527c = j12;
        j23VarE.f112227d = gtVarC;
        j23VarE.f112228e = j12;
        return j23VarE;
    }

    @Override // yads.ft
    public final boolean f() {
        return this.f118355n != this.f118356o;
    }

    @Override // yads.ft, yads.ba0
    public final void flush() {
        super.flush();
        this.f118355n = null;
        this.f118356o = null;
        a(0);
        this.f118358q = 4;
        this.f118354m.f117953h = 4;
        h();
        this.f118359r = false;
        this.f118360s = false;
        this.f118361t = (byte) 0;
        this.f118362u = (byte) 0;
        this.f118363v = 0;
        this.f118364w = true;
        this.f118365x = -9223372036854775807L;
    }

    public final ArrayList g() {
        int size = this.f118353l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            a20 a20VarA = ((xs) this.f118353l.get(i10)).a(Integer.MIN_VALUE);
            arrayList.add(a20VarA);
            if (a20VarA != null) {
                iMin = Math.min(iMin, a20VarA.f108528j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            a20 a20VarA2 = (a20) arrayList.get(i11);
            if (a20VarA2 != null) {
                if (a20VarA2.f108528j != iMin) {
                    a20VarA2 = ((xs) this.f118353l.get(i11)).a(iMin);
                    a20VarA2.getClass();
                }
                arrayList2.add(a20VarA2);
            }
        }
        return arrayList2;
    }

    public final void h() {
        this.f118354m.b(this.f118357p);
        this.f118353l.clear();
        this.f118353l.add(this.f118354m);
    }

    @Override // yads.ft, yads.ba0
    public final void release() {
    }

    public final void a(int i10) {
        int i11 = this.f118357p;
        if (i11 == i10) {
            return;
        }
        this.f118357p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f118353l.size(); i12++) {
                ((xs) this.f118353l.get(i12)).f117952g = i10;
            }
            return;
        }
        h();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f118355n = Collections.EMPTY_LIST;
        }
    }
}
