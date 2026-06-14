package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.RegsCcpaExtension;
import io.bidmachine.protobuf.sdk.User;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class d6 implements zb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f80066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f80067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f80068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f80071g;

    d6() {
    }

    private String k() {
        z3 z3VarK = j2.e().k();
        return (String) io.bidmachine.core.h.X(this.f80065a, z3VarK.c(), z3VarK.e());
    }

    private boolean p() {
        Boolean bool = this.f80068d;
        return bool != null && bool.booleanValue();
    }

    private boolean w() {
        z3 z3VarK = j2.e().k();
        Boolean bool = (Boolean) io.bidmachine.core.h.X(this.f80066b, z3VarK.b(), z3VarK.d());
        return bool != null && bool.booleanValue();
    }

    @Override // zb.d
    public boolean a() {
        String uSPrivacyString = getUSPrivacyString();
        return uSPrivacyString != null && uSPrivacyString.length() == 4 && uSPrivacyString.charAt(0) == '1' && (uSPrivacyString.charAt(2) == 'N' || uSPrivacyString.charAt(2) == 'n');
    }

    @Override // zb.d
    public boolean b() {
        return w() && !q();
    }

    @Override // zb.d
    public boolean c() {
        return !p();
    }

    @Override // zb.d
    public boolean d() {
        return (p() || b()) ? false : true;
    }

    @Override // zb.d
    public boolean e() {
        return (p() || b()) ? false : true;
    }

    @Override // zb.d
    public boolean f() {
        return (p() || b()) ? false : true;
    }

    void g(Context.Regs.Builder builder) {
        builder.setCoppa(p());
        builder.setGdpr(w());
        String uSPrivacyString = getUSPrivacyString();
        if (!TextUtils.isEmpty(uSPrivacyString)) {
            builder.addExtProto(Any.pack(RegsCcpaExtension.newBuilder().setUsPrivacy(uSPrivacyString).build()));
        }
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            builder.setGpp(strM);
        }
        List listL = l();
        if (io.bidmachine.core.h.G(listL)) {
            return;
        }
        builder.addAllGppSid(listL);
    }

    @Override // zb.d
    public String getUSPrivacyString() {
        return (String) io.bidmachine.core.h.W(this.f80069e, j2.e().k().getUSPrivacyString());
    }

    void h(Context.User.Builder builder) {
        builder.setConsent(n());
    }

    public boolean i() {
        return !p();
    }

    @Override // zb.d
    public boolean isUserAgeRestricted() {
        return p();
    }

    @Override // zb.d
    public boolean isUserHasConsent() {
        return q();
    }

    @Override // zb.d
    public boolean isUserInCcpaScope() {
        String uSPrivacyString = getUSPrivacyString();
        return uSPrivacyString != null && uSPrivacyString.length() == 4 && uSPrivacyString.charAt(0) == '1' && !uSPrivacyString.contains("---");
    }

    @Override // zb.d
    public boolean isUserInGdprScope() {
        return w();
    }

    void j(User.Builder builder) {
        builder.setCoppa(p());
        builder.setGdpr(w());
        builder.setConsent(n());
        String uSPrivacyString = getUSPrivacyString();
        if (!TextUtils.isEmpty(uSPrivacyString)) {
            builder.setCcpa(uSPrivacyString);
        }
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            builder.setGpp(strM);
        }
        List listL = l();
        if (io.bidmachine.core.h.G(listL)) {
            return;
        }
        builder.addAllGppSid(listL);
    }

    public List l() {
        return (List) io.bidmachine.core.h.W(this.f80071g, j2.e().k().f());
    }

    public String m() {
        return (String) io.bidmachine.core.h.W(this.f80070f, j2.e().k().a());
    }

    public String n() {
        String strK = k();
        return TextUtils.isEmpty(strK) ? o() ? "1" : "0" : strK;
    }

    public boolean o() {
        Boolean bool = this.f80067c;
        return bool != null && bool.booleanValue();
    }

    boolean q() {
        return o() || !TextUtils.isEmpty(k());
    }

    public d6 r(boolean z10, String str) {
        this.f80065a = str;
        this.f80067c = Boolean.valueOf(z10);
        return this;
    }

    public d6 s(Boolean bool) {
        this.f80068d = bool;
        return this;
    }

    public d6 t(String str, List list) {
        this.f80070f = str;
        this.f80071g = list;
        return this;
    }

    public d6 u(Boolean bool) {
        this.f80066b = bool;
        return this;
    }

    public d6 v(String str) {
        this.f80069e = str;
        return this;
    }
}
