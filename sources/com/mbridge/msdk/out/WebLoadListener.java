package com.mbridge.msdk.out;

/* JADX INFO: loaded from: classes10.dex */
public interface WebLoadListener {
    void onFailed(String str, int i10, int i11, int i12, String str2, String str3);

    void onProgress(String str, int i10, int i11, int i12, String str2, String str3);

    void onSucess(String str, int i10, int i11, int i12, String str2, String str3);
}
