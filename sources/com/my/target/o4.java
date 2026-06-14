package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class o4 extends e4 {
    public s5 R;
    public e4 S;
    public ImageData T;
    public String U;
    public int X;
    public boolean V = true;
    public boolean W = false;
    public final List Q = new ArrayList();
    public final m9 P = m9.l();

    public static o4 Y() {
        return new o4();
    }

    public ImageData P() {
        return this.T;
    }

    public String Q() {
        return this.U;
    }

    public e4 R() {
        return this.S;
    }

    public List S() {
        return this.Q;
    }

    public m9 T() {
        return this.P;
    }

    public int U() {
        return this.X;
    }

    public s5 V() {
        return this.R;
    }

    public boolean W() {
        if (this.R != null) {
            return false;
        }
        return this.V;
    }

    public boolean X() {
        return this.W;
    }

    public void a(s5 s5Var) {
        this.R = s5Var;
    }

    public void d(ImageData imageData) {
        this.T = imageData;
    }

    public void e(int i10) {
        this.X = i10;
    }

    public void g(boolean z10) {
        this.V = z10;
    }

    public void h(boolean z10) {
        this.W = z10;
    }

    public void t(String str) {
        this.U = str;
    }

    public void a(g4 g4Var) {
        this.Q.add(g4Var);
    }

    public void a(e4 e4Var) {
        this.S = e4Var;
    }
}
