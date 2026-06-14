package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class l4 extends e4 {
    public final List P = new ArrayList();
    public final List Q = new ArrayList();
    public ImageData R;
    public ImageData S;

    public static l4 T() {
        return new l4();
    }

    public static l4 a(k1 k1Var) {
        l4 l4VarT = T();
        l4VarT.k(k1Var.r());
        String strU = k1Var.U();
        if (strU != null) {
            l4VarT.e(ImageData.newImageData(strU, k1Var.G(), k1Var.p()));
            l4VarT.x().a(k1Var.x(), 0.0f);
            l4VarT.E = k1Var.E;
        }
        return l4VarT;
    }

    public List P() {
        return new ArrayList(this.Q);
    }

    public ImageData Q() {
        return this.S;
    }

    public ImageData R() {
        return this.R;
    }

    public List S() {
        return new ArrayList(this.P);
    }

    public void d(ImageData imageData) {
        this.Q.add(imageData);
    }

    public void e(ImageData imageData) {
        this.P.add(imageData);
    }

    public void f(ImageData imageData) {
        this.S = imageData;
    }

    public void g(ImageData imageData) {
        this.R = imageData;
    }
}
