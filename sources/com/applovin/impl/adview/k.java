package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.c2;

/* JADX INFO: loaded from: classes6.dex */
public class k extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f8354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8355b;

    interface a {
        void a();

        void b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.f8354a = c2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f8355b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f8354a.b();
    }

    public void a(a aVar) {
        if (this.f8355b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f8354a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f8355b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
