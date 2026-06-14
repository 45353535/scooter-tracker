package yads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class lm0 extends dc2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f113145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f113146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f113147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yv0 f113148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f113149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dl1 f113150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f113151j;

    static {
        new nq() { // from class: yads.vi
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return new lm0(bundle);
            }
        };
    }

    public lm0(int i10, Throwable th2, int i11, int i12) {
        this(a(i10, null, null, -1, null, 4), th2, i11, i10, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static String a(int i10, String str, String str2, int i11, yv0 yv0Var, int i12) {
        String string;
        String str3;
        if (i10 == 0) {
            string = "Source error";
        } else if (i10 != 1) {
            string = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i11);
            sb2.append(", format=");
            sb2.append(yv0Var);
            sb2.append(", format_supported=");
            int i13 = w83.f117341a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        return string + ": " + str;
    }

    public lm0(Bundle bundle) {
        super(bundle);
        this.f113145d = bundle.getInt(dc2.a(1001), 2);
        this.f113146e = bundle.getString(dc2.a(1002));
        this.f113147f = bundle.getInt(dc2.a(1003), -1);
        Bundle bundle2 = bundle.getBundle(dc2.a(1004));
        this.f113148g = bundle2 == null ? null : (yv0) yv0.I.fromBundle(bundle2);
        this.f113149h = bundle.getInt(dc2.a(1005), 4);
        this.f113151j = bundle.getBoolean(dc2.a(1006), false);
        this.f113150i = null;
    }

    public lm0(String str, Throwable th2, int i10, int i11, String str2, int i12, yv0 yv0Var, int i13, kl1 kl1Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        fi.a(!z10 || i11 == 1);
        fi.a(th2 != null || i11 == 3);
        this.f113145d = i11;
        this.f113146e = str2;
        this.f113147f = i12;
        this.f113148g = yv0Var;
        this.f113149h = i13;
        this.f113150i = kl1Var;
        this.f113151j = z10;
    }
}
