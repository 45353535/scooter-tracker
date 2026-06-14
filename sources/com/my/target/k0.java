package com.my.target;

import com.my.target.common.models.ImageData;
import com.my.target.common.models.ShareButtonData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k0 extends b {
    public String P;
    public ImageData Q;
    public o1 U;
    public u8 V;
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public fa N = null;
    public da O = null;
    public String R = "Close";
    public String S = "Replay";
    public String T = "Ad can be skipped after %ds";
    public boolean W = false;
    public boolean X = true;
    public boolean Y = true;
    public boolean Z = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f59971a0 = true;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f59972b0 = true;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f59973c0 = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f59974d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f59975e0 = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f59976f0 = true;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f59977g0 = 0.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f59978h0 = -1.0f;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f59979i0 = -1.0f;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f59980j0 = 0;

    public String L() {
        return this.P;
    }

    public float M() {
        return this.f59977g0;
    }

    public String N() {
        return this.R;
    }

    public String O() {
        return this.T;
    }

    public ArrayList P() {
        return new ArrayList(this.L);
    }

    public o1 Q() {
        return this.U;
    }

    public int R() {
        return this.f59980j0;
    }

    public float S() {
        return this.f59978h0;
    }

    public float T() {
        return this.f59979i0;
    }

    public u8 U() {
        return this.V;
    }

    public ImageData V() {
        return this.Q;
    }

    public String W() {
        return this.S;
    }

    public ArrayList X() {
        return new ArrayList(this.M);
    }

    public da Y() {
        return this.O;
    }

    public fa Z() {
        return this.N;
    }

    public void a(k1 k1Var) {
        this.L.add(k1Var);
    }

    public boolean a0() {
        return this.f59972b0;
    }

    public boolean b0() {
        return this.f59976f0;
    }

    public void c(ImageData imageData) {
        this.Q = imageData;
    }

    public boolean c0() {
        return this.Z;
    }

    public void d(float f10) {
        this.f59978h0 = f10;
    }

    public boolean d0() {
        return this.f59973c0;
    }

    public void e(boolean z10) {
        this.f59972b0 = z10;
    }

    public boolean e0() {
        return this.f59974d0;
    }

    public void f(boolean z10) {
        this.f59976f0 = z10;
    }

    public boolean f0() {
        return this.f59975e0;
    }

    public void g(boolean z10) {
        this.Z = z10;
    }

    public boolean g0() {
        return this.W;
    }

    public void h(boolean z10) {
        this.f59973c0 = z10;
    }

    public boolean h0() {
        return this.X;
    }

    public void i(boolean z10) {
        this.f59974d0 = z10;
    }

    public boolean i0() {
        return this.Y;
    }

    public void j(boolean z10) {
        this.f59975e0 = z10;
    }

    public boolean j0() {
        return this.f59971a0;
    }

    public void k(boolean z10) {
        this.W = z10;
    }

    public void l(boolean z10) {
        this.X = z10;
    }

    public void m(boolean z10) {
        this.Y = z10;
    }

    public void n(boolean z10) {
        this.f59971a0 = z10;
    }

    public void t(String str) {
        this.P = str;
    }

    public void u(String str) {
        this.R = str;
    }

    public void v(String str) {
        this.T = str;
    }

    public void w(String str) {
        this.S = str;
    }

    public void a(fa faVar) {
        this.N = faVar;
    }

    public void c(float f10) {
        this.f59977g0 = f10;
    }

    public void e(float f10) {
        this.f59979i0 = f10;
    }

    @Override // com.my.target.b
    public String h() {
        o1 o1VarQ = Q();
        return o1VarQ != null ? o1VarQ.f() : super.h();
    }

    public void a(da daVar) {
        this.O = daVar;
    }

    public void e(int i10) {
        this.f59980j0 = i10;
    }

    public void a(ShareButtonData shareButtonData) {
        this.M.add(shareButtonData);
    }

    public void a(o1 o1Var) {
        this.U = o1Var;
    }

    public void a(u8 u8Var) {
        this.V = u8Var;
    }
}
