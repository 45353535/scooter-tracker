package com.my.target;

import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;

/* JADX INFO: loaded from: classes11.dex */
public interface v2 {

    public interface a {
        void a();

        void a(IAdLoadingError iAdLoadingError);

        void a(q5 q5Var);

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    String a();

    void a(MyTargetView.AdSize adSize);

    void a(a aVar);

    float b();

    void destroy();

    void pause();

    void prepare();

    void resume();

    void start();

    void stop();
}
