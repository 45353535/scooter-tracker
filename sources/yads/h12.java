package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h12 implements jz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jz1 f111437b;

    public h12(ArrayList arrayList) {
        this.f111436a = arrayList;
        this.f111437b = arrayList.isEmpty() ? null : (jz1) arrayList.get(0);
    }

    @Override // yads.jz1
    public final void a(e02 e02Var, gu guVar) {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            jz1Var.a(e02Var, guVar);
        }
    }

    @Override // yads.jz1
    public final qz1 b() {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            return jz1Var.b();
        }
        return null;
    }

    @Override // yads.jz1
    public final r22 c() {
        r22 r22VarC;
        jz1 jz1Var = this.f111437b;
        return (jz1Var == null || (r22VarC = jz1Var.c()) == null) ? new r22(null, null) : r22VarC;
    }

    @Override // yads.jz1
    public final List d() {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            return jz1Var.d();
        }
        return null;
    }

    @Override // yads.jz1
    public final void destroy() {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            jz1Var.destroy();
        }
    }

    @Override // yads.jz1
    public final k00 getAdAssets() {
        k00 adAssets;
        jz1 jz1Var = this.f111437b;
        return (jz1Var == null || (adAssets = jz1Var.getAdAssets()) == null) ? new k00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false) : adAssets;
    }

    @Override // yads.jz1
    public final xn2 getAdType() {
        xn2 adType;
        jz1 jz1Var = this.f111437b;
        return (jz1Var == null || (adType = jz1Var.getAdType()) == null) ? xn2.f117913c : adType;
    }

    @Override // yads.jz1
    public final String getCampaignId() {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            return jz1Var.getCampaignId();
        }
        return null;
    }

    @Override // yads.jz1
    public final String getCreativeId() {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            return jz1Var.getCreativeId();
        }
        return null;
    }

    @Override // yads.jz1
    public final String getInfo() {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            return jz1Var.getInfo();
        }
        return null;
    }

    @Override // yads.jz1
    public final void loadImages() {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            jz1Var.loadImages();
        }
    }

    @Override // yads.jz1
    public final void a(e02 e02Var) {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            jz1Var.a(e02Var);
        }
    }

    @Override // yads.jz1
    public final ec a() {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            return jz1Var.a();
        }
        return null;
    }

    @Override // yads.jz1
    public final void a(l00 l00Var) {
        jz1 jz1Var = this.f111437b;
        if (jz1Var != null) {
            jz1Var.a(l00Var);
        }
    }
}
