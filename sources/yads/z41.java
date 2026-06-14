package yads;

import com.unity3d.ads.core.data.model.exception.GatewayException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class z41 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z41 f118541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z41 f118542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z41 f118543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z41 f118544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z41[] f118545g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118546b;

    static {
        z41 z41Var = new z41(0, "INITIALIZATION", GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        f118541c = z41Var;
        z41 z41Var2 = new z41(1, "AD", "ad");
        f118542d = z41Var2;
        z41 z41Var3 = new z41(2, "INSTREAM", com.taurusx.tax.w.o.w.f67354a);
        f118543e = z41Var3;
        z41 z41Var4 = new z41(3, "BIDDER_TOKEN", "bidder_token");
        f118544f = z41Var4;
        z41[] z41VarArr = {z41Var, z41Var2, z41Var3, z41Var4};
        f118545g = z41VarArr;
        qf.a.a(z41VarArr);
    }

    public z41(int i10, String str, String str2) {
        this.f118546b = str2;
    }

    public static z41 valueOf(String str) {
        return (z41) Enum.valueOf(z41.class, str);
    }

    public static z41[] values() {
        return (z41[]) f118545g.clone();
    }
}
