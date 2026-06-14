package com.my.target;

import android.content.Context;
import com.my.target.ads.Reward;
import com.my.target.common.models.IAdLoadingError;

/* JADX INFO: loaded from: classes11.dex */
public interface s2 {

    public interface a {
        void a();

        void a(IAdLoadingError iAdLoadingError);

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    public interface b {
        void a(Reward reward);
    }

    String a();

    void a(Context context);

    void a(b bVar);

    float b();

    void destroy();

    void dismiss();
}
