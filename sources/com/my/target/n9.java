package com.my.target;

import android.view.View;
import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public interface n9 {

    public interface a {
        void a(b bVar, int i10);

        void a(boolean z10);

        void b(int i10);

        void c();

        void g();

        void i();

        void l();

        void m();

        void n();
    }

    View a();

    void a(int i10, float f10);

    void a(int i10, String str);

    void a(boolean z10);

    void b();

    void b(boolean z10);

    void c();

    void c(boolean z10);

    void d();

    void e();

    View getCloseButton();

    void setBackgroundImage(ImageData imageData);

    void setBanner(o4 o4Var);

    void setPanelColor(int i10);

    void setSoundState(boolean z10);
}
