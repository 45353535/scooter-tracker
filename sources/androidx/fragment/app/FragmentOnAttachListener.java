package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface FragmentOnAttachListener {
    @MainThread
    void onAttachFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment);
}
