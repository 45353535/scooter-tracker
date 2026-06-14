package sg.bigo.ads.controller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface e<Request, Response, U> {
    void a(int i10, int i11, int i12, @NonNull String str, @Nullable U u10);

    void a(int i10, @NonNull Request request, @NonNull Response... responseArr);
}
