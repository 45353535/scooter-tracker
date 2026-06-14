package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class b7 extends b {
    public final List L;
    public s5 M;
    public f7 N;
    public String O;
    public ImageData P;

    public b7(h0 h0Var) {
        super(h0Var);
        this.L = new ArrayList();
        this.O = "Try to play";
    }

    public static b7 a(h0 h0Var) {
        return new b7(h0Var);
    }

    public f7 L() {
        return this.N;
    }

    public ImageData M() {
        return this.P;
    }

    public String N() {
        return this.O;
    }

    public List O() {
        return new ArrayList(this.L);
    }

    public s5 P() {
        return this.M;
    }

    public void c(ImageData imageData) {
        this.P = imageData;
    }

    public void t(String str) {
        this.O = str;
    }

    public void a(s5 s5Var) {
        this.M = s5Var;
    }

    public void a(d7 d7Var) {
        this.L.add(d7Var);
    }

    public void a(f7 f7Var) {
        this.N = f7Var;
    }
}
