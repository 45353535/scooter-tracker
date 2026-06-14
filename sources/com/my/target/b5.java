package com.my.target;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public interface b5 {

    public interface a {
        void a(b bVar, Context context);

        void a(b bVar, View view);

        void a(b bVar, String str, int i10, Context context);

        void b(b bVar, Context context);
    }

    void destroy();

    View getCloseButton();

    View j();

    void pause();

    void resume();

    void stop();
}
