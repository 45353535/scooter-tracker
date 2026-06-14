package yads;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vx f117215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vx f117216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vx f117217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ vx[] f117218e;

    static {
        vx vxVar = new vx(0, "FAVICON");
        f117215b = vxVar;
        vx vxVar2 = new vx(1, NativeAdContent.ViewTag.AD_ICON);
        f117216c = vxVar2;
        vx vxVar3 = new vx(2, "THUMB");
        f117217d = vxVar3;
        vx[] vxVarArr = {vxVar, vxVar2, vxVar3};
        f117218e = vxVarArr;
        qf.a.a(vxVarArr);
    }

    public vx(int i10, String str) {
    }

    public static vx valueOf(String str) {
        return (vx) Enum.valueOf(vx.class, str);
    }

    public static vx[] values() {
        return (vx[]) f117218e.clone();
    }
}
