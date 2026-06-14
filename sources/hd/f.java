package hd;

import android.view.View;
import android.view.ViewGroup;
import id.a0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends Serializable {
    void destroy(Runnable runnable);

    void onClicked();

    void onError(a0 a0Var);

    void onShown();

    void onViewAddedToContainer(View view, ViewGroup viewGroup);

    void onViewCreated(View view);

    void onViewReady(View view);
}
